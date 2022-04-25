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
 * Use the {@link recovery_code#newInstance} factory method to
 * create an instance of this fragment.
 */
public class recovery_code extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public recovery_code() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment recovery_code.
     */
    // TODO: Rename and change types and number of parameters
    public static recovery_code newInstance(String param1, String param2) {
        recovery_code fragment = new recovery_code();
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
        View rootView =  inflater.inflate(R.layout.fragment_recovery_code, container, false);
        EditText pass_tb = (EditText) rootView.findViewById(R.id.recovery_code);
        TextView textView11 = (TextView) rootView.findViewById(R.id.textView11);
        androidx.appcompat.widget.AppCompatButton btn = (androidx.appcompat.widget.AppCompatButton) rootView.findViewById(R.id.btn_forgot3);
        textView11.setTranslationX(800);
        pass_tb.setAlpha(0);
        btn.setAlpha(0);
        textView11.setAlpha(0);
        pass_tb.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        btn.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();
        textView11.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        MediaPlayer mp = MediaPlayer.create(rootView.getContext(), R.raw.bicyclebell);
        mp.start();
        return rootView;
    }
}