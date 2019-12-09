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
import com.example.firstnavigationapp.classes.SimpleInterest;

/**
 * A simple {@link Fragment} subclass.
 */
public class simpleInterest extends Fragment {
    EditText etPrincipal, etTime, etRate;
    Button btnCalculate;
    TextView txtInterest;

    public simpleInterest() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple_interest, container, false);

        this.bindingControls(view);
        this.configureListeners();

        return view;
    }

    private void bindingControls(View view) {
        this.etPrincipal = view.findViewById(R.id.etPrincipalAmount);
        this.etRate = view.findViewById(R.id.etRate);
        this.etTime = view.findViewById(R.id.etTime);
        this.btnCalculate = view.findViewById(R.id.btnCalculate);
        this.txtInterest = view.findViewById(R.id.txtInterest);
    }

    private void configureListeners() {
        this.btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double principal, rate, time, SI;
                principal = rate = time = SI = 0.0d;
                try {
                    principal = Double.parseDouble(etPrincipal.getText().toString());
                } catch (Exception error) {
                    etPrincipal.setError("Invalid Principal Amount!");
                }
                try {
                    rate = Double.parseDouble(etRate.getText().toString());
                } catch (Exception error) {
                    etPrincipal.setError("Invalid Rate!");
                }
                try {
                    time = Double.parseDouble(etTime.getText().toString());
                } catch (Exception error) {
                    etPrincipal.setError("Invalid Time!");
                }
                SimpleInterest si = new SimpleInterest(principal, time, rate);
                si.calculateSimpleInterest();
                txtInterest.setText(String.valueOf(SI));
            }
        });
    }

}
