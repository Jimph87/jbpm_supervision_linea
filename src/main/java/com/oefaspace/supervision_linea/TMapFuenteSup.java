package com.oefaspace.supervision_linea;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class TMapFuenteSup implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "TMAPFUENTESUP_ID_GENERATOR")
    @javax.persistence.Id
    @javax.persistence.SequenceGenerator(name = "TMAPFUENTESUP_ID_GENERATOR", sequenceName = "TMAPFUENTESUP_ID_SEQ")
    private java.lang.Long id;

    public TMapFuenteSup() {
    }
    
    public TMapFuenteSup(java.lang.Long id) {
        this.id = id;
    }

    public java.lang.Long getId() {
        return this.id;
    }
    
    public void setId(java.lang.Long id) {
        this.id = id;
    }




}