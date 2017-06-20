package com.ipn.mx.escom.biblioteca.Pojos;
// Generated 24/05/2017 04:48:03 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Delegacion generated by hbm2java
 */
public class Delegacion  implements java.io.Serializable {


     private int idDelegacion;
     private String nombreDel;
     private Set colonias = new HashSet(0);

    public Delegacion() {
    }

	
    public Delegacion(int idDelegacion, String nombreDel) {
        this.idDelegacion = idDelegacion;
        this.nombreDel = nombreDel;
    }
    public Delegacion(int idDelegacion, String nombreDel, Set colonias) {
       this.idDelegacion = idDelegacion;
       this.nombreDel = nombreDel;
       this.colonias = colonias;
    }
   
    public int getIdDelegacion() {
        return this.idDelegacion;
    }
    
    public void setIdDelegacion(int idDelegacion) {
        this.idDelegacion = idDelegacion;
    }
    public String getNombreDel() {
        return this.nombreDel;
    }
    
    public void setNombreDel(String nombreDel) {
        this.nombreDel = nombreDel;
    }
    public Set getColonias() {
        return this.colonias;
    }
    
    public void setColonias(Set colonias) {
        this.colonias = colonias;
    }




}


