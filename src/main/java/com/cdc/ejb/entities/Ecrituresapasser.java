/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "ecrituresapasser")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ecrituresapasser.findAll", query = "SELECT e FROM Ecrituresapasser e")
    , @NamedQuery(name = "Ecrituresapasser.findByIDMouvement", query = "SELECT e FROM Ecrituresapasser e WHERE e.iDMouvement = :iDMouvement")
    , @NamedQuery(name = "Ecrituresapasser.findByDateMouvement", query = "SELECT e FROM Ecrituresapasser e WHERE e.dateMouvement = :dateMouvement")
    , @NamedQuery(name = "Ecrituresapasser.findByCodeDec", query = "SELECT e FROM Ecrituresapasser e WHERE e.codeDec = :codeDec")
    , @NamedQuery(name = "Ecrituresapasser.findByCodeEnc", query = "SELECT e FROM Ecrituresapasser e WHERE e.codeEnc = :codeEnc")
    , @NamedQuery(name = "Ecrituresapasser.findByCodejnl", query = "SELECT e FROM Ecrituresapasser e WHERE e.codejnl = :codejnl")
    , @NamedQuery(name = "Ecrituresapasser.findByLibelle", query = "SELECT e FROM Ecrituresapasser e WHERE e.libelle = :libelle")
    , @NamedQuery(name = "Ecrituresapasser.findByNumeroCompte", query = "SELECT e FROM Ecrituresapasser e WHERE e.numeroCompte = :numeroCompte")
    , @NamedQuery(name = "Ecrituresapasser.findByIDBUDLiquidation", query = "SELECT e FROM Ecrituresapasser e WHERE e.iDBUDLiquidation = :iDBUDLiquidation")
    , @NamedQuery(name = "Ecrituresapasser.findByIDOrdresDePaiement", query = "SELECT e FROM Ecrituresapasser e WHERE e.iDOrdresDePaiement = :iDOrdresDePaiement")
    , @NamedQuery(name = "Ecrituresapasser.findByDebitEcriture", query = "SELECT e FROM Ecrituresapasser e WHERE e.debitEcriture = :debitEcriture")
    , @NamedQuery(name = "Ecrituresapasser.findByCreditEcriture", query = "SELECT e FROM Ecrituresapasser e WHERE e.creditEcriture = :creditEcriture")
    , @NamedQuery(name = "Ecrituresapasser.findByGestion", query = "SELECT e FROM Ecrituresapasser e WHERE e.gestion = :gestion")})
public class Ecrituresapasser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDMouvement")
    private Long iDMouvement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateMouvement")
    @Temporal(TemporalType.DATE)
    private Date dateMouvement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_DEC")
    private long codeDec;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_ENC")
    private long codeEnc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CODEJNL")
    private String codejnl;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "LIBELLE")
    private String libelle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 51)
    @Column(name = "NumeroCompte")
    private String numeroCompte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDBUD_Liquidation")
    private int iDBUDLiquidation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDOrdresDePaiement")
    private int iDOrdresDePaiement;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "DebitEcriture")
    private BigDecimal debitEcriture;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CreditEcriture")
    private BigDecimal creditEcriture;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;

    public Ecrituresapasser() {
    }

    public Ecrituresapasser(Long iDMouvement) {
        this.iDMouvement = iDMouvement;
    }

    public Ecrituresapasser(Long iDMouvement, Date dateMouvement, long codeDec, long codeEnc, String codejnl, String libelle, String numeroCompte, int iDBUDLiquidation, int iDOrdresDePaiement, BigDecimal debitEcriture, BigDecimal creditEcriture) {
        this.iDMouvement = iDMouvement;
        this.dateMouvement = dateMouvement;
        this.codeDec = codeDec;
        this.codeEnc = codeEnc;
        this.codejnl = codejnl;
        this.libelle = libelle;
        this.numeroCompte = numeroCompte;
        this.iDBUDLiquidation = iDBUDLiquidation;
        this.iDOrdresDePaiement = iDOrdresDePaiement;
        this.debitEcriture = debitEcriture;
        this.creditEcriture = creditEcriture;
    }

    public Long getIDMouvement() {
        return iDMouvement;
    }

    public void setIDMouvement(Long iDMouvement) {
        this.iDMouvement = iDMouvement;
    }

    public Date getDateMouvement() {
        return dateMouvement;
    }

    public void setDateMouvement(Date dateMouvement) {
        this.dateMouvement = dateMouvement;
    }

    public long getCodeDec() {
        return codeDec;
    }

    public void setCodeDec(long codeDec) {
        this.codeDec = codeDec;
    }

    public long getCodeEnc() {
        return codeEnc;
    }

    public void setCodeEnc(long codeEnc) {
        this.codeEnc = codeEnc;
    }

    public String getCodejnl() {
        return codejnl;
    }

    public void setCodejnl(String codejnl) {
        this.codejnl = codejnl;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public int getIDBUDLiquidation() {
        return iDBUDLiquidation;
    }

    public void setIDBUDLiquidation(int iDBUDLiquidation) {
        this.iDBUDLiquidation = iDBUDLiquidation;
    }

    public int getIDOrdresDePaiement() {
        return iDOrdresDePaiement;
    }

    public void setIDOrdresDePaiement(int iDOrdresDePaiement) {
        this.iDOrdresDePaiement = iDOrdresDePaiement;
    }

    public BigDecimal getDebitEcriture() {
        return debitEcriture;
    }

    public void setDebitEcriture(BigDecimal debitEcriture) {
        this.debitEcriture = debitEcriture;
    }

    public BigDecimal getCreditEcriture() {
        return creditEcriture;
    }

    public void setCreditEcriture(BigDecimal creditEcriture) {
        this.creditEcriture = creditEcriture;
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
        hash += (iDMouvement != null ? iDMouvement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ecrituresapasser)) {
            return false;
        }
        Ecrituresapasser other = (Ecrituresapasser) object;
        if ((this.iDMouvement == null && other.iDMouvement != null) || (this.iDMouvement != null && !this.iDMouvement.equals(other.iDMouvement))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Ecrituresapasser[ iDMouvement=" + iDMouvement + " ]";
    }
    
}
