package com.example.latinproduction.carros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListarCarro extends AppCompatActivity {
    private ListView lista;
    private ArrayList<Carro> carros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_carro);

        lista = (ListView)findViewById(R.id.lvListadoCarro);
        carros = Datos.getCarros();

        AdaptadorCarro adapter = new AdaptadorCarro(this,carros);
        lista.setAdapter(adapter);
    }
}
