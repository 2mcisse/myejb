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
@Table(name = "services")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Services.findAll", query = "SELECT s FROM Services s")
    , @NamedQuery(name = "Services.findByIdservices", query = "SELECT s FROM Services s WHERE s.idservices = :idservices")
    , @NamedQuery(name = "Services.findByLibelle", query = "SELECT s FROM Services s WHERE s.libelle = :libelle")})
public class Services implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSERVICES")
    private Integer idservices;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "LIBELLE")
    private String libelle;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idservices")
    private List<Courriers> courriersList;
    @OneToMany(mappedBy = "idservices")
    private List<AchLignesplanPassation> achLignesplanPassationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idservices")
    private List<AchCommission> achCommissionList;

    public Services() {
    }

    public Services(Integer idservices) {
        this.idservices = idservices;
    }

    public Services(Integer idservices, String libelle) {
        this.idservices = idservices;
        this.libelle = libelle;
    }

    public Integer getIdservices() {
        return idservices;
    }

    public void setIdservices(Integer idservices) {
        this.idservices = idservices;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @XmlTransient
    public List<Courriers> getCourriersList() {
        return courriersList;
    }

    public void setCourriersList(List<Courriers> courriersList) {
        this.courriersList = courriersList;
    }

    @XmlTransient
    public List<AchLignesplanPassation> getAchLignesplanPassationList() {
        return achLignesplanPassationList;
    }

    public void setAchLignesplanPassationList(List<AchLignesplanPassation> achLignesplanPassationList) {
        this.achLignesplanPassationList = achLignesplanPassationList;
    }

    @XmlTransient
    public List<AchCommission> getAchCommissionList() {
        return achCommissionList;
    }

    public void setAchCommissionList(List<AchCommission> achCommissionList) {
        this.achCommissionList = achCommissionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idservices != null ? idservices.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Services)) {
            return false;
        }
        Services other = (Services) object;
        if ((this.idservices == null && other.idservices != null) || (this.idservices != null && !this.idservices.equals(other.idservices))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Services[ idservices=" + idservices + " ]";
    }
    
}
