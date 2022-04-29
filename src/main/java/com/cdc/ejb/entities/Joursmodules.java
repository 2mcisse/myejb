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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "joursmodules")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Joursmodules.findAll", query = "SELECT j FROM Joursmodules j")
    , @NamedQuery(name = "Joursmodules.findByJournee", query = "SELECT j FROM Joursmodules j WHERE j.journee = :journee")
    , @NamedQuery(name = "Joursmodules.findByModule", query = "SELECT j FROM Joursmodules j WHERE j.module = :module")
    , @NamedQuery(name = "Joursmodules.findByCloturee", query = "SELECT j FROM Joursmodules j WHERE j.cloturee = :cloturee")
    , @NamedQuery(name = "Joursmodules.findByGestion", query = "SELECT j FROM Joursmodules j WHERE j.gestion = :gestion")
    , @NamedQuery(name = "Joursmodules.findById", query = "SELECT j FROM Joursmodules j WHERE j.id = :id")})
public class Joursmodules implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "Journee")
    @Temporal(TemporalType.DATE)
    private Date journee;
    @Column(name = "Module")
    private Short module;
    @Column(name = "Cloturee")
    private Short cloturee;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    public Joursmodules() {
    }

    public Joursmodules(Integer id) {
        this.id = id;
    }

    public Date getJournee() {
        return journee;
    }

    public void setJournee(Date journee) {
        this.journee = journee;
    }

    public Short getModule() {
        return module;
    }

    public void setModule(Short module) {
        this.module = module;
    }

    public Short getCloturee() {
        return cloturee;
    }

    public void setCloturee(Short cloturee) {
        this.cloturee = cloturee;
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
        if (!(object instanceof Joursmodules)) {
            return false;
        }
        Joursmodules other = (Joursmodules) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Joursmodules[ id=" + id + " ]";
    }
    
}
