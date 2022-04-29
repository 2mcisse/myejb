/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "ligne_bdo_liq")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LigneBdoLiq.findAll", query = "SELECT l FROM LigneBdoLiq l")
    , @NamedQuery(name = "LigneBdoLiq.findByIdligneBdo", query = "SELECT l FROM LigneBdoLiq l WHERE l.idligneBdo = :idligneBdo")
    , @NamedQuery(name = "LigneBdoLiq.findByNOrdre", query = "SELECT l FROM LigneBdoLiq l WHERE l.nOrdre = :nOrdre")
    , @NamedQuery(name = "LigneBdoLiq.findByNPiece", query = "SELECT l FROM LigneBdoLiq l WHERE l.nPiece = :nPiece")
    , @NamedQuery(name = "LigneBdoLiq.findByGeneral", query = "SELECT l FROM LigneBdoLiq l WHERE l.general = :general")
    , @NamedQuery(name = "LigneBdoLiq.findByTiersRattache", query = "SELECT l FROM LigneBdoLiq l WHERE l.tiersRattache = :tiersRattache")
    , @NamedQuery(name = "LigneBdoLiq.findByDesignation", query = "SELECT l FROM LigneBdoLiq l WHERE l.designation = :designation")
    , @NamedQuery(name = "LigneBdoLiq.findByMontant", query = "SELECT l FROM LigneBdoLiq l WHERE l.montant = :montant")
    , @NamedQuery(name = "LigneBdoLiq.findByObservation", query = "SELECT l FROM LigneBdoLiq l WHERE l.observation = :observation")
    , @NamedQuery(name = "LigneBdoLiq.findByReference", query = "SELECT l FROM LigneBdoLiq l WHERE l.reference = :reference")
    , @NamedQuery(name = "LigneBdoLiq.findByCodeTitre", query = "SELECT l FROM LigneBdoLiq l WHERE l.codeTitre = :codeTitre")
    , @NamedQuery(name = "LigneBdoLiq.findByGestion", query = "SELECT l FROM LigneBdoLiq l WHERE l.gestion = :gestion")})
public class LigneBdoLiq implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDLIGNE_BDO")
    private Integer idligneBdo;
    @Size(max = 50)
    @Column(name = "N_Ordre")
    private String nOrdre;
    @Column(name = "N_Piece")
    private Integer nPiece;
    @Size(max = 50)
    @Column(name = "General")
    private String general;
    @Size(max = 50)
    @Column(name = "TiersRattache")
    private String tiersRattache;
    @Size(max = 150)
    @Column(name = "Designation")
    private String designation;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Montant")
    private BigDecimal montant;
    @Size(max = 200)
    @Column(name = "OBSERVATION")
    private String observation;
    @Size(max = 50)
    @Column(name = "Reference")
    private String reference;
    @Column(name = "Code_Titre")
    private BigInteger codeTitre;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;

    public LigneBdoLiq() {
    }

    public LigneBdoLiq(Integer idligneBdo) {
        this.idligneBdo = idligneBdo;
    }

    public Integer getIdligneBdo() {
        return idligneBdo;
    }

    public void setIdligneBdo(Integer idligneBdo) {
        this.idligneBdo = idligneBdo;
    }

    public String getNOrdre() {
        return nOrdre;
    }

    public void setNOrdre(String nOrdre) {
        this.nOrdre = nOrdre;
    }

    public Integer getNPiece() {
        return nPiece;
    }

    public void setNPiece(Integer nPiece) {
        this.nPiece = nPiece;
    }

    public String getGeneral() {
        return general;
    }

    public void setGeneral(String general) {
        this.general = general;
    }

    public String getTiersRattache() {
        return tiersRattache;
    }

    public void setTiersRattache(String tiersRattache) {
        this.tiersRattache = tiersRattache;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
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

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public BigInteger getCodeTitre() {
        return codeTitre;
    }

    public void setCodeTitre(BigInteger codeTitre) {
        this.codeTitre = codeTitre;
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
        hash += (idligneBdo != null ? idligneBdo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LigneBdoLiq)) {
            return false;
        }
        LigneBdoLiq other = (LigneBdoLiq) object;
        if ((this.idligneBdo == null && other.idligneBdo != null) || (this.idligneBdo != null && !this.idligneBdo.equals(other.idligneBdo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.LigneBdoLiq[ idligneBdo=" + idligneBdo + " ]";
    }
    
}
