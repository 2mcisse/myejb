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
@Table(name = "pf_encaissements")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PfEncaissements.findAll", query = "SELECT p FROM PfEncaissements p")
    , @NamedQuery(name = "PfEncaissements.findByMontant", query = "SELECT p FROM PfEncaissements p WHERE p.montant = :montant")
    , @NamedQuery(name = "PfEncaissements.findByObservation", query = "SELECT p FROM PfEncaissements p WHERE p.observation = :observation")
    , @NamedQuery(name = "PfEncaissements.findByIDEtablissementFinancierDepart", query = "SELECT p FROM PfEncaissements p WHERE p.iDEtablissementFinancierDepart = :iDEtablissementFinancierDepart")
    , @NamedQuery(name = "PfEncaissements.findByNumTiers", query = "SELECT p FROM PfEncaissements p WHERE p.numTiers = :numTiers")
    , @NamedQuery(name = "PfEncaissements.findByCodeEnc", query = "SELECT p FROM PfEncaissements p WHERE p.codeEnc = :codeEnc")
    , @NamedQuery(name = "PfEncaissements.findByIDSYSMode", query = "SELECT p FROM PfEncaissements p WHERE p.iDSYSMode = :iDSYSMode")
    , @NamedQuery(name = "PfEncaissements.findByNumeroCBDepart", query = "SELECT p FROM PfEncaissements p WHERE p.numeroCBDepart = :numeroCBDepart")
    , @NamedQuery(name = "PfEncaissements.findByNumeroCBDest", query = "SELECT p FROM PfEncaissements p WHERE p.numeroCBDest = :numeroCBDest")
    , @NamedQuery(name = "PfEncaissements.findByDateEncaissement", query = "SELECT p FROM PfEncaissements p WHERE p.dateEncaissement = :dateEncaissement")
    , @NamedQuery(name = "PfEncaissements.findByTypes", query = "SELECT p FROM PfEncaissements p WHERE p.types = :types")
    , @NamedQuery(name = "PfEncaissements.findByMois", query = "SELECT p FROM PfEncaissements p WHERE p.mois = :mois")
    , @NamedQuery(name = "PfEncaissements.findByGestion", query = "SELECT p FROM PfEncaissements p WHERE p.gestion = :gestion")})
public class PfEncaissements implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "MONTANT")
    private BigDecimal montant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "OBSERVATION")
    private String observation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDEtablissementFinancierDepart")
    private int iDEtablissementFinancierDepart;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NumTiers")
    private long numTiers;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_ENC")
    private Long codeEnc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSYS_Mode")
    private int iDSYSMode;
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
    @Column(name = "DateEncaissement")
    @Temporal(TemporalType.DATE)
    private Date dateEncaissement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Types")
    private short types;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Mois")
    private short mois;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "IDNATURE_ENC", referencedColumnName = "IDNATURE_ENC")
    @ManyToOne(optional = false)
    private PfNatureEnc idnatureEnc;
    @JoinColumn(name = "IDTYPE_ENC", referencedColumnName = "IDTYPE_ENC")
    @ManyToOne(optional = false)
    private PfTypeEnc idtypeEnc;
    @JoinColumn(name = "IDDetailsArretes", referencedColumnName = "IDDetailsArretes")
    @ManyToOne(optional = false)
    private PfTableauAmo iDDetailsArretes;

    public PfEncaissements() {
    }

    public PfEncaissements(Long codeEnc) {
        this.codeEnc = codeEnc;
    }

    public PfEncaissements(Long codeEnc, BigDecimal montant, String observation, int iDEtablissementFinancierDepart, long numTiers, int iDSYSMode, String numeroCBDepart, String numeroCBDest, Date dateEncaissement, short types, short mois) {
        this.codeEnc = codeEnc;
        this.montant = montant;
        this.observation = observation;
        this.iDEtablissementFinancierDepart = iDEtablissementFinancierDepart;
        this.numTiers = numTiers;
        this.iDSYSMode = iDSYSMode;
        this.numeroCBDepart = numeroCBDepart;
        this.numeroCBDest = numeroCBDest;
        this.dateEncaissement = dateEncaissement;
        this.types = types;
        this.mois = mois;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public int getIDEtablissementFinancierDepart() {
        return iDEtablissementFinancierDepart;
    }

    public void setIDEtablissementFinancierDepart(int iDEtablissementFinancierDepart) {
        this.iDEtablissementFinancierDepart = iDEtablissementFinancierDepart;
    }

    public long getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(long numTiers) {
        this.numTiers = numTiers;
    }

    public Long getCodeEnc() {
        return codeEnc;
    }

    public void setCodeEnc(Long codeEnc) {
        this.codeEnc = codeEnc;
    }

    public int getIDSYSMode() {
        return iDSYSMode;
    }

    public void setIDSYSMode(int iDSYSMode) {
        this.iDSYSMode = iDSYSMode;
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

    public Date getDateEncaissement() {
        return dateEncaissement;
    }

    public void setDateEncaissement(Date dateEncaissement) {
        this.dateEncaissement = dateEncaissement;
    }

    public short getTypes() {
        return types;
    }

    public void setTypes(short types) {
        this.types = types;
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

    public PfNatureEnc getIdnatureEnc() {
        return idnatureEnc;
    }

    public void setIdnatureEnc(PfNatureEnc idnatureEnc) {
        this.idnatureEnc = idnatureEnc;
    }

    public PfTypeEnc getIdtypeEnc() {
        return idtypeEnc;
    }

    public void setIdtypeEnc(PfTypeEnc idtypeEnc) {
        this.idtypeEnc = idtypeEnc;
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
        hash += (codeEnc != null ? codeEnc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PfEncaissements)) {
            return false;
        }
        PfEncaissements other = (PfEncaissements) object;
        if ((this.codeEnc == null && other.codeEnc != null) || (this.codeEnc != null && !this.codeEnc.equals(other.codeEnc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.PfEncaissements[ codeEnc=" + codeEnc + " ]";
    }
    
}
