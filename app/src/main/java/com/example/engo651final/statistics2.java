package com.example.engo651final;

import android.widget.ImageView;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.time.format.DateTimeFormatter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.util.Pair;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.skydoves.balloon.ArrowOrientation;
import com.skydoves.balloon.ArrowPositionRules;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.BalloonAnimation;
import com.skydoves.balloon.BalloonSizeSpec;
import com.skydoves.balloon.OnBalloonClickListener;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Locale;

import maes.tech.intentanim.CustomIntent;

public class statistics2 extends AppCompatActivity {
    com.github.mikephil.charting.charts.BarChart barChart;
    com.mikhaellopez.circularprogressbar.CircularProgressBar cb_average;
    com.mikhaellopez.circularprogressbar.CircularProgressBar cb_total;
    TextView tv_total;
    TextView tv_average;
    TextView tv_description;
    TextView textView4;
    TextView textView5;
    ImageView day_pic;
    String token = null;
    global glob = null;
    MaterialDatePicker materialDatePicker = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics2);
        token = getToken();
        glob = (global) getApplicationContext();
        barChart = (com.github.mikephil.charting.charts.BarChart) findViewById(R.id.chart1);
        cb_average = (com.mikhaellopez.circularprogressbar.CircularProgressBar) findViewById(R.id.average);
        cb_total = (com.mikhaellopez.circularprogressbar.CircularProgressBar) findViewById(R.id.total);
        tv_total = findViewById(R.id.tv_total);
        tv_average = findViewById(R.id.tv_average);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        tv_average = findViewById(R.id.tv_average);
        day_pic = findViewById(R.id.day_pic);
        tv_description = findViewById(R.id.tv_description);
        materialDatePicker = MaterialDatePicker.Builder
                .dateRangePicker()
                .setSelection(Pair.create(MaterialDatePicker.thisMonthInUtcMilliseconds(), MaterialDatePicker.thisMonthInUtcMilliseconds()))
                .setTheme(R.style.ThemeOverlay_App_DatePicker)
                .build();
    }


    public String getToken() {
        String filename = "login_data";
        String line = null;
        File file = new File(getApplicationContext().getFilesDir(), filename);
        String username = "";
        String token = "";
        if (file.exists()) {
            try {
                FileInputStream is = new FileInputStream(file);
                InputStreamReader isReader = new InputStreamReader(is);
                BufferedReader reader = new BufferedReader(isReader);
                StringBuilder sb = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    sb.append(line + System.getProperty("line.separator"));
                }
                is.close();
                line = sb.toString();
                token = line.split("\\|", 5)[2];
                username = line.split("\\|", 5)[3];
                reader.close();
            } catch (Exception e) {

            }
        }
        return token;
    }

    public void skip(View view) {
        CustomIntent.customType(statistics2.this, "right-to-left");
        finish();
    }

    public String zerospadding(String input, int lengthozeros) {
        if (input.length() >= lengthozeros) {
            return input;
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (stringBuilder.length() < lengthozeros - input.length()) {
            stringBuilder.append('0');
        }
        stringBuilder.append(input);
        return stringBuilder.toString();
    }

    public void range(View view) {
        materialDatePicker.show(getSupportFragmentManager(), "Tag_picker");
        materialDatePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
            @Override
            public void onPositiveButtonClick(Object selection) {
                Pair dates = (Pair) materialDatePicker.getSelection();
                Pair<Date, Date> dateRange = new Pair<>(new Date((Long) dates.first), new Date((Long) dates.second));
                LocalDate startLocalDate = LocalDate.parse(new SimpleDateFormat("YYYY-MM-dd").format(dateRange.first)).plusDays(1);
                LocalDate endLocalDate = LocalDate.parse(new SimpleDateFormat("YYYY-MM-dd").format(dateRange.second)).plusDays(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd", Locale.CANADA);
                String start = startLocalDate.format(DateTimeFormatter.ofPattern("YYYY-MM-dd"));
                String end = endLocalDate.format(DateTimeFormatter.ofPattern("YYYY-MM-dd"));
                String url = glob.ip_port + "/api/get_range_stats?token=" + getToken() + "&start=" + start + "&end=" + end;
                try {
                    JSONObject json = MainActivity.readJsonFromUrl(url);
                    String msg = json.getString("message");
                    if (msg.equals("success")) {
                        barChart.setVisibility(View.VISIBLE);
                        textView4.setVisibility(View.VISIBLE);
                        textView5.setVisibility(View.VISIBLE);
                        cb_average.setVisibility(View.VISIBLE);
                        cb_total.setVisibility(View.VISIBLE);
                        day_pic.setAlpha((float).1);
                        JSONArray data = json.getJSONArray("data");
                        double average = json.getDouble("average");
                        double total = json.getDouble("total");
                        int days = json.getInt("days");
                        ArrayList<BarEntry> barEntries = new ArrayList<>();
                        final ArrayList<String> xAxisLabel = new ArrayList<>();
                        for (int i = 0; i < days; i++) {
                            LocalDate curDate = startLocalDate.plusDays(i);
                            double value = data.getDouble(i);
                            barEntries.add(new BarEntry((float) i, (float) value));
                            xAxisLabel.add(String.valueOf(curDate.getMonthValue()) + "-" + zerospadding(String.valueOf(curDate.getDayOfMonth()), 2));
//                            Log.e("TAG", "for day:" + String.valueOf((float) curDate.getDayOfMonth()) + "kcals:" + String.valueOf((float) value));
                        }
                        BarDataSet barDataSet = new BarDataSet(barEntries, "kCals");
                        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
                        barDataSet.setValueTextColor(Color.BLACK);
                        barDataSet.setValueTextSize(16f);
                        BarData barData = new BarData(barDataSet);
                        barChart.setFitBars(true);
                        barChart.setData(barData);
                        barChart.getDescription().setText("");
                        tv_description.setText("kCals burnt from: " + start + " till: " + end);
                        barChart.animateY(2000);
                        XAxis xAxis = barChart.getXAxis();
                        barChart.getXAxis().setValueFormatter(new IndexAxisValueFormatter(xAxisLabel));
                        int duration = 2000;
                        cb_average.setProgressMax(4000);
                        cb_average.setProgressWithAnimation((float) average, Long.valueOf(duration));
                        tv_average.setText(String.valueOf((int) average));
                        if (average < 1400) {
                            cb_average.setProgressBarColor(getResources().getColor(R.color.red));
                            tv_average.setTextColor(getResources().getColor(R.color.red));
                        } else if (average < 2800) {
                            cb_average.setProgressBarColor(getResources().getColor(R.color.blue));
                            tv_average.setTextColor(getResources().getColor(R.color.blue));
                        } else {
                            cb_average.setProgressBarColor(getResources().getColor(R.color.green));
                            tv_average.setTextColor(getResources().getColor(R.color.green));
                        }
                        cb_total.setProgressMax(days * 4000);
                        cb_total.setProgressWithAnimation((float) total, Long.valueOf(duration));
                        tv_total.setText(String.valueOf((int) total));
                        if (total < days * 1400) {
                            cb_total.setProgressBarColor(getResources().getColor(R.color.red));
                            tv_total.setTextColor(getResources().getColor(R.color.red));
                        } else if (total < days * 2800) {
                            cb_total.setProgressBarColor(getResources().getColor(R.color.blue));
                            tv_total.setTextColor(getResources().getColor(R.color.blue));
                        } else {
                            cb_total.setProgressBarColor(getResources().getColor(R.color.green));
                            tv_total.setTextColor(getResources().getColor(R.color.green));
                        }
                    }
                } catch (Exception e) {
                    Log.e("TAG", e.getMessage());
                }
            }
        });
    }

    public void help(View view) {
//        AlertDialog.Builder alert = new AlertDialog.Builder(this);
//        alert.setTitle("Help");
//        alert.setMessage("\nIn this page you can see the aggregated value how much Kilo Calories you burned during today, last 7 days, and last 30 days.\n\n The chart below the page illustrates the daily kCalories burnt for the last 7 days. The value of the label above each column is the date.\n");
//        alert.setPositiveButton("OK", null);
//        AlertDialog dialog = alert.create();
//        dialog.show();
        Balloon balloon1 = new Balloon.Builder(this)
                .setArrowSize(30)
                .setArrowOrientation(ArrowOrientation.TOP)
                .setArrowPositionRules(ArrowPositionRules.ALIGN_ANCHOR)
                .setArrowPosition(0.5f)
                .setWidth(BalloonSizeSpec.WRAP)
                .setHeight(BalloonSizeSpec.WRAP)
                .setTextSize(17f)
                .setElevation(6)
                .setCornerRadius(4f)
                .setAlpha(0.8f)
                .setText("<br>This button allows you to choose time range to view the statistical result for that time range.<br><br><b>Press these boxes to move forwards.<b><br>")
                .setTextColor(ContextCompat.getColor(this, R.color.white))
                .setTextIsHtml(true)
                .setBackgroundColor(ContextCompat.getColor(this, R.color.blue1))
                .setBalloonAnimation(BalloonAnimation.FADE)
                .setLifecycleOwner(this)
                .build();
        balloon1.showAlignBottom(findViewById(R.id.range));
        balloon1.setOnBalloonClickListener(new OnBalloonClickListener() {
            @Override
            public void onBalloonClick(View view) {
                balloon1.dismiss();
                Balloon balloon2 = new Balloon.Builder(statistics2.this)
                        .setArrowSize(30)
                        .setArrowOrientation(ArrowOrientation.TOP)
                        .setArrowPositionRules(ArrowPositionRules.ALIGN_ANCHOR)
                        .setArrowPosition(0.5f)
                        .setWidth(BalloonSizeSpec.WRAP)
                        .setHeight(BalloonSizeSpec.WRAP)
                        .setTextSize(17f)
                        .setElevation(6)
                        .setCornerRadius(4f)
                        .setAlpha(0.8f)
                        .setText("<br>This progress bar shows the aggregated kilo Calories you burnt during the period in question it color ranges from red to green.<br>")
                        .setTextColor(ContextCompat.getColor(statistics2.this, R.color.white))
                        .setTextIsHtml(true)
                        .setBackgroundColor(ContextCompat.getColor(statistics2.this, R.color.blue))
                        .setBalloonAnimation(BalloonAnimation.FADE)
                        .setLifecycleOwner(statistics2.this)
                        .build();
                balloon2.showAlignBottom(findViewById(R.id.total));
                balloon2.setOnBalloonClickListener(new OnBalloonClickListener() {
                    @Override
                    public void onBalloonClick(View view) {
                        balloon2.dismiss();
                        Balloon balloon3 = new Balloon.Builder(statistics2.this)
                                .setArrowSize(30)
                                .setArrowOrientation(ArrowOrientation.BOTTOM)
                                .setArrowPositionRules(ArrowPositionRules.ALIGN_ANCHOR)
                                .setArrowPosition(0.5f)
                                .setWidth(250)
                                .setHeight(BalloonSizeSpec.WRAP)
                                .setElevation(16)
                                .setTextSize(17f)
                                .setCornerRadius(4f)
                                .setAlpha(0.8f)
                                .setText("<br>This progress bar shows the average kilo Calories you burnt during the period in question it color ranges from red to green.<br>")
                                .setTextColor(ContextCompat.getColor(statistics2.this, R.color.white))
                                .setTextIsHtml(true)
                                .setBackgroundColor(ContextCompat.getColor(statistics2.this, R.color.royal_blue))
                                .setBalloonAnimation(BalloonAnimation.FADE)
                                .setLifecycleOwner(statistics2.this)
                                .build();
                        balloon3.showAlignTop(findViewById(R.id.average));
                        balloon3.setOnBalloonClickListener(new OnBalloonClickListener() {
                            @Override
                            public void onBalloonClick(View view) {
                                balloon3.dismiss();
                                Balloon balloon4 = new Balloon.Builder(statistics2.this)
                                        .setArrowSize(30)
                                        .setArrowOrientation(ArrowOrientation.BOTTOM)
                                        .setArrowPositionRules(ArrowPositionRules.ALIGN_BALLOON)
                                        .setArrowPosition(0.5f)
                                        .setWidth(250)
                                        .setHeight(BalloonSizeSpec.WRAP)
                                        .setElevation(16)
                                        .setTextSize(17f)
                                        .setCornerRadius(4f)
                                        .setAlpha(0.5f)
                                        .setText("<br>This chart illustrates you activity during the chosen period.<br>")
                                        .setTextColor(ContextCompat.getColor(statistics2.this, R.color.white))
                                        .setTextIsHtml(true)
                                        .setBackgroundColor(ContextCompat.getColor(statistics2.this, R.color.purple_700))
                                        .setBalloonAnimation(BalloonAnimation.FADE)
                                        .setLifecycleOwner(statistics2.this)
                                        .build();
                                balloon4.showAlignTop(findViewById(R.id.chart1));
                                balloon4.setOnBalloonClickListener(new OnBalloonClickListener() {
                                    @Override
                                    public void onBalloonClick(View view) {
                                        balloon4.dismiss();
                                        Balloon balloon5 = new Balloon.Builder(statistics2.this)
                                                .setArrowSize(30)
                                                .setArrowOrientation(ArrowOrientation.LEFT)
                                                .setArrowPositionRules(ArrowPositionRules.ALIGN_BALLOON)
                                                .setArrowPosition(0.35f)
                                                .setWidth(250)
                                                .setHeight(BalloonSizeSpec.WRAP)
                                                .setElevation(16)
                                                .setTextSize(17f)
                                                .setCornerRadius(4f)
                                                .setAlpha(0.8f)
                                                .setText("<br>By clicking on this button you can return to the dashboard.<br>")
                                                .setTextColor(ContextCompat.getColor(statistics2.this, R.color.white))
                                                .setTextIsHtml(true)
                                                .setBackgroundColor(ContextCompat.getColor(statistics2.this, R.color.blue1))
                                                .setBalloonAnimation(BalloonAnimation.FADE)
                                                .setLifecycleOwner(statistics2.this)
                                                .build();
                                        balloon5.showAlignRight(findViewById(R.id.fab_select));
                                        balloon5.setOnBalloonClickListener(new OnBalloonClickListener() {
                                            @Override
                                            public void onBalloonClick(View view) {
                                                balloon5.dismiss();
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
    }
}