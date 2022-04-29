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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "mandataires")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mandataires.findAll", query = "SELECT m FROM Mandataires m")
    , @NamedQuery(name = "Mandataires.findByIdmandataires", query = "SELECT m FROM Mandataires m WHERE m.idmandataires = :idmandataires")
    , @NamedQuery(name = "Mandataires.findByNom", query = "SELECT m FROM Mandataires m WHERE m.nom = :nom")
    , @NamedQuery(name = "Mandataires.findByPrenom", query = "SELECT m FROM Mandataires m WHERE m.prenom = :prenom")})
public class Mandataires implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDMANDATAIRES")
    private Integer idmandataires;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Nom")
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Prenom")
    private String prenom;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "Photo")
    private byte[] photo;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "SpecimenSignature")
    private byte[] specimenSignature;
    @JoinColumn(name = "NumTiers", referencedColumnName = "NumTiers")
    @ManyToOne(optional = false)
    private Tiers numTiers;

    public Mandataires() {
    }

    public Mandataires(Integer idmandataires) {
        this.idmandataires = idmandataires;
    }

    public Mandataires(Integer idmandataires, String nom, String prenom, byte[] photo, byte[] specimenSignature) {
        this.idmandataires = idmandataires;
        this.nom = nom;
        this.prenom = prenom;
        this.photo = photo;
        this.specimenSignature = specimenSignature;
    }

    public Integer getIdmandataires() {
        return idmandataires;
    }

    public void setIdmandataires(Integer idmandataires) {
        this.idmandataires = idmandataires;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public byte[] getSpecimenSignature() {
        return specimenSignature;
    }

    public void setSpecimenSignature(byte[] specimenSignature) {
        this.specimenSignature = specimenSignature;
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
        hash += (idmandataires != null ? idmandataires.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mandataires)) {
            return false;
        }
        Mandataires other = (Mandataires) object;
        if ((this.idmandataires == null && other.idmandataires != null) || (this.idmandataires != null && !this.idmandataires.equals(other.idmandataires))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Mandataires[ idmandataires=" + idmandataires + " ]";
    }
    
}
