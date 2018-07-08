package com.ipn.mx.escom.biblioteca.Pojos;
// Generated 24/05/2017 04:48:03 AM by Hibernate Tools 4.3.1



/**
 * Computo generated by hbm2java
 */
public class Computo  implements java.io.Serializable {


     private int idComputadora;
     private Elemento elemento;
     private String noSerieMonitor;
     private String noSerieCpu;
     private String noSerieTeclado;
     private String noSerieMouse;
     private double precioCpu;
     private String precioMonitor;
     private String precioMouse;
     private String precioTeclado;
     private Integer estadoBorrado;

    public Computo() {
    }

	
    public Computo(int idComputadora, String noSerieMonitor, String noSerieCpu, String noSerieTeclado, String noSerieMouse, double precioCpu, String precioMonitor, String precioMouse, String precioTeclado) {
        this.idComputadora = idComputadora;
        this.noSerieMonitor = noSerieMonitor;
        this.noSerieCpu = noSerieCpu;
        this.noSerieTeclado = noSerieTeclado;
        this.noSerieMouse = noSerieMouse;
        this.precioCpu = precioCpu;
        this.precioMonitor = precioMonitor;
        this.precioMouse = precioMouse;
        this.precioTeclado = precioTeclado;
    }
    public Computo(int idComputadora, Elemento elemento, String noSerieMonitor, String noSerieCpu, String noSerieTeclado, String noSerieMouse, double precioCpu, String precioMonitor, String precioMouse, String precioTeclado, Integer estadoBorrado) {
       this.idComputadora = idComputadora;
       this.elemento = elemento;
       this.noSerieMonitor = noSerieMonitor;
       this.noSerieCpu = noSerieCpu;
       this.noSerieTeclado = noSerieTeclado;
       this.noSerieMouse = noSerieMouse;
       this.precioCpu = precioCpu;
       this.precioMonitor = precioMonitor;
       this.precioMouse = precioMouse;
       this.precioTeclado = precioTeclado;
       this.estadoBorrado = estadoBorrado;
    }
   
    public int getIdComputadora() {
        return this.idComputadora;
    }
    
    public void setIdComputadora(int idComputadora) {
        this.idComputadora = idComputadora;
    }
    public Elemento getElemento() {
        return this.elemento;
    }
    
    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }
    public String getNoSerieMonitor() {
        return this.noSerieMonitor;
    }
    
    public void setNoSerieMonitor(String noSerieMonitor) {
        this.noSerieMonitor = noSerieMonitor;
    }
    public String getNoSerieCpu() {
        return this.noSerieCpu;
    }
    
    public void setNoSerieCpu(String noSerieCpu) {
        this.noSerieCpu = noSerieCpu;
    }
    public String getNoSerieTeclado() {
        return this.noSerieTeclado;
    }
    
    public void setNoSerieTeclado(String noSerieTeclado) {
        this.noSerieTeclado = noSerieTeclado;
    }
    public String getNoSerieMouse() {
        return this.noSerieMouse;
    }
    
    public void setNoSerieMouse(String noSerieMouse) {
        this.noSerieMouse = noSerieMouse;
    }
    public double getPrecioCpu() {
        return this.precioCpu;
    }
    
    public void setPrecioCpu(double precioCpu) {
        this.precioCpu = precioCpu;
    }
    public String getPrecioMonitor() {
        return this.precioMonitor;
    }
    
    public void setPrecioMonitor(String precioMonitor) {
        this.precioMonitor = precioMonitor;
    }
    public String getPrecioMouse() {
        return this.precioMouse;
    }
    
    public void setPrecioMouse(String precioMouse) {
        this.precioMouse = precioMouse;
    }
    public String getPrecioTeclado() {
        return this.precioTeclado;
    }
    
    public void setPrecioTeclado(String precioTeclado) {
        this.precioTeclado = precioTeclado;
    }
    public Integer getEstadoBorrado() {
        return this.estadoBorrado;
    }
    
    public void setEstadoBorrado(Integer estadoBorrado) {
        this.estadoBorrado = estadoBorrado;
    }




}

