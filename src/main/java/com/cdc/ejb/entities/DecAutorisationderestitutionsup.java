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
@Table(name = "dec_autorisationderestitutionsup")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DecAutorisationderestitutionsup.findAll", query = "SELECT d FROM DecAutorisationderestitutionsup d")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findBySaisieDate", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.saisieDate = :saisieDate")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findBySaisiePar", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.saisiePar = :saisiePar")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByIDDECReception", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.iDDECReception = :iDDECReception")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByMontant", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.montant = :montant")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByDateVisaDO", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.dateVisaDO = :dateVisaDO")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByDateVisaDG", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.dateVisaDG = :dateVisaDG")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByDateVisaCG", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.dateVisaCG = :dateVisaCG")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByCumulRestitutions", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.cumulRestitutions = :cumulRestitutions")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByNumAutorisation", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.numAutorisation = :numAutorisation")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByIdnatureoperation", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.idnatureoperation = :idnatureoperation")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByDateAutorisation", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.dateAutorisation = :dateAutorisation")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByObservation", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.observation = :observation")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByNumTiers", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.numTiers = :numTiers")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByCodeDemRest", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.codeDemRest = :codeDemRest")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByNiveau", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.niveau = :niveau")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByNiveauPrecedent", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.niveauPrecedent = :niveauPrecedent")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByCodejnl", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.codejnl = :codejnl")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByIDDECRestitution", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.iDDECRestitution = :iDDECRestitution")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByCptdebit", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.cptdebit = :cptdebit")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByCPtCREDIT", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.cPtCREDIT = :cPtCREDIT")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByTraiter", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.traiter = :traiter")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByLibop", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.libop = :libop")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByBeneF", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.beneF = :beneF")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByNumTiersBenef", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.numTiersBenef = :numTiersBenef")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByQuittance", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.quittance = :quittance")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByMotif", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.motif = :motif")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByDateSup", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.dateSup = :dateSup")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByTiersSupp", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.tiersSupp = :tiersSupp")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByIDDECAutorisationDeRestitution", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.iDDECAutorisationDeRestitution = :iDDECAutorisationDeRestitution")
    , @NamedQuery(name = "DecAutorisationderestitutionsup.findByGestion", query = "SELECT d FROM DecAutorisationderestitutionsup d WHERE d.gestion = :gestion")})
public class DecAutorisationderestitutionsup implements Serializable {

    private static final long serialVersionUID = 1L;
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
    @Column(name = "IDDEC_Reception")
    private int iDDECReception;
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
    @Column(name = "IDNATUREOPERATION")
    private int idnatureoperation;
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
    @Column(name = "NumTiers")
    private long numTiers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_DEM_REST")
    private long codeDemRest;
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
    @Column(name = "TiersSupp")
    private long tiersSupp;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDEC_AutorisationDeRestitution")
    private Integer iDDECAutorisationDeRestitution;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;

    public DecAutorisationderestitutionsup() {
    }

    public DecAutorisationderestitutionsup(Integer iDDECAutorisationDeRestitution) {
        this.iDDECAutorisationDeRestitution = iDDECAutorisationDeRestitution;
    }

    public DecAutorisationderestitutionsup(Integer iDDECAutorisationDeRestitution, Date saisieDate, String saisiePar, int iDDECReception, BigDecimal montant, Date dateVisaDO, Date dateVisaDG, Date dateVisaCG, BigDecimal cumulRestitutions, String numAutorisation, int idnatureoperation, Date dateAutorisation, String observation, long numTiers, long codeDemRest, short niveau, int niveauPrecedent, String codejnl, int iDDECRestitution, String cptdebit, String cPtCREDIT, short traiter, String libop, String beneF, int numTiersBenef, String quittance, String motif, Date dateSup, long tiersSupp) {
        this.iDDECAutorisationDeRestitution = iDDECAutorisationDeRestitution;
        this.saisieDate = saisieDate;
        this.saisiePar = saisiePar;
        this.iDDECReception = iDDECReception;
        this.montant = montant;
        this.dateVisaDO = dateVisaDO;
        this.dateVisaDG = dateVisaDG;
        this.dateVisaCG = dateVisaCG;
        this.cumulRestitutions = cumulRestitutions;
        this.numAutorisation = numAutorisation;
        this.idnatureoperation = idnatureoperation;
        this.dateAutorisation = dateAutorisation;
        this.observation = observation;
        this.numTiers = numTiers;
        this.codeDemRest = codeDemRest;
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
        this.motif = motif;
        this.dateSup = dateSup;
        this.tiersSupp = tiersSupp;
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

    public int getIDDECReception() {
        return iDDECReception;
    }

    public void setIDDECReception(int iDDECReception) {
        this.iDDECReception = iDDECReception;
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

    public int getIdnatureoperation() {
        return idnatureoperation;
    }

    public void setIdnatureoperation(int idnatureoperation) {
        this.idnatureoperation = idnatureoperation;
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

    public long getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(long numTiers) {
        this.numTiers = numTiers;
    }

    public long getCodeDemRest() {
        return codeDemRest;
    }

    public void setCodeDemRest(long codeDemRest) {
        this.codeDemRest = codeDemRest;
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

    public long getTiersSupp() {
        return tiersSupp;
    }

    public void setTiersSupp(long tiersSupp) {
        this.tiersSupp = tiersSupp;
    }

    public Integer getIDDECAutorisationDeRestitution() {
        return iDDECAutorisationDeRestitution;
    }

    public void setIDDECAutorisationDeRestitution(Integer iDDECAutorisationDeRestitution) {
        this.iDDECAutorisationDeRestitution = iDDECAutorisationDeRestitution;
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
        hash += (iDDECAutorisationDeRestitution != null ? iDDECAutorisationDeRestitution.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DecAutorisationderestitutionsup)) {
            return false;
        }
        DecAutorisationderestitutionsup other = (DecAutorisationderestitutionsup) object;
        if ((this.iDDECAutorisationDeRestitution == null && other.iDDECAutorisationDeRestitution != null) || (this.iDDECAutorisationDeRestitution != null && !this.iDDECAutorisationDeRestitution.equals(other.iDDECAutorisationDeRestitution))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.DecAutorisationderestitutionsup[ iDDECAutorisationDeRestitution=" + iDDECAutorisationDeRestitution + " ]";
    }
    
}
