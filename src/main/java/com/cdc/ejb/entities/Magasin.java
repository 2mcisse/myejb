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
@Table(name = "magasin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Magasin.findAll", query = "SELECT m FROM Magasin m")
    , @NamedQuery(name = "Magasin.findByIdmagasin", query = "SELECT m FROM Magasin m WHERE m.idmagasin = :idmagasin")
    , @NamedQuery(name = "Magasin.findByCode", query = "SELECT m FROM Magasin m WHERE m.code = :code")
    , @NamedQuery(name = "Magasin.findByLibelle", query = "SELECT m FROM Magasin m WHERE m.libelle = :libelle")})
public class Magasin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDMAGASIN")
    private Integer idmagasin;
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

    public Magasin() {
    }

    public Magasin(Integer idmagasin) {
        this.idmagasin = idmagasin;
    }

    public Magasin(Integer idmagasin, String code, String libelle) {
        this.idmagasin = idmagasin;
        this.code = code;
        this.libelle = libelle;
    }

    public Integer getIdmagasin() {
        return idmagasin;
    }

    public void setIdmagasin(Integer idmagasin) {
        this.idmagasin = idmagasin;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmagasin != null ? idmagasin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Magasin)) {
            return false;
        }
        Magasin other = (Magasin) object;
        if ((this.idmagasin == null && other.idmagasin != null) || (this.idmagasin != null && !this.idmagasin.equals(other.idmagasin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Magasin[ idmagasin=" + idmagasin + " ]";
    }
    
}
