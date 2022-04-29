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
@Table(name = "courriers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Courriers.findAll", query = "SELECT c FROM Courriers c")
    , @NamedQuery(name = "Courriers.findByIDDocuments", query = "SELECT c FROM Courriers c WHERE c.iDDocuments = :iDDocuments")
    , @NamedQuery(name = "Courriers.findByCodeDoc", query = "SELECT c FROM Courriers c WHERE c.codeDoc = :codeDoc")
    , @NamedQuery(name = "Courriers.findByDateDoc", query = "SELECT c FROM Courriers c WHERE c.dateDoc = :dateDoc")
    , @NamedQuery(name = "Courriers.findByObservation", query = "SELECT c FROM Courriers c WHERE c.observation = :observation")
    , @NamedQuery(name = "Courriers.findByObservationPrincipale", query = "SELECT c FROM Courriers c WHERE c.observationPrincipale = :observationPrincipale")
    , @NamedQuery(name = "Courriers.findByValEtape", query = "SELECT c FROM Courriers c WHERE c.valEtape = :valEtape")
    , @NamedQuery(name = "Courriers.findByNiveau", query = "SELECT c FROM Courriers c WHERE c.niveau = :niveau")
    , @NamedQuery(name = "Courriers.findByModeModif", query = "SELECT c FROM Courriers c WHERE c.modeModif = :modeModif")
    , @NamedQuery(name = "Courriers.findBySensCourrier", query = "SELECT c FROM Courriers c WHERE c.sensCourrier = :sensCourrier")
    , @NamedQuery(name = "Courriers.findByObjetCourrier", query = "SELECT c FROM Courriers c WHERE c.objetCourrier = :objetCourrier")
    , @NamedQuery(name = "Courriers.findByReference", query = "SELECT c FROM Courriers c WHERE c.reference = :reference")
    , @NamedQuery(name = "Courriers.findByArchive", query = "SELECT c FROM Courriers c WHERE c.archive = :archive")
    , @NamedQuery(name = "Courriers.findByEtat", query = "SELECT c FROM Courriers c WHERE c.etat = :etat")
    , @NamedQuery(name = "Courriers.findByPrenomContact", query = "SELECT c FROM Courriers c WHERE c.prenomContact = :prenomContact")
    , @NamedQuery(name = "Courriers.findByNomContact", query = "SELECT c FROM Courriers c WHERE c.nomContact = :nomContact")
    , @NamedQuery(name = "Courriers.findByTelContact", query = "SELECT c FROM Courriers c WHERE c.telContact = :telContact")
    , @NamedQuery(name = "Courriers.findByEmailContact", query = "SELECT c FROM Courriers c WHERE c.emailContact = :emailContact")
    , @NamedQuery(name = "Courriers.findByNumEnreg", query = "SELECT c FROM Courriers c WHERE c.numEnreg = :numEnreg")
    , @NamedQuery(name = "Courriers.findByDateEnreg", query = "SELECT c FROM Courriers c WHERE c.dateEnreg = :dateEnreg")
    , @NamedQuery(name = "Courriers.findByDateOverture", query = "SELECT c FROM Courriers c WHERE c.dateOverture = :dateOverture")
    , @NamedQuery(name = "Courriers.findByGestion", query = "SELECT c FROM Courriers c WHERE c.gestion = :gestion")})
public class Courriers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDocuments")
    private Integer iDDocuments;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CodeDoc")
    private String codeDoc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateDoc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDoc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Observation")
    private String observation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "ObservationPrincipale")
    private String observationPrincipale;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ValEtape")
    private String valEtape;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Niveau")
    private short niveau;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModeModif")
    private short modeModif;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SensCourrier")
    private short sensCourrier;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "ObjetCourrier")
    private String objetCourrier;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Reference")
    private String reference;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Archive")
    private short archive;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Etat")
    private short etat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PrenomContact")
    private String prenomContact;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NomContact")
    private String nomContact;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TelContact")
    private String telContact;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "EmailContact")
    private String emailContact;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumEnreg")
    private String numEnreg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateEnreg")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEnreg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateOverture")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOverture;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDDocuments")
    private List<Representantsgroupe> representantsgroupeList;
    @JoinColumn(name = "NumTiers", referencedColumnName = "NumTiers")
    @ManyToOne(optional = false)
    private Tiers numTiers;
    @JoinColumn(name = "IDTypeCourriers", referencedColumnName = "IDTypeCourriers")
    @ManyToOne(optional = false)
    private Typecourriers iDTypeCourriers;
    @JoinColumn(name = "IDACTIONS", referencedColumnName = "IDACTIONS")
    @ManyToOne(optional = false)
    private Actions idactions;
    @JoinColumn(name = "IDNatureCourrier", referencedColumnName = "IDNatureCourrier")
    @ManyToOne(optional = false)
    private Naturecourrier iDNatureCourrier;
    @JoinColumn(name = "IDSERVICES", referencedColumnName = "IDSERVICES")
    @ManyToOne(optional = false)
    private Services idservices;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDDocuments")
    private List<Pieces> piecesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDDocuments")
    private List<Situationdocument> situationdocumentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDDocuments")
    private List<Journalcourriers> journalcourriersList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDDocuments")
    private List<Remarques> remarquesList;

    public Courriers() {
    }

    public Courriers(Integer iDDocuments) {
        this.iDDocuments = iDDocuments;
    }

    public Courriers(Integer iDDocuments, String codeDoc, Date dateDoc, String observation, String observationPrincipale, String valEtape, short niveau, short modeModif, short sensCourrier, String objetCourrier, String reference, short archive, short etat, String prenomContact, String nomContact, String telContact, String emailContact, String numEnreg, Date dateEnreg, Date dateOverture) {
        this.iDDocuments = iDDocuments;
        this.codeDoc = codeDoc;
        this.dateDoc = dateDoc;
        this.observation = observation;
        this.observationPrincipale = observationPrincipale;
        this.valEtape = valEtape;
        this.niveau = niveau;
        this.modeModif = modeModif;
        this.sensCourrier = sensCourrier;
        this.objetCourrier = objetCourrier;
        this.reference = reference;
        this.archive = archive;
        this.etat = etat;
        this.prenomContact = prenomContact;
        this.nomContact = nomContact;
        this.telContact = telContact;
        this.emailContact = emailContact;
        this.numEnreg = numEnreg;
        this.dateEnreg = dateEnreg;
        this.dateOverture = dateOverture;
    }

    public Integer getIDDocuments() {
        return iDDocuments;
    }

    public void setIDDocuments(Integer iDDocuments) {
        this.iDDocuments = iDDocuments;
    }

    public String getCodeDoc() {
        return codeDoc;
    }

    public void setCodeDoc(String codeDoc) {
        this.codeDoc = codeDoc;
    }

    public Date getDateDoc() {
        return dateDoc;
    }

    public void setDateDoc(Date dateDoc) {
        this.dateDoc = dateDoc;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getObservationPrincipale() {
        return observationPrincipale;
    }

    public void setObservationPrincipale(String observationPrincipale) {
        this.observationPrincipale = observationPrincipale;
    }

    public String getValEtape() {
        return valEtape;
    }

    public void setValEtape(String valEtape) {
        this.valEtape = valEtape;
    }

    public short getNiveau() {
        return niveau;
    }

    public void setNiveau(short niveau) {
        this.niveau = niveau;
    }

    public short getModeModif() {
        return modeModif;
    }

    public void setModeModif(short modeModif) {
        this.modeModif = modeModif;
    }

    public short getSensCourrier() {
        return sensCourrier;
    }

    public void setSensCourrier(short sensCourrier) {
        this.sensCourrier = sensCourrier;
    }

    public String getObjetCourrier() {
        return objetCourrier;
    }

    public void setObjetCourrier(String objetCourrier) {
        this.objetCourrier = objetCourrier;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public short getArchive() {
        return archive;
    }

    public void setArchive(short archive) {
        this.archive = archive;
    }

    public short getEtat() {
        return etat;
    }

    public void setEtat(short etat) {
        this.etat = etat;
    }

    public String getPrenomContact() {
        return prenomContact;
    }

    public void setPrenomContact(String prenomContact) {
        this.prenomContact = prenomContact;
    }

    public String getNomContact() {
        return nomContact;
    }

    public void setNomContact(String nomContact) {
        this.nomContact = nomContact;
    }

    public String getTelContact() {
        return telContact;
    }

    public void setTelContact(String telContact) {
        this.telContact = telContact;
    }

    public String getEmailContact() {
        return emailContact;
    }

    public void setEmailContact(String emailContact) {
        this.emailContact = emailContact;
    }

    public String getNumEnreg() {
        return numEnreg;
    }

    public void setNumEnreg(String numEnreg) {
        this.numEnreg = numEnreg;
    }

    public Date getDateEnreg() {
        return dateEnreg;
    }

    public void setDateEnreg(Date dateEnreg) {
        this.dateEnreg = dateEnreg;
    }

    public Date getDateOverture() {
        return dateOverture;
    }

    public void setDateOverture(Date dateOverture) {
        this.dateOverture = dateOverture;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<Representantsgroupe> getRepresentantsgroupeList() {
        return representantsgroupeList;
    }

    public void setRepresentantsgroupeList(List<Representantsgroupe> representantsgroupeList) {
        this.representantsgroupeList = representantsgroupeList;
    }

    public Tiers getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(Tiers numTiers) {
        this.numTiers = numTiers;
    }

    public Typecourriers getIDTypeCourriers() {
        return iDTypeCourriers;
    }

    public void setIDTypeCourriers(Typecourriers iDTypeCourriers) {
        this.iDTypeCourriers = iDTypeCourriers;
    }

    public Actions getIdactions() {
        return idactions;
    }

    public void setIdactions(Actions idactions) {
        this.idactions = idactions;
    }

    public Naturecourrier getIDNatureCourrier() {
        return iDNatureCourrier;
    }

    public void setIDNatureCourrier(Naturecourrier iDNatureCourrier) {
        this.iDNatureCourrier = iDNatureCourrier;
    }

    public Services getIdservices() {
        return idservices;
    }

    public void setIdservices(Services idservices) {
        this.idservices = idservices;
    }

    @XmlTransient
    public List<Pieces> getPiecesList() {
        return piecesList;
    }

    public void setPiecesList(List<Pieces> piecesList) {
        this.piecesList = piecesList;
    }

    @XmlTransient
    public List<Situationdocument> getSituationdocumentList() {
        return situationdocumentList;
    }

    public void setSituationdocumentList(List<Situationdocument> situationdocumentList) {
        this.situationdocumentList = situationdocumentList;
    }

    @XmlTransient
    public List<Journalcourriers> getJournalcourriersList() {
        return journalcourriersList;
    }

    public void setJournalcourriersList(List<Journalcourriers> journalcourriersList) {
        this.journalcourriersList = journalcourriersList;
    }

    @XmlTransient
    public List<Remarques> getRemarquesList() {
        return remarquesList;
    }

    public void setRemarquesList(List<Remarques> remarquesList) {
        this.remarquesList = remarquesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDDocuments != null ? iDDocuments.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Courriers)) {
            return false;
        }
        Courriers other = (Courriers) object;
        if ((this.iDDocuments == null && other.iDDocuments != null) || (this.iDDocuments != null && !this.iDDocuments.equals(other.iDDocuments))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Courriers[ iDDocuments=" + iDDocuments + " ]";
    }
    
}
