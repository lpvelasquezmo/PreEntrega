package Contabilidad;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MARIAJOSE
 */
public class Proveedor extends Tercero {
    private String vendedor; 
    public Proveedor(String nombreTercero, int cedulaNit, String direccion, String telefono, String vendedor) {
        super(nombreTercero, cedulaNit, direccion, telefono);
        this.vendedor = vendedor;
    }
    
}
