package com.example.dark.login_medical.Activities;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dark.login_medical.Activities.EmergencyDept.EmergencyDept;
import com.example.dark.login_medical.Activities.PharmacistDept.Pharmacist;
import com.example.dark.login_medical.R;

public class Login extends AppCompatActivity {

    Button login;

    TextInputLayout email;

    TextView reg_user;

    String EMAIL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initialize();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EMAIL = email.getEditText().getText().toString();

                if(EMAIL.equals("doctor")){
                    startActivity(new Intent(Login.this,Doctor.class));

                }
                else if(EMAIL.equals("pharm")){
                    startActivity(new Intent(Login.this,Pharmacist.class));
                    finish();
                }
                else if(EMAIL.equals("patient")){
                    startActivity(new Intent(Login.this,Patient.class));
                    finish();
                }
                else if(EMAIL.equals("emergency")){
                    startActivity(new Intent(Login.this,EmergencyDept.class));
                    finish();
                    }else{

                    Toast.makeText(Login.this, "incorect email"+EMAIL, Toast.LENGTH_SHORT).show();
                }
            }
        });
        reg_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this,Register.class));
                finish();

            }
        });
    }

    private void initialize() {
        reg_user = (TextView)findViewById(R.id.Reg_User);
        login = (Button)findViewById(R.id.Login);
        email = (TextInputLayout)findViewById(R.id.email_login);
    }


}
