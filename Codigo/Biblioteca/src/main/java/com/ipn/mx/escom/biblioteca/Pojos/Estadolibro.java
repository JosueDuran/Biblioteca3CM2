package com.ipn.mx.escom.biblioteca.Pojos;
// Generated 24/05/2017 04:48:03 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Estadolibro generated by hbm2java
 */
public class Estadolibro  implements java.io.Serializable {


     private int idEdoLibro;
     private String edoLibro;
     private Set ejemplars = new HashSet(0);

    public Estadolibro() {
    }

	
    public Estadolibro(int idEdoLibro, String edoLibro) {
        this.idEdoLibro = idEdoLibro;
        this.edoLibro = edoLibro;
    }
    public Estadolibro(int idEdoLibro, String edoLibro, Set ejemplars) {
       this.idEdoLibro = idEdoLibro;
       this.edoLibro = edoLibro;
       this.ejemplars = ejemplars;
    }
   
    public int getIdEdoLibro() {
        return this.idEdoLibro;
    }
    
    public void setIdEdoLibro(int idEdoLibro) {
        this.idEdoLibro = idEdoLibro;
    }
    public String getEdoLibro() {
        return this.edoLibro;
    }
    
    public void setEdoLibro(String edoLibro) {
        this.edoLibro = edoLibro;
    }
    public Set getEjemplars() {
        return this.ejemplars;
    }
    
    public void setEjemplars(Set ejemplars) {
        this.ejemplars = ejemplars;
    }




}


