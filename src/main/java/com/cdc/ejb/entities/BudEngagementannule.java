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
@Table(name = "bud_engagementannule")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BudEngagementannule.findAll", query = "SELECT b FROM BudEngagementannule b")
    , @NamedQuery(name = "BudEngagementannule.findByIDBUDEngagement", query = "SELECT b FROM BudEngagementannule b WHERE b.iDBUDEngagement = :iDBUDEngagement")
    , @NamedQuery(name = "BudEngagementannule.findByNumero", query = "SELECT b FROM BudEngagementannule b WHERE b.numero = :numero")
    , @NamedQuery(name = "BudEngagementannule.findByMontant", query = "SELECT b FROM BudEngagementannule b WHERE b.montant = :montant")
    , @NamedQuery(name = "BudEngagementannule.findByObjetdepense", query = "SELECT b FROM BudEngagementannule b WHERE b.objetdepense = :objetdepense")
    , @NamedQuery(name = "BudEngagementannule.findByObservation", query = "SELECT b FROM BudEngagementannule b WHERE b.observation = :observation")
    , @NamedQuery(name = "BudEngagementannule.findByDateEngagement", query = "SELECT b FROM BudEngagementannule b WHERE b.dateEngagement = :dateEngagement")
    , @NamedQuery(name = "BudEngagementannule.findByDateVisaDG", query = "SELECT b FROM BudEngagementannule b WHERE b.dateVisaDG = :dateVisaDG")
    , @NamedQuery(name = "BudEngagementannule.findByDateSaisie", query = "SELECT b FROM BudEngagementannule b WHERE b.dateSaisie = :dateSaisie")
    , @NamedQuery(name = "BudEngagementannule.findByDateVisaCG", query = "SELECT b FROM BudEngagementannule b WHERE b.dateVisaCG = :dateVisaCG")
    , @NamedQuery(name = "BudEngagementannule.findByDateVisaSAGE", query = "SELECT b FROM BudEngagementannule b WHERE b.dateVisaSAGE = :dateVisaSAGE")
    , @NamedQuery(name = "BudEngagementannule.findByEtatValidation", query = "SELECT b FROM BudEngagementannule b WHERE b.etatValidation = :etatValidation")
    , @NamedQuery(name = "BudEngagementannule.findByIDBUDEngagementAnnule", query = "SELECT b FROM BudEngagementannule b WHERE b.iDBUDEngagementAnnule = :iDBUDEngagementAnnule")
    , @NamedQuery(name = "BudEngagementannule.findByGestion", query = "SELECT b FROM BudEngagementannule b WHERE b.gestion = :gestion")})
public class BudEngagementannule implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDBUD_Engagement")
    private int iDBUDEngagement;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Numero")
    private String numero;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "Montant")
    private BigDecimal montant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Objetdepense")
    private String objetdepense;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Observation")
    private String observation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateEngagement")
    @Temporal(TemporalType.DATE)
    private Date dateEngagement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateVisaDG")
    @Temporal(TemporalType.DATE)
    private Date dateVisaDG;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateSaisie")
    @Temporal(TemporalType.DATE)
    private Date dateSaisie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateVisaCG")
    @Temporal(TemporalType.DATE)
    private Date dateVisaCG;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateVisaSAGE")
    @Temporal(TemporalType.DATE)
    private Date dateVisaSAGE;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EtatValidation")
    private short etatValidation;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDBUD_EngagementAnnule")
    private Integer iDBUDEngagementAnnule;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "IDBUD_Budget", referencedColumnName = "IDBUD_Budget")
    @ManyToOne(optional = false)
    private BudBudget iDBUDBudget;

    public BudEngagementannule() {
    }

    public BudEngagementannule(Integer iDBUDEngagementAnnule) {
        this.iDBUDEngagementAnnule = iDBUDEngagementAnnule;
    }

    public BudEngagementannule(Integer iDBUDEngagementAnnule, int iDBUDEngagement, String numero, BigDecimal montant, String objetdepense, String observation, Date dateEngagement, Date dateVisaDG, Date dateSaisie, Date dateVisaCG, Date dateVisaSAGE, short etatValidation) {
        this.iDBUDEngagementAnnule = iDBUDEngagementAnnule;
        this.iDBUDEngagement = iDBUDEngagement;
        this.numero = numero;
        this.montant = montant;
        this.objetdepense = objetdepense;
        this.observation = observation;
        this.dateEngagement = dateEngagement;
        this.dateVisaDG = dateVisaDG;
        this.dateSaisie = dateSaisie;
        this.dateVisaCG = dateVisaCG;
        this.dateVisaSAGE = dateVisaSAGE;
        this.etatValidation = etatValidation;
    }

    public int getIDBUDEngagement() {
        return iDBUDEngagement;
    }

    public void setIDBUDEngagement(int iDBUDEngagement) {
        this.iDBUDEngagement = iDBUDEngagement;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public String getObjetdepense() {
        return objetdepense;
    }

    public void setObjetdepense(String objetdepense) {
        this.objetdepense = objetdepense;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public Date getDateEngagement() {
        return dateEngagement;
    }

    public void setDateEngagement(Date dateEngagement) {
        this.dateEngagement = dateEngagement;
    }

    public Date getDateVisaDG() {
        return dateVisaDG;
    }

    public void setDateVisaDG(Date dateVisaDG) {
        this.dateVisaDG = dateVisaDG;
    }

    public Date getDateSaisie() {
        return dateSaisie;
    }

    public void setDateSaisie(Date dateSaisie) {
        this.dateSaisie = dateSaisie;
    }

    public Date getDateVisaCG() {
        return dateVisaCG;
    }

    public void setDateVisaCG(Date dateVisaCG) {
        this.dateVisaCG = dateVisaCG;
    }

    public Date getDateVisaSAGE() {
        return dateVisaSAGE;
    }

    public void setDateVisaSAGE(Date dateVisaSAGE) {
        this.dateVisaSAGE = dateVisaSAGE;
    }

    public short getEtatValidation() {
        return etatValidation;
    }

    public void setEtatValidation(short etatValidation) {
        this.etatValidation = etatValidation;
    }

    public Integer getIDBUDEngagementAnnule() {
        return iDBUDEngagementAnnule;
    }

    public void setIDBUDEngagementAnnule(Integer iDBUDEngagementAnnule) {
        this.iDBUDEngagementAnnule = iDBUDEngagementAnnule;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
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
        hash += (iDBUDEngagementAnnule != null ? iDBUDEngagementAnnule.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudEngagementannule)) {
            return false;
        }
        BudEngagementannule other = (BudEngagementannule) object;
        if ((this.iDBUDEngagementAnnule == null && other.iDBUDEngagementAnnule != null) || (this.iDBUDEngagementAnnule != null && !this.iDBUDEngagementAnnule.equals(other.iDBUDEngagementAnnule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.BudEngagementannule[ iDBUDEngagementAnnule=" + iDBUDEngagementAnnule + " ]";
    }
    
}
