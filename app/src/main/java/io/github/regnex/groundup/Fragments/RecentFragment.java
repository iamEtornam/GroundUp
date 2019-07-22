package io.github.regnex.groundup.Fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import io.github.regnex.groundup.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecentFragment extends Fragment {

    private static RecentFragment INSTANCE = null;

    public RecentFragment() {
        // Required empty public constructor
    }


    public static RecentFragment getIntance(){
        if (INSTANCE == null)
            INSTANCE = new RecentFragment();
        return INSTANCE;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recent, container, false);
    }

}
