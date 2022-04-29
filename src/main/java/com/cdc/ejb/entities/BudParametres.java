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
@Table(name = "bud_parametres")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BudParametres.findAll", query = "SELECT b FROM BudParametres b")
    , @NamedQuery(name = "BudParametres.findByIdbudParametres", query = "SELECT b FROM BudParametres b WHERE b.idbudParametres = :idbudParametres")
    , @NamedQuery(name = "BudParametres.findByExercice", query = "SELECT b FROM BudParametres b WHERE b.exercice = :exercice")
    , @NamedQuery(name = "BudParametres.findByDateDebut", query = "SELECT b FROM BudParametres b WHERE b.dateDebut = :dateDebut")
    , @NamedQuery(name = "BudParametres.findByDateFin", query = "SELECT b FROM BudParametres b WHERE b.dateFin = :dateFin")
    , @NamedQuery(name = "BudParametres.findByBUdgetApprouve", query = "SELECT b FROM BudParametres b WHERE b.bUdgetApprouve = :bUdgetApprouve")
    , @NamedQuery(name = "BudParametres.findByGestion", query = "SELECT b FROM BudParametres b WHERE b.gestion = :gestion")})
public class BudParametres implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDBUD_PARAMETRES")
    private Integer idbudParametres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "Exercice")
    private String exercice;
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
    @Column(name = "BUdgetApprouve")
    private short bUdgetApprouve;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;

    public BudParametres() {
    }

    public BudParametres(Integer idbudParametres) {
        this.idbudParametres = idbudParametres;
    }

    public BudParametres(Integer idbudParametres, String exercice, Date dateDebut, Date dateFin, short bUdgetApprouve) {
        this.idbudParametres = idbudParametres;
        this.exercice = exercice;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.bUdgetApprouve = bUdgetApprouve;
    }

    public Integer getIdbudParametres() {
        return idbudParametres;
    }

    public void setIdbudParametres(Integer idbudParametres) {
        this.idbudParametres = idbudParametres;
    }

    public String getExercice() {
        return exercice;
    }

    public void setExercice(String exercice) {
        this.exercice = exercice;
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

    public short getBUdgetApprouve() {
        return bUdgetApprouve;
    }

    public void setBUdgetApprouve(short bUdgetApprouve) {
        this.bUdgetApprouve = bUdgetApprouve;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbudParametres != null ? idbudParametres.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudParametres)) {
            return false;
        }
        BudParametres other = (BudParametres) object;
        if ((this.idbudParametres == null && other.idbudParametres != null) || (this.idbudParametres != null && !this.idbudParametres.equals(other.idbudParametres))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.BudParametres[ idbudParametres=" + idbudParametres + " ]";
    }
    
}
