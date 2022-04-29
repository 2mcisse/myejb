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
@Table(name = "categoriestiers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categoriestiers.findAll", query = "SELECT c FROM Categoriestiers c")
    , @NamedQuery(name = "Categoriestiers.findByIDCategoriesTiers", query = "SELECT c FROM Categoriestiers c WHERE c.iDCategoriesTiers = :iDCategoriesTiers")
    , @NamedQuery(name = "Categoriestiers.findByCode", query = "SELECT c FROM Categoriestiers c WHERE c.code = :code")
    , @NamedQuery(name = "Categoriestiers.findByNom", query = "SELECT c FROM Categoriestiers c WHERE c.nom = :nom")
    , @NamedQuery(name = "Categoriestiers.findByGestion", query = "SELECT c FROM Categoriestiers c WHERE c.gestion = :gestion")})
public class Categoriestiers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCategoriesTiers")
    private Integer iDCategoriesTiers;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Nom")
    private String nom;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDCategoriesTiers")
    private List<Tiers> tiersList;
    @OneToMany(mappedBy = "iDCategoriesTiers")
    private List<DecTypeaffaire> decTypeaffaireList;

    public Categoriestiers() {
    }

    public Categoriestiers(Integer iDCategoriesTiers) {
        this.iDCategoriesTiers = iDCategoriesTiers;
    }

    public Categoriestiers(Integer iDCategoriesTiers, String code, String nom) {
        this.iDCategoriesTiers = iDCategoriesTiers;
        this.code = code;
        this.nom = nom;
    }

    public Integer getIDCategoriesTiers() {
        return iDCategoriesTiers;
    }

    public void setIDCategoriesTiers(Integer iDCategoriesTiers) {
        this.iDCategoriesTiers = iDCategoriesTiers;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<Tiers> getTiersList() {
        return tiersList;
    }

    public void setTiersList(List<Tiers> tiersList) {
        this.tiersList = tiersList;
    }

    @XmlTransient
    public List<DecTypeaffaire> getDecTypeaffaireList() {
        return decTypeaffaireList;
    }

    public void setDecTypeaffaireList(List<DecTypeaffaire> decTypeaffaireList) {
        this.decTypeaffaireList = decTypeaffaireList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDCategoriesTiers != null ? iDCategoriesTiers.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categoriestiers)) {
            return false;
        }
        Categoriestiers other = (Categoriestiers) object;
        if ((this.iDCategoriesTiers == null && other.iDCategoriesTiers != null) || (this.iDCategoriesTiers != null && !this.iDCategoriesTiers.equals(other.iDCategoriesTiers))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Categoriestiers[ iDCategoriesTiers=" + iDCategoriesTiers + " ]";
    }
    
}
