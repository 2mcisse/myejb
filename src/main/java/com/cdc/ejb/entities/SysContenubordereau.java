/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "sys_contenubordereau")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SysContenubordereau.findAll", query = "SELECT s FROM SysContenubordereau s")
    , @NamedQuery(name = "SysContenubordereau.findByIDSYSContenuBordereau", query = "SELECT s FROM SysContenubordereau s WHERE s.iDSYSContenuBordereau = :iDSYSContenuBordereau")
    , @NamedQuery(name = "SysContenubordereau.findByOrdre", query = "SELECT s FROM SysContenubordereau s WHERE s.ordre = :ordre")})
public class SysContenubordereau implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSYS_ContenuBordereau")
    private Integer iDSYSContenuBordereau;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ordre")
    private int ordre;
    @JoinColumn(name = "IDSYS_Bordereau", referencedColumnName = "IDSYS_Bordereau")
    @ManyToOne(optional = false)
    private SysBordereau iDSYSBordereau;
    @JoinColumn(name = "IDBUD_Liquidation", referencedColumnName = "IDBUD_Liquidation")
    @ManyToOne(optional = false)
    private BudLiquidation iDBUDLiquidation;

    public SysContenubordereau() {
    }

    public SysContenubordereau(Integer iDSYSContenuBordereau) {
        this.iDSYSContenuBordereau = iDSYSContenuBordereau;
    }

    public SysContenubordereau(Integer iDSYSContenuBordereau, int ordre) {
        this.iDSYSContenuBordereau = iDSYSContenuBordereau;
        this.ordre = ordre;
    }

    public Integer getIDSYSContenuBordereau() {
        return iDSYSContenuBordereau;
    }

    public void setIDSYSContenuBordereau(Integer iDSYSContenuBordereau) {
        this.iDSYSContenuBordereau = iDSYSContenuBordereau;
    }

    public int getOrdre() {
        return ordre;
    }

    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }

    public SysBordereau getIDSYSBordereau() {
        return iDSYSBordereau;
    }

    public void setIDSYSBordereau(SysBordereau iDSYSBordereau) {
        this.iDSYSBordereau = iDSYSBordereau;
    }

    public BudLiquidation getIDBUDLiquidation() {
        return iDBUDLiquidation;
    }

    public void setIDBUDLiquidation(BudLiquidation iDBUDLiquidation) {
        this.iDBUDLiquidation = iDBUDLiquidation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDSYSContenuBordereau != null ? iDSYSContenuBordereau.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SysContenubordereau)) {
            return false;
        }
        SysContenubordereau other = (SysContenubordereau) object;
        if ((this.iDSYSContenuBordereau == null && other.iDSYSContenuBordereau != null) || (this.iDSYSContenuBordereau != null && !this.iDSYSContenuBordereau.equals(other.iDSYSContenuBordereau))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.SysContenubordereau[ iDSYSContenuBordereau=" + iDSYSContenuBordereau + " ]";
    }
    
}
