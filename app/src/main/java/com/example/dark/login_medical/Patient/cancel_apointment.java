package com.example.dark.login_medical.Patient;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dark.login_medical.R;

/**
 * Created by abd on 09-Feb-18.
 */

public class cancel_apointment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.cancel_apointment,container,false);
        return view;

    }

}
