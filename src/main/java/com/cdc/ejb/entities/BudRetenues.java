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
@Table(name = "bud_retenues")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BudRetenues.findAll", query = "SELECT b FROM BudRetenues b")
    , @NamedQuery(name = "BudRetenues.findByIDBUDRetenues", query = "SELECT b FROM BudRetenues b WHERE b.iDBUDRetenues = :iDBUDRetenues")
    , @NamedQuery(name = "BudRetenues.findByMontant", query = "SELECT b FROM BudRetenues b WHERE b.montant = :montant")
    , @NamedQuery(name = "BudRetenues.findByObservation", query = "SELECT b FROM BudRetenues b WHERE b.observation = :observation")
    , @NamedQuery(name = "BudRetenues.findByTva", query = "SELECT b FROM BudRetenues b WHERE b.tva = :tva")
    , @NamedQuery(name = "BudRetenues.findByNumeroCompte", query = "SELECT b FROM BudRetenues b WHERE b.numeroCompte = :numeroCompte")
    , @NamedQuery(name = "BudRetenues.findByGestion", query = "SELECT b FROM BudRetenues b WHERE b.gestion = :gestion")})
public class BudRetenues implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDBUD_Retenues")
    private Integer iDBUDRetenues;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "Montant")
    private BigDecimal montant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "OBSERVATION")
    private String observation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TVA")
    private short tva;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 51)
    @Column(name = "NumeroCompte")
    private String numeroCompte;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "IDBUD_Liquidation", referencedColumnName = "IDBUD_Liquidation")
    @ManyToOne(optional = false)
    private BudLiquidation iDBUDLiquidation;
    @JoinColumn(name = "IDBUD_TypeRetenues", referencedColumnName = "IDBUD_TypeRetenues")
    @ManyToOne(optional = false)
    private BudTyperetenues iDBUDTypeRetenues;
    @JoinColumn(name = "IDOrdresDePaiement", referencedColumnName = "IDOrdresDePaiement")
    @ManyToOne(optional = false)
    private Ordresdepaiement iDOrdresDePaiement;

    public BudRetenues() {
    }

    public BudRetenues(Integer iDBUDRetenues) {
        this.iDBUDRetenues = iDBUDRetenues;
    }

    public BudRetenues(Integer iDBUDRetenues, BigDecimal montant, String observation, short tva, String numeroCompte) {
        this.iDBUDRetenues = iDBUDRetenues;
        this.montant = montant;
        this.observation = observation;
        this.tva = tva;
        this.numeroCompte = numeroCompte;
    }

    public Integer getIDBUDRetenues() {
        return iDBUDRetenues;
    }

    public void setIDBUDRetenues(Integer iDBUDRetenues) {
        this.iDBUDRetenues = iDBUDRetenues;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public short getTva() {
        return tva;
    }

    public void setTva(short tva) {
        this.tva = tva;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public BudLiquidation getIDBUDLiquidation() {
        return iDBUDLiquidation;
    }

    public void setIDBUDLiquidation(BudLiquidation iDBUDLiquidation) {
        this.iDBUDLiquidation = iDBUDLiquidation;
    }

    public BudTyperetenues getIDBUDTypeRetenues() {
        return iDBUDTypeRetenues;
    }

    public void setIDBUDTypeRetenues(BudTyperetenues iDBUDTypeRetenues) {
        this.iDBUDTypeRetenues = iDBUDTypeRetenues;
    }

    public Ordresdepaiement getIDOrdresDePaiement() {
        return iDOrdresDePaiement;
    }

    public void setIDOrdresDePaiement(Ordresdepaiement iDOrdresDePaiement) {
        this.iDOrdresDePaiement = iDOrdresDePaiement;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDBUDRetenues != null ? iDBUDRetenues.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudRetenues)) {
            return false;
        }
        BudRetenues other = (BudRetenues) object;
        if ((this.iDBUDRetenues == null && other.iDBUDRetenues != null) || (this.iDBUDRetenues != null && !this.iDBUDRetenues.equals(other.iDBUDRetenues))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.BudRetenues[ iDBUDRetenues=" + iDBUDRetenues + " ]";
    }
    
}
