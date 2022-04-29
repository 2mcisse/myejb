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
@Table(name = "dec_mouvementsreleve")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DecMouvementsreleve.findAll", query = "SELECT d FROM DecMouvementsreleve d")
    , @NamedQuery(name = "DecMouvementsreleve.findByIdmouvements", query = "SELECT d FROM DecMouvementsreleve d WHERE d.idmouvements = :idmouvements")
    , @NamedQuery(name = "DecMouvementsreleve.findByDateOperation", query = "SELECT d FROM DecMouvementsreleve d WHERE d.dateOperation = :dateOperation")
    , @NamedQuery(name = "DecMouvementsreleve.findByMontantDebit", query = "SELECT d FROM DecMouvementsreleve d WHERE d.montantDebit = :montantDebit")
    , @NamedQuery(name = "DecMouvementsreleve.findByMontantCredit", query = "SELECT d FROM DecMouvementsreleve d WHERE d.montantCredit = :montantCredit")
    , @NamedQuery(name = "DecMouvementsreleve.findByIDDetailsArretes", query = "SELECT d FROM DecMouvementsreleve d WHERE d.iDDetailsArretes = :iDDetailsArretes")
    , @NamedQuery(name = "DecMouvementsreleve.findByIdaffaires", query = "SELECT d FROM DecMouvementsreleve d WHERE d.idaffaires = :idaffaires")
    , @NamedQuery(name = "DecMouvementsreleve.findByLibelle", query = "SELECT d FROM DecMouvementsreleve d WHERE d.libelle = :libelle")
    , @NamedQuery(name = "DecMouvementsreleve.findByControlee", query = "SELECT d FROM DecMouvementsreleve d WHERE d.controlee = :controlee")
    , @NamedQuery(name = "DecMouvementsreleve.findByDateValeur", query = "SELECT d FROM DecMouvementsreleve d WHERE d.dateValeur = :dateValeur")
    , @NamedQuery(name = "DecMouvementsreleve.findByType", query = "SELECT d FROM DecMouvementsreleve d WHERE d.type = :type")
    , @NamedQuery(name = "DecMouvementsreleve.findByNumTiers", query = "SELECT d FROM DecMouvementsreleve d WHERE d.numTiers = :numTiers")
    , @NamedQuery(name = "DecMouvementsreleve.findByCodeEnc", query = "SELECT d FROM DecMouvementsreleve d WHERE d.codeEnc = :codeEnc")
    , @NamedQuery(name = "DecMouvementsreleve.findByCodeDec", query = "SELECT d FROM DecMouvementsreleve d WHERE d.codeDec = :codeDec")
    , @NamedQuery(name = "DecMouvementsreleve.findByImputerSurCDO", query = "SELECT d FROM DecMouvementsreleve d WHERE d.imputerSurCDO = :imputerSurCDO")
    , @NamedQuery(name = "DecMouvementsreleve.findByIDSYSMode", query = "SELECT d FROM DecMouvementsreleve d WHERE d.iDSYSMode = :iDSYSMode")
    , @NamedQuery(name = "DecMouvementsreleve.findByArretee", query = "SELECT d FROM DecMouvementsreleve d WHERE d.arretee = :arretee")
    , @NamedQuery(name = "DecMouvementsreleve.findByMntDeP", query = "SELECT d FROM DecMouvementsreleve d WHERE d.mntDeP = :mntDeP")
    , @NamedQuery(name = "DecMouvementsreleve.findByCumulInteret", query = "SELECT d FROM DecMouvementsreleve d WHERE d.cumulInteret = :cumulInteret")
    , @NamedQuery(name = "DecMouvementsreleve.findByIdnatureoperation", query = "SELECT d FROM DecMouvementsreleve d WHERE d.idnatureoperation = :idnatureoperation")
    , @NamedQuery(name = "DecMouvementsreleve.findByDateCPTAFFAIRE", query = "SELECT d FROM DecMouvementsreleve d WHERE d.dateCPTAFFAIRE = :dateCPTAFFAIRE")
    , @NamedQuery(name = "DecMouvementsreleve.findByIDDECReception", query = "SELECT d FROM DecMouvementsreleve d WHERE d.iDDECReception = :iDDECReception")
    , @NamedQuery(name = "DecMouvementsreleve.findByIDDECRestitution", query = "SELECT d FROM DecMouvementsreleve d WHERE d.iDDECRestitution = :iDDECRestitution")
    , @NamedQuery(name = "DecMouvementsreleve.findByCompteTiers", query = "SELECT d FROM DecMouvementsreleve d WHERE d.compteTiers = :compteTiers")
    , @NamedQuery(name = "DecMouvementsreleve.findByCompteAffaire", query = "SELECT d FROM DecMouvementsreleve d WHERE d.compteAffaire = :compteAffaire")
    , @NamedQuery(name = "DecMouvementsreleve.findByTaux", query = "SELECT d FROM DecMouvementsreleve d WHERE d.taux = :taux")
    , @NamedQuery(name = "DecMouvementsreleve.findByDateMAJ", query = "SELECT d FROM DecMouvementsreleve d WHERE d.dateMAJ = :dateMAJ")
    , @NamedQuery(name = "DecMouvementsreleve.findByGestion", query = "SELECT d FROM DecMouvementsreleve d WHERE d.gestion = :gestion")})
public class DecMouvementsreleve implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDMOUVEMENTS")
    private Integer idmouvements;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateOperation")
    @Temporal(TemporalType.DATE)
    private Date dateOperation;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "MontantDebit")
    private BigDecimal montantDebit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MontantCredit")
    private BigDecimal montantCredit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDetailsArretes")
    private int iDDetailsArretes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDAFFAIRES")
    private int idaffaires;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Libelle")
    private String libelle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Controlee")
    private short controlee;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateValeur")
    @Temporal(TemporalType.DATE)
    private Date dateValeur;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Type")
    private short type;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NumTiers")
    private long numTiers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_ENC")
    private long codeEnc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_DEC")
    private long codeDec;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImputerSurCDO")
    private short imputerSurCDO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSYS_Mode")
    private int iDSYSMode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Arretee")
    private short arretee;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MntDeP")
    private int mntDeP;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CumulInteret")
    private int cumulInteret;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDNATUREOPERATION")
    private int idnatureoperation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Date_CPT_AFFAIRE")
    @Temporal(TemporalType.DATE)
    private Date dateCPTAFFAIRE;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDEC_Reception")
    private int iDDECReception;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDEC_Restitution")
    private int iDDECRestitution;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "CompteTiers")
    private String compteTiers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CompteAffaire")
    private short compteAffaire;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Taux")
    private double taux;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateMAJ")
    @Temporal(TemporalType.DATE)
    private Date dateMAJ;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;

    public DecMouvementsreleve() {
    }

    public DecMouvementsreleve(Integer idmouvements) {
        this.idmouvements = idmouvements;
    }

    public DecMouvementsreleve(Integer idmouvements, Date dateOperation, BigDecimal montantDebit, BigDecimal montantCredit, int iDDetailsArretes, int idaffaires, String libelle, short controlee, Date dateValeur, short type, long numTiers, long codeEnc, long codeDec, short imputerSurCDO, int iDSYSMode, short arretee, int mntDeP, int cumulInteret, int idnatureoperation, Date dateCPTAFFAIRE, int iDDECReception, int iDDECRestitution, String compteTiers, short compteAffaire, double taux, Date dateMAJ) {
        this.idmouvements = idmouvements;
        this.dateOperation = dateOperation;
        this.montantDebit = montantDebit;
        this.montantCredit = montantCredit;
        this.iDDetailsArretes = iDDetailsArretes;
        this.idaffaires = idaffaires;
        this.libelle = libelle;
        this.controlee = controlee;
        this.dateValeur = dateValeur;
        this.type = type;
        this.numTiers = numTiers;
        this.codeEnc = codeEnc;
        this.codeDec = codeDec;
        this.imputerSurCDO = imputerSurCDO;
        this.iDSYSMode = iDSYSMode;
        this.arretee = arretee;
        this.mntDeP = mntDeP;
        this.cumulInteret = cumulInteret;
        this.idnatureoperation = idnatureoperation;
        this.dateCPTAFFAIRE = dateCPTAFFAIRE;
        this.iDDECReception = iDDECReception;
        this.iDDECRestitution = iDDECRestitution;
        this.compteTiers = compteTiers;
        this.compteAffaire = compteAffaire;
        this.taux = taux;
        this.dateMAJ = dateMAJ;
    }

    public Integer getIdmouvements() {
        return idmouvements;
    }

    public void setIdmouvements(Integer idmouvements) {
        this.idmouvements = idmouvements;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public BigDecimal getMontantDebit() {
        return montantDebit;
    }

    public void setMontantDebit(BigDecimal montantDebit) {
        this.montantDebit = montantDebit;
    }

    public BigDecimal getMontantCredit() {
        return montantCredit;
    }

    public void setMontantCredit(BigDecimal montantCredit) {
        this.montantCredit = montantCredit;
    }

    public int getIDDetailsArretes() {
        return iDDetailsArretes;
    }

    public void setIDDetailsArretes(int iDDetailsArretes) {
        this.iDDetailsArretes = iDDetailsArretes;
    }

    public int getIdaffaires() {
        return idaffaires;
    }

    public void setIdaffaires(int idaffaires) {
        this.idaffaires = idaffaires;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public short getControlee() {
        return controlee;
    }

    public void setControlee(short controlee) {
        this.controlee = controlee;
    }

    public Date getDateValeur() {
        return dateValeur;
    }

    public void setDateValeur(Date dateValeur) {
        this.dateValeur = dateValeur;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public long getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(long numTiers) {
        this.numTiers = numTiers;
    }

    public long getCodeEnc() {
        return codeEnc;
    }

    public void setCodeEnc(long codeEnc) {
        this.codeEnc = codeEnc;
    }

    public long getCodeDec() {
        return codeDec;
    }

    public void setCodeDec(long codeDec) {
        this.codeDec = codeDec;
    }

    public short getImputerSurCDO() {
        return imputerSurCDO;
    }

    public void setImputerSurCDO(short imputerSurCDO) {
        this.imputerSurCDO = imputerSurCDO;
    }

    public int getIDSYSMode() {
        return iDSYSMode;
    }

    public void setIDSYSMode(int iDSYSMode) {
        this.iDSYSMode = iDSYSMode;
    }

    public short getArretee() {
        return arretee;
    }

    public void setArretee(short arretee) {
        this.arretee = arretee;
    }

    public int getMntDeP() {
        return mntDeP;
    }

    public void setMntDeP(int mntDeP) {
        this.mntDeP = mntDeP;
    }

    public int getCumulInteret() {
        return cumulInteret;
    }

    public void setCumulInteret(int cumulInteret) {
        this.cumulInteret = cumulInteret;
    }

    public int getIdnatureoperation() {
        return idnatureoperation;
    }

    public void setIdnatureoperation(int idnatureoperation) {
        this.idnatureoperation = idnatureoperation;
    }

    public Date getDateCPTAFFAIRE() {
        return dateCPTAFFAIRE;
    }

    public void setDateCPTAFFAIRE(Date dateCPTAFFAIRE) {
        this.dateCPTAFFAIRE = dateCPTAFFAIRE;
    }

    public int getIDDECReception() {
        return iDDECReception;
    }

    public void setIDDECReception(int iDDECReception) {
        this.iDDECReception = iDDECReception;
    }

    public int getIDDECRestitution() {
        return iDDECRestitution;
    }

    public void setIDDECRestitution(int iDDECRestitution) {
        this.iDDECRestitution = iDDECRestitution;
    }

    public String getCompteTiers() {
        return compteTiers;
    }

    public void setCompteTiers(String compteTiers) {
        this.compteTiers = compteTiers;
    }

    public short getCompteAffaire() {
        return compteAffaire;
    }

    public void setCompteAffaire(short compteAffaire) {
        this.compteAffaire = compteAffaire;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public Date getDateMAJ() {
        return dateMAJ;
    }

    public void setDateMAJ(Date dateMAJ) {
        this.dateMAJ = dateMAJ;
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
        hash += (idmouvements != null ? idmouvements.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DecMouvementsreleve)) {
            return false;
        }
        DecMouvementsreleve other = (DecMouvementsreleve) object;
        if ((this.idmouvements == null && other.idmouvements != null) || (this.idmouvements != null && !this.idmouvements.equals(other.idmouvements))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.DecMouvementsreleve[ idmouvements=" + idmouvements + " ]";
    }
    
}
