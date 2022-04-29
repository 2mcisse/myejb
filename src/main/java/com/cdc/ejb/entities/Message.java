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
import javax.persistence.Lob;
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
@Table(name = "message")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Message.findAll", query = "SELECT m FROM Message m")
    , @NamedQuery(name = "Message.findByIDMessage", query = "SELECT m FROM Message m WHERE m.iDMessage = :iDMessage")
    , @NamedQuery(name = "Message.findByEmailExpediteur", query = "SELECT m FROM Message m WHERE m.emailExpediteur = :emailExpediteur")
    , @NamedQuery(name = "Message.findBySujet", query = "SELECT m FROM Message m WHERE m.sujet = :sujet")
    , @NamedQuery(name = "Message.findByDateHeureCreation", query = "SELECT m FROM Message m WHERE m.dateHeureCreation = :dateHeureCreation")
    , @NamedQuery(name = "Message.findByDateHeureEnvoi", query = "SELECT m FROM Message m WHERE m.dateHeureEnvoi = :dateHeureEnvoi")
    , @NamedQuery(name = "Message.findByEstDiffere", query = "SELECT m FROM Message m WHERE m.estDiffere = :estDiffere")
    , @NamedQuery(name = "Message.findByDateHeureProgramme", query = "SELECT m FROM Message m WHERE m.dateHeureProgramme = :dateHeureProgramme")
    , @NamedQuery(name = "Message.findByEstSupprime", query = "SELECT m FROM Message m WHERE m.estSupprime = :estSupprime")
    , @NamedQuery(name = "Message.findByEstUrgent", query = "SELECT m FROM Message m WHERE m.estUrgent = :estUrgent")
    , @NamedQuery(name = "Message.findByPriorite", query = "SELECT m FROM Message m WHERE m.priorite = :priorite")
    , @NamedQuery(name = "Message.findByIdentifiant", query = "SELECT m FROM Message m WHERE m.identifiant = :identifiant")
    , @NamedQuery(name = "Message.findByGestion", query = "SELECT m FROM Message m WHERE m.gestion = :gestion")})
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDMessage")
    private Integer iDMessage;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 160)
    @Column(name = "EmailExpediteur")
    private String emailExpediteur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 260)
    @Column(name = "Sujet")
    private String sujet;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Contenu")
    private String contenu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateHeureCreation")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHeureCreation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateHeureEnvoi")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHeureEnvoi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstDiffere")
    private short estDiffere;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateHeureProgramme")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHeureProgramme;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstSupprime")
    private short estSupprime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstUrgent")
    private short estUrgent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Priorite")
    private int priorite;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 160)
    @Column(name = "Identifiant")
    private String identifiant;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDMessage")
    private List<Destinataire> destinataireList;
    @JoinColumn(name = "IDExpediteur", referencedColumnName = "IDUtilisateur")
    @ManyToOne(optional = false)
    private Utilisateur iDExpediteur;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDMessage")
    private List<Messageetiquette> messageetiquetteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDMessage")
    private List<Messageattache> messageattacheList;

    public Message() {
    }

    public Message(Integer iDMessage) {
        this.iDMessage = iDMessage;
    }

    public Message(Integer iDMessage, String emailExpediteur, String sujet, String contenu, Date dateHeureCreation, Date dateHeureEnvoi, short estDiffere, Date dateHeureProgramme, short estSupprime, short estUrgent, int priorite, String identifiant) {
        this.iDMessage = iDMessage;
        this.emailExpediteur = emailExpediteur;
        this.sujet = sujet;
        this.contenu = contenu;
        this.dateHeureCreation = dateHeureCreation;
        this.dateHeureEnvoi = dateHeureEnvoi;
        this.estDiffere = estDiffere;
        this.dateHeureProgramme = dateHeureProgramme;
        this.estSupprime = estSupprime;
        this.estUrgent = estUrgent;
        this.priorite = priorite;
        this.identifiant = identifiant;
    }

    public Integer getIDMessage() {
        return iDMessage;
    }

    public void setIDMessage(Integer iDMessage) {
        this.iDMessage = iDMessage;
    }

    public String getEmailExpediteur() {
        return emailExpediteur;
    }

    public void setEmailExpediteur(String emailExpediteur) {
        this.emailExpediteur = emailExpediteur;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Date getDateHeureCreation() {
        return dateHeureCreation;
    }

    public void setDateHeureCreation(Date dateHeureCreation) {
        this.dateHeureCreation = dateHeureCreation;
    }

    public Date getDateHeureEnvoi() {
        return dateHeureEnvoi;
    }

    public void setDateHeureEnvoi(Date dateHeureEnvoi) {
        this.dateHeureEnvoi = dateHeureEnvoi;
    }

    public short getEstDiffere() {
        return estDiffere;
    }

    public void setEstDiffere(short estDiffere) {
        this.estDiffere = estDiffere;
    }

    public Date getDateHeureProgramme() {
        return dateHeureProgramme;
    }

    public void setDateHeureProgramme(Date dateHeureProgramme) {
        this.dateHeureProgramme = dateHeureProgramme;
    }

    public short getEstSupprime() {
        return estSupprime;
    }

    public void setEstSupprime(short estSupprime) {
        this.estSupprime = estSupprime;
    }

    public short getEstUrgent() {
        return estUrgent;
    }

    public void setEstUrgent(short estUrgent) {
        this.estUrgent = estUrgent;
    }

    public int getPriorite() {
        return priorite;
    }

    public void setPriorite(int priorite) {
        this.priorite = priorite;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<Destinataire> getDestinataireList() {
        return destinataireList;
    }

    public void setDestinataireList(List<Destinataire> destinataireList) {
        this.destinataireList = destinataireList;
    }

    public Utilisateur getIDExpediteur() {
        return iDExpediteur;
    }

    public void setIDExpediteur(Utilisateur iDExpediteur) {
        this.iDExpediteur = iDExpediteur;
    }

    @XmlTransient
    public List<Messageetiquette> getMessageetiquetteList() {
        return messageetiquetteList;
    }

    public void setMessageetiquetteList(List<Messageetiquette> messageetiquetteList) {
        this.messageetiquetteList = messageetiquetteList;
    }

    @XmlTransient
    public List<Messageattache> getMessageattacheList() {
        return messageattacheList;
    }

    public void setMessageattacheList(List<Messageattache> messageattacheList) {
        this.messageattacheList = messageattacheList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDMessage != null ? iDMessage.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Message)) {
            return false;
        }
        Message other = (Message) object;
        if ((this.iDMessage == null && other.iDMessage != null) || (this.iDMessage != null && !this.iDMessage.equals(other.iDMessage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Message[ iDMessage=" + iDMessage + " ]";
    }
    
}
