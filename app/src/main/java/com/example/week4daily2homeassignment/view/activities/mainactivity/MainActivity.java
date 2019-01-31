package com.example.week4daily2homeassignment.view.activities.mainactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.week4daily2homeassignment.R;
import com.example.week4daily2homeassignment.model.local.home.Home;
import com.example.week4daily2homeassignment.view.activities.officeactivity.OfficeActivity;
import com.example.week4daily2homeassignment.view.activities.showhome.ShowHome;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends Activity implements MainActivityContract {

    MainActivityPresenter mainActivityPresenter;
    @BindView(R.id.homeNameEditTextId)
    TextView homeNameEditText;
    @BindView(R.id.homeLocationEditTextId)
    TextView homeLocationEditText;
    @BindView(R.id.homeBedsEditTextId)
    TextView homeBedsEditText;
    @BindView(R.id.homeBathsEditTextId)
    TextView homeBathsEditText;

    Home home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivityPresenter = new MainActivityPresenter(this);

        ButterKnife.bind(this);

    }

    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.showHomeButtonId: {
                String name = homeNameEditText.getText().toString();
                String location = homeLocationEditText.getText().toString();
                String beds = homeBedsEditText.getText().toString();
                String baths = homeBathsEditText.getText().toString();

                mainActivityPresenter.setHome(name, location, beds, baths);
                Intent intent = new Intent(this, ShowHome.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("homeObject", home);
                intent.putExtras(bundle);
                startActivity(intent);

                break;
            }

            case R.id.officeButtonId: {

                Intent intent = new Intent(this, OfficeActivity.class);
                startActivity(intent);

                break;
            }
        }
    }

    @Override
    public void passHome(Home aHome) {
        home = aHome;
    }
}
