/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "rga_service")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RgaService.findAll", query = "SELECT r FROM RgaService r")
    , @NamedQuery(name = "RgaService.findByIdservice", query = "SELECT r FROM RgaService r WHERE r.idservice = :idservice")
    , @NamedQuery(name = "RgaService.findByDescription", query = "SELECT r FROM RgaService r WHERE r.description = :description")
    , @NamedQuery(name = "RgaService.findByFlgActif", query = "SELECT r FROM RgaService r WHERE r.flgActif = :flgActif")})
public class RgaService implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "idservice")
    private String idservice;
    @Size(max = 50)
    @Column(name = "description")
    private String description;
    @Column(name = "flgActif")
    private Boolean flgActif;
    @OneToMany(mappedBy = "idservice")
    private List<RgaUser> rgaUserList;

    public RgaService() {
    }

    public RgaService(String idservice) {
        this.idservice = idservice;
    }

    public String getIdservice() {
        return idservice;
    }

    public void setIdservice(String idservice) {
        this.idservice = idservice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getFlgActif() {
        return flgActif;
    }

    public void setFlgActif(Boolean flgActif) {
        this.flgActif = flgActif;
    }

    @XmlTransient
    public List<RgaUser> getRgaUserList() {
        return rgaUserList;
    }

    public void setRgaUserList(List<RgaUser> rgaUserList) {
        this.rgaUserList = rgaUserList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idservice != null ? idservice.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RgaService)) {
            return false;
        }
        RgaService other = (RgaService) object;
        if ((this.idservice == null && other.idservice != null) || (this.idservice != null && !this.idservice.equals(other.idservice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.RgaService[ idservice=" + idservice + " ]";
    }
    
}
