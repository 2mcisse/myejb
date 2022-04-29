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
@Table(name = "mat_locaux")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MatLocaux.findAll", query = "SELECT m FROM MatLocaux m")
    , @NamedQuery(name = "MatLocaux.findByIdlocaux", query = "SELECT m FROM MatLocaux m WHERE m.idlocaux = :idlocaux")
    , @NamedQuery(name = "MatLocaux.findByIdsousComptes", query = "SELECT m FROM MatLocaux m WHERE m.idsousComptes = :idsousComptes")
    , @NamedQuery(name = "MatLocaux.findByDates", query = "SELECT m FROM MatLocaux m WHERE m.dates = :dates")
    , @NamedQuery(name = "MatLocaux.findByGestion", query = "SELECT m FROM MatLocaux m WHERE m.gestion = :gestion")
    , @NamedQuery(name = "MatLocaux.findById", query = "SELECT m FROM MatLocaux m WHERE m.id = :id")})
public class MatLocaux implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDLOCAUX")
    private int idlocaux;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSOUS_COMPTES")
    private int idsousComptes;
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

    public MatLocaux() {
    }

    public MatLocaux(Integer id) {
        this.id = id;
    }

    public MatLocaux(Integer id, int idlocaux, int idsousComptes, Date dates) {
        this.id = id;
        this.idlocaux = idlocaux;
        this.idsousComptes = idsousComptes;
        this.dates = dates;
    }

    public int getIdlocaux() {
        return idlocaux;
    }

    public void setIdlocaux(int idlocaux) {
        this.idlocaux = idlocaux;
    }

    public int getIdsousComptes() {
        return idsousComptes;
    }

    public void setIdsousComptes(int idsousComptes) {
        this.idsousComptes = idsousComptes;
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
        if (!(object instanceof MatLocaux)) {
            return false;
        }
        MatLocaux other = (MatLocaux) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.MatLocaux[ id=" + id + " ]";
    }
    
}
