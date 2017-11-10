/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import java.util.ArrayList;

/**
 *
 * @author Familia Bastidas
 */
public class Tipo {
protected String nombre;
protected int cantidad;
protected double precio;
protected ArrayList<Tipo>tipos;

    public Tipo(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public boolean añadir(Tipo tipo){
    return this.tipos.add(tipo);
    }
    public void eliminar(Tipo tipo){
    if(this.nombre.equals(nombre)){
    this.tipos=null;
    }
    else{
        System.out.println("No existe este elemento en el inventario");
    }
    }
}