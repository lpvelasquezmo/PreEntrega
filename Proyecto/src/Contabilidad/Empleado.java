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
public class Empleado extends Tercero {
    private String fechaNacimiento;
    private String tipoContrato;
    private String eps;
    private String arp;
    private String cajaCompensacion;
    private String arl;
    
    public Empleado (String nombreTercero, int cedulaNit, String direccion, String telefono,
            String fechaNacimiento,String tipoContrato, String eps, String arp, 
            String cajaCompensacion, String arl) {
        super(nombreTercero, cedulaNit, direccion, telefono);
        this.fechaNacimiento= fechaNacimiento;
        this.tipoContrato = tipoContrato;
        this.eps = eps;
        this.arp = arp;
        this.cajaCompensacion= cajaCompensacion;
        this.arl = arl;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getArp() {
        return arp;
    }

    public void setArp(String arp) {
        this.arp = arp;
    }

    public String getCajaCompensacion() {
        return cajaCompensacion;
    }

    public void setCajaCompensacion(String cajaCompensacion) {
        this.cajaCompensacion = cajaCompensacion;
    }

    public String getArl() {
        return arl;
    }

    public void setArl(String arl) {
        this.arl = arl;
    }
    
}
