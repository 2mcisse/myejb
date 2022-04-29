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
@Table(name = "dec_titredeperception")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DecTitredeperception.findAll", query = "SELECT d FROM DecTitredeperception d")
    , @NamedQuery(name = "DecTitredeperception.findByIDDECTitreDePerception", query = "SELECT d FROM DecTitredeperception d WHERE d.iDDECTitreDePerception = :iDDECTitreDePerception")
    , @NamedQuery(name = "DecTitredeperception.findBySaisieDate", query = "SELECT d FROM DecTitredeperception d WHERE d.saisieDate = :saisieDate")
    , @NamedQuery(name = "DecTitredeperception.findBySaisiePar", query = "SELECT d FROM DecTitredeperception d WHERE d.saisiePar = :saisiePar")
    , @NamedQuery(name = "DecTitredeperception.findByDateVisaCG", query = "SELECT d FROM DecTitredeperception d WHERE d.dateVisaCG = :dateVisaCG")
    , @NamedQuery(name = "DecTitredeperception.findByDateVisaDG", query = "SELECT d FROM DecTitredeperception d WHERE d.dateVisaDG = :dateVisaDG")
    , @NamedQuery(name = "DecTitredeperception.findByDateVisaDO", query = "SELECT d FROM DecTitredeperception d WHERE d.dateVisaDO = :dateVisaDO")
    , @NamedQuery(name = "DecTitredeperception.findByMontant", query = "SELECT d FROM DecTitredeperception d WHERE d.montant = :montant")
    , @NamedQuery(name = "DecTitredeperception.findByDateTitre", query = "SELECT d FROM DecTitredeperception d WHERE d.dateTitre = :dateTitre")
    , @NamedQuery(name = "DecTitredeperception.findByNumeroTitre", query = "SELECT d FROM DecTitredeperception d WHERE d.numeroTitre = :numeroTitre")
    , @NamedQuery(name = "DecTitredeperception.findByNiveau", query = "SELECT d FROM DecTitredeperception d WHERE d.niveau = :niveau")
    , @NamedQuery(name = "DecTitredeperception.findByNiveauPrecedent", query = "SELECT d FROM DecTitredeperception d WHERE d.niveauPrecedent = :niveauPrecedent")
    , @NamedQuery(name = "DecTitredeperception.findByObservation", query = "SELECT d FROM DecTitredeperception d WHERE d.observation = :observation")
    , @NamedQuery(name = "DecTitredeperception.findByNumTiers", query = "SELECT d FROM DecTitredeperception d WHERE d.numTiers = :numTiers")
    , @NamedQuery(name = "DecTitredeperception.findByCodejnl", query = "SELECT d FROM DecTitredeperception d WHERE d.codejnl = :codejnl")
    , @NamedQuery(name = "DecTitredeperception.findByCodeEnc", query = "SELECT d FROM DecTitredeperception d WHERE d.codeEnc = :codeEnc")
    , @NamedQuery(name = "DecTitredeperception.findByCPtCREDIT", query = "SELECT d FROM DecTitredeperception d WHERE d.cPtCREDIT = :cPtCREDIT")
    , @NamedQuery(name = "DecTitredeperception.findByCptdebit", query = "SELECT d FROM DecTitredeperception d WHERE d.cptdebit = :cptdebit")
    , @NamedQuery(name = "DecTitredeperception.findByTraiter", query = "SELECT d FROM DecTitredeperception d WHERE d.traiter = :traiter")
    , @NamedQuery(name = "DecTitredeperception.findByLibop", query = "SELECT d FROM DecTitredeperception d WHERE d.libop = :libop")
    , @NamedQuery(name = "DecTitredeperception.findByNumTiersBenef", query = "SELECT d FROM DecTitredeperception d WHERE d.numTiersBenef = :numTiersBenef")
    , @NamedQuery(name = "DecTitredeperception.findByBeneF", query = "SELECT d FROM DecTitredeperception d WHERE d.beneF = :beneF")
    , @NamedQuery(name = "DecTitredeperception.findByQuittance", query = "SELECT d FROM DecTitredeperception d WHERE d.quittance = :quittance")
    , @NamedQuery(name = "DecTitredeperception.findByAnnul", query = "SELECT d FROM DecTitredeperception d WHERE d.annul = :annul")
    , @NamedQuery(name = "DecTitredeperception.findByIDDECRestitution", query = "SELECT d FROM DecTitredeperception d WHERE d.iDDECRestitution = :iDDECRestitution")
    , @NamedQuery(name = "DecTitredeperception.findByGestion", query = "SELECT d FROM DecTitredeperception d WHERE d.gestion = :gestion")})
public class DecTitredeperception implements Serializable {

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
    @Column(name = "Annul")
    private short annul;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDEC_Restitution")
    private int iDDECRestitution;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "IDDEC_Reception", referencedColumnName = "IDDEC_Reception")
    @ManyToOne(optional = false)
    private DecReception iDDECReception;
    @JoinColumn(name = "IDNATUREOPERATION", referencedColumnName = "IDNATUREOPERATION")
    @ManyToOne(optional = false)
    private DecNatureoperation idnatureoperation;
    @JoinColumn(name = "IDAFFAIRES", referencedColumnName = "IDAFFAIRES")
    @ManyToOne(optional = false)
    private DecAffaires idaffaires;

    public DecTitredeperception() {
    }

    public DecTitredeperception(Integer iDDECTitreDePerception) {
        this.iDDECTitreDePerception = iDDECTitreDePerception;
    }

    public DecTitredeperception(Integer iDDECTitreDePerception, Date saisieDate, String saisiePar, Date dateVisaCG, Date dateVisaDG, Date dateVisaDO, BigDecimal montant, Date dateTitre, String numeroTitre, short niveau, int niveauPrecedent, String observation, long numTiers, String codejnl, long codeEnc, String cPtCREDIT, String cptdebit, short traiter, String libop, int numTiersBenef, String beneF, String quittance, short annul, int iDDECRestitution) {
        this.iDDECTitreDePerception = iDDECTitreDePerception;
        this.saisieDate = saisieDate;
        this.saisiePar = saisiePar;
        this.dateVisaCG = dateVisaCG;
        this.dateVisaDG = dateVisaDG;
        this.dateVisaDO = dateVisaDO;
        this.montant = montant;
        this.dateTitre = dateTitre;
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
        this.annul = annul;
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

    public short getAnnul() {
        return annul;
    }

    public void setAnnul(short annul) {
        this.annul = annul;
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

    public DecReception getIDDECReception() {
        return iDDECReception;
    }

    public void setIDDECReception(DecReception iDDECReception) {
        this.iDDECReception = iDDECReception;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDDECTitreDePerception != null ? iDDECTitreDePerception.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DecTitredeperception)) {
            return false;
        }
        DecTitredeperception other = (DecTitredeperception) object;
        if ((this.iDDECTitreDePerception == null && other.iDDECTitreDePerception != null) || (this.iDDECTitreDePerception != null && !this.iDDECTitreDePerception.equals(other.iDDECTitreDePerception))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.DecTitredeperception[ iDDECTitreDePerception=" + iDDECTitreDePerception + " ]";
    }
    
}
