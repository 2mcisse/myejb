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
@Table(name = "type_locaux")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypeLocaux.findAll", query = "SELECT t FROM TypeLocaux t")
    , @NamedQuery(name = "TypeLocaux.findByIdtypeLocaux", query = "SELECT t FROM TypeLocaux t WHERE t.idtypeLocaux = :idtypeLocaux")
    , @NamedQuery(name = "TypeLocaux.findByLibelle", query = "SELECT t FROM TypeLocaux t WHERE t.libelle = :libelle")
    , @NamedQuery(name = "TypeLocaux.findByEtat", query = "SELECT t FROM TypeLocaux t WHERE t.etat = :etat")})
public class TypeLocaux implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTYPE_LOCAUX")
    private Integer idtypeLocaux;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "LIBELLE")
    private String libelle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ETAT")
    private short etat;

    public TypeLocaux() {
    }

    public TypeLocaux(Integer idtypeLocaux) {
        this.idtypeLocaux = idtypeLocaux;
    }

    public TypeLocaux(Integer idtypeLocaux, String libelle, short etat) {
        this.idtypeLocaux = idtypeLocaux;
        this.libelle = libelle;
        this.etat = etat;
    }

    public Integer getIdtypeLocaux() {
        return idtypeLocaux;
    }

    public void setIdtypeLocaux(Integer idtypeLocaux) {
        this.idtypeLocaux = idtypeLocaux;
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
        hash += (idtypeLocaux != null ? idtypeLocaux.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypeLocaux)) {
            return false;
        }
        TypeLocaux other = (TypeLocaux) object;
        if ((this.idtypeLocaux == null && other.idtypeLocaux != null) || (this.idtypeLocaux != null && !this.idtypeLocaux.equals(other.idtypeLocaux))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.TypeLocaux[ idtypeLocaux=" + idtypeLocaux + " ]";
    }
    
}
