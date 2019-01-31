package com.example.week4daily2homeassignment.view.activities.officeactivity;

import com.example.week4daily2homeassignment.dagger.components.DaggerOfficeComponent;
import com.example.week4daily2homeassignment.dagger.components.OfficeComponent;
import com.example.week4daily2homeassignment.model.local.office.Office;

public class OfficeActivityPresenter {

    OfficeActivityContract officeActivityContract;
    OfficeComponent officeComponent;

    public OfficeActivityPresenter(OfficeActivityContract officeActivityContract) {
        this.officeActivityContract = officeActivityContract;
        officeComponent = DaggerOfficeComponent.builder().build();
    }

    public void setOffice(String name, String location, String type, String employees) {

        Office aOffice = officeComponent.getOffice();
        aOffice.setOfficeName(name);
        aOffice.setOfficeLocation(location);
        aOffice.setOfficeType(type);
        aOffice.setOfficeEmployees(employees);

        officeActivityContract.passOffice(aOffice);
    }

}
