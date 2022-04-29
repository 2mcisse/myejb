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
@Table(name = "dec_titredeperceptionsup")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DecTitredeperceptionsup.findAll", query = "SELECT d FROM DecTitredeperceptionsup d")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByIDDECTitreDePerception", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.iDDECTitreDePerception = :iDDECTitreDePerception")
    , @NamedQuery(name = "DecTitredeperceptionsup.findBySaisieDate", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.saisieDate = :saisieDate")
    , @NamedQuery(name = "DecTitredeperceptionsup.findBySaisiePar", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.saisiePar = :saisiePar")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByIDDECReception", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.iDDECReception = :iDDECReception")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByDateVisaCG", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.dateVisaCG = :dateVisaCG")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByDateVisaDG", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.dateVisaDG = :dateVisaDG")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByDateVisaDO", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.dateVisaDO = :dateVisaDO")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByMontant", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.montant = :montant")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByDateTitre", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.dateTitre = :dateTitre")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByIdnatureoperation", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.idnatureoperation = :idnatureoperation")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByIdaffaires", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.idaffaires = :idaffaires")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByNumeroTitre", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.numeroTitre = :numeroTitre")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByNiveau", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.niveau = :niveau")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByNiveauPrecedent", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.niveauPrecedent = :niveauPrecedent")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByObservation", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.observation = :observation")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByNumTiers", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.numTiers = :numTiers")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByCodejnl", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.codejnl = :codejnl")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByCodeEnc", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.codeEnc = :codeEnc")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByCPtCREDIT", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.cPtCREDIT = :cPtCREDIT")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByCptdebit", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.cptdebit = :cptdebit")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByTraiter", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.traiter = :traiter")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByLibop", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.libop = :libop")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByNumTiersBenef", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.numTiersBenef = :numTiersBenef")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByBeneF", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.beneF = :beneF")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByQuittance", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.quittance = :quittance")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByMotif", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.motif = :motif")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByDateSup", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.dateSup = :dateSup")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByNtiersup", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.ntiersup = :ntiersup")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByTypeSuppres", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.typeSuppres = :typeSuppres")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByIDDECRestitution", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.iDDECRestitution = :iDDECRestitution")
    , @NamedQuery(name = "DecTitredeperceptionsup.findByGestion", query = "SELECT d FROM DecTitredeperceptionsup d WHERE d.gestion = :gestion")})
public class DecTitredeperceptionsup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDEC_TitreDePerception")
    private Integer iDDECTitreDePerception;
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
    @Column(name = "DateVisaDO")
    @Temporal(TemporalType.DATE)
    private Date dateVisaDO;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "Montant")
    private BigDecimal montant;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateTitre")
    @Temporal(TemporalType.DATE)
    private Date dateTitre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDNATUREOPERATION")
    private int idnatureoperation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDAFFAIRES")
    private int idaffaires;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumeroTitre")
    private String numeroTitre;
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
    @Size(min = 1, max = 200)
    @Column(name = "OBSERVATION")
    private String observation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NumTiers")
    private long numTiers;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CODEJNL")
    private String codejnl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_ENC")
    private long codeEnc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPtCREDIT")
    private String cPtCREDIT;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPTDEBIT")
    private String cptdebit;
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
    @Column(name = "NumTiersBenef")
    private int numTiersBenef;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "BeneF")
    private String beneF;
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
    @Column(name = "Ntiersup")
    private long ntiersup;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TypeSuppres")
    private int typeSuppres;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDEC_Restitution")
    private int iDDECRestitution;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;

    public DecTitredeperceptionsup() {
    }

    public DecTitredeperceptionsup(Integer iDDECTitreDePerception) {
        this.iDDECTitreDePerception = iDDECTitreDePerception;
    }

    public DecTitredeperceptionsup(Integer iDDECTitreDePerception, Date saisieDate, String saisiePar, int iDDECReception, Date dateVisaCG, Date dateVisaDG, Date dateVisaDO, BigDecimal montant, Date dateTitre, int idnatureoperation, int idaffaires, String numeroTitre, short niveau, int niveauPrecedent, String observation, long numTiers, String codejnl, long codeEnc, String cPtCREDIT, String cptdebit, short traiter, String libop, int numTiersBenef, String beneF, String quittance, String motif, Date dateSup, long ntiersup, int typeSuppres, int iDDECRestitution) {
        this.iDDECTitreDePerception = iDDECTitreDePerception;
        this.saisieDate = saisieDate;
        this.saisiePar = saisiePar;
        this.iDDECReception = iDDECReception;
        this.dateVisaCG = dateVisaCG;
        this.dateVisaDG = dateVisaDG;
        this.dateVisaDO = dateVisaDO;
        this.montant = montant;
        this.dateTitre = dateTitre;
        this.idnatureoperation = idnatureoperation;
        this.idaffaires = idaffaires;
        this.numeroTitre = numeroTitre;
        this.niveau = niveau;
        this.niveauPrecedent = niveauPrecedent;
        this.observation = observation;
        this.numTiers = numTiers;
        this.codejnl = codejnl;
        this.codeEnc = codeEnc;
        this.cPtCREDIT = cPtCREDIT;
        this.cptdebit = cptdebit;
        this.traiter = traiter;
        this.libop = libop;
        this.numTiersBenef = numTiersBenef;
        this.beneF = beneF;
        this.quittance = quittance;
        this.motif = motif;
        this.dateSup = dateSup;
        this.ntiersup = ntiersup;
        this.typeSuppres = typeSuppres;
        this.iDDECRestitution = iDDECRestitution;
    }

    public Integer getIDDECTitreDePerception() {
        return iDDECTitreDePerception;
    }

    public void setIDDECTitreDePerception(Integer iDDECTitreDePerception) {
        this.iDDECTitreDePerception = iDDECTitreDePerception;
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

    public Date getDateVisaDO() {
        return dateVisaDO;
    }

    public void setDateVisaDO(Date dateVisaDO) {
        this.dateVisaDO = dateVisaDO;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public Date getDateTitre() {
        return dateTitre;
    }

    public void setDateTitre(Date dateTitre) {
        this.dateTitre = dateTitre;
    }

    public int getIdnatureoperation() {
        return idnatureoperation;
    }

    public void setIdnatureoperation(int idnatureoperation) {
        this.idnatureoperation = idnatureoperation;
    }

    public int getIdaffaires() {
        return idaffaires;
    }

    public void setIdaffaires(int idaffaires) {
        this.idaffaires = idaffaires;
    }

    public String getNumeroTitre() {
        return numeroTitre;
    }

    public void setNumeroTitre(String numeroTitre) {
        this.numeroTitre = numeroTitre;
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

    public String getCodejnl() {
        return codejnl;
    }

    public void setCodejnl(String codejnl) {
        this.codejnl = codejnl;
    }

    public long getCodeEnc() {
        return codeEnc;
    }

    public void setCodeEnc(long codeEnc) {
        this.codeEnc = codeEnc;
    }

    public String getCPtCREDIT() {
        return cPtCREDIT;
    }

    public void setCPtCREDIT(String cPtCREDIT) {
        this.cPtCREDIT = cPtCREDIT;
    }

    public String getCptdebit() {
        return cptdebit;
    }

    public void setCptdebit(String cptdebit) {
        this.cptdebit = cptdebit;
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

    public int getNumTiersBenef() {
        return numTiersBenef;
    }

    public void setNumTiersBenef(int numTiersBenef) {
        this.numTiersBenef = numTiersBenef;
    }

    public String getBeneF() {
        return beneF;
    }

    public void setBeneF(String beneF) {
        this.beneF = beneF;
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

    public long getNtiersup() {
        return ntiersup;
    }

    public void setNtiersup(long ntiersup) {
        this.ntiersup = ntiersup;
    }

    public int getTypeSuppres() {
        return typeSuppres;
    }

    public void setTypeSuppres(int typeSuppres) {
        this.typeSuppres = typeSuppres;
    }

    public int getIDDECRestitution() {
        return iDDECRestitution;
    }

    public void setIDDECRestitution(int iDDECRestitution) {
        this.iDDECRestitution = iDDECRestitution;
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
        hash += (iDDECTitreDePerception != null ? iDDECTitreDePerception.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DecTitredeperceptionsup)) {
            return false;
        }
        DecTitredeperceptionsup other = (DecTitredeperceptionsup) object;
        if ((this.iDDECTitreDePerception == null && other.iDDECTitreDePerception != null) || (this.iDDECTitreDePerception != null && !this.iDDECTitreDePerception.equals(other.iDDECTitreDePerception))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.DecTitredeperceptionsup[ iDDECTitreDePerception=" + iDDECTitreDePerception + " ]";
    }
    
}
