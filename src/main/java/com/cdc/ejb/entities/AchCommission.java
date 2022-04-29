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
@Table(name = "ach_commission")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AchCommission.findAll", query = "SELECT a FROM AchCommission a")
    , @NamedQuery(name = "AchCommission.findByIDCommission", query = "SELECT a FROM AchCommission a WHERE a.iDCommission = :iDCommission")
    , @NamedQuery(name = "AchCommission.findByNom", query = "SELECT a FROM AchCommission a WHERE a.nom = :nom")
    , @NamedQuery(name = "AchCommission.findByPrenom", query = "SELECT a FROM AchCommission a WHERE a.prenom = :prenom")
    , @NamedQuery(name = "AchCommission.findByIDMarche", query = "SELECT a FROM AchCommission a WHERE a.iDMarche = :iDMarche")
    , @NamedQuery(name = "AchCommission.findByPresident", query = "SELECT a FROM AchCommission a WHERE a.president = :president")
    , @NamedQuery(name = "AchCommission.findBySecretaire", query = "SELECT a FROM AchCommission a WHERE a.secretaire = :secretaire")
    , @NamedQuery(name = "AchCommission.findByMatricule", query = "SELECT a FROM AchCommission a WHERE a.matricule = :matricule")
    , @NamedQuery(name = "AchCommission.findByIdachPhasesMarches", query = "SELECT a FROM AchCommission a WHERE a.idachPhasesMarches = :idachPhasesMarches")
    , @NamedQuery(name = "AchCommission.findByNumTiers", query = "SELECT a FROM AchCommission a WHERE a.numTiers = :numTiers")
    , @NamedQuery(name = "AchCommission.findByGestion", query = "SELECT a FROM AchCommission a WHERE a.gestion = :gestion")})
public class AchCommission implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCommission")
    private Integer iDCommission;
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
    @Column(name = "ID_Marche")
    private int iDMarche;
    @Basic(optional = false)
    @NotNull
    @Column(name = "President")
    private short president;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Secretaire")
    private short secretaire;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Matricule")
    private String matricule;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDACH_PHASES_MARCHES")
    private int idachPhasesMarches;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NumTiers")
    private long numTiers;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "IDSERVICES", referencedColumnName = "IDSERVICES")
    @ManyToOne(optional = false)
    private Services idservices;
    @JoinColumn(name = "IDREUNIONS", referencedColumnName = "IDREUNIONS")
    @ManyToOne(optional = false)
    private Reunions idreunions;

    public AchCommission() {
    }

    public AchCommission(Integer iDCommission) {
        this.iDCommission = iDCommission;
    }

    public AchCommission(Integer iDCommission, String nom, String prenom, int iDMarche, short president, short secretaire, String matricule, int idachPhasesMarches, long numTiers) {
        this.iDCommission = iDCommission;
        this.nom = nom;
        this.prenom = prenom;
        this.iDMarche = iDMarche;
        this.president = president;
        this.secretaire = secretaire;
        this.matricule = matricule;
        this.idachPhasesMarches = idachPhasesMarches;
        this.numTiers = numTiers;
    }

    public Integer getIDCommission() {
        return iDCommission;
    }

    public void setIDCommission(Integer iDCommission) {
        this.iDCommission = iDCommission;
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

    public int getIDMarche() {
        return iDMarche;
    }

    public void setIDMarche(int iDMarche) {
        this.iDMarche = iDMarche;
    }

    public short getPresident() {
        return president;
    }

    public void setPresident(short president) {
        this.president = president;
    }

    public short getSecretaire() {
        return secretaire;
    }

    public void setSecretaire(short secretaire) {
        this.secretaire = secretaire;
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

    public long getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(long numTiers) {
        this.numTiers = numTiers;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public Services getIdservices() {
        return idservices;
    }

    public void setIdservices(Services idservices) {
        this.idservices = idservices;
    }

    public Reunions getIdreunions() {
        return idreunions;
    }

    public void setIdreunions(Reunions idreunions) {
        this.idreunions = idreunions;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDCommission != null ? iDCommission.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AchCommission)) {
            return false;
        }
        AchCommission other = (AchCommission) object;
        if ((this.iDCommission == null && other.iDCommission != null) || (this.iDCommission != null && !this.iDCommission.equals(other.iDCommission))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.AchCommission[ iDCommission=" + iDCommission + " ]";
    }
    
}
