/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "mat_tiers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MatTiers.findAll", query = "SELECT m FROM MatTiers m")
    , @NamedQuery(name = "MatTiers.findByIdsousComptes", query = "SELECT m FROM MatTiers m WHERE m.idsousComptes = :idsousComptes")
    , @NamedQuery(name = "MatTiers.findByNumTiers", query = "SELECT m FROM MatTiers m WHERE m.numTiers = :numTiers")
    , @NamedQuery(name = "MatTiers.findByDates", query = "SELECT m FROM MatTiers m WHERE m.dates = :dates")
    , @NamedQuery(name = "MatTiers.findByGestion", query = "SELECT m FROM MatTiers m WHERE m.gestion = :gestion")
    , @NamedQuery(name = "MatTiers.findById", query = "SELECT m FROM MatTiers m WHERE m.id = :id")})
public class MatTiers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSOUS_COMPTES")
    private int idsousComptes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NumTiers")
    private long numTiers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Dates")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dates;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    public MatTiers() {
    }

    public MatTiers(Integer id) {
        this.id = id;
    }

    public MatTiers(Integer id, int idsousComptes, long numTiers, Date dates) {
        this.id = id;
        this.idsousComptes = idsousComptes;
        this.numTiers = numTiers;
        this.dates = dates;
    }

    public int getIdsousComptes() {
        return idsousComptes;
    }

    public void setIdsousComptes(int idsousComptes) {
        this.idsousComptes = idsousComptes;
    }

    public long getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(long numTiers) {
        this.numTiers = numTiers;
    }

    public Date getDates() {
        return dates;
    }

    public void setDates(Date dates) {
        this.dates = dates;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MatTiers)) {
            return false;
        }
        MatTiers other = (MatTiers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.MatTiers[ id=" + id + " ]";
    }
    
}
