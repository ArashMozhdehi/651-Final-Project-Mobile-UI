package com.example.engo651final;

import java.io.*;
import java.net.*;

import android.media.MediaPlayer;

import android.media.MediaPlayer;
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

import org.json.*;

import android.widget.LinearLayout;
import android.widget.TextView;
import android.os.Handler;
import android.content.Intent;
import android.widget.Toast;

import com.google.android.gms.maps.SupportMapFragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.airbnb.lottie.LottieAnimationView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_login#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_login extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment_login() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_login.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment_login newInstance(String param1, String param2) {
        fragment_login fragment = new fragment_login();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_login, container, false);
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_login, container, false);
        EditText uname_tb = (EditText) rootView.findViewById(R.id.signin_uname);
        EditText pass_tb = (EditText) rootView.findViewById(R.id.sign_password);
        TextView pass_tv = (TextView) rootView.findViewById(R.id.forgot);
        androidx.appcompat.widget.AppCompatButton btn = (androidx.appcompat.widget.AppCompatButton) rootView.findViewById(R.id.btn_login);
        uname_tb.setTranslationX(-800);
        pass_tb.setTranslationX(-800);
        btn.setTranslationX(-800);
        pass_tv.setTranslationX(-800);
        uname_tb.setAlpha(0);
        pass_tb.setAlpha(0);
        btn.setAlpha(0);
        pass_tv.setAlpha(0);
        uname_tb.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        pass_tb.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        btn.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();
        pass_tv.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();
        MediaPlayer mp = MediaPlayer.create(rootView.getContext(), R.raw.bicyclebell);
        mp.start();
        return rootView;

    }
}