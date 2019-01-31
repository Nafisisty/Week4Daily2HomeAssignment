package com.example.week4daily2homeassignment.dagger.modules;

import com.example.week4daily2homeassignment.model.local.home.Home;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class HomeModule {

    @Provides
    public Home getHome() {
        return new Home();
    }

}
