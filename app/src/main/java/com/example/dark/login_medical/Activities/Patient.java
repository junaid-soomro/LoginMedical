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

public class Patient extends AppCompatActivity {


    Button book,call,cancel;

    TextView name;

    ImageView edit_prof,logout_pt;

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient);
        initialize();
        throwUser();
    }
    private void throwUser() {

        intent = new Intent(this,doctor_fragment_display.class);

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("value","book");
                startActivity(intent);
                finish();
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("value","call");
                startActivity(intent);
                finish();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("value","cancel");
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
        logout_pt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Patient.this, "works after session manager implementation", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void initialize() {

        book = (Button)findViewById(R.id.book);
        call = (Button)findViewById(R.id.call);
        cancel = (Button)findViewById(R.id.cancel);

        name = (TextView)findViewById(R.id.doc_name);

        edit_prof = (ImageView)findViewById(R.id.edit_patient);
        logout_pt = (ImageView)findViewById(R.id.logout_patient);

    }
}
