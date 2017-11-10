/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

/**
 *
 * @author Familia Bastidas
 */
public class Materia extends Tipo {
    
    public Materia(String nombre, int cantidad, double precio) {
        super(nombre, cantidad, precio);
    }
public void registrarCompras(String nombre, int cantidad,double precio){
int cPed;
cPed=0;
this.cantidad=this.cantidad+cPed;
this.precio=this.precio*cPed;
    }

}
