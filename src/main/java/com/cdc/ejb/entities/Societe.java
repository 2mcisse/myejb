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
import javax.persistence.Lob;
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
@Table(name = "societe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Societe.findAll", query = "SELECT s FROM Societe s")
    , @NamedQuery(name = "Societe.findByIDSociete", query = "SELECT s FROM Societe s WHERE s.iDSociete = :iDSociete")
    , @NamedQuery(name = "Societe.findByNomSociete", query = "SELECT s FROM Societe s WHERE s.nomSociete = :nomSociete")
    , @NamedQuery(name = "Societe.findByAdresse", query = "SELECT s FROM Societe s WHERE s.adresse = :adresse")
    , @NamedQuery(name = "Societe.findByVilleSociete", query = "SELECT s FROM Societe s WHERE s.villeSociete = :villeSociete")
    , @NamedQuery(name = "Societe.findByTelephone", query = "SELECT s FROM Societe s WHERE s.telephone = :telephone")
    , @NamedQuery(name = "Societe.findByNumeroSiret", query = "SELECT s FROM Societe s WHERE s.numeroSiret = :numeroSiret")
    , @NamedQuery(name = "Societe.findByCEEIdentifiant", query = "SELECT s FROM Societe s WHERE s.cEEIdentifiant = :cEEIdentifiant")
    , @NamedQuery(name = "Societe.findByMotPasse", query = "SELECT s FROM Societe s WHERE s.motPasse = :motPasse")
    , @NamedQuery(name = "Societe.findByDateDebut", query = "SELECT s FROM Societe s WHERE s.dateDebut = :dateDebut")
    , @NamedQuery(name = "Societe.findByDateFin", query = "SELECT s FROM Societe s WHERE s.dateFin = :dateFin")
    , @NamedQuery(name = "Societe.findBySauvegarde", query = "SELECT s FROM Societe s WHERE s.sauvegarde = :sauvegarde")
    , @NamedQuery(name = "Societe.findByCodePostal", query = "SELECT s FROM Societe s WHERE s.codePostal = :codePostal")
    , @NamedQuery(name = "Societe.findByEmailSociete", query = "SELECT s FROM Societe s WHERE s.emailSociete = :emailSociete")
    , @NamedQuery(name = "Societe.findByCh", query = "SELECT s FROM Societe s WHERE s.ch = :ch")
    , @NamedQuery(name = "Societe.findByFax", query = "SELECT s FROM Societe s WHERE s.fax = :fax")
    , @NamedQuery(name = "Societe.findBySiteWeb", query = "SELECT s FROM Societe s WHERE s.siteWeb = :siteWeb")})
public class Societe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSociete")
    private Integer iDSociete;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "NomSociete")
    private String nomSociete;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Adresse")
    private String adresse;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "VilleSociete")
    private String villeSociete;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Telephone")
    private String telephone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 17)
    @Column(name = "NumeroSiret")
    private String numeroSiret;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CEEIdentifiant")
    private String cEEIdentifiant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "MotPasse")
    private String motPasse;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateDebut")
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateFin")
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Sauvegarde")
    private short sauvegarde;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "CodePostal")
    private String codePostal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "EmailSociete")
    private String emailSociete;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ch")
    private String ch;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "Logo")
    private byte[] logo;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Fax")
    private String fax;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "SiteWeb")
    private String siteWeb;

    public Societe() {
    }

    public Societe(Integer iDSociete) {
        this.iDSociete = iDSociete;
    }

    public Societe(Integer iDSociete, String nomSociete, String adresse, String villeSociete, String telephone, String numeroSiret, String cEEIdentifiant, String motPasse, Date dateDebut, Date dateFin, short sauvegarde, String codePostal, String emailSociete, String ch, byte[] logo, String fax, String siteWeb) {
        this.iDSociete = iDSociete;
        this.nomSociete = nomSociete;
        this.adresse = adresse;
        this.villeSociete = villeSociete;
        this.telephone = telephone;
        this.numeroSiret = numeroSiret;
        this.cEEIdentifiant = cEEIdentifiant;
        this.motPasse = motPasse;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.sauvegarde = sauvegarde;
        this.codePostal = codePostal;
        this.emailSociete = emailSociete;
        this.ch = ch;
        this.logo = logo;
        this.fax = fax;
        this.siteWeb = siteWeb;
    }

    public Integer getIDSociete() {
        return iDSociete;
    }

    public void setIDSociete(Integer iDSociete) {
        this.iDSociete = iDSociete;
    }

    public String getNomSociete() {
        return nomSociete;
    }

    public void setNomSociete(String nomSociete) {
        this.nomSociete = nomSociete;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVilleSociete() {
        return villeSociete;
    }

    public void setVilleSociete(String villeSociete) {
        this.villeSociete = villeSociete;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getNumeroSiret() {
        return numeroSiret;
    }

    public void setNumeroSiret(String numeroSiret) {
        this.numeroSiret = numeroSiret;
    }

    public String getCEEIdentifiant() {
        return cEEIdentifiant;
    }

    public void setCEEIdentifiant(String cEEIdentifiant) {
        this.cEEIdentifiant = cEEIdentifiant;
    }

    public String getMotPasse() {
        return motPasse;
    }

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public short getSauvegarde() {
        return sauvegarde;
    }

    public void setSauvegarde(short sauvegarde) {
        this.sauvegarde = sauvegarde;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getEmailSociete() {
        return emailSociete;
    }

    public void setEmailSociete(String emailSociete) {
        this.emailSociete = emailSociete;
    }

    public String getCh() {
        return ch;
    }

    public void setCh(String ch) {
        this.ch = ch;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getSiteWeb() {
        return siteWeb;
    }

    public void setSiteWeb(String siteWeb) {
        this.siteWeb = siteWeb;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDSociete != null ? iDSociete.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Societe)) {
            return false;
        }
        Societe other = (Societe) object;
        if ((this.iDSociete == null && other.iDSociete != null) || (this.iDSociete != null && !this.iDSociete.equals(other.iDSociete))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Societe[ iDSociete=" + iDSociete + " ]";
    }
    
}
