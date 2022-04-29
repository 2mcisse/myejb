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
@Table(name = "dec_jours")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DecJours.findAll", query = "SELECT d FROM DecJours d")
    , @NamedQuery(name = "DecJours.findByIDJours", query = "SELECT d FROM DecJours d WHERE d.iDJours = :iDJours")
    , @NamedQuery(name = "DecJours.findByDate", query = "SELECT d FROM DecJours d WHERE d.date = :date")
    , @NamedQuery(name = "DecJours.findByNotes", query = "SELECT d FROM DecJours d WHERE d.notes = :notes")
    , @NamedQuery(name = "DecJours.findByEtat", query = "SELECT d FROM DecJours d WHERE d.etat = :etat")
    , @NamedQuery(name = "DecJours.findByGestion", query = "SELECT d FROM DecJours d WHERE d.gestion = :gestion")
    , @NamedQuery(name = "DecJours.findByType", query = "SELECT d FROM DecJours d WHERE d.type = :type")
    , @NamedQuery(name = "DecJours.findByJour", query = "SELECT d FROM DecJours d WHERE d.jour = :jour")})
public class DecJours implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDJours")
    private Integer iDJours;
    @Column(name = "Date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Size(max = 100)
    @Column(name = "Notes")
    private String notes;
    @Column(name = "Etat")
    private Short etat;
    @Size(max = 4)
    @Column(name = "Gestion")
    private String gestion;
    @Column(name = "Type")
    private Short type;
    @Size(max = 50)
    @Column(name = "Jour")
    private String jour;

    public DecJours() {
    }

    public DecJours(Integer iDJours) {
        this.iDJours = iDJours;
    }

    public Integer getIDJours() {
        return iDJours;
    }

    public void setIDJours(Integer iDJours) {
        this.iDJours = iDJours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Short getEtat() {
        return etat;
    }

    public void setEtat(Short etat) {
        this.etat = etat;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getJour() {
        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDJours != null ? iDJours.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DecJours)) {
            return false;
        }
        DecJours other = (DecJours) object;
        if ((this.iDJours == null && other.iDJours != null) || (this.iDJours != null && !this.iDJours.equals(other.iDJours))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.DecJours[ iDJours=" + iDJours + " ]";
    }
    
}
