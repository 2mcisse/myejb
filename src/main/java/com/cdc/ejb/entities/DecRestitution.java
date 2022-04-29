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
@Table(name = "dec_restitution")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DecRestitution.findAll", query = "SELECT d FROM DecRestitution d")
    , @NamedQuery(name = "DecRestitution.findByIDDECRestitution", query = "SELECT d FROM DecRestitution d WHERE d.iDDECRestitution = :iDDECRestitution")
    , @NamedQuery(name = "DecRestitution.findByDateRest", query = "SELECT d FROM DecRestitution d WHERE d.dateRest = :dateRest")
    , @NamedQuery(name = "DecRestitution.findByNotes", query = "SELECT d FROM DecRestitution d WHERE d.notes = :notes")
    , @NamedQuery(name = "DecRestitution.findByDateVisaDO", query = "SELECT d FROM DecRestitution d WHERE d.dateVisaDO = :dateVisaDO")
    , @NamedQuery(name = "DecRestitution.findByDateVisaDG", query = "SELECT d FROM DecRestitution d WHERE d.dateVisaDG = :dateVisaDG")
    , @NamedQuery(name = "DecRestitution.findByDateVisaCG", query = "SELECT d FROM DecRestitution d WHERE d.dateVisaCG = :dateVisaCG")
    , @NamedQuery(name = "DecRestitution.findByMontant", query = "SELECT d FROM DecRestitution d WHERE d.montant = :montant")
    , @NamedQuery(name = "DecRestitution.findByIDSYSMode", query = "SELECT d FROM DecRestitution d WHERE d.iDSYSMode = :iDSYSMode")
    , @NamedQuery(name = "DecRestitution.findByQuittance", query = "SELECT d FROM DecRestitution d WHERE d.quittance = :quittance")
    , @NamedQuery(name = "DecRestitution.findByObjetOP", query = "SELECT d FROM DecRestitution d WHERE d.objetOP = :objetOP")
    , @NamedQuery(name = "DecRestitution.findBySupprimer", query = "SELECT d FROM DecRestitution d WHERE d.supprimer = :supprimer")
    , @NamedQuery(name = "DecRestitution.findByLogSup", query = "SELECT d FROM DecRestitution d WHERE d.logSup = :logSup")
    , @NamedQuery(name = "DecRestitution.findByDateSup", query = "SELECT d FROM DecRestitution d WHERE d.dateSup = :dateSup")
    , @NamedQuery(name = "DecRestitution.findByTaux", query = "SELECT d FROM DecRestitution d WHERE d.taux = :taux")
    , @NamedQuery(name = "DecRestitution.findByValider", query = "SELECT d FROM DecRestitution d WHERE d.valider = :valider")
    , @NamedQuery(name = "DecRestitution.findByCodeDec", query = "SELECT d FROM DecRestitution d WHERE d.codeDec = :codeDec")
    , @NamedQuery(name = "DecRestitution.findByAnnul", query = "SELECT d FROM DecRestitution d WHERE d.annul = :annul")
    , @NamedQuery(name = "DecRestitution.findByIdannilationTp", query = "SELECT d FROM DecRestitution d WHERE d.idannilationTp = :idannilationTp")
    , @NamedQuery(name = "DecRestitution.findByGestion", query = "SELECT d FROM DecRestitution d WHERE d.gestion = :gestion")})
public class DecRestitution implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDEC_Restitution")
    private Integer iDDECRestitution;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateRest")
    @Temporal(TemporalType.DATE)
    private Date dateRest;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Notes")
    private String notes;
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "Montant")
    private BigDecimal montant;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSYS_Mode")
    private int iDSYSMode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Quittance")
    private String quittance;
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
    @Column(name = "CODE_DEC")
    private long codeDec;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDDECRestitution")
    private List<Encaissements> encaissementsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDDECRestitution")
    private List<Pieces> piecesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDDECRestitution")
    private List<Decaissements> decaissementsList;
    @OneToMany(mappedBy = "iDDECRestitution")
    private List<Ordresdepaiement> ordresdepaiementList;
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
    private List<DecAutorisationderestitution> decAutorisationderestitutionList;

    public DecRestitution() {
    }

    public DecRestitution(Integer iDDECRestitution) {
        this.iDDECRestitution = iDDECRestitution;
    }

    public DecRestitution(Integer iDDECRestitution, Date dateRest, String notes, Date dateVisaDO, Date dateVisaDG, Date dateVisaCG, BigDecimal montant, int iDSYSMode, String quittance, String objetOP, short supprimer, String logSup, Date dateSup, double taux, short valider, long codeDec, short annul, long idannilationTp) {
        this.iDDECRestitution = iDDECRestitution;
        this.dateRest = dateRest;
        this.notes = notes;
        this.dateVisaDO = dateVisaDO;
        this.dateVisaDG = dateVisaDG;
        this.dateVisaCG = dateVisaCG;
        this.montant = montant;
        this.iDSYSMode = iDSYSMode;
        this.quittance = quittance;
        this.objetOP = objetOP;
        this.supprimer = supprimer;
        this.logSup = logSup;
        this.dateSup = dateSup;
        this.taux = taux;
        this.valider = valider;
        this.codeDec = codeDec;
        this.annul = annul;
        this.idannilationTp = idannilationTp;
    }

    public Integer getIDDECRestitution() {
        return iDDECRestitution;
    }

    public void setIDDECRestitution(Integer iDDECRestitution) {
        this.iDDECRestitution = iDDECRestitution;
    }

    public Date getDateRest() {
        return dateRest;
    }

    public void setDateRest(Date dateRest) {
        this.dateRest = dateRest;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public int getIDSYSMode() {
        return iDSYSMode;
    }

    public void setIDSYSMode(int iDSYSMode) {
        this.iDSYSMode = iDSYSMode;
    }

    public String getQuittance() {
        return quittance;
    }

    public void setQuittance(String quittance) {
        this.quittance = quittance;
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

    public long getCodeDec() {
        return codeDec;
    }

    public void setCodeDec(long codeDec) {
        this.codeDec = codeDec;
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

    @XmlTransient
    public List<Decaissements> getDecaissementsList() {
        return decaissementsList;
    }

    public void setDecaissementsList(List<Decaissements> decaissementsList) {
        this.decaissementsList = decaissementsList;
    }

    @XmlTransient
    public List<Ordresdepaiement> getOrdresdepaiementList() {
        return ordresdepaiementList;
    }

    public void setOrdresdepaiementList(List<Ordresdepaiement> ordresdepaiementList) {
        this.ordresdepaiementList = ordresdepaiementList;
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
    public List<DecAutorisationderestitution> getDecAutorisationderestitutionList() {
        return decAutorisationderestitutionList;
    }

    public void setDecAutorisationderestitutionList(List<DecAutorisationderestitution> decAutorisationderestitutionList) {
        this.decAutorisationderestitutionList = decAutorisationderestitutionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDDECRestitution != null ? iDDECRestitution.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DecRestitution)) {
            return false;
        }
        DecRestitution other = (DecRestitution) object;
        if ((this.iDDECRestitution == null && other.iDDECRestitution != null) || (this.iDDECRestitution != null && !this.iDDECRestitution.equals(other.iDDECRestitution))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.DecRestitution[ iDDECRestitution=" + iDDECRestitution + " ]";
    }
    
}
