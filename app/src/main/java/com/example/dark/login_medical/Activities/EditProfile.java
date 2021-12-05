package com.example.dark.login_medical.Activities;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

import com.example.dark.login_medical.R;

public class EditProfile extends AppCompatActivity {

    CheckBox passwd;

    ImageView seller_img;

    TextInputLayout name,email,old,new_pass;

    Button update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        initialize();
        check();

    }

    @Override
    public void onBackPressed() {
        finish();
        startActivity(new Intent(this,Login.class));
    }

    private void check() {

        old.setVisibility(View.GONE);
        new_pass.setVisibility(View.GONE);

        passwd.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(passwd.isChecked()) {
                    TranslateAnimation slide = new TranslateAnimation(0, 0, 500,0 );
                    slide.setDuration(1000);

                    old.setVisibility(View.VISIBLE);
                    old.startAnimation(slide);
                    new_pass.setVisibility(View.VISIBLE);
                    new_pass.startAnimation(slide);

                }else{

                    TranslateAnimation slide = new TranslateAnimation(0, 0, 0,1000 );
                    slide.setDuration(1000);

                    old.setVisibility(View.GONE);
                    old.startAnimation(slide);
                    new_pass.setVisibility(View.GONE);
                    new_pass.startAnimation(slide);
                }
            }
        });



    }

    private void initialize() {

        seller_img = (ImageView)findViewById(R.id.seller_image);

        passwd = (CheckBox)findViewById(R.id.checkBox2);

        name = (TextInputLayout)findViewById(R.id.seller_name);
        email = (TextInputLayout)findViewById(R.id.seller_email);
        old = (TextInputLayout)findViewById(R.id.seller_old);
        new_pass = (TextInputLayout)findViewById(R.id.seller_new);

        update = (Button)findViewById(R.id.seller_update);

    }
}
