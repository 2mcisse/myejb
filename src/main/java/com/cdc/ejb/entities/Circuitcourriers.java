/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "circuitcourriers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Circuitcourriers.findAll", query = "SELECT c FROM Circuitcourriers c")
    , @NamedQuery(name = "Circuitcourriers.findByNiveauSortie", query = "SELECT c FROM Circuitcourriers c WHERE c.niveauSortie = :niveauSortie")
    , @NamedQuery(name = "Circuitcourriers.findByNiveauEntree", query = "SELECT c FROM Circuitcourriers c WHERE c.niveauEntree = :niveauEntree")
    , @NamedQuery(name = "Circuitcourriers.findByAvis", query = "SELECT c FROM Circuitcourriers c WHERE c.avis = :avis")
    , @NamedQuery(name = "Circuitcourriers.findByGestion", query = "SELECT c FROM Circuitcourriers c WHERE c.gestion = :gestion")
    , @NamedQuery(name = "Circuitcourriers.findById", query = "SELECT c FROM Circuitcourriers c WHERE c.id = :id")})
public class Circuitcourriers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NiveauSortie")
    private short niveauSortie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NiveauEntree")
    private short niveauEntree;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Avis")
    private short avis;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "IDTypeCourriers", referencedColumnName = "IDTypeCourriers")
    @ManyToOne(optional = false)
    private Typecourriers iDTypeCourriers;

    public Circuitcourriers() {
    }

    public Circuitcourriers(Integer id) {
        this.id = id;
    }

    public Circuitcourriers(Integer id, short niveauSortie, short niveauEntree, short avis) {
        this.id = id;
        this.niveauSortie = niveauSortie;
        this.niveauEntree = niveauEntree;
        this.avis = avis;
    }

    public short getNiveauSortie() {
        return niveauSortie;
    }

    public void setNiveauSortie(short niveauSortie) {
        this.niveauSortie = niveauSortie;
    }

    public short getNiveauEntree() {
        return niveauEntree;
    }

    public void setNiveauEntree(short niveauEntree) {
        this.niveauEntree = niveauEntree;
    }

    public short getAvis() {
        return avis;
    }

    public void setAvis(short avis) {
        this.avis = avis;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Typecourriers getIDTypeCourriers() {
        return iDTypeCourriers;
    }

    public void setIDTypeCourriers(Typecourriers iDTypeCourriers) {
        this.iDTypeCourriers = iDTypeCourriers;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Circuitcourriers)) {
            return false;
        }
        Circuitcourriers other = (Circuitcourriers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Circuitcourriers[ id=" + id + " ]";
    }
    
}
