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
@Table(name = "journalcourriers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Journalcourriers.findAll", query = "SELECT j FROM Journalcourriers j")
    , @NamedQuery(name = "Journalcourriers.findByIdjournal", query = "SELECT j FROM Journalcourriers j WHERE j.idjournal = :idjournal")
    , @NamedQuery(name = "Journalcourriers.findByDepart", query = "SELECT j FROM Journalcourriers j WHERE j.depart = :depart")
    , @NamedQuery(name = "Journalcourriers.findByArrive", query = "SELECT j FROM Journalcourriers j WHERE j.arrive = :arrive")
    , @NamedQuery(name = "Journalcourriers.findByDates", query = "SELECT j FROM Journalcourriers j WHERE j.dates = :dates")
    , @NamedQuery(name = "Journalcourriers.findByAvis", query = "SELECT j FROM Journalcourriers j WHERE j.avis = :avis")
    , @NamedQuery(name = "Journalcourriers.findByObservation", query = "SELECT j FROM Journalcourriers j WHERE j.observation = :observation")
    , @NamedQuery(name = "Journalcourriers.findByDateArrivee", query = "SELECT j FROM Journalcourriers j WHERE j.dateArrivee = :dateArrivee")
    , @NamedQuery(name = "Journalcourriers.findByDateDepart", query = "SELECT j FROM Journalcourriers j WHERE j.dateDepart = :dateDepart")
    , @NamedQuery(name = "Journalcourriers.findByNumtiersDetenteur", query = "SELECT j FROM Journalcourriers j WHERE j.numtiersDetenteur = :numtiersDetenteur")
    , @NamedQuery(name = "Journalcourriers.findBySensCourrier", query = "SELECT j FROM Journalcourriers j WHERE j.sensCourrier = :sensCourrier")
    , @NamedQuery(name = "Journalcourriers.findByNomProvenance", query = "SELECT j FROM Journalcourriers j WHERE j.nomProvenance = :nomProvenance")
    , @NamedQuery(name = "Journalcourriers.findByNomDestination", query = "SELECT j FROM Journalcourriers j WHERE j.nomDestination = :nomDestination")
    , @NamedQuery(name = "Journalcourriers.findByDateReceptionPhysique", query = "SELECT j FROM Journalcourriers j WHERE j.dateReceptionPhysique = :dateReceptionPhysique")
    , @NamedQuery(name = "Journalcourriers.findByDateOverture", query = "SELECT j FROM Journalcourriers j WHERE j.dateOverture = :dateOverture")
    , @NamedQuery(name = "Journalcourriers.findByIDDECAutorisationDeRestitution", query = "SELECT j FROM Journalcourriers j WHERE j.iDDECAutorisationDeRestitution = :iDDECAutorisationDeRestitution")
    , @NamedQuery(name = "Journalcourriers.findByGroupeDepart", query = "SELECT j FROM Journalcourriers j WHERE j.groupeDepart = :groupeDepart")
    , @NamedQuery(name = "Journalcourriers.findByGroupeArrive", query = "SELECT j FROM Journalcourriers j WHERE j.groupeArrive = :groupeArrive")
    , @NamedQuery(name = "Journalcourriers.findByGroupeDetenteur", query = "SELECT j FROM Journalcourriers j WHERE j.groupeDetenteur = :groupeDetenteur")
    , @NamedQuery(name = "Journalcourriers.findByIDDECTitreDePerception", query = "SELECT j FROM Journalcourriers j WHERE j.iDDECTitreDePerception = :iDDECTitreDePerception")
    , @NamedQuery(name = "Journalcourriers.findByIDBUDBudget", query = "SELECT j FROM Journalcourriers j WHERE j.iDBUDBudget = :iDBUDBudget")
    , @NamedQuery(name = "Journalcourriers.findByIDBUDEngagement", query = "SELECT j FROM Journalcourriers j WHERE j.iDBUDEngagement = :iDBUDEngagement")
    , @NamedQuery(name = "Journalcourriers.findByIDBUDLiquidation", query = "SELECT j FROM Journalcourriers j WHERE j.iDBUDLiquidation = :iDBUDLiquidation")
    , @NamedQuery(name = "Journalcourriers.findByIdbudDmri", query = "SELECT j FROM Journalcourriers j WHERE j.idbudDmri = :idbudDmri")
    , @NamedQuery(name = "Journalcourriers.findByCodeEnc", query = "SELECT j FROM Journalcourriers j WHERE j.codeEnc = :codeEnc")
    , @NamedQuery(name = "Journalcourriers.findByIDDECReception", query = "SELECT j FROM Journalcourriers j WHERE j.iDDECReception = :iDDECReception")
    , @NamedQuery(name = "Journalcourriers.findByIDDECRestitution", query = "SELECT j FROM Journalcourriers j WHERE j.iDDECRestitution = :iDDECRestitution")
    , @NamedQuery(name = "Journalcourriers.findByGestion", query = "SELECT j FROM Journalcourriers j WHERE j.gestion = :gestion")})
public class Journalcourriers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDJOURNAL")
    private Integer idjournal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Depart")
    private int depart;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Arrive")
    private int arrive;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Dates")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dates;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Avis")
    private short avis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "OBSERVATION")
    private String observation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateArrivee")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateArrivee;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateDepart")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDepart;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NumtiersDetenteur")
    private int numtiersDetenteur;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SensCourrier")
    private short sensCourrier;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "NomProvenance")
    private String nomProvenance;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "NomDestination")
    private String nomDestination;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateReceptionPhysique")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateReceptionPhysique;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateOverture")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOverture;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDEC_AutorisationDeRestitution")
    private int iDDECAutorisationDeRestitution;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "GroupeDepart")
    private String groupeDepart;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "GroupeArrive")
    private String groupeArrive;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "GroupeDetenteur")
    private String groupeDetenteur;
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
    @Column(name = "IDBUD_DMRI")
    private int idbudDmri;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_ENC")
    private long codeEnc;
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

    public Journalcourriers() {
    }

    public Journalcourriers(Integer idjournal) {
        this.idjournal = idjournal;
    }

    public Journalcourriers(Integer idjournal, int depart, int arrive, Date dates, short avis, String observation, Date dateArrivee, Date dateDepart, int numtiersDetenteur, short sensCourrier, String nomProvenance, String nomDestination, Date dateReceptionPhysique, Date dateOverture, int iDDECAutorisationDeRestitution, String groupeDepart, String groupeArrive, String groupeDetenteur, int iDDECTitreDePerception, int iDBUDBudget, int iDBUDEngagement, int iDBUDLiquidation, int idbudDmri, long codeEnc, int iDDECReception, int iDDECRestitution) {
        this.idjournal = idjournal;
        this.depart = depart;
        this.arrive = arrive;
        this.dates = dates;
        this.avis = avis;
        this.observation = observation;
        this.dateArrivee = dateArrivee;
        this.dateDepart = dateDepart;
        this.numtiersDetenteur = numtiersDetenteur;
        this.sensCourrier = sensCourrier;
        this.nomProvenance = nomProvenance;
        this.nomDestination = nomDestination;
        this.dateReceptionPhysique = dateReceptionPhysique;
        this.dateOverture = dateOverture;
        this.iDDECAutorisationDeRestitution = iDDECAutorisationDeRestitution;
        this.groupeDepart = groupeDepart;
        this.groupeArrive = groupeArrive;
        this.groupeDetenteur = groupeDetenteur;
        this.iDDECTitreDePerception = iDDECTitreDePerception;
        this.iDBUDBudget = iDBUDBudget;
        this.iDBUDEngagement = iDBUDEngagement;
        this.iDBUDLiquidation = iDBUDLiquidation;
        this.idbudDmri = idbudDmri;
        this.codeEnc = codeEnc;
        this.iDDECReception = iDDECReception;
        this.iDDECRestitution = iDDECRestitution;
    }

    public Integer getIdjournal() {
        return idjournal;
    }

    public void setIdjournal(Integer idjournal) {
        this.idjournal = idjournal;
    }

    public int getDepart() {
        return depart;
    }

    public void setDepart(int depart) {
        this.depart = depart;
    }

    public int getArrive() {
        return arrive;
    }

    public void setArrive(int arrive) {
        this.arrive = arrive;
    }

    public Date getDates() {
        return dates;
    }

    public void setDates(Date dates) {
        this.dates = dates;
    }

    public short getAvis() {
        return avis;
    }

    public void setAvis(short avis) {
        this.avis = avis;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public int getNumtiersDetenteur() {
        return numtiersDetenteur;
    }

    public void setNumtiersDetenteur(int numtiersDetenteur) {
        this.numtiersDetenteur = numtiersDetenteur;
    }

    public short getSensCourrier() {
        return sensCourrier;
    }

    public void setSensCourrier(short sensCourrier) {
        this.sensCourrier = sensCourrier;
    }

    public String getNomProvenance() {
        return nomProvenance;
    }

    public void setNomProvenance(String nomProvenance) {
        this.nomProvenance = nomProvenance;
    }

    public String getNomDestination() {
        return nomDestination;
    }

    public void setNomDestination(String nomDestination) {
        this.nomDestination = nomDestination;
    }

    public Date getDateReceptionPhysique() {
        return dateReceptionPhysique;
    }

    public void setDateReceptionPhysique(Date dateReceptionPhysique) {
        this.dateReceptionPhysique = dateReceptionPhysique;
    }

    public Date getDateOverture() {
        return dateOverture;
    }

    public void setDateOverture(Date dateOverture) {
        this.dateOverture = dateOverture;
    }

    public int getIDDECAutorisationDeRestitution() {
        return iDDECAutorisationDeRestitution;
    }

    public void setIDDECAutorisationDeRestitution(int iDDECAutorisationDeRestitution) {
        this.iDDECAutorisationDeRestitution = iDDECAutorisationDeRestitution;
    }

    public String getGroupeDepart() {
        return groupeDepart;
    }

    public void setGroupeDepart(String groupeDepart) {
        this.groupeDepart = groupeDepart;
    }

    public String getGroupeArrive() {
        return groupeArrive;
    }

    public void setGroupeArrive(String groupeArrive) {
        this.groupeArrive = groupeArrive;
    }

    public String getGroupeDetenteur() {
        return groupeDetenteur;
    }

    public void setGroupeDetenteur(String groupeDetenteur) {
        this.groupeDetenteur = groupeDetenteur;
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

    public int getIdbudDmri() {
        return idbudDmri;
    }

    public void setIdbudDmri(int idbudDmri) {
        this.idbudDmri = idbudDmri;
    }

    public long getCodeEnc() {
        return codeEnc;
    }

    public void setCodeEnc(long codeEnc) {
        this.codeEnc = codeEnc;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idjournal != null ? idjournal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Journalcourriers)) {
            return false;
        }
        Journalcourriers other = (Journalcourriers) object;
        if ((this.idjournal == null && other.idjournal != null) || (this.idjournal != null && !this.idjournal.equals(other.idjournal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Journalcourriers[ idjournal=" + idjournal + " ]";
    }
    
}
