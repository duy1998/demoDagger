package com.example.dagger2_demo;

import android.util.Log;

import javax.inject.Inject;

public class Engine {
    @Inject
    public Engine() {
        Log.d("Car","Creating Engine");
    }
}
