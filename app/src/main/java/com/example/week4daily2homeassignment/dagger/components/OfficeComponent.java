package com.example.week4daily2homeassignment.dagger.components;

import com.example.week4daily2homeassignment.dagger.modules.OfficeModule;
import com.example.week4daily2homeassignment.model.local.office.Office;

import dagger.Component;

@Component(modules = OfficeModule.class)
public interface OfficeComponent {
    Office getOffice();
}
