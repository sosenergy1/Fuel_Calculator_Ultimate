package com.sosenergy.fuel_calculator_ultimate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Actual_Consumption extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actual__consumption);


        Button btn2  = findViewById(R.id.cons_button);
        btn2.setOnClickListener(new View.OnClickListener() {

            double osszes_km,osszes_liter,fogyasztas;
            String s_osszes_km,s_osszes_liter,s_fogyasztas;
            @Override
            public void onClick(View view)
            {

                EditText km = findViewById(R.id.sum__km);
                EditText liter = findViewById(R.id.sum__liter);
                TextView eredmeny = findViewById(R.id.eredmeny);

                s_osszes_km = km.getText().toString();
                osszes_km = Double.valueOf(s_osszes_km).doubleValue();
                s_osszes_liter = liter.getText().toString();
                osszes_liter = Double.valueOf(s_osszes_liter).doubleValue();

                fogyasztas = (osszes_liter/osszes_km)*100;


                s_fogyasztas = new Double(fogyasztas).toString();
                eredmeny.setText(s_fogyasztas+" liter/100km");
            }
        });

    }


}