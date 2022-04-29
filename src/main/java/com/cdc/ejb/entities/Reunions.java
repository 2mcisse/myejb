/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "reunions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reunions.findAll", query = "SELECT r FROM Reunions r")
    , @NamedQuery(name = "Reunions.findByIdreunions", query = "SELECT r FROM Reunions r WHERE r.idreunions = :idreunions")
    , @NamedQuery(name = "Reunions.findByDateR", query = "SELECT r FROM Reunions r WHERE r.dateR = :dateR")
    , @NamedQuery(name = "Reunions.findByMotif", query = "SELECT r FROM Reunions r WHERE r.motif = :motif")
    , @NamedQuery(name = "Reunions.findByGestion", query = "SELECT r FROM Reunions r WHERE r.gestion = :gestion")})
public class Reunions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDREUNIONS")
    private Integer idreunions;
    @Column(name = "DateR")
    @Temporal(TemporalType.DATE)
    private Date dateR;
    @Size(max = 150)
    @Column(name = "Motif")
    private String motif;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "ID_Marche", referencedColumnName = "ID_Marche")
    @ManyToOne
    private AchMarches iDMarche;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idreunions")
    private List<AchCommission> achCommissionList;

    public Reunions() {
    }

    public Reunions(Integer idreunions) {
        this.idreunions = idreunions;
    }

    public Integer getIdreunions() {
        return idreunions;
    }

    public void setIdreunions(Integer idreunions) {
        this.idreunions = idreunions;
    }

    public Date getDateR() {
        return dateR;
    }

    public void setDateR(Date dateR) {
        this.dateR = dateR;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
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

    @XmlTransient
    public List<AchCommission> getAchCommissionList() {
        return achCommissionList;
    }

    public void setAchCommissionList(List<AchCommission> achCommissionList) {
        this.achCommissionList = achCommissionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreunions != null ? idreunions.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reunions)) {
            return false;
        }
        Reunions other = (Reunions) object;
        if ((this.idreunions == null && other.idreunions != null) || (this.idreunions != null && !this.idreunions.equals(other.idreunions))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Reunions[ idreunions=" + idreunions + " ]";
    }
    
}
