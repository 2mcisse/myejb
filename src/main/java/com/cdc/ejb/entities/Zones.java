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
@Table(name = "zones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zones.findAll", query = "SELECT z FROM Zones z")
    , @NamedQuery(name = "Zones.findByIdzones", query = "SELECT z FROM Zones z WHERE z.idzones = :idzones")
    , @NamedQuery(name = "Zones.findByCode", query = "SELECT z FROM Zones z WHERE z.code = :code")
    , @NamedQuery(name = "Zones.findByIntitule", query = "SELECT z FROM Zones z WHERE z.intitule = :intitule")})
public class Zones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDZONES")
    private Integer idzones;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Intitule")
    private String intitule;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idzones")
    private List<Tiers> tiersList;

    public Zones() {
    }

    public Zones(Integer idzones) {
        this.idzones = idzones;
    }

    public Zones(Integer idzones, String code, String intitule) {
        this.idzones = idzones;
        this.code = code;
        this.intitule = intitule;
    }

    public Integer getIdzones() {
        return idzones;
    }

    public void setIdzones(Integer idzones) {
        this.idzones = idzones;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
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
        hash += (idzones != null ? idzones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zones)) {
            return false;
        }
        Zones other = (Zones) object;
        if ((this.idzones == null && other.idzones != null) || (this.idzones != null && !this.idzones.equals(other.idzones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Zones[ idzones=" + idzones + " ]";
    }
    
}
