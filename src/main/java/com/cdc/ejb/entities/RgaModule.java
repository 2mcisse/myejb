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
@Table(name = "rga_module")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RgaModule.findAll", query = "SELECT r FROM RgaModule r")
    , @NamedQuery(name = "RgaModule.findByIdrgaModule", query = "SELECT r FROM RgaModule r WHERE r.idrgaModule = :idrgaModule")
    , @NamedQuery(name = "RgaModule.findByDescription", query = "SELECT r FROM RgaModule r WHERE r.description = :description")
    , @NamedQuery(name = "RgaModule.findByDateDebut", query = "SELECT r FROM RgaModule r WHERE r.dateDebut = :dateDebut")
    , @NamedQuery(name = "RgaModule.findByDateFin", query = "SELECT r FROM RgaModule r WHERE r.dateFin = :dateFin")
    , @NamedQuery(name = "RgaModule.findByFlgActif", query = "SELECT r FROM RgaModule r WHERE r.flgActif = :flgActif")})
public class RgaModule implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrga_module")
    private Integer idrgaModule;
    @Size(max = 50)
    @Column(name = "description")
    private String description;
    @Column(name = "dateDebut")
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Column(name = "dateFin")
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    @Column(name = "flgActif")
    private Boolean flgActif;

    public RgaModule() {
    }

    public RgaModule(Integer idrgaModule) {
        this.idrgaModule = idrgaModule;
    }

    public Integer getIdrgaModule() {
        return idrgaModule;
    }

    public void setIdrgaModule(Integer idrgaModule) {
        this.idrgaModule = idrgaModule;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Boolean getFlgActif() {
        return flgActif;
    }

    public void setFlgActif(Boolean flgActif) {
        this.flgActif = flgActif;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrgaModule != null ? idrgaModule.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RgaModule)) {
            return false;
        }
        RgaModule other = (RgaModule) object;
        if ((this.idrgaModule == null && other.idrgaModule != null) || (this.idrgaModule != null && !this.idrgaModule.equals(other.idrgaModule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.RgaModule[ idrgaModule=" + idrgaModule + " ]";
    }
    
}
