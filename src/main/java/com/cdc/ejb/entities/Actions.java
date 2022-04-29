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
@Table(name = "actions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actions.findAll", query = "SELECT a FROM Actions a")
    , @NamedQuery(name = "Actions.findByIdactions", query = "SELECT a FROM Actions a WHERE a.idactions = :idactions")
    , @NamedQuery(name = "Actions.findByLibelle", query = "SELECT a FROM Actions a WHERE a.libelle = :libelle")
    , @NamedQuery(name = "Actions.findByGestion", query = "SELECT a FROM Actions a WHERE a.gestion = :gestion")})
public class Actions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDACTIONS")
    private Integer idactions;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "LIBELLE")
    private String libelle;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idactions")
    private List<Courriers> courriersList;

    public Actions() {
    }

    public Actions(Integer idactions) {
        this.idactions = idactions;
    }

    public Actions(Integer idactions, String libelle) {
        this.idactions = idactions;
        this.libelle = libelle;
    }

    public Integer getIdactions() {
        return idactions;
    }

    public void setIdactions(Integer idactions) {
        this.idactions = idactions;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<Courriers> getCourriersList() {
        return courriersList;
    }

    public void setCourriersList(List<Courriers> courriersList) {
        this.courriersList = courriersList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idactions != null ? idactions.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actions)) {
            return false;
        }
        Actions other = (Actions) object;
        if ((this.idactions == null && other.idactions != null) || (this.idactions != null && !this.idactions.equals(other.idactions))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Actions[ idactions=" + idactions + " ]";
    }
    
}
