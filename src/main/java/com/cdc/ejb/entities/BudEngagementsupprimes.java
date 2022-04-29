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
@Table(name = "bud_engagementsupprimes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BudEngagementsupprimes.findAll", query = "SELECT b FROM BudEngagementsupprimes b")
    , @NamedQuery(name = "BudEngagementsupprimes.findByIDBUDEngagement", query = "SELECT b FROM BudEngagementsupprimes b WHERE b.iDBUDEngagement = :iDBUDEngagement")
    , @NamedQuery(name = "BudEngagementsupprimes.findByNumero", query = "SELECT b FROM BudEngagementsupprimes b WHERE b.numero = :numero")
    , @NamedQuery(name = "BudEngagementsupprimes.findByMontant", query = "SELECT b FROM BudEngagementsupprimes b WHERE b.montant = :montant")
    , @NamedQuery(name = "BudEngagementsupprimes.findByObjetdepense", query = "SELECT b FROM BudEngagementsupprimes b WHERE b.objetdepense = :objetdepense")
    , @NamedQuery(name = "BudEngagementsupprimes.findByObservation", query = "SELECT b FROM BudEngagementsupprimes b WHERE b.observation = :observation")
    , @NamedQuery(name = "BudEngagementsupprimes.findByIDBUDBudget", query = "SELECT b FROM BudEngagementsupprimes b WHERE b.iDBUDBudget = :iDBUDBudget")
    , @NamedQuery(name = "BudEngagementsupprimes.findByDateEngagement", query = "SELECT b FROM BudEngagementsupprimes b WHERE b.dateEngagement = :dateEngagement")
    , @NamedQuery(name = "BudEngagementsupprimes.findByDateVisaDG", query = "SELECT b FROM BudEngagementsupprimes b WHERE b.dateVisaDG = :dateVisaDG")
    , @NamedQuery(name = "BudEngagementsupprimes.findByDateSaisie", query = "SELECT b FROM BudEngagementsupprimes b WHERE b.dateSaisie = :dateSaisie")
    , @NamedQuery(name = "BudEngagementsupprimes.findByIDSYSEntite", query = "SELECT b FROM BudEngagementsupprimes b WHERE b.iDSYSEntite = :iDSYSEntite")
    , @NamedQuery(name = "BudEngagementsupprimes.findByDateVisaCG", query = "SELECT b FROM BudEngagementsupprimes b WHERE b.dateVisaCG = :dateVisaCG")
    , @NamedQuery(name = "BudEngagementsupprimes.findByDateVisaSAGE", query = "SELECT b FROM BudEngagementsupprimes b WHERE b.dateVisaSAGE = :dateVisaSAGE")
    , @NamedQuery(name = "BudEngagementsupprimes.findByEtatValidation", query = "SELECT b FROM BudEngagementsupprimes b WHERE b.etatValidation = :etatValidation")
    , @NamedQuery(name = "BudEngagementsupprimes.findByLogin", query = "SELECT b FROM BudEngagementsupprimes b WHERE b.login = :login")
    , @NamedQuery(name = "BudEngagementsupprimes.findByLOGINSuppr", query = "SELECT b FROM BudEngagementsupprimes b WHERE b.lOGINSuppr = :lOGINSuppr")
    , @NamedQuery(name = "BudEngagementsupprimes.findByDateSuppression", query = "SELECT b FROM BudEngagementsupprimes b WHERE b.dateSuppression = :dateSuppression")
    , @NamedQuery(name = "BudEngagementsupprimes.findByGestion", query = "SELECT b FROM BudEngagementsupprimes b WHERE b.gestion = :gestion")})
public class BudEngagementsupprimes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDBUD_Engagement")
    private Integer iDBUDEngagement;
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
    @Column(name = "IDBUD_Budget")
    private int iDBUDBudget;
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
    @Column(name = "IDSYS_Entite")
    private int iDSYSEntite;
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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "LOGIN")
    private String login;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "LOGIN_Suppr")
    private String lOGINSuppr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Date_Suppression")
    @Temporal(TemporalType.DATE)
    private Date dateSuppression;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;

    public BudEngagementsupprimes() {
    }

    public BudEngagementsupprimes(Integer iDBUDEngagement) {
        this.iDBUDEngagement = iDBUDEngagement;
    }

    public BudEngagementsupprimes(Integer iDBUDEngagement, String numero, BigDecimal montant, String objetdepense, String observation, int iDBUDBudget, Date dateEngagement, Date dateVisaDG, Date dateSaisie, int iDSYSEntite, Date dateVisaCG, Date dateVisaSAGE, short etatValidation, String login, String lOGINSuppr, Date dateSuppression) {
        this.iDBUDEngagement = iDBUDEngagement;
        this.numero = numero;
        this.montant = montant;
        this.objetdepense = objetdepense;
        this.observation = observation;
        this.iDBUDBudget = iDBUDBudget;
        this.dateEngagement = dateEngagement;
        this.dateVisaDG = dateVisaDG;
        this.dateSaisie = dateSaisie;
        this.iDSYSEntite = iDSYSEntite;
        this.dateVisaCG = dateVisaCG;
        this.dateVisaSAGE = dateVisaSAGE;
        this.etatValidation = etatValidation;
        this.login = login;
        this.lOGINSuppr = lOGINSuppr;
        this.dateSuppression = dateSuppression;
    }

    public Integer getIDBUDEngagement() {
        return iDBUDEngagement;
    }

    public void setIDBUDEngagement(Integer iDBUDEngagement) {
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

    public int getIDBUDBudget() {
        return iDBUDBudget;
    }

    public void setIDBUDBudget(int iDBUDBudget) {
        this.iDBUDBudget = iDBUDBudget;
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

    public int getIDSYSEntite() {
        return iDSYSEntite;
    }

    public void setIDSYSEntite(int iDSYSEntite) {
        this.iDSYSEntite = iDSYSEntite;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLOGINSuppr() {
        return lOGINSuppr;
    }

    public void setLOGINSuppr(String lOGINSuppr) {
        this.lOGINSuppr = lOGINSuppr;
    }

    public Date getDateSuppression() {
        return dateSuppression;
    }

    public void setDateSuppression(Date dateSuppression) {
        this.dateSuppression = dateSuppression;
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
        hash += (iDBUDEngagement != null ? iDBUDEngagement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudEngagementsupprimes)) {
            return false;
        }
        BudEngagementsupprimes other = (BudEngagementsupprimes) object;
        if ((this.iDBUDEngagement == null && other.iDBUDEngagement != null) || (this.iDBUDEngagement != null && !this.iDBUDEngagement.equals(other.iDBUDEngagement))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.BudEngagementsupprimes[ iDBUDEngagement=" + iDBUDEngagement + " ]";
    }
    
}
