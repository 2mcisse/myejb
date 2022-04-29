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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "rga_groupe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RgaGroupe.findAll", query = "SELECT r FROM RgaGroupe r")
    , @NamedQuery(name = "RgaGroupe.findByIdrgaGroupe", query = "SELECT r FROM RgaGroupe r WHERE r.idrgaGroupe = :idrgaGroupe")
    , @NamedQuery(name = "RgaGroupe.findByDescription", query = "SELECT r FROM RgaGroupe r WHERE r.description = :description")
    , @NamedQuery(name = "RgaGroupe.findByDateDebut", query = "SELECT r FROM RgaGroupe r WHERE r.dateDebut = :dateDebut")
    , @NamedQuery(name = "RgaGroupe.findByDateFin", query = "SELECT r FROM RgaGroupe r WHERE r.dateFin = :dateFin")
    , @NamedQuery(name = "RgaGroupe.findByFlgActif", query = "SELECT r FROM RgaGroupe r WHERE r.flgActif = :flgActif")})
public class RgaGroupe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrga_groupe")
    private Integer idrgaGroupe;
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
    @JoinTable(name = "rga_groupe_menu", joinColumns = {
        @JoinColumn(name = "idrga_groupe", referencedColumnName = "idrga_groupe")}, inverseJoinColumns = {
        @JoinColumn(name = "idrga_menu", referencedColumnName = "idrga_menu")})
    @ManyToMany
    private List<RgaMenu> rgaMenuList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rgaGroupe")
    private List<RgaUserGroupe> rgaUserGroupeList;

    public RgaGroupe() {
    }

    public RgaGroupe(Integer idrgaGroupe) {
        this.idrgaGroupe = idrgaGroupe;
    }

    public Integer getIdrgaGroupe() {
        return idrgaGroupe;
    }

    public void setIdrgaGroupe(Integer idrgaGroupe) {
        this.idrgaGroupe = idrgaGroupe;
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

    @XmlTransient
    public List<RgaMenu> getRgaMenuList() {
        return rgaMenuList;
    }

    public void setRgaMenuList(List<RgaMenu> rgaMenuList) {
        this.rgaMenuList = rgaMenuList;
    }

    @XmlTransient
    public List<RgaUserGroupe> getRgaUserGroupeList() {
        return rgaUserGroupeList;
    }

    public void setRgaUserGroupeList(List<RgaUserGroupe> rgaUserGroupeList) {
        this.rgaUserGroupeList = rgaUserGroupeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrgaGroupe != null ? idrgaGroupe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RgaGroupe)) {
            return false;
        }
        RgaGroupe other = (RgaGroupe) object;
        if ((this.idrgaGroupe == null && other.idrgaGroupe != null) || (this.idrgaGroupe != null && !this.idrgaGroupe.equals(other.idrgaGroupe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.RgaGroupe[ idrgaGroupe=" + idrgaGroupe + " ]";
    }
    
}
