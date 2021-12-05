package com.example.dark.login_medical.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dark.login_medical.R;

public class Doctor extends AppCompatActivity {

    Button report,medicine,cbc;

    TextView name;

    ImageView edit_prof,logout_doc;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);
        initialize();
        throwUser();
    }

    private void throwUser() {

        intent = new Intent(this,doctor_fragment_display.class);

        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("value","report");
                startActivity(intent);
                finish();
            }
        });

        medicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("value","medicine");
                startActivity(intent);
                finish();
            }
        });

        cbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("value","cbc");
                startActivity(intent);
                finish();
            }
        });

      edit_prof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("value","edit_prof");
                startActivity(intent);
                finish();
            }
        });
        logout_doc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Doctor.this, "works after session manager implementation", Toast.LENGTH_SHORT).show();
            }
        });



    }

    private void initialize() {

        report = (Button)findViewById(R.id.Print_report);
        medicine = (Button)findViewById(R.id.Check_Medicine);
        cbc = (Button)findViewById(R.id.Request_cbc);

        name = (TextView)findViewById(R.id.doc_name);

        edit_prof = (ImageView)findViewById(R.id.edit_doctor);
        logout_doc = (ImageView)findViewById(R.id.logout_doctor);

    }
}
