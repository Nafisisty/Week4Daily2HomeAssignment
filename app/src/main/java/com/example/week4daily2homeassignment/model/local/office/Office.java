package com.example.week4daily2homeassignment.model.local.office;

import android.os.Parcel;
import android.os.Parcelable;

public class Office implements Parcelable {

    private String officeName;
    private String officeLocation;
    private String officeType;
    private String officeEmployees;

    public Office() {
    }

    public Office(String officeName, String officeLocation, String officeType, String officeEmployees) {
        this.officeName = officeName;
        this.officeLocation = officeLocation;
        this.officeType = officeType;
        this.officeEmployees = officeEmployees;
    }

    protected Office(Parcel in) {
        officeName = in.readString();
        officeLocation = in.readString();
        officeType = in.readString();
        officeEmployees = in.readString();
    }

    public static final Creator<Office> CREATOR = new Creator<Office>() {
        @Override
        public Office createFromParcel(Parcel in) {
            return new Office(in);
        }

        @Override
        public Office[] newArray(int size) {
            return new Office[size];
        }
    };

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public String getOfficeType() {
        return officeType;
    }

    public void setOfficeType(String officeType) {
        this.officeType = officeType;
    }

    public String getOfficeEmployees() {
        return officeEmployees;
    }

    public void setOfficeEmployees(String officeEmployees) {
        this.officeEmployees = officeEmployees;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(officeName);
        dest.writeString(officeLocation);
        dest.writeString(officeType);
        dest.writeString(officeEmployees);
    }
}
