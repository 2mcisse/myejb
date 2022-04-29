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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "pf_detailsarretes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PfDetailsarretes.findAll", query = "SELECT p FROM PfDetailsarretes p")
    , @NamedQuery(name = "PfDetailsarretes.findByIDDetailsArretes", query = "SELECT p FROM PfDetailsarretes p WHERE p.iDDetailsArretes = :iDDetailsArretes")
    , @NamedQuery(name = "PfDetailsarretes.findByDateValeur", query = "SELECT p FROM PfDetailsarretes p WHERE p.dateValeur = :dateValeur")
    , @NamedQuery(name = "PfDetailsarretes.findByNombreDeJours", query = "SELECT p FROM PfDetailsarretes p WHERE p.nombreDeJours = :nombreDeJours")
    , @NamedQuery(name = "PfDetailsarretes.findByMontantInterets", query = "SELECT p FROM PfDetailsarretes p WHERE p.montantInterets = :montantInterets")
    , @NamedQuery(name = "PfDetailsarretes.findBySolde", query = "SELECT p FROM PfDetailsarretes p WHERE p.solde = :solde")
    , @NamedQuery(name = "PfDetailsarretes.findByMontantOuverture", query = "SELECT p FROM PfDetailsarretes p WHERE p.montantOuverture = :montantOuverture")
    , @NamedQuery(name = "PfDetailsarretes.findByDateOperation", query = "SELECT p FROM PfDetailsarretes p WHERE p.dateOperation = :dateOperation")
    , @NamedQuery(name = "PfDetailsarretes.findByLibelleOperation", query = "SELECT p FROM PfDetailsarretes p WHERE p.libelleOperation = :libelleOperation")
    , @NamedQuery(name = "PfDetailsarretes.findByIdaffaires", query = "SELECT p FROM PfDetailsarretes p WHERE p.idaffaires = :idaffaires")
    , @NamedQuery(name = "PfDetailsarretes.findByDateArrete", query = "SELECT p FROM PfDetailsarretes p WHERE p.dateArrete = :dateArrete")
    , @NamedQuery(name = "PfDetailsarretes.findByMontantTVA", query = "SELECT p FROM PfDetailsarretes p WHERE p.montantTVA = :montantTVA")
    , @NamedQuery(name = "PfDetailsarretes.findByMontantIRC", query = "SELECT p FROM PfDetailsarretes p WHERE p.montantIRC = :montantIRC")
    , @NamedQuery(name = "PfDetailsarretes.findByInteretAverser", query = "SELECT p FROM PfDetailsarretes p WHERE p.interetAverser = :interetAverser")
    , @NamedQuery(name = "PfDetailsarretes.findByGestion", query = "SELECT p FROM PfDetailsarretes p WHERE p.gestion = :gestion")})
public class PfDetailsarretes implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Column(name = "MontantInterets")
    private int montantInterets;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SOLDE")
    private short solde;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "MontantOuverture")
    private BigDecimal montantOuverture;
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
    @Column(name = "DateArrete")
    @Temporal(TemporalType.DATE)
    private Date dateArrete;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MontantTVA")
    private int montantTVA;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MontantIRC")
    private int montantIRC;
    @Basic(optional = false)
    @NotNull
    @Column(name = "InteretAverser")
    private int interetAverser;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "IDArrete", referencedColumnName = "IDArrete")
    @ManyToOne(optional = false)
    private PfArrete iDArrete;

    public PfDetailsarretes() {
    }

    public PfDetailsarretes(Integer iDDetailsArretes) {
        this.iDDetailsArretes = iDDetailsArretes;
    }

    public PfDetailsarretes(Integer iDDetailsArretes, Date dateValeur, int nombreDeJours, int montantInterets, short solde, BigDecimal montantOuverture, Date dateOperation, String libelleOperation, int idaffaires, Date dateArrete, int montantTVA, int montantIRC, int interetAverser) {
        this.iDDetailsArretes = iDDetailsArretes;
        this.dateValeur = dateValeur;
        this.nombreDeJours = nombreDeJours;
        this.montantInterets = montantInterets;
        this.solde = solde;
        this.montantOuverture = montantOuverture;
        this.dateOperation = dateOperation;
        this.libelleOperation = libelleOperation;
        this.idaffaires = idaffaires;
        this.dateArrete = dateArrete;
        this.montantTVA = montantTVA;
        this.montantIRC = montantIRC;
        this.interetAverser = interetAverser;
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

    public int getMontantInterets() {
        return montantInterets;
    }

    public void setMontantInterets(int montantInterets) {
        this.montantInterets = montantInterets;
    }

    public short getSolde() {
        return solde;
    }

    public void setSolde(short solde) {
        this.solde = solde;
    }

    public BigDecimal getMontantOuverture() {
        return montantOuverture;
    }

    public void setMontantOuverture(BigDecimal montantOuverture) {
        this.montantOuverture = montantOuverture;
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

    public Date getDateArrete() {
        return dateArrete;
    }

    public void setDateArrete(Date dateArrete) {
        this.dateArrete = dateArrete;
    }

    public int getMontantTVA() {
        return montantTVA;
    }

    public void setMontantTVA(int montantTVA) {
        this.montantTVA = montantTVA;
    }

    public int getMontantIRC() {
        return montantIRC;
    }

    public void setMontantIRC(int montantIRC) {
        this.montantIRC = montantIRC;
    }

    public int getInteretAverser() {
        return interetAverser;
    }

    public void setInteretAverser(int interetAverser) {
        this.interetAverser = interetAverser;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public PfArrete getIDArrete() {
        return iDArrete;
    }

    public void setIDArrete(PfArrete iDArrete) {
        this.iDArrete = iDArrete;
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
        if (!(object instanceof PfDetailsarretes)) {
            return false;
        }
        PfDetailsarretes other = (PfDetailsarretes) object;
        if ((this.iDDetailsArretes == null && other.iDDetailsArretes != null) || (this.iDDetailsArretes != null && !this.iDDetailsArretes.equals(other.iDDetailsArretes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.PfDetailsarretes[ iDDetailsArretes=" + iDDetailsArretes + " ]";
    }
    
}
