package com.example.week4daily2homeassignment.view.activities.mainactivity;

import com.example.week4daily2homeassignment.dagger.components.DaggerHomeComponent;
import com.example.week4daily2homeassignment.dagger.components.HomeComponent;
import com.example.week4daily2homeassignment.model.local.home.Home;

public class MainActivityPresenter {
    MainActivityContract mainActivityContract;
    HomeComponent homeComponent;

    public MainActivityPresenter(MainActivityContract mainActivityContract) {
        this.mainActivityContract = mainActivityContract;
        homeComponent = DaggerHomeComponent.builder().build();
    }

    public void setHome(String name, String location, String beds, String baths) {

        Home aHome = homeComponent.getHome();
        aHome.setHomeName(name);
        aHome.setHomeLocation(location);
        aHome.setHomeBeds(beds);
        aHome.setHomeBaths(baths);

        mainActivityContract.passHome(aHome);
    }

}
