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
@Table(name = "billet")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Billet.findAll", query = "SELECT b FROM Billet b")
    , @NamedQuery(name = "Billet.findByIDBillet", query = "SELECT b FROM Billet b WHERE b.iDBillet = :iDBillet")
    , @NamedQuery(name = "Billet.findByTitre", query = "SELECT b FROM Billet b WHERE b.titre = :titre")
    , @NamedQuery(name = "Billet.findByDateHeureCreation", query = "SELECT b FROM Billet b WHERE b.dateHeureCreation = :dateHeureCreation")
    , @NamedQuery(name = "Billet.findByCommentairesAutorises", query = "SELECT b FROM Billet b WHERE b.commentairesAutorises = :commentairesAutorises")
    , @NamedQuery(name = "Billet.findBySuiviDesCommentairesActif", query = "SELECT b FROM Billet b WHERE b.suiviDesCommentairesActif = :suiviDesCommentairesActif")
    , @NamedQuery(name = "Billet.findByGestion", query = "SELECT b FROM Billet b WHERE b.gestion = :gestion")})
public class Billet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDBillet")
    private Integer iDBillet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "Titre")
    private String titre;
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
    @Column(name = "CommentairesAutorises")
    private short commentairesAutorises;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SuiviDesCommentairesActif")
    private short suiviDesCommentairesActif;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDBillet")
    private List<Commentaire> commentaireList;
    @JoinColumn(name = "IDBlog", referencedColumnName = "IDBlog")
    @ManyToOne(optional = false)
    private Blog iDBlog;
    @JoinColumn(name = "IDUtilisateur", referencedColumnName = "IDUtilisateur")
    @ManyToOne(optional = false)
    private Utilisateur iDUtilisateur;

    public Billet() {
    }

    public Billet(Integer iDBillet) {
        this.iDBillet = iDBillet;
    }

    public Billet(Integer iDBillet, String titre, String contenu, Date dateHeureCreation, short commentairesAutorises, short suiviDesCommentairesActif) {
        this.iDBillet = iDBillet;
        this.titre = titre;
        this.contenu = contenu;
        this.dateHeureCreation = dateHeureCreation;
        this.commentairesAutorises = commentairesAutorises;
        this.suiviDesCommentairesActif = suiviDesCommentairesActif;
    }

    public Integer getIDBillet() {
        return iDBillet;
    }

    public void setIDBillet(Integer iDBillet) {
        this.iDBillet = iDBillet;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
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

    public short getCommentairesAutorises() {
        return commentairesAutorises;
    }

    public void setCommentairesAutorises(short commentairesAutorises) {
        this.commentairesAutorises = commentairesAutorises;
    }

    public short getSuiviDesCommentairesActif() {
        return suiviDesCommentairesActif;
    }

    public void setSuiviDesCommentairesActif(short suiviDesCommentairesActif) {
        this.suiviDesCommentairesActif = suiviDesCommentairesActif;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<Commentaire> getCommentaireList() {
        return commentaireList;
    }

    public void setCommentaireList(List<Commentaire> commentaireList) {
        this.commentaireList = commentaireList;
    }

    public Blog getIDBlog() {
        return iDBlog;
    }

    public void setIDBlog(Blog iDBlog) {
        this.iDBlog = iDBlog;
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
        hash += (iDBillet != null ? iDBillet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Billet)) {
            return false;
        }
        Billet other = (Billet) object;
        if ((this.iDBillet == null && other.iDBillet != null) || (this.iDBillet != null && !this.iDBillet.equals(other.iDBillet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Billet[ iDBillet=" + iDBillet + " ]";
    }
    
}
