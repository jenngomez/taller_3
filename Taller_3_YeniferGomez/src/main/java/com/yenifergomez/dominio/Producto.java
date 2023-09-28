package com.yenifergomez.dominio;

public class Producto {
    private int codigoYG;
    private String nombreYG;
    private int cantidadYG;
    private int precioYG;
    private String tipoYG;

    public Producto(int codigoYG, String nombreYG, int cantidadYG, int precioYG, String tipoYG) {
        this.codigoYG = codigoYG;
        this.nombreYG = nombreYG;
        this.cantidadYG = cantidadYG;
        this.precioYG = precioYG;
        this.tipoYG = tipoYG;
    }

    public int getCodigoYG() {
        return codigoYG;
    }

    public String getNombreYG() {
        return nombreYG;
    }

    public int getCantidadYG() {
        return cantidadYG;
    }

    public int getPrecioYG() {
        return precioYG;
    }

    public String getTipoYG() {
        return tipoYG;
    }

    public void setCantidadYG(int cantidadYG) {
        this.cantidadYG = cantidadYG;
    }
}
