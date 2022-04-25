package com.example.engo651final;

import maes.tech.intentanim.CustomIntent;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.owl93.dpb.CircularProgressView;
import com.github.mikephil.charting.charts.BarChart;

import java.util.*;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.*;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.skydoves.balloon.ArrowOrientation;
import com.skydoves.balloon.ArrowPositionRules;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.BalloonAnimation;
import com.skydoves.balloon.BalloonSizeSpec;
import com.skydoves.balloon.OnBalloonClickListener;

import java.lang.Math;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.time.*;

public class statistics extends AppCompatActivity {
    String token = null;
    double[] weekly_cal = new double[7];
    double monthly_cal = 0;
    String[] days = new String[7];
    global glob;
    com.github.mikephil.charting.charts.BarChart barChart;
    com.mikhaellopez.circularprogressbar.CircularProgressBar daily;
    com.mikhaellopez.circularprogressbar.CircularProgressBar monthly;
    com.mikhaellopez.circularprogressbar.CircularProgressBar weekly;
    TextView tv_daily;
    TextView tv_monthly;
    TextView tv_weekly;
    TextView tv_description;


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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
        token = getToken();
        glob = (global) getApplicationContext();
        barChart = (com.github.mikephil.charting.charts.BarChart) findViewById(R.id.chart1);
        daily = (com.mikhaellopez.circularprogressbar.CircularProgressBar) findViewById(R.id.daily);
        monthly = (com.mikhaellopez.circularprogressbar.CircularProgressBar) findViewById(R.id.monthly);
        weekly = (com.mikhaellopez.circularprogressbar.CircularProgressBar) findViewById(R.id.weekly);
        tv_daily = findViewById(R.id.tv_daily);
        tv_monthly = findViewById(R.id.tv_monthly);
        tv_weekly = findViewById(R.id.tv_weekly);
        tv_description = findViewById(R.id.tv_description);
        String url = glob.ip_port + "/api/get_stats?token=" + getToken();
        try {
            JSONObject json = MainActivity.readJsonFromUrl(url);
            String msg = json.getString("message");
            if (msg.equals("success")) {
                JSONArray data = json.getJSONArray("weekly");
                monthly_cal = json.getDouble("monthly");
                double x = 0;
                ArrayList<BarEntry> barEntries = new ArrayList<>();
                final ArrayList<String> xAxisLabel = new ArrayList<>();
                for (int i = 0; i < 7; i++) {
                    Date xDaysBefore = Date.from(Instant.now().minus(Duration.ofDays(i)));
                    days[i] = String.valueOf(1900 + xDaysBefore.getYear()) + " - " + String.valueOf(xDaysBefore.getMonth()) + " - " + String.valueOf(xDaysBefore.getDate());
                    weekly_cal[i] = data.getDouble(i);
                    x += weekly_cal[i];
                    barEntries.add(new BarEntry((float) i, (float) weekly_cal[i]));
                    xAxisLabel.add(String.valueOf(xDaysBefore.getMonth()) + "-" + zerospadding(String.valueOf(xDaysBefore.getDate()), 2));
//                    Log.e("TAG", "for day:" + String.valueOf((float) xDaysBefore.getDate()) + "kcals:" + String.valueOf((float) weekly_cal[i]));
                }
                BarDataSet barDataSet = new BarDataSet(barEntries, "kCals");
                barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
                barDataSet.setValueTextColor(Color.BLACK);
                barDataSet.setValueTextSize(16f);
                BarData barData = new BarData(barDataSet);
                barChart.setFitBars(true);
                barChart.setData(barData);
                barChart.getDescription().setText("");
                tv_description.setText("kCals burned last 7 days");
                barChart.animateY(2000);
                XAxis xAxis = barChart.getXAxis();
                barChart.getXAxis().setValueFormatter(new IndexAxisValueFormatter(xAxisLabel));
//                xAxis.setValueFormatter(new ValueFormatter() {
//                    @Override
//                    public String getFormattedValue(float value, AxisBase axis) {
//                        return xAxisLabel.get((int) value);
//
//                    }
//                });
                int duration = 2000;
                daily.setProgressWithAnimation((float) weekly_cal[0], Long.valueOf(duration));
                tv_daily.setText(String.valueOf((int) weekly_cal[0]));
                if (weekly_cal[0] < 1400) {
                    daily.setProgressBarColor(getResources().getColor(R.color.red));
                    tv_daily.setTextColor(getResources().getColor(R.color.red));
                } else if (weekly_cal[0] < 2800) {
                    daily.setProgressBarColor(getResources().getColor(R.color.blue));
                    tv_daily.setTextColor(getResources().getColor(R.color.blue));
                } else {
                    daily.setProgressBarColor(getResources().getColor(R.color.green));
                    tv_daily.setTextColor(getResources().getColor(R.color.green));
                }
                weekly.setProgressWithAnimation((float) x, Long.valueOf(duration));
                tv_weekly.setText(String.valueOf((int) x));
                if (weekly_cal[0] < 7 * 1400) {
                    weekly.setProgressBarColor(getResources().getColor(R.color.red));
                    tv_weekly.setTextColor(getResources().getColor(R.color.red));
                } else if (weekly_cal[0] < 7 * 2800) {
                    weekly.setProgressBarColor(getResources().getColor(R.color.blue));
                    tv_weekly.setTextColor(getResources().getColor(R.color.blue));
                } else {
                    weekly.setProgressBarColor(getResources().getColor(R.color.green));
                    tv_weekly.setTextColor(getResources().getColor(R.color.green));
                }
                monthly.setProgressWithAnimation((float) monthly_cal, Long.valueOf(duration));
                tv_monthly.setText(String.valueOf((int) monthly_cal));
                if (weekly_cal[0] < 30 * 1400) {
                    monthly.setProgressBarColor(getResources().getColor(R.color.red));
                    tv_monthly.setTextColor(getResources().getColor(R.color.red));
                } else if (weekly_cal[0] < 30 * 2800) {
                    monthly.setProgressBarColor(getResources().getColor(R.color.blue));
                    tv_monthly.setTextColor(getResources().getColor(R.color.blue));
                } else {
                    monthly.setProgressBarColor(getResources().getColor(R.color.green));
                    tv_monthly.setTextColor(getResources().getColor(R.color.green));
                }
            } else {
//                Toast.makeText(amenities.this, "There is no close facility.", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e) {
//            Toast.makeText(statistics.this, "Problem with API.", Toast.LENGTH_SHORT).show();
        }
    }

    public void skip(View view) {
        Intent intent = new Intent(statistics.this, MainActivity.class);
        startActivity(intent);
        CustomIntent.customType(this, "fadein-to-fadeout");
        finish();
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
                .setText("<br>This progress bar show the calories you burnt today it color ranges from red to green.<br><br><b>Press these boxes to move forwards.<b><br>")
                .setTextColor(ContextCompat.getColor(this, R.color.white))
                .setTextIsHtml(true)
                .setBackgroundColor(ContextCompat.getColor(this, R.color.blue1))
                .setBalloonAnimation(BalloonAnimation.FADE)
                .setLifecycleOwner(this)
                .build();
        balloon1.showAlignBottom(findViewById(R.id.daily));
        balloon1.setOnBalloonClickListener(new OnBalloonClickListener() {
            @Override
            public void onBalloonClick(View view) {
                balloon1.dismiss();
                Balloon balloon2 = new Balloon.Builder(statistics.this)
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
                        .setText("<br>This progress bar show the aggregated kilo Calories you burnt during the last 7 days it color ranges from red to green.<br>")
                        .setTextColor(ContextCompat.getColor(statistics.this, R.color.white))
                        .setTextIsHtml(true)
                        .setBackgroundColor(ContextCompat.getColor(statistics.this, R.color.blue))
                        .setBalloonAnimation(BalloonAnimation.FADE)
                        .setLifecycleOwner(statistics.this)
                        .build();
                balloon2.showAlignBottom(findViewById(R.id.weekly));
                balloon2.setOnBalloonClickListener(new OnBalloonClickListener() {
                    @Override
                    public void onBalloonClick(View view) {
                        balloon2.dismiss();
                        Balloon balloon3 = new Balloon.Builder(statistics.this)
                                .setArrowSize(30)
                                .setArrowOrientation(ArrowOrientation.BOTTOM)
                                .setArrowPositionRules(ArrowPositionRules.ALIGN_BALLOON)
                                .setArrowPosition(0.5f)
                                .setWidth(250)
                                .setHeight(BalloonSizeSpec.WRAP)
                                .setElevation(16)
                                .setTextSize(17f)
                                .setCornerRadius(4f)
                                .setAlpha(0.8f)
                                .setText("<br>This progress bar show the aggregated kilo Calories you burnt during the last 30 days it color ranges from red to green.<br>")
                                .setTextColor(ContextCompat.getColor(statistics.this, R.color.white))
                                .setTextIsHtml(true)
                                .setBackgroundColor(ContextCompat.getColor(statistics.this, R.color.royal_blue))
                                .setBalloonAnimation(BalloonAnimation.FADE)
                                .setLifecycleOwner(statistics.this)
                                .build();
                        balloon3.showAlignTop(findViewById(R.id.monthly));
                        balloon3.setOnBalloonClickListener(new OnBalloonClickListener() {
                            @Override
                            public void onBalloonClick(View view) {
                                balloon3.dismiss();
                                Balloon balloon4 = new Balloon.Builder(statistics.this)
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
                                        .setText("<br>This chart illustrates you activity during the last 7 days.<br>")
                                        .setTextColor(ContextCompat.getColor(statistics.this, R.color.white))
                                        .setTextIsHtml(true)
                                        .setBackgroundColor(ContextCompat.getColor(statistics.this, R.color.purple_700))
                                        .setBalloonAnimation(BalloonAnimation.FADE)
                                        .setLifecycleOwner(statistics.this)
                                        .build();
                                balloon4.showAlignTop(findViewById(R.id.chart1));
                                balloon4.setOnBalloonClickListener(new OnBalloonClickListener() {
                                    @Override
                                    public void onBalloonClick(View view) {
                                        balloon4.dismiss();
                                        Balloon balloon5 = new Balloon.Builder(statistics.this)
                                                .setArrowSize(30)
                                                .setArrowOrientation(ArrowOrientation.TOP)
                                                .setArrowPositionRules(ArrowPositionRules.ALIGN_BALLOON)
                                                .setArrowPosition(0.82f)
                                                .setWidth(250)
                                                .setHeight(BalloonSizeSpec.WRAP)
                                                .setElevation(16)
                                                .setTextSize(17f)
                                                .setCornerRadius(4f)
                                                .setAlpha(0.7f)
                                                .setText("<br>You can view the statical data for the date range of your choice.<br>")
                                                .setTextColor(ContextCompat.getColor(statistics.this, R.color.white))
                                                .setTextIsHtml(true)
                                                .setBackgroundColor(ContextCompat.getColor(statistics.this, R.color.sky_blue))
                                                .setBalloonAnimation(BalloonAnimation.FADE)
                                                .setLifecycleOwner(statistics.this)
                                                .build();
                                        balloon5.showAlignBottom(findViewById(R.id.fab_select2));
                                        balloon5.setOnBalloonClickListener(new OnBalloonClickListener() {
                                            @Override
                                            public void onBalloonClick(View view) {
                                                balloon5.dismiss();
                                                Balloon balloon6 = new Balloon.Builder(statistics.this)
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
                                                        .setTextColor(ContextCompat.getColor(statistics.this, R.color.white))
                                                        .setTextIsHtml(true)
                                                        .setBackgroundColor(ContextCompat.getColor(statistics.this, R.color.blue1))
                                                        .setBalloonAnimation(BalloonAnimation.FADE)
                                                        .setLifecycleOwner(statistics.this)
                                                        .build();
                                                balloon6.showAlignRight(findViewById(R.id.fab_select));
                                                balloon6.setOnBalloonClickListener(new OnBalloonClickListener() {
                                                    @Override
                                                    public void onBalloonClick(View view) {
                                                        balloon6.dismiss();
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
        });
    }

    public void forward(View view) {
        Intent intent = new Intent(statistics.this, statistics2.class);
        startActivity(intent);
        CustomIntent.customType(statistics.this, "left-to-right");
   }
}