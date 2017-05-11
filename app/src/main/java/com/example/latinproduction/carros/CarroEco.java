package com.example.latinproduction.carros;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class CarroEco extends AppCompatActivity {
    private TextView placa,marca,modelo,precio;
    private ArrayList<Carro> carros;
    private Resources res;
    private TableLayout tabla;
    private String aux;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro_eco);
        res=this.getResources();
        placa=(TextView)findViewById(R.id.txtPlaca);
        marca=(TextView)findViewById(R.id.txtMarca);
        modelo=(TextView)findViewById(R.id.txtModelo);
        precio=(TextView)findViewById(R.id.txtPrecio);
        carros=Datos.getCarros();
        placa.setText(res.getString(R.string.placa)+": "+carros.get(carroeco()).getPlaca());
        marca.setText(res.getString(R.string.marca)+": "+carros.get(carroeco()).getMarca());
        modelo.setText(res.getString(R.string.modelo)+": "+carros.get(carroeco()).getModelo());
        precio.setText(res.getString(R.string.precio)+": "+String.valueOf(carros.get(carroeco()).getPrecio()));
    }
    public int carroeco(){
        int c=0;
        for (int i=1;i<carros.size();i++){
            if (carros.get(c).getPrecio()>carros.get(i).getPrecio()){
                c=i;
            }
        }
        return c;
    }
    }


