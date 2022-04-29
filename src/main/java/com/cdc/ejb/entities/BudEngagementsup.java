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
@Table(name = "bud_engagementsup")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BudEngagementsup.findAll", query = "SELECT b FROM BudEngagementsup b")
    , @NamedQuery(name = "BudEngagementsup.findByIDBUDEngagement", query = "SELECT b FROM BudEngagementsup b WHERE b.iDBUDEngagement = :iDBUDEngagement")
    , @NamedQuery(name = "BudEngagementsup.findByNumero", query = "SELECT b FROM BudEngagementsup b WHERE b.numero = :numero")
    , @NamedQuery(name = "BudEngagementsup.findByMontant", query = "SELECT b FROM BudEngagementsup b WHERE b.montant = :montant")
    , @NamedQuery(name = "BudEngagementsup.findByObjetdepense", query = "SELECT b FROM BudEngagementsup b WHERE b.objetdepense = :objetdepense")
    , @NamedQuery(name = "BudEngagementsup.findByObservation", query = "SELECT b FROM BudEngagementsup b WHERE b.observation = :observation")
    , @NamedQuery(name = "BudEngagementsup.findByIDBUDBudget", query = "SELECT b FROM BudEngagementsup b WHERE b.iDBUDBudget = :iDBUDBudget")
    , @NamedQuery(name = "BudEngagementsup.findByDateEngagement", query = "SELECT b FROM BudEngagementsup b WHERE b.dateEngagement = :dateEngagement")
    , @NamedQuery(name = "BudEngagementsup.findByDateVisaDG", query = "SELECT b FROM BudEngagementsup b WHERE b.dateVisaDG = :dateVisaDG")
    , @NamedQuery(name = "BudEngagementsup.findByDateSaisie", query = "SELECT b FROM BudEngagementsup b WHERE b.dateSaisie = :dateSaisie")
    , @NamedQuery(name = "BudEngagementsup.findByDateVisaCG", query = "SELECT b FROM BudEngagementsup b WHERE b.dateVisaCG = :dateVisaCG")
    , @NamedQuery(name = "BudEngagementsup.findByDateVisaSAGE", query = "SELECT b FROM BudEngagementsup b WHERE b.dateVisaSAGE = :dateVisaSAGE")
    , @NamedQuery(name = "BudEngagementsup.findByEtatValidation", query = "SELECT b FROM BudEngagementsup b WHERE b.etatValidation = :etatValidation")
    , @NamedQuery(name = "BudEngagementsup.findByLogin", query = "SELECT b FROM BudEngagementsup b WHERE b.login = :login")
    , @NamedQuery(name = "BudEngagementsup.findByNumTiers", query = "SELECT b FROM BudEngagementsup b WHERE b.numTiers = :numTiers")
    , @NamedQuery(name = "BudEngagementsup.findByDmri", query = "SELECT b FROM BudEngagementsup b WHERE b.dmri = :dmri")
    , @NamedQuery(name = "BudEngagementsup.findByDotationBU", query = "SELECT b FROM BudEngagementsup b WHERE b.dotationBU = :dotationBU")
    , @NamedQuery(name = "BudEngagementsup.findByReports", query = "SELECT b FROM BudEngagementsup b WHERE b.reports = :reports")
    , @NamedQuery(name = "BudEngagementsup.findByVirementsenmoins", query = "SELECT b FROM BudEngagementsup b WHERE b.virementsenmoins = :virementsenmoins")
    , @NamedQuery(name = "BudEngagementsup.findByVirementsenplus", query = "SELECT b FROM BudEngagementsup b WHERE b.virementsenplus = :virementsenplus")
    , @NamedQuery(name = "BudEngagementsup.findByEngagements", query = "SELECT b FROM BudEngagementsup b WHERE b.engagements = :engagements")
    , @NamedQuery(name = "BudEngagementsup.findByAnnulations", query = "SELECT b FROM BudEngagementsup b WHERE b.annulations = :annulations")
    , @NamedQuery(name = "BudEngagementsup.findByEtatRejet", query = "SELECT b FROM BudEngagementsup b WHERE b.etatRejet = :etatRejet")
    , @NamedQuery(name = "BudEngagementsup.findByNiveau", query = "SELECT b FROM BudEngagementsup b WHERE b.niveau = :niveau")
    , @NamedQuery(name = "BudEngagementsup.findByNiveauPrecedent", query = "SELECT b FROM BudEngagementsup b WHERE b.niveauPrecedent = :niveauPrecedent")
    , @NamedQuery(name = "BudEngagementsup.findByCumulMandat", query = "SELECT b FROM BudEngagementsup b WHERE b.cumulMandat = :cumulMandat")
    , @NamedQuery(name = "BudEngagementsup.findByIdservices", query = "SELECT b FROM BudEngagementsup b WHERE b.idservices = :idservices")
    , @NamedQuery(name = "BudEngagementsup.findByCaisseDavance", query = "SELECT b FROM BudEngagementsup b WHERE b.caisseDavance = :caisseDavance")
    , @NamedQuery(name = "BudEngagementsup.findByMotif", query = "SELECT b FROM BudEngagementsup b WHERE b.motif = :motif")
    , @NamedQuery(name = "BudEngagementsup.findByDateSup", query = "SELECT b FROM BudEngagementsup b WHERE b.dateSup = :dateSup")
    , @NamedQuery(name = "BudEngagementsup.findByNtiersup", query = "SELECT b FROM BudEngagementsup b WHERE b.ntiersup = :ntiersup")
    , @NamedQuery(name = "BudEngagementsup.findByGestion", query = "SELECT b FROM BudEngagementsup b WHERE b.gestion = :gestion")})
public class BudEngagementsup implements Serializable {

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
    @Column(name = "NumTiers")
    private long numTiers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DMRI")
    private short dmri;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DotationBU")
    private BigDecimal dotationBU;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Reports")
    private BigDecimal reports;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Virements_en_moins")
    private BigDecimal virementsenmoins;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Virements_en_plus")
    private BigDecimal virementsenplus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Engagements")
    private BigDecimal engagements;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Annulations")
    private BigDecimal annulations;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Etat_Rejet")
    private short etatRejet;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Niveau")
    private short niveau;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NiveauPrecedent")
    private int niveauPrecedent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CumulMandat")
    private BigDecimal cumulMandat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSERVICES")
    private int idservices;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CaisseDavance")
    private short caisseDavance;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Motif")
    private String motif;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateSup")
    @Temporal(TemporalType.DATE)
    private Date dateSup;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ntiersup")
    private long ntiersup;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;

    public BudEngagementsup() {
    }

    public BudEngagementsup(Integer iDBUDEngagement) {
        this.iDBUDEngagement = iDBUDEngagement;
    }

    public BudEngagementsup(Integer iDBUDEngagement, String numero, BigDecimal montant, String objetdepense, String observation, int iDBUDBudget, Date dateEngagement, Date dateVisaDG, Date dateSaisie, Date dateVisaCG, Date dateVisaSAGE, short etatValidation, String login, long numTiers, short dmri, BigDecimal dotationBU, BigDecimal reports, BigDecimal virementsenmoins, BigDecimal virementsenplus, BigDecimal engagements, BigDecimal annulations, short etatRejet, short niveau, int niveauPrecedent, BigDecimal cumulMandat, int idservices, short caisseDavance, String motif, Date dateSup, long ntiersup) {
        this.iDBUDEngagement = iDBUDEngagement;
        this.numero = numero;
        this.montant = montant;
        this.objetdepense = objetdepense;
        this.observation = observation;
        this.iDBUDBudget = iDBUDBudget;
        this.dateEngagement = dateEngagement;
        this.dateVisaDG = dateVisaDG;
        this.dateSaisie = dateSaisie;
        this.dateVisaCG = dateVisaCG;
        this.dateVisaSAGE = dateVisaSAGE;
        this.etatValidation = etatValidation;
        this.login = login;
        this.numTiers = numTiers;
        this.dmri = dmri;
        this.dotationBU = dotationBU;
        this.reports = reports;
        this.virementsenmoins = virementsenmoins;
        this.virementsenplus = virementsenplus;
        this.engagements = engagements;
        this.annulations = annulations;
        this.etatRejet = etatRejet;
        this.niveau = niveau;
        this.niveauPrecedent = niveauPrecedent;
        this.cumulMandat = cumulMandat;
        this.idservices = idservices;
        this.caisseDavance = caisseDavance;
        this.motif = motif;
        this.dateSup = dateSup;
        this.ntiersup = ntiersup;
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

    public long getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(long numTiers) {
        this.numTiers = numTiers;
    }

    public short getDmri() {
        return dmri;
    }

    public void setDmri(short dmri) {
        this.dmri = dmri;
    }

    public BigDecimal getDotationBU() {
        return dotationBU;
    }

    public void setDotationBU(BigDecimal dotationBU) {
        this.dotationBU = dotationBU;
    }

    public BigDecimal getReports() {
        return reports;
    }

    public void setReports(BigDecimal reports) {
        this.reports = reports;
    }

    public BigDecimal getVirementsenmoins() {
        return virementsenmoins;
    }

    public void setVirementsenmoins(BigDecimal virementsenmoins) {
        this.virementsenmoins = virementsenmoins;
    }

    public BigDecimal getVirementsenplus() {
        return virementsenplus;
    }

    public void setVirementsenplus(BigDecimal virementsenplus) {
        this.virementsenplus = virementsenplus;
    }

    public BigDecimal getEngagements() {
        return engagements;
    }

    public void setEngagements(BigDecimal engagements) {
        this.engagements = engagements;
    }

    public BigDecimal getAnnulations() {
        return annulations;
    }

    public void setAnnulations(BigDecimal annulations) {
        this.annulations = annulations;
    }

    public short getEtatRejet() {
        return etatRejet;
    }

    public void setEtatRejet(short etatRejet) {
        this.etatRejet = etatRejet;
    }

    public short getNiveau() {
        return niveau;
    }

    public void setNiveau(short niveau) {
        this.niveau = niveau;
    }

    public int getNiveauPrecedent() {
        return niveauPrecedent;
    }

    public void setNiveauPrecedent(int niveauPrecedent) {
        this.niveauPrecedent = niveauPrecedent;
    }

    public BigDecimal getCumulMandat() {
        return cumulMandat;
    }

    public void setCumulMandat(BigDecimal cumulMandat) {
        this.cumulMandat = cumulMandat;
    }

    public int getIdservices() {
        return idservices;
    }

    public void setIdservices(int idservices) {
        this.idservices = idservices;
    }

    public short getCaisseDavance() {
        return caisseDavance;
    }

    public void setCaisseDavance(short caisseDavance) {
        this.caisseDavance = caisseDavance;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public Date getDateSup() {
        return dateSup;
    }

    public void setDateSup(Date dateSup) {
        this.dateSup = dateSup;
    }

    public long getNtiersup() {
        return ntiersup;
    }

    public void setNtiersup(long ntiersup) {
        this.ntiersup = ntiersup;
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
        if (!(object instanceof BudEngagementsup)) {
            return false;
        }
        BudEngagementsup other = (BudEngagementsup) object;
        if ((this.iDBUDEngagement == null && other.iDBUDEngagement != null) || (this.iDBUDEngagement != null && !this.iDBUDEngagement.equals(other.iDBUDEngagement))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.BudEngagementsup[ iDBUDEngagement=" + iDBUDEngagement + " ]";
    }
    
}
