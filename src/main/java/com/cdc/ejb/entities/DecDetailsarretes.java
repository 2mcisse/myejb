/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "dec_detailsarretes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DecDetailsarretes.findAll", query = "SELECT d FROM DecDetailsarretes d")
    , @NamedQuery(name = "DecDetailsarretes.findByIDDetailsArretes", query = "SELECT d FROM DecDetailsarretes d WHERE d.iDDetailsArretes = :iDDetailsArretes")
    , @NamedQuery(name = "DecDetailsarretes.findByDateValeur", query = "SELECT d FROM DecDetailsarretes d WHERE d.dateValeur = :dateValeur")
    , @NamedQuery(name = "DecDetailsarretes.findByNombreDeJours", query = "SELECT d FROM DecDetailsarretes d WHERE d.nombreDeJours = :nombreDeJours")
    , @NamedQuery(name = "DecDetailsarretes.findBySoldeDebit", query = "SELECT d FROM DecDetailsarretes d WHERE d.soldeDebit = :soldeDebit")
    , @NamedQuery(name = "DecDetailsarretes.findBySoldeCredit", query = "SELECT d FROM DecDetailsarretes d WHERE d.soldeCredit = :soldeCredit")
    , @NamedQuery(name = "DecDetailsarretes.findByMontantCreditOuverture", query = "SELECT d FROM DecDetailsarretes d WHERE d.montantCreditOuverture = :montantCreditOuverture")
    , @NamedQuery(name = "DecDetailsarretes.findByMontantDebitOuverture", query = "SELECT d FROM DecDetailsarretes d WHERE d.montantDebitOuverture = :montantDebitOuverture")
    , @NamedQuery(name = "DecDetailsarretes.findByMontantDebitInterets", query = "SELECT d FROM DecDetailsarretes d WHERE d.montantDebitInterets = :montantDebitInterets")
    , @NamedQuery(name = "DecDetailsarretes.findByMontantCreditInterets", query = "SELECT d FROM DecDetailsarretes d WHERE d.montantCreditInterets = :montantCreditInterets")
    , @NamedQuery(name = "DecDetailsarretes.findByDateOperation", query = "SELECT d FROM DecDetailsarretes d WHERE d.dateOperation = :dateOperation")
    , @NamedQuery(name = "DecDetailsarretes.findByLibelleOperation", query = "SELECT d FROM DecDetailsarretes d WHERE d.libelleOperation = :libelleOperation")
    , @NamedQuery(name = "DecDetailsarretes.findByIdaffaires", query = "SELECT d FROM DecDetailsarretes d WHERE d.idaffaires = :idaffaires")
    , @NamedQuery(name = "DecDetailsarretes.findByNumTiers", query = "SELECT d FROM DecDetailsarretes d WHERE d.numTiers = :numTiers")
    , @NamedQuery(name = "DecDetailsarretes.findByIDBUDEngagement", query = "SELECT d FROM DecDetailsarretes d WHERE d.iDBUDEngagement = :iDBUDEngagement")
    , @NamedQuery(name = "DecDetailsarretes.findByDateArrete", query = "SELECT d FROM DecDetailsarretes d WHERE d.dateArrete = :dateArrete")
    , @NamedQuery(name = "DecDetailsarretes.findByGestion", query = "SELECT d FROM DecDetailsarretes d WHERE d.gestion = :gestion")})
public class DecDetailsarretes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDetailsArretes")
    private Integer iDDetailsArretes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateValeur")
    @Temporal(TemporalType.DATE)
    private Date dateValeur;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NombreDeJours")
    private int nombreDeJours;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "SoldeDebit")
    private BigDecimal soldeDebit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SoldeCredit")
    private BigDecimal soldeCredit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MontantCreditOuverture")
    private BigDecimal montantCreditOuverture;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MontantDebitOuverture")
    private BigDecimal montantDebitOuverture;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MontantDebitInterets")
    private BigDecimal montantDebitInterets;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MontantCreditInterets")
    private BigDecimal montantCreditInterets;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateOperation")
    @Temporal(TemporalType.DATE)
    private Date dateOperation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "LibelleOperation")
    private String libelleOperation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDAFFAIRES")
    private int idaffaires;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NumTiers")
    private long numTiers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDBUD_Engagement")
    private int iDBUDEngagement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateArrete")
    @Temporal(TemporalType.DATE)
    private Date dateArrete;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "IDArrete", referencedColumnName = "IDArrete")
    @ManyToOne(optional = false)
    private DecArrete iDArrete;
    @JoinColumn(name = "CODE_ENC", referencedColumnName = "CODE_ENC")
    @ManyToOne(optional = false)
    private Encaissements codeEnc;
    @JoinColumn(name = "CODE_DEC", referencedColumnName = "CODE_DEC")
    @ManyToOne(optional = false)
    private Decaissements codeDec;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDDetailsArretes")
    private List<DecMouvements> decMouvementsList;

    public DecDetailsarretes() {
    }

    public DecDetailsarretes(Integer iDDetailsArretes) {
        this.iDDetailsArretes = iDDetailsArretes;
    }

    public DecDetailsarretes(Integer iDDetailsArretes, Date dateValeur, int nombreDeJours, BigDecimal soldeDebit, BigDecimal soldeCredit, BigDecimal montantCreditOuverture, BigDecimal montantDebitOuverture, BigDecimal montantDebitInterets, BigDecimal montantCreditInterets, Date dateOperation, String libelleOperation, int idaffaires, long numTiers, int iDBUDEngagement, Date dateArrete) {
        this.iDDetailsArretes = iDDetailsArretes;
        this.dateValeur = dateValeur;
        this.nombreDeJours = nombreDeJours;
        this.soldeDebit = soldeDebit;
        this.soldeCredit = soldeCredit;
        this.montantCreditOuverture = montantCreditOuverture;
        this.montantDebitOuverture = montantDebitOuverture;
        this.montantDebitInterets = montantDebitInterets;
        this.montantCreditInterets = montantCreditInterets;
        this.dateOperation = dateOperation;
        this.libelleOperation = libelleOperation;
        this.idaffaires = idaffaires;
        this.numTiers = numTiers;
        this.iDBUDEngagement = iDBUDEngagement;
        this.dateArrete = dateArrete;
    }

    public Integer getIDDetailsArretes() {
        return iDDetailsArretes;
    }

    public void setIDDetailsArretes(Integer iDDetailsArretes) {
        this.iDDetailsArretes = iDDetailsArretes;
    }

    public Date getDateValeur() {
        return dateValeur;
    }

    public void setDateValeur(Date dateValeur) {
        this.dateValeur = dateValeur;
    }

    public int getNombreDeJours() {
        return nombreDeJours;
    }

    public void setNombreDeJours(int nombreDeJours) {
        this.nombreDeJours = nombreDeJours;
    }

    public BigDecimal getSoldeDebit() {
        return soldeDebit;
    }

    public void setSoldeDebit(BigDecimal soldeDebit) {
        this.soldeDebit = soldeDebit;
    }

    public BigDecimal getSoldeCredit() {
        return soldeCredit;
    }

    public void setSoldeCredit(BigDecimal soldeCredit) {
        this.soldeCredit = soldeCredit;
    }

    public BigDecimal getMontantCreditOuverture() {
        return montantCreditOuverture;
    }

    public void setMontantCreditOuverture(BigDecimal montantCreditOuverture) {
        this.montantCreditOuverture = montantCreditOuverture;
    }

    public BigDecimal getMontantDebitOuverture() {
        return montantDebitOuverture;
    }

    public void setMontantDebitOuverture(BigDecimal montantDebitOuverture) {
        this.montantDebitOuverture = montantDebitOuverture;
    }

    public BigDecimal getMontantDebitInterets() {
        return montantDebitInterets;
    }

    public void setMontantDebitInterets(BigDecimal montantDebitInterets) {
        this.montantDebitInterets = montantDebitInterets;
    }

    public BigDecimal getMontantCreditInterets() {
        return montantCreditInterets;
    }

    public void setMontantCreditInterets(BigDecimal montantCreditInterets) {
        this.montantCreditInterets = montantCreditInterets;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public String getLibelleOperation() {
        return libelleOperation;
    }

    public void setLibelleOperation(String libelleOperation) {
        this.libelleOperation = libelleOperation;
    }

    public int getIdaffaires() {
        return idaffaires;
    }

    public void setIdaffaires(int idaffaires) {
        this.idaffaires = idaffaires;
    }

    public long getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(long numTiers) {
        this.numTiers = numTiers;
    }

    public int getIDBUDEngagement() {
        return iDBUDEngagement;
    }

    public void setIDBUDEngagement(int iDBUDEngagement) {
        this.iDBUDEngagement = iDBUDEngagement;
    }

    public Date getDateArrete() {
        return dateArrete;
    }

    public void setDateArrete(Date dateArrete) {
        this.dateArrete = dateArrete;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public DecArrete getIDArrete() {
        return iDArrete;
    }

    public void setIDArrete(DecArrete iDArrete) {
        this.iDArrete = iDArrete;
    }

    public Encaissements getCodeEnc() {
        return codeEnc;
    }

    public void setCodeEnc(Encaissements codeEnc) {
        this.codeEnc = codeEnc;
    }

    public Decaissements getCodeDec() {
        return codeDec;
    }

    public void setCodeDec(Decaissements codeDec) {
        this.codeDec = codeDec;
    }

    @XmlTransient
    public List<DecMouvements> getDecMouvementsList() {
        return decMouvementsList;
    }

    public void setDecMouvementsList(List<DecMouvements> decMouvementsList) {
        this.decMouvementsList = decMouvementsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDDetailsArretes != null ? iDDetailsArretes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DecDetailsarretes)) {
            return false;
        }
        DecDetailsarretes other = (DecDetailsarretes) object;
        if ((this.iDDetailsArretes == null && other.iDDetailsArretes != null) || (this.iDDetailsArretes != null && !this.iDDetailsArretes.equals(other.iDDetailsArretes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.DecDetailsarretes[ iDDetailsArretes=" + iDDetailsArretes + " ]";
    }
    
}
