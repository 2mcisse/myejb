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
@Table(name = "mot")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mot.findAll", query = "SELECT m FROM Mot m")
    , @NamedQuery(name = "Mot.findByIdmot", query = "SELECT m FROM Mot m WHERE m.idmot = :idmot")
    , @NamedQuery(name = "Mot.findByMot", query = "SELECT m FROM Mot m WHERE m.mot = :mot")
    , @NamedQuery(name = "Mot.findByBVide", query = "SELECT m FROM Mot m WHERE m.bVide = :bVide")
    , @NamedQuery(name = "Mot.findByPoids", query = "SELECT m FROM Mot m WHERE m.poids = :poids")})
public class Mot implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDMOT")
    private Integer idmot;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "mot")
    private String mot;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bVide")
    private short bVide;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Poids")
    private int poids;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmot")
    private List<Index> indexList;

    public Mot() {
    }

    public Mot(Integer idmot) {
        this.idmot = idmot;
    }

    public Mot(Integer idmot, String mot, short bVide, int poids) {
        this.idmot = idmot;
        this.mot = mot;
        this.bVide = bVide;
        this.poids = poids;
    }

    public Integer getIdmot() {
        return idmot;
    }

    public void setIdmot(Integer idmot) {
        this.idmot = idmot;
    }

    public String getMot() {
        return mot;
    }

    public void setMot(String mot) {
        this.mot = mot;
    }

    public short getBVide() {
        return bVide;
    }

    public void setBVide(short bVide) {
        this.bVide = bVide;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    @XmlTransient
    public List<Index> getIndexList() {
        return indexList;
    }

    public void setIndexList(List<Index> indexList) {
        this.indexList = indexList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmot != null ? idmot.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mot)) {
            return false;
        }
        Mot other = (Mot) object;
        if ((this.idmot == null && other.idmot != null) || (this.idmot != null && !this.idmot.equals(other.idmot))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Mot[ idmot=" + idmot + " ]";
    }
    
}
