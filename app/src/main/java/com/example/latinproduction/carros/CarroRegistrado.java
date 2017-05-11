package com.example.latinproduction.carros;

import android.content.res.Resources;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class CarroRegistrado extends AppCompatActivity {
    private ArrayList<Carro> carros;
    private Resources res;
    private TextView reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro_registrado);
        reg = (TextView)findViewById(R.id.txtCarroregis);


        }

    public void CarroRegis() {
        int c = 0;
        carros = Datos.getCarros();
            for (int i = 1; i < Datos.getCarros().size(); i++) {
                c = i+1;
            }
       reg.setText(String.valueOf(c));
        }
    }


