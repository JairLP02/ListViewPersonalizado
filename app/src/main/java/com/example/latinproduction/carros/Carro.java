package com.example.latinproduction.carros;

/**
 * Created by Latin Production on 10/05/2017.
 */

public class Carro {
    private String foto;
    private String marca;
    private String placa;
    private String modelo;
    private String color;
    private int precio;

    public Carro(String foto, String marca, String placa, String modelo, String color, int precio) {
        this.foto = foto;
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void guardar(){
        Datos.guardar(this);
    }
}
