package com.example.dark.login_medical.Adapters;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.dark.login_medical.Models.PatientReports;
import com.example.dark.login_medical.R;

import java.util.ArrayList;

/**
 * Created by abd on 08-Feb-18.
 */

public class ReportsAdapter extends BaseAdapter {

    LayoutInflater inflater;
    Context context;
    ArrayList<PatientReports> reports = new ArrayList<>();

    ImageView download;

    TextView Name,ID;

    public ReportsAdapter(ArrayList<PatientReports> reports, Context context) {
        this.reports = reports;
        this.context = context;
        inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return reports.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.layout_reports_fetch,null,false);
        initiliaze(view);
        setvalues(i);
        return view;
    }

    private void setvalues(int pos) {

        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Downloading report.", Toast.LENGTH_SHORT).show();
            }
        });
        Name.setText(reports.get(pos).getNAME());
        ID.setText(reports.get(pos).getID());

    }

    private void initiliaze(View view) {

        download  = (ImageView)view.findViewById(R.id.download);

        Name = (TextView)view.findViewById(R.id.pt_name);
        ID = (TextView)view.findViewById(R.id.pt_id);

    }
}
