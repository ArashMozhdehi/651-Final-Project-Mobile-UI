package com.example.engo651final;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.widget.Toast;
import android.widget.ImageView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.skydoves.balloon.*;
import com.skydoves.*;

import android.app.Activity;
import android.os.AsyncTask;

import androidx.core.content.ContextCompat;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import maes.tech.intentanim.CustomIntent;

import android.app.AlertDialog;

import com.airbnb.lottie.L;
import com.google.android.gms.common.GooglePlayServicesUtil;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

import android.graphics.Color;
import android.graphics.Typeface;
import android.location.Geocoder;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.Manifest;
import android.content.Intent;
import android.location.Criteria;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

//import com.google.android.material.animation;

import android.view.animation.AnimationUtils;
import android.app.AlertDialog;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
//import com.google.android.gms.maps.Animation;
import com.google.android.gms.maps.model.MarkerOptions;

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


import org.json.*;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import com.skydoves.balloon.ArrowOrientation;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.BalloonAnimation;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;

import java.io.*;
import java.net.*;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
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

import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;
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

import android.widget.RelativeLayout;
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

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

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
import java.util.UUID;

import androidx.appcompat.app.ActionBar;

import android.app.PendingIntent;

import org.json.*;

import android.widget.TextView;

import maes.tech.intentanim.CustomIntent;

public class dashboard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    private View.OnClickListener onButtonClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SetText(v);
        }
    };

//    public String GetUsername() {
//        String filename = "login_data";
//        String username = "";
//        String line = null;
//        File file = new File(getApplicationContext().getFilesDir(), filename);
//        if (file.exists()) {
//            try {
//                FileInputStream is = new FileInputStream(file);
//                InputStreamReader isReader = new InputStreamReader(is);
//                BufferedReader reader = new BufferedReader(isReader);
//                StringBuilder sb = new StringBuilder();
//                while ((line = reader.readLine()) != null) {
//                    sb.append(line + System.getProperty("line.separator"));
//                }
//                is.close();
//                line = sb.toString();
//                username = line.split("\\|", 5)[3];
//                reader.close();
//            } catch (Exception e) {
//
//            }
//        }
//        return username.trim();
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.hide();
//
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
//        toggle.syncState();
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);

        try {
//            drawerLayout = findViewById(R.id.main_dl);
//            toolbar = findViewById(R.id.main_toolbar);
//            setSupportActionBar(toolbar);
//            ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_drawer_string, R.string.close_drawer_string);
//            drawerLayout.addDrawerListener(actionBarDrawerToggle);
//            actionBarDrawerToggle.syncState();
            TextView textView = findViewById(R.id.tv_profile_name);
            textView.setText(GetProfile());
            NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
            View headerView = navigationView.getHeaderView(0);
            TextView navUsername = (TextView) headerView.findViewById(R.id.profile_name);
            navUsername.setText(GetProfile());
            String filename = "images/" + getHash(GetUsername()) + ".jpg";
            de.hdodenhof.circleimageview.CircleImageView navProfileImage = (de.hdodenhof.circleimageview.CircleImageView) headerView.findViewById(R.id.profile_image);
            FirebaseStorage firebaseStorage = FirebaseStorage.getInstance();
            StorageReference storageRef = firebaseStorage.getReference();
            StorageReference pathReference = storageRef.child(filename);
            final long ONE_MEGABYTE = 1024 * 1024;
            pathReference.getBytes(ONE_MEGABYTE).addOnSuccessListener(new OnSuccessListener<byte[]>() {
                @Override
                public void onSuccess(byte[] bytes) {
                    Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
                    navProfileImage.setImageBitmap(bitmap);
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {
//                    Toast.makeText(dashboard.this, "Error: " + exception.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        } catch (Exception e) {
//            AlertDialog.Builder builder = new AlertDialog.Builder(this);
//            builder.setTitle("Error");
//            builder.setMessage(e.getMessage());
//            builder.setPositiveButton("OK", null);
//            AlertDialog dialog = builder.create();
//            dialog.show();
        }

        try {
//            try {
//                IMqttToken token = client.connect();
//                token.setActionCallback(new IMqttActionListener() {
//                    @Override
//                    public void onSuccess(IMqttToken asyncActionToken) {
//                        Log.e("TAG", "onSuccess");
//                        int qos = 1;
//                        try {
//                            client.subscribe(topic, qos);
//                        } catch (MqttException e) {
//                            e.printStackTrace();
//                        }
//                        String payload = "the payload";
//                        byte[] encodedPayload = new byte[0];
//                        try {
//                            encodedPayload = payload.getBytes("UTF-8");
//                            MqttMessage message = new MqttMessage(encodedPayload);
//                            client.publish(topic, message);
//                        } catch (UnsupportedEncodingException | MqttException e) {
//                            e.printStackTrace();
//                        }
//                    }
//
//                    @Override
//                    public void onFailure(IMqttToken asyncActionToken, Throwable exception) {
//                        Log.e("TAG", "onFailure");
//                    }
//                });
//            } catch (MqttException e) {
//                e.printStackTrace();
//            }

//            String topic = "bike_assistant/" + GetUsername() + "/" + getToken();
//            String broker = "tcp://mqtt.eclipseprojects.io:1883";
//            String publisherId = UUID.randomUUID().toString();
//            Log.e("topic", topic);
//            Log.e("broker", broker);
//            Log.e("publisherId", publisherId);
//
//            MqttAndroidClient mqttAndroidClient = new MqttAndroidClient(this, broker, publisherId);
//            mqttAndroidClient.connect();
//            MqttMessage message = new MqttMessage();
//            String payload = "test";
//            message.setPayload(payload.getBytes());
//            message.setQos(0);
//            mqttAndroidClient.publish(topic, payload.getBytes(), 0, true);
//            MemoryPersistence persistence = new MemoryPersistence();

//            MqttClient client = new MqttClient(broker, "JavaSample", persistence);
//            MqttConnectOptions connOpts = new MqttConnectOptions();
//            connOpts.setCleanSession(true);
//            client.connect(connOpts);
//            MqttMessage message = new MqttMessage("test".getBytes());
//            message.setQos(2);
//            client.publish(topic, message);
        } catch (Exception e) {
            Log.e("TAG", e.getMessage());
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_exit) {
            exit(findViewById(R.id.nav_exit));
            return true;
        } else if (id == R.id.nav_start) {
            Destination(findViewById(R.id.nav_start));
        } else if (id == R.id.nav_amenities) {
            goto_amenity(findViewById(R.id.nav_amenities));
        } else if (id == R.id.nav_statistics) {
            statistics(findViewById(R.id.nav_statistics));
        } else if (id == R.id.nav_settings) {
            Settings(findViewById(R.id.nav_settings));
        } else if (id == R.id.nav_logout) {
            Logout(findViewById(R.id.nav_logout));
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(Gravity.START);
        return true;
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

    public String GetProfile() {
        String filename = "login_data";
        String fullName = "";
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
                fullName = line.split("\\|", 5)[0] + " " + line.split("\\|", 5)[1];
                reader.close();
            } catch (Exception e) {

            }
        }
        return fullName;
    }

    public void goto_amenity(View view) {
//        Uri gmmIntentUri = Uri.parse("google.navigation:q=50.8728064942564, -114.033814474955&mode=b");
//        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
//        mapIntent.setPackage("com.google.android.apps.maps");
//        startActivity(mapIntent);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(dashboard.this, amenities.class);
                startActivity(intent);
                CustomIntent.customType(dashboard.this, "right-to-left");
                finish();
            }
        }, 20);
    }

    public void Logout(View view) {
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
                file.delete();
            } catch (Exception e) {

            }
        }
        global glob = (global) getApplicationContext();
        String url = glob.ip_port + "/api/signout?username=" + username + "&token=" + token;
//        f_name + "|" + l_name + "|" + token + "|" + username
        try {
            JSONObject json = MainActivity.readJsonFromUrl(url);
            String msg = json.getString("message");
            if (msg.equals("Incorrect token")) {

            } else if (msg.equals("success")) {

            }
        } catch (Exception e) {

        }
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(dashboard.this, MainActivity.class);
                startActivity(intent);
                CustomIntent.customType(dashboard.this, "left-to-right");
                finish();
            }
        }, 20);
    }

    public void SetText(View view) {
        String filename = "login_data";
        String line = null;
        TextView textview = null;
        try {
            File file = new File(getApplicationContext().getFilesDir(), filename);
            FileInputStream is = new FileInputStream(file);
            InputStreamReader isReader = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isReader);
            StringBuilder sb = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                sb.append(line + System.getProperty("line.separator"));
            }
            is.close();
            line = sb.toString();
            reader.close();
            textview = (TextView) findViewById(R.id.main_tv);
            textview.setText(line);
        } catch (FileNotFoundException e) {
            textview = (TextView) findViewById(R.id.main_tv);
            textview.setText(e.toString());
        } catch (IOException e) {
            textview = (TextView) findViewById(R.id.main_tv);
            textview.setText(e.toString());
        }
    }

    public void Settings(View view) {
        Intent intent = new Intent(dashboard.this, settings.class);
        startActivity(intent);
        CustomIntent.customType(this, "up-to-bottom");
        finish();
    }

    public void Destination(View view) {
        Intent intent = new Intent(dashboard.this, destination.class);
        startActivity(intent);
        CustomIntent.customType(this, "bottom-to-up");
        finish();
    }

    public String getHash(String input) {
        try {
            MessageDigest digest;

            digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(input.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (Exception e) {
            return "";
        }
    }

    public void close(View view) {
//        System.exit(0);
//        dashboard.this.finish();
//        moveTaskToBack(true);
//        int p_id = android.os.Process.myPid();
//        android.os.Process.killProcess(p_id);
//        moveTaskToBack(true);
//        android.os.Process.killProcess(android.os.Process.myPid());
//        System.exit(1);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.openDrawer(Gravity.LEFT);
    }

    public void exit(View view) {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        startActivity(intent);
        System.exit(0);
        dashboard.this.finish();
        moveTaskToBack(true);
        int p_id = android.os.Process.myPid();
        android.os.Process.killProcess(p_id);
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        drawer.openDrawer(Gravity.LEFT);
    }

    public void statistics(View view) {
        Intent intent = new Intent(dashboard.this, statistics.class);
        startActivity(intent);
        CustomIntent.customType(this, "fadein-to-fadeout");
        finish();
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
        Log.e("Settings", "Username: " + username);
        return username.trim();
    }
}