package com.example.dagger2_demo;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Reusable;


@Component(modules = ModuleCar.class)
@Singleton
public interface CarComponent {
//    Wheels getWheels();
    Car getCar();
    Driver getDriver();
    void injectCar(Car car);
    void inject(MainActivity mainActivity);
    void inject1(Car car);

}
