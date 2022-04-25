package com.example.engo651final;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.media.MediaPlayer;

import java.io.*;
import java.net.*;
import java.nio.charset.*;

import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout.DrawerListener;

import android.view.Menu;

import org.json.*;

import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class logo extends AppCompatActivity {

    TextView appName;
    LottieAnimationView lottie;

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
        AlertDialog.Builder builder = new AlertDialog.Builder(logo.this);
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
        setContentView(R.layout.activity_logo);
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.hide();
        appName = findViewById(R.id.tv_appname);
        lottie = findViewById(R.id.logo_lottie);

        appName.animate().translationY(-1500).setDuration(2700).setStartDelay(0);
        lottie.animate().translationX(2000).translationY(200).setDuration(2000).setStartDelay(2900).translationY(200);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(logo.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
//        handler1.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                MediaPlayer mp = MediaPlayer.create(this, R.raw.bicyclebell);
//                mp.start();
//            }
//        }, 5000);
    }
}