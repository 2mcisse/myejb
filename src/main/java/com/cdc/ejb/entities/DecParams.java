/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "dec_params")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DecParams.findAll", query = "SELECT d FROM DecParams d")
    , @NamedQuery(name = "DecParams.findByIDParams", query = "SELECT d FROM DecParams d WHERE d.iDParams = :iDParams")
    , @NamedQuery(name = "DecParams.findByDelaiMiniSejour", query = "SELECT d FROM DecParams d WHERE d.delaiMiniSejour = :delaiMiniSejour")
    , @NamedQuery(name = "DecParams.findByChequeReception", query = "SELECT d FROM DecParams d WHERE d.chequeReception = :chequeReception")
    , @NamedQuery(name = "DecParams.findByChequeRestitution", query = "SELECT d FROM DecParams d WHERE d.chequeRestitution = :chequeRestitution")
    , @NamedQuery(name = "DecParams.findByNumeraireReception", query = "SELECT d FROM DecParams d WHERE d.numeraireReception = :numeraireReception")
    , @NamedQuery(name = "DecParams.findByNumeraireRestitution", query = "SELECT d FROM DecParams d WHERE d.numeraireRestitution = :numeraireRestitution")
    , @NamedQuery(name = "DecParams.findByVirementReception", query = "SELECT d FROM DecParams d WHERE d.virementReception = :virementReception")
    , @NamedQuery(name = "DecParams.findByVirementRestitution", query = "SELECT d FROM DecParams d WHERE d.virementRestitution = :virementRestitution")
    , @NamedQuery(name = "DecParams.findByChequeNCReception", query = "SELECT d FROM DecParams d WHERE d.chequeNCReception = :chequeNCReception")
    , @NamedQuery(name = "DecParams.findByChequeNCRestitution", query = "SELECT d FROM DecParams d WHERE d.chequeNCRestitution = :chequeNCRestitution")
    , @NamedQuery(name = "DecParams.findByTaux", query = "SELECT d FROM DecParams d WHERE d.taux = :taux")
    , @NamedQuery(name = "DecParams.findByAnneeJours", query = "SELECT d FROM DecParams d WHERE d.anneeJours = :anneeJours")
    , @NamedQuery(name = "DecParams.findByTva", query = "SELECT d FROM DecParams d WHERE d.tva = :tva")
    , @NamedQuery(name = "DecParams.findByIrc", query = "SELECT d FROM DecParams d WHERE d.irc = :irc")})
public class DecParams implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDParams")
    private Integer iDParams;
    @Column(name = "DelaiMiniSejour")
    private Integer delaiMiniSejour;
    @Column(name = "ChequeReception")
    private Integer chequeReception;
    @Column(name = "ChequeRestitution")
    private Integer chequeRestitution;
    @Column(name = "NumeraireReception")
    private Integer numeraireReception;
    @Column(name = "NumeraireRestitution")
    private Integer numeraireRestitution;
    @Column(name = "VirementReception")
    private Integer virementReception;
    @Column(name = "VirementRestitution")
    private Integer virementRestitution;
    @Column(name = "ChequeNCReception")
    private Integer chequeNCReception;
    @Column(name = "ChequeNCRestitution")
    private Integer chequeNCRestitution;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Taux")
    private Double taux;
    @Column(name = "AnneeJours")
    private Integer anneeJours;
    @Column(name = "TVA")
    private Integer tva;
    @Column(name = "IRC")
    private Integer irc;

    public DecParams() {
    }

    public DecParams(Integer iDParams) {
        this.iDParams = iDParams;
    }

    public Integer getIDParams() {
        return iDParams;
    }

    public void setIDParams(Integer iDParams) {
        this.iDParams = iDParams;
    }

    public Integer getDelaiMiniSejour() {
        return delaiMiniSejour;
    }

    public void setDelaiMiniSejour(Integer delaiMiniSejour) {
        this.delaiMiniSejour = delaiMiniSejour;
    }

    public Integer getChequeReception() {
        return chequeReception;
    }

    public void setChequeReception(Integer chequeReception) {
        this.chequeReception = chequeReception;
    }

    public Integer getChequeRestitution() {
        return chequeRestitution;
    }

    public void setChequeRestitution(Integer chequeRestitution) {
        this.chequeRestitution = chequeRestitution;
    }

    public Integer getNumeraireReception() {
        return numeraireReception;
    }

    public void setNumeraireReception(Integer numeraireReception) {
        this.numeraireReception = numeraireReception;
    }

    public Integer getNumeraireRestitution() {
        return numeraireRestitution;
    }

    public void setNumeraireRestitution(Integer numeraireRestitution) {
        this.numeraireRestitution = numeraireRestitution;
    }

    public Integer getVirementReception() {
        return virementReception;
    }

    public void setVirementReception(Integer virementReception) {
        this.virementReception = virementReception;
    }

    public Integer getVirementRestitution() {
        return virementRestitution;
    }

    public void setVirementRestitution(Integer virementRestitution) {
        this.virementRestitution = virementRestitution;
    }

    public Integer getChequeNCReception() {
        return chequeNCReception;
    }

    public void setChequeNCReception(Integer chequeNCReception) {
        this.chequeNCReception = chequeNCReception;
    }

    public Integer getChequeNCRestitution() {
        return chequeNCRestitution;
    }

    public void setChequeNCRestitution(Integer chequeNCRestitution) {
        this.chequeNCRestitution = chequeNCRestitution;
    }

    public Double getTaux() {
        return taux;
    }

    public void setTaux(Double taux) {
        this.taux = taux;
    }

    public Integer getAnneeJours() {
        return anneeJours;
    }

    public void setAnneeJours(Integer anneeJours) {
        this.anneeJours = anneeJours;
    }

    public Integer getTva() {
        return tva;
    }

    public void setTva(Integer tva) {
        this.tva = tva;
    }

    public Integer getIrc() {
        return irc;
    }

    public void setIrc(Integer irc) {
        this.irc = irc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDParams != null ? iDParams.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DecParams)) {
            return false;
        }
        DecParams other = (DecParams) object;
        if ((this.iDParams == null && other.iDParams != null) || (this.iDParams != null && !this.iDParams.equals(other.iDParams))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.DecParams[ iDParams=" + iDParams + " ]";
    }
    
}
