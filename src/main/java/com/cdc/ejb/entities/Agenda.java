/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "agenda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agenda.findAll", query = "SELECT a FROM Agenda a")
    , @NamedQuery(name = "Agenda.findByIDAgenda", query = "SELECT a FROM Agenda a WHERE a.iDAgenda = :iDAgenda")
    , @NamedQuery(name = "Agenda.findByTitre", query = "SELECT a FROM Agenda a WHERE a.titre = :titre")
    , @NamedQuery(name = "Agenda.findByDateHeureCreation", query = "SELECT a FROM Agenda a WHERE a.dateHeureCreation = :dateHeureCreation")
    , @NamedQuery(name = "Agenda.findByEstRepete", query = "SELECT a FROM Agenda a WHERE a.estRepete = :estRepete")
    , @NamedQuery(name = "Agenda.findByIntervalleRepetition", query = "SELECT a FROM Agenda a WHERE a.intervalleRepetition = :intervalleRepetition")
    , @NamedQuery(name = "Agenda.findByDateHeureDebut", query = "SELECT a FROM Agenda a WHERE a.dateHeureDebut = :dateHeureDebut")
    , @NamedQuery(name = "Agenda.findByDateHeureFin", query = "SELECT a FROM Agenda a WHERE a.dateHeureFin = :dateHeureFin")
    , @NamedQuery(name = "Agenda.findByDuree", query = "SELECT a FROM Agenda a WHERE a.duree = :duree")
    , @NamedQuery(name = "Agenda.findByEstJourneeEntiere", query = "SELECT a FROM Agenda a WHERE a.estJourneeEntiere = :estJourneeEntiere")
    , @NamedQuery(name = "Agenda.findByGestion", query = "SELECT a FROM Agenda a WHERE a.gestion = :gestion")})
public class Agenda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDAgenda")
    private Integer iDAgenda;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "Titre")
    private String titre;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateHeureCreation")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHeureCreation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstRepete")
    private short estRepete;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "IntervalleRepetition")
    private String intervalleRepetition;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateHeureDebut")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHeureDebut;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateHeureFin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHeureFin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Duree")
    private BigInteger duree;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstJourneeEntiere")
    private short estJourneeEntiere;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "IDUtilisateur", referencedColumnName = "IDUtilisateur")
    @ManyToOne(optional = false)
    private Utilisateur iDUtilisateur;

    public Agenda() {
    }

    public Agenda(Integer iDAgenda) {
        this.iDAgenda = iDAgenda;
    }

    public Agenda(Integer iDAgenda, String titre, String description, Date dateHeureCreation, short estRepete, String intervalleRepetition, Date dateHeureDebut, Date dateHeureFin, BigInteger duree, short estJourneeEntiere) {
        this.iDAgenda = iDAgenda;
        this.titre = titre;
        this.description = description;
        this.dateHeureCreation = dateHeureCreation;
        this.estRepete = estRepete;
        this.intervalleRepetition = intervalleRepetition;
        this.dateHeureDebut = dateHeureDebut;
        this.dateHeureFin = dateHeureFin;
        this.duree = duree;
        this.estJourneeEntiere = estJourneeEntiere;
    }

    public Integer getIDAgenda() {
        return iDAgenda;
    }

    public void setIDAgenda(Integer iDAgenda) {
        this.iDAgenda = iDAgenda;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateHeureCreation() {
        return dateHeureCreation;
    }

    public void setDateHeureCreation(Date dateHeureCreation) {
        this.dateHeureCreation = dateHeureCreation;
    }

    public short getEstRepete() {
        return estRepete;
    }

    public void setEstRepete(short estRepete) {
        this.estRepete = estRepete;
    }

    public String getIntervalleRepetition() {
        return intervalleRepetition;
    }

    public void setIntervalleRepetition(String intervalleRepetition) {
        this.intervalleRepetition = intervalleRepetition;
    }

    public Date getDateHeureDebut() {
        return dateHeureDebut;
    }

    public void setDateHeureDebut(Date dateHeureDebut) {
        this.dateHeureDebut = dateHeureDebut;
    }

    public Date getDateHeureFin() {
        return dateHeureFin;
    }

    public void setDateHeureFin(Date dateHeureFin) {
        this.dateHeureFin = dateHeureFin;
    }

    public BigInteger getDuree() {
        return duree;
    }

    public void setDuree(BigInteger duree) {
        this.duree = duree;
    }

    public short getEstJourneeEntiere() {
        return estJourneeEntiere;
    }

    public void setEstJourneeEntiere(short estJourneeEntiere) {
        this.estJourneeEntiere = estJourneeEntiere;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDAgenda != null ? iDAgenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agenda)) {
            return false;
        }
        Agenda other = (Agenda) object;
        if ((this.iDAgenda == null && other.iDAgenda != null) || (this.iDAgenda != null && !this.iDAgenda.equals(other.iDAgenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Agenda[ iDAgenda=" + iDAgenda + " ]";
    }
    
}
