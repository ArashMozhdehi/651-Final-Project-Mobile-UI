package com.example.engo651final;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import static com.mapbox.core.constants.Constants.PRECISION_6;

import com.mapbox.android.core.location.LocationEngine;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.geojson.Feature;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.style.sources.GeoJsonSource;
import com.mapbox.services.android.location.LostLocationEngine;
import com.mapbox.api.directions.v5.DirectionsCriteria;
import com.mapbox.api.directions.v5.MapboxDirections;
import com.mapbox.api.directions.v5.models.DirectionsResponse;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
//import com.mapbox.android.core.location.LocationEngineListener;
//import com.mapbox.android.core.location.LocationEnginePriority;
//import com.mapbox.android.core.location.LocationEngineProvider;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
//import com.mapbox.maps.MapView;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Toast;

import com.mapbox.api.directions.v5.DirectionsCriteria;
import com.mapbox.api.directions.v5.MapboxDirections;
import com.mapbox.api.directions.v5.models.DirectionsResponse;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.Point;
//import com.mapbox.mapboxandroiddemo.R;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.maps.Style;
import com.mapbox.mapboxsdk.style.layers.CircleLayer;
import com.mapbox.mapboxsdk.style.layers.LineLayer;
import com.mapbox.mapboxsdk.style.layers.Property;
import com.mapbox.mapboxsdk.style.sources.GeoJsonSource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
//import com.mapbox.maps.MapBox;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.mapbox.android.core.location.LocationEngineRequest;
import com.mapbox.api.directions.v5.models.DirectionsResponse;
import com.mapbox.geojson.Point;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.location.LocationComponent;
import com.mapbox.mapboxsdk.location.modes.CameraMode;
import com.mapbox.mapboxsdk.maps.Style;
//import com.mapbox.maps.MapView;
//import com.mapbox.mapboxandroiddemo.R;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
//import com.mapbox.maps.plugin.Plugin;
//import com.mapbox.mapboxsdk.maps.Style;
import androidx.appcompat.app.AppCompatActivity;

import com.mapbox.android.core.permissions.*;
import com.mapbox.services.android.navigation.ui.v5.NavigationLauncher;
import com.mapbox.services.android.navigation.ui.v5.NavigationLauncherOptions;
import com.mapbox.services.android.navigation.ui.v5.NavigationView;
import com.mapbox.services.android.navigation.ui.v5.map.NavigationMapboxMap;
import com.mapbox.services.android.navigation.ui.v5.route.NavigationMapRoute;
import com.mapbox.services.android.navigation.v5.navigation.NavigationRoute;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.Layout;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class mapbox extends AppCompatActivity implements OnMapReadyCallback, MapboxMap.OnMapClickListener, PermissionsListener {
    MapView mapView;
    MapboxMap mapboxMap;
    LocationComponent locationComponent;
    PermissionsManager permissionsManager;
    NavigationMapRoute navigationMaproute;
    String mapbox_access_token = "sk.eyJ1IjoiYW0xOTkwIiwiYSI6ImNsMXMzeWNyNjBubHczbHFxNzlzMG90MHcifQ.f_tYE1axreRgiixOTTy0MA";
    DirectionsRoute currentRoute;
    NavigationMapRoute navigationMapRoute = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Mapbox.getInstance(this, mapbox_access_token);
        setContentView(R.layout.activity_mapbox);
        mapView = (MapView) findViewById(R.id.mapView);
//        mapView.onCreate(savedInstanceState);
//                mapView.("mapbox://styles/spotelf13/ck07kh7g50ds41bmzldaky8a0");

        mapView.getMapAsync(this);
//        mapView.onStart();
//        mapView.onResume();
//        mapboxMap.setStyle("mapbox://styles/spotelf13/ck07kh7g50ds41bmzldaky8a0");
    }

    @Override
    public void onExplanationNeeded(List<String> permissionsToExplain) {

    }

    @Override
    public void onPermissionResult(boolean granted) {
        if (granted) {
            enableLocationCompnent(mapboxMap.getStyle());
        } else {
            Toast.makeText(getApplicationContext(), "Permission not granted", Toast.LENGTH_LONG).show();
            finish();
        }
    }

    @Override
    public boolean onMapClick(@NonNull LatLng point) {
        return false;
    }

    @Override
    public void onMapReady(@NonNull MapboxMap mapboxMap) {
//        return false;
        this.mapboxMap = mapboxMap;
//        mapboxMap.getUiSettings().setZ(true);//hide zoom control button
//        mapboxMap.setZ
        mapboxMap.getUiSettings().setQuickZoomGesturesEnabled(true);
        mapboxMap.getUiSettings().setCompassEnabled(true);//hide compass
        mapboxMap.getUiSettings().setZoomGesturesEnabled(true);
        mapboxMap.getUiSettings().setScrollGesturesEnabled(true);
        mapboxMap.getUiSettings().setAllGesturesEnabled(true);
//        mapboxMap.setCameraPosition(new CameraPosition.Builder());
        this.mapboxMap.setMinZoomPreference(12);
        this.mapboxMap.setMaxZoomPreference(20);
        mapboxMap.setStyle("mapbox://styles/mapbox/navigation-day-v1", new Style.OnStyleLoaded() {
            @Override
            public void onStyleLoaded(@NonNull Style style) {
                enableLocationCompnent(style);
            }
        });

//        LocationEngine locationEngine = new LostLocationEngine(mapbox.this);
//        locationEngine.setPriority(LocationEnginePriority.HIGH_ACCURACY);
//        locationEngine.setInterval(5000);
//        locationEngine.activate();
//        Location lastLocation = locationEngine.getLastLocation();
//        Log.e("Lat: ", lastLocation.getLatitude());
//        Log.e("Lng: ", lastLocation.getLongitude());
        Point origin = Point.fromLngLat(50.985633800094455, -114.03094928665735);
        Point destination = Point.fromLngLat(51.02665248138959, -113.99399626264213);
//        String url = getUrlString();
//        DownloadTask downloadTask = new DownloadTask();
//        downloadTask.execute(url);
        getRoute(origin, destination);
    }

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
//            Log.e("mapbox", result);
//            getRoute(result);
//            ParserTask parserTask = new ParserTask();
//            parserTask.execute(result);
        }
    }

    public String getUrlString() {
        String src_str = "origin=" + "50.985633800094455" + "," + "-114.03094928665735";
        String dst_str = "destination=" + "51.02665248138959" + "," + "-113.99399626264213";
        String params = src_str + "&" + dst_str + "&" + "mode=bicycling";
        String url = "https://maps.googleapis.com/maps/api/directions/json?" + params + "&key=AIzaSyDi59Ocp7lnp1lZD4ufqiGmhGuUWiYk2bU";
        return url;
    }

    public void getRoute(Point origin, Point destination) {
//        JsonDirectionResponse response = null;
//        Gson gson=new Gson();
//        Gson gson = new GsonBuilder().create();
//        response = gson.fromJson(reader, result);
//        DirectionsResponse directionsResponse = DirectionsResponse.fromJson(jsonString);
//        DirectionsRoute curRoute = directionsResponse.routes().get(0);
        NavigationRoute.builder(mapbox.this)
                .accessToken(mapbox_access_token)
                .origin(origin)
                .origin(origin)
                .destination(destination)
                .build().getRoute(new Callback<DirectionsResponse>() {
            @Override
            public void onResponse(Call<DirectionsResponse> call, Response<DirectionsResponse> response) {
                Log.e("Mapbox Response", " got");
                if (response.body() == null) {
                    Log.e("Mapbox Response", "was null");
                    return;
                }
                DirectionsRoute currentRoute = response.body().routes().get(0);
                if (navigationMapRoute != null) {
                    navigationMapRoute.removeRoute();

                } else {
                    navigationMapRoute = new NavigationMapRoute(null, mapView, mapboxMap);
                    navigationMapRoute.addRoute(currentRoute);
                }
                NavigationLauncherOptions options = NavigationLauncherOptions.builder()
                        .directionsRoute(currentRoute)
                        .shouldSimulateRoute(true)
                        .build();
                NavigationLauncher.startNavigation(mapbox.this, options);
            }

            @Override
            public void onFailure(Call<DirectionsResponse> call, Throwable t) {

            }
        });
//        NavigationRoute builder = NavigationRoute.builder(this)
//                .accessToken(getString(R.string.mapbox_access_token))
//                .origin(origin)
//                .destination(destination)
//                .alternatives(true)
//                .build();
//        builder.getRoute(new Callback<DirectionsResponse>() {
//            @Override
//            public void onResponse(Call<DirectionsResponse> call, Response<DirectionsResponse> response) {
//                Log.e("Mapbox Response", " got");
//                if (response.body() == null) {
//                    Log.e("Mapbox Response", "was null");
//                    return;
//                }
//            }
//
//            @Override
//            public void onFailure(Call<DirectionsResponse> call, Throwable t) {
//
//            }
//        });

//        MapboxDirections directionsApiClient = MapboxDirections.builder()
//                .origin(origin)
//                .destination(destination)
//                .overview(DirectionsCriteria.OVERVIEW_FULL)
//                .profile(DirectionsCriteria.PROFILE_CYCLING)
//                .steps(true)
//                .accessToken(getString(R.string.mapbox_access_token))
//                .build();
//        directionsApiClient.enqueueCall(new Callback<DirectionsResponse>() {
//            @Override
//            public void onResponse(Call<DirectionsResponse> call, Response<DirectionsResponse> response) {
//                Log.e( "Response code: %s", String.valueOf(response.code()));
//                if (response.body() == null) {
//                    Log.e("mapbox", "Response body null. Try again later.");
//                    Toast.makeText(mapbox.this,
//                            "getString(R.string.response_body_null)", Toast.LENGTH_SHORT).show();
//                } else if (response.body().routes().size() < 1) {
//                    Log.e("No routes found", String.valueOf(response.code()));
//                    Toast.makeText(mapbox.this,
//                            "getString(R.string.no_routes_found)", Toast.LENGTH_SHORT).show();
//                } else {
//// Get the directions route
//                    if (response.body() != null) {
//// Get the directions route
//                        currentRoute = response.body().routes().get(0);
//                        mapboxMap.getStyle(new Style.OnStyleLoaded() {
//                            @Override
//                            public void onStyleLoaded(@NonNull Style style) {
//// Retrieve the sources from the map
//                                GeoJsonSource circleLayerSource = style.getSourceAs("CIRCLE_GEOJSON_SOURCE_ID");
//                                GeoJsonSource lineLayerSource = style.getSourceAs("LINE_GEOJSON_SOURCE_ID");
//                                if (circleLayerSource != null && response.body() != null) {
//
//                                    List<Feature> featureList = new ArrayList<>();
//
//// Use each step maneuver's location to create a Point Feature.
//// The Feature is then added to the list.
//                                    if (currentRoute.legs().size() > 0) {
//                                        for (LegStep singleRouteLeg : currentRoute.legs().get(0).steps()) {
//                                            Point stepManeuverLocationPoint = singleRouteLeg.maneuver().location();
//                                            featureList.add(Feature.fromGeometry(stepManeuverLocationPoint));
//                                        }
//                                    } else {
////                                        Timber.d(getString(R.string.no_legs_toast));
//                                        Log.e("mapbox", "R.string.no_legs_toast");
//                                    }
//
//// Update the CircleLayer's source with the Feature list.
//                                    circleLayerSource.setGeoJson(FeatureCollection.fromFeatures(featureList));
//
//// Update the LineLayer's source with the Polyline route from the Directions API response.
//                                    if (lineLayerSource != null && currentRoute.geometry() != null) {
//                                        lineLayerSource.setGeoJson(Feature.fromGeometry(LineString.fromPolyline(
//                                                currentRoute.geometry(), PRECISION_6)));
//                                    }
//
//// Ease the camera to fit to the Directions route.
////                                    easeCameraToShowEntireDirectionsRoute(new LatLng(origin.latitude(), origin.longitude()),
////                                            new LatLng(destination.latitude(), destination.longitude()));
//                                }
//                            }
//                        });
//                    }
//                }
//            }
//
//            @Override
//            public void onFailure(Call<DirectionsResponse> call, Throwable throwable) {
////                Timber.e(throwable);
//                Toast.makeText(mapbox.this,
//                        String.format("Error: %s", throwable.getMessage()),
//                        Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    private void enableLocationCompnent(@NonNull Style loadedMapStyle) {
        if (PermissionsManager.areLocationPermissionsGranted(this)) {
            locationComponent = mapboxMap.getLocationComponent();
            locationComponent.activateLocationComponent(this, loadedMapStyle);
            locationComponent.setLocationComponentEnabled(true);
            locationComponent.setCameraMode(CameraMode.TRACKING);
        } else {
            permissionsManager = new PermissionsManager(this);
            permissionsManager.requestLocationPermissions(this);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        permissionsManager.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    public void onStart() {
        super.onStart();
//        mapView.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
//        mapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
//        mapView.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
        mapView.onStop();
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistableBundle) {
        super.onSaveInstanceState(outState, outPersistableBundle);
//        mapView.onSaveInstanceState(outState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }
}