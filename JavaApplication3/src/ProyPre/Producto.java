/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyPre;

/**
 *
 * @author Familia Bastidas
 */
public class Producto {
protected int numero;
protected String nombre;
protected int cantidad;

    public Producto(int numero, String nombre, int cantidad) {
        this.numero = numero;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void addProduct(Producto producto){
        this.productos.set(this.numero,producto);
        this.numero++;
    

    }
    
    public void deleteProduct(Producto producto){

        this.productos.set(this.numero,this.cantidad,this.nombre);
        this.numero--;

    }
    public boolean Ccantidad(String nombre, int cantidad,int nuevaCantidad){
        if (cantidad==this.cantidad){
        this.cantidad=nuevaCantidad;
        return true;}
        else{return false;
        }

    }
}
