package com.example.latinproduction.carros;

import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class RegistroCarro extends AppCompatActivity {
    private EditText plac, preci;
    private Spinner marc, model, colo;
    private Resources res;
    private ArrayAdapter<String> adapter,adapter2,adapter3;
    private String[] opc, opc2,opc3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_carro);

        res = this.getResources();
        plac = (EditText)findViewById(R.id.txtPlacaa);
        preci = (EditText)findViewById(R.id.txtPrecio);
        marc = (Spinner)findViewById(R.id.spMarca);
        model = (Spinner)findViewById(R.id.spModelo);
        colo = (Spinner)findViewById(R.id.spColor);

        opc = res.getStringArray(R.array.marca);
        opc2 = res.getStringArray(R.array.modelo);
        opc3 = res.getStringArray(R.array.color);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opc);
        adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opc2);
        adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opc3);

        marc.setAdapter(adapter);
        model.setAdapter(adapter2);
        colo.setAdapter(adapter3);

    }
    public void registrar(View v){
        String placa,marca,modelo,color,foto;
        int precio;

        placa = plac.getText().toString().trim();
        marca = marc.getSelectedItem().toString();
        modelo = model.getSelectedItem().toString();
        color = colo.getSelectedItem().toString();
        precio = Integer.parseInt(preci.getText().toString().trim());

        foto = String.valueOf(fotoAleatoria());
        Carro c = new Carro(placa,marca,modelo,color,foto,precio);
        c.guardar();

        new AlertDialog.Builder(this).setMessage(res.getString(R.string.mensaje)).show();
        borrar(v);

    }
    public void borrar(View v) {
        plac.setText("");
        preci.setText("");
        marc.setSelection(0);
        model.setSelection(0);
        colo.setSelection(0);

    }

    public int fotoAleatoria(){
        int fotos[] = {R.drawable.images,R.drawable.images2,R.drawable.images3,R.drawable.images4};
        int numero = (int) (Math.random() *3);
        return fotos[numero];
    }

    }


