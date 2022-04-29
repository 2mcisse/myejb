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
@Table(name = "categorie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categorie.findAll", query = "SELECT c FROM Categorie c")
    , @NamedQuery(name = "Categorie.findByLibcategorie", query = "SELECT c FROM Categorie c WHERE c.libcategorie = :libcategorie")})
public class Categorie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "Libcategorie")
    private String libcategorie;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "libcategorie")
    private List<Produit> produitList;

    public Categorie() {
    }

    public Categorie(String libcategorie) {
        this.libcategorie = libcategorie;
    }

    public String getLibcategorie() {
        return libcategorie;
    }

    public void setLibcategorie(String libcategorie) {
        this.libcategorie = libcategorie;
    }

    @XmlTransient
    public List<Produit> getProduitList() {
        return produitList;
    }

    public void setProduitList(List<Produit> produitList) {
        this.produitList = produitList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (libcategorie != null ? libcategorie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categorie)) {
            return false;
        }
        Categorie other = (Categorie) object;
        if ((this.libcategorie == null && other.libcategorie != null) || (this.libcategorie != null && !this.libcategorie.equals(other.libcategorie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Categorie[ libcategorie=" + libcategorie + " ]";
    }
    
}
