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
@Table(name = "locaux")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Locaux.findAll", query = "SELECT l FROM Locaux l")
    , @NamedQuery(name = "Locaux.findByIdlocaux", query = "SELECT l FROM Locaux l WHERE l.idlocaux = :idlocaux")
    , @NamedQuery(name = "Locaux.findByCode", query = "SELECT l FROM Locaux l WHERE l.code = :code")
    , @NamedQuery(name = "Locaux.findByLibelle", query = "SELECT l FROM Locaux l WHERE l.libelle = :libelle")
    , @NamedQuery(name = "Locaux.findByIdtypeLocaux", query = "SELECT l FROM Locaux l WHERE l.idtypeLocaux = :idtypeLocaux")
    , @NamedQuery(name = "Locaux.findByIdetatges", query = "SELECT l FROM Locaux l WHERE l.idetatges = :idetatges")})
public class Locaux implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDLOCAUX")
    private Integer idlocaux;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CODE")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "LIBELLE")
    private String libelle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTYPE_LOCAUX")
    private int idtypeLocaux;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDETATGES")
    private int idetatges;

    public Locaux() {
    }

    public Locaux(Integer idlocaux) {
        this.idlocaux = idlocaux;
    }

    public Locaux(Integer idlocaux, String code, String libelle, int idtypeLocaux, int idetatges) {
        this.idlocaux = idlocaux;
        this.code = code;
        this.libelle = libelle;
        this.idtypeLocaux = idtypeLocaux;
        this.idetatges = idetatges;
    }

    public Integer getIdlocaux() {
        return idlocaux;
    }

    public void setIdlocaux(Integer idlocaux) {
        this.idlocaux = idlocaux;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getIdtypeLocaux() {
        return idtypeLocaux;
    }

    public void setIdtypeLocaux(int idtypeLocaux) {
        this.idtypeLocaux = idtypeLocaux;
    }

    public int getIdetatges() {
        return idetatges;
    }

    public void setIdetatges(int idetatges) {
        this.idetatges = idetatges;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlocaux != null ? idlocaux.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Locaux)) {
            return false;
        }
        Locaux other = (Locaux) object;
        if ((this.idlocaux == null && other.idlocaux != null) || (this.idlocaux != null && !this.idlocaux.equals(other.idlocaux))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Locaux[ idlocaux=" + idlocaux + " ]";
    }
    
}
