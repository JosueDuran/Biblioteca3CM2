package com.ipn.mx.escom.biblioteca.Pojos;
// Generated 24/05/2017 04:48:03 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Estadoelemnto generated by hbm2java
 */
public class Estadoelemnto  implements java.io.Serializable {


     private int idEdoElemnto;
     private String edoElem;
     private Set elementos = new HashSet(0);

    public Estadoelemnto() {
    }

	
    public Estadoelemnto(int idEdoElemnto, String edoElem) {
        this.idEdoElemnto = idEdoElemnto;
        this.edoElem = edoElem;
    }
    public Estadoelemnto(int idEdoElemnto, String edoElem, Set elementos) {
       this.idEdoElemnto = idEdoElemnto;
       this.edoElem = edoElem;
       this.elementos = elementos;
    }
   
    public int getIdEdoElemnto() {
        return this.idEdoElemnto;
    }
    
    public void setIdEdoElemnto(int idEdoElemnto) {
        this.idEdoElemnto = idEdoElemnto;
    }
    public String getEdoElem() {
        return this.edoElem;
    }
    
    public void setEdoElem(String edoElem) {
        this.edoElem = edoElem;
    }
    public Set getElementos() {
        return this.elementos;
    }
    
    public void setElementos(Set elementos) {
        this.elementos = elementos;
    }




}


