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
import javax.persistence.Lob;
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
@Table(name = "contact")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contact.findAll", query = "SELECT c FROM Contact c")
    , @NamedQuery(name = "Contact.findByIDContact", query = "SELECT c FROM Contact c WHERE c.iDContact = :iDContact")
    , @NamedQuery(name = "Contact.findByEstUtilisateur", query = "SELECT c FROM Contact c WHERE c.estUtilisateur = :estUtilisateur")
    , @NamedQuery(name = "Contact.findByCivilite", query = "SELECT c FROM Contact c WHERE c.civilite = :civilite")
    , @NamedQuery(name = "Contact.findByNom", query = "SELECT c FROM Contact c WHERE c.nom = :nom")
    , @NamedQuery(name = "Contact.findByPrenom", query = "SELECT c FROM Contact c WHERE c.prenom = :prenom")
    , @NamedQuery(name = "Contact.findByEmail", query = "SELECT c FROM Contact c WHERE c.email = :email")
    , @NamedQuery(name = "Contact.findBySociete", query = "SELECT c FROM Contact c WHERE c.societe = :societe")
    , @NamedQuery(name = "Contact.findByCodePostal", query = "SELECT c FROM Contact c WHERE c.codePostal = :codePostal")
    , @NamedQuery(name = "Contact.findByVille", query = "SELECT c FROM Contact c WHERE c.ville = :ville")
    , @NamedQuery(name = "Contact.findBySiteInternet", query = "SELECT c FROM Contact c WHERE c.siteInternet = :siteInternet")
    , @NamedQuery(name = "Contact.findByPays", query = "SELECT c FROM Contact c WHERE c.pays = :pays")
    , @NamedQuery(name = "Contact.findByEstPublic", query = "SELECT c FROM Contact c WHERE c.estPublic = :estPublic")
    , @NamedQuery(name = "Contact.findByFonctionPoste", query = "SELECT c FROM Contact c WHERE c.fonctionPoste = :fonctionPoste")
    , @NamedQuery(name = "Contact.findByTelephone", query = "SELECT c FROM Contact c WHERE c.telephone = :telephone")
    , @NamedQuery(name = "Contact.findByFax", query = "SELECT c FROM Contact c WHERE c.fax = :fax")
    , @NamedQuery(name = "Contact.findByMobile", query = "SELECT c FROM Contact c WHERE c.mobile = :mobile")
    , @NamedQuery(name = "Contact.findByPoste", query = "SELECT c FROM Contact c WHERE c.poste = :poste")
    , @NamedQuery(name = "Contact.findByDateAnniversaire", query = "SELECT c FROM Contact c WHERE c.dateAnniversaire = :dateAnniversaire")
    , @NamedQuery(name = "Contact.findByNomAffiche", query = "SELECT c FROM Contact c WHERE c.nomAffiche = :nomAffiche")})
public class Contact implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDContact")
    private Integer iDContact;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstUtilisateur")
    private short estUtilisateur;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Civilite")
    private short civilite;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "Nom")
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "Prenom")
    private String prenom;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 160)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "Avatar")
    private byte[] avatar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "Societe")
    private String societe;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Adresse")
    private String adresse;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CodePostal")
    private String codePostal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "Ville")
    private String ville;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 260)
    @Column(name = "SiteInternet")
    private String siteInternet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "Pays")
    private String pays;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstPublic")
    private short estPublic;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "FonctionPoste")
    private String fonctionPoste;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "Telephone")
    private String telephone;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "Fax")
    private String fax;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "Mobile")
    private String mobile;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "Poste")
    private String poste;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateAnniversaire")
    @Temporal(TemporalType.DATE)
    private Date dateAnniversaire;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Commentaire")
    private String commentaire;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "NomAffiche")
    private String nomAffiche;
    @JoinColumn(name = "IDUtilisateur", referencedColumnName = "IDUtilisateur")
    @ManyToOne(optional = false)
    private Utilisateur iDUtilisateur;

    public Contact() {
    }

    public Contact(Integer iDContact) {
        this.iDContact = iDContact;
    }

    public Contact(Integer iDContact, short estUtilisateur, short civilite, String nom, String prenom, String email, byte[] avatar, String societe, String adresse, String codePostal, String ville, String siteInternet, String pays, short estPublic, String fonctionPoste, String telephone, String fax, String mobile, String poste, Date dateAnniversaire, String commentaire, String nomAffiche) {
        this.iDContact = iDContact;
        this.estUtilisateur = estUtilisateur;
        this.civilite = civilite;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.avatar = avatar;
        this.societe = societe;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.siteInternet = siteInternet;
        this.pays = pays;
        this.estPublic = estPublic;
        this.fonctionPoste = fonctionPoste;
        this.telephone = telephone;
        this.fax = fax;
        this.mobile = mobile;
        this.poste = poste;
        this.dateAnniversaire = dateAnniversaire;
        this.commentaire = commentaire;
        this.nomAffiche = nomAffiche;
    }

    public Integer getIDContact() {
        return iDContact;
    }

    public void setIDContact(Integer iDContact) {
        this.iDContact = iDContact;
    }

    public short getEstUtilisateur() {
        return estUtilisateur;
    }

    public void setEstUtilisateur(short estUtilisateur) {
        this.estUtilisateur = estUtilisateur;
    }

    public short getCivilite() {
        return civilite;
    }

    public void setCivilite(short civilite) {
        this.civilite = civilite;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getSiteInternet() {
        return siteInternet;
    }

    public void setSiteInternet(String siteInternet) {
        this.siteInternet = siteInternet;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public short getEstPublic() {
        return estPublic;
    }

    public void setEstPublic(short estPublic) {
        this.estPublic = estPublic;
    }

    public String getFonctionPoste() {
        return fonctionPoste;
    }

    public void setFonctionPoste(String fonctionPoste) {
        this.fonctionPoste = fonctionPoste;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public Date getDateAnniversaire() {
        return dateAnniversaire;
    }

    public void setDateAnniversaire(Date dateAnniversaire) {
        this.dateAnniversaire = dateAnniversaire;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getNomAffiche() {
        return nomAffiche;
    }

    public void setNomAffiche(String nomAffiche) {
        this.nomAffiche = nomAffiche;
    }

    public Utilisateur getIDUtilisateur() {
        return iDUtilisateur;
    }

    public void setIDUtilisateur(Utilisateur iDUtilisateur) {
        this.iDUtilisateur = iDUtilisateur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDContact != null ? iDContact.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contact)) {
            return false;
        }
        Contact other = (Contact) object;
        if ((this.iDContact == null && other.iDContact != null) || (this.iDContact != null && !this.iDContact.equals(other.iDContact))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Contact[ iDContact=" + iDContact + " ]";
    }
    
}
