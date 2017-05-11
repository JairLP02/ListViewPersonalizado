package com.example.latinproduction.carros;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by soporte on 02/05/2017.
 */

public class AdaptadorCarro extends BaseAdapter {
    private Context contexto;
    private ArrayList<Carro> carros;

    public AdaptadorCarro(Context contexto, ArrayList<Carro> carros){
        this.contexto=contexto;
        this.carros=carros;
    }

    @Override
    public int getCount() {
        return carros.size();
    }

    @Override
    public Object getItem(int position) {
        return carros.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View View, ViewGroup viewGroup) {
        //Declarar variables
        TextView placa,marca,modelo,color,precio;
        ImageView foto;
        LayoutInflater inflater;
        View itemView;

        inflater = (LayoutInflater)contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        itemView = inflater.inflate(R.layout.item_carro,null);
        foto = (ImageView)itemView.findViewById(R.id.imgFoto);
        marca = (TextView)itemView.findViewById(R.id.txtMarcaa);
        placa = (TextView)itemView.findViewById(R.id.txtPlacaa);
        modelo = (TextView)itemView.findViewById(R.id.txtModeloo);
        color = (TextView)itemView.findViewById(R.id.txtColor);
        precio = (TextView)itemView.findViewById(R.id.txtPrecioo);


        foto.setImageResource(Integer.parseInt(carros.get(position).getFoto()));
        marca.setText(carros.get(position).getMarca());
        placa.setText(carros.get(position).getPlaca());
        modelo.setText(carros.get(position).getModelo());
        color.setText(carros.get(position).getColor());
        precio.setText(""+carros.get(position).getPrecio());


        return itemView;
    }
}
