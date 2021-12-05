package com.example.dark.login_medical.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.dark.login_medical.Docotor.check_medicine;
import com.example.dark.login_medical.Docotor.print_report;
import com.example.dark.login_medical.Docotor.request_CBC;
import com.example.dark.login_medical.Patient.book_apointment;
import com.example.dark.login_medical.Patient.call_emergency;
import com.example.dark.login_medical.Patient.cancel_apointment;
import com.example.dark.login_medical.R;

public class doctor_fragment_display extends AppCompatActivity {

    FrameLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_fragment_display);
        setFragment();
    }

    private void setFragment() {
        container = (FrameLayout)findViewById(R.id.container);

        String value = getIntent().getStringExtra("value");

        if(value.equals("report")){
            android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            android.support.v4.app.Fragment mFragment = new print_report();
            transaction.replace(R.id.container, mFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }
        else if(value.equals("medicine")){

            android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            android.support.v4.app.Fragment mFragment = new check_medicine();
            transaction.replace(R.id.container, mFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }
        else if(value.equals("cbc")){

            android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            android.support.v4.app.Fragment mFragment = new request_CBC();
            transaction.replace(R.id.container, mFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }else if(value.equals("edit_prof")){

            startActivity(new Intent(this,EditProfile.class));
            finish();

        }else if(value.equals("book")){

            android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            android.support.v4.app.Fragment mFragment = new book_apointment();
            transaction.replace(R.id.container, mFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }else if(value.equals("call")){

            android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            android.support.v4.app.Fragment mFragment = new call_emergency();
            transaction.replace(R.id.container, mFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }else if(value.equals("cancel")){

            android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            android.support.v4.app.Fragment mFragment = new cancel_apointment();
            transaction.replace(R.id.container, mFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }

    }

    @Override
    public void onBackPressed() {
        finish();
        startActivity(new Intent(this, Patient.class));
    }
}
