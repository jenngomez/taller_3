package com.yenifergomez.dominio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Mercado {

    private String nombreSupermercadoYG;
    public List<Producto> productosYG;
    public static final byte CAPACIDAD_YG = 89;

    public Mercado(String nombreSupermercadoYG) {
        this.nombreSupermercadoYG = nombreSupermercadoYG;
        this.productosYG = new ArrayList<>();
    }

    /*public boolean agregar(Producto p){

        int clave = p.getCodigoYG();

        if (!productosYG.contains(clave)){
            System.out.println("El producto ya se encuentra registrado");
            return false;
        } else if (productosYG.size()>=CAPACIDAD_YG) {
            System.out.println("La capacidad del producto ha llegado a su limite");
            return false;

        }else {
            productosYG.add(p);
            System.out.println("Se ha agregado el producto "
                    + p.getNombreYG() + " al supermercado " + getNombreSupermercadoYG());
            return true;
        }
    }*/

    public boolean agregar(Producto p){
        for(Producto producto : productosYG){
            if (producto.getCodigoYG() == p.getCodigoYG()){
                System.out.println("\nEl producto ya se encuentra registrado");
                return false;
            }
        }

        if (productosYG.size() >= CAPACIDAD_YG){
            System.out.println("\nLa capacidad del producto ha llegado a su limite");
            return false;
        }

        productosYG.add(p);
        System.out.println("\nSe ha agregado el producto "
                + p.getNombreYG() + " al supermercado " + getNombreSupermercadoYG());
        return true;
    }

    public boolean retirar(String nombre){

        for (Producto pdto : productosYG){
            if (pdto.getNombreYG().equals(nombre)&&
            pdto.getCantidadYG()>0){
                byte cantidadYG=(byte) (pdto.getCantidadYG()-1);
                pdto.setCantidadYG(cantidadYG);
                System.out.println("\nEl producto "+ nombre + " se ha retirado correctamente");
                return true;
            }
        }
        System.out.println("\nEl producto " + nombre + " no disponible en el supermercado"
        );
        return false;
    }

    /*public Producto buscar(String nombre){

        Producto p;
        if (productosYG.contains(nombre)){
            p=(Producto) productosYG.get(Integer.parseInt(nombre));

            System.out.println("Articulo encontrado");
            return p;
        }else {
            System.out.println("Articulo no encontrado");
        }
        return null;
    }*/

    public Producto buscar(String nombre){
        for (Producto pdto : productosYG){
            if (pdto.getNombreYG().equals(nombre)){
                System.out.println("\nEl producto " + nombre
                        + " está en el inventario del supermercado " + getNombreSupermercadoYG());
                return pdto;
            }
        }
        System.out.println("\nEl producto " + nombre
                + "no está en el inventario del supermercado " + getNombreSupermercadoYG());
        return null;
    }

    public Producto buscar(int codigo){
        for (Producto pdto : productosYG){
            if (pdto.getCodigoYG()==codigo){
                System.out.println("\nEl producto con el código " + codigo
                        + " buscado, se encuentra disponible en el supermercado " + getNombreSupermercadoYG());
                return pdto;
            }
        }
        System.out.println("\nEl producto con el código " + codigo
                + " buscado, no se ecuentra en el supermercado " + getNombreSupermercadoYG());
        return null;
    }

    public List<Producto> buscarTipo(String tipo){
        List<Producto> productosExistentes=new ArrayList<>();
        productosYG.forEach(pdto -> {
            if (pdto.getTipoYG().equals(tipo)){
                productosExistentes.add(pdto);
                System.out.println(pdto.getNombreYG());
            }
        });return productosExistentes;
    }

    public int calcularTotal(){
        int total=0;

        for (Producto pdto:productosYG){
            int cantidad = pdto.getCantidadYG();
            int precio=pdto.getPrecioYG();
            int totalUnProducto;

            totalUnProducto = precio*cantidad;
            total+= totalUnProducto;


        }
        return total;

    }

    public String getNombreSupermercadoYG() {
        return nombreSupermercadoYG;
    }

    public List<Producto> getProductosYG() {
        return productosYG;
    }

    public void setProductosYG(List<Producto> productosYG) {
        this.productosYG = productosYG;
    }
}
