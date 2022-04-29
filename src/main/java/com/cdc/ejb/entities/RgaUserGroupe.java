/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "rga_user_groupe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RgaUserGroupe.findAll", query = "SELECT r FROM RgaUserGroupe r")
    , @NamedQuery(name = "RgaUserGroupe.findByIdRGAUSER", query = "SELECT r FROM RgaUserGroupe r WHERE r.rgaUserGroupePK.idRGAUSER = :idRGAUSER")
    , @NamedQuery(name = "RgaUserGroupe.findByIdRGAGROUPE", query = "SELECT r FROM RgaUserGroupe r WHERE r.rgaUserGroupePK.idRGAGROUPE = :idRGAGROUPE")
    , @NamedQuery(name = "RgaUserGroupe.findByCodect", query = "SELECT r FROM RgaUserGroupe r WHERE r.codect = :codect")})
public class RgaUserGroupe implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RgaUserGroupePK rgaUserGroupePK;
    @Size(max = 50)
    @Column(name = "codect")
    private String codect;
    @JoinColumn(name = "idRGA_USER", referencedColumnName = "idrga_user", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private RgaUser rgaUser;
    @JoinColumn(name = "idRGA_GROUPE", referencedColumnName = "idrga_groupe", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private RgaGroupe rgaGroupe;

    public RgaUserGroupe() {
    }

    public RgaUserGroupe(RgaUserGroupePK rgaUserGroupePK) {
        this.rgaUserGroupePK = rgaUserGroupePK;
    }

    public RgaUserGroupe(int idRGAUSER, int idRGAGROUPE) {
        this.rgaUserGroupePK = new RgaUserGroupePK(idRGAUSER, idRGAGROUPE);
    }

    public RgaUserGroupePK getRgaUserGroupePK() {
        return rgaUserGroupePK;
    }

    public void setRgaUserGroupePK(RgaUserGroupePK rgaUserGroupePK) {
        this.rgaUserGroupePK = rgaUserGroupePK;
    }

    public String getCodect() {
        return codect;
    }

    public void setCodect(String codect) {
        this.codect = codect;
    }

    public RgaUser getRgaUser() {
        return rgaUser;
    }

    public void setRgaUser(RgaUser rgaUser) {
        this.rgaUser = rgaUser;
    }

    public RgaGroupe getRgaGroupe() {
        return rgaGroupe;
    }

    public void setRgaGroupe(RgaGroupe rgaGroupe) {
        this.rgaGroupe = rgaGroupe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rgaUserGroupePK != null ? rgaUserGroupePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RgaUserGroupe)) {
            return false;
        }
        RgaUserGroupe other = (RgaUserGroupe) object;
        if ((this.rgaUserGroupePK == null && other.rgaUserGroupePK != null) || (this.rgaUserGroupePK != null && !this.rgaUserGroupePK.equals(other.rgaUserGroupePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.RgaUserGroupe[ rgaUserGroupePK=" + rgaUserGroupePK + " ]";
    }
    
}
