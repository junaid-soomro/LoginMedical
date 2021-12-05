package com.example.dark.login_medical.Activities.PharmacistDept;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dark.login_medical.Pharmacist.Doctor_presc;
import com.example.dark.login_medical.Pharmacist.Medicines;
import com.example.dark.login_medical.Pharmacist.add_medicine;
import com.example.dark.login_medical.R;

public class Pharmacist extends AppCompatActivity {

    TextView name;

    Button add_med,all_med,doctor_pres;

    ImageView logout,edit_pro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacist);
        initialize();
        throwusr();


    }

    private void throwusr() {

        add_med.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Pharmacist.this,add_medicine.class));

            }
        });
        all_med.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Pharmacist.this,Medicines.class));

            }
        });
        doctor_pres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Pharmacist.this,Doctor_presc.class));

            }
        });

    }

    private void initialize() {

        name = (TextView)findViewById(R.id.pharmacist_name);

        add_med = (Button)findViewById(R.id.Add_medicine);
        all_med = (Button)findViewById(R.id.Medicines);
        doctor_pres = (Button)findViewById(R.id.request_doctor_presc);

        logout = (ImageView)findViewById(R.id.logout_pharmacist);
        edit_pro = (ImageView)findViewById(R.id.edit_pharmacist);

    }
}
