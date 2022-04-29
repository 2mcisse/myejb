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
@Table(name = "remarques")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Remarques.findAll", query = "SELECT r FROM Remarques r")
    , @NamedQuery(name = "Remarques.findByIdremarques", query = "SELECT r FROM Remarques r WHERE r.idremarques = :idremarques")
    , @NamedQuery(name = "Remarques.findByDAteRem", query = "SELECT r FROM Remarques r WHERE r.dAteRem = :dAteRem")
    , @NamedQuery(name = "Remarques.findByObservations", query = "SELECT r FROM Remarques r WHERE r.observations = :observations")
    , @NamedQuery(name = "Remarques.findByAvis", query = "SELECT r FROM Remarques r WHERE r.avis = :avis")
    , @NamedQuery(name = "Remarques.findByGestion", query = "SELECT r FROM Remarques r WHERE r.gestion = :gestion")})
public class Remarques implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDREMARQUES")
    private Integer idremarques;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DAteRem")
    @Temporal(TemporalType.DATE)
    private Date dAteRem;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Observations")
    private String observations;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Avis")
    private short avis;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "IDDocuments", referencedColumnName = "IDDocuments")
    @ManyToOne(optional = false)
    private Courriers iDDocuments;
    @JoinColumn(name = "NumTiers", referencedColumnName = "NumTiers")
    @ManyToOne(optional = false)
    private Tiers numTiers;

    public Remarques() {
    }

    public Remarques(Integer idremarques) {
        this.idremarques = idremarques;
    }

    public Remarques(Integer idremarques, Date dAteRem, String observations, short avis) {
        this.idremarques = idremarques;
        this.dAteRem = dAteRem;
        this.observations = observations;
        this.avis = avis;
    }

    public Integer getIdremarques() {
        return idremarques;
    }

    public void setIdremarques(Integer idremarques) {
        this.idremarques = idremarques;
    }

    public Date getDAteRem() {
        return dAteRem;
    }

    public void setDAteRem(Date dAteRem) {
        this.dAteRem = dAteRem;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public short getAvis() {
        return avis;
    }

    public void setAvis(short avis) {
        this.avis = avis;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public Courriers getIDDocuments() {
        return iDDocuments;
    }

    public void setIDDocuments(Courriers iDDocuments) {
        this.iDDocuments = iDDocuments;
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
        hash += (idremarques != null ? idremarques.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Remarques)) {
            return false;
        }
        Remarques other = (Remarques) object;
        if ((this.idremarques == null && other.idremarques != null) || (this.idremarques != null && !this.idremarques.equals(other.idremarques))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Remarques[ idremarques=" + idremarques + " ]";
    }
    
}
