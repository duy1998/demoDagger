package com.example.dagger2_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import dagger.Component;
import dagger.Lazy;

public class MainActivity extends AppCompatActivity {

//    @Inject Wheels wheels;
//    @Inject Car car1;

    Car car1;

    Car car2;
    @Inject
    Wheels wheels;
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        component.inject(this);
//        CarComponent component=DaggerCarComponent.builder().moduleCar(new ModuleCar()).build();
//        component.inject(this);
//        Log.d("Car",car1.driver.name);
//        car1.driver.name="Tuan";
//        Log.d("Car",car2.driver.name);
        CarComponent component=DaggerCarComponent.create();
        car1= component.getCar();

    }
}
