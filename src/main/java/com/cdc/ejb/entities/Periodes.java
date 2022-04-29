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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "periodes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Periodes.findAll", query = "SELECT p FROM Periodes p")
    , @NamedQuery(name = "Periodes.findByNumPeriode", query = "SELECT p FROM Periodes p WHERE p.numPeriode = :numPeriode")
    , @NamedQuery(name = "Periodes.findByDateDebut", query = "SELECT p FROM Periodes p WHERE p.dateDebut = :dateDebut")
    , @NamedQuery(name = "Periodes.findByDateFin", query = "SELECT p FROM Periodes p WHERE p.dateFin = :dateFin")
    , @NamedQuery(name = "Periodes.findByCloturee", query = "SELECT p FROM Periodes p WHERE p.cloturee = :cloturee")
    , @NamedQuery(name = "Periodes.findByIDPeriodes", query = "SELECT p FROM Periodes p WHERE p.iDPeriodes = :iDPeriodes")})
public class Periodes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NumPeriode")
    private short numPeriode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateDebut")
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateFin")
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cloturee")
    private short cloturee;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPeriodes")
    private Integer iDPeriodes;
    @JoinColumn(name = "Gestion", referencedColumnName = "Gestion")
    @ManyToOne(optional = false)
    private Gestions gestion;

    public Periodes() {
    }

    public Periodes(Integer iDPeriodes) {
        this.iDPeriodes = iDPeriodes;
    }

    public Periodes(Integer iDPeriodes, short numPeriode, Date dateDebut, Date dateFin, short cloturee) {
        this.iDPeriodes = iDPeriodes;
        this.numPeriode = numPeriode;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.cloturee = cloturee;
    }

    public short getNumPeriode() {
        return numPeriode;
    }

    public void setNumPeriode(short numPeriode) {
        this.numPeriode = numPeriode;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public short getCloturee() {
        return cloturee;
    }

    public void setCloturee(short cloturee) {
        this.cloturee = cloturee;
    }

    public Integer getIDPeriodes() {
        return iDPeriodes;
    }

    public void setIDPeriodes(Integer iDPeriodes) {
        this.iDPeriodes = iDPeriodes;
    }

    public Gestions getGestion() {
        return gestion;
    }

    public void setGestion(Gestions gestion) {
        this.gestion = gestion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDPeriodes != null ? iDPeriodes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Periodes)) {
            return false;
        }
        Periodes other = (Periodes) object;
        if ((this.iDPeriodes == null && other.iDPeriodes != null) || (this.iDPeriodes != null && !this.iDPeriodes.equals(other.iDPeriodes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Periodes[ iDPeriodes=" + iDPeriodes + " ]";
    }
    
}
