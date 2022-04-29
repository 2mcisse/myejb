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
@Table(name = "mt_groupe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MtGroupe.findAll", query = "SELECT m FROM MtGroupe m")
    , @NamedQuery(name = "MtGroupe.findByIdgroupe", query = "SELECT m FROM MtGroupe m WHERE m.idgroupe = :idgroupe")
    , @NamedQuery(name = "MtGroupe.findByCode", query = "SELECT m FROM MtGroupe m WHERE m.code = :code")
    , @NamedQuery(name = "MtGroupe.findByDescription", query = "SELECT m FROM MtGroupe m WHERE m.description = :description")
    , @NamedQuery(name = "MtGroupe.findByLibelle", query = "SELECT m FROM MtGroupe m WHERE m.libelle = :libelle")})
public class MtGroupe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDGROUPE")
    private Integer idgroupe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CODE")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "LIBELLE")
    private String libelle;

    public MtGroupe() {
    }

    public MtGroupe(Integer idgroupe) {
        this.idgroupe = idgroupe;
    }

    public MtGroupe(Integer idgroupe, String code, String description, String libelle) {
        this.idgroupe = idgroupe;
        this.code = code;
        this.description = description;
        this.libelle = libelle;
    }

    public Integer getIdgroupe() {
        return idgroupe;
    }

    public void setIdgroupe(Integer idgroupe) {
        this.idgroupe = idgroupe;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        hash += (idgroupe != null ? idgroupe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MtGroupe)) {
            return false;
        }
        MtGroupe other = (MtGroupe) object;
        if ((this.idgroupe == null && other.idgroupe != null) || (this.idgroupe != null && !this.idgroupe.equals(other.idgroupe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.MtGroupe[ idgroupe=" + idgroupe + " ]";
    }
    
}
