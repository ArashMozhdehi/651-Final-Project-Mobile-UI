package com.example.engo651final;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link reset_password#newInstance} factory method to
 * create an instance of this fragment.
 */
public class reset_password extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public reset_password() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment reset_password.
     */
    // TODO: Rename and change types and number of parameters
    public static reset_password newInstance(String param1, String param2) {
        reset_password fragment = new reset_password();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_reset_password, container, false);
        EditText uname_tb = (EditText) rootView.findViewById(R.id.reset_password);
        EditText pass_tb = (EditText) rootView.findViewById(R.id.reset_repassword);
        TextView textView12 = (TextView) rootView.findViewById(R.id.textView12);
        androidx.appcompat.widget.AppCompatButton btn = (androidx.appcompat.widget.AppCompatButton) rootView.findViewById(R.id.reset_btn);
        uname_tb.setTranslationX(800);
        pass_tb.setTranslationX(800);
        textView12.setTranslationX(800);
        btn.setTranslationX(800);
        uname_tb.setAlpha(0);
        pass_tb.setAlpha(0);
        textView12.setAlpha(0);
        btn.setAlpha(0);
        uname_tb.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        pass_tb.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        btn.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();
        textView12.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();
        MediaPlayer mp = MediaPlayer.create(rootView.getContext(), R.raw.bicyclebell);
        mp.start();
        return rootView;
    }
}