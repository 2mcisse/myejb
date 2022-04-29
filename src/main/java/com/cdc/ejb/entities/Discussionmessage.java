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
@Table(name = "discussionmessage")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Discussionmessage.findAll", query = "SELECT d FROM Discussionmessage d")
    , @NamedQuery(name = "Discussionmessage.findByIDDiscussionMessage", query = "SELECT d FROM Discussionmessage d WHERE d.iDDiscussionMessage = :iDDiscussionMessage")
    , @NamedQuery(name = "Discussionmessage.findByIDExpediteur", query = "SELECT d FROM Discussionmessage d WHERE d.iDExpediteur = :iDExpediteur")
    , @NamedQuery(name = "Discussionmessage.findByDateHeure", query = "SELECT d FROM Discussionmessage d WHERE d.dateHeure = :dateHeure")
    , @NamedQuery(name = "Discussionmessage.findByClePieceJointe", query = "SELECT d FROM Discussionmessage d WHERE d.clePieceJointe = :clePieceJointe")
    , @NamedQuery(name = "Discussionmessage.findByGestion", query = "SELECT d FROM Discussionmessage d WHERE d.gestion = :gestion")})
public class Discussionmessage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDiscussionMessage")
    private Integer iDDiscussionMessage;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDExpediteur")
    private int iDExpediteur;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateHeure")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHeure;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Message")
    private String message;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 160)
    @Column(name = "ClePieceJointe")
    private String clePieceJointe;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "IDDiscussion", referencedColumnName = "IDDiscussion")
    @ManyToOne(optional = false)
    private Discussion iDDiscussion;

    public Discussionmessage() {
    }

    public Discussionmessage(Integer iDDiscussionMessage) {
        this.iDDiscussionMessage = iDDiscussionMessage;
    }

    public Discussionmessage(Integer iDDiscussionMessage, int iDExpediteur, Date dateHeure, String message, String clePieceJointe) {
        this.iDDiscussionMessage = iDDiscussionMessage;
        this.iDExpediteur = iDExpediteur;
        this.dateHeure = dateHeure;
        this.message = message;
        this.clePieceJointe = clePieceJointe;
    }

    public Integer getIDDiscussionMessage() {
        return iDDiscussionMessage;
    }

    public void setIDDiscussionMessage(Integer iDDiscussionMessage) {
        this.iDDiscussionMessage = iDDiscussionMessage;
    }

    public int getIDExpediteur() {
        return iDExpediteur;
    }

    public void setIDExpediteur(int iDExpediteur) {
        this.iDExpediteur = iDExpediteur;
    }

    public Date getDateHeure() {
        return dateHeure;
    }

    public void setDateHeure(Date dateHeure) {
        this.dateHeure = dateHeure;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getClePieceJointe() {
        return clePieceJointe;
    }

    public void setClePieceJointe(String clePieceJointe) {
        this.clePieceJointe = clePieceJointe;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public Discussion getIDDiscussion() {
        return iDDiscussion;
    }

    public void setIDDiscussion(Discussion iDDiscussion) {
        this.iDDiscussion = iDDiscussion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDDiscussionMessage != null ? iDDiscussionMessage.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Discussionmessage)) {
            return false;
        }
        Discussionmessage other = (Discussionmessage) object;
        if ((this.iDDiscussionMessage == null && other.iDDiscussionMessage != null) || (this.iDDiscussionMessage != null && !this.iDDiscussionMessage.equals(other.iDDiscussionMessage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Discussionmessage[ iDDiscussionMessage=" + iDDiscussionMessage + " ]";
    }
    
}
