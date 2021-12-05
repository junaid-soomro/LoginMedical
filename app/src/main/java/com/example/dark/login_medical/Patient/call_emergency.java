package com.example.dark.login_medical.Patient;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dark.login_medical.R;

/**
 * Created by abd on 09-Feb-18.
 */

public class call_emergency extends Fragment {

    Button fetch_loc,submit_loc;

    ImageView loc_status;

    TextView status;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.call_emergency,container,false);
        initiliaze(view);
        action();
        return view;
    }

    private void action() {

        fetch_loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                status.setText("Location fetched.");
                loc_status.setImageResource(R.color.fbutton_color_green_sea);

            }
        });

    }

    private void initiliaze(View view) {

        status = (TextView)view.findViewById(R.id.loc_status);

        loc_status = (ImageView)view.findViewById(R.id.location_status);

        fetch_loc = (Button)view.findViewById(R.id.get_location);
        submit_loc = (Button)view.findViewById(R.id.submit_location);

    }
}
