package com.example.tugasfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


public class buah extends Fragment {

    public buah(){}
    View buahView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        buahView = inflater.inflate(R.layout.fragmentbuah, container, false);

        getActivity().setTitle("erika febriyani");

        return buahView;
    }
}
