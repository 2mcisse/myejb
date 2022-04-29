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
@Table(name = "lien")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lien.findAll", query = "SELECT l FROM Lien l")
    , @NamedQuery(name = "Lien.findByIDLien", query = "SELECT l FROM Lien l WHERE l.iDLien = :iDLien")
    , @NamedQuery(name = "Lien.findByTitre", query = "SELECT l FROM Lien l WHERE l.titre = :titre")
    , @NamedQuery(name = "Lien.findByUrl", query = "SELECT l FROM Lien l WHERE l.url = :url")
    , @NamedQuery(name = "Lien.findByDateHeureCreation", query = "SELECT l FROM Lien l WHERE l.dateHeureCreation = :dateHeureCreation")
    , @NamedQuery(name = "Lien.findByTotalClic", query = "SELECT l FROM Lien l WHERE l.totalClic = :totalClic")
    , @NamedQuery(name = "Lien.findByTotalVote", query = "SELECT l FROM Lien l WHERE l.totalVote = :totalVote")
    , @NamedQuery(name = "Lien.findByNote", query = "SELECT l FROM Lien l WHERE l.note = :note")})
public class Lien implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDLien")
    private Integer iDLien;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "Titre")
    private String titre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 260)
    @Column(name = "URL")
    private String url;
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
    @Column(name = "TotalClic")
    private int totalClic;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TotalVote")
    private String totalVote;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Note")
    private double note;
    @JoinColumn(name = "IDUtilisateur", referencedColumnName = "IDUtilisateur")
    @ManyToOne(optional = false)
    private Utilisateur iDUtilisateur;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDLien")
    private List<Liennote> liennoteList;

    public Lien() {
    }

    public Lien(Integer iDLien) {
        this.iDLien = iDLien;
    }

    public Lien(Integer iDLien, String titre, String url, String description, Date dateHeureCreation, int totalClic, String totalVote, double note) {
        this.iDLien = iDLien;
        this.titre = titre;
        this.url = url;
        this.description = description;
        this.dateHeureCreation = dateHeureCreation;
        this.totalClic = totalClic;
        this.totalVote = totalVote;
        this.note = note;
    }

    public Integer getIDLien() {
        return iDLien;
    }

    public void setIDLien(Integer iDLien) {
        this.iDLien = iDLien;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public int getTotalClic() {
        return totalClic;
    }

    public void setTotalClic(int totalClic) {
        this.totalClic = totalClic;
    }

    public String getTotalVote() {
        return totalVote;
    }

    public void setTotalVote(String totalVote) {
        this.totalVote = totalVote;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public Utilisateur getIDUtilisateur() {
        return iDUtilisateur;
    }

    public void setIDUtilisateur(Utilisateur iDUtilisateur) {
        this.iDUtilisateur = iDUtilisateur;
    }

    @XmlTransient
    public List<Liennote> getLiennoteList() {
        return liennoteList;
    }

    public void setLiennoteList(List<Liennote> liennoteList) {
        this.liennoteList = liennoteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDLien != null ? iDLien.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lien)) {
            return false;
        }
        Lien other = (Lien) object;
        if ((this.iDLien == null && other.iDLien != null) || (this.iDLien != null && !this.iDLien.equals(other.iDLien))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Lien[ iDLien=" + iDLien + " ]";
    }
    
}
