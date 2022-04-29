/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author ALIENWARE
 */
@Embeddable
public class RgaUserGroupePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idRGA_USER")
    private int idRGAUSER;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idRGA_GROUPE")
    private int idRGAGROUPE;

    public RgaUserGroupePK() {
    }

    public RgaUserGroupePK(int idRGAUSER, int idRGAGROUPE) {
        this.idRGAUSER = idRGAUSER;
        this.idRGAGROUPE = idRGAGROUPE;
    }

    public int getIdRGAUSER() {
        return idRGAUSER;
    }

    public void setIdRGAUSER(int idRGAUSER) {
        this.idRGAUSER = idRGAUSER;
    }

    public int getIdRGAGROUPE() {
        return idRGAGROUPE;
    }

    public void setIdRGAGROUPE(int idRGAGROUPE) {
        this.idRGAGROUPE = idRGAGROUPE;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idRGAUSER;
        hash += (int) idRGAGROUPE;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RgaUserGroupePK)) {
            return false;
        }
        RgaUserGroupePK other = (RgaUserGroupePK) object;
        if (this.idRGAUSER != other.idRGAUSER) {
            return false;
        }
        if (this.idRGAGROUPE != other.idRGAGROUPE) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.RgaUserGroupePK[ idRGAUSER=" + idRGAUSER + ", idRGAGROUPE=" + idRGAGROUPE + " ]";
    }
    
}
