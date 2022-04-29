/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "typecourriers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Typecourriers.findAll", query = "SELECT t FROM Typecourriers t")
    , @NamedQuery(name = "Typecourriers.findByIDTypeCourriers", query = "SELECT t FROM Typecourriers t WHERE t.iDTypeCourriers = :iDTypeCourriers")
    , @NamedQuery(name = "Typecourriers.findByLibelle", query = "SELECT t FROM Typecourriers t WHERE t.libelle = :libelle")})
public class Typecourriers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTypeCourriers")
    private Integer iDTypeCourriers;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "LIBELLE")
    private String libelle;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDTypeCourriers")
    private List<Courriers> courriersList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDTypeCourriers")
    private List<GroupeEtapes> groupeEtapesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDTypeCourriers")
    private List<Circuitcourriers> circuitcourriersList;

    public Typecourriers() {
    }

    public Typecourriers(Integer iDTypeCourriers) {
        this.iDTypeCourriers = iDTypeCourriers;
    }

    public Typecourriers(Integer iDTypeCourriers, String libelle) {
        this.iDTypeCourriers = iDTypeCourriers;
        this.libelle = libelle;
    }

    public Integer getIDTypeCourriers() {
        return iDTypeCourriers;
    }

    public void setIDTypeCourriers(Integer iDTypeCourriers) {
        this.iDTypeCourriers = iDTypeCourriers;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @XmlTransient
    public List<Courriers> getCourriersList() {
        return courriersList;
    }

    public void setCourriersList(List<Courriers> courriersList) {
        this.courriersList = courriersList;
    }

    @XmlTransient
    public List<GroupeEtapes> getGroupeEtapesList() {
        return groupeEtapesList;
    }

    public void setGroupeEtapesList(List<GroupeEtapes> groupeEtapesList) {
        this.groupeEtapesList = groupeEtapesList;
    }

    @XmlTransient
    public List<Circuitcourriers> getCircuitcourriersList() {
        return circuitcourriersList;
    }

    public void setCircuitcourriersList(List<Circuitcourriers> circuitcourriersList) {
        this.circuitcourriersList = circuitcourriersList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDTypeCourriers != null ? iDTypeCourriers.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Typecourriers)) {
            return false;
        }
        Typecourriers other = (Typecourriers) object;
        if ((this.iDTypeCourriers == null && other.iDTypeCourriers != null) || (this.iDTypeCourriers != null && !this.iDTypeCourriers.equals(other.iDTypeCourriers))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Typecourriers[ iDTypeCourriers=" + iDTypeCourriers + " ]";
    }
    
}
