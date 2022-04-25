package com.example.engo651final;
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
import android.widget.TextView;



/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_register#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_register extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment_register() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_register.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment_register newInstance(String param1, String param2) {
        fragment_register fragment = new fragment_register();
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

//    public void SignupEvent(View view) {
//        EditText textbox = (EditText) getView().findViewById(R.id.reg_f_name);
//        String f_name = textbox.getText().toString();
//        textbox = (EditText) getView().findViewById(R.id.reg_l_name);
//        String l_name = textbox.getText().toString();
//        textbox = (EditText) getView().findViewById(R.id.reg_uname);
//        String username = textbox.getText().toString();
//        textbox = (EditText) getView().findViewById(R.id.reg_password);
//        String password = textbox.getText().toString();
//        textbox = (EditText) getView().findViewById(R.id.reg_repassword);
//        String password2 = textbox.getText().toString();
//        if(password == password2)
//        {
//
//        }
//        else
//        {
//            AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
//            builder.setTitle("Error");
//            builder.setMessage("Make sure passwords are match.");
//            builder.setPositiveButton("OK", null);
//            AlertDialog dialog = builder.create();
//            dialog.show();
//        }
//    }


    //    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_register, container, false);
//    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_register, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);
        EditText uname_tb = (EditText) view.findViewById(R.id.reg_uname);
        EditText pass_tb = (EditText) view.findViewById(R.id.reg_f_name);
        androidx.appcompat.widget.AppCompatButton btn = (androidx.appcompat.widget.AppCompatButton) view.findViewById(R.id.btn_register);
        uname_tb.setTranslationX(800);
        pass_tb.setTranslationX(800);
        btn.setTranslationX(800);
        uname_tb.setAlpha(0);
        pass_tb.setAlpha(0);
        btn.setAlpha(0);
        uname_tb.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        pass_tb.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        btn.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();
    }
}