/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
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
@Table(name = "situationdocument")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Situationdocument.findAll", query = "SELECT s FROM Situationdocument s")
    , @NamedQuery(name = "Situationdocument.findByIDSituationDocument", query = "SELECT s FROM Situationdocument s WHERE s.iDSituationDocument = :iDSituationDocument")
    , @NamedQuery(name = "Situationdocument.findByDates", query = "SELECT s FROM Situationdocument s WHERE s.dates = :dates")
    , @NamedQuery(name = "Situationdocument.findByNotifier", query = "SELECT s FROM Situationdocument s WHERE s.notifier = :notifier")
    , @NamedQuery(name = "Situationdocument.findByNomGroupe", query = "SELECT s FROM Situationdocument s WHERE s.nomGroupe = :nomGroupe")
    , @NamedQuery(name = "Situationdocument.findByIDDECAutorisationDeRestitution", query = "SELECT s FROM Situationdocument s WHERE s.iDDECAutorisationDeRestitution = :iDDECAutorisationDeRestitution")
    , @NamedQuery(name = "Situationdocument.findByIDDECTitreDePerception", query = "SELECT s FROM Situationdocument s WHERE s.iDDECTitreDePerception = :iDDECTitreDePerception")
    , @NamedQuery(name = "Situationdocument.findByIDBUDBudget", query = "SELECT s FROM Situationdocument s WHERE s.iDBUDBudget = :iDBUDBudget")
    , @NamedQuery(name = "Situationdocument.findByIDBUDEngagement", query = "SELECT s FROM Situationdocument s WHERE s.iDBUDEngagement = :iDBUDEngagement")
    , @NamedQuery(name = "Situationdocument.findByIDBUDLiquidation", query = "SELECT s FROM Situationdocument s WHERE s.iDBUDLiquidation = :iDBUDLiquidation")
    , @NamedQuery(name = "Situationdocument.findByCopie", query = "SELECT s FROM Situationdocument s WHERE s.copie = :copie")
    , @NamedQuery(name = "Situationdocument.findByIDDECReception", query = "SELECT s FROM Situationdocument s WHERE s.iDDECReception = :iDDECReception")
    , @NamedQuery(name = "Situationdocument.findByIDDECRestitution", query = "SELECT s FROM Situationdocument s WHERE s.iDDECRestitution = :iDDECRestitution")
    , @NamedQuery(name = "Situationdocument.findByGestion", query = "SELECT s FROM Situationdocument s WHERE s.gestion = :gestion")})
public class Situationdocument implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSituationDocument")
    private Integer iDSituationDocument;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Dates")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dates;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Notifier")
    private short notifier;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NomGroupe")
    private String nomGroupe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDEC_AutorisationDeRestitution")
    private int iDDECAutorisationDeRestitution;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDEC_TitreDePerception")
    private int iDDECTitreDePerception;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDBUD_Budget")
    private int iDBUDBudget;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDBUD_Engagement")
    private int iDBUDEngagement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDBUD_Liquidation")
    private int iDBUDLiquidation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Copie")
    private short copie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDEC_Reception")
    private int iDDECReception;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDEC_Restitution")
    private int iDDECRestitution;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "IDDocuments", referencedColumnName = "IDDocuments")
    @ManyToOne(optional = false)
    private Courriers iDDocuments;
    @JoinColumn(name = "NumTiers", referencedColumnName = "NumTiers")
    @ManyToOne(optional = false)
    private Tiers numTiers;
    @JoinColumn(name = "CODE_ENC", referencedColumnName = "CODE_ENC")
    @ManyToOne(optional = false)
    private Encaissements codeEnc;
    @JoinColumn(name = "CODE_DEC", referencedColumnName = "CODE_DEC")
    @ManyToOne(optional = false)
    private Decaissements codeDec;

    public Situationdocument() {
    }

    public Situationdocument(Integer iDSituationDocument) {
        this.iDSituationDocument = iDSituationDocument;
    }

    public Situationdocument(Integer iDSituationDocument, Date dates, short notifier, String nomGroupe, int iDDECAutorisationDeRestitution, int iDDECTitreDePerception, int iDBUDBudget, int iDBUDEngagement, int iDBUDLiquidation, short copie, int iDDECReception, int iDDECRestitution) {
        this.iDSituationDocument = iDSituationDocument;
        this.dates = dates;
        this.notifier = notifier;
        this.nomGroupe = nomGroupe;
        this.iDDECAutorisationDeRestitution = iDDECAutorisationDeRestitution;
        this.iDDECTitreDePerception = iDDECTitreDePerception;
        this.iDBUDBudget = iDBUDBudget;
        this.iDBUDEngagement = iDBUDEngagement;
        this.iDBUDLiquidation = iDBUDLiquidation;
        this.copie = copie;
        this.iDDECReception = iDDECReception;
        this.iDDECRestitution = iDDECRestitution;
    }

    public Integer getIDSituationDocument() {
        return iDSituationDocument;
    }

    public void setIDSituationDocument(Integer iDSituationDocument) {
        this.iDSituationDocument = iDSituationDocument;
    }

    public Date getDates() {
        return dates;
    }

    public void setDates(Date dates) {
        this.dates = dates;
    }

    public short getNotifier() {
        return notifier;
    }

    public void setNotifier(short notifier) {
        this.notifier = notifier;
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public int getIDDECAutorisationDeRestitution() {
        return iDDECAutorisationDeRestitution;
    }

    public void setIDDECAutorisationDeRestitution(int iDDECAutorisationDeRestitution) {
        this.iDDECAutorisationDeRestitution = iDDECAutorisationDeRestitution;
    }

    public int getIDDECTitreDePerception() {
        return iDDECTitreDePerception;
    }

    public void setIDDECTitreDePerception(int iDDECTitreDePerception) {
        this.iDDECTitreDePerception = iDDECTitreDePerception;
    }

    public int getIDBUDBudget() {
        return iDBUDBudget;
    }

    public void setIDBUDBudget(int iDBUDBudget) {
        this.iDBUDBudget = iDBUDBudget;
    }

    public int getIDBUDEngagement() {
        return iDBUDEngagement;
    }

    public void setIDBUDEngagement(int iDBUDEngagement) {
        this.iDBUDEngagement = iDBUDEngagement;
    }

    public int getIDBUDLiquidation() {
        return iDBUDLiquidation;
    }

    public void setIDBUDLiquidation(int iDBUDLiquidation) {
        this.iDBUDLiquidation = iDBUDLiquidation;
    }

    public short getCopie() {
        return copie;
    }

    public void setCopie(short copie) {
        this.copie = copie;
    }

    public int getIDDECReception() {
        return iDDECReception;
    }

    public void setIDDECReception(int iDDECReception) {
        this.iDDECReception = iDDECReception;
    }

    public int getIDDECRestitution() {
        return iDDECRestitution;
    }

    public void setIDDECRestitution(int iDDECRestitution) {
        this.iDDECRestitution = iDDECRestitution;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public Courriers getIDDocuments() {
        return iDDocuments;
    }

    public void setIDDocuments(Courriers iDDocuments) {
        this.iDDocuments = iDDocuments;
    }

    public Tiers getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(Tiers numTiers) {
        this.numTiers = numTiers;
    }

    public Encaissements getCodeEnc() {
        return codeEnc;
    }

    public void setCodeEnc(Encaissements codeEnc) {
        this.codeEnc = codeEnc;
    }

    public Decaissements getCodeDec() {
        return codeDec;
    }

    public void setCodeDec(Decaissements codeDec) {
        this.codeDec = codeDec;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDSituationDocument != null ? iDSituationDocument.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Situationdocument)) {
            return false;
        }
        Situationdocument other = (Situationdocument) object;
        if ((this.iDSituationDocument == null && other.iDSituationDocument != null) || (this.iDSituationDocument != null && !this.iDSituationDocument.equals(other.iDSituationDocument))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Situationdocument[ iDSituationDocument=" + iDSituationDocument + " ]";
    }
    
}
