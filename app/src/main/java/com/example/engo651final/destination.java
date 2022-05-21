package com.example.engo651final;

import android.app.Activity;

import androidx.core.app.ActivityCompat;

import java.lang.Math.*;

import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.PlacesClient;
//import android.widget.AutoCompleteTextView;

import com.google.android.libraries.places.api.model.RectangularBounds;
import com.google.android.libraries.places.widget.AutocompleteActivity;
import com.google.android.libraries.places.widget.AutocompleteSupportFragment;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.PlacesClient;

import com.google.android.libraries.places.api.model.Place;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.view.Gravity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;

import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;

import android.content.res.ColorStateList;

import java.lang.Object;

import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.widget.Autocomplete;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
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
import androidx.core.content.ContextCompat;
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
import com.skydoves.balloon.ArrowOrientation;
import com.skydoves.balloon.ArrowPositionRules;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.BalloonAnimation;
import com.skydoves.balloon.BalloonSizeSpec;
import com.skydoves.balloon.OnBalloonClickListener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import maes.tech.intentanim.CustomIntent;

import android.content.pm.PackageManager;

public class destination extends AppCompatActivity implements OnMapReadyCallback, GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    boolean isPermissionGranted;
    MapView mapView;
    CameraUpdate cameraUpdate;
    private GoogleMap mMap;
    Polyline polyline = null;
    private ActivityAmenityBinding binding;
    FloatingActionButton fab;
    FloatingActionButton fab_skip;
    private FusedLocationProviderClient mLocationClient;
    private int GPS_REQUEST_CODE = 9001;
    Animation to_anim;
    LocationManager locationManager = null;
    Animation rotate_close_anim;
    Animation rotate_open_anim;
    Animation from_anim;
    private boolean clicked = false;
    public double lng = 0;
    public double lat = 0;
    private Geocoder geocoder;
    EditText et_search;
    Marker currentLocationMarker = null;
    Marker selectedLocation = null;
    ClusterItem selectedLocationMarker = null;
    boolean locationPermissionGranted = false;
    ArrayList<MarkerOptions> events = new ArrayList<MarkerOptions>();
    ArrayList<String> eventsDate = new ArrayList<String>();
    ArrayList<String> eventsDisc = new ArrayList<String>();
    ArrayList<String> eventsUri = new ArrayList<String>();
    ArrayList<MarkerOptions> historics = new ArrayList<MarkerOptions>();
    ArrayList<String> historicsImg = new ArrayList<String>();
    ArrayList<String> historicsDisc = new ArrayList<String>();
    ArrayList<MarkerOptions> parks = new ArrayList<MarkerOptions>();
    ArrayList<String> parksInfo = new ArrayList<String>();
    ArrayList<MarkerOptions> bikeparks = new ArrayList<MarkerOptions>();
    ArrayList<String> bikeparksAdd = new ArrayList<String>();
    boolean historicsSelected = false;
    ArrayList<Marker> historicsMarkers = new ArrayList<Marker>();
    boolean eventsSelected = false;
    ArrayList<Marker> eventsMarkers = new ArrayList<Marker>();
    boolean parksSelected = false;
    ArrayList<Marker> parksMarkers = new ArrayList<Marker>();
    boolean bikeparksSelected = false;
    ArrayList<Marker> bikeparksMarkers = new ArrayList<Marker>();

    ArrayList<ClusterMarker> historicsCMarker = new ArrayList<ClusterMarker>();
    ArrayList<ClusterMarker> eventsCMarker = new ArrayList<ClusterMarker>();
    ArrayList<ClusterMarker> parksCMarker = new ArrayList<ClusterMarker>();
    ArrayList<ClusterMarker> bikeparksCMarker = new ArrayList<ClusterMarker>();

    FloatingActionButton fab_bikeparks;
    FloatingActionButton fab_parks;
    FloatingActionButton fab_historics;
    FloatingActionButton fab_events;

    CheckBox cb_terrain = null;
    CheckBox cb_normal = null;
    CheckBox cb_hybrid = null;
    CheckBox cb_satellite = null;
    int PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 2000;


    private ClusterManager<ClusterMarker> clusterManager;

    private void getLocationPermission() {
        try {
            if (ContextCompat.checkSelfPermission(this.getApplicationContext(),
                    android.Manifest.permission.ACCESS_FINE_LOCATION)
                    == PackageManager.PERMISSION_GRANTED) {
                locationPermissionGranted = true;
            } else {

                ActivityCompat.requestPermissions(this,
                        new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION},
                        PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION);
            }
        } catch (Exception e) {
            Log.e("Error", e.getMessage());
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        try {
            locationPermissionGranted = false;
            if (requestCode
                    == PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION) {// If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    locationPermissionGranted = true;
                }
            } else {
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
            }
            initMap();
        } catch (Exception e) {
            Log.e("Error", e.getMessage());

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);
        FloatingActionButton fab_places = findViewById(R.id.fab_places);
        fab_places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAddBottonClicked();
            }
        });
        et_search = findViewById(R.id.et_search);

        cb_terrain = findViewById(R.id.cb_terrain);
        cb_normal = findViewById(R.id.cb_normal);
        cb_hybrid = findViewById(R.id.cb_hybrid);
        cb_satellite = findViewById(R.id.cb_satellite);

        fab_skip = findViewById(R.id.back);


//        et_search.setSingleLine(true);
        try {
//            Intent intent = new Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS, Uri.fromParts("package", getPackageName(), null));
//            startActivity(intent);
            getLocationPermission();
            checkMyPermission();
            initMap();
            GoogleApiClient mGoogleApiClient = new GoogleApiClient.Builder(this)
                    .addConnectionCallbacks(this)
                    .addOnConnectionFailedListener(this)
                    .addApi(LocationServices.API)
                    .build();
            mGoogleApiClient.connect();
            if (!mGoogleApiClient.isConnected()) {
//                Toast.makeText(destination.this, "GoogleApiClient is not connected", Toast.LENGTH_SHORT).show();
            }
            if (!isGooglePlayServicesAvailable()) {
//                Toast.makeText(destination.this, "GooglePlayServices are not available", Toast.LENGTH_SHORT).show();
            }
            mLocationClient = LocationServices.getFusedLocationProviderClient(this);
            getCurrLoc(true);
        } catch (Exception e) {
//            Toast.makeText(destination.this, e.getMessage(), Toast.LENGTH_SHORT).show();
            Log.e("Error", e.getMessage());
        }
        if (!Places.isInitialized()) {
            Places.initialize(getApplicationContext(), "AIzaSyDi59Ocp7lnp1lZD4ufqiGmhGuUWiYk2bU", Locale.CANADA);
        }
        initSearch();
        et_search.setFocusable(false);
        locationManager = (LocationManager) this.getSystemService(this.LOCATION_SERVICE);
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,
                2000,
                10, locationListenerGPS);
        new Thread(new Runnable() {
            public void run() {
                fillArrayLists();
            }
        }).start();
//        fillArrayLists();
        fab_bikeparks = findViewById(R.id.fab_bikeparks);

        fab_parks = findViewById(R.id.fab_parks);

        fab_historics = findViewById(R.id.fab_historics);

        fab_events = findViewById(R.id.fab_events);

        cb_terrain.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {
                            cb_hybrid.setChecked(false);
                            cb_normal.setChecked(false);
                            cb_satellite.setChecked(false);

                            cb_hybrid.setTextColor(ContextCompat.getColor(destination.this, R.color.lavender_blue));
                            cb_normal.setTextColor(ContextCompat.getColor(destination.this, R.color.lavender_blue));
                            cb_satellite.setTextColor(ContextCompat.getColor(destination.this, R.color.lavender_blue));
                            cb_terrain.setTextColor(ContextCompat.getColor(destination.this, R.color.lavender_blue));
                            fab_places.setBackgroundColor(ContextCompat.getColor(destination.this, R.color.blue_a200));
                            fab_skip.setBackgroundColor(ContextCompat.getColor(destination.this, R.color.blue_a200));

                            mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                        } else {

                        }
                    }
                });

        cb_normal.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {
                            cb_hybrid.setChecked(false);
                            cb_terrain.setChecked(false);
                            cb_satellite.setChecked(false);
                            mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

                            cb_hybrid.setTextColor(ContextCompat.getColor(destination.this, R.color.lavender_blue));
                            cb_normal.setTextColor(ContextCompat.getColor(destination.this, R.color.lavender_blue));
                            cb_satellite.setTextColor(ContextCompat.getColor(destination.this, R.color.lavender_blue));
                            cb_terrain.setTextColor(ContextCompat.getColor(destination.this, R.color.lavender_blue));
                            fab_places.setBackgroundColor(ContextCompat.getColor(destination.this, R.color.blue_a200));
                            fab_skip.setBackgroundColor(ContextCompat.getColor(destination.this, R.color.blue_a200));

                        } else {

                        }
                    }
                });

        cb_hybrid.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {
                            cb_normal.setChecked(false);
                            cb_terrain.setChecked(false);
                            cb_satellite.setChecked(false);
                            mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

                            cb_hybrid.setTextColor(ContextCompat.getColor(destination.this, R.color.white));
                            cb_normal.setTextColor(ContextCompat.getColor(destination.this, R.color.white));
                            cb_satellite.setTextColor(ContextCompat.getColor(destination.this, R.color.white));
                            cb_terrain.setTextColor(ContextCompat.getColor(destination.this, R.color.white));
                            fab_places.setBackgroundColor(ContextCompat.getColor(destination.this, R.color.light_grey));
                            fab_skip.setBackgroundColor(ContextCompat.getColor(destination.this, R.color.light_grey));

                        } else {

                        }
                    }
                });

        cb_satellite.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {
                            cb_normal.setChecked(false);
                            cb_terrain.setChecked(false);
                            cb_hybrid.setChecked(false);
                            mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

                            cb_hybrid.setTextColor(ContextCompat.getColor(destination.this, R.color.white));
                            cb_normal.setTextColor(ContextCompat.getColor(destination.this, R.color.white));
                            cb_satellite.setTextColor(ContextCompat.getColor(destination.this, R.color.white));
                            cb_terrain.setTextColor(ContextCompat.getColor(destination.this, R.color.white));
                            fab_places.setBackgroundColor(ContextCompat.getColor(destination.this, R.color.light_grey));
                            fab_skip.setBackgroundColor(ContextCompat.getColor(destination.this, R.color.light_grey));

                        } else {

                        }
                    }
                });

//        EditText et_search = (EditText) findViewById(R.id.et_search);
//        ImageView search = (ImageView) findViewById(R.id.search);
//        et_search.setTranslationX(800);
//        search.setTranslationX(800);
//        et_search.setAlpha(0);
//        search.setAlpha(0);
//        et_search.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
//        search.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
//        setUpClusterer();
    }

    private void initSearch() {
//        et_search.setOnEditorActionListener(new TextView.OnEditorActionListener() {
//            @Override
//            public boolean onEditorAction(TextView textView, int actionId, KeyEvent keyEvent) {
//                if (actionId == EditorInfo.IME_ACTION_SEARCH ||
//                        actionId == EditorInfo.IME_ACTION_DONE ||
//                        keyEvent.getAction() == KeyEvent.ACTION_DOWN ||
//                        keyEvent.getAction() == KeyEvent.KEYCODE_ENTER) {
//                    geoLocate();
//                }
//                return false;
//            }
//        });
        AutocompleteSupportFragment autocompleteFragment = (AutocompleteSupportFragment)
                getSupportFragmentManager().findFragmentById(R.id.autocomplete_fragment);

        // Specify the types of place data to return.
        autocompleteFragment.setPlaceFields(Arrays.asList(Place.Field.ID, Place.Field.NAME));

        // Set up a PlaceSelectionListener to handle the response.
        autocompleteFragment.setOnPlaceSelectedListener(new PlaceSelectionListener() {
            @Override
            public void onPlaceSelected(@NonNull Place place) {
//                 TODO: Get info about the selected place.
//                geoLocate();
//                gotoAddess(place.getLatLng());
                Toast.makeText(destination.this, "Place: " + place.getName(), Toast.LENGTH_SHORT).show();
//                Log.i("TAG", "Place: " + place.getName() + ", " + place.getId());
            }


            @Override
            public void onError(@NonNull Status status) {
                // TODO: Handle the error.
                Log.i("TAG", "An error occurred: " + status);
            }
        });
        et_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int AUTOCOMPLETE_REQUEST_CODE = 1;
                // Set the fields to specify which types of place data to
                // return after the user has made a selection.
                List<Place.Field> fields = Arrays.asList(Place.Field.ID, Place.Field.NAME);
                double[] bound = getBoundsFromLatLng(15, 51.0447f, -114.0719f);
                RectangularBounds bounds = RectangularBounds.newInstance(
                        new LatLng(bound[0], bound[1]),
                        new LatLng(bound[2], bound[3]));
                // Start the autocomplete intent.
                Intent intent = new Autocomplete.IntentBuilder(AutocompleteActivityMode.OVERLAY, fields)
                        .setLocationBias(bounds)
                        .build(destination.this);
                startActivityForResult(intent, AUTOCOMPLETE_REQUEST_CODE);

            }
        });
    }

    private double[] getBoundsFromLatLng(double radius, double lat, double lng) {
        double lat_change = radius / 111.2;
        double lon_change = Math.abs(Math.cos(lat * (Math.PI / 180)));
        double lat_min = lat - lat_change;
        double lon_min = lng - lon_change;
        double lat_max = lat + lat_change;
        double lon_max = lng + lon_change;
        double[] res = {lat_min, lon_min, lat_max, lon_max};
        return res;
    }

    private void gotoAddess(LatLng latLng) {
        cameraUpdate = CameraUpdateFactory.newLatLngZoom(latLng, 14);
        mMap.moveCamera(cameraUpdate);
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        if (selectedLocation != null)
            selectedLocation.remove();
        Bitmap icon = BitmapFactory.decodeResource(getApplicationContext().getResources(),
                R.drawable.blue_flag);
        selectedLocation = mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(icon)).position(latLng).title("Your selected location!"));
    }

    private void geoLocate() {
        String searchString = et_search.getText().toString();
        geocoder = new Geocoder(destination.this);
        List<Address> addressList = new ArrayList<>();
        try {
            addressList = geocoder.getFromLocationName(searchString, 1);
        } catch (Exception e) {

        }
        if (addressList.size() > 0) {
            Address address = addressList.get(0);
            LatLng latLng = new LatLng(address.getLatitude(), address.getLongitude());
            cameraUpdate = CameraUpdateFactory.newLatLngZoom(latLng, 14);
            mMap.moveCamera(cameraUpdate);
            mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
            LatLng selectedLoc = new LatLng(address.getLatitude(), address.getLongitude());
            mMap.addMarker(new MarkerOptions().position(selectedLoc).title("Your selected location!"));
        }
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
//        Marker currentLocationMarker;
//        Marker selectedLocationMarker;
//        ArrayList<Marker> events = new ArrayList<Marker>();
//        boolean eventsSelected = false;
//        ArrayList<Marker> historics = new ArrayList<Marker>();
//        ArrayList<String> historicsImg = new ArrayList<String>();
//        ArrayList<String> historicsDisc = new ArrayList<String>();
//        boolean historicsSelected = false;
//        ArrayList<Marker> parks = new ArrayList<Marker>();
//        boolean parksSelected = false;
//        ArrayList<Marker> bikeparks = new ArrayList<Marker>();
//        boolean bikeparksSelected = false;
        String url = "https://data.calgary.ca/resource/99yf-6c5u.json";
        JSONArray json = readJsonFromUrl(url);
        for (int i = 0; i < json.length(); i++) {
            try {
                String title = json.getJSONObject(i).optString("name", "");
                String pic_url = json.getJSONObject(i).optString("pic_url", "");
                String disc = json.getJSONObject(i).optString("significance_summ", "");
                double lng = json.getJSONObject(i).getJSONObject("point").getJSONArray("coordinates").getDouble(0);
                double lat = json.getJSONObject(i).getJSONObject("point").getJSONArray("coordinates").getDouble(1);
                Bitmap icon = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.icons8_museum);
                LatLng loc = new LatLng(lat, lng);
                MarkerOptions mo = new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(icon)).position(loc).title(title);
                historics.add(mo);
                historicsDisc.add(disc);
                historicsImg.add(pic_url);
            } catch (Exception e) {
                Log.e(e.getStackTrace().toString(), e.getMessage().toString());
            }
        }

        url = "https://data.calgary.ca/resource/n625-9k5x.json";
        json = readJsonFromUrl(url);
        for (int i = 0; i < json.length(); i++) {
            try {
//                ArrayList<Marker> events = new ArrayList<Marker>();
//                ArrayList<String> eventsDate = new ArrayList<String>();
//                ArrayList<String> eventsDisc = new ArrayList<String>();
//                ArrayList<String> eventsUri = new ArrayList<String>();
                String title = json.getJSONObject(i).optString("title", "");
                String info_url = json.getJSONObject(i).optString("more_info_url", "");
                String disc = json.getJSONObject(i).optString("notes", "");
                double lng = json.getJSONObject(i).optDouble("longitude", 0);
                double lat = json.getJSONObject(i).optDouble("latitude", 0);
                String next_date_times = json.getJSONObject(i).optString("next_date_times", "");
                Bitmap icon = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.icons8_event);
                LatLng loc = new LatLng(lat, lng);
                LocalDate currentdate = LocalDate.now();
                String currentDay = String.valueOf(currentdate.getDayOfMonth());
                String currentMonth = currentdate.getMonth().toString();
                String currentYear = String.valueOf(currentdate.getYear());
                if (next_date_times.toLowerCase().contains(currentMonth.toLowerCase() + " " + currentDay + " " + currentYear)) {
                    MarkerOptions mo = new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(icon)).position(loc).title(title).snippet(next_date_times);
                    events.add(mo);
                    eventsDisc.add(disc);
                    eventsUri.add(info_url);
                    eventsDate.add(next_date_times);
                }
            } catch (Exception e) {
                Log.e(e.getStackTrace().toString(), e.getMessage().toString());
            }
        }

        url = "https://data.calgary.ca/resource/fbvs-aj5g.json";
        json = readJsonFromUrl(url);
        for (int i = 0; i < json.length(); i++) {
            try {
//                ArrayList<Marker> bikeparks = new ArrayList<Marker>();
//                ArrayList<String> bikeparksAdd = new ArrayList<String>();
                String title = json.getJSONObject(i).optString("name", "");
                String address = json.getJSONObject(i).optString("address", "");
                double lng = json.getJSONObject(i).optDouble("longitude", 0);
                double lat = json.getJSONObject(i).optDouble("latitude", 0);
                Bitmap icon = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.icons8_bike_parking);
                LatLng loc = new LatLng(lat, lng);
                MarkerOptions mo = new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(icon)).position(loc).title(title);
                bikeparks.add(mo);
                bikeparksAdd.add(address);
            } catch (Exception e) {
                Log.e(e.getStackTrace().toString(), e.getMessage().toString());
            }
        }

        url = "https://data.calgary.ca/resource/jw79-78tx.json";
        json = readJsonFromUrl(url);
        for (int i = 0; i < json.length(); i++) {
            try {
//                ArrayList<Marker> parks = new ArrayList<Marker>();
//                ArrayList<String> parksAdd = new ArrayList<String>();
                String title = json.getJSONObject(i).optString("name", "");
                String info = json.getJSONObject(i).optString("general_info", "");
                double lng = json.getJSONObject(i).optDouble("longitude", 0);
                double lat = json.getJSONObject(i).optDouble("latitude", 0);
                Bitmap icon = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.icons8_park);
                LatLng loc = new LatLng(lat, lng);
                MarkerOptions mo = new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(icon)).position(loc).title(title);
                parks.add(mo);
                parksInfo.add(info);
            } catch (Exception e) {
                Log.e(e.getStackTrace().toString(), e.getMessage().toString());
            }
        }
        destination.this.runOnUiThread(new Runnable() {
            public void run() {
                FloatingActionButton fab_places = destination.this.findViewById(R.id.fab_places);
                fab_places.setVisibility(View.VISIBLE);
//                Toast.makeText(destination.this, "Data is loaded.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void skip(View view) {
        Intent intent = new Intent(destination.this, MainActivity.class);
        startActivity(intent);
        CustomIntent.customType(this, "fadein-to-fadeout");
        finish();
    }


    LocationListener locationListenerGPS = new LocationListener() {
        @Override
        public void onLocationChanged(android.location.Location location) {
            gotoLocation(location.getLatitude(), location.getLongitude(), location, true);
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

    private void checkMyPermission() {
        Dexter.withContext(this).withPermission(Manifest.permission.ACCESS_FINE_LOCATION).withListener(new PermissionListener() {
            @Override
            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
//                Toast.makeText(destination.this, "Permission Granted", Toast.LENGTH_SHORT).show();
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

    private void initMap() {
        if (isPermissionGranted) {
            if (isGPSenable()) {
                SupportMapFragment supportMapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
                supportMapFragment.getMapAsync(this);
            }
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

    public void gotoLocation(double latitude, double longitude, Location location,
                             boolean home) {
        LatLng latLng = new LatLng(latitude, longitude);
        cameraUpdate = CameraUpdateFactory.newLatLngZoom(latLng, 18);
        mMap.moveCamera(cameraUpdate);
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        if (home) {
            LatLng current = new LatLng(latitude, longitude);
            try {
                Bitmap icon = BitmapFactory.decodeResource(getApplicationContext().getResources(),
                        R.drawable.icon_bicycle);
                String title = "Your current location";
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
                Toast.makeText(destination.this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }

    public String getUrlString(LatLng src, LatLng dst) {
        String src_str = "origin=" + src.latitude + "," + src.longitude;
        String dst_str = "destination=" + dst.latitude + "," + dst.longitude;
        String params = src_str + "&" + dst_str + "&" + "mode=bicycling";
        String url = "https://maps.googleapis.com/maps/api/directions/json?" + params + "&key=";
        return url;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        getCurrLoc(true);
        clusterManager = new ClusterManager<ClusterMarker>(this, mMap);
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setMapToolbarEnabled(false);
        mMap.setOnCameraIdleListener(clusterManager);
        mMap.setOnMarkerClickListener(clusterManager);
        clusterManager.setOnClusterItemClickListener(
                new ClusterManager.OnClusterItemClickListener<ClusterMarker>() {
                    @Override
                    public boolean onClusterItemClick(ClusterMarker clusterMarker) {
//                        String a = ClusterMarker.getTitle();
//                        Toast.makeText(getApplicationContext(), a, Toast.LENGTH_SHORT).show();
//                        Marker m = (Marker)clusterMarker.getItem();
                        final double latitude = clusterMarker.getPosition().latitude;
                        final double longitude = clusterMarker.getPosition().longitude;
                        double currentLocationLat = currentLocationMarker.getPosition().latitude;
                        double currentLocationLng = currentLocationMarker.getPosition().longitude;
                        Toast.makeText(destination.this, getTravelingDistance(new LatLng(currentLocationLat, currentLocationLng), new LatLng(latitude, longitude)), Toast.LENGTH_LONG).show();
                        String url = getUrlString(currentLocationMarker.getPosition(), new LatLng(latitude, longitude));
                        DownloadTask downloadTask = new DownloadTask();
                        downloadTask.execute(url);
                        LatLng latLng = new LatLng(currentLocationLat / 2 + latitude / 2, longitude / 2 + currentLocationLng / 2);
                        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLng(latLng);
                        mMap.moveCamera(cameraUpdate);
                        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                        selectedLocationMarker = clusterMarker;
                        return false;
                    }
                });
        mMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(this, R.raw.style_json));
    }

    public String getTravelingDistance(LatLng src, LatLng dst) {
        try {
            String url = "https://maps.googleapis.com/maps/api/distancematrix/json?origins=" + src.latitude + "%2C" + src.longitude + "&destinations=" + dst.latitude + "%2C" + dst.longitude + "&departure_time=now&mode=bicycling&key=";
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

    private void getCurrLoc(boolean home) {
        mLocationClient.getLastLocation().addOnCompleteListener(new OnCompleteListener<Location>() {
            @Override
            public void onComplete(@NonNull Task<Location> task) {
                Location location = task.getResult();
                if (location != null) {
                    lng = location.getLongitude();
                    lat = location.getLatitude();
                    gotoLocation(location.getLatitude(), location.getLongitude(), location, home);
                } else {
                    Toast.makeText(destination.this, "No location provided", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void setAnimation() {
        to_anim = AnimationUtils.loadAnimation(this, R.anim.to_bottom_anim);
        rotate_close_anim = AnimationUtils.loadAnimation(this, R.anim.rotate_close_anim);
        rotate_open_anim = AnimationUtils.loadAnimation(this, R.anim.rotate_open_anim);
        from_anim = AnimationUtils.loadAnimation(this, R.anim.from_bottom_anim);
        try {
            FloatingActionButton fab_events = findViewById(R.id.fab_events);
            FloatingActionButton fab_historics = findViewById(R.id.fab_historics);
            FloatingActionButton fab_parks = findViewById(R.id.fab_parks);
            FloatingActionButton fab_bikeparks = findViewById(R.id.fab_bikeparks);
            FloatingActionButton fab_places = findViewById(R.id.fab_places);
            if (!clicked) {
                fab_events.setAnimation(from_anim);
                fab_historics.setAnimation(from_anim);
                fab_parks.setAnimation(from_anim);
                fab_bikeparks.setAnimation(from_anim);
                fab_places.setAnimation(rotate_open_anim);
            } else {
                fab_events.setAnimation(to_anim);
                fab_historics.setAnimation(to_anim);
                fab_parks.setAnimation(to_anim);
                fab_bikeparks.setAnimation(to_anim);
                fab_places.setAnimation(rotate_close_anim);
            }
        } catch (Exception e) {
            Toast.makeText(destination.this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void setVisibility() {
        FloatingActionButton fab_events = findViewById(R.id.fab_events);
        FloatingActionButton fab_historics = findViewById(R.id.fab_historics);
        FloatingActionButton fab_parks = findViewById(R.id.fab_parks);
        FloatingActionButton fab_bikeparks = findViewById(R.id.fab_bikeparks);
        FloatingActionButton fab_places = findViewById(R.id.fab_places);
        if (!clicked) {
            fab_events.setVisibility(View.VISIBLE);
            fab_historics.setVisibility(View.VISIBLE);
            fab_parks.setVisibility(View.VISIBLE);
            fab_bikeparks.setVisibility(View.VISIBLE);
        } else {
            fab_events.setVisibility(View.INVISIBLE);
            fab_historics.setVisibility(View.INVISIBLE);
            fab_parks.setVisibility(View.INVISIBLE);
            fab_bikeparks.setVisibility(View.INVISIBLE);
        }
    }

    private void onAddBottonClicked() {
        setAnimation();
        setVisibility();
        clicked = !clicked;
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

        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                Place place = Autocomplete.getPlaceFromIntent(data);
                String Place_ID = place.getId();
                List<Place.Field> placeFields = Arrays.asList(Place.Field.ADDRESS, Place.Field.LAT_LNG);
                FetchPlaceRequest request = FetchPlaceRequest.newInstance(Place_ID, placeFields);
                PlacesClient placesClient = Places.createClient(destination.this);
                placesClient.fetchPlace(request).addOnSuccessListener((response) -> {
                    Place p = response.getPlace();
                    gotoAddess(p.getLatLng());
                    et_search.setText(p.getAddress());
                    Log.i("TAG", "Place found: " + p.getAddress());
                }).addOnFailureListener((exception) -> {
                    Log.e("TAG", "Place not found: " + exception.getMessage());
                });
                Log.i("TAG", "Place: " + place.getName() + ", " + place.getId());
            } else if (resultCode == AutocompleteActivity.RESULT_ERROR) {
                // TODO: Handle the error.
                Status status = Autocomplete.getStatusFromIntent(data);
                Log.i("TAG", status.getStatusMessage());
            } else if (resultCode == RESULT_CANCELED) {
                // The user canceled the operation.
            }
        }
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

    public void search(View view) {
        geoLocate();
    }

    public void removeOldCluster() {
        if (historicsSelected) {
            for (int i = 0; i < historicsCMarker.size(); i++) {
                clusterManager.removeItem(historicsCMarker.get(i));
            }
        } else if (eventsSelected) {
            for (int i = 0; i < eventsCMarker.size(); i++) {
                clusterManager.removeItem(eventsCMarker.get(i));
            }
        } else if (parksSelected) {
            for (int i = 0; i < parksCMarker.size(); i++) {
                clusterManager.removeItem(parksCMarker.get(i));
            }
        } else if (bikeparksSelected) {
            for (int i = 0; i < bikeparksCMarker.size(); i++) {
                clusterManager.removeItem(bikeparksCMarker.get(i));
            }
        }
    }

    //    boolean historicsSelected = false;
//    ArrayList<Marker> historicsMarkers = new ArrayList<Marker>();
//    ArrayList<ClusterMarker> historicsCMarker = new ArrayList<ClusterMarker>();
//    ArrayList<ClusterMarker> eventsCMarker = new ArrayList<ClusterMarker>();
//    ArrayList<ClusterMarker> parksCMarker = new ArrayList<ClusterMarker>();
//    ArrayList<ClusterMarker> bikeparksCMarker = new ArrayList<ClusterMarker>();
    public void historics(View view) {
        fab_bikeparks.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
        fab_parks.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
        fab_events.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
        fab_historics.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorAccent)));
        removeOldCluster();
        LatLng latLng = new LatLng(51.0447, -114.0719);
        cameraUpdate = CameraUpdateFactory.newLatLngZoom(latLng, 11);
        mMap.moveCamera(cameraUpdate);
        clusterManager.clearItems();
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        historicsSelected = true;
        eventsSelected = false;
        parksSelected = false;
        bikeparksSelected = false;
        historicsCMarker = new ArrayList<ClusterMarker>();
        parksCMarker = new ArrayList<ClusterMarker>();
        eventsCMarker = new ArrayList<ClusterMarker>();
        bikeparksCMarker = new ArrayList<ClusterMarker>();
        if (historicsCMarker.size() < 1) {
            for (int i = 0; i < historics.size(); i++) {
                ClusterMarker cm = new ClusterMarker(historics.get(i).getPosition(), historics.get(i).getTitle(), historics.get(i).getSnippet());
                historicsCMarker.add(cm);
                clusterManager.addItem(cm);
            }
        }
        latLng = new LatLng(51.0447, -114.0719);
        cameraUpdate = CameraUpdateFactory.newLatLngZoom(latLng, 10);
        mMap.moveCamera(cameraUpdate);
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
//        if (!historicsSelected) {
//            if (historicsMarkers.size() < 1) {
//                for (int i = 0; i < historics.size(); i++) {
////                    historicsMarkers.add(mMap.addMarker(historics.get(i)));
//                    ClusterMarker cm = new ClusterMarker(historics.get(i).getPosition(), historics.get(i).getTitle(), historics.get(i).getSnippet());
//                    historicsCMarker.add(cm);
//                    clusterManager.addItem(cm);
//                }
//            }
//        } else {
//            for (int i = 0; i < historicsCMarker.size(); i++) {
//                clusterManager.removeItem(historicsCMarker.get(i));
////                Marker m = (Marker) historicsMarkers.get(i);
////                m.remove();
//            }
//            historicsMarkers = new ArrayList<Marker>();
//            historicsCMarker = new ArrayList<ClusterMarker>();
//        }
//        historicsSelected = !historicsSelected;
    }

    //    boolean parksSelected = false;
//    ArrayList<Marker> parksMarkers = new ArrayList<Marker>();
    public void parks(View view) {
        fab_bikeparks.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
        fab_parks.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorAccent)));
        fab_events.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
        fab_historics.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
        removeOldCluster();
        LatLng latLng = new LatLng(51.0447, -114.0719);
        cameraUpdate = CameraUpdateFactory.newLatLngZoom(latLng, 11);
        mMap.moveCamera(cameraUpdate);
        clusterManager.clearItems();
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        historicsSelected = false;
        eventsSelected = false;
        parksSelected = true;
        bikeparksSelected = false;
        historicsCMarker = new ArrayList<ClusterMarker>();
        parksCMarker = new ArrayList<ClusterMarker>();
        eventsCMarker = new ArrayList<ClusterMarker>();
        bikeparksCMarker = new ArrayList<ClusterMarker>();
        for (int i = 0; i < parks.size(); i++) {
            ClusterMarker cm = new ClusterMarker(parks.get(i).getPosition(), parks.get(i).getTitle(), parks.get(i).getSnippet());
            parksCMarker.add(cm);
            clusterManager.addItem(cm);
        }
        latLng = new LatLng(51.0447, -114.0719);
        cameraUpdate = CameraUpdateFactory.newLatLngZoom(latLng, 10);
        mMap.moveCamera(cameraUpdate);
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
//        if (!parksSelected) {
//            if (parksMarkers.size() < 1) {
//                for (int i = 0; i < parks.size(); i++) {
//                    parksMarkers.add(mMap.addMarker(parks.get(i)));
//                }
//            }
//        } else {
//            for (int i = 0; i < parksCMarker.size(); i++) {
//                Marker m = (Marker) parksMarkers.get(i);
//                m.remove();
//            }
//            parksMarkers = new ArrayList<Marker>();
//            parksCMarker = new ArrayList<ClusterMarker>();
//        }
//        parksSelected = !parksSelected;
    }

    //    boolean bikeparksSelected = false;
//    ArrayList<Marker> bikeparksMarkers = new ArrayList<Marker>();
    public void bikeparks(View view) {
        fab_bikeparks.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorAccent)));
        fab_parks.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
        fab_events.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
        fab_historics.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
        removeOldCluster();
        LatLng latLng = new LatLng(51.0447, -114.0719);
        cameraUpdate = CameraUpdateFactory.newLatLngZoom(latLng, 11);
        mMap.moveCamera(cameraUpdate);
        clusterManager.clearItems();
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        historicsSelected = false;
        eventsSelected = false;
        parksSelected = false;
        bikeparksSelected = true;
        historicsCMarker = new ArrayList<ClusterMarker>();
        parksCMarker = new ArrayList<ClusterMarker>();
        eventsCMarker = new ArrayList<ClusterMarker>();
        bikeparksCMarker = new ArrayList<ClusterMarker>();
        for (int i = 0; i < bikeparks.size(); i++) {
            ClusterMarker cm = new ClusterMarker(bikeparks.get(i).getPosition(), bikeparks.get(i).getTitle(), bikeparks.get(i).getSnippet());
            bikeparksCMarker.add(cm);
            clusterManager.addItem(cm);
        }
        latLng = new LatLng(51.0447, -114.0719);
        cameraUpdate = CameraUpdateFactory.newLatLngZoom(latLng, 10);
        mMap.moveCamera(cameraUpdate);
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
//        if (!bikeparksSelected) {
//            if (bikeparksMarkers.size() < 1) {
//                for (int i = 0; i < bikeparks.size(); i++) {
//                    bikeparksMarkers.add(mMap.addMarker(bikeparks.get(i)));
//                }
//            }
//        } else {
//            for (int i = 0; i < bikeparksMarkers.size(); i++) {
//                Marker m = (Marker) bikeparksMarkers.get(i);
//                m.remove();
//            }
//            bikeparksMarkers = new ArrayList<Marker>();
//        }
//        bikeparksSelected = !bikeparksSelected;
    }

    //    boolean eventsSelected = false;
//    ArrayList<Marker> eventsMarkers = new ArrayList<Marker>();
    public void events(View view) {
        fab_bikeparks.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
        fab_parks.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
        fab_events.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorAccent)));
        fab_historics.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
        removeOldCluster();
        clusterManager.clearItems();
        LatLng latLng = new LatLng(51.0447, -114.0719);
        cameraUpdate = CameraUpdateFactory.newLatLngZoom(latLng, 11);
        mMap.moveCamera(cameraUpdate);
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        historicsSelected = false;
        eventsSelected = true;
        parksSelected = false;
        bikeparksSelected = false;
        clusterManager.clearItems();
        historicsCMarker = new ArrayList<ClusterMarker>();
        parksCMarker = new ArrayList<ClusterMarker>();
        eventsCMarker = new ArrayList<ClusterMarker>();
        bikeparksCMarker = new ArrayList<ClusterMarker>();
        if (eventsCMarker.size() < 1) {
            for (int i = 0; i < events.size(); i++) {
                ClusterMarker cm = new ClusterMarker(events.get(i).getPosition(), events.get(i).getTitle(), events.get(i).getSnippet());
                eventsCMarker.add(cm);
                clusterManager.addItem(cm);
            }
        }
        latLng = new LatLng(51.0447, -114.0719);
        cameraUpdate = CameraUpdateFactory.newLatLngZoom(latLng, 10);
        mMap.moveCamera(cameraUpdate);
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
//        if (!eventsSelected) {
//            if (eventsMarkers.size() < 1) {
//                for (int i = 0; i < events.size(); i++) {
//                    eventsMarkers.add(mMap.addMarker(events.get(i)));
//                }
//            }
//        } else {
//            for (int i = 0; i < eventsMarkers.size(); i++) {
//                Marker m = (Marker) eventsMarkers.get(i);
//                m.remove();
//            }
//            eventsMarkers = new ArrayList<Marker>();
//        }
//        eventsSelected = !eventsSelected;
    }

    public void info(View view) {
        if (selectedLocationMarker != null) {
//            ArrayList<String> eventsDate = new ArrayList<String>();
//            ArrayList<String> eventsDisc = new ArrayList<String>();
//            ArrayList<String> eventsUri = new ArrayList<String>();
//            ArrayList<MarkerOptions> historics = new ArrayList<MarkerOptions>();
//            ArrayList<String> historicsImg = new ArrayList<String>();
//            ArrayList<String> historicsDisc = new ArrayList<String>();
//            ArrayList<MarkerOptions> parks = new ArrayList<MarkerOptions>();
//            ArrayList<String> parksInfo = new ArrayList<String>();
//            ArrayList<MarkerOptions> bikeparks = new ArrayList<MarkerOptions>();
//            ArrayList<String> bikeparksAdd = new ArrayList<String>();
            String type = null;
            Intent intent = new Intent(destination.this, feedbacks.class);
            if (historicsSelected) {
                type = "historic";
                intent.putExtra("img", historicsImg.get(historicsCMarker.indexOf(selectedLocationMarker)));
                intent.putExtra("disc", historicsDisc.get(historicsCMarker.indexOf(selectedLocationMarker)));
            } else if (eventsSelected) {
                type = "event";
                intent.putExtra("date", eventsDate.get(eventsCMarker.indexOf(selectedLocationMarker)));
                intent.putExtra("disc", eventsDisc.get(eventsCMarker.indexOf(selectedLocationMarker)));
                intent.putExtra("uri", eventsUri.get(eventsCMarker.indexOf(selectedLocationMarker)));
                intent.putExtra("time", eventsUri.get(eventsCMarker.indexOf(selectedLocationMarker)));
            } else if (parksSelected) {
                type = "park";
                intent.putExtra("info", parksInfo.get(parksCMarker.indexOf(selectedLocationMarker)));
            } else if (bikeparksSelected) {
                type = "bikepark";
                intent.putExtra("add", bikeparksAdd.get(bikeparksCMarker.indexOf(selectedLocationMarker)));
            }
            intent.putExtra("lat", selectedLocationMarker.getPosition().latitude);
            intent.putExtra("lng", selectedLocationMarker.getPosition().longitude);
            intent.putExtra("type", type);
            intent.putExtra("name", selectedLocationMarker.getTitle().replace("#", "").replace("|", ""));
            startActivity(intent);
            CustomIntent.customType(this, "right-to-left");
        }
    }

    public void select(View view) {
        String type = null;
        if (selectedLocationMarker != null) {
            if (historicsSelected) {
                type = "historic";
            } else if (eventsSelected) {
                type = "event";
            } else if (parksSelected) {
                type = "park";
            } else if (bikeparksSelected) {
                type = "bikepark";
            }
            Intent intent = new Intent(destination.this, submit_feedback.class);
            intent.putExtra("lat", selectedLocationMarker.getPosition().latitude);
            intent.putExtra("lng", selectedLocationMarker.getPosition().longitude);
            intent.putExtra("type", type);
            intent.putExtra("name", selectedLocationMarker.getTitle());
            intent.putExtra("token", getToken());
            intent.putExtra("src_lat", currentLocationMarker.getPosition().latitude);
            intent.putExtra("src_lng", currentLocationMarker.getPosition().longitude);
            startActivity(intent);
            CustomIntent.customType(this, "right-to-left");
        }
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
                Log.e("google response",data);
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
            polyline = mMap.addPolyline(lineOptions);
        }
    }

    public void help(View view) {
//        AlertDialog.Builder alert = new AlertDialog.Builder(this);
//        alert.setTitle("Help");
//        String helpText = "\nThe left arrow to the bottom left direct you back to the Dashboard page.\n\n";
//        helpText += "The textbox on the top allows you look for an specific address, landmark, zip code, and place and you can choose you bike-friendly destinations, e.g. bike parks, parking lots for bikes, events in the city of Calgary, and historical places.\n\n";
//        helpText += "Using the circular button to the right bottom, you can see the location of the different types and place of bike-friendly destinations.\n\n";
//        helpText += "After selecting the pinpoint of the destination on the map, you can know more information with the info button on top left.\n\n";
//        helpText += "After selecting the pinpoint of the destination on the map and upon pressing the button on bottom centor, you will be directed to the selected location throught the best route\n";
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
                .setCornerRadius(4f)
                .setAlpha(0.7f)
                .setElevation(10)
                .setText("<br>Upon clicking on any of the buttons in this cluster, on the map you can see different types of bike-friendly destinations, e.g. bike parks, parking lots for bikes, events in the city of Calgary, and historical places.<br><br><b>Press these boxes to move forwards.<b><br>")
                .setTextColor(ContextCompat.getColor(this, R.color.white))
                .setTextIsHtml(true)
                .setBackgroundColor(ContextCompat.getColor(this, R.color.blue1))
                .setBalloonAnimation(BalloonAnimation.FADE)
                .setLifecycleOwner(this)
                .build();
        balloon1.showAlignTop(findViewById(R.id.fab_places));
        balloon1.setOnBalloonClickListener(new OnBalloonClickListener() {
            @Override
            public void onBalloonClick(View view) {
                balloon1.dismiss();
                Balloon balloon2 = new Balloon.Builder(destination.this)
                        .setArrowSize(15)
                        .setArrowOrientation(ArrowOrientation.TOP)
                        .setArrowPositionRules(ArrowPositionRules.ALIGN_ANCHOR)
                        .setArrowPosition(0.5f)
                        .setElevation(10)
                        .setWidth(BalloonSizeSpec.WRAP)
                        .setHeight(BalloonSizeSpec.WRAP)
                        .setTextSize(17f)
                        .setCornerRadius(4f)
                        .setAlpha(0.8f)
                        .setText("<br>After choosing your destination by clicking on the corresponding pin-point, using this button you will be directed to that destination through the best route.<br>")
                        .setTextColor(ContextCompat.getColor(destination.this, R.color.white))
                        .setTextIsHtml(true)
                        .setBackgroundColor(ContextCompat.getColor(destination.this, R.color.blue))
                        .setBalloonAnimation(BalloonAnimation.FADE)
                        .setLifecycleOwner(destination.this)
                        .build();
                balloon2.showAlignTop(findViewById(R.id.fab_select));
                balloon2.setOnBalloonClickListener(new OnBalloonClickListener() {
                    @Override
                    public void onBalloonClick(View view) {
                        balloon2.dismiss();
                        Balloon balloon3 = new Balloon.Builder(destination.this)
                                .setArrowSize(15)
                                .setArrowOrientation(ArrowOrientation.TOP)
                                .setArrowPositionRules(ArrowPositionRules.ALIGN_ANCHOR)
                                .setArrowPosition(0.3f)
                                .setWidth(BalloonSizeSpec.WRAP)
                                .setHeight(BalloonSizeSpec.WRAP)
                                .setTextSize(17f)
                                .setCornerRadius(4f)
                                .setAlpha(0.9f)
                                .setElevation(10)
                                .setText("<br>By clicking on this button you can return to the dashboard.<br>")
                                .setTextColor(ContextCompat.getColor(destination.this, R.color.white))
                                .setTextIsHtml(true)
                                .setBackgroundColor(ContextCompat.getColor(destination.this, R.color.blue_a200))
                                .setBalloonAnimation(BalloonAnimation.FADE)
                                .setLifecycleOwner(destination.this)
                                .build();
                        balloon3.showAlignTop(findViewById(R.id.back));
                        balloon3.setOnBalloonClickListener(new OnBalloonClickListener() {
                            @Override
                            public void onBalloonClick(View view) {
                                balloon3.dismiss();
                                Balloon balloon4 = new Balloon.Builder(destination.this)
                                        .setArrowSize(15)
                                        .setArrowOrientation(ArrowOrientation.BOTTOM)
                                        .setArrowPositionRules(ArrowPositionRules.ALIGN_ANCHOR)
                                        .setArrowPosition(0.7f)
                                        .setWidth(230)
                                        .setHeight(BalloonSizeSpec.WRAP)
                                        .setTextSize(17f)
                                        .setElevation(10)
                                        .setCornerRadius(4f)
                                        .setAlpha(0.7f)
                                        .setText("<br>This user-friendly autocomplete input, allows you to conveniently to look for, landmarks, zip codes, businesses, addresses in the city of Calgary.<br>")
                                        .setTextColor(ContextCompat.getColor(destination.this, R.color.white))
                                        .setTextIsHtml(true)
                                        .setBackgroundColor(ContextCompat.getColor(destination.this, R.color.purple_500))
                                        .setBalloonAnimation(BalloonAnimation.FADE)
                                        .setLifecycleOwner(destination.this)
                                        .build();
                                balloon4.showAlignBottom(findViewById(R.id.et_search));
                                balloon4.setOnBalloonClickListener(new OnBalloonClickListener() {
                                    @Override
                                    public void onBalloonClick(View view) {
                                        balloon4.dismiss();
                                        Balloon balloon5 = new Balloon.Builder(destination.this)
                                                .setArrowSize(25)
                                                .setArrowOrientation(ArrowOrientation.LEFT)
                                                .setArrowPositionRules(ArrowPositionRules.ALIGN_BALLOON)
                                                .setArrowPosition(0.5f)
                                                .setWidth(BalloonSizeSpec.WRAP)
                                                .setHeight(BalloonSizeSpec.WRAP)
                                                .setTextSize(17f)
                                                .setCornerRadius(4f)
                                                .setElevation(10)
                                                .setMarginLeft(55)
                                                .setAlpha(1f)
                                                .setText("<br>Using this button, after clicking on the a pin-point on the map you can see the information related to that destination.<br>")
                                                .setTextColor(ContextCompat.getColor(destination.this, R.color.white))
                                                .setTextIsHtml(true)
                                                .setBackgroundColor(ContextCompat.getColor(destination.this, R.color.royal_blue))
                                                .setBalloonAnimation(BalloonAnimation.FADE)
                                                .setLifecycleOwner(destination.this)
                                                .build();
                                        balloon5.showAlignLeft(findViewById(R.id.fab_info));
                                        balloon5.setOnBalloonClickListener(new OnBalloonClickListener() {
                                            @Override
                                            public void onBalloonClick(View view) {
                                                balloon5.dismiss();
                                                Balloon balloon6 = new Balloon.Builder(destination.this)
                                                        .setArrowSize(25)
                                                        .setArrowOrientation(ArrowOrientation.TOP)
                                                        .setArrowPositionRules(ArrowPositionRules.ALIGN_ANCHOR)
                                                        .setArrowPosition(0.5f)
                                                        .setWidth(BalloonSizeSpec.WRAP)
                                                        .setHeight(BalloonSizeSpec.WRAP)
                                                        .setTextSize(17f)
                                                        .setCornerRadius(4f)
                                                        .setElevation(10)
                                                        .setAlpha(0.9f)
                                                        .setText("<br>When you click on the pin-point of each destination. The Estimated Time of reaching there and the Distance. as well as name of the place will be presented.<br>")
                                                        .setTextColor(ContextCompat.getColor(destination.this, R.color.white))
                                                        .setTextIsHtml(true)
                                                        .setBackgroundColor(ContextCompat.getColor(destination.this, R.color.sky_blue))
                                                        .setBalloonAnimation(BalloonAnimation.FADE)
                                                        .setLifecycleOwner(destination.this)
                                                        .build();
                                                balloon6.showAtCenter(findViewById(R.id.map));
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
}