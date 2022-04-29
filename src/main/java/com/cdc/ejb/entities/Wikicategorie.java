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
@Table(name = "wikicategorie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Wikicategorie.findAll", query = "SELECT w FROM Wikicategorie w")
    , @NamedQuery(name = "Wikicategorie.findByIDWIKICategorie", query = "SELECT w FROM Wikicategorie w WHERE w.iDWIKICategorie = :iDWIKICategorie")
    , @NamedQuery(name = "Wikicategorie.findByLibelle", query = "SELECT w FROM Wikicategorie w WHERE w.libelle = :libelle")
    , @NamedQuery(name = "Wikicategorie.findByIDWIKICategorieParent", query = "SELECT w FROM Wikicategorie w WHERE w.iDWIKICategorieParent = :iDWIKICategorieParent")})
public class Wikicategorie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDWIKICategorie")
    private Integer iDWIKICategorie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "Libelle")
    private String libelle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDWIKICategorieParent")
    private int iDWIKICategorieParent;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDWIKICategorie")
    private List<Wiki> wikiList;

    public Wikicategorie() {
    }

    public Wikicategorie(Integer iDWIKICategorie) {
        this.iDWIKICategorie = iDWIKICategorie;
    }

    public Wikicategorie(Integer iDWIKICategorie, String libelle, int iDWIKICategorieParent) {
        this.iDWIKICategorie = iDWIKICategorie;
        this.libelle = libelle;
        this.iDWIKICategorieParent = iDWIKICategorieParent;
    }

    public Integer getIDWIKICategorie() {
        return iDWIKICategorie;
    }

    public void setIDWIKICategorie(Integer iDWIKICategorie) {
        this.iDWIKICategorie = iDWIKICategorie;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getIDWIKICategorieParent() {
        return iDWIKICategorieParent;
    }

    public void setIDWIKICategorieParent(int iDWIKICategorieParent) {
        this.iDWIKICategorieParent = iDWIKICategorieParent;
    }

    @XmlTransient
    public List<Wiki> getWikiList() {
        return wikiList;
    }

    public void setWikiList(List<Wiki> wikiList) {
        this.wikiList = wikiList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDWIKICategorie != null ? iDWIKICategorie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Wikicategorie)) {
            return false;
        }
        Wikicategorie other = (Wikicategorie) object;
        if ((this.iDWIKICategorie == null && other.iDWIKICategorie != null) || (this.iDWIKICategorie != null && !this.iDWIKICategorie.equals(other.iDWIKICategorie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Wikicategorie[ iDWIKICategorie=" + iDWIKICategorie + " ]";
    }
    
}
