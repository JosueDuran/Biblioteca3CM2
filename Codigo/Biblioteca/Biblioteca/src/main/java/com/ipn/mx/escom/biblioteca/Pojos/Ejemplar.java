package com.ipn.mx.escom.biblioteca.Pojos;
// Generated 24/05/2017 04:48:03 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Ejemplar generated by hbm2java
 */
public class Ejemplar  implements java.io.Serializable {


     private int idEjemplar;
     private Estadolibro estadolibro;
     private Libro libro;
     private byte disponibilidad;
     private String observaciones;
     private Integer estadoBorrado;
     private Set DPrestamos = new HashSet(0);
     private Set dmultaejes = new HashSet(0);
     private Set prestamoexternos = new HashSet(0);

    public Ejemplar() {
    }

	
    public Ejemplar(int idEjemplar, Estadolibro estadolibro, Libro libro, byte disponibilidad) {
        this.idEjemplar = idEjemplar;
        this.estadolibro = estadolibro;
        this.libro = libro;
        this.disponibilidad = disponibilidad;
    }
    public Ejemplar(int idEjemplar, Estadolibro estadolibro, Libro libro, byte disponibilidad, String observaciones, Integer estadoBorrado, Set DPrestamos, Set dmultaejes, Set prestamoexternos) {
       this.idEjemplar = idEjemplar;
       this.estadolibro = estadolibro;
       this.libro = libro;
       this.disponibilidad = disponibilidad;
       this.observaciones = observaciones;
       this.estadoBorrado = estadoBorrado;
       this.DPrestamos = DPrestamos;
       this.dmultaejes = dmultaejes;
       this.prestamoexternos = prestamoexternos;
    }
   
    public int getIdEjemplar() {
        return this.idEjemplar;
    }
    
    public void setIdEjemplar(int idEjemplar) {
        this.idEjemplar = idEjemplar;
    }
    public Estadolibro getEstadolibro() {
        return this.estadolibro;
    }
    
    public void setEstadolibro(Estadolibro estadolibro) {
        this.estadolibro = estadolibro;
    }
    public Libro getLibro() {
        return this.libro;
    }
    
    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    public byte getDisponibilidad() {
        return this.disponibilidad;
    }
    
    public void setDisponibilidad(byte disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public Integer getEstadoBorrado() {
        return this.estadoBorrado;
    }
    
    public void setEstadoBorrado(Integer estadoBorrado) {
        this.estadoBorrado = estadoBorrado;
    }
    public Set getDPrestamos() {
        return this.DPrestamos;
    }
    
    public void setDPrestamos(Set DPrestamos) {
        this.DPrestamos = DPrestamos;
    }
    public Set getDmultaejes() {
        return this.dmultaejes;
    }
    
    public void setDmultaejes(Set dmultaejes) {
        this.dmultaejes = dmultaejes;
    }
    public Set getPrestamoexternos() {
        return this.prestamoexternos;
    }
    
    public void setPrestamoexternos(Set prestamoexternos) {
        this.prestamoexternos = prestamoexternos;
    }




}


