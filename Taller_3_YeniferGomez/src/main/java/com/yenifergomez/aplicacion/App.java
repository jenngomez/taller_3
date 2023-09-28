package com.yenifergomez.aplicacion;

import com.yenifergomez.dominio.Mercado;
import com.yenifergomez.dominio.Producto;
import com.yenifergomez.dominio.TipoProducto;

import java.util.List;

public class App {
    public static void main(String[] args) {

        Mercado mercado = new Mercado("Simona");

        Producto producto1 = new Producto(1,"Milanesa de Cerdo",16,10000, TipoProducto.CARNE_YG);
        Producto producto2 = new Producto(2,"Tomate",30,2000, TipoProducto.VERDURA_YG);
        Producto producto3 = new Producto(3,"Leche Auralac",20,4000, TipoProducto.LACTEO_YG);
        Producto producto4 = new Producto(4,"Fresas",50,7000, TipoProducto.FRUTA_YG);
        Producto producto5 = new Producto(5,"Pan Galleta",13,1000, TipoProducto.PAN_YG);
        Producto producto6 = new Producto(6,"Detergente líquido",25,8000, TipoProducto.DETERGENTE_YG);
        Producto producto7 = new Producto(7,"Jabon Dove",45,3000, TipoProducto.JABON_YG);
        Producto producto8 = new Producto(8,"Cereal en hojuelas",5,15000, TipoProducto.CEREAL_YG);
        Producto producto9 = new Producto(9,"Peras",10,1800, TipoProducto.FRUTA_YG);
        Producto producto10 = new Producto(10,"Manzanas",8,2000, TipoProducto.FRUTA_YG);

        System.out.println("\nBienvenidos al supermercado " + mercado.getNombreSupermercadoYG());

        mercado.agregar(producto1);
        mercado.agregar(producto2);
        mercado.agregar(producto3);
        mercado.agregar(producto4);
        mercado.agregar(producto5);
        mercado.agregar(producto6);
        mercado.agregar(producto7);
        mercado.agregar(producto8);
        mercado.agregar(producto9);
        mercado.agregar(producto10);




        mercado.retirar("Milanesa de Cerdo");

        mercado.buscar("Tomate");

        mercado.buscar(5);

        System.out.println("\nLos productos existentes con el mismo tipo son: ");
        List<Producto> productosExistentes = mercado.buscarTipo(TipoProducto.FRUTA_YG);


        int total=mercado.calcularTotal();
        System.out.println("\nEl precio total de todos los productos es: $" + total);



    }
}
