package com.example.fragment.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fragment.R;

public class HomeFragment extends Fragment {
    private View HomeView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        HomeView = inflater.inflate(R.layout.fragment_home, container, false);

        return HomeView;
    }
}
