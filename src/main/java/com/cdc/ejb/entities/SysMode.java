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
@Table(name = "sys_mode")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SysMode.findAll", query = "SELECT s FROM SysMode s")
    , @NamedQuery(name = "SysMode.findByLibelle", query = "SELECT s FROM SysMode s WHERE s.libelle = :libelle")
    , @NamedQuery(name = "SysMode.findByIDSYSMode", query = "SELECT s FROM SysMode s WHERE s.iDSYSMode = :iDSYSMode")
    , @NamedQuery(name = "SysMode.findByType", query = "SELECT s FROM SysMode s WHERE s.type = :type")})
public class SysMode implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "LIBELLE")
    private String libelle;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSYS_Mode")
    private Integer iDSYSMode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "type")
    private short type;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDSYSMode")
    private List<Encaissements> encaissementsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDSYSMode")
    private List<Decaissements> decaissementsList;

    public SysMode() {
    }

    public SysMode(Integer iDSYSMode) {
        this.iDSYSMode = iDSYSMode;
    }

    public SysMode(Integer iDSYSMode, String libelle, short type) {
        this.iDSYSMode = iDSYSMode;
        this.libelle = libelle;
        this.type = type;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Integer getIDSYSMode() {
        return iDSYSMode;
    }

    public void setIDSYSMode(Integer iDSYSMode) {
        this.iDSYSMode = iDSYSMode;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    @XmlTransient
    public List<Encaissements> getEncaissementsList() {
        return encaissementsList;
    }

    public void setEncaissementsList(List<Encaissements> encaissementsList) {
        this.encaissementsList = encaissementsList;
    }

    @XmlTransient
    public List<Decaissements> getDecaissementsList() {
        return decaissementsList;
    }

    public void setDecaissementsList(List<Decaissements> decaissementsList) {
        this.decaissementsList = decaissementsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDSYSMode != null ? iDSYSMode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SysMode)) {
            return false;
        }
        SysMode other = (SysMode) object;
        if ((this.iDSYSMode == null && other.iDSYSMode != null) || (this.iDSYSMode != null && !this.iDSYSMode.equals(other.iDSYSMode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.SysMode[ iDSYSMode=" + iDSYSMode + " ]";
    }
    
}
