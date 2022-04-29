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
import javax.persistence.Id;
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
@Table(name = "type_sortie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypeSortie.findAll", query = "SELECT t FROM TypeSortie t")
    , @NamedQuery(name = "TypeSortie.findByIdtypeSortie", query = "SELECT t FROM TypeSortie t WHERE t.idtypeSortie = :idtypeSortie")
    , @NamedQuery(name = "TypeSortie.findByLibelle", query = "SELECT t FROM TypeSortie t WHERE t.libelle = :libelle")
    , @NamedQuery(name = "TypeSortie.findByEtat", query = "SELECT t FROM TypeSortie t WHERE t.etat = :etat")})
public class TypeSortie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTYPE_SORTIE")
    private Integer idtypeSortie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "LIBELLE")
    private String libelle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ETAT")
    private short etat;

    public TypeSortie() {
    }

    public TypeSortie(Integer idtypeSortie) {
        this.idtypeSortie = idtypeSortie;
    }

    public TypeSortie(Integer idtypeSortie, String libelle, short etat) {
        this.idtypeSortie = idtypeSortie;
        this.libelle = libelle;
        this.etat = etat;
    }

    public Integer getIdtypeSortie() {
        return idtypeSortie;
    }

    public void setIdtypeSortie(Integer idtypeSortie) {
        this.idtypeSortie = idtypeSortie;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public short getEtat() {
        return etat;
    }

    public void setEtat(short etat) {
        this.etat = etat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtypeSortie != null ? idtypeSortie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypeSortie)) {
            return false;
        }
        TypeSortie other = (TypeSortie) object;
        if ((this.idtypeSortie == null && other.idtypeSortie != null) || (this.idtypeSortie != null && !this.idtypeSortie.equals(other.idtypeSortie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.TypeSortie[ idtypeSortie=" + idtypeSortie + " ]";
    }
    
}
