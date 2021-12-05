package com.example.dark.login_medical.Docotor;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.dark.login_medical.*;
import com.example.dark.login_medical.Adapters.ReportsAdapter;
import com.example.dark.login_medical.Models.PatientReports;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abd on 07-Feb-18.
 */

public class print_report extends Fragment{

    ListView listView;

    ArrayList<PatientReports> arrayList = new ArrayList<>();
    ReportsAdapter adapter;

    PatientReports model;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.print_report,container,false);
        initiliaze(view);
        fillvalues();
        return view;
    }

    private void fillvalues() {

        String[] id = {"1234","2233","4575"};
        String[] name = {"Sara","Alaa","Nura"};

        for(int i=0;i<3;i++) {
            model = new PatientReports(id[i],name[i]);
            arrayList.add(model);
        }


    adapter = new ReportsAdapter(arrayList,getContext());
    listView.setAdapter(adapter);
    }


    private void initiliaze(View view) {

        listView = (ListView)view.findViewById(R.id.pt_reports_list);
    }
}
