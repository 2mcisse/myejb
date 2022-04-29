/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "bud_mvtbud")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BudMvtbud.findAll", query = "SELECT b FROM BudMvtbud b")
    , @NamedQuery(name = "BudMvtbud.findByIDBUDMvtBud", query = "SELECT b FROM BudMvtbud b WHERE b.iDBUDMvtBud = :iDBUDMvtBud")
    , @NamedQuery(name = "BudMvtbud.findByMontant", query = "SELECT b FROM BudMvtbud b WHERE b.montant = :montant")
    , @NamedQuery(name = "BudMvtbud.findByType", query = "SELECT b FROM BudMvtbud b WHERE b.type = :type")
    , @NamedQuery(name = "BudMvtbud.findByGestion", query = "SELECT b FROM BudMvtbud b WHERE b.gestion = :gestion")})
public class BudMvtbud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDBUD_MvtBud")
    private Integer iDBUDMvtBud;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "Montant")
    private BigDecimal montant;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Type")
    private short type;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "IDBUD_Virement", referencedColumnName = "IDBUD_Virement")
    @ManyToOne(optional = false)
    private BudVirements iDBUDVirement;
    @JoinColumn(name = "IDBUD_Budget", referencedColumnName = "IDBUD_Budget")
    @ManyToOne(optional = false)
    private BudBudget iDBUDBudget;

    public BudMvtbud() {
    }

    public BudMvtbud(Integer iDBUDMvtBud) {
        this.iDBUDMvtBud = iDBUDMvtBud;
    }

    public BudMvtbud(Integer iDBUDMvtBud, BigDecimal montant, short type) {
        this.iDBUDMvtBud = iDBUDMvtBud;
        this.montant = montant;
        this.type = type;
    }

    public Integer getIDBUDMvtBud() {
        return iDBUDMvtBud;
    }

    public void setIDBUDMvtBud(Integer iDBUDMvtBud) {
        this.iDBUDMvtBud = iDBUDMvtBud;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public BudVirements getIDBUDVirement() {
        return iDBUDVirement;
    }

    public void setIDBUDVirement(BudVirements iDBUDVirement) {
        this.iDBUDVirement = iDBUDVirement;
    }

    public BudBudget getIDBUDBudget() {
        return iDBUDBudget;
    }

    public void setIDBUDBudget(BudBudget iDBUDBudget) {
        this.iDBUDBudget = iDBUDBudget;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDBUDMvtBud != null ? iDBUDMvtBud.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudMvtbud)) {
            return false;
        }
        BudMvtbud other = (BudMvtbud) object;
        if ((this.iDBUDMvtBud == null && other.iDBUDMvtBud != null) || (this.iDBUDMvtBud != null && !this.iDBUDMvtBud.equals(other.iDBUDMvtBud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.BudMvtbud[ iDBUDMvtBud=" + iDBUDMvtBud + " ]";
    }
    
}
