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
public abstract class Tercero {
    protected String nombreTercero;
    protected int cedulaNit;
    protected String direccion;
    protected String telefono;

    public Tercero(String nombreTercero, int cedulaNit, String direccion, String telefono) {
        this.nombreTercero = nombreTercero;
        this.cedulaNit = cedulaNit;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombreTercero() {
        return nombreTercero;
    }

    public void setNombreTercero(String nombreTercero) {
        this.nombreTercero = nombreTercero;
    }

    public int getCedulaNit() {
        return cedulaNit;
    }

    public void setCedulaNit(int cedulaNit) {
        this.cedulaNit = cedulaNit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    protected Tercero stringToTercero( ){
        return null;
       
        
    }
}
