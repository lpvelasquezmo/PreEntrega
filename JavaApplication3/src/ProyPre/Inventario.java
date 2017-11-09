/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyPre;

import java.util.ArrayList;

/**
 *
 * @author Familia Bastidas
 */
public class Inventario {
  private ArrayList<Producto>productos;

    public Inventario(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
 
}
