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
@Table(name = "ach_commission_des_marches")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AchCommissionDesMarches.findAll", query = "SELECT a FROM AchCommissionDesMarches a")
    , @NamedQuery(name = "AchCommissionDesMarches.findByIDCommission", query = "SELECT a FROM AchCommissionDesMarches a WHERE a.iDCommission = :iDCommission")
    , @NamedQuery(name = "AchCommissionDesMarches.findByNom", query = "SELECT a FROM AchCommissionDesMarches a WHERE a.nom = :nom")
    , @NamedQuery(name = "AchCommissionDesMarches.findByPrenom", query = "SELECT a FROM AchCommissionDesMarches a WHERE a.prenom = :prenom")
    , @NamedQuery(name = "AchCommissionDesMarches.findByIdservices", query = "SELECT a FROM AchCommissionDesMarches a WHERE a.idservices = :idservices")
    , @NamedQuery(name = "AchCommissionDesMarches.findByIDMarche", query = "SELECT a FROM AchCommissionDesMarches a WHERE a.iDMarche = :iDMarche")
    , @NamedQuery(name = "AchCommissionDesMarches.findByPresident", query = "SELECT a FROM AchCommissionDesMarches a WHERE a.president = :president")
    , @NamedQuery(name = "AchCommissionDesMarches.findBySecretaire", query = "SELECT a FROM AchCommissionDesMarches a WHERE a.secretaire = :secretaire")
    , @NamedQuery(name = "AchCommissionDesMarches.findByMatricule", query = "SELECT a FROM AchCommissionDesMarches a WHERE a.matricule = :matricule")
    , @NamedQuery(name = "AchCommissionDesMarches.findByIdachPhasesMarches", query = "SELECT a FROM AchCommissionDesMarches a WHERE a.idachPhasesMarches = :idachPhasesMarches")
    , @NamedQuery(name = "AchCommissionDesMarches.findByNumTiers", query = "SELECT a FROM AchCommissionDesMarches a WHERE a.numTiers = :numTiers")
    , @NamedQuery(name = "AchCommissionDesMarches.findByGestion", query = "SELECT a FROM AchCommissionDesMarches a WHERE a.gestion = :gestion")})
public class AchCommissionDesMarches implements Serializable {

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
    @Column(name = "IDSERVICES")
    private int idservices;
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

    public AchCommissionDesMarches() {
    }

    public AchCommissionDesMarches(Integer iDCommission) {
        this.iDCommission = iDCommission;
    }

    public AchCommissionDesMarches(Integer iDCommission, String nom, String prenom, int idservices, int iDMarche, short president, short secretaire, String matricule, int idachPhasesMarches, long numTiers) {
        this.iDCommission = iDCommission;
        this.nom = nom;
        this.prenom = prenom;
        this.idservices = idservices;
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

    public int getIdservices() {
        return idservices;
    }

    public void setIdservices(int idservices) {
        this.idservices = idservices;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDCommission != null ? iDCommission.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AchCommissionDesMarches)) {
            return false;
        }
        AchCommissionDesMarches other = (AchCommissionDesMarches) object;
        if ((this.iDCommission == null && other.iDCommission != null) || (this.iDCommission != null && !this.iDCommission.equals(other.iDCommission))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.AchCommissionDesMarches[ iDCommission=" + iDCommission + " ]";
    }
    
}
