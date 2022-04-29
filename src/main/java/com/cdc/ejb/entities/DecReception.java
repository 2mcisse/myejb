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
@Table(name = "dec_reception")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DecReception.findAll", query = "SELECT d FROM DecReception d")
    , @NamedQuery(name = "DecReception.findByIDDECReception", query = "SELECT d FROM DecReception d WHERE d.iDDECReception = :iDDECReception")
    , @NamedQuery(name = "DecReception.findByDateDepot", query = "SELECT d FROM DecReception d WHERE d.dateDepot = :dateDepot")
    , @NamedQuery(name = "DecReception.findByNotes", query = "SELECT d FROM DecReception d WHERE d.notes = :notes")
    , @NamedQuery(name = "DecReception.findByVisaChefDivisionGuichets", query = "SELECT d FROM DecReception d WHERE d.visaChefDivisionGuichets = :visaChefDivisionGuichets")
    , @NamedQuery(name = "DecReception.findBySaisieDate", query = "SELECT d FROM DecReception d WHERE d.saisieDate = :saisieDate")
    , @NamedQuery(name = "DecReception.findBySaisiePar", query = "SELECT d FROM DecReception d WHERE d.saisiePar = :saisiePar")
    , @NamedQuery(name = "DecReception.findByJourneeDeTraitement", query = "SELECT d FROM DecReception d WHERE d.journeeDeTraitement = :journeeDeTraitement")
    , @NamedQuery(name = "DecReception.findByMontant", query = "SELECT d FROM DecReception d WHERE d.montant = :montant")
    , @NamedQuery(name = "DecReception.findByDateVisaDO", query = "SELECT d FROM DecReception d WHERE d.dateVisaDO = :dateVisaDO")
    , @NamedQuery(name = "DecReception.findByDateVisaCG", query = "SELECT d FROM DecReception d WHERE d.dateVisaCG = :dateVisaCG")
    , @NamedQuery(name = "DecReception.findByDateVisaDG", query = "SELECT d FROM DecReception d WHERE d.dateVisaDG = :dateVisaDG")
    , @NamedQuery(name = "DecReception.findByDATEVirementCAubligatoire", query = "SELECT d FROM DecReception d WHERE d.dATEVirementCAubligatoire = :dATEVirementCAubligatoire")
    , @NamedQuery(name = "DecReception.findByIDSYSMode", query = "SELECT d FROM DecReception d WHERE d.iDSYSMode = :iDSYSMode")
    , @NamedQuery(name = "DecReception.findByNumQuit", query = "SELECT d FROM DecReception d WHERE d.numQuit = :numQuit")
    , @NamedQuery(name = "DecReception.findByDateValeur", query = "SELECT d FROM DecReception d WHERE d.dateValeur = :dateValeur")
    , @NamedQuery(name = "DecReception.findByDeposant", query = "SELECT d FROM DecReception d WHERE d.deposant = :deposant")
    , @NamedQuery(name = "DecReception.findByBeneficiaire", query = "SELECT d FROM DecReception d WHERE d.beneficiaire = :beneficiaire")
    , @NamedQuery(name = "DecReception.findByCodeEnc", query = "SELECT d FROM DecReception d WHERE d.codeEnc = :codeEnc")
    , @NamedQuery(name = "DecReception.findByCptObligatoire", query = "SELECT d FROM DecReception d WHERE d.cptObligatoire = :cptObligatoire")
    , @NamedQuery(name = "DecReception.findByObjetOP", query = "SELECT d FROM DecReception d WHERE d.objetOP = :objetOP")
    , @NamedQuery(name = "DecReception.findBySupprimer", query = "SELECT d FROM DecReception d WHERE d.supprimer = :supprimer")
    , @NamedQuery(name = "DecReception.findByLogSup", query = "SELECT d FROM DecReception d WHERE d.logSup = :logSup")
    , @NamedQuery(name = "DecReception.findByDateSup", query = "SELECT d FROM DecReception d WHERE d.dateSup = :dateSup")
    , @NamedQuery(name = "DecReception.findByTaux", query = "SELECT d FROM DecReception d WHERE d.taux = :taux")
    , @NamedQuery(name = "DecReception.findByValider", query = "SELECT d FROM DecReception d WHERE d.valider = :valider")
    , @NamedQuery(name = "DecReception.findByAnnul", query = "SELECT d FROM DecReception d WHERE d.annul = :annul")
    , @NamedQuery(name = "DecReception.findByIdannilationTp", query = "SELECT d FROM DecReception d WHERE d.idannilationTp = :idannilationTp")
    , @NamedQuery(name = "DecReception.findByGestion", query = "SELECT d FROM DecReception d WHERE d.gestion = :gestion")})
public class DecReception implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDEC_Reception")
    private Integer iDDECReception;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateDepot")
    @Temporal(TemporalType.DATE)
    private Date dateDepot;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Notes")
    private String notes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VisaChefDivisionGuichets")
    @Temporal(TemporalType.DATE)
    private Date visaChefDivisionGuichets;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SaisieDate")
    @Temporal(TemporalType.DATE)
    private Date saisieDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "SaisiePar")
    private String saisiePar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "JourneeDeTraitement")
    @Temporal(TemporalType.DATE)
    private Date journeeDeTraitement;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "Montant")
    private BigDecimal montant;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateVisaDO")
    @Temporal(TemporalType.DATE)
    private Date dateVisaDO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateVisaCG")
    @Temporal(TemporalType.DATE)
    private Date dateVisaCG;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateVisaDG")
    @Temporal(TemporalType.DATE)
    private Date dateVisaDG;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_Virement_C_Aubligatoire")
    @Temporal(TemporalType.DATE)
    private Date dATEVirementCAubligatoire;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSYS_Mode")
    private int iDSYSMode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumQuit")
    private String numQuit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateValeur")
    @Temporal(TemporalType.DATE)
    private Date dateValeur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Deposant")
    private String deposant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Beneficiaire")
    private String beneficiaire;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_ENC")
    private long codeEnc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CptObligatoire")
    private short cptObligatoire;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "ObjetOP")
    private String objetOP;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Supprimer")
    private short supprimer;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "LogSup")
    private String logSup;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateSup")
    @Temporal(TemporalType.DATE)
    private Date dateSup;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Taux")
    private double taux;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Valider")
    private short valider;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Annul")
    private short annul;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDANNILATION_TP")
    private long idannilationTp;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDDECReception")
    private List<Encaissements> encaissementsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDDECReception")
    private List<Pieces> piecesList;
    @JoinColumn(name = "IDTRE_Quittance", referencedColumnName = "IDTRE_Quittance")
    @ManyToOne(optional = false)
    private TreQuittance iDTREQuittance;
    @JoinColumn(name = "NumTiers", referencedColumnName = "NumTiers")
    @ManyToOne(optional = false)
    private Tiers numTiers;
    @JoinColumn(name = "IDNATUREOPERATION", referencedColumnName = "IDNATUREOPERATION")
    @ManyToOne(optional = false)
    private DecNatureoperation idnatureoperation;
    @JoinColumn(name = "IDAFFAIRES", referencedColumnName = "IDAFFAIRES")
    @ManyToOne(optional = false)
    private DecAffaires idaffaires;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDDECReception")
    private List<DecTitredeperception> decTitredeperceptionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDDECReception")
    private List<Decaissements> decaissementsList;

    public DecReception() {
    }

    public DecReception(Integer iDDECReception) {
        this.iDDECReception = iDDECReception;
    }

    public DecReception(Integer iDDECReception, Date dateDepot, String notes, Date visaChefDivisionGuichets, Date saisieDate, String saisiePar, Date journeeDeTraitement, BigDecimal montant, Date dateVisaDO, Date dateVisaCG, Date dateVisaDG, Date dATEVirementCAubligatoire, int iDSYSMode, String numQuit, Date dateValeur, String deposant, String beneficiaire, long codeEnc, short cptObligatoire, String objetOP, short supprimer, String logSup, Date dateSup, double taux, short valider, short annul, long idannilationTp) {
        this.iDDECReception = iDDECReception;
        this.dateDepot = dateDepot;
        this.notes = notes;
        this.visaChefDivisionGuichets = visaChefDivisionGuichets;
        this.saisieDate = saisieDate;
        this.saisiePar = saisiePar;
        this.journeeDeTraitement = journeeDeTraitement;
        this.montant = montant;
        this.dateVisaDO = dateVisaDO;
        this.dateVisaCG = dateVisaCG;
        this.dateVisaDG = dateVisaDG;
        this.dATEVirementCAubligatoire = dATEVirementCAubligatoire;
        this.iDSYSMode = iDSYSMode;
        this.numQuit = numQuit;
        this.dateValeur = dateValeur;
        this.deposant = deposant;
        this.beneficiaire = beneficiaire;
        this.codeEnc = codeEnc;
        this.cptObligatoire = cptObligatoire;
        this.objetOP = objetOP;
        this.supprimer = supprimer;
        this.logSup = logSup;
        this.dateSup = dateSup;
        this.taux = taux;
        this.valider = valider;
        this.annul = annul;
        this.idannilationTp = idannilationTp;
    }

    public Integer getIDDECReception() {
        return iDDECReception;
    }

    public void setIDDECReception(Integer iDDECReception) {
        this.iDDECReception = iDDECReception;
    }

    public Date getDateDepot() {
        return dateDepot;
    }

    public void setDateDepot(Date dateDepot) {
        this.dateDepot = dateDepot;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getVisaChefDivisionGuichets() {
        return visaChefDivisionGuichets;
    }

    public void setVisaChefDivisionGuichets(Date visaChefDivisionGuichets) {
        this.visaChefDivisionGuichets = visaChefDivisionGuichets;
    }

    public Date getSaisieDate() {
        return saisieDate;
    }

    public void setSaisieDate(Date saisieDate) {
        this.saisieDate = saisieDate;
    }

    public String getSaisiePar() {
        return saisiePar;
    }

    public void setSaisiePar(String saisiePar) {
        this.saisiePar = saisiePar;
    }

    public Date getJourneeDeTraitement() {
        return journeeDeTraitement;
    }

    public void setJourneeDeTraitement(Date journeeDeTraitement) {
        this.journeeDeTraitement = journeeDeTraitement;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public Date getDateVisaDO() {
        return dateVisaDO;
    }

    public void setDateVisaDO(Date dateVisaDO) {
        this.dateVisaDO = dateVisaDO;
    }

    public Date getDateVisaCG() {
        return dateVisaCG;
    }

    public void setDateVisaCG(Date dateVisaCG) {
        this.dateVisaCG = dateVisaCG;
    }

    public Date getDateVisaDG() {
        return dateVisaDG;
    }

    public void setDateVisaDG(Date dateVisaDG) {
        this.dateVisaDG = dateVisaDG;
    }

    public Date getDATEVirementCAubligatoire() {
        return dATEVirementCAubligatoire;
    }

    public void setDATEVirementCAubligatoire(Date dATEVirementCAubligatoire) {
        this.dATEVirementCAubligatoire = dATEVirementCAubligatoire;
    }

    public int getIDSYSMode() {
        return iDSYSMode;
    }

    public void setIDSYSMode(int iDSYSMode) {
        this.iDSYSMode = iDSYSMode;
    }

    public String getNumQuit() {
        return numQuit;
    }

    public void setNumQuit(String numQuit) {
        this.numQuit = numQuit;
    }

    public Date getDateValeur() {
        return dateValeur;
    }

    public void setDateValeur(Date dateValeur) {
        this.dateValeur = dateValeur;
    }

    public String getDeposant() {
        return deposant;
    }

    public void setDeposant(String deposant) {
        this.deposant = deposant;
    }

    public String getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }

    public long getCodeEnc() {
        return codeEnc;
    }

    public void setCodeEnc(long codeEnc) {
        this.codeEnc = codeEnc;
    }

    public short getCptObligatoire() {
        return cptObligatoire;
    }

    public void setCptObligatoire(short cptObligatoire) {
        this.cptObligatoire = cptObligatoire;
    }

    public String getObjetOP() {
        return objetOP;
    }

    public void setObjetOP(String objetOP) {
        this.objetOP = objetOP;
    }

    public short getSupprimer() {
        return supprimer;
    }

    public void setSupprimer(short supprimer) {
        this.supprimer = supprimer;
    }

    public String getLogSup() {
        return logSup;
    }

    public void setLogSup(String logSup) {
        this.logSup = logSup;
    }

    public Date getDateSup() {
        return dateSup;
    }

    public void setDateSup(Date dateSup) {
        this.dateSup = dateSup;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public short getValider() {
        return valider;
    }

    public void setValider(short valider) {
        this.valider = valider;
    }

    public short getAnnul() {
        return annul;
    }

    public void setAnnul(short annul) {
        this.annul = annul;
    }

    public long getIdannilationTp() {
        return idannilationTp;
    }

    public void setIdannilationTp(long idannilationTp) {
        this.idannilationTp = idannilationTp;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<Encaissements> getEncaissementsList() {
        return encaissementsList;
    }

    public void setEncaissementsList(List<Encaissements> encaissementsList) {
        this.encaissementsList = encaissementsList;
    }

    @XmlTransient
    public List<Pieces> getPiecesList() {
        return piecesList;
    }

    public void setPiecesList(List<Pieces> piecesList) {
        this.piecesList = piecesList;
    }

    public TreQuittance getIDTREQuittance() {
        return iDTREQuittance;
    }

    public void setIDTREQuittance(TreQuittance iDTREQuittance) {
        this.iDTREQuittance = iDTREQuittance;
    }

    public Tiers getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(Tiers numTiers) {
        this.numTiers = numTiers;
    }

    public DecNatureoperation getIdnatureoperation() {
        return idnatureoperation;
    }

    public void setIdnatureoperation(DecNatureoperation idnatureoperation) {
        this.idnatureoperation = idnatureoperation;
    }

    public DecAffaires getIdaffaires() {
        return idaffaires;
    }

    public void setIdaffaires(DecAffaires idaffaires) {
        this.idaffaires = idaffaires;
    }

    @XmlTransient
    public List<DecTitredeperception> getDecTitredeperceptionList() {
        return decTitredeperceptionList;
    }

    public void setDecTitredeperceptionList(List<DecTitredeperception> decTitredeperceptionList) {
        this.decTitredeperceptionList = decTitredeperceptionList;
    }

    @XmlTransient
    public List<Decaissements> getDecaissementsList() {
        return decaissementsList;
    }

    public void setDecaissementsList(List<Decaissements> decaissementsList) {
        this.decaissementsList = decaissementsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDDECReception != null ? iDDECReception.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DecReception)) {
            return false;
        }
        DecReception other = (DecReception) object;
        if ((this.iDDECReception == null && other.iDDECReception != null) || (this.iDDECReception != null && !this.iDDECReception.equals(other.iDDECReception))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.DecReception[ iDDECReception=" + iDDECReception + " ]";
    }
    
}
