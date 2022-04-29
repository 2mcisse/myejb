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
@Table(name = "dec_autorisationderestitution")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DecAutorisationderestitution.findAll", query = "SELECT d FROM DecAutorisationderestitution d")
    , @NamedQuery(name = "DecAutorisationderestitution.findByIDDECAutorisationDeRestitution", query = "SELECT d FROM DecAutorisationderestitution d WHERE d.iDDECAutorisationDeRestitution = :iDDECAutorisationDeRestitution")
    , @NamedQuery(name = "DecAutorisationderestitution.findBySaisieDate", query = "SELECT d FROM DecAutorisationderestitution d WHERE d.saisieDate = :saisieDate")
    , @NamedQuery(name = "DecAutorisationderestitution.findBySaisiePar", query = "SELECT d FROM DecAutorisationderestitution d WHERE d.saisiePar = :saisiePar")
    , @NamedQuery(name = "DecAutorisationderestitution.findByMontant", query = "SELECT d FROM DecAutorisationderestitution d WHERE d.montant = :montant")
    , @NamedQuery(name = "DecAutorisationderestitution.findByDateVisaDO", query = "SELECT d FROM DecAutorisationderestitution d WHERE d.dateVisaDO = :dateVisaDO")
    , @NamedQuery(name = "DecAutorisationderestitution.findByDateVisaDG", query = "SELECT d FROM DecAutorisationderestitution d WHERE d.dateVisaDG = :dateVisaDG")
    , @NamedQuery(name = "DecAutorisationderestitution.findByDateVisaCG", query = "SELECT d FROM DecAutorisationderestitution d WHERE d.dateVisaCG = :dateVisaCG")
    , @NamedQuery(name = "DecAutorisationderestitution.findByCumulRestitutions", query = "SELECT d FROM DecAutorisationderestitution d WHERE d.cumulRestitutions = :cumulRestitutions")
    , @NamedQuery(name = "DecAutorisationderestitution.findByNumAutorisation", query = "SELECT d FROM DecAutorisationderestitution d WHERE d.numAutorisation = :numAutorisation")
    , @NamedQuery(name = "DecAutorisationderestitution.findByDateAutorisation", query = "SELECT d FROM DecAutorisationderestitution d WHERE d.dateAutorisation = :dateAutorisation")
    , @NamedQuery(name = "DecAutorisationderestitution.findByObservation", query = "SELECT d FROM DecAutorisationderestitution d WHERE d.observation = :observation")
    , @NamedQuery(name = "DecAutorisationderestitution.findByNiveau", query = "SELECT d FROM DecAutorisationderestitution d WHERE d.niveau = :niveau")
    , @NamedQuery(name = "DecAutorisationderestitution.findByNiveauPrecedent", query = "SELECT d FROM DecAutorisationderestitution d WHERE d.niveauPrecedent = :niveauPrecedent")
    , @NamedQuery(name = "DecAutorisationderestitution.findByCodejnl", query = "SELECT d FROM DecAutorisationderestitution d WHERE d.codejnl = :codejnl")
    , @NamedQuery(name = "DecAutorisationderestitution.findByIDDECRestitution", query = "SELECT d FROM DecAutorisationderestitution d WHERE d.iDDECRestitution = :iDDECRestitution")
    , @NamedQuery(name = "DecAutorisationderestitution.findByCptdebit", query = "SELECT d FROM DecAutorisationderestitution d WHERE d.cptdebit = :cptdebit")
    , @NamedQuery(name = "DecAutorisationderestitution.findByCPtCREDIT", query = "SELECT d FROM DecAutorisationderestitution d WHERE d.cPtCREDIT = :cPtCREDIT")
    , @NamedQuery(name = "DecAutorisationderestitution.findByTraiter", query = "SELECT d FROM DecAutorisationderestitution d WHERE d.traiter = :traiter")
    , @NamedQuery(name = "DecAutorisationderestitution.findByLibop", query = "SELECT d FROM DecAutorisationderestitution d WHERE d.libop = :libop")
    , @NamedQuery(name = "DecAutorisationderestitution.findByBeneF", query = "SELECT d FROM DecAutorisationderestitution d WHERE d.beneF = :beneF")
    , @NamedQuery(name = "DecAutorisationderestitution.findByNumTiersBenef", query = "SELECT d FROM DecAutorisationderestitution d WHERE d.numTiersBenef = :numTiersBenef")
    , @NamedQuery(name = "DecAutorisationderestitution.findByQuittance", query = "SELECT d FROM DecAutorisationderestitution d WHERE d.quittance = :quittance")
    , @NamedQuery(name = "DecAutorisationderestitution.findByAnnul", query = "SELECT d FROM DecAutorisationderestitution d WHERE d.annul = :annul")
    , @NamedQuery(name = "DecAutorisationderestitution.findByGestion", query = "SELECT d FROM DecAutorisationderestitution d WHERE d.gestion = :gestion")})
public class DecAutorisationderestitution implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDEC_AutorisationDeRestitution")
    private Integer iDDECAutorisationDeRestitution;
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
    @Column(name = "DateVisaDG")
    @Temporal(TemporalType.DATE)
    private Date dateVisaDG;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateVisaCG")
    @Temporal(TemporalType.DATE)
    private Date dateVisaCG;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CumulRestitutions")
    private BigDecimal cumulRestitutions;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumAutorisation")
    private String numAutorisation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateAutorisation")
    @Temporal(TemporalType.DATE)
    private Date dateAutorisation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "OBSERVATION")
    private String observation;
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
    @Size(min = 1, max = 50)
    @Column(name = "CODEJNL")
    private String codejnl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDEC_Restitution")
    private int iDDECRestitution;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPTDEBIT")
    private String cptdebit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPtCREDIT")
    private String cPtCREDIT;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Traiter")
    private short traiter;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "LIBOP")
    private String libop;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "BeneF")
    private String beneF;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NumTiersBenef")
    private int numTiersBenef;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Quittance")
    private String quittance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Annul")
    private short annul;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDDECAutorisationDeRestitution")
    private List<RestitutionSurAffaireAr> restitutionSurAffaireArList;
    @JoinColumn(name = "IDDEC_Reception", referencedColumnName = "IDDEC_Restitution")
    @ManyToOne(optional = false)
    private DecRestitution iDDECReception;
    @JoinColumn(name = "IDNATUREOPERATION", referencedColumnName = "IDNATUREOPERATION")
    @ManyToOne(optional = false)
    private DecNatureoperation idnatureoperation;
    @JoinColumn(name = "NumTiers", referencedColumnName = "NumTiers")
    @ManyToOne(optional = false)
    private Tiers numTiers;
    @JoinColumn(name = "CODE_DEM_REST", referencedColumnName = "CODE_DEM_REST")
    @ManyToOne(optional = false)
    private DemandesRestitution codeDemRest;

    public DecAutorisationderestitution() {
    }

    public DecAutorisationderestitution(Integer iDDECAutorisationDeRestitution) {
        this.iDDECAutorisationDeRestitution = iDDECAutorisationDeRestitution;
    }

    public DecAutorisationderestitution(Integer iDDECAutorisationDeRestitution, Date saisieDate, String saisiePar, BigDecimal montant, Date dateVisaDO, Date dateVisaDG, Date dateVisaCG, BigDecimal cumulRestitutions, String numAutorisation, Date dateAutorisation, String observation, short niveau, int niveauPrecedent, String codejnl, int iDDECRestitution, String cptdebit, String cPtCREDIT, short traiter, String libop, String beneF, int numTiersBenef, String quittance, short annul) {
        this.iDDECAutorisationDeRestitution = iDDECAutorisationDeRestitution;
        this.saisieDate = saisieDate;
        this.saisiePar = saisiePar;
        this.montant = montant;
        this.dateVisaDO = dateVisaDO;
        this.dateVisaDG = dateVisaDG;
        this.dateVisaCG = dateVisaCG;
        this.cumulRestitutions = cumulRestitutions;
        this.numAutorisation = numAutorisation;
        this.dateAutorisation = dateAutorisation;
        this.observation = observation;
        this.niveau = niveau;
        this.niveauPrecedent = niveauPrecedent;
        this.codejnl = codejnl;
        this.iDDECRestitution = iDDECRestitution;
        this.cptdebit = cptdebit;
        this.cPtCREDIT = cPtCREDIT;
        this.traiter = traiter;
        this.libop = libop;
        this.beneF = beneF;
        this.numTiersBenef = numTiersBenef;
        this.quittance = quittance;
        this.annul = annul;
    }

    public Integer getIDDECAutorisationDeRestitution() {
        return iDDECAutorisationDeRestitution;
    }

    public void setIDDECAutorisationDeRestitution(Integer iDDECAutorisationDeRestitution) {
        this.iDDECAutorisationDeRestitution = iDDECAutorisationDeRestitution;
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

    public Date getDateVisaDG() {
        return dateVisaDG;
    }

    public void setDateVisaDG(Date dateVisaDG) {
        this.dateVisaDG = dateVisaDG;
    }

    public Date getDateVisaCG() {
        return dateVisaCG;
    }

    public void setDateVisaCG(Date dateVisaCG) {
        this.dateVisaCG = dateVisaCG;
    }

    public BigDecimal getCumulRestitutions() {
        return cumulRestitutions;
    }

    public void setCumulRestitutions(BigDecimal cumulRestitutions) {
        this.cumulRestitutions = cumulRestitutions;
    }

    public String getNumAutorisation() {
        return numAutorisation;
    }

    public void setNumAutorisation(String numAutorisation) {
        this.numAutorisation = numAutorisation;
    }

    public Date getDateAutorisation() {
        return dateAutorisation;
    }

    public void setDateAutorisation(Date dateAutorisation) {
        this.dateAutorisation = dateAutorisation;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
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

    public String getCodejnl() {
        return codejnl;
    }

    public void setCodejnl(String codejnl) {
        this.codejnl = codejnl;
    }

    public int getIDDECRestitution() {
        return iDDECRestitution;
    }

    public void setIDDECRestitution(int iDDECRestitution) {
        this.iDDECRestitution = iDDECRestitution;
    }

    public String getCptdebit() {
        return cptdebit;
    }

    public void setCptdebit(String cptdebit) {
        this.cptdebit = cptdebit;
    }

    public String getCPtCREDIT() {
        return cPtCREDIT;
    }

    public void setCPtCREDIT(String cPtCREDIT) {
        this.cPtCREDIT = cPtCREDIT;
    }

    public short getTraiter() {
        return traiter;
    }

    public void setTraiter(short traiter) {
        this.traiter = traiter;
    }

    public String getLibop() {
        return libop;
    }

    public void setLibop(String libop) {
        this.libop = libop;
    }

    public String getBeneF() {
        return beneF;
    }

    public void setBeneF(String beneF) {
        this.beneF = beneF;
    }

    public int getNumTiersBenef() {
        return numTiersBenef;
    }

    public void setNumTiersBenef(int numTiersBenef) {
        this.numTiersBenef = numTiersBenef;
    }

    public String getQuittance() {
        return quittance;
    }

    public void setQuittance(String quittance) {
        this.quittance = quittance;
    }

    public short getAnnul() {
        return annul;
    }

    public void setAnnul(short annul) {
        this.annul = annul;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<RestitutionSurAffaireAr> getRestitutionSurAffaireArList() {
        return restitutionSurAffaireArList;
    }

    public void setRestitutionSurAffaireArList(List<RestitutionSurAffaireAr> restitutionSurAffaireArList) {
        this.restitutionSurAffaireArList = restitutionSurAffaireArList;
    }

    public DecRestitution getIDDECReception() {
        return iDDECReception;
    }

    public void setIDDECReception(DecRestitution iDDECReception) {
        this.iDDECReception = iDDECReception;
    }

    public DecNatureoperation getIdnatureoperation() {
        return idnatureoperation;
    }

    public void setIdnatureoperation(DecNatureoperation idnatureoperation) {
        this.idnatureoperation = idnatureoperation;
    }

    public Tiers getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(Tiers numTiers) {
        this.numTiers = numTiers;
    }

    public DemandesRestitution getCodeDemRest() {
        return codeDemRest;
    }

    public void setCodeDemRest(DemandesRestitution codeDemRest) {
        this.codeDemRest = codeDemRest;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDDECAutorisationDeRestitution != null ? iDDECAutorisationDeRestitution.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DecAutorisationderestitution)) {
            return false;
        }
        DecAutorisationderestitution other = (DecAutorisationderestitution) object;
        if ((this.iDDECAutorisationDeRestitution == null && other.iDDECAutorisationDeRestitution != null) || (this.iDDECAutorisationDeRestitution != null && !this.iDDECAutorisationDeRestitution.equals(other.iDDECAutorisationDeRestitution))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.DecAutorisationderestitution[ iDDECAutorisationDeRestitution=" + iDDECAutorisationDeRestitution + " ]";
    }
    
}
