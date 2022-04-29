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
@Table(name = "type_entree")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypeEntree.findAll", query = "SELECT t FROM TypeEntree t")
    , @NamedQuery(name = "TypeEntree.findByLibelle", query = "SELECT t FROM TypeEntree t WHERE t.libelle = :libelle")
    , @NamedQuery(name = "TypeEntree.findByIdtypeEntree", query = "SELECT t FROM TypeEntree t WHERE t.idtypeEntree = :idtypeEntree")
    , @NamedQuery(name = "TypeEntree.findByEtat", query = "SELECT t FROM TypeEntree t WHERE t.etat = :etat")})
public class TypeEntree implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "LIBELLE")
    private String libelle;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTYPE_ENTREE")
    private Integer idtypeEntree;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ETAT")
    private short etat;

    public TypeEntree() {
    }

    public TypeEntree(Integer idtypeEntree) {
        this.idtypeEntree = idtypeEntree;
    }

    public TypeEntree(Integer idtypeEntree, String libelle, short etat) {
        this.idtypeEntree = idtypeEntree;
        this.libelle = libelle;
        this.etat = etat;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Integer getIdtypeEntree() {
        return idtypeEntree;
    }

    public void setIdtypeEntree(Integer idtypeEntree) {
        this.idtypeEntree = idtypeEntree;
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
        hash += (idtypeEntree != null ? idtypeEntree.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypeEntree)) {
            return false;
        }
        TypeEntree other = (TypeEntree) object;
        if ((this.idtypeEntree == null && other.idtypeEntree != null) || (this.idtypeEntree != null && !this.idtypeEntree.equals(other.idtypeEntree))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.TypeEntree[ idtypeEntree=" + idtypeEntree + " ]";
    }
    
}
