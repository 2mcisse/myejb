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
@Table(name = "ligne_bdo_ord_nv")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LigneBdoOrdNv.findAll", query = "SELECT l FROM LigneBdoOrdNv l")
    , @NamedQuery(name = "LigneBdoOrdNv.findByIdligneBdo", query = "SELECT l FROM LigneBdoOrdNv l WHERE l.idligneBdo = :idligneBdo")
    , @NamedQuery(name = "LigneBdoOrdNv.findByNOrdre", query = "SELECT l FROM LigneBdoOrdNv l WHERE l.nOrdre = :nOrdre")
    , @NamedQuery(name = "LigneBdoOrdNv.findByNPiece", query = "SELECT l FROM LigneBdoOrdNv l WHERE l.nPiece = :nPiece")
    , @NamedQuery(name = "LigneBdoOrdNv.findByReferencesTitres", query = "SELECT l FROM LigneBdoOrdNv l WHERE l.referencesTitres = :referencesTitres")
    , @NamedQuery(name = "LigneBdoOrdNv.findByGeneral", query = "SELECT l FROM LigneBdoOrdNv l WHERE l.general = :general")
    , @NamedQuery(name = "LigneBdoOrdNv.findByTiersRattache", query = "SELECT l FROM LigneBdoOrdNv l WHERE l.tiersRattache = :tiersRattache")
    , @NamedQuery(name = "LigneBdoOrdNv.findByDesignation", query = "SELECT l FROM LigneBdoOrdNv l WHERE l.designation = :designation")
    , @NamedQuery(name = "LigneBdoOrdNv.findByMontant", query = "SELECT l FROM LigneBdoOrdNv l WHERE l.montant = :montant")
    , @NamedQuery(name = "LigneBdoOrdNv.findByObservation", query = "SELECT l FROM LigneBdoOrdNv l WHERE l.observation = :observation")
    , @NamedQuery(name = "LigneBdoOrdNv.findByRefEcritures", query = "SELECT l FROM LigneBdoOrdNv l WHERE l.refEcritures = :refEcritures")
    , @NamedQuery(name = "LigneBdoOrdNv.findByReference", query = "SELECT l FROM LigneBdoOrdNv l WHERE l.reference = :reference")
    , @NamedQuery(name = "LigneBdoOrdNv.findByCODETItre", query = "SELECT l FROM LigneBdoOrdNv l WHERE l.cODETItre = :cODETItre")
    , @NamedQuery(name = "LigneBdoOrdNv.findByType", query = "SELECT l FROM LigneBdoOrdNv l WHERE l.type = :type")
    , @NamedQuery(name = "LigneBdoOrdNv.findByGestion", query = "SELECT l FROM LigneBdoOrdNv l WHERE l.gestion = :gestion")})
public class LigneBdoOrdNv implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDLIGNE_BDO")
    private Integer idligneBdo;
    @Column(name = "N_Ordre")
    private Integer nOrdre;
    @Column(name = "N_Piece")
    private Integer nPiece;
    @Size(max = 50)
    @Column(name = "ReferencesTitres")
    private String referencesTitres;
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
    @Column(name = "RefEcritures")
    private String refEcritures;
    @Size(max = 50)
    @Column(name = "Reference")
    private String reference;
    @Column(name = "CODE_TItre")
    private BigInteger cODETItre;
    @Column(name = "Type")
    private Short type;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;

    public LigneBdoOrdNv() {
    }

    public LigneBdoOrdNv(Integer idligneBdo) {
        this.idligneBdo = idligneBdo;
    }

    public Integer getIdligneBdo() {
        return idligneBdo;
    }

    public void setIdligneBdo(Integer idligneBdo) {
        this.idligneBdo = idligneBdo;
    }

    public Integer getNOrdre() {
        return nOrdre;
    }

    public void setNOrdre(Integer nOrdre) {
        this.nOrdre = nOrdre;
    }

    public Integer getNPiece() {
        return nPiece;
    }

    public void setNPiece(Integer nPiece) {
        this.nPiece = nPiece;
    }

    public String getReferencesTitres() {
        return referencesTitres;
    }

    public void setReferencesTitres(String referencesTitres) {
        this.referencesTitres = referencesTitres;
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

    public String getRefEcritures() {
        return refEcritures;
    }

    public void setRefEcritures(String refEcritures) {
        this.refEcritures = refEcritures;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public BigInteger getCODETItre() {
        return cODETItre;
    }

    public void setCODETItre(BigInteger cODETItre) {
        this.cODETItre = cODETItre;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
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
        if (!(object instanceof LigneBdoOrdNv)) {
            return false;
        }
        LigneBdoOrdNv other = (LigneBdoOrdNv) object;
        if ((this.idligneBdo == null && other.idligneBdo != null) || (this.idligneBdo != null && !this.idligneBdo.equals(other.idligneBdo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.LigneBdoOrdNv[ idligneBdo=" + idligneBdo + " ]";
    }
    
}
