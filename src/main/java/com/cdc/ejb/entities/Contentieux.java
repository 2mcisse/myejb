/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "contentieux")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contentieux.findAll", query = "SELECT c FROM Contentieux c")
    , @NamedQuery(name = "Contentieux.findByIDContentieux", query = "SELECT c FROM Contentieux c WHERE c.iDContentieux = :iDContentieux")
    , @NamedQuery(name = "Contentieux.findByDatecontentieux", query = "SELECT c FROM Contentieux c WHERE c.datecontentieux = :datecontentieux")
    , @NamedQuery(name = "Contentieux.findByObjetContentieux", query = "SELECT c FROM Contentieux c WHERE c.objetContentieux = :objetContentieux")
    , @NamedQuery(name = "Contentieux.findByPrenomContact", query = "SELECT c FROM Contentieux c WHERE c.prenomContact = :prenomContact")
    , @NamedQuery(name = "Contentieux.findByNomContact", query = "SELECT c FROM Contentieux c WHERE c.nomContact = :nomContact")
    , @NamedQuery(name = "Contentieux.findByTelContact", query = "SELECT c FROM Contentieux c WHERE c.telContact = :telContact")
    , @NamedQuery(name = "Contentieux.findByEmailContact", query = "SELECT c FROM Contentieux c WHERE c.emailContact = :emailContact")
    , @NamedQuery(name = "Contentieux.findByReference", query = "SELECT c FROM Contentieux c WHERE c.reference = :reference")
    , @NamedQuery(name = "Contentieux.findByGestion", query = "SELECT c FROM Contentieux c WHERE c.gestion = :gestion")})
public class Contentieux implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDContentieux")
    private Integer iDContentieux;
    @Size(max = 50)
    @Column(name = "Datecontentieux")
    private String datecontentieux;
    @Size(max = 50)
    @Column(name = "ObjetContentieux")
    private String objetContentieux;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDContentieux")
    private List<Pieces> piecesList;
    @JoinColumn(name = "NumTiers", referencedColumnName = "NumTiers")
    @ManyToOne
    private Tiers numTiers;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDContentieux")
    private List<Etapes> etapesList;

    public Contentieux() {
    }

    public Contentieux(Integer iDContentieux) {
        this.iDContentieux = iDContentieux;
    }

    public Integer getIDContentieux() {
        return iDContentieux;
    }

    public void setIDContentieux(Integer iDContentieux) {
        this.iDContentieux = iDContentieux;
    }

    public String getDatecontentieux() {
        return datecontentieux;
    }

    public void setDatecontentieux(String datecontentieux) {
        this.datecontentieux = datecontentieux;
    }

    public String getObjetContentieux() {
        return objetContentieux;
    }

    public void setObjetContentieux(String objetContentieux) {
        this.objetContentieux = objetContentieux;
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

    public Tiers getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(Tiers numTiers) {
        this.numTiers = numTiers;
    }

    @XmlTransient
    public List<Etapes> getEtapesList() {
        return etapesList;
    }

    public void setEtapesList(List<Etapes> etapesList) {
        this.etapesList = etapesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDContentieux != null ? iDContentieux.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contentieux)) {
            return false;
        }
        Contentieux other = (Contentieux) object;
        if ((this.iDContentieux == null && other.iDContentieux != null) || (this.iDContentieux != null && !this.iDContentieux.equals(other.iDContentieux))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Contentieux[ iDContentieux=" + iDContentieux + " ]";
    }
    
}
