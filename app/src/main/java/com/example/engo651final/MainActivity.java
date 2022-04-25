package com.example.engo651final;

import android.app.AlertDialog;

import android.app.ProgressDialog;
import android.net.*;
import android.content.*;


import android.media.MediaPlayer;

import android.graphics.drawable.Drawable;

import com.airbnb.lottie.LottieAnimationView;

import java.io.*;
import java.net.*;

import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.os.Message;
import android.provider.Settings;
import android.widget.RelativeLayout;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.os.StrictMode;

import java.util.ArrayList;

import androidx.fragment.app.FragmentManager;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import android.app.Activity;

import org.json.JSONException;
import org.json.JSONObject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.io.*;
import java.net.*;
import java.nio.charset.*;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import org.json.*;

import android.widget.LinearLayout;
import android.widget.TextView;
import android.os.Handler;
import android.content.Intent;
import android.widget.Toast;
import android.widget.ImageView;

import com.google.android.gms.maps.SupportMapFragment;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    ImageView sun_pic, day_pic, night_pic;
    View day_bg, night_bg;
    boolean is_day = true;
    int recoverNumber = 0;
    Timer timer;
    String resetEmail = null;

    public boolean isConnectedtoInternet(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo wifiConnection = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        NetworkInfo mobileConnection = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
        if ((wifiConnection != null && wifiConnection.isConnected()) || (mobileConnection != null && mobileConnection.isConnected()))
            return true;
        else
            return false;
    }

    private void showDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Error");
        builder.setMessage("Please make sure you are connected to the internet.")
                .setCancelable(false)
                .setPositiveButton("Connect", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS));
                    }
                }).setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
//                startActivity(new Intent(getApplicationContext(), RetailerStartUpScreen.class));
                finish();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy =
                    new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        if (!isConnectedtoInternet(this)) {
            showDialog();
        }
        try {
            String filename = "login_data";
            File file = new File(getApplicationContext().getFilesDir(), filename);
            if (file.exists()) {
                Handler handler = new Handler();
                Intent intent = new Intent(MainActivity.this, dashboard.class);
                startActivity(intent);
                timer.cancel();
                timer = null;
                finish();
            } else {
                Handler handler = new Handler();
                setContentView(R.layout.activity_main);
                viewPager = findViewById(R.id.viewPager);
                AuthenticationPagerAdapter pagerAdapter = new AuthenticationPagerAdapter(getSupportFragmentManager());
                pagerAdapter.addFragmet(new fragment_login());
                pagerAdapter.addFragmet(new fragment_register());
                pagerAdapter.addFragmet(new forgot_password());
                pagerAdapter.addFragmet(new recovery_code());
                pagerAdapter.addFragmet(new reset_password());
                viewPager.setAdapter(pagerAdapter);
            }
        } catch (Exception e) {
            Handler handler = new Handler();
            setContentView(R.layout.activity_main);
            viewPager = findViewById(R.id.viewPager);
            AuthenticationPagerAdapter pagerAdapter = new AuthenticationPagerAdapter(getSupportFragmentManager());
            pagerAdapter.addFragmet(new fragment_login());
            pagerAdapter.addFragmet(new fragment_register());
            viewPager.setAdapter(pagerAdapter);
        }
//
        try {
            RelativeLayout Layout1 = findViewById(R.id.layout);
//        LinearLayout Layout2 = findViewById(R.id.layout);
            AnimationDrawable animationDrawable = (AnimationDrawable) Layout1.getBackground();
            animationDrawable.setEnterFadeDuration(2000);
            animationDrawable.setExitFadeDuration(4000);
            animationDrawable.start();
        } catch (Exception e) {

        }
        try {
            sun_pic = findViewById(R.id.sun_pic);
            day_pic = findViewById(R.id.day_pic);
            night_pic = findViewById(R.id.night_pic);
            day_bg = findViewById(R.id.day_bg);
            night_bg = findViewById(R.id.night_bg);

            timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask() {
                private Handler handler = new Handler() {
                    @Override
                    public void dispatchMessage(Message msg) {
                        super.dispatchMessage(msg);
                        if (!is_day) {
                            sun_pic.animate().translationY(80).setDuration(110).setDuration(1000);
                            day_pic.animate().alpha(0).setDuration(1300);
                            day_bg.animate().alpha(0).setDuration(1300);
                        } else {
                            sun_pic.animate().translationY(-80).setDuration(110).setDuration(1000);
                            day_pic.animate().alpha(1).setDuration(1300);
                            day_bg.animate().alpha(1).setDuration(1300);
                        }
                        is_day = !is_day;
                    }
                };

                public void run() {
                    try {
                        handler.sendEmptyMessage(0);
                    } catch (Exception e) {

                    }
                }
            }, 1000, 4000);
        } catch (Exception e) {

        }
//        sun_pic = findViewById(R.id.sun_pic);
//        day_pic = findViewById(R.id.day_pic);
//        night_pic = findViewById(R.id.night_pic);
//        day_bg = findViewById(R.id.day_bg);
//        night_bg = findViewById(R.id.night_bg);
//        sun_pic.setTranslationY(-80);
//        dayNightSwitch = findViewById(R.id.day_night_switch);
//        dayNightSwitch.setListener(new DayNightSwitchListener() {
//            @Override
//            public void onSwitch(boolean is_day) {
//                if (!is_day) {
//                    sun_pic.animate().translationY(80).setDuration(110).setDuration(1000);
//                    day_pic.animate().alpha(0).setDuration(1300);
//                    day_bg.animate().alpha(0).setDuration(1300);
//                } else {
//                    sun_pic.animate().translationY(-80).setDuration(110).setDuration(1000);
//                    day_pic.animate().alpha(1).setDuration(1300);
//                    day_bg.animate().alpha(1).setDuration(1300);
//                }
//            }
//        });
//        AnimationDrawable animationDrawable1 = (AnimationDrawable) Layout2.getBackground();
//        animationDrawable1.setEnterFadeDuration(2000);
//        animationDrawable1.setExitFadeDuration(4000);
//        animationDrawable1.start();
    }

//    public void switch_day_night(View view) {
//        dayNightSwitch.toggle();
//    }

    public static JSONObject readJsonFromUrl(String link) {
        // Input Stream Object To Start Streaming.
        InputStream input = null;
        try {                                 // try catch for checked exception
            input = new URL(link).openStream();
            BufferedReader re = new BufferedReader(new InputStreamReader(input, Charset.forName("UTF-8")));
            // Buffer Reading In UTF-8
            String Text = Read(re);         // Handy Method To Read Data From BufferReader
            JSONObject json = new JSONObject(Text);    //Creating A JSON
            return json;    // Returning JSON
        } catch (Exception e) {
            return null;
        } finally {
            try {
                input.close();
            } catch (Exception e) {

            }
        }
    }

    public static String Read(Reader re) {     // class Declaration
        try {             // try }
            StringBuilder str = new StringBuilder();     // To Store Url Data In String.
            int temp;
            do {

                temp = re.read();       //reading Charcter By Chracter.
                str.append((char) temp);

            } while (temp != -1);
            //  re.read() return -1 when there is end of buffer , data or end of file.

            return str.toString();
        } catch (Exception e) {

        }
        return null;
    }

    public void SignupMsg(JSONObject json) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Error");
        builder.setMessage(json.toString());
        builder.setPositiveButton("OK", null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void recover(View view) {
        EditText textbox = (EditText) findViewById(R.id.forgot_email);
        resetEmail = textbox.getText().toString();
        List<String> emails = new ArrayList<String>();
        emails.add(textbox.getText().toString());
        Random random = new Random();
        recoverNumber = random.nextInt(9999999 - 1000000) + 1000000;
        new SendMailTask(MainActivity.this).execute("ar.mozh202290@gmail.com",
                "https://accounts.google.com/", emails, "Reset Password's Code", "This is your reset password's code.<br>" + String.valueOf(recoverNumber));
        Toast.makeText(MainActivity.this, "The code is sent to your email.", Toast.LENGTH_SHORT).show();
        AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
        viewPager.setCurrentItem(3);
    }

    public void confirm_code(View view) {
        EditText textbox = (EditText) findViewById(R.id.recovery_code);
        if (textbox.getText().toString().equals(String.valueOf(recoverNumber))) {
            AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
            viewPager.setCurrentItem(4);
        } else {
            Toast.makeText(MainActivity.this, "The code is incorrect.", Toast.LENGTH_SHORT).show();
        }
    }

    public void rest_pass(View view) {
        EditText pass_te = (EditText) findViewById(R.id.reset_password);
        EditText repass_te = (EditText) findViewById(R.id.reset_repassword);
        String new_password = pass_te.getText().toString();
        String re_new_password = repass_te.getText().toString();
        EditText et_username = (EditText) findViewById(R.id.signin_uname);
        global glob = (global) getApplicationContext();
        if (new_password.equals(re_new_password)) {
            String url = glob.ip_port + "/api/resetpassword?password=" + pass_te.getText().toString() + "&email=" + resetEmail;
            try {
                JSONObject json = MainActivity.readJsonFromUrl(url);
                Toast.makeText(MainActivity.this, "The password was successfully changed.", Toast.LENGTH_SHORT).show();
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                viewPager.setCurrentItem(0);
            } catch (Exception e) {

            }
        } else {
            Toast.makeText(MainActivity.this, "Please make sure password are the same.", Toast.LENGTH_SHORT).show();
        }
    }

    public void forgot(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
        viewPager.setCurrentItem(2);
    }

    public void SignupEvent(View view) {
        EditText textbox = (EditText) findViewById(R.id.reg_f_name);
        String f_name = textbox.getText().toString();
        textbox = (EditText) findViewById(R.id.reg_l_name);
        String l_name = textbox.getText().toString();
        textbox = (EditText) findViewById(R.id.reg_email);
        String email = textbox.getText().toString();
        textbox = (EditText) findViewById(R.id.reg_uname);
        String username = textbox.getText().toString();
        textbox = (EditText) findViewById(R.id.reg_password);
        String password = textbox.getText().toString();
        textbox = (EditText) findViewById(R.id.reg_repassword);
        String password2 = textbox.getText().toString();
        textbox = (EditText) findViewById(R.id.reg_weight);
        String weight = textbox.getText().toString();
        global glob = (global) getApplicationContext();
        EditText et_username = (EditText) findViewById(R.id.signin_uname);
        if (password.equals(password2)) {
            String url = glob.ip_port + "/api/signup?fname=" + f_name + "&lname=" + l_name + "&email=" + email + "&username=" + username + "&password=" + password + "&weight=" + weight;
            try {
                JSONObject json = readJsonFromUrl(url);
                String msg = json.getString("message");
                if (msg.equals("User already exists")) {
//                    AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
//                    builder.setTitle("Error");
//                    builder.setMessage(msg);
//                    builder.setPositiveButton("OK", null);
//                    AlertDialog dialog = builder.create();
//                    dialog.show();
                    Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
                } else if (msg.equals("success")) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                    viewPager.setCurrentItem(0);
                    et_username.setText(username);
//                    builder.setTitle("Success");
//                    builder.setMessage("The account is successfully created.");
//                    builder.setPositiveButton("OK", null);
//                    AlertDialog dialog = builder.create();
//                    dialog.show();
                } else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                    builder.setTitle("Error");
                    builder.setMessage(msg);
                    builder.setPositiveButton("OK", null);
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
            } catch (Exception e) {
//                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
//                builder.setTitle("Error");
//                builder.setMessage(e.toString() + url);
//                builder.setPositiveButton("OK", null);
//                AlertDialog dialog = builder.create();
//                dialog.show();
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setTitle("Error");
                builder.setMessage(e.getMessage());
                builder.setPositiveButton("OK", null);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        } else {
//            AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
//            builder.setTitle("Error");
//            builder.setMessage("Make sure passwords are match.");
//            builder.setPositiveButton("OK", null);
//            AlertDialog dialog = builder.create();
//            dialog.show();
            Toast.makeText(MainActivity.this, "Make sure passwords are match.", Toast.LENGTH_SHORT).show();
        }
    }

    public void LoginEvent(View view) {
        ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setTitle("Updating the profile.");
        progressDialog.setMessage("Please wait while the application is setting you profile.");
        progressDialog.show();
        EditText tb_username = (EditText) findViewById(R.id.signin_uname);
        String username = tb_username.getText().toString();
        EditText tb_password = (EditText) findViewById(R.id.sign_password);
        String password = tb_password.getText().toString();
        global glob = (global) getApplicationContext();
        if (username.equals("")) {

        }
        String url = glob.ip_port + "/api/signin?username=" + username + "&password=" + password;
        try {
            JSONObject json = readJsonFromUrl(url);
            String msg = json.getString("message");
            if (msg.equals("Incorrect login")) {
                Toast.makeText(MainActivity.this, "Incorrect Username or Password.", Toast.LENGTH_SHORT).show();
//                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
//                builder.setTitle("Error");
//                builder.setMessage("Incorrect Username or Password.");
//                builder.setPositiveButton("OK", null);
//                AlertDialog dialog = builder.create();
//                dialog.show();
            } else if (msg.equals("success")) {
                String f_name = json.getString("f_name");
                String l_name = json.getString("l_name");
                String token = json.getString("token");
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                String filename = "login_data";
                File file = new File(getApplicationContext().getFilesDir(), filename);
                if (file.exists())
                    file.delete();
                file = new File(getApplicationContext().getFilesDir(), filename);
                String fileContents = f_name + "|" + l_name + "|" + token + "|" + username;
                try (FileOutputStream fos = getApplicationContext().openFileOutput(filename, getApplicationContext().MODE_PRIVATE)) {
                    fos.write(fileContents.getBytes());
                } catch (Exception e) {
                    f_name = " Error";
                }
                LottieAnimationView lottie;
                lottie = findViewById(R.id.lottie);
                lottie.animate().translationX(2000).translationY(200).setDuration(2000).setStartDelay(0).translationY(200);
                MediaPlayer mp = MediaPlayer.create(this, R.raw.bicyclebell);
                mp.start();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(MainActivity.this, dashboard.class);
                        startActivity(intent);
                        timer.cancel();
                        timer = null;
                        finish();
                    }
                }, 2000);
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setTitle("Error");
                builder.setMessage("Error");
                builder.setPositiveButton("OK", null);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        } catch (Exception ex) {

        }
        progressDialog.dismiss();
    }

    class AuthenticationPagerAdapter extends FragmentPagerAdapter {
        private ArrayList<Fragment> fragmentList = new ArrayList<>();

        public AuthenticationPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            return fragmentList.get(i);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        void addFragmet(Fragment fragment) {
            fragmentList.add(fragment);
        }
    }
}