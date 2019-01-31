package com.example.week4daily2homeassignment.view.activities.showoffice;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.week4daily2homeassignment.R;
import com.example.week4daily2homeassignment.model.local.office.Office;
import com.example.week4daily2homeassignment.view.activities.officeactivity.OfficeActivityPresenter;
import com.example.week4daily2homeassignment.view.activities.showhome.ShowHomePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShowOffice extends Activity implements ShowOfficeContract {

    ShowOfficePresenter showOfficePresenter;

    @BindView(R.id.officeNameTextViewId)
    TextView officeNameTextView;
    @BindView(R.id.officeLocationTextViewId)
    TextView officeLocationTextView;
    @BindView(R.id.officeTypeTextViewId)
    TextView officeTypeTextView;
    @BindView(R.id.officeEmployeesTextViewId)
    TextView officeEmployeesTextView;

    Office office;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_office);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null) {

            office = bundle.getParcelable("officeObject");

        }

        ButterKnife.bind(this);

        showOfficePresenter = new ShowOfficePresenter(this);
        showOfficePresenter.getOffice(office);

    }

    @Override
    public void passOffice(Office aOffice) {

        if(aOffice != null) {

            officeNameTextView.setText(aOffice.getOfficeName());
            officeLocationTextView.setText(aOffice.getOfficeLocation());
            officeTypeTextView.setText(aOffice.getOfficeType());
            officeEmployeesTextView.setText(aOffice.getOfficeEmployees());


        }

    }
}
