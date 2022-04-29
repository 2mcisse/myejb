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
@Table(name = "ach_marches")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AchMarches.findAll", query = "SELECT a FROM AchMarches a")
    , @NamedQuery(name = "AchMarches.findByIDMarche", query = "SELECT a FROM AchMarches a WHERE a.iDMarche = :iDMarche")
    , @NamedQuery(name = "AchMarches.findByObjetMarche", query = "SELECT a FROM AchMarches a WHERE a.objetMarche = :objetMarche")
    , @NamedQuery(name = "AchMarches.findByReference", query = "SELECT a FROM AchMarches a WHERE a.reference = :reference")
    , @NamedQuery(name = "AchMarches.findByDateCloture", query = "SELECT a FROM AchMarches a WHERE a.dateCloture = :dateCloture")
    , @NamedQuery(name = "AchMarches.findByIDDemandeAppro", query = "SELECT a FROM AchMarches a WHERE a.iDDemandeAppro = :iDDemandeAppro")
    , @NamedQuery(name = "AchMarches.findByMontant", query = "SELECT a FROM AchMarches a WHERE a.montant = :montant")
    , @NamedQuery(name = "AchMarches.findByDateLancement", query = "SELECT a FROM AchMarches a WHERE a.dateLancement = :dateLancement")
    , @NamedQuery(name = "AchMarches.findByNumTiers", query = "SELECT a FROM AchMarches a WHERE a.numTiers = :numTiers")
    , @NamedQuery(name = "AchMarches.findByPhase", query = "SELECT a FROM AchMarches a WHERE a.phase = :phase")
    , @NamedQuery(name = "AchMarches.findByDATEDebutPremiereEtape", query = "SELECT a FROM AchMarches a WHERE a.dATEDebutPremiereEtape = :dATEDebutPremiereEtape")
    , @NamedQuery(name = "AchMarches.findByGestion", query = "SELECT a FROM AchMarches a WHERE a.gestion = :gestion")})
public class AchMarches implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Marche")
    private Integer iDMarche;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "ObjetMarche")
    private String objetMarche;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Reference")
    private String reference;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateCloture")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCloture;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDemandeAppro")
    private int iDDemandeAppro;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "Montant")
    private BigDecimal montant;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateLancement")
    @Temporal(TemporalType.DATE)
    private Date dateLancement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NumTiers")
    private long numTiers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Phase")
    private short phase;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATEDebutPremiereEtape")
    @Temporal(TemporalType.DATE)
    private Date dATEDebutPremiereEtape;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(mappedBy = "iDMarche")
    private List<Preselection> preselectionList;
    @JoinColumn(name = "IDNATURE_MARCHE", referencedColumnName = "IDNATURE_MARCHE")
    @ManyToOne(optional = false)
    private AchNatureMarche idnatureMarche;
    @JoinColumn(name = "IDACH_LIGNESPLAN_PASSATION", referencedColumnName = "IDACH_LIGNESPLAN_PASSATION")
    @ManyToOne(optional = false)
    private AchLignesplanPassation idachLignesplanPassation;
    @JoinColumn(name = "IDType", referencedColumnName = "IDType")
    @ManyToOne(optional = false)
    private AchTypemarche iDType;
    @JoinColumn(name = "IDACH_MODE_EVALUATION", referencedColumnName = "IDACH_MODE_EVALUATION")
    @ManyToOne(optional = false)
    private AchModeEvaluation idachModeEvaluation;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDMarche")
    private List<Pieces> piecesList;
    @OneToMany(mappedBy = "iDMarche")
    private List<Reunions> reunionsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDMarche")
    private List<Etapes> etapesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDMarche")
    private List<AchComites> achComitesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDMarche")
    private List<Offres> offresList;

    public AchMarches() {
    }

    public AchMarches(Integer iDMarche) {
        this.iDMarche = iDMarche;
    }

    public AchMarches(Integer iDMarche, String objetMarche, String reference, Date dateCloture, int iDDemandeAppro, BigDecimal montant, Date dateLancement, long numTiers, short phase, Date dATEDebutPremiereEtape) {
        this.iDMarche = iDMarche;
        this.objetMarche = objetMarche;
        this.reference = reference;
        this.dateCloture = dateCloture;
        this.iDDemandeAppro = iDDemandeAppro;
        this.montant = montant;
        this.dateLancement = dateLancement;
        this.numTiers = numTiers;
        this.phase = phase;
        this.dATEDebutPremiereEtape = dATEDebutPremiereEtape;
    }

    public Integer getIDMarche() {
        return iDMarche;
    }

    public void setIDMarche(Integer iDMarche) {
        this.iDMarche = iDMarche;
    }

    public String getObjetMarche() {
        return objetMarche;
    }

    public void setObjetMarche(String objetMarche) {
        this.objetMarche = objetMarche;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getDateCloture() {
        return dateCloture;
    }

    public void setDateCloture(Date dateCloture) {
        this.dateCloture = dateCloture;
    }

    public int getIDDemandeAppro() {
        return iDDemandeAppro;
    }

    public void setIDDemandeAppro(int iDDemandeAppro) {
        this.iDDemandeAppro = iDDemandeAppro;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public Date getDateLancement() {
        return dateLancement;
    }

    public void setDateLancement(Date dateLancement) {
        this.dateLancement = dateLancement;
    }

    public long getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(long numTiers) {
        this.numTiers = numTiers;
    }

    public short getPhase() {
        return phase;
    }

    public void setPhase(short phase) {
        this.phase = phase;
    }

    public Date getDATEDebutPremiereEtape() {
        return dATEDebutPremiereEtape;
    }

    public void setDATEDebutPremiereEtape(Date dATEDebutPremiereEtape) {
        this.dATEDebutPremiereEtape = dATEDebutPremiereEtape;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<Preselection> getPreselectionList() {
        return preselectionList;
    }

    public void setPreselectionList(List<Preselection> preselectionList) {
        this.preselectionList = preselectionList;
    }

    public AchNatureMarche getIdnatureMarche() {
        return idnatureMarche;
    }

    public void setIdnatureMarche(AchNatureMarche idnatureMarche) {
        this.idnatureMarche = idnatureMarche;
    }

    public AchLignesplanPassation getIdachLignesplanPassation() {
        return idachLignesplanPassation;
    }

    public void setIdachLignesplanPassation(AchLignesplanPassation idachLignesplanPassation) {
        this.idachLignesplanPassation = idachLignesplanPassation;
    }

    public AchTypemarche getIDType() {
        return iDType;
    }

    public void setIDType(AchTypemarche iDType) {
        this.iDType = iDType;
    }

    public AchModeEvaluation getIdachModeEvaluation() {
        return idachModeEvaluation;
    }

    public void setIdachModeEvaluation(AchModeEvaluation idachModeEvaluation) {
        this.idachModeEvaluation = idachModeEvaluation;
    }

    @XmlTransient
    public List<Pieces> getPiecesList() {
        return piecesList;
    }

    public void setPiecesList(List<Pieces> piecesList) {
        this.piecesList = piecesList;
    }

    @XmlTransient
    public List<Reunions> getReunionsList() {
        return reunionsList;
    }

    public void setReunionsList(List<Reunions> reunionsList) {
        this.reunionsList = reunionsList;
    }

    @XmlTransient
    public List<Etapes> getEtapesList() {
        return etapesList;
    }

    public void setEtapesList(List<Etapes> etapesList) {
        this.etapesList = etapesList;
    }

    @XmlTransient
    public List<AchComites> getAchComitesList() {
        return achComitesList;
    }

    public void setAchComitesList(List<AchComites> achComitesList) {
        this.achComitesList = achComitesList;
    }

    @XmlTransient
    public List<Offres> getOffresList() {
        return offresList;
    }

    public void setOffresList(List<Offres> offresList) {
        this.offresList = offresList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDMarche != null ? iDMarche.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AchMarches)) {
            return false;
        }
        AchMarches other = (AchMarches) object;
        if ((this.iDMarche == null && other.iDMarche != null) || (this.iDMarche != null && !this.iDMarche.equals(other.iDMarche))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.AchMarches[ iDMarche=" + iDMarche + " ]";
    }
    
}
