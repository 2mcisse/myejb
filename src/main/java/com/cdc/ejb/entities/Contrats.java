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
@Table(name = "contrats")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contrats.findAll", query = "SELECT c FROM Contrats c")
    , @NamedQuery(name = "Contrats.findByNumContrat", query = "SELECT c FROM Contrats c WHERE c.numContrat = :numContrat")
    , @NamedQuery(name = "Contrats.findByDateContrat", query = "SELECT c FROM Contrats c WHERE c.dateContrat = :dateContrat")
    , @NamedQuery(name = "Contrats.findByObjetContrat", query = "SELECT c FROM Contrats c WHERE c.objetContrat = :objetContrat")
    , @NamedQuery(name = "Contrats.findByPrenomContact", query = "SELECT c FROM Contrats c WHERE c.prenomContact = :prenomContact")
    , @NamedQuery(name = "Contrats.findByNomContact", query = "SELECT c FROM Contrats c WHERE c.nomContact = :nomContact")
    , @NamedQuery(name = "Contrats.findByTelContact", query = "SELECT c FROM Contrats c WHERE c.telContact = :telContact")
    , @NamedQuery(name = "Contrats.findByEmailContact", query = "SELECT c FROM Contrats c WHERE c.emailContact = :emailContact")
    , @NamedQuery(name = "Contrats.findByReference", query = "SELECT c FROM Contrats c WHERE c.reference = :reference")
    , @NamedQuery(name = "Contrats.findByGestion", query = "SELECT c FROM Contrats c WHERE c.gestion = :gestion")})
public class Contrats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NumContrat")
    private Integer numContrat;
    @Column(name = "DateContrat")
    @Temporal(TemporalType.DATE)
    private Date dateContrat;
    @Size(max = 150)
    @Column(name = "ObjetContrat")
    private String objetContrat;
    @Size(max = 100)
    @Column(name = "PrenomContact")
    private String prenomContact;
    @Size(max = 100)
    @Column(name = "NomContact")
    private String nomContact;
    @Size(max = 50)
    @Column(name = "TelContact")
    private String telContact;
    @Size(max = 50)
    @Column(name = "EmailContact")
    private String emailContact;
    @Size(max = 50)
    @Column(name = "Reference")
    private String reference;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numContrat")
    private List<Pieces> piecesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numContrat")
    private List<Etapes> etapesList;
    @JoinColumn(name = "IDTypeContrat", referencedColumnName = "IDTypeContrat")
    @ManyToOne
    private Typecontrat iDTypeContrat;
    @JoinColumn(name = "NumTiers", referencedColumnName = "NumTiers")
    @ManyToOne
    private Tiers numTiers;

    public Contrats() {
    }

    public Contrats(Integer numContrat) {
        this.numContrat = numContrat;
    }

    public Integer getNumContrat() {
        return numContrat;
    }

    public void setNumContrat(Integer numContrat) {
        this.numContrat = numContrat;
    }

    public Date getDateContrat() {
        return dateContrat;
    }

    public void setDateContrat(Date dateContrat) {
        this.dateContrat = dateContrat;
    }

    public String getObjetContrat() {
        return objetContrat;
    }

    public void setObjetContrat(String objetContrat) {
        this.objetContrat = objetContrat;
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

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<Pieces> getPiecesList() {
        return piecesList;
    }

    public void setPiecesList(List<Pieces> piecesList) {
        this.piecesList = piecesList;
    }

    @XmlTransient
    public List<Etapes> getEtapesList() {
        return etapesList;
    }

    public void setEtapesList(List<Etapes> etapesList) {
        this.etapesList = etapesList;
    }

    public Typecontrat getIDTypeContrat() {
        return iDTypeContrat;
    }

    public void setIDTypeContrat(Typecontrat iDTypeContrat) {
        this.iDTypeContrat = iDTypeContrat;
    }

    public Tiers getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(Tiers numTiers) {
        this.numTiers = numTiers;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numContrat != null ? numContrat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contrats)) {
            return false;
        }
        Contrats other = (Contrats) object;
        if ((this.numContrat == null && other.numContrat != null) || (this.numContrat != null && !this.numContrat.equals(other.numContrat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Contrats[ numContrat=" + numContrat + " ]";
    }
    
}
