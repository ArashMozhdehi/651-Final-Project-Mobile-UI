package com.example.engo651final;

import android.widget.ImageView;

import com.skydoves.balloon.*;
import com.skydoves.*;

import android.app.Activity;
import android.os.AsyncTask;

import androidx.core.content.ContextCompat;

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

public class amenities extends AppCompatActivity implements OnMapReadyCallback, GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    boolean isPermissionGranted;
    MapView mapView;
    Polyline polyline = null;
    LocationManager locationManager = null;
    private GoogleMap mMap;
    FloatingActionButton fab;
    FloatingActionButton fab_skip;
    private FusedLocationProviderClient mLocationClient;
    private int GPS_REQUEST_CODE = 9001;
    private boolean clicked = false;
    Animation to_anim;
    Animation rotate_close_anim;
    Animation rotate_open_anim;
    Animation from_anim;
    Marker currentLocationMarker = null;
    double currentLocationLat = 0;
    double currentLocationLng = 0;
    public double lng = 0;
    public double lat = 0;
    CheckBox toilet = null;
    CheckBox water = null;
    CheckBox bench = null;
    public Polyline currentPolyline = null;
    ArrayList<MarkerOptions> toilets_markeroption = new ArrayList<MarkerOptions>();
    ArrayList<MarkerOptions> waters_markeroption = new ArrayList<MarkerOptions>();
    ArrayList<MarkerOptions> benchs_markeroption = new ArrayList<MarkerOptions>();
    ArrayList<Marker> toilets_marker = new ArrayList<Marker>();
    ArrayList<Marker> waters_marker = new ArrayList<Marker>();
    ArrayList<Marker> benchs_marker = new ArrayList<Marker>();

    CheckBox cb_terrain = null;
    CheckBox cb_normal = null;
    CheckBox cb_hybrid = null;
    CheckBox cb_satellite = null;


    private void setAnimation() {
        to_anim = AnimationUtils.loadAnimation(this, R.anim.to_bottom_anim);
        rotate_close_anim = AnimationUtils.loadAnimation(this, R.anim.rotate_close_anim);
        rotate_open_anim = AnimationUtils.loadAnimation(this, R.anim.rotate_open_anim);
        from_anim = AnimationUtils.loadAnimation(this, R.anim.from_bottom_anim);
        try {
            FloatingActionButton fab_toilet = findViewById(R.id.fab_toilet);
            FloatingActionButton fab_water = findViewById(R.id.fab_water);
            FloatingActionButton fab_bench = findViewById(R.id.fab_bench);
            FloatingActionButton fab_amenities = findViewById(R.id.fab_amenities);
            if (!clicked) {
                fab_toilet.setAnimation(from_anim);
                fab_water.setAnimation(from_anim);
                fab_bench.setAnimation(from_anim);
                fab_amenities.setAnimation(rotate_open_anim);
            } else {
                fab_toilet.setAnimation(to_anim);
                fab_water.setAnimation(to_anim);
                fab_bench.setAnimation(to_anim);
                fab_amenities.setAnimation(rotate_close_anim);
            }
        } catch (Exception e) {
//            Toast.makeText(amenities.this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void setVisibility() {
        FloatingActionButton fab_toilet = findViewById(R.id.fab_toilet);
        FloatingActionButton fab_water = findViewById(R.id.fab_water);
        FloatingActionButton fab_bench = findViewById(R.id.fab_bench);
        if (!clicked) {
            fab_toilet.setVisibility(View.VISIBLE);
            fab_water.setVisibility(View.VISIBLE);
            fab_bench.setVisibility(View.VISIBLE);
        } else {
            fab_toilet.setVisibility(View.INVISIBLE);
            fab_water.setVisibility(View.INVISIBLE);
            fab_bench.setVisibility(View.INVISIBLE);
        }
    }

    private void onAddBottonClicked() {
        setAnimation();
        setVisibility();
        clicked = !clicked;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amenities);
        FloatingActionButton fab_amenities = findViewById(R.id.fab_amenities);
        FloatingActionButton fab_skip = findViewById(R.id.fab_skip);


        toilet = findViewById(R.id.resttoom_checkBox);
        water = findViewById(R.id.water_checkBox);
        bench = findViewById(R.id.bench_checkBox);

        cb_terrain = findViewById(R.id.cb_terrain);
        cb_normal = findViewById(R.id.cb_normal);
        cb_hybrid = findViewById(R.id.cb_hybrid);
        cb_satellite = findViewById(R.id.cb_satellite);

        fab_amenities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAddBottonClicked();
            }
        });
        try {
//            Intent intent = new Intent();
//            intent.setAction(Settings.ACTION_APPLICATION_SETTINGS);
//            Uri uri = Uri.fromParts("package", getPackageName(), "");
//            intent.setData(uri);
//            startActivity(intent);
            checkMyPermission();
            initMap();
            GoogleApiClient mGoogleApiClient = new GoogleApiClient.Builder(this)
                    .addConnectionCallbacks(this)
                    .addOnConnectionFailedListener(this)
                    .addApi(LocationServices.API)
                    .build();
            mGoogleApiClient.connect();
            if (!mGoogleApiClient.isConnected()) {
                Toast.makeText(amenities.this, "GoogleApiClient is not connected", Toast.LENGTH_SHORT).show();
            }
            if (!isGooglePlayServicesAvailable()) {
                Toast.makeText(amenities.this, "GooglePlayServices are not available", Toast.LENGTH_SHORT).show();
            }
            mLocationClient = LocationServices.getFusedLocationProviderClient(this);
            getCurrLoc();
            locationManager = (LocationManager) this.getSystemService(this.LOCATION_SERVICE);
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,
                    2000,
                    10, locationListenerGPS);
        } catch (Exception e) {
            Toast.makeText(amenities.this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }

        cb_terrain.setOnCheckedChangeListener(
                new OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {
                            cb_hybrid.setChecked(false);
                            cb_normal.setChecked(false);
                            cb_satellite.setChecked(false);

                            cb_hybrid.setTextColor(ContextCompat.getColor(amenities.this, R.color.lavender_blue));
                            cb_normal.setTextColor(ContextCompat.getColor(amenities.this, R.color.lavender_blue));
                            cb_satellite.setTextColor(ContextCompat.getColor(amenities.this, R.color.lavender_blue));
                            cb_terrain.setTextColor(ContextCompat.getColor(amenities.this, R.color.lavender_blue));
                            water.setTextColor(ContextCompat.getColor(amenities.this, R.color.royal_blue));
                            toilet.setTextColor(ContextCompat.getColor(amenities.this, R.color.royal_blue));
                            bench.setTextColor(ContextCompat.getColor(amenities.this, R.color.royal_blue));
                            fab_amenities.setBackgroundColor(ContextCompat.getColor(amenities.this, R.color.blue_a200));
                            fab_skip.setBackgroundColor(ContextCompat.getColor(amenities.this, R.color.blue_a200));

                            mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                        } else {

                        }
                    }
                });

        cb_normal.setOnCheckedChangeListener(
                new OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {
                            cb_hybrid.setChecked(false);
                            cb_terrain.setChecked(false);
                            cb_satellite.setChecked(false);
                            mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

                            cb_hybrid.setTextColor(ContextCompat.getColor(amenities.this, R.color.lavender_blue));
                            cb_normal.setTextColor(ContextCompat.getColor(amenities.this, R.color.lavender_blue));
                            cb_satellite.setTextColor(ContextCompat.getColor(amenities.this, R.color.lavender_blue));
                            cb_terrain.setTextColor(ContextCompat.getColor(amenities.this, R.color.lavender_blue));
                            water.setTextColor(ContextCompat.getColor(amenities.this, R.color.royal_blue));
                            toilet.setTextColor(ContextCompat.getColor(amenities.this, R.color.royal_blue));
                            bench.setTextColor(ContextCompat.getColor(amenities.this, R.color.royal_blue));
                            fab_amenities.setBackgroundColor(ContextCompat.getColor(amenities.this, R.color.blue_a200));
                            fab_skip.setBackgroundColor(ContextCompat.getColor(amenities.this, R.color.blue_a200));

                        } else {

                        }
                    }
                });

        cb_hybrid.setOnCheckedChangeListener(
                new OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {
                            cb_normal.setChecked(false);
                            cb_terrain.setChecked(false);
                            cb_satellite.setChecked(false);
                            mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

                            cb_hybrid.setTextColor(ContextCompat.getColor(amenities.this, R.color.white));
                            cb_normal.setTextColor(ContextCompat.getColor(amenities.this, R.color.white));
                            cb_satellite.setTextColor(ContextCompat.getColor(amenities.this, R.color.white));
                            cb_terrain.setTextColor(ContextCompat.getColor(amenities.this, R.color.white));
                            water.setTextColor(ContextCompat.getColor(amenities.this, R.color.white));
                            toilet.setTextColor(ContextCompat.getColor(amenities.this, R.color.white));
                            bench.setTextColor(ContextCompat.getColor(amenities.this, R.color.white));
                            fab_amenities.setBackgroundColor(ContextCompat.getColor(amenities.this, R.color.light_grey));
                            fab_skip.setBackgroundColor(ContextCompat.getColor(amenities.this, R.color.light_grey));

                        } else {

                        }
                    }
                });

        cb_satellite.setOnCheckedChangeListener(
                new OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {
                            cb_normal.setChecked(false);
                            cb_terrain.setChecked(false);
                            cb_hybrid.setChecked(false);
                            mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

                            cb_hybrid.setTextColor(ContextCompat.getColor(amenities.this, R.color.white));
                            cb_normal.setTextColor(ContextCompat.getColor(amenities.this, R.color.white));
                            cb_satellite.setTextColor(ContextCompat.getColor(amenities.this, R.color.white));
                            cb_terrain.setTextColor(ContextCompat.getColor(amenities.this, R.color.white));
                            water.setTextColor(ContextCompat.getColor(amenities.this, R.color.white));
                            toilet.setTextColor(ContextCompat.getColor(amenities.this, R.color.white));
                            bench.setTextColor(ContextCompat.getColor(amenities.this, R.color.white));
                            fab_amenities.setBackgroundColor(ContextCompat.getColor(amenities.this, R.color.light_grey));
                            fab_skip.setBackgroundColor(ContextCompat.getColor(amenities.this, R.color.light_grey));

                        } else {

                        }
                    }
                });

        toilet.setOnCheckedChangeListener(
                new OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {
                            for (int i = 0; i < toilets_marker.size(); i++) {
                                toilets_marker.get(i).setVisible(true);
                            }
                        } else {
                            for (int i = 0; i < toilets_marker.size(); i++) {
                                toilets_marker.get(i).setVisible(false);
                            }
                        }
                    }
                });

        water.setOnCheckedChangeListener(
                new OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {
                            for (int i = 0; i < waters_marker.size(); i++) {
                                waters_marker.get(i).setVisible(true);
                            }
                        } else {
                            for (int i = 0; i < waters_marker.size(); i++) {
                                waters_marker.get(i).setVisible(false);
                            }
                        }
                    }
                });

        bench.setOnCheckedChangeListener(
                new OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {
                            for (int i = 0; i < benchs_marker.size(); i++) {
                                benchs_marker.get(i).setVisible(true);
                            }
                        } else {
                            for (int i = 0; i < benchs_marker.size(); i++) {
                                benchs_marker.get(i).setVisible(false);
                            }
                        }
                    }
                });
    }

    LocationListener locationListenerGPS = new LocationListener() {
        @Override
        public void onLocationChanged(android.location.Location location) {
            gotoLocation(location.getLatitude(), location.getLongitude(), location);
            currentLocationLat = location.getLatitude();
            currentLocationLng = location.getLongitude();
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {

        }

        @Override
        public void onProviderEnabled(String provider) {

        }

        @Override
        public void onProviderDisabled(String provider) {

        }
    };

    private void initMap() {
        if (isPermissionGranted) {
            if (isGPSenable()) {
                SupportMapFragment supportMapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapf_amenities);
                supportMapFragment.getMapAsync(this);
            }
//            mapView.getMapAsync(this);
//            mapView.onCreate(savedInstanceState);
        }
    }

    private boolean isGPSenable() {
        LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
        boolean providerEnable = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
        if (providerEnable) {
            return true;
        } else {
            AlertDialog alert = new AlertDialog.Builder(this)
                    .setTitle("GPS Permission")
                    .setMessage("GPS is required for this app to work. Please enable GPS")
                    .setPositiveButton("Yes", ((dialogInterface, i) -> {
                        Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                        startActivityForResult(intent, GPS_REQUEST_CODE);
                    }))
                    .setCancelable(false).show();
            return false;
        }
    }

    private void gotoLocation(double latitude, double longitude, Location location) {
        LatLng latLng = new LatLng(latitude, longitude);
        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(latLng, 18);
        mMap.moveCamera(cameraUpdate);
//        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
        LatLng current = new LatLng(latitude, longitude);
//        google.maps.marker = new google.maps.Marker({
//                mMap:mMap,
//                // draggable:true,
//                animation:google.maps.Animation.DROP,
//                position:new google.maps.LatLng(latitude, longitudex),
//                icon:'http://cdn.com/my-custom-icon.png'
//        });
        try {
            Bitmap icon = BitmapFactory.decodeResource(getApplicationContext().getResources(),
                    R.drawable.icon_bicycle);
            String title = "Your current loaction";
            String snippet = "Your speed: " + String.valueOf(location.getSpeed());
            try {
                if (currentLocationMarker != null) {
                    currentLocationMarker.remove();
                }
            } catch (Exception e) {

            }
            currentLocationMarker = mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(icon)).position(current).title(title).snippet(snippet));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(current));
            mMap.setMyLocationEnabled(true);
        } catch (Exception e) {
//            Toast.makeText(amenities.this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void checkMyPermission() {
        Dexter.withContext(this).withPermission(Manifest.permission.ACCESS_FINE_LOCATION).withListener(new PermissionListener() {
            @Override
            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
//                Toast.makeText(amenities.this, "Permission Granted", Toast.LENGTH_SHORT).show();
                isPermissionGranted = true;
            }

            @Override
            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
                Intent intent = new Intent();
                intent.setAction(Settings.ACTION_APPLICATION_SETTINGS);
                Uri uri = Uri.fromParts("package", getPackageName(), "");
                intent.setData(uri);
                startActivity(intent);
            }

            @Override
            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                permissionToken.continuePermissionRequest();
            }
        }).check();
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setMapToolbarEnabled(true);
        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
        // Add a marker in Sydney and move the camera
//        LatLng sydney = new LatLng(-34, 151);
//        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
//        mMap.setMyLocationEnabled(true);
        getCurrLoc();
        try {
            mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
                @Override
                public boolean onMarkerClick(Marker marker) {
                    final double latitude = marker.getPosition().latitude;
                    final double longitude = marker.getPosition().longitude;
                    marker.showInfoWindow();
                    String url = getUrlString(new LatLng(currentLocationLat, currentLocationLng), new LatLng(latitude, longitude));
                    DownloadTask downloadTask = new DownloadTask();
                    downloadTask.execute(url);
                    LatLng latLng = new LatLng(currentLocationLat / 2 + latitude / 2, longitude / 2 + currentLocationLng / 2);
                    CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLng(latLng);
                    mMap.moveCamera(cameraUpdate);
                    mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
//                Toast.makeText(amenities.this, "Distance: " + getTravelingDistance(currentLocationMarker.getPosition(), marker.getPosition()), Toast.LENGTH_SHORT).show();
                    return true;
                }
            });
            mMap.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {

                @Override
                public View getInfoWindow(Marker arg0) {
                    return null;
                }

                @Override
                public View getInfoContents(Marker marker) {
                    LinearLayout markerInfo = new LinearLayout(getApplicationContext());
                    markerInfo.setOrientation(LinearLayout.VERTICAL);
                    TextView tv_title = new TextView(getApplicationContext());
                    TextView tv_snippet = new TextView(getApplicationContext());
                    tv_title.setTextColor(Color.BLACK);
                    tv_title.setGravity(Gravity.CENTER);
                    tv_title.setTypeface(null, Typeface.BOLD);
                    tv_title.setText(marker.getTitle());
                    markerInfo.addView(tv_title);
                    tv_snippet.setTextColor(Color.GRAY);
                    tv_snippet.setText("\n" + marker.getSnippet());
                    tv_snippet.setGravity(Gravity.CENTER);
                    markerInfo.addView(tv_snippet);
                    return markerInfo;
                }
            });
//        new Thread(new Runnable() {
//            public void run() {
//            }
//        }).start();
//        mMap.setOnMarkerClickListener(clusterManager);
            mMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(this, R.raw.style_json));
//        mMap.setMapType(com.google.android.gms.maps.GoogleMap.MAP_TYPE_SATELLITE);
        } catch (Exception e) {
            Log.e("TAG", e.getMessage());
        }
    }


    private void getCurrLoc() {
        mLocationClient.getLastLocation().addOnCompleteListener(new OnCompleteListener<Location>() {
            @Override
            public void onComplete(@NonNull Task<Location> task) {
                Location location = task.getResult();
                if (location != null) {
                    lng = location.getLongitude();
                    lat = location.getLatitude();
                    currentLocationLat = location.getLatitude();
                    currentLocationLng = location.getLongitude();
                    gotoLocation(location.getLatitude(), location.getLongitude(), location);
                    new Thread(new Runnable() {
                        public void run() {
                            fillArrayLists();
                        }
                    }).start();
                } else {
//                    Toast.makeText(amenities.this, "No location provided", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onConnected(Bundle bundle) {

    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(ConnectionResult connecttionResult) {

    }

    private boolean isGooglePlayServicesAvailable() {
        int status = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);
        if (ConnectionResult.SUCCESS == status) {
            return true;
        } else {
            GooglePlayServicesUtil.getErrorDialog(status, this, 0).show();
            return false;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == GPS_REQUEST_CODE) {
            LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
            boolean providerEnabled = locationManager.isProviderEnabled(locationManager.GPS_PROVIDER);
            if (providerEnabled) {
                Toast.makeText(this, "GPS is enable", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "GPS is not enable", Toast.LENGTH_SHORT).show();
            }
        }
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

    public void gotoToilet(View view) {
        Intent intent = new Intent(amenities.this, feedback_toilet.class);
        global glob = (global) getApplicationContext();
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Radius");
        alert.setMessage("Please the enter the radius for search");
        final EditText input = new EditText(this);
        alert.setView(input);
        alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                String latitude = "";
                String longitude = "";
                int radius = 500;
                String value = input.getText().toString();
                try {
                    radius = Integer.parseInt(value);
                } catch (Exception e) {
                    radius = 500;
                }
                String url = glob.ip_port + "/api/gototoilet?token=" + getToken() + "&lat=" + lat + "&lng=" + lng + "&radius=" + radius;
                try {
                    JSONObject json = MainActivity.readJsonFromUrl(url);
                    String msg = json.getString("message");
                    latitude = json.getString("lat");
                    longitude = json.getString("lng");
                    if (msg.equals("success") && !latitude.equals("")) {
                        intent.putExtra("lat", latitude);
                        intent.putExtra("lng", longitude);
                        intent.putExtra("src_lat", currentLocationLat);
                        intent.putExtra("src_lng", currentLocationLng);
                        startActivity(intent);
                        CustomIntent.customType(amenities.this, "fadein-to-fadeout");
                        finish();
                    } else {
                        Toast.makeText(amenities.this, "There is no close facility.", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    Toast.makeText(amenities.this, "There is no close facility.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        alert.setCancelable(false);
        alert.show();
    }

    public void gotoWater(View view) {
        Intent intent = new Intent(amenities.this, feedback_water.class);
        global glob = (global) getApplicationContext();
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Radius");
        alert.setMessage("Please the enter the radius for search");
        final EditText input = new EditText(this);
        alert.setView(input);
        alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                String latitude = "";
                String longitude = "";
                int radius = 500;
                String value = input.getText().toString();
                try {
                    radius = Integer.parseInt(value);
                } catch (Exception e) {
                    radius = 500;
                }
                String url = glob.ip_port + "/api/gotowater?token=" + getToken() + "&lat=" + lat + "&lng=" + lng + "&radius=" + radius;
                try {
                    JSONObject json = MainActivity.readJsonFromUrl(url);
                    String msg = json.getString("message");
                    latitude = json.getString("lat");
                    longitude = json.getString("lng");
                    if (msg.equals("success") && !latitude.equals("")) {
                        intent.putExtra("lat", latitude);
                        intent.putExtra("lng", longitude);
                        intent.putExtra("src_lat", currentLocationLat);
                        intent.putExtra("src_lng", currentLocationLng);
                        startActivity(intent);
                        CustomIntent.customType(amenities.this, "right-to-left");
                        finish();
                    } else {
                        Toast.makeText(amenities.this, "There is no close facility.", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    Toast.makeText(amenities.this, "There is no close facility.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        alert.setCancelable(false);
        alert.show();
    }

    public void gotoBench(View view) {
        Intent intent = new Intent(amenities.this, feedback_bench.class);
        global glob = (global) getApplicationContext();
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Radius");
        alert.setMessage("Please the enter the radius for search");
        final EditText input = new EditText(this);
        alert.setView(input);
        alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                String latitude = "";
                String longitude = "";
                int radius = 500;
                String value = input.getText().toString();
                try {
                    radius = Integer.parseInt(value);
                } catch (Exception e) {
                    radius = 500;
                }
                String url = glob.ip_port + "/api/gotobench?token=" + getToken() + "&lat=" + lat + "&lng=" + lng + "&radius=" + radius;
                try {
                    JSONObject json = MainActivity.readJsonFromUrl(url);
                    String msg = json.getString("message");
                    latitude = json.getString("lat");
                    longitude = json.getString("lng");
                    if (msg.equals("success") && !latitude.equals("")) {
                        intent.putExtra("lat", latitude);
                        intent.putExtra("lng", longitude);
                        intent.putExtra("src_lat", currentLocationLat);
                        intent.putExtra("src_lng", currentLocationLng);
                        startActivity(intent);
                        CustomIntent.customType(amenities.this, "up-to-bottom");
                        finish();
                    } else {
                        Toast.makeText(amenities.this, "There is no close facility.", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    Toast.makeText(amenities.this, "There is no close facility.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        alert.setCancelable(false);
        alert.show();
    }

    public void skip(View view) {
        Intent intent = new Intent(amenities.this, MainActivity.class);
        startActivity(intent);
        CustomIntent.customType(this, "bottom-to-up");
        finish();
    }

    public void help(View view) {
//        AlertDialog.Builder alert = new AlertDialog.Builder(this);
//        alert.setTitle("Help");
//        String helpText = "\nThe circular button to the top left moves you back to the Dashboard.\n\n";
//        helpText += "Through the 3 checkboxes to right top of the page, you can have the pinpoint of the different amenities in the city of Calgary.\n\n";
//        helpText += "With Zoom In/Out control to the left bottom of the page, you can get the different zooming view of the map.\n\n";
//        helpText += "With the use of the circular animated button on the bottom right you can will be directed to the best wash room, water fountain, and bench with in the radius you chosen.\n";
//        alert.setMessage(helpText);
//        alert.setPositiveButton("OK", null);
//        AlertDialog dialog = alert.create();
//        dialog.show();
        Balloon balloon1 = new Balloon.Builder(this)
                .setArrowSize(45)
                .setArrowOrientation(ArrowOrientation.TOP)
                .setArrowPositionRules(ArrowPositionRules.ALIGN_ANCHOR)
                .setArrowPosition(0.5f)
                .setWidth(BalloonSizeSpec.WRAP)
                .setHeight(BalloonSizeSpec.WRAP)
                .setTextSize(17f)
                .setElevation(6)
                .setCornerRadius(4f)
                .setAlpha(0.7f)
                .setText("<br>You can choose different types of amenities withing the radius of your choice in the city, toilets, drinking fountains, and benches, through clicking on this button.<br><br><b>Press these boxes to move forwards.<b><br>")
                .setTextColor(ContextCompat.getColor(this, R.color.white))
                .setTextIsHtml(true)
                .setBackgroundColor(ContextCompat.getColor(this, R.color.blue1))
                .setBalloonAnimation(BalloonAnimation.FADE)
                .setLifecycleOwner(this)
                .build();
        balloon1.showAlignBottom(findViewById(R.id.fab_amenities));
        balloon1.setOnBalloonClickListener(new OnBalloonClickListener() {
            @Override
            public void onBalloonClick(View view) {
                balloon1.dismiss();
                Balloon balloon2 = new Balloon.Builder(amenities.this)
                        .setArrowSize(15)
                        .setArrowOrientation(ArrowOrientation.BOTTOM)
                        .setArrowPositionRules(ArrowPositionRules.ALIGN_ANCHOR)
                        .setArrowPosition(0.3f)
                        .setWidth(BalloonSizeSpec.WRAP)
                        .setHeight(BalloonSizeSpec.WRAP)
                        .setTextSize(17f)
                        .setElevation(6)
                        .setCornerRadius(4f)
                        .setAlpha(0.8f)
                        .setText("<br>Upon clicking on any of the amenities types you can see the on the map.<br>Once you click on any of the pin-points on the map you can see the travel distance and travel time for it.<br>")
                        .setTextColor(ContextCompat.getColor(amenities.this, R.color.white))
                        .setTextIsHtml(true)
                        .setBackgroundColor(ContextCompat.getColor(amenities.this, R.color.blue))
                        .setBalloonAnimation(BalloonAnimation.FADE)
                        .setLifecycleOwner(amenities.this)
                        .build();
                balloon2.showAlignTop(findViewById(R.id.resttoom_checkBox));
                balloon2.setOnBalloonClickListener(new OnBalloonClickListener() {
                    @Override
                    public void onBalloonClick(View view) {
                        balloon2.dismiss();
                        Balloon balloon3 = new Balloon.Builder(amenities.this)
                                .setArrowSize(30)
                                .setArrowOrientation(ArrowOrientation.TOP)
                                .setArrowPositionRules(ArrowPositionRules.ALIGN_BALLOON)
                                .setArrowPosition(0.5f)
                                .setWidth(250)
                                .setHeight(BalloonSizeSpec.WRAP)
                                .setElevation(16)
                                .setTextSize(17f)
                                .setCornerRadius(4f)
                                .setAlpha(0.8f)
                                .setText("<br>By pressing this button only the values you intend to change will be changed.<br>")
                                .setTextColor(ContextCompat.getColor(amenities.this, R.color.white))
                                .setTextIsHtml(true)
                                .setBackgroundColor(ContextCompat.getColor(amenities.this, R.color.royal_blue))
                                .setBalloonAnimation(BalloonAnimation.FADE)
                                .setLifecycleOwner(amenities.this)
                                .build();
                        balloon3.showAtCenter(findViewById(R.id.mapf_amenities));
                        balloon3.setOnBalloonClickListener(new OnBalloonClickListener() {
                            @Override
                            public void onBalloonClick(View view) {
                                balloon3.dismiss();
                                Balloon balloon4 = new Balloon.Builder(amenities.this)
                                        .setArrowSize(30)
                                        .setArrowOrientation(ArrowOrientation.TOP)
                                        .setArrowPositionRules(ArrowPositionRules.ALIGN_BALLOON)
                                        .setArrowPosition(0.18f)
                                        .setWidth(250)
                                        .setHeight(BalloonSizeSpec.WRAP)
                                        .setElevation(16)
                                        .setTextSize(17f)
                                        .setCornerRadius(4f)
                                        .setAlpha(0.7f)
                                        .setText("<br>Using these checkboxes you can choose different types of views for the map.<br>")
                                        .setTextColor(ContextCompat.getColor(amenities.this, R.color.white))
                                        .setTextIsHtml(true)
                                        .setBackgroundColor(ContextCompat.getColor(amenities.this, R.color.blue))
                                        .setBalloonAnimation(BalloonAnimation.FADE)
                                        .setLifecycleOwner(amenities.this)
                                        .build();
                                balloon4.showAlignBottom(findViewById(R.id.cb_satellite));
                                balloon4.setOnBalloonClickListener(new OnBalloonClickListener() {
                                    @Override
                                    public void onBalloonClick(View view) {
                                        balloon4.dismiss();
                                        Balloon balloon4 = new Balloon.Builder(amenities.this)
                                                .setArrowSize(30)
                                                .setArrowOrientation(ArrowOrientation.TOP)
                                                .setArrowPositionRules(ArrowPositionRules.ALIGN_BALLOON)
                                                .setArrowPosition(0.18f)
                                                .setWidth(250)
                                                .setHeight(BalloonSizeSpec.WRAP)
                                                .setElevation(16)
                                                .setTextSize(17f)
                                                .setCornerRadius(4f)
                                                .setAlpha(0.8f)
                                                .setText("<br>By clicking on this button you can return to the dashboard.<br>")
                                                .setTextColor(ContextCompat.getColor(amenities.this, R.color.white))
                                                .setTextIsHtml(true)
                                                .setBackgroundColor(ContextCompat.getColor(amenities.this, R.color.sky_blue))
                                                .setBalloonAnimation(BalloonAnimation.FADE)
                                                .setLifecycleOwner(amenities.this)
                                                .build();
                                        balloon4.showAlignBottom(findViewById(R.id.fab_skip));
                                        balloon4.setOnBalloonClickListener(new OnBalloonClickListener() {
                                            @Override
                                            public void onBalloonClick(View view) {
                                                balloon4.dismiss();
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

    public void onBalloonClickListener(View view) {

    }

    public static JSONArray readJsonFromUrl(String link) {
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
                Log.e("TAG", e.getMessage());

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

    public void fillArrayLists() {
        String url = "https://data.calgary.ca/resource/jjkg-kv4n.json?asset_type=WASHROOM";
        JSONArray json = readJsonFromUrl(url);
        for (int i = 0; i < json.length(); i++) {
            try {
                double lng = json.getJSONObject(i).optDouble("longitude", 0);
                double lat = json.getJSONObject(i).optDouble("latitude", 0);
                LatLng loc = new LatLng(lat, lng);
                Location src = new Location("");
                src.setLatitude(currentLocationLat);
                src.setLongitude(currentLocationLng);
                Location dst = new Location("");
                dst.setLatitude(lat);
                dst.setLongitude(lng);
                String snippet = getTravelingDistance(new LatLng(currentLocationLat, currentLocationLng), loc);
                MarkerOptions mo = new MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)).position(loc).title("Wash Room").snippet(snippet);
                toilets_markeroption.add(mo);
                Marker marker = mMap.addMarker(mo);
                marker.setVisible(false);
                toilets_marker.add(marker);
            } catch (Exception e) {
                Log.i("TAG", e.getMessage());

            }
        }

        amenities.this.runOnUiThread(new Runnable() {
            public void run() {
                for (int i = 0; i < toilets_markeroption.size(); i++) {
                    Marker marker = mMap.addMarker(toilets_markeroption.get(i));
                    marker.setVisible(false);
                    toilets_marker.add(marker);
                }
                toilet.setEnabled(true);
            }
        });

        url = "https://data.calgary.ca/resource/jjkg-kv4n.json?asset_type=DRINKING FOUNTAIN";
        json = readJsonFromUrl(url);
        for (int i = 0; i < json.length(); i++) {
            double lng = 0;
            double lat = 0;
            try {
                lng = json.getJSONObject(i).optDouble("longitude", 0);
                lat = json.getJSONObject(i).optDouble("latitude", 0);
                LatLng loc = new LatLng(lat, lng);
                Location src = new Location("");
                src.setLatitude(currentLocationLat);
                src.setLongitude(currentLocationLng);
                Location dst = new Location("");
                dst.setLatitude(lat);
                dst.setLongitude(lng);
                String snippet = getTravelingDistance(new LatLng(currentLocationLat, currentLocationLng), loc);
                MarkerOptions mo = new MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)).position(loc).title("Drinking Fountain").snippet(snippet);
                waters_markeroption.add(mo);
            } catch (Exception e) {

            }
        }

        amenities.this.runOnUiThread(new Runnable() {
            public void run() {
                for (int i = 0; i < waters_markeroption.size(); i++) {
                    Marker marker = mMap.addMarker(waters_markeroption.get(i));
                    marker.setVisible(false);
                    waters_marker.add(marker);
                }
                water.setEnabled(true);
            }
        });

        url = "https://data.calgary.ca/resource/ikeb-n5bc.json";
        json = readJsonFromUrl(url);
        for (int i = 0; i < json.length(); i++) {
            try {
                double lng = json.getJSONObject(i).optDouble("longitude", 0);
                double lat = json.getJSONObject(i).optDouble("latitude", 0);
                LatLng loc = new LatLng(lat, lng);
                Location src = new Location("");
                src.setLatitude(currentLocationLat);
                src.setLongitude(currentLocationLng);
                Location dst = new Location("");
                dst.setLatitude(lat);
                dst.setLongitude(lng);
                String snippet = getTravelingDistance(new LatLng(currentLocationLat, currentLocationLng), loc);
                MarkerOptions mo = new MarkerOptions().icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)).position(loc).title("Bench").snippet(snippet);
                benchs_markeroption.add(mo);
            } catch (Exception e) {
                Log.e("TAG", e.getMessage());
            }
        }

        amenities.this.runOnUiThread(new Runnable() {
            public void run() {
                for (int i = 0; i < benchs_markeroption.size(); i++) {
                    Marker marker = mMap.addMarker(benchs_markeroption.get(i));
                    marker.setVisible(false);
                    benchs_marker.add(marker);
                }
                bench.setEnabled(true);
            }
        });
//        ArrayList<MarkerOptions> toilets_marker = new ArrayList<MarkerOptions>();
//        ArrayList<MarkerOptions> waters_marker = new ArrayList<MarkerOptions>();
//        ArrayList<MarkerOptions> benchs_marker = new ArrayList<MarkerOptions>();
    }

    public String getSnippetString(Location src, Location dst) {
        return "Distance in meter: " + String.valueOf(src.distanceTo(dst));
//        try {
//            String url = "https://maps.googleapis.com/maps/api/distancematrix/json?origins=" + src.getLatitude() + "," + src.getLongitude() + "&destinations=" + dst.getLatitude() + "," + dst.getLongitude() + "&sensor=false&units=metric&mode=bicycling&key=AIzaSyDi59Ocp7lnp1lZD4ufqiGmhGuUWiYk2bU";
//            JSONObject jsonObj = MainActivity.readJsonFromUrl(url);
//            JSONObject distanceJSON = jsonObj
//                    .getJSONArray("rows")
//                    .getJSONObject(0)
//                    .getJSONArray("elements")
//                    .getJSONObject(0)
//                    .getJSONObject("distance");
//            Log.v("Direction Distance", distanceJSON.get("text").toString());
//            return distanceJSON.get("text").toString();
//        } catch (Exception e) {
//            Log.v("Direction Problem", e.getMessage());
//        }
//        return "";
    }

    public String getTravelingDistance(LatLng src, LatLng dst) {
        try {
            String url = "https://maps.googleapis.com/maps/api/distancematrix/json?origins=" + src.latitude + "%2C" + src.longitude + "&destinations=" + dst.latitude + "%2C" + dst.longitude + "&departure_time=now&mode=bicycling&key=AIzaSyDi59Ocp7lnp1lZD4ufqiGmhGuUWiYk2bU";
//            Log.d("Direction Urls", url);
            JSONObject jsonObj = MainActivity.readJsonFromUrl(url);
            JSONObject distanceJSON = jsonObj
                    .getJSONArray("rows")
                    .getJSONObject(0)
                    .getJSONArray("elements")
                    .getJSONObject(0)
                    .getJSONObject("distance");
            JSONObject timeJSON = jsonObj
                    .getJSONArray("rows")
                    .getJSONObject(0)
                    .getJSONArray("elements")
                    .getJSONObject(0)
                    .getJSONObject("duration");
            return "Traveling Distance: " + distanceJSON.get("text").toString() + "\nEstimated Traveling Time: " + timeJSON.get("text").toString();
        } catch (Exception e) {
//            Log.e("Direction Problem", e.getMessage());
        }
        return "";
    }

    public String getUrlString(LatLng src, LatLng dst) {
        String src_str = "origin=" + src.latitude + "," + src.longitude;
        String dst_str = "destination=" + dst.latitude + "," + dst.longitude;
        String params = src_str + "&" + dst_str + "&" + "mode=bicycling";
        String url = "https://maps.googleapis.com/maps/api/directions/json?" + params + "&key=AIzaSyDi59Ocp7lnp1lZD4ufqiGmhGuUWiYk2bU";
        return url;
    }

    //Inspired by : https://stackoverflow.com/questions/28295199/android-how-to-show-route-between-markers-on-googlemaps

    public String downloadUrl(String strUrl) throws IOException {
        String data = "";
        InputStream iStream = null;
        HttpURLConnection urlConnection = null;
        try {
            URL url = new URL(strUrl);
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.connect();
            iStream = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(iStream));
            StringBuffer sb = new StringBuffer();
            String line = "";
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            data = sb.toString();
            br.close();
        } catch (Exception e) {

        } finally {
            iStream.close();
            urlConnection.disconnect();
        }
        return data;
    }
    //Inspired by : https://stackoverflow.com/questions/28295199/android-how-to-show-route-between-markers-on-googlemaps

    public class DownloadTask extends AsyncTask<String, Void, String> {
        @Override
        public String doInBackground(String... url) {
            String data = "";
            try {
                data = downloadUrl(url[0]);
            } catch (Exception e) {

            }
            return data;
        }

        @Override
        public void onPostExecute(String result) {
            super.onPostExecute(result);
            ParserTask parserTask = new ParserTask();
            parserTask.execute(result);
        }
    }

    //Inspired by : https://stackoverflow.com/questions/28295199/android-how-to-show-route-between-markers-on-googlemaps
    public class ParserTask extends AsyncTask<String, Integer, List<List<HashMap<String, String>>>> {
        @Override
        protected List<List<HashMap<String, String>>> doInBackground(String... jsonData) {
            JSONObject jObject;
            List<List<HashMap<String, String>>> routes = null;
            try {
                jObject = new JSONObject(jsonData[0]);
                jsonParser parser = new jsonParser();
                routes = parser.parse(jObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return routes;
        }

        //Inspired by : https://stackoverflow.com/questions/28295199/android-how-to-show-route-between-markers-on-googlemaps
        @Override
        public void onPostExecute(List<List<HashMap<String, String>>> result) {
            try {
                ArrayList<LatLng> points = null;
                PolylineOptions lineOptions = null;
                if (polyline != null)
                    polyline.remove();
                for (int i = 0; i < result.size(); i++) {
                    points = new ArrayList<LatLng>();
                    lineOptions = new PolylineOptions();
                    List<HashMap<String, String>> path = result.get(i);
                    for (int j = 0; j < path.size(); j++) {
                        HashMap<String, String> point = path.get(j);
                        double lat = Double.parseDouble(point.get("lat"));
                        double lng = Double.parseDouble(point.get("lng"));
                        LatLng position = new LatLng(lat, lng);
                        points.add(position);
                    }
                    lineOptions.addAll(points);
                    lineOptions.width(12);
                    lineOptions.color(Color.MAGENTA);
                }
                if (lineOptions != null) {
                    polyline = mMap.addPolyline(lineOptions);
                }
            } catch (Exception e) {
                Log.e("TAG", e.getMessage());
                e.printStackTrace();
            }
        }
    }
}