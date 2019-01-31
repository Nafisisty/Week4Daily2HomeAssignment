package com.example.week4daily2homeassignment.view.activities.showhome;

import com.example.week4daily2homeassignment.dagger.components.DaggerHomeComponent;
import com.example.week4daily2homeassignment.dagger.components.HomeComponent;
import com.example.week4daily2homeassignment.model.local.home.Home;

public class ShowHomePresenter {
    ShowHomeContract showHomeContract;
    HomeComponent homeComponent;
    Home aHome;

    public ShowHomePresenter(ShowHomeContract showHomeContract) {
        this.showHomeContract = showHomeContract;
        homeComponent = DaggerHomeComponent.builder().build();
    }

    public void getHome(Home home) {
        aHome = homeComponent.getHome();
        aHome = home;
        showHomeContract.passHome(aHome);
    }

}
