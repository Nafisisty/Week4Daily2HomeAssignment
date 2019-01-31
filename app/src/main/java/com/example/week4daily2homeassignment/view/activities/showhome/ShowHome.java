package com.example.week4daily2homeassignment.view.activities.showhome;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.week4daily2homeassignment.R;
import com.example.week4daily2homeassignment.model.local.home.Home;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShowHome extends Activity implements ShowHomeContract {

    ShowHomePresenter showHomePresenter;
    Home home;

    @BindView(R.id.homeNameTextViewId)
    TextView homeName;

    @BindView(R.id.homeLocationTextViewId)
    TextView homeLocation;

    @BindView(R.id.homeBedsTextViewId)
    TextView homeBeds;

    @BindView(R.id.homeBathsTextViewId)
    TextView homeBaths;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_home);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null) {

            home = bundle.getParcelable("homeObject");

        }

        ButterKnife.bind(this);

        showHomePresenter = new ShowHomePresenter(this);
        showHomePresenter.getHome(home);

    }

    @Override
    public void passHome(Home home) {
        if(home != null) {

            homeName.setText(home.getHomeName());
            homeLocation.setText(home.getHomeLocation());
            homeBeds.setText(home.getHomeBeds());
            homeBaths.setText(home.getHomeBaths());

        }
    }
}
