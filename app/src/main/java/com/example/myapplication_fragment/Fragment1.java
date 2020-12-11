package com.example.myapplication_fragment;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.Objects;

public class Fragment1 extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i("log","onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Activity activity = Objects.requireNonNull(getActivity());

        Log.i("log","onCreateView");

       View view = inflater.inflate(R.layout.fragment_1, container, false);

        ImageView iv = (ImageView) view.findViewById(R.id.image);
        iv.setImageResource(R.drawable.araha1);

       return view;
    }
}