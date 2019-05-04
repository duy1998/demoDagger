package com.example.dagger2_demo;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class Car {
    private static final String TAG = "Car";
    @Inject Wheels wheels;

     public Engine engine;

     public Driver driver;
     @Inject
    public Car(Engine engine, Driver driver) {
        Log.d(TAG,"constructing");
        this.engine = engine;
        Log.d(TAG,this.engine.toString());
        this.driver = driver;
        Log.d(TAG,this.driver.name);
    }
    @Inject
    public void notify(support tmp)
    {
        tmp.setnotify(this);
    }

    public Car(Engine engine)
    {
        this.engine=engine;
    }


    public void drive() {
        Log.d(TAG, "driving...");
    }
}
