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
@Table(name = "dependance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dependance.findAll", query = "SELECT d FROM Dependance d")
    , @NamedQuery(name = "Dependance.findByIddependance", query = "SELECT d FROM Dependance d WHERE d.iddependance = :iddependance")
    , @NamedQuery(name = "Dependance.findByCode", query = "SELECT d FROM Dependance d WHERE d.code = :code")
    , @NamedQuery(name = "Dependance.findByIntitule", query = "SELECT d FROM Dependance d WHERE d.intitule = :intitule")})
public class Dependance implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDEPENDANCE")
    private Integer iddependance;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddependance")
    private List<Tiers> tiersList;

    public Dependance() {
    }

    public Dependance(Integer iddependance) {
        this.iddependance = iddependance;
    }

    public Dependance(Integer iddependance, String code, String intitule) {
        this.iddependance = iddependance;
        this.code = code;
        this.intitule = intitule;
    }

    public Integer getIddependance() {
        return iddependance;
    }

    public void setIddependance(Integer iddependance) {
        this.iddependance = iddependance;
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
        hash += (iddependance != null ? iddependance.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dependance)) {
            return false;
        }
        Dependance other = (Dependance) object;
        if ((this.iddependance == null && other.iddependance != null) || (this.iddependance != null && !this.iddependance.equals(other.iddependance))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Dependance[ iddependance=" + iddependance + " ]";
    }
    
}
