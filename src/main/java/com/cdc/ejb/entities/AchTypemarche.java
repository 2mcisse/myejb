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
@Table(name = "ach_typemarche")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AchTypemarche.findAll", query = "SELECT a FROM AchTypemarche a")
    , @NamedQuery(name = "AchTypemarche.findByIDType", query = "SELECT a FROM AchTypemarche a WHERE a.iDType = :iDType")
    , @NamedQuery(name = "AchTypemarche.findByLibelle", query = "SELECT a FROM AchTypemarche a WHERE a.libelle = :libelle")
    , @NamedQuery(name = "AchTypemarche.findByGestion", query = "SELECT a FROM AchTypemarche a WHERE a.gestion = :gestion")})
public class AchTypemarche implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDType")
    private Integer iDType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "LIBELLE")
    private String libelle;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDType")
    private List<AchMarches> achMarchesList;
    @OneToMany(mappedBy = "iDType")
    private List<AchLignesplanPassation> achLignesplanPassationList;

    public AchTypemarche() {
    }

    public AchTypemarche(Integer iDType) {
        this.iDType = iDType;
    }

    public AchTypemarche(Integer iDType, String libelle) {
        this.iDType = iDType;
        this.libelle = libelle;
    }

    public Integer getIDType() {
        return iDType;
    }

    public void setIDType(Integer iDType) {
        this.iDType = iDType;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<AchMarches> getAchMarchesList() {
        return achMarchesList;
    }

    public void setAchMarchesList(List<AchMarches> achMarchesList) {
        this.achMarchesList = achMarchesList;
    }

    @XmlTransient
    public List<AchLignesplanPassation> getAchLignesplanPassationList() {
        return achLignesplanPassationList;
    }

    public void setAchLignesplanPassationList(List<AchLignesplanPassation> achLignesplanPassationList) {
        this.achLignesplanPassationList = achLignesplanPassationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDType != null ? iDType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AchTypemarche)) {
            return false;
        }
        AchTypemarche other = (AchTypemarche) object;
        if ((this.iDType == null && other.iDType != null) || (this.iDType != null && !this.iDType.equals(other.iDType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.AchTypemarche[ iDType=" + iDType + " ]";
    }
    
}
