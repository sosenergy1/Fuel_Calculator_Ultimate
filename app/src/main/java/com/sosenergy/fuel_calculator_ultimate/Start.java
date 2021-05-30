package com.sosenergy.fuel_calculator_ultimate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start2);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        // setSupportActionBar(toolbar);

        Button btn  = findViewById(R.id.szamol);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                // Do something


                double dblar, dfl100km, dmtkmpn, dmszam, dtvfullkm, dtvfullfogylpho, dtvbejarktgnap, dtvfullktgpho, dtvfogypkm;

                String sblar, sfl100km, smtkmpn, smszam, stvfullkm, stvfullfogylpho, stvbejarktgnap, stvfullktgpho, stvfogypkm;

                EditText vblar = findViewById(R.id.blar);
                EditText vfl100km = findViewById(R.id.fl100km);
                EditText vmtkmpn = findViewById(R.id.mtkmpn);
                EditText vmszam = findViewById(R.id.mszam);

                TextView vtvfullkm = findViewById(R.id.tvfullkm);
                TextView vtvfullfogylpho = findViewById(R.id.tvfullfogylpho);
                TextView vtvbejarktgnap = findViewById(R.id.tvbejarktgnap);
                TextView vtvfullktgpho = findViewById(R.id.tvfullktgpho);
                TextView vtvfogypkm = findViewById(R.id.tvfogypkm);


                sblar = vblar.getText().toString();
                dblar = Double.valueOf(sblar).doubleValue();
                sfl100km = vfl100km.getText().toString();
                dfl100km = Double.valueOf(sfl100km).doubleValue();
                smtkmpn = vmtkmpn.getText().toString();
                dmtkmpn = Double.valueOf(smtkmpn).doubleValue();
                smszam = vmszam.getText().toString();
                dmszam = Double.valueOf(smszam).doubleValue();

                dtvfullkm = dmtkmpn * dmszam;
                dtvfullfogylpho = (dtvfullkm / 100) * dfl100km;
                dtvbejarktgnap = ((dfl100km / 100) * dmtkmpn) * dblar;
                dtvfullktgpho = dtvbejarktgnap * dmszam;
                dtvfogypkm = dtvfullktgpho / dtvfullkm;


                stvfullkm = new Double(dtvfullkm).toString();
                vtvfullkm.setText(stvfullkm);

                stvfullfogylpho = new Double(dtvfullfogylpho).toString();
                vtvfullfogylpho.setText(stvfullfogylpho);

                stvbejarktgnap = new Double(dtvbejarktgnap).toString();
                vtvbejarktgnap.setText(stvbejarktgnap);

                stvfullktgpho = new Double(dtvfullktgpho).toString();
                vtvfullktgpho.setText(stvfullktgpho);

                stvfogypkm = new Double(dtvfogypkm).toString();
                vtvfogypkm.setText(stvfogypkm);
            }
        });

    }



//btn.setOnClickListener(oclBtnOk);



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override  // Menürendszer
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch(id) {
          /*  case R.id.item1: Intent i = new Intent();
                i.setClass(getApplicationContext(), Settings.class);
                startActivity(i); break;
*/
            case R.id.item2: Intent j = new Intent();
                j.setClass(getApplicationContext(),About.class);
                startActivity(j); break;



            case R.id.item3: Intent k = new Intent(); // Fogyasztás számítás
                k.setClass(getApplicationContext(),Actual_Consumption.class);
                startActivity(k); break;

            case R.id.item4: Start.this.finish(); // Kilépés
                moveTaskToBack(true);
        }
        return super.onOptionsItemSelected(item);
    }


}