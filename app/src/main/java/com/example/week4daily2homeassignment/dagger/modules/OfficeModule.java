package com.example.week4daily2homeassignment.dagger.modules;

import com.example.week4daily2homeassignment.model.local.office.Office;

import dagger.Module;
import dagger.Provides;

@Module
public class OfficeModule {
    @Provides
    public Office getOffice() {

        return new Office();

    }
}
