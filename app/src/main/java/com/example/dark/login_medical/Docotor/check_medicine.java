package com.example.dark.login_medical.Docotor;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.dark.login_medical.*;

/**
 * Created by abd on 07-Feb-18.
 */

public class check_medicine extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.check_medicine,container,false);
        return view;
    }
}
