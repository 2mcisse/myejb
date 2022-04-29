/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
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
@Table(name = "pf_tableau_amo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PfTableauAmo.findAll", query = "SELECT p FROM PfTableauAmo p")
    , @NamedQuery(name = "PfTableauAmo.findByIDDetailsArretes", query = "SELECT p FROM PfTableauAmo p WHERE p.iDDetailsArretes = :iDDetailsArretes")
    , @NamedQuery(name = "PfTableauAmo.findByNombreDeJours", query = "SELECT p FROM PfTableauAmo p WHERE p.nombreDeJours = :nombreDeJours")
    , @NamedQuery(name = "PfTableauAmo.findByMontantInterets", query = "SELECT p FROM PfTableauAmo p WHERE p.montantInterets = :montantInterets")
    , @NamedQuery(name = "PfTableauAmo.findByDateOperation", query = "SELECT p FROM PfTableauAmo p WHERE p.dateOperation = :dateOperation")
    , @NamedQuery(name = "PfTableauAmo.findByLibelleOperation", query = "SELECT p FROM PfTableauAmo p WHERE p.libelleOperation = :libelleOperation")
    , @NamedQuery(name = "PfTableauAmo.findByMontantTVA", query = "SELECT p FROM PfTableauAmo p WHERE p.montantTVA = :montantTVA")
    , @NamedQuery(name = "PfTableauAmo.findByMontantIRC", query = "SELECT p FROM PfTableauAmo p WHERE p.montantIRC = :montantIRC")
    , @NamedQuery(name = "PfTableauAmo.findByObligationsVivantes", query = "SELECT p FROM PfTableauAmo p WHERE p.obligationsVivantes = :obligationsVivantes")
    , @NamedQuery(name = "PfTableauAmo.findByAnnuites", query = "SELECT p FROM PfTableauAmo p WHERE p.annuites = :annuites")
    , @NamedQuery(name = "PfTableauAmo.findByAmortTheorique", query = "SELECT p FROM PfTableauAmo p WHERE p.amortTheorique = :amortTheorique")
    , @NamedQuery(name = "PfTableauAmo.findByAmortReel", query = "SELECT p FROM PfTableauAmo p WHERE p.amortReel = :amortReel")
    , @NamedQuery(name = "PfTableauAmo.findByNbreObjectRembourse", query = "SELECT p FROM PfTableauAmo p WHERE p.nbreObjectRembourse = :nbreObjectRembourse")
    , @NamedQuery(name = "PfTableauAmo.findByReliquat", query = "SELECT p FROM PfTableauAmo p WHERE p.reliquat = :reliquat")
    , @NamedQuery(name = "PfTableauAmo.findByNumOrdre", query = "SELECT p FROM PfTableauAmo p WHERE p.numOrdre = :numOrdre")
    , @NamedQuery(name = "PfTableauAmo.findByMntDebut", query = "SELECT p FROM PfTableauAmo p WHERE p.mntDebut = :mntDebut")
    , @NamedQuery(name = "PfTableauAmo.findByLeveeDAT", query = "SELECT p FROM PfTableauAmo p WHERE p.leveeDAT = :leveeDAT")
    , @NamedQuery(name = "PfTableauAmo.findByGestion", query = "SELECT p FROM PfTableauAmo p WHERE p.gestion = :gestion")})
public class PfTableauAmo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDetailsArretes")
    private Integer iDDetailsArretes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NombreDeJours")
    private int nombreDeJours;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MontantInterets")
    private int montantInterets;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateOperation")
    @Temporal(TemporalType.DATE)
    private Date dateOperation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "LibelleOperation")
    private String libelleOperation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MontantTVA")
    private long montantTVA;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MontantIRC")
    private long montantIRC;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ObligationsVivantes")
    private long obligationsVivantes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Annuites")
    private long annuites;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AmortTheorique")
    private long amortTheorique;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AmortReel")
    private long amortReel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NbreObjectRembourse")
    private long nbreObjectRembourse;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Reliquat")
    private int reliquat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NumOrdre")
    private int numOrdre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MntDebut")
    private long mntDebut;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LeveeDAT")
    private long leveeDAT;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDDetailsArretes")
    private List<PfDecaissements> pfDecaissementsList;
    @JoinColumn(name = "IDNATURE_ENC", referencedColumnName = "IDNATURE_ENC")
    @ManyToOne(optional = false)
    private PfNatureEnc idnatureEnc;
    @JoinColumn(name = "IDNATURE_DEC", referencedColumnName = "IDNATURE_DEC")
    @ManyToOne(optional = false)
    private PfNatureDec idnatureDec;
    @JoinColumn(name = "IDTYPE_ENC", referencedColumnName = "IDTYPE_ENC")
    @ManyToOne(optional = false)
    private PfTypeEnc idtypeEnc;
    @JoinColumn(name = "IDPF_SUPPORTS", referencedColumnName = "IDPF_SUPPORTS")
    @ManyToOne(optional = false)
    private PfSupports idpfSupports;
    @JoinColumn(name = "IDTYPE_DEC", referencedColumnName = "IDTYPE_DEC")
    @ManyToOne(optional = false)
    private PfTypeDec idtypeDec;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDDetailsArretes")
    private List<PfEncaissements> pfEncaissementsList;

    public PfTableauAmo() {
    }

    public PfTableauAmo(Integer iDDetailsArretes) {
        this.iDDetailsArretes = iDDetailsArretes;
    }

    public PfTableauAmo(Integer iDDetailsArretes, int nombreDeJours, int montantInterets, Date dateOperation, String libelleOperation, long montantTVA, long montantIRC, long obligationsVivantes, long annuites, long amortTheorique, long amortReel, long nbreObjectRembourse, int reliquat, int numOrdre, long mntDebut, long leveeDAT) {
        this.iDDetailsArretes = iDDetailsArretes;
        this.nombreDeJours = nombreDeJours;
        this.montantInterets = montantInterets;
        this.dateOperation = dateOperation;
        this.libelleOperation = libelleOperation;
        this.montantTVA = montantTVA;
        this.montantIRC = montantIRC;
        this.obligationsVivantes = obligationsVivantes;
        this.annuites = annuites;
        this.amortTheorique = amortTheorique;
        this.amortReel = amortReel;
        this.nbreObjectRembourse = nbreObjectRembourse;
        this.reliquat = reliquat;
        this.numOrdre = numOrdre;
        this.mntDebut = mntDebut;
        this.leveeDAT = leveeDAT;
    }

    public Integer getIDDetailsArretes() {
        return iDDetailsArretes;
    }

    public void setIDDetailsArretes(Integer iDDetailsArretes) {
        this.iDDetailsArretes = iDDetailsArretes;
    }

    public int getNombreDeJours() {
        return nombreDeJours;
    }

    public void setNombreDeJours(int nombreDeJours) {
        this.nombreDeJours = nombreDeJours;
    }

    public int getMontantInterets() {
        return montantInterets;
    }

    public void setMontantInterets(int montantInterets) {
        this.montantInterets = montantInterets;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public String getLibelleOperation() {
        return libelleOperation;
    }

    public void setLibelleOperation(String libelleOperation) {
        this.libelleOperation = libelleOperation;
    }

    public long getMontantTVA() {
        return montantTVA;
    }

    public void setMontantTVA(long montantTVA) {
        this.montantTVA = montantTVA;
    }

    public long getMontantIRC() {
        return montantIRC;
    }

    public void setMontantIRC(long montantIRC) {
        this.montantIRC = montantIRC;
    }

    public long getObligationsVivantes() {
        return obligationsVivantes;
    }

    public void setObligationsVivantes(long obligationsVivantes) {
        this.obligationsVivantes = obligationsVivantes;
    }

    public long getAnnuites() {
        return annuites;
    }

    public void setAnnuites(long annuites) {
        this.annuites = annuites;
    }

    public long getAmortTheorique() {
        return amortTheorique;
    }

    public void setAmortTheorique(long amortTheorique) {
        this.amortTheorique = amortTheorique;
    }

    public long getAmortReel() {
        return amortReel;
    }

    public void setAmortReel(long amortReel) {
        this.amortReel = amortReel;
    }

    public long getNbreObjectRembourse() {
        return nbreObjectRembourse;
    }

    public void setNbreObjectRembourse(long nbreObjectRembourse) {
        this.nbreObjectRembourse = nbreObjectRembourse;
    }

    public int getReliquat() {
        return reliquat;
    }

    public void setReliquat(int reliquat) {
        this.reliquat = reliquat;
    }

    public int getNumOrdre() {
        return numOrdre;
    }

    public void setNumOrdre(int numOrdre) {
        this.numOrdre = numOrdre;
    }

    public long getMntDebut() {
        return mntDebut;
    }

    public void setMntDebut(long mntDebut) {
        this.mntDebut = mntDebut;
    }

    public long getLeveeDAT() {
        return leveeDAT;
    }

    public void setLeveeDAT(long leveeDAT) {
        this.leveeDAT = leveeDAT;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<PfDecaissements> getPfDecaissementsList() {
        return pfDecaissementsList;
    }

    public void setPfDecaissementsList(List<PfDecaissements> pfDecaissementsList) {
        this.pfDecaissementsList = pfDecaissementsList;
    }

    public PfNatureEnc getIdnatureEnc() {
        return idnatureEnc;
    }

    public void setIdnatureEnc(PfNatureEnc idnatureEnc) {
        this.idnatureEnc = idnatureEnc;
    }

    public PfNatureDec getIdnatureDec() {
        return idnatureDec;
    }

    public void setIdnatureDec(PfNatureDec idnatureDec) {
        this.idnatureDec = idnatureDec;
    }

    public PfTypeEnc getIdtypeEnc() {
        return idtypeEnc;
    }

    public void setIdtypeEnc(PfTypeEnc idtypeEnc) {
        this.idtypeEnc = idtypeEnc;
    }

    public PfSupports getIdpfSupports() {
        return idpfSupports;
    }

    public void setIdpfSupports(PfSupports idpfSupports) {
        this.idpfSupports = idpfSupports;
    }

    public PfTypeDec getIdtypeDec() {
        return idtypeDec;
    }

    public void setIdtypeDec(PfTypeDec idtypeDec) {
        this.idtypeDec = idtypeDec;
    }

    @XmlTransient
    public List<PfEncaissements> getPfEncaissementsList() {
        return pfEncaissementsList;
    }

    public void setPfEncaissementsList(List<PfEncaissements> pfEncaissementsList) {
        this.pfEncaissementsList = pfEncaissementsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDDetailsArretes != null ? iDDetailsArretes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PfTableauAmo)) {
            return false;
        }
        PfTableauAmo other = (PfTableauAmo) object;
        if ((this.iDDetailsArretes == null && other.iDDetailsArretes != null) || (this.iDDetailsArretes != null && !this.iDDetailsArretes.equals(other.iDDetailsArretes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.PfTableauAmo[ iDDetailsArretes=" + iDDetailsArretes + " ]";
    }
    
}
