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
@Table(name = "preselection")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Preselection.findAll", query = "SELECT p FROM Preselection p")
    , @NamedQuery(name = "Preselection.findByIdpreselection", query = "SELECT p FROM Preselection p WHERE p.idpreselection = :idpreselection")
    , @NamedQuery(name = "Preselection.findByDateInvitation", query = "SELECT p FROM Preselection p WHERE p.dateInvitation = :dateInvitation")
    , @NamedQuery(name = "Preselection.findByPhase", query = "SELECT p FROM Preselection p WHERE p.phase = :phase")
    , @NamedQuery(name = "Preselection.findByGestion", query = "SELECT p FROM Preselection p WHERE p.gestion = :gestion")})
public class Preselection implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPRESELECTION")
    private Integer idpreselection;
    @Column(name = "DateInvitation")
    @Temporal(TemporalType.DATE)
    private Date dateInvitation;
    @Column(name = "Phase")
    private Short phase;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "ID_Marche", referencedColumnName = "ID_Marche")
    @ManyToOne
    private AchMarches iDMarche;
    @JoinColumn(name = "NumTiers", referencedColumnName = "NumTiers")
    @ManyToOne
    private Tiers numTiers;

    public Preselection() {
    }

    public Preselection(Integer idpreselection) {
        this.idpreselection = idpreselection;
    }

    public Integer getIdpreselection() {
        return idpreselection;
    }

    public void setIdpreselection(Integer idpreselection) {
        this.idpreselection = idpreselection;
    }

    public Date getDateInvitation() {
        return dateInvitation;
    }

    public void setDateInvitation(Date dateInvitation) {
        this.dateInvitation = dateInvitation;
    }

    public Short getPhase() {
        return phase;
    }

    public void setPhase(Short phase) {
        this.phase = phase;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public AchMarches getIDMarche() {
        return iDMarche;
    }

    public void setIDMarche(AchMarches iDMarche) {
        this.iDMarche = iDMarche;
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
        hash += (idpreselection != null ? idpreselection.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Preselection)) {
            return false;
        }
        Preselection other = (Preselection) object;
        if ((this.idpreselection == null && other.idpreselection != null) || (this.idpreselection != null && !this.idpreselection.equals(other.idpreselection))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Preselection[ idpreselection=" + idpreselection + " ]";
    }
    
}
