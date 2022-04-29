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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "actionsccaisses")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actionsccaisses.findAll", query = "SELECT a FROM Actionsccaisses a")
    , @NamedQuery(name = "Actionsccaisses.findByIDActionscCaisses", query = "SELECT a FROM Actionsccaisses a WHERE a.iDActionscCaisses = :iDActionscCaisses")
    , @NamedQuery(name = "Actionsccaisses.findByTypeAction", query = "SELECT a FROM Actionsccaisses a WHERE a.typeAction = :typeAction")
    , @NamedQuery(name = "Actionsccaisses.findByEncours", query = "SELECT a FROM Actionsccaisses a WHERE a.encours = :encours")
    , @NamedQuery(name = "Actionsccaisses.findByDates", query = "SELECT a FROM Actionsccaisses a WHERE a.dates = :dates")
    , @NamedQuery(name = "Actionsccaisses.findByGestion", query = "SELECT a FROM Actionsccaisses a WHERE a.gestion = :gestion")})
public class Actionsccaisses implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDActionscCaisses")
    private Integer iDActionscCaisses;
    @Column(name = "TypeAction")
    private Short typeAction;
    @Column(name = "Encours")
    private Short encours;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Dates")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dates;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "NumeroCaisse", referencedColumnName = "NumeroCaisse")
    @ManyToOne
    private Caisses numeroCaisse;
    @JoinColumn(name = "NumTiers", referencedColumnName = "NumTiers")
    @ManyToOne
    private Tiers numTiers;

    public Actionsccaisses() {
    }

    public Actionsccaisses(Integer iDActionscCaisses) {
        this.iDActionscCaisses = iDActionscCaisses;
    }

    public Actionsccaisses(Integer iDActionscCaisses, Date dates) {
        this.iDActionscCaisses = iDActionscCaisses;
        this.dates = dates;
    }

    public Integer getIDActionscCaisses() {
        return iDActionscCaisses;
    }

    public void setIDActionscCaisses(Integer iDActionscCaisses) {
        this.iDActionscCaisses = iDActionscCaisses;
    }

    public Short getTypeAction() {
        return typeAction;
    }

    public void setTypeAction(Short typeAction) {
        this.typeAction = typeAction;
    }

    public Short getEncours() {
        return encours;
    }

    public void setEncours(Short encours) {
        this.encours = encours;
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

    public Caisses getNumeroCaisse() {
        return numeroCaisse;
    }

    public void setNumeroCaisse(Caisses numeroCaisse) {
        this.numeroCaisse = numeroCaisse;
    }

    public Tiers getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(Tiers numTiers) {
        this.numTiers = numTiers;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDActionscCaisses != null ? iDActionscCaisses.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actionsccaisses)) {
            return false;
        }
        Actionsccaisses other = (Actionsccaisses) object;
        if ((this.iDActionscCaisses == null && other.iDActionscCaisses != null) || (this.iDActionscCaisses != null && !this.iDActionscCaisses.equals(other.iDActionscCaisses))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Actionsccaisses[ iDActionscCaisses=" + iDActionscCaisses + " ]";
    }
    
}
