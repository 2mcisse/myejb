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
@Table(name = "pf_decaissements")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PfDecaissements.findAll", query = "SELECT p FROM PfDecaissements p")
    , @NamedQuery(name = "PfDecaissements.findByMontant", query = "SELECT p FROM PfDecaissements p WHERE p.montant = :montant")
    , @NamedQuery(name = "PfDecaissements.findByIDEtablissementFinancierDepart", query = "SELECT p FROM PfDecaissements p WHERE p.iDEtablissementFinancierDepart = :iDEtablissementFinancierDepart")
    , @NamedQuery(name = "PfDecaissements.findByObservation", query = "SELECT p FROM PfDecaissements p WHERE p.observation = :observation")
    , @NamedQuery(name = "PfDecaissements.findByNumTiers", query = "SELECT p FROM PfDecaissements p WHERE p.numTiers = :numTiers")
    , @NamedQuery(name = "PfDecaissements.findByCodeDec", query = "SELECT p FROM PfDecaissements p WHERE p.codeDec = :codeDec")
    , @NamedQuery(name = "PfDecaissements.findByIDSYSMode", query = "SELECT p FROM PfDecaissements p WHERE p.iDSYSMode = :iDSYSMode")
    , @NamedQuery(name = "PfDecaissements.findByIDEtablissementFinancierDest", query = "SELECT p FROM PfDecaissements p WHERE p.iDEtablissementFinancierDest = :iDEtablissementFinancierDest")
    , @NamedQuery(name = "PfDecaissements.findByNumeroCBDepart", query = "SELECT p FROM PfDecaissements p WHERE p.numeroCBDepart = :numeroCBDepart")
    , @NamedQuery(name = "PfDecaissements.findByNumeroCBDest", query = "SELECT p FROM PfDecaissements p WHERE p.numeroCBDest = :numeroCBDest")
    , @NamedQuery(name = "PfDecaissements.findByTypes", query = "SELECT p FROM PfDecaissements p WHERE p.types = :types")
    , @NamedQuery(name = "PfDecaissements.findByDateDecaissement", query = "SELECT p FROM PfDecaissements p WHERE p.dateDecaissement = :dateDecaissement")
    , @NamedQuery(name = "PfDecaissements.findByMois", query = "SELECT p FROM PfDecaissements p WHERE p.mois = :mois")
    , @NamedQuery(name = "PfDecaissements.findByGestion", query = "SELECT p FROM PfDecaissements p WHERE p.gestion = :gestion")})
public class PfDecaissements implements Serializable {

    private static final long serialVersionUID = 1L;
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
    @Column(name = "NumTiers")
    private long numTiers;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_DEC")
    private Long codeDec;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSYS_Mode")
    private int iDSYSMode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDEtablissementFinancierDest")
    private int iDEtablissementFinancierDest;
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
    @Column(name = "Types")
    private short types;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateDecaissement")
    @Temporal(TemporalType.DATE)
    private Date dateDecaissement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Mois")
    private short mois;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "IDTYPE_DEC", referencedColumnName = "IDTYPE_DEC")
    @ManyToOne(optional = false)
    private PfTypeDec idtypeDec;
    @JoinColumn(name = "IDNATURE_DEC", referencedColumnName = "IDNATURE_DEC")
    @ManyToOne(optional = false)
    private PfNatureDec idnatureDec;
    @JoinColumn(name = "IDDetailsArretes", referencedColumnName = "IDDetailsArretes")
    @ManyToOne(optional = false)
    private PfTableauAmo iDDetailsArretes;

    public PfDecaissements() {
    }

    public PfDecaissements(Long codeDec) {
        this.codeDec = codeDec;
    }

    public PfDecaissements(Long codeDec, BigDecimal montant, int iDEtablissementFinancierDepart, String observation, long numTiers, int iDSYSMode, int iDEtablissementFinancierDest, String numeroCBDepart, String numeroCBDest, short types, Date dateDecaissement, short mois) {
        this.codeDec = codeDec;
        this.montant = montant;
        this.iDEtablissementFinancierDepart = iDEtablissementFinancierDepart;
        this.observation = observation;
        this.numTiers = numTiers;
        this.iDSYSMode = iDSYSMode;
        this.iDEtablissementFinancierDest = iDEtablissementFinancierDest;
        this.numeroCBDepart = numeroCBDepart;
        this.numeroCBDest = numeroCBDest;
        this.types = types;
        this.dateDecaissement = dateDecaissement;
        this.mois = mois;
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

    public long getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(long numTiers) {
        this.numTiers = numTiers;
    }

    public Long getCodeDec() {
        return codeDec;
    }

    public void setCodeDec(Long codeDec) {
        this.codeDec = codeDec;
    }

    public int getIDSYSMode() {
        return iDSYSMode;
    }

    public void setIDSYSMode(int iDSYSMode) {
        this.iDSYSMode = iDSYSMode;
    }

    public int getIDEtablissementFinancierDest() {
        return iDEtablissementFinancierDest;
    }

    public void setIDEtablissementFinancierDest(int iDEtablissementFinancierDest) {
        this.iDEtablissementFinancierDest = iDEtablissementFinancierDest;
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

    public short getTypes() {
        return types;
    }

    public void setTypes(short types) {
        this.types = types;
    }

    public Date getDateDecaissement() {
        return dateDecaissement;
    }

    public void setDateDecaissement(Date dateDecaissement) {
        this.dateDecaissement = dateDecaissement;
    }

    public short getMois() {
        return mois;
    }

    public void setMois(short mois) {
        this.mois = mois;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public PfTypeDec getIdtypeDec() {
        return idtypeDec;
    }

    public void setIdtypeDec(PfTypeDec idtypeDec) {
        this.idtypeDec = idtypeDec;
    }

    public PfNatureDec getIdnatureDec() {
        return idnatureDec;
    }

    public void setIdnatureDec(PfNatureDec idnatureDec) {
        this.idnatureDec = idnatureDec;
    }

    public PfTableauAmo getIDDetailsArretes() {
        return iDDetailsArretes;
    }

    public void setIDDetailsArretes(PfTableauAmo iDDetailsArretes) {
        this.iDDetailsArretes = iDDetailsArretes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeDec != null ? codeDec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PfDecaissements)) {
            return false;
        }
        PfDecaissements other = (PfDecaissements) object;
        if ((this.codeDec == null && other.codeDec != null) || (this.codeDec != null && !this.codeDec.equals(other.codeDec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.PfDecaissements[ codeDec=" + codeDec + " ]";
    }
    
}
