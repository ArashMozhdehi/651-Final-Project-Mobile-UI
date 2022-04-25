package com.example.engo651final;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.location.Location;
import android.net.Uri;

import java.io.*;
import java.net.*;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.os.StrictMode;

import java.util.ArrayList;

import androidx.fragment.app.FragmentManager;
import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import android.app.Activity;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
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

import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout.DrawerListener;

import android.view.Menu;

import org.json.*;

import android.widget.TextView;
import android.os.Handler;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.EditText;
//import android.widget.ActionBar;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.io.*;
import java.net.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.os.StrictMode;

import java.util.ArrayList;

import androidx.fragment.app.FragmentManager;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.navigation.NavigationView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import android.app.Activity;
//import androidx;
//import androidx.appcompact;
import org.json.JSONException;
import org.json.JSONObject;

import android.net.Uri;

import java.io.*;
import java.net.*;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.os.StrictMode;

import java.util.ArrayList;

import androidx.fragment.app.FragmentManager;
import androidx.appcompat.app.AppCompatActivity;

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

import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout.DrawerListener;

import android.view.Menu;

import org.json.*;

import android.widget.TextView;
import android.os.Handler;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.EditText;
//import android.widget.ActionBar;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.io.*;
import java.net.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.os.StrictMode;

import java.util.ArrayList;

import androidx.fragment.app.FragmentManager;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.navigation.NavigationView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import android.app.Activity;
//import androidx;
//import androidx.appcompact;
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

import androidx.appcompat.app.ActionBar;

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

import androidx.appcompat.app.ActionBar;


import org.json.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Timer;
import java.util.TimerTask;
import java.lang.Math.*;

public class feedback_water extends AppCompatActivity {
    public String token = null;
    public String lng = null;
    public String lat = null;
    double dst_lng = 0;
    double dst_lat = 0;
    double src_lng = 0;
    double src_lat = 0;
    double last_lat = 0;
    double last_lng = 0;
    private FusedLocationProviderClient mLocationClient;
    Timer timer;
    global glob;
    Intent mapIntent = null;
    Thread mqqtThread = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_water);
        setToken();
        glob = (global) getApplicationContext();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            lng = extras.getString("lng");
            lat = extras.getString("lat");
            dst_lng = Double.valueOf(lng);
            dst_lat = Double.valueOf(lat);
            src_lng = extras.getDouble("src_lng");
            src_lat = extras.getDouble("src_lat");
            Uri gmmIntentUri = Uri.parse("google.navigation:q=" + lat + ", " + lng + "&mode=b");
            mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }
        mLocationClient = LocationServices.getFusedLocationProviderClient(this);
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            private Handler handler = new Handler() {
                @Override
                public void dispatchMessage(Message msg) {
                    super.dispatchMessage(msg);
                    insideTimer();
                }
            };

            public void run() {
                try {
                    handler.sendEmptyMessage(0);
                } catch (Exception e) {

                }
            }
        }, 1000, 60000);
    }

    public static JSONArray readJsonArrayFromUrl(String link) {
        // Input Stream Object To Start Streaming.
        InputStream input = null;
        try {                                 // try catch for checked exception
            input = new URL(link).openStream();
            BufferedReader re = new BufferedReader(new InputStreamReader(input, Charset.forName("UTF-8")));
            // Buffer Reading In UTF-8
            String Text = Read(re);         // Handy Method To Read Data From BufferReader
            JSONArray json = new JSONArray(Text);    //Creating A JSON
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

    public static String Read(Reader reader) {
        try {
            StringBuilder strBuilder = new StringBuilder();
            int index;
            do {
                index = reader.read();
                strBuilder.append((char) index);
            } while (index != -1);
            return strBuilder.toString();
        } catch (Exception e) {

        }
        return null;
    }

    public void submit(View view) {
        RatingBar rate1 = (RatingBar) findViewById(R.id.cleanBar);
        RatingBar rate2 = (RatingBar) findViewById(R.id.equipBar);
        global glob = (global) getApplicationContext();
        String url = glob.ip_port + "/api/waterfeedback?token=" + token + "&lat=" + lat + "&lng=" + lng + "&rate=" + String.valueOf(rate1.getRating() / 2 + rate2.getRating() / 2);
        try {
            JSONObject json = MainActivity.readJsonFromUrl(url);
            String msg = json.getString("message");
            Toast.makeText(feedback_water.this, "Thank you for your feedback.", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {

        }
        timer.cancel();
        timer = null;
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(feedback_water.this, dashboard.class);
                startActivity(intent);
                finish();
            }
        }, 1000);
    }

    public void skip(View view) {
//        global glob = (global) getApplicationContext();
//        String url = glob.ip_port + "/api/waterfeedback/" + token + "|" + lat + "|" + lng + "|NO";
//        try {
//            JSONObject json = MainActivity.readJsonFromUrl(url);
//            String msg = json.getString("message");
//        } catch (Exception e) {
//
//        }
        timer.cancel();
        timer = null;
        Intent intent = new Intent(feedback_water.this, dashboard.class);
        startActivity(intent);
        finish();
    }

    public void setToken() {
        String filename = "login_data";
        String line = null;
        File file = new File(getApplicationContext().getFilesDir(), filename);
        String username = "";
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
    }

    static double haversine(double lat1, double lng1, double lat2, double lng2) {
        double dist_lat = Math.toRadians(lat2 - lat1);
        double dist_lng = Math.toRadians(lng2 - lng1);
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);
        double a = Math.pow(Math.sin(dist_lat / 2), 2) + Math.pow(Math.sin(dist_lng / 2), 2) * Math.cos(lat1) * Math.cos(lat2);
        double rad = 6371;
        double c = 2 * Math.asin(Math.sqrt(a));
        return rad * c;
    }

    public void insideTimer() {
        int radius = 100;
        mLocationClient.getLastLocation()
                .addOnSuccessListener(this, new OnSuccessListener<Location>() {
                    @Override
                    public void onSuccess(Location location) {
                        if (location != null) {
                            double lat = location.getLatitude();
                            double lng = location.getLongitude();
                            incidentSiteCheck(lat, lng, radius);
                            constructionSiteCheck(lat, lng, radius);
                            String messages = "{\"cur_lat\":\"" + lat + "\",\"cur_lng\":\"" + lng + "\",\"speed\":\"" + String.valueOf(location.getSpeed()) + "\",\"dst_lat\":\""
                                    + dst_lat + "\",\"dst_lng\":\"" + dst_lng + "\",\"src_lat\":\"" + src_lat + "\"," +
                                    "\"src_lng\":\"" + src_lng + "\"}";
                            try {
                                if (mqqtThread != null) {
                                    mqqtThread.stop();
                                    mqqtThread = null;
                                }
                                mqqtThread = new Thread(new Runnable() {
                                    public void run() {
                                        send_subscribe(messages);
                                    }
                                });
                                mqqtThread.start();
                            } catch (Exception e) {

                            }
                            String url = glob.ip_port + "/api/location_update?token=" + token + "&lat=" + lat + "&lng=" + lng;
                            try {
                                JSONObject json = MainActivity.readJsonFromUrl(url);
                            } catch (Exception e) {

                            }
                            try {
                                if (Math.abs(haversine(last_lat, last_lng, lat, lng)) < 15 && Math.abs(haversine(dst_lat, dst_lng, lat, lng)) < 15) {

                                }
                                last_lat = lat;
                                last_lng = lng;
                            } catch (Exception e) {

                            }
                        }
                    }
                });
    }

    public void incidentSiteCheck(double lat, double lng, int radius) {
        String url = "https://data.calgary.ca/resource/4jah-h97u.json?$where=within_circle(point," + lat + "," + lng + "," + radius + ")";
        try {
            JSONArray json = readJsonArrayFromUrl(url);
            if (json.length() > 0)
                crashSiteAlert(json.getJSONObject(0).optString("incident_info", ""));
        } catch (Exception e) {

        }
    }

    public void constructionSiteCheck(double lat, double lng, int radius) {
        String url = "https://data.calgary.ca/resource/sizs-hgef.json?$where=within_circle(point," + lat + "," + lng + "," + radius + ")";
        try {
            JSONArray json = readJsonArrayFromUrl(url);
            if (json.length() > 0)
                constructionSiteAlert(json.getJSONObject(0).optString("title", ""));
        } catch (Exception e) {

        }
    }

    public void constructionSiteAlert(String address) {
        NotificationManager notificationManager = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence channel_name = "Bike Assistant";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel("BIKE_ASSIST", channel_name, importance);
            notificationManager.createNotificationChannel(channel);
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "BIKE_ASSIST")
                .setSmallIcon(R.drawable.icons8_construction)
                .setContentTitle("Construction Site Alert")
                .setContentText("On: " + address)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setAutoCancel(true);
        notificationManager.notify(1, builder.build());
    }

    public void crashSiteAlert(String address) {
        NotificationManager notificationManager = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence channel_name = "Bike Assistant";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel("BIKE_ASSIST", channel_name, importance);
            notificationManager.createNotificationChannel(channel);
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "BIKE_ASSIST")
                .setSmallIcon(R.drawable.icons8_accident)
                .setContentTitle("Incident Site Alert")
                .setContentText("On : " + address)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setAutoCancel(true);
        notificationManager.notify(1, builder.build());
    }

    public void currentLocationAlert(double lat, double lng) {
        NotificationManager notificationManager = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence channel_name = "Bike Assistant";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel("BIKE_ASSIST", channel_name, importance);
            notificationManager.createNotificationChannel(channel);
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "BIKE_ASSIST")
                .setSmallIcon(R.drawable.icons8_location)
                .setContentTitle("Current Location")
                .setContentText("Latitude: " + lat + ", Longitude: " + lng)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setAutoCancel(true);
        notificationManager.notify(1, builder.build());
    }

    public void send_subscribe(String message) {
        try {
            String appToken = token;
            String username = GetUsername().trim();
            String topic = "bike_assistant/" + username + "/" + appToken;
            Log.e("message", message);
            Log.e("topic", topic);
            String broker = "tcp://test.mosquitto.org:1883";
            String clientId = MqttClient.generateClientId();
            MemoryPersistence persistence = new MemoryPersistence();
            MqttClient sampleClient = new MqttClient(broker, clientId, persistence);
            MqttConnectOptions connOpts = new MqttConnectOptions();
            connOpts.setCleanSession(true);
            sampleClient.connect(connOpts);
            while (!sampleClient.isConnected()) {

            }
            MqttMessage mqttMessage = new MqttMessage(message.getBytes());
            sampleClient.publish(topic, mqttMessage);
            sampleClient.disconnect();
        } catch (Exception e) {
            Log.e("TAG", e.getMessage());
        }
    }

    public String GetUsername() {
        String filename = "login_data";
        String username = "";
        String line = null;
        File file = new File(getApplicationContext().getFilesDir(), filename);
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
                username = line.split("\\|", 5)[3];
                reader.close();
            } catch (Exception e) {

            }
        }
        return username;
    }
}