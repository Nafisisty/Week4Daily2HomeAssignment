package com.example.week4daily2homeassignment.model.local.home;

import android.os.Parcel;
import android.os.Parcelable;

public class Home implements Parcelable {

    private String homeName;
    private String homeLocation;
    private String homeBeds;
    private String homeBaths;

    public Home() {
    }

    public Home(String homeName, String homeLocation, String homeBeds, String homeBaths) {
        this.homeName = homeName;
        this.homeLocation = homeLocation;
        this.homeBeds = homeBeds;
        this.homeBaths = homeBaths;
    }

    protected Home(Parcel in) {
        homeName = in.readString();
        homeLocation = in.readString();
        homeBeds = in.readString();
        homeBaths = in.readString();
    }

    public static final Creator<Home> CREATOR = new Creator<Home>() {
        @Override
        public Home createFromParcel(Parcel in) {
            return new Home(in);
        }

        @Override
        public Home[] newArray(int size) {
            return new Home[size];
        }
    };

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public String getHomeLocation() {
        return homeLocation;
    }

    public void setHomeLocation(String homeLocation) {
        this.homeLocation = homeLocation;
    }

    public String getHomeBeds() {
        return homeBeds;
    }

    public void setHomeBeds(String homeBeds) {
        this.homeBeds = homeBeds;
    }

    public String getHomeBaths() {
        return homeBaths;
    }

    public void setHomeBaths(String homeBaths) {
        this.homeBaths = homeBaths;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(homeName);
        dest.writeString(homeLocation);
        dest.writeString(homeBeds);
        dest.writeString(homeBaths);
    }
}
