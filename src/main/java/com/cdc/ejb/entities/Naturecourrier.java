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
@Table(name = "naturecourrier")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Naturecourrier.findAll", query = "SELECT n FROM Naturecourrier n")
    , @NamedQuery(name = "Naturecourrier.findByIDNatureCourrier", query = "SELECT n FROM Naturecourrier n WHERE n.iDNatureCourrier = :iDNatureCourrier")
    , @NamedQuery(name = "Naturecourrier.findByLibelle", query = "SELECT n FROM Naturecourrier n WHERE n.libelle = :libelle")})
public class Naturecourrier implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDNatureCourrier")
    private Integer iDNatureCourrier;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "LIBELLE")
    private String libelle;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDNatureCourrier")
    private List<Courriers> courriersList;

    public Naturecourrier() {
    }

    public Naturecourrier(Integer iDNatureCourrier) {
        this.iDNatureCourrier = iDNatureCourrier;
    }

    public Naturecourrier(Integer iDNatureCourrier, String libelle) {
        this.iDNatureCourrier = iDNatureCourrier;
        this.libelle = libelle;
    }

    public Integer getIDNatureCourrier() {
        return iDNatureCourrier;
    }

    public void setIDNatureCourrier(Integer iDNatureCourrier) {
        this.iDNatureCourrier = iDNatureCourrier;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDNatureCourrier != null ? iDNatureCourrier.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Naturecourrier)) {
            return false;
        }
        Naturecourrier other = (Naturecourrier) object;
        if ((this.iDNatureCourrier == null && other.iDNatureCourrier != null) || (this.iDNatureCourrier != null && !this.iDNatureCourrier.equals(other.iDNatureCourrier))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Naturecourrier[ iDNatureCourrier=" + iDNatureCourrier + " ]";
    }
    
}
