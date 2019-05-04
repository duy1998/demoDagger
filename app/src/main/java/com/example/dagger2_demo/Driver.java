package com.example.dagger2_demo;

import android.util.Log;

import javax.inject.Inject;

public class Driver {
    public String name;


    public Driver(String name) {
        this.name=name;
        Log.d("Car",name);
    }
    public void notify(Car car)
    {
        Log.d("Car","asdasdasd");
    }
}
