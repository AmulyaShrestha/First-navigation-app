package com.example.firstnavigationapp.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.firstnavigationapp.R;
import com.example.firstnavigationapp.classes.AreaOfCircle;

/**
 * A simple {@link Fragment} subclass.
 */
public class areaOfCircle extends Fragment {
    Button btnCalculate;
    TextView txtArea;
    EditText etRadius;

    public areaOfCircle() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_area_of_circle, container, false);

        this.bindProperties(view);
        this.configureListeners();

        return view;
    }

    private void bindProperties(View view) {
        this.btnCalculate = view.findViewById(R.id.btnCalculate);
        this.txtArea = view.findViewById(R.id.txtArea);
        this.etRadius= view.findViewById(R.id.etRadius);
    }

    private void configureListeners() {
        this.btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double area, radius = 0.0d;

                try {
                    radius = Double.parseDouble(etRadius.getText().toString());
                }
                catch (Exception error) {
                    etRadius.setError("Invalid value for Radius!");
                }
                AreaOfCircle circle = new AreaOfCircle(radius);

                area = circle.calculateArea();
                txtArea.setText(String.valueOf(area));
            }
        });
    }

}
