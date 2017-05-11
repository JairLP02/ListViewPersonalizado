package com.example.latinproduction.carros;

import java.util.ArrayList;

/**
 * Created by Latin Production on 10/05/2017.
 */

public class Datos {
    private static ArrayList<Carro> carros = new ArrayList<>();

    public static void guardar(Carro c){
        carros.add(c);
    }

    public static ArrayList<Carro> getCarros() {
        return carros;
    }
}
