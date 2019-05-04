package com.example.dagger2_demo;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;

@Module
public class ModuleCar {
    @Provides
    @Reusable
    @Named("Duy")
    Driver getDriver(){
        return new Driver("Duy");
    }
    @Provides
    static Driver getDriver1(){
        return new Driver("Tuan");
    }
}
