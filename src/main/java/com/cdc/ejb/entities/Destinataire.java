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
@Table(name = "destinataire")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Destinataire.findAll", query = "SELECT d FROM Destinataire d")
    , @NamedQuery(name = "Destinataire.findByIDDestinataire", query = "SELECT d FROM Destinataire d WHERE d.iDDestinataire = :iDDestinataire")
    , @NamedQuery(name = "Destinataire.findByEmailDestinataire", query = "SELECT d FROM Destinataire d WHERE d.emailDestinataire = :emailDestinataire")
    , @NamedQuery(name = "Destinataire.findByEstLu", query = "SELECT d FROM Destinataire d WHERE d.estLu = :estLu")
    , @NamedQuery(name = "Destinataire.findByEstAccuse", query = "SELECT d FROM Destinataire d WHERE d.estAccuse = :estAccuse")
    , @NamedQuery(name = "Destinataire.findByDateHeureLecture", query = "SELECT d FROM Destinataire d WHERE d.dateHeureLecture = :dateHeureLecture")
    , @NamedQuery(name = "Destinataire.findByDateHeureAccuse", query = "SELECT d FROM Destinataire d WHERE d.dateHeureAccuse = :dateHeureAccuse")
    , @NamedQuery(name = "Destinataire.findByEstSupprime", query = "SELECT d FROM Destinataire d WHERE d.estSupprime = :estSupprime")
    , @NamedQuery(name = "Destinataire.findByEstDestinatairePrincipal", query = "SELECT d FROM Destinataire d WHERE d.estDestinatairePrincipal = :estDestinatairePrincipal")
    , @NamedQuery(name = "Destinataire.findByEstDestinataireSecondaire", query = "SELECT d FROM Destinataire d WHERE d.estDestinataireSecondaire = :estDestinataireSecondaire")
    , @NamedQuery(name = "Destinataire.findByEstDestinataireCache", query = "SELECT d FROM Destinataire d WHERE d.estDestinataireCache = :estDestinataireCache")
    , @NamedQuery(name = "Destinataire.findByGestion", query = "SELECT d FROM Destinataire d WHERE d.gestion = :gestion")})
public class Destinataire implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDestinataire")
    private Integer iDDestinataire;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 160)
    @Column(name = "EmailDestinataire")
    private String emailDestinataire;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstLu")
    private short estLu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstAccuse")
    private short estAccuse;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateHeureLecture")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHeureLecture;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateHeureAccuse")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHeureAccuse;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstSupprime")
    private short estSupprime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstDestinatairePrincipal")
    private short estDestinatairePrincipal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstDestinataireSecondaire")
    private short estDestinataireSecondaire;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstDestinataireCache")
    private short estDestinataireCache;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "IDUtilisateur", referencedColumnName = "IDUtilisateur")
    @ManyToOne(optional = false)
    private Utilisateur iDUtilisateur;
    @JoinColumn(name = "IDMessage", referencedColumnName = "IDMessage")
    @ManyToOne(optional = false)
    private Message iDMessage;

    public Destinataire() {
    }

    public Destinataire(Integer iDDestinataire) {
        this.iDDestinataire = iDDestinataire;
    }

    public Destinataire(Integer iDDestinataire, String emailDestinataire, short estLu, short estAccuse, Date dateHeureLecture, Date dateHeureAccuse, short estSupprime, short estDestinatairePrincipal, short estDestinataireSecondaire, short estDestinataireCache) {
        this.iDDestinataire = iDDestinataire;
        this.emailDestinataire = emailDestinataire;
        this.estLu = estLu;
        this.estAccuse = estAccuse;
        this.dateHeureLecture = dateHeureLecture;
        this.dateHeureAccuse = dateHeureAccuse;
        this.estSupprime = estSupprime;
        this.estDestinatairePrincipal = estDestinatairePrincipal;
        this.estDestinataireSecondaire = estDestinataireSecondaire;
        this.estDestinataireCache = estDestinataireCache;
    }

    public Integer getIDDestinataire() {
        return iDDestinataire;
    }

    public void setIDDestinataire(Integer iDDestinataire) {
        this.iDDestinataire = iDDestinataire;
    }

    public String getEmailDestinataire() {
        return emailDestinataire;
    }

    public void setEmailDestinataire(String emailDestinataire) {
        this.emailDestinataire = emailDestinataire;
    }

    public short getEstLu() {
        return estLu;
    }

    public void setEstLu(short estLu) {
        this.estLu = estLu;
    }

    public short getEstAccuse() {
        return estAccuse;
    }

    public void setEstAccuse(short estAccuse) {
        this.estAccuse = estAccuse;
    }

    public Date getDateHeureLecture() {
        return dateHeureLecture;
    }

    public void setDateHeureLecture(Date dateHeureLecture) {
        this.dateHeureLecture = dateHeureLecture;
    }

    public Date getDateHeureAccuse() {
        return dateHeureAccuse;
    }

    public void setDateHeureAccuse(Date dateHeureAccuse) {
        this.dateHeureAccuse = dateHeureAccuse;
    }

    public short getEstSupprime() {
        return estSupprime;
    }

    public void setEstSupprime(short estSupprime) {
        this.estSupprime = estSupprime;
    }

    public short getEstDestinatairePrincipal() {
        return estDestinatairePrincipal;
    }

    public void setEstDestinatairePrincipal(short estDestinatairePrincipal) {
        this.estDestinatairePrincipal = estDestinatairePrincipal;
    }

    public short getEstDestinataireSecondaire() {
        return estDestinataireSecondaire;
    }

    public void setEstDestinataireSecondaire(short estDestinataireSecondaire) {
        this.estDestinataireSecondaire = estDestinataireSecondaire;
    }

    public short getEstDestinataireCache() {
        return estDestinataireCache;
    }

    public void setEstDestinataireCache(short estDestinataireCache) {
        this.estDestinataireCache = estDestinataireCache;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public Utilisateur getIDUtilisateur() {
        return iDUtilisateur;
    }

    public void setIDUtilisateur(Utilisateur iDUtilisateur) {
        this.iDUtilisateur = iDUtilisateur;
    }

    public Message getIDMessage() {
        return iDMessage;
    }

    public void setIDMessage(Message iDMessage) {
        this.iDMessage = iDMessage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDDestinataire != null ? iDDestinataire.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Destinataire)) {
            return false;
        }
        Destinataire other = (Destinataire) object;
        if ((this.iDDestinataire == null && other.iDDestinataire != null) || (this.iDDestinataire != null && !this.iDDestinataire.equals(other.iDDestinataire))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Destinataire[ iDDestinataire=" + iDDestinataire + " ]";
    }
    
}
