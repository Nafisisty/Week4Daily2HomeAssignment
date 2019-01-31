package com.example.week4daily2homeassignment.view.activities.showoffice;

import com.example.week4daily2homeassignment.dagger.components.DaggerOfficeComponent;
import com.example.week4daily2homeassignment.dagger.components.OfficeComponent;
import com.example.week4daily2homeassignment.model.local.office.Office;

public class ShowOfficePresenter {

    ShowOfficeContract showOfficeContract;
    OfficeComponent officeComponent;
    Office aOffice;

    public ShowOfficePresenter(ShowOfficeContract showOfficeContract) {
        this.showOfficeContract = showOfficeContract;
        officeComponent = DaggerOfficeComponent.builder().build();
    }

    public void getOffice(Office office) {
        aOffice = officeComponent.getOffice();
        aOffice = office;
        showOfficeContract.passOffice(aOffice);
    }

}
