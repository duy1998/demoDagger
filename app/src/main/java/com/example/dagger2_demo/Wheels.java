package com.example.dagger2_demo;

import android.util.Log;

import javax.inject.Inject;

public class Wheels {
    @Inject
    public Wheels() {
        Log.d("Car","create Wheels");
    }
}
