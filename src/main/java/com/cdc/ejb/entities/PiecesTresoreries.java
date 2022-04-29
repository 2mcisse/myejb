/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "pieces_tresoreries")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PiecesTresoreries.findAll", query = "SELECT p FROM PiecesTresoreries p")
    , @NamedQuery(name = "PiecesTresoreries.findByIdpiecesTresoreries", query = "SELECT p FROM PiecesTresoreries p WHERE p.idpiecesTresoreries = :idpiecesTresoreries")
    , @NamedQuery(name = "PiecesTresoreries.findByNumeroPieceDepart", query = "SELECT p FROM PiecesTresoreries p WHERE p.numeroPieceDepart = :numeroPieceDepart")
    , @NamedQuery(name = "PiecesTresoreries.findByDatePiece", query = "SELECT p FROM PiecesTresoreries p WHERE p.datePiece = :datePiece")
    , @NamedQuery(name = "PiecesTresoreries.findByCertifie", query = "SELECT p FROM PiecesTresoreries p WHERE p.certifie = :certifie")
    , @NamedQuery(name = "PiecesTresoreries.findByValider", query = "SELECT p FROM PiecesTresoreries p WHERE p.valider = :valider")
    , @NamedQuery(name = "PiecesTresoreries.findByNature", query = "SELECT p FROM PiecesTresoreries p WHERE p.nature = :nature")
    , @NamedQuery(name = "PiecesTresoreries.findByCodePiece", query = "SELECT p FROM PiecesTresoreries p WHERE p.codePiece = :codePiece")
    , @NamedQuery(name = "PiecesTresoreries.findByIDEtablissementFinancierDest", query = "SELECT p FROM PiecesTresoreries p WHERE p.iDEtablissementFinancierDest = :iDEtablissementFinancierDest")
    , @NamedQuery(name = "PiecesTresoreries.findByNumeroPieceDest", query = "SELECT p FROM PiecesTresoreries p WHERE p.numeroPieceDest = :numeroPieceDest")
    , @NamedQuery(name = "PiecesTresoreries.findByCodeDemRest", query = "SELECT p FROM PiecesTresoreries p WHERE p.codeDemRest = :codeDemRest")
    , @NamedQuery(name = "PiecesTresoreries.findByGestion", query = "SELECT p FROM PiecesTresoreries p WHERE p.gestion = :gestion")})
public class PiecesTresoreries implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPIECES_TRESORERIES")
    private Integer idpiecesTresoreries;
    @Size(max = 50)
    @Column(name = "NumeroPieceDepart")
    private String numeroPieceDepart;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DatePiece")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datePiece;
    @Column(name = "certifie")
    private Short certifie;
    @Column(name = "Valider")
    private Short valider;
    @Column(name = "Nature")
    private Short nature;
    @Column(name = "CODE_PIECE")
    private Integer codePiece;
    @Column(name = "IDEtablissementFinancierDest")
    private Integer iDEtablissementFinancierDest;
    @Size(max = 50)
    @Column(name = "NumeroPieceDest")
    private String numeroPieceDest;
    @Column(name = "CODE_DEM_REST")
    private BigInteger codeDemRest;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "CODE_DEC", referencedColumnName = "CODE_DEC")
    @ManyToOne
    private Decaissements codeDec;
    @JoinColumn(name = "CODE_ENC", referencedColumnName = "CODE_ENC")
    @ManyToOne
    private Encaissements codeEnc;
    @JoinColumn(name = "IDEtablissementFinancierDepart", referencedColumnName = "IDEtablissementFinancier")
    @ManyToOne
    private Etablissementfinancier iDEtablissementFinancierDepart;

    public PiecesTresoreries() {
    }

    public PiecesTresoreries(Integer idpiecesTresoreries) {
        this.idpiecesTresoreries = idpiecesTresoreries;
    }

    public PiecesTresoreries(Integer idpiecesTresoreries, Date datePiece) {
        this.idpiecesTresoreries = idpiecesTresoreries;
        this.datePiece = datePiece;
    }

    public Integer getIdpiecesTresoreries() {
        return idpiecesTresoreries;
    }

    public void setIdpiecesTresoreries(Integer idpiecesTresoreries) {
        this.idpiecesTresoreries = idpiecesTresoreries;
    }

    public String getNumeroPieceDepart() {
        return numeroPieceDepart;
    }

    public void setNumeroPieceDepart(String numeroPieceDepart) {
        this.numeroPieceDepart = numeroPieceDepart;
    }

    public Date getDatePiece() {
        return datePiece;
    }

    public void setDatePiece(Date datePiece) {
        this.datePiece = datePiece;
    }

    public Short getCertifie() {
        return certifie;
    }

    public void setCertifie(Short certifie) {
        this.certifie = certifie;
    }

    public Short getValider() {
        return valider;
    }

    public void setValider(Short valider) {
        this.valider = valider;
    }

    public Short getNature() {
        return nature;
    }

    public void setNature(Short nature) {
        this.nature = nature;
    }

    public Integer getCodePiece() {
        return codePiece;
    }

    public void setCodePiece(Integer codePiece) {
        this.codePiece = codePiece;
    }

    public Integer getIDEtablissementFinancierDest() {
        return iDEtablissementFinancierDest;
    }

    public void setIDEtablissementFinancierDest(Integer iDEtablissementFinancierDest) {
        this.iDEtablissementFinancierDest = iDEtablissementFinancierDest;
    }

    public String getNumeroPieceDest() {
        return numeroPieceDest;
    }

    public void setNumeroPieceDest(String numeroPieceDest) {
        this.numeroPieceDest = numeroPieceDest;
    }

    public BigInteger getCodeDemRest() {
        return codeDemRest;
    }

    public void setCodeDemRest(BigInteger codeDemRest) {
        this.codeDemRest = codeDemRest;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public Decaissements getCodeDec() {
        return codeDec;
    }

    public void setCodeDec(Decaissements codeDec) {
        this.codeDec = codeDec;
    }

    public Encaissements getCodeEnc() {
        return codeEnc;
    }

    public void setCodeEnc(Encaissements codeEnc) {
        this.codeEnc = codeEnc;
    }

    public Etablissementfinancier getIDEtablissementFinancierDepart() {
        return iDEtablissementFinancierDepart;
    }

    public void setIDEtablissementFinancierDepart(Etablissementfinancier iDEtablissementFinancierDepart) {
        this.iDEtablissementFinancierDepart = iDEtablissementFinancierDepart;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpiecesTresoreries != null ? idpiecesTresoreries.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PiecesTresoreries)) {
            return false;
        }
        PiecesTresoreries other = (PiecesTresoreries) object;
        if ((this.idpiecesTresoreries == null && other.idpiecesTresoreries != null) || (this.idpiecesTresoreries != null && !this.idpiecesTresoreries.equals(other.idpiecesTresoreries))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.PiecesTresoreries[ idpiecesTresoreries=" + idpiecesTresoreries + " ]";
    }
    
}
