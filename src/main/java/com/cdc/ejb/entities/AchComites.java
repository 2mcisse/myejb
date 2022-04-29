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
@Table(name = "ach_comites")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AchComites.findAll", query = "SELECT a FROM AchComites a")
    , @NamedQuery(name = "AchComites.findByIDComite", query = "SELECT a FROM AchComites a WHERE a.iDComite = :iDComite")
    , @NamedQuery(name = "AchComites.findByNom", query = "SELECT a FROM AchComites a WHERE a.nom = :nom")
    , @NamedQuery(name = "AchComites.findByPrenom", query = "SELECT a FROM AchComites a WHERE a.prenom = :prenom")
    , @NamedQuery(name = "AchComites.findByIdservices", query = "SELECT a FROM AchComites a WHERE a.idservices = :idservices")
    , @NamedQuery(name = "AchComites.findByPresident", query = "SELECT a FROM AchComites a WHERE a.president = :president")
    , @NamedQuery(name = "AchComites.findByExterieur", query = "SELECT a FROM AchComites a WHERE a.exterieur = :exterieur")
    , @NamedQuery(name = "AchComites.findByMatricule", query = "SELECT a FROM AchComites a WHERE a.matricule = :matricule")
    , @NamedQuery(name = "AchComites.findByIdachPhasesMarches", query = "SELECT a FROM AchComites a WHERE a.idachPhasesMarches = :idachPhasesMarches")
    , @NamedQuery(name = "AchComites.findByGestion", query = "SELECT a FROM AchComites a WHERE a.gestion = :gestion")})
public class AchComites implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDComite")
    private Integer iDComite;
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
    @Column(name = "IDSERVICES")
    private int idservices;
    @Basic(optional = false)
    @NotNull
    @Column(name = "President")
    private short president;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Exterieur")
    private short exterieur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Matricule")
    private String matricule;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDACH_PHASES_MARCHES")
    private int idachPhasesMarches;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "ID_Marche", referencedColumnName = "ID_Marche")
    @ManyToOne(optional = false)
    private AchMarches iDMarche;

    public AchComites() {
    }

    public AchComites(Integer iDComite) {
        this.iDComite = iDComite;
    }

    public AchComites(Integer iDComite, String nom, String prenom, int idservices, short president, short exterieur, String matricule, int idachPhasesMarches) {
        this.iDComite = iDComite;
        this.nom = nom;
        this.prenom = prenom;
        this.idservices = idservices;
        this.president = president;
        this.exterieur = exterieur;
        this.matricule = matricule;
        this.idachPhasesMarches = idachPhasesMarches;
    }

    public Integer getIDComite() {
        return iDComite;
    }

    public void setIDComite(Integer iDComite) {
        this.iDComite = iDComite;
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

    public int getIdservices() {
        return idservices;
    }

    public void setIdservices(int idservices) {
        this.idservices = idservices;
    }

    public short getPresident() {
        return president;
    }

    public void setPresident(short president) {
        this.president = president;
    }

    public short getExterieur() {
        return exterieur;
    }

    public void setExterieur(short exterieur) {
        this.exterieur = exterieur;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public int getIdachPhasesMarches() {
        return idachPhasesMarches;
    }

    public void setIdachPhasesMarches(int idachPhasesMarches) {
        this.idachPhasesMarches = idachPhasesMarches;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public AchMarches getIDMarche() {
        return iDMarche;
    }

    public void setIDMarche(AchMarches iDMarche) {
        this.iDMarche = iDMarche;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDComite != null ? iDComite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AchComites)) {
            return false;
        }
        AchComites other = (AchComites) object;
        if ((this.iDComite == null && other.iDComite != null) || (this.iDComite != null && !this.iDComite.equals(other.iDComite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.AchComites[ iDComite=" + iDComite + " ]";
    }
    
}
