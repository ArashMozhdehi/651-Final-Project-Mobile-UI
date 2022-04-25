package com.example.engo651final;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.net.Uri;

import java.security.MessageDigest;
import java.util.UUID;

import android.app.AlertDialog;

import com.google.android.gms.common.GooglePlayServicesUtil;

import android.app.Dialog;
import android.content.DialogInterface;

import android.graphics.drawable.AnimationDrawable;
import android.location.Geocoder;
import android.util.Log;
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
import android.widget.RelativeLayout;
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
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
//import com.google.android.gms.maps.Animation;
import com.google.android.gms.maps.model.MarkerOptions;

import android.graphics.ImageDecoder;
import android.net.Uri;

import java.io.*;
import java.net.*;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.net.URI;

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
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.UploadTask;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import com.owl93.dpb.CircularProgressView;
import com.skydoves.balloon.ArrowOrientation;
import com.skydoves.balloon.ArrowPositionRules;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.BalloonAnimation;
import com.skydoves.balloon.BalloonSizeSpec;
import com.skydoves.balloon.OnBalloonClickListener;
import com.theartofdev.edmodo.cropper.CropImage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import androidx.constraintlayout.widget.ConstraintLayout;

import de.hdodenhof.circleimageview.CircleImageView;
import maes.tech.intentanim.CustomIntent;

public class settings extends AppCompatActivity {
    ImageView img;
    Button btn;
    int PICK_IMAGE_REQUEST = 22;

    CircleImageView profileImage;
    DatabaseReference databaseReference;
    FirebaseStorage firebaseStorage;
    Uri imageUri = null;
    Uri croppedImageUri = null;
    String profileUri = "";
    StorageTask uploadTask;
    StorageReference storageReference;
    String username = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        img_btn
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        TextView textView = findViewById(R.id.profile_name);
        textView.setText(GetProfile());
        EditText uname_tb = (EditText) findViewById(R.id.weight);
        EditText pass_tb = (EditText) findViewById(R.id.password);
        Button btn = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.submit_btn);
        ImageView bike_pic = (ImageView) findViewById(R.id.bike_pic);
//        bike_pic.setTranslationX(300);
        bike_pic.animate().translationY(0).translationX(400).setDuration(2000).setStartDelay(100).start();

        uname_tb.setTranslationX(800);
        pass_tb.setTranslationX(800);
        btn.setTranslationX(800);
        uname_tb.setAlpha(0);
        pass_tb.setAlpha(0);
        btn.setAlpha(0);

        uname_tb.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        pass_tb.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        btn.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();
//        bike_pic.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();
        ConstraintLayout Layout1 = findViewById(R.id.layout);
//        LinearLayout Layout2 = findViewById(R.id.layout);
//        AnimationDrawable animationDrawable = (AnimationDrawable) Layout1.getBackground();
//        animationDrawable.setEnterFadeDuration(2000);
//        animationDrawable.setExitFadeDuration(4000);
//        animationDrawable.start();
//        firebaseDatabase = FirebaseDatabase.getInstance();
//        databaseReference = FirebaseDatabase.getInstance().getReference().child("users").child(GetUsername());
//        storageReference = FirebaseStorage.getInstance().getReference().child("users").child(GetUsername());
        firebaseStorage = FirebaseStorage.getInstance();
        username = GetUsername().trim();
        storageReference = firebaseStorage.getReference();
        profileImage = findViewById(R.id.settings_profile_img);
        showPrfileImage(profileImage);
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

    public void showPrfileImage(CircleImageView profileImage) {
        String filename = "images/" + getHash(GetUsername()) + ".jpg";
        de.hdodenhof.circleimageview.CircleImageView navProfileImage = (de.hdodenhof.circleimageview.CircleImageView) findViewById(R.id.settings_profile_img);
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
//                Toast.makeText(settings.this, "Error: " + exception.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {
//            CropImage.ActivityResult result = CropImage.getActivityResult(data);
//            imageUri = result.getUri();
//            profileImage.setImageURI(imageUri);
            imageUri = data.getData();
            CropImage.activity(imageUri)
                    .start(settings.this);
        }
        if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE && resultCode == RESULT_OK && data != null) {
            CropImage.ActivityResult result = CropImage.getActivityResult(data);
            croppedImageUri = result.getUri();
            try {
                Bitmap bitmap = MediaStore
                        .Images
                        .Media
                        .getBitmap(
                                getContentResolver(),
                                croppedImageUri);
                profileImage.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        else {
//            Toast.makeText(this, "Error, Try Again.", Toast.LENGTH_SHORT).show();
//        }

    }

    private void updateProfileImage() {
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Updating the profile.");
        progressDialog.setMessage("Please wait while the application is setting you profile.");
        progressDialog.show();
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(username.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            StorageReference fileReference = storageReference.child("images/" + sb.toString() + ".jpg");
            uploadTask = fileReference.putFile(croppedImageUri);
            uploadTask.continueWithTask(new Continuation() {
                @Override
                public Object then(@NonNull Task task) throws Exception {
                    if (!task.isSuccessful()) {
                        Toast.makeText(settings.this, "Uploading was unsuccessful.", Toast.LENGTH_SHORT).show();
                    } else {
                        return fileReference.getDownloadUrl();
                    }
                    return null;
                }
            }).addOnCompleteListener(new OnCompleteListener<Uri>() {
                @Override
                public void onComplete(@NonNull Task task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(settings.this, "The image was successfully uploaded.", Toast.LENGTH_SHORT).show();
//                    Uri downloadUri = task.getResult();
//                    profileUri = downloadUri.toString();
//                    HashMap<String, Object> userMap = new HashMap<>();
//                    userMap.put("image" + profileUri);
                    }
                }
            });
        } catch (Exception e) {

        }
    }

    public void set_photo(View view) {
//        CropImage.activity().setAspectRatio(1, 1).start(settings.this);
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(
                Intent.createChooser(
                        intent,
                        "Select Image from here..."),
                PICK_IMAGE_REQUEST);
//        CropImage.activity()
//                .setGuidelines(CropImageView.Guidelines.ON)
//                .start(settings.this);
//        CropImage.activity(imageUri)
//                .start(settings.this);
//        CropImage.activity()
//                .start(getContext(), this);
    }

    public void submit(View view) {
        EditText textbox = (EditText) findViewById(R.id.password);
        String password = textbox.getText().toString();
        textbox = (EditText) findViewById(R.id.weight);
        String weight = textbox.getText().toString();
        global glob = (global) getApplicationContext();
        if (!password.equals("")) {
            String url = glob.ip_port + "/api/changepassword?password=" + password + "&token=" + getToken();
            try {
                JSONObject json = MainActivity.readJsonFromUrl(url);
                Toast.makeText(settings.this, "The password was successully changed.", Toast.LENGTH_SHORT).show();
            } catch (Exception e) {

            }
        }
        if (!weight.equals("")) {
            String url = glob.ip_port + "/api/changeweight?weight=" + weight + "&token=" + getToken();
            try {
                JSONObject json = MainActivity.readJsonFromUrl(url);
                Toast.makeText(settings.this, "The weight value was successfully changed.", Toast.LENGTH_SHORT).show();
            } catch (Exception e) {

            }
        }
        if (croppedImageUri != null) {
            updateProfileImage();
        }
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(settings.this, MainActivity.class);
                startActivity(intent);
                CustomIntent.customType(settings.this, "bottom-to-up");
                finish();
            }
        }, 1000);
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
        Intent intent = new Intent(settings.this, MainActivity.class);
        startActivity(intent);
        CustomIntent.customType(this, "right-to-left");
        finish();
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

    public void help(View view) {
//        AlertDialog.Builder alert = new AlertDialog.Builder(this);
//        alert.setTitle("Help");
//        String helpText = "\nBy entring a new value for weight in the first textbox and/or new password for the second textbox and pressing the submit button you can set new weight and/or new password for you account.\n";
//        alert.setMessage(helpText);
//        alert.setPositiveButton("OK", null);
//        AlertDialog dialog = alert.create();
//        dialog.show();
        Balloon balloon1 = new Balloon.Builder(this)
                .setArrowSize(25)
                .setArrowOrientation(ArrowOrientation.BOTTOM)
                .setArrowPositionRules(ArrowPositionRules.ALIGN_ANCHOR)
                .setArrowPosition(0.5f)
                .setWidth(250)
                .setHeight(BalloonSizeSpec.WRAP)
                .setTextSize(17f)
                .setElevation(16)
                .setCornerRadius(4f)
                .setAlpha(.8f)
                .setText("<br>You can change your weight for Calories burnt calculation be.<br><br><b>Press these boxes to move forwards.<b><br>")
                .setTextColor(ContextCompat.getColor(this, R.color.black))
                .setTextIsHtml(true)
                .setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                .setBalloonAnimation(BalloonAnimation.FADE)
                .setLifecycleOwner(this)
                .build();
        balloon1.showAlignTop(findViewById(R.id.weight));
        balloon1.setOnBalloonClickListener(new OnBalloonClickListener() {
            @Override
            public void onBalloonClick(View view) {
                balloon1.dismiss();
                Balloon balloon2 = new Balloon.Builder(settings.this)
                        .setArrowSize(25)
                        .setArrowOrientation(ArrowOrientation.TOP)
                        .setArrowPositionRules(ArrowPositionRules.ALIGN_ANCHOR)
                        .setArrowPosition(0.5f)
                        .setWidth(250)
                        .setHeight(BalloonSizeSpec.WRAP)
                        .setTextSize(17f)
                        .setElevation(16)
                        .setCornerRadius(4f)
                        .setAlpha(.8f)
                        .setText("<br>You can chose a new password by filling this box with it and pressing the submit button.<br>")
                        .setTextColor(ContextCompat.getColor(settings.this, R.color.black))
                        .setTextIsHtml(true)
                        .setBackgroundColor(ContextCompat.getColor(settings.this, R.color.white))
                        .setBalloonAnimation(BalloonAnimation.FADE)
                        .setLifecycleOwner(settings.this)
                        .build();
                balloon2.showAlignBottom(findViewById(R.id.password));
                balloon2.setOnBalloonClickListener(new OnBalloonClickListener() {
                    @Override
                    public void onBalloonClick(View view) {
                        balloon2.dismiss();
                        Balloon balloon3 = new Balloon.Builder(settings.this)
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
                                .setTextColor(ContextCompat.getColor(settings.this, R.color.black))
                                .setTextIsHtml(true)
                                .setBackgroundColor(ContextCompat.getColor(settings.this, R.color.white))
                                .setBalloonAnimation(BalloonAnimation.FADE)
                                .setLifecycleOwner(settings.this)
                                .build();
                        balloon3.showAlignBottom(findViewById(R.id.submit_btn));
                        balloon3.setOnBalloonClickListener(new OnBalloonClickListener() {
                            @Override
                            public void onBalloonClick(View view) {
                                balloon3.dismiss();
                                Balloon balloon4 = new Balloon.Builder(settings.this)
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
                                        .setTextColor(ContextCompat.getColor(settings.this, R.color.black))
                                        .setTextIsHtml(true)
                                        .setBackgroundColor(ContextCompat.getColor(settings.this, R.color.white))
                                        .setBalloonAnimation(BalloonAnimation.FADE)
                                        .setLifecycleOwner(settings.this)
                                        .build();
                                balloon4.showAlignBottom(findViewById(R.id.imageView));
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
}