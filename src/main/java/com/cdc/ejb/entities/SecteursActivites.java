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
@Table(name = "secteurs_activites")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SecteursActivites.findAll", query = "SELECT s FROM SecteursActivites s")
    , @NamedQuery(name = "SecteursActivites.findByIdsecteursActivites", query = "SELECT s FROM SecteursActivites s WHERE s.idsecteursActivites = :idsecteursActivites")
    , @NamedQuery(name = "SecteursActivites.findByLibelle", query = "SELECT s FROM SecteursActivites s WHERE s.libelle = :libelle")})
public class SecteursActivites implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSECTEURS_ACTIVITES")
    private Integer idsecteursActivites;
    @Size(max = 100)
    @Column(name = "LIBELLE")
    private String libelle;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idsecteursActivites")
    private List<Tiers> tiersList;

    public SecteursActivites() {
    }

    public SecteursActivites(Integer idsecteursActivites) {
        this.idsecteursActivites = idsecteursActivites;
    }

    public Integer getIdsecteursActivites() {
        return idsecteursActivites;
    }

    public void setIdsecteursActivites(Integer idsecteursActivites) {
        this.idsecteursActivites = idsecteursActivites;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @XmlTransient
    public List<Tiers> getTiersList() {
        return tiersList;
    }

    public void setTiersList(List<Tiers> tiersList) {
        this.tiersList = tiersList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsecteursActivites != null ? idsecteursActivites.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SecteursActivites)) {
            return false;
        }
        SecteursActivites other = (SecteursActivites) object;
        if ((this.idsecteursActivites == null && other.idsecteursActivites != null) || (this.idsecteursActivites != null && !this.idsecteursActivites.equals(other.idsecteursActivites))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.SecteursActivites[ idsecteursActivites=" + idsecteursActivites + " ]";
    }
    
}
