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
@Table(name = "demandes_restitution")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DemandesRestitution.findAll", query = "SELECT d FROM DemandesRestitution d")
    , @NamedQuery(name = "DemandesRestitution.findByDate", query = "SELECT d FROM DemandesRestitution d WHERE d.date = :date")
    , @NamedQuery(name = "DemandesRestitution.findByMontant", query = "SELECT d FROM DemandesRestitution d WHERE d.montant = :montant")
    , @NamedQuery(name = "DemandesRestitution.findByIDEtablissementFinancierDepart", query = "SELECT d FROM DemandesRestitution d WHERE d.iDEtablissementFinancierDepart = :iDEtablissementFinancierDepart")
    , @NamedQuery(name = "DemandesRestitution.findByObservation", query = "SELECT d FROM DemandesRestitution d WHERE d.observation = :observation")
    , @NamedQuery(name = "DemandesRestitution.findByNumOR", query = "SELECT d FROM DemandesRestitution d WHERE d.numOR = :numOR")
    , @NamedQuery(name = "DemandesRestitution.findByCodeDemRest", query = "SELECT d FROM DemandesRestitution d WHERE d.codeDemRest = :codeDemRest")
    , @NamedQuery(name = "DemandesRestitution.findByCaissier", query = "SELECT d FROM DemandesRestitution d WHERE d.caissier = :caissier")
    , @NamedQuery(name = "DemandesRestitution.findByIDSYSMode", query = "SELECT d FROM DemandesRestitution d WHERE d.iDSYSMode = :iDSYSMode")
    , @NamedQuery(name = "DemandesRestitution.findByIDDECRestitution", query = "SELECT d FROM DemandesRestitution d WHERE d.iDDECRestitution = :iDDECRestitution")
    , @NamedQuery(name = "DemandesRestitution.findByIDDECReception", query = "SELECT d FROM DemandesRestitution d WHERE d.iDDECReception = :iDDECReception")
    , @NamedQuery(name = "DemandesRestitution.findByIDOrdresDePaiement", query = "SELECT d FROM DemandesRestitution d WHERE d.iDOrdresDePaiement = :iDOrdresDePaiement")
    , @NamedQuery(name = "DemandesRestitution.findByIdmandataires", query = "SELECT d FROM DemandesRestitution d WHERE d.idmandataires = :idmandataires")
    , @NamedQuery(name = "DemandesRestitution.findByIDEtablissementFinancierDest", query = "SELECT d FROM DemandesRestitution d WHERE d.iDEtablissementFinancierDest = :iDEtablissementFinancierDest")
    , @NamedQuery(name = "DemandesRestitution.findByTraitee", query = "SELECT d FROM DemandesRestitution d WHERE d.traitee = :traitee")
    , @NamedQuery(name = "DemandesRestitution.findByNumPieceReg", query = "SELECT d FROM DemandesRestitution d WHERE d.numPieceReg = :numPieceReg")
    , @NamedQuery(name = "DemandesRestitution.findByNumeroCBDepart", query = "SELECT d FROM DemandesRestitution d WHERE d.numeroCBDepart = :numeroCBDepart")
    , @NamedQuery(name = "DemandesRestitution.findByNumeroCBDest", query = "SELECT d FROM DemandesRestitution d WHERE d.numeroCBDest = :numeroCBDest")
    , @NamedQuery(name = "DemandesRestitution.findByDetenuePar", query = "SELECT d FROM DemandesRestitution d WHERE d.detenuePar = :detenuePar")
    , @NamedQuery(name = "DemandesRestitution.findByDateTransfert", query = "SELECT d FROM DemandesRestitution d WHERE d.dateTransfert = :dateTransfert")
    , @NamedQuery(name = "DemandesRestitution.findByDateDecaissement", query = "SELECT d FROM DemandesRestitution d WHERE d.dateDecaissement = :dateDecaissement")
    , @NamedQuery(name = "DemandesRestitution.findByGestion", query = "SELECT d FROM DemandesRestitution d WHERE d.gestion = :gestion")})
public class DemandesRestitution implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "MONTANT")
    private BigDecimal montant;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDEtablissementFinancierDepart")
    private int iDEtablissementFinancierDepart;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "OBSERVATION")
    private String observation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumOR")
    private String numOR;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_DEM_REST")
    private Long codeDemRest;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Caissier")
    private long caissier;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSYS_Mode")
    private int iDSYSMode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDEC_Restitution")
    private int iDDECRestitution;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDEC_Reception")
    private int iDDECReception;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDOrdresDePaiement")
    private int iDOrdresDePaiement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDMANDATAIRES")
    private int idmandataires;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDEtablissementFinancierDest")
    private int iDEtablissementFinancierDest;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Traitee")
    private short traitee;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumPieceReg")
    private String numPieceReg;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumeroCBDepart")
    private String numeroCBDepart;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumeroCBDest")
    private String numeroCBDest;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DetenuePar")
    private int detenuePar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateTransfert")
    @Temporal(TemporalType.DATE)
    private Date dateTransfert;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateDecaissement")
    @Temporal(TemporalType.DATE)
    private Date dateDecaissement;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "IDNATUREOPERATION", referencedColumnName = "IDNATUREOPERATION")
    @ManyToOne(optional = false)
    private DecNatureoperation idnatureoperation;
    @JoinColumn(name = "NumTiers", referencedColumnName = "NumTiers")
    @ManyToOne(optional = false)
    private Tiers numTiers;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeDemRest")
    private List<RestitutionSurAffraire> restitutionSurAffraireList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeDemRest")
    private List<DecAutorisationderestitution> decAutorisationderestitutionList;

    public DemandesRestitution() {
    }

    public DemandesRestitution(Long codeDemRest) {
        this.codeDemRest = codeDemRest;
    }

    public DemandesRestitution(Long codeDemRest, Date date, BigDecimal montant, int iDEtablissementFinancierDepart, String observation, String numOR, long caissier, int iDSYSMode, int iDDECRestitution, int iDDECReception, int iDOrdresDePaiement, int idmandataires, int iDEtablissementFinancierDest, short traitee, String numPieceReg, String numeroCBDepart, String numeroCBDest, int detenuePar, Date dateTransfert, Date dateDecaissement) {
        this.codeDemRest = codeDemRest;
        this.date = date;
        this.montant = montant;
        this.iDEtablissementFinancierDepart = iDEtablissementFinancierDepart;
        this.observation = observation;
        this.numOR = numOR;
        this.caissier = caissier;
        this.iDSYSMode = iDSYSMode;
        this.iDDECRestitution = iDDECRestitution;
        this.iDDECReception = iDDECReception;
        this.iDOrdresDePaiement = iDOrdresDePaiement;
        this.idmandataires = idmandataires;
        this.iDEtablissementFinancierDest = iDEtablissementFinancierDest;
        this.traitee = traitee;
        this.numPieceReg = numPieceReg;
        this.numeroCBDepart = numeroCBDepart;
        this.numeroCBDest = numeroCBDest;
        this.detenuePar = detenuePar;
        this.dateTransfert = dateTransfert;
        this.dateDecaissement = dateDecaissement;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public int getIDEtablissementFinancierDepart() {
        return iDEtablissementFinancierDepart;
    }

    public void setIDEtablissementFinancierDepart(int iDEtablissementFinancierDepart) {
        this.iDEtablissementFinancierDepart = iDEtablissementFinancierDepart;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getNumOR() {
        return numOR;
    }

    public void setNumOR(String numOR) {
        this.numOR = numOR;
    }

    public Long getCodeDemRest() {
        return codeDemRest;
    }

    public void setCodeDemRest(Long codeDemRest) {
        this.codeDemRest = codeDemRest;
    }

    public long getCaissier() {
        return caissier;
    }

    public void setCaissier(long caissier) {
        this.caissier = caissier;
    }

    public int getIDSYSMode() {
        return iDSYSMode;
    }

    public void setIDSYSMode(int iDSYSMode) {
        this.iDSYSMode = iDSYSMode;
    }

    public int getIDDECRestitution() {
        return iDDECRestitution;
    }

    public void setIDDECRestitution(int iDDECRestitution) {
        this.iDDECRestitution = iDDECRestitution;
    }

    public int getIDDECReception() {
        return iDDECReception;
    }

    public void setIDDECReception(int iDDECReception) {
        this.iDDECReception = iDDECReception;
    }

    public int getIDOrdresDePaiement() {
        return iDOrdresDePaiement;
    }

    public void setIDOrdresDePaiement(int iDOrdresDePaiement) {
        this.iDOrdresDePaiement = iDOrdresDePaiement;
    }

    public int getIdmandataires() {
        return idmandataires;
    }

    public void setIdmandataires(int idmandataires) {
        this.idmandataires = idmandataires;
    }

    public int getIDEtablissementFinancierDest() {
        return iDEtablissementFinancierDest;
    }

    public void setIDEtablissementFinancierDest(int iDEtablissementFinancierDest) {
        this.iDEtablissementFinancierDest = iDEtablissementFinancierDest;
    }

    public short getTraitee() {
        return traitee;
    }

    public void setTraitee(short traitee) {
        this.traitee = traitee;
    }

    public String getNumPieceReg() {
        return numPieceReg;
    }

    public void setNumPieceReg(String numPieceReg) {
        this.numPieceReg = numPieceReg;
    }

    public String getNumeroCBDepart() {
        return numeroCBDepart;
    }

    public void setNumeroCBDepart(String numeroCBDepart) {
        this.numeroCBDepart = numeroCBDepart;
    }

    public String getNumeroCBDest() {
        return numeroCBDest;
    }

    public void setNumeroCBDest(String numeroCBDest) {
        this.numeroCBDest = numeroCBDest;
    }

    public int getDetenuePar() {
        return detenuePar;
    }

    public void setDetenuePar(int detenuePar) {
        this.detenuePar = detenuePar;
    }

    public Date getDateTransfert() {
        return dateTransfert;
    }

    public void setDateTransfert(Date dateTransfert) {
        this.dateTransfert = dateTransfert;
    }

    public Date getDateDecaissement() {
        return dateDecaissement;
    }

    public void setDateDecaissement(Date dateDecaissement) {
        this.dateDecaissement = dateDecaissement;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
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

    @XmlTransient
    public List<RestitutionSurAffraire> getRestitutionSurAffraireList() {
        return restitutionSurAffraireList;
    }

    public void setRestitutionSurAffraireList(List<RestitutionSurAffraire> restitutionSurAffraireList) {
        this.restitutionSurAffraireList = restitutionSurAffraireList;
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
        hash += (codeDemRest != null ? codeDemRest.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DemandesRestitution)) {
            return false;
        }
        DemandesRestitution other = (DemandesRestitution) object;
        if ((this.codeDemRest == null && other.codeDemRest != null) || (this.codeDemRest != null && !this.codeDemRest.equals(other.codeDemRest))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.DemandesRestitution[ codeDemRest=" + codeDemRest + " ]";
    }
    
}
