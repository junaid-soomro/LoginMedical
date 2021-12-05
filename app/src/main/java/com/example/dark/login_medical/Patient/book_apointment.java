package com.example.dark.login_medical.Patient;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.dark.login_medical.R;

import java.text.DateFormat;
import java.util.Calendar;


public class book_apointment extends Fragment {

    TextView set_date,set_time;

    DatePickerDialog.OnDateSetListener dateSetListener;
    TimePickerDialog.OnTimeSetListener timeSetListener;

    ImageView date,time;

    Spinner doctor_name;

    Button book_apoi;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.book_apointment,container,false);
        initialize(view);
        selectdatetime() ;
        return view;
    }

    private void selectdatetime() {

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int date = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(getContext(),
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        dateSetListener,
                        year,month,date
                        );
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                int minutes = calendar.get(Calendar.MINUTE);
                int hour = calendar.get(Calendar.HOUR);

                TimePickerDialog dialog = new TimePickerDialog(getContext()
                        ,timeSetListener,minutes,hour, android.text.format.DateFormat.is24HourFormat(getContext()));

                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month+1;
                String date = day+"/"+month+"/"+year;
                set_date.setText(date);
            }
        };
        timeSetListener = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int hour, int min) {
                    String time = hour+":"+min;
                    set_time.setText(time);
            }
        };

    }

    private void initialize(View view) {

        set_date = (TextView)view.findViewById(R.id.date_set);
        set_time = (TextView)view.findViewById(R.id.time_set);

        date = (ImageView)view.findViewById(R.id.date);
        time = (ImageView)view.findViewById(R.id.time);

        doctor_name = (Spinner)view.findViewById(R.id.spinner);

        book_apoi = (Button)view.findViewById(R.id.book_apoi);
    }

    }


