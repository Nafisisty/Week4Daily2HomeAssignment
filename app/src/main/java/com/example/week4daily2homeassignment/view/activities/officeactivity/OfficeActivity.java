package com.example.week4daily2homeassignment.view.activities.officeactivity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.week4daily2homeassignment.R;
import com.example.week4daily2homeassignment.model.local.office.Office;
import com.example.week4daily2homeassignment.view.activities.showoffice.ShowOffice;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OfficeActivity extends Activity implements OfficeActivityContract {

    OfficeActivityPresenter officeActivityPresenter;

    @BindView(R.id.officeNameEditTextId)
    TextView officeNameEditText;
    @BindView(R.id.officeLocationEditTextId)
    TextView officeLocationEditText;
    @BindView(R.id.officeTypeEditTextId)
    TextView officeTypeEditText;
    @BindView(R.id.officeEmployeesEditTextId)
    TextView officeEmployeesEditText;

    Office office;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office);

        officeActivityPresenter = new OfficeActivityPresenter(this);

        ButterKnife.bind(this);

    }

    public void onClick(View view) {

        String name = officeNameEditText.getText().toString();
        String location = officeLocationEditText.getText().toString();
        String type = officeTypeEditText.getText().toString();
        String employees = officeEmployeesEditText.getText().toString();

        officeActivityPresenter.setOffice(name, location, type, employees);
        Intent intent = new Intent(this, ShowOffice.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("officeObject", office);
        intent.putExtras(bundle);
        startActivity(intent);


    }

    @Override
    public void passOffice(Office aOffice) {
        if (aOffice != null) {
            office = aOffice;
        }
    }
}
