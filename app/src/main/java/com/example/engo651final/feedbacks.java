package com.example.engo651final;

import android.widget.RatingBar;

import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;

import android.content.res.ColorStateList;

import java.lang.Object;

import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.ClusterManager;

import java.time.LocalDate;
import java.time.Month;
import java.io.BufferedReader;
import java.io.*;
import java.net.*;
import java.nio.charset.*;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Marker;
import com.google.maps.android.clustering.algo.Algorithm;
import com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm;
import com.google.maps.android.clustering.algo.PreCachingAlgorithmDecorator;
import com.google.maps.android.clustering.view.ClusterRenderer;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;

import org.json.*;

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

import org.json.*;

import android.widget.RatingBar;
import android.widget.TextView;
import android.os.Handler;
import android.content.Intent;
import android.widget.Toast;

import com.google.android.gms.maps.SupportMapFragment;

import android.util.Log;
import android.app.AlertDialog;

import com.google.android.gms.common.GooglePlayServicesUtil;

import android.location.Address;

import java.util.*;

import android.app.Dialog;
import android.content.DialogInterface;

import android.location.Geocoder;
import android.view.KeyEvent;
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
import android.view.inputmethod.EditorInfo;
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

import androidx.recyclerview.widget.DefaultItemAnimator;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
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

import androidx.recyclerview.widget.LinearLayoutManager;

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

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


import androidx.appcompat.app.AppCompatActivity;

import com.example.engo651final.databinding.ActivityAmenityBinding;
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

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.text.Html;

import androidx.recyclerview.widget.RecyclerView;

public class feedbacks extends AppCompatActivity {
    private ArrayList<FeedbackItem> feedbacksList = new ArrayList<FeedbackItem>();
    recyclerAdapter adapter;
    RecyclerView recyclerView;
    TextView tv_info;
    ImageView iv_img;
    TextView tv_votes;
    RatingBar rb_votes;
    String type;
    String name;
    double lat;
    double lng;
    String date;
    String disc;
    String add;
    String info;
    String uri;
    String img_url;
    public String token = null;

    //if (historicsSelected) {
//        type = "historic";
//        intent.putExtra("img", historicsImg.get(historicsCMarker.indexOf(selectedLocationMarker)));
//        intent.putExtra("disc", historicsDisc.get(historicsCMarker.indexOf(selectedLocationMarker)));
//    } else if (eventsSelected) {
//        type = "event";
//        intent.putExtra("date", eventsDate.get(eventsCMarker.indexOf(selectedLocationMarker)));
//        intent.putExtra("disc", eventsDisc.get(eventsCMarker.indexOf(selectedLocationMarker)));
//        intent.putExtra("uri", eventsUri.get(eventsCMarker.indexOf(selectedLocationMarker)));
//    } else if (parksSelected) {
//        type = "park";
//        intent.putExtra("info", parksInfo.get(parksCMarker.indexOf(selectedLocationMarker)));
//    } else if (bikeparksSelected) {
//        type = "bikepark";
//        intent.putExtra("add", bikeparksAdd.get(bikeparksCMarker.indexOf(selectedLocationMarker)));
//    }
//            intent.putExtra("lat", selectedLocationMarker.getPosition().latitude);
//            intent.putExtra("lng", selectedLocationMarker.getPosition().longitude);
//            intent.putExtra("type", type);
//            intent.putExtra("name", selectedLocationMarker.getTitle());
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedbacks);
        Bundle extras = getIntent().getExtras();
        setToken();
        recyclerView = findViewById(R.id.rv_feedbacks);
        tv_info = (TextView) findViewById(R.id.tv_info);
        iv_img = (ImageView) findViewById(R.id.imageView2);
        tv_votes = (TextView) findViewById(R.id.tv_votes);
        rb_votes = (RatingBar) findViewById(R.id.ratingBar);
        if (extras != null) {
            lng = extras.getDouble("lng");
            lat = extras.getDouble("lat");
            type = extras.getString("type");
            name = extras.getString("name");
            if (type.equals("historic")) {
                img_url = extras.getString("img");
                disc = extras.getString("disc");
                tv_info.setText(Html.fromHtml("<b>Name of the Historical Place:</b><br>" + name + "<br><br><b>Description:</b><br>" + disc));
                Bitmap img = null;
                try {
                    if (!img_url.contains("noimage.jpg")) {
                        InputStream in = new java.net.URL(img_url).openStream();
                        img = BitmapFactory.decodeStream(in);
                        iv_img.setImageBitmap(img);
                    } else {
                        iv_img.setImageResource(R.drawable.historic);
                    }
                } catch (Exception e) {
                    Log.e("Error", e.getMessage());
                    e.printStackTrace();
                }
            } else if (type.equals("event")) {
                date = extras.getString("date");
                disc = extras.getString("disc");
                uri = extras.getString("uri");
                tv_info.setText(Html.fromHtml("<b>Name of the Event:</b><br>" + name + "<br><br><b>Date:</b><br>" + date + "<br><br><b>Website:</b><br>" + uri + "<br><br><b>Description:</b><br>" + disc));
                Bitmap img = null;
                try {
                    iv_img.setImageResource(R.drawable.intl_day);
                } catch (Exception e) {
                    Log.e("Error", e.getMessage());
                    e.printStackTrace();
                }
            } else if (type.equals("bikepark")) {
                add = extras.getString("add");
                tv_info.setText(Html.fromHtml("<b>Name of the Parking lot for Bikes:</b><br>" + name + "<br><br><b>Address:</b>" + add));
                Bitmap img = null;
                try {
                    iv_img.setImageResource(R.drawable.icons8_bike_parking);
                } catch (Exception e) {
                    Log.e("Error", e.getMessage());
                    e.printStackTrace();
                }
            } else if (type.equals("park")) {
                disc = extras.getString("info");
                tv_info.setText(Html.fromHtml("<b>Name of the Park for Bikes:</b><br>" + name + "<br><br><b>Info:</b><br>" + disc));
                Bitmap img = null;
                try {
                    iv_img.setImageResource(R.drawable.fabulous_park);
                } catch (Exception e) {
                    Log.e("Error", e.getMessage());
                    e.printStackTrace();
                }
            }
        }
        showFeedbacks();
    }

    public void close(View view) {
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

    public void showFeedbacks() {
        float rates;
        int votes;
//        String type;
//        String name;
//        double lat;
//        double lng;
        global glob = (global) getApplicationContext();
        String query = token + "&type=" + type + "&name=" + name.replace("#", "").replace("&", "") + "&lat=" + lat + "&lng=" + lng;
        String url = glob.ip_port + "/api/destinations_feedbacks?token=" + query;
        String feedbacks = "";
        JSONArray jsonArray;
        try {
            JSONObject json = MainActivity.readJsonFromUrl(url);
            String msg = json.getString("message");
            if (msg.equals("success")) {
                rates = (float) json.getDouble("rate");
                votes = json.getInt("votes");
                jsonArray = json.getJSONArray("feedbacks");
                for (int i = 0; i < jsonArray.length(); i++) {
                    String feedback = jsonArray.getJSONObject(i).optString("feedback", "");
                    float rate = (float) jsonArray.getJSONObject(i).getDouble("rate");
                    feedbacksList.add(new FeedbackItem(rate, feedback));
                }
                recyclerAdapter adapter = new recyclerAdapter(feedbacksList);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(adapter);
                rb_votes.setRating(rates);
                tv_votes.setText("Number of votes: " + String.valueOf(votes));
                if (votes == 0) {
                    TextView textView2 = (TextView) findViewById(R.id.textView2);
                    textView2.setText("");
                }
            } else {
                tv_votes.setText("Number of votes: 0");
                TextView textView2 = (TextView) findViewById(R.id.textView2);
                textView2.setText("");
            }
        } catch (Exception e) {
            TextView textView2 = (TextView) findViewById(R.id.textView2);
            textView2.setText("");
        }
    }
}