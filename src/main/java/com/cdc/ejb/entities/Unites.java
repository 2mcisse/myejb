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
@Table(name = "unites")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Unites.findAll", query = "SELECT u FROM Unites u")
    , @NamedQuery(name = "Unites.findByIdunites", query = "SELECT u FROM Unites u WHERE u.idunites = :idunites")
    , @NamedQuery(name = "Unites.findByCode", query = "SELECT u FROM Unites u WHERE u.code = :code")
    , @NamedQuery(name = "Unites.findByLibelle", query = "SELECT u FROM Unites u WHERE u.libelle = :libelle")})
public class Unites implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDUNITES")
    private Integer idunites;
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

    public Unites() {
    }

    public Unites(Integer idunites) {
        this.idunites = idunites;
    }

    public Unites(Integer idunites, String code, String libelle) {
        this.idunites = idunites;
        this.code = code;
        this.libelle = libelle;
    }

    public Integer getIdunites() {
        return idunites;
    }

    public void setIdunites(Integer idunites) {
        this.idunites = idunites;
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
        hash += (idunites != null ? idunites.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unites)) {
            return false;
        }
        Unites other = (Unites) object;
        if ((this.idunites == null && other.idunites != null) || (this.idunites != null && !this.idunites.equals(other.idunites))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Unites[ idunites=" + idunites + " ]";
    }
    
}
