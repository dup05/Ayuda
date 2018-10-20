package com.example.divya.myapp;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.Button;

public class Tab1Doctors extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tab_doc, container, false);

        final Button button = (Button) rootView.findViewById(R.id.btntomap);

        button.setOnClickListener(new View.OnClickListener() {

            Intent intent = new Intent(getActivity(),ViewMap.class);
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        return rootView;


    }

}