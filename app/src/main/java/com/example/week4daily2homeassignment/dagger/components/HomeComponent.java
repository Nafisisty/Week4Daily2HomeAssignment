package com.example.week4daily2homeassignment.dagger.components;

import com.example.week4daily2homeassignment.dagger.modules.HomeModule;
import com.example.week4daily2homeassignment.model.local.home.Home;

import dagger.Component;

@Component(modules = HomeModule.class)
public interface HomeComponent {
    Home getHome();
}
