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
@Table(name = "wiki")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Wiki.findAll", query = "SELECT w FROM Wiki w")
    , @NamedQuery(name = "Wiki.findByIdwiki", query = "SELECT w FROM Wiki w WHERE w.idwiki = :idwiki")
    , @NamedQuery(name = "Wiki.findByTitre", query = "SELECT w FROM Wiki w WHERE w.titre = :titre")
    , @NamedQuery(name = "Wiki.findByDateHeureCreation", query = "SELECT w FROM Wiki w WHERE w.dateHeureCreation = :dateHeureCreation")
    , @NamedQuery(name = "Wiki.findByEstBrouillon", query = "SELECT w FROM Wiki w WHERE w.estBrouillon = :estBrouillon")
    , @NamedQuery(name = "Wiki.findByDateHeureModification", query = "SELECT w FROM Wiki w WHERE w.dateHeureModification = :dateHeureModification")
    , @NamedQuery(name = "Wiki.findByIDModificateur", query = "SELECT w FROM Wiki w WHERE w.iDModificateur = :iDModificateur")})
public class Wiki implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDWIKI")
    private Integer idwiki;
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
    @Column(name = "EstBrouillon")
    private short estBrouillon;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateHeureModification")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHeureModification;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDModificateur")
    private int iDModificateur;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idwiki")
    private List<Wikiattache> wikiattacheList;
    @JoinColumn(name = "IDWIKICategorie", referencedColumnName = "IDWIKICategorie")
    @ManyToOne(optional = false)
    private Wikicategorie iDWIKICategorie;
    @JoinColumn(name = "IDUtilisateur", referencedColumnName = "IDUtilisateur")
    @ManyToOne(optional = false)
    private Utilisateur iDUtilisateur;

    public Wiki() {
    }

    public Wiki(Integer idwiki) {
        this.idwiki = idwiki;
    }

    public Wiki(Integer idwiki, String titre, String contenu, Date dateHeureCreation, short estBrouillon, Date dateHeureModification, int iDModificateur) {
        this.idwiki = idwiki;
        this.titre = titre;
        this.contenu = contenu;
        this.dateHeureCreation = dateHeureCreation;
        this.estBrouillon = estBrouillon;
        this.dateHeureModification = dateHeureModification;
        this.iDModificateur = iDModificateur;
    }

    public Integer getIdwiki() {
        return idwiki;
    }

    public void setIdwiki(Integer idwiki) {
        this.idwiki = idwiki;
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

    public short getEstBrouillon() {
        return estBrouillon;
    }

    public void setEstBrouillon(short estBrouillon) {
        this.estBrouillon = estBrouillon;
    }

    public Date getDateHeureModification() {
        return dateHeureModification;
    }

    public void setDateHeureModification(Date dateHeureModification) {
        this.dateHeureModification = dateHeureModification;
    }

    public int getIDModificateur() {
        return iDModificateur;
    }

    public void setIDModificateur(int iDModificateur) {
        this.iDModificateur = iDModificateur;
    }

    @XmlTransient
    public List<Wikiattache> getWikiattacheList() {
        return wikiattacheList;
    }

    public void setWikiattacheList(List<Wikiattache> wikiattacheList) {
        this.wikiattacheList = wikiattacheList;
    }

    public Wikicategorie getIDWIKICategorie() {
        return iDWIKICategorie;
    }

    public void setIDWIKICategorie(Wikicategorie iDWIKICategorie) {
        this.iDWIKICategorie = iDWIKICategorie;
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
        hash += (idwiki != null ? idwiki.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Wiki)) {
            return false;
        }
        Wiki other = (Wiki) object;
        if ((this.idwiki == null && other.idwiki != null) || (this.idwiki != null && !this.idwiki.equals(other.idwiki))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Wiki[ idwiki=" + idwiki + " ]";
    }
    
}
