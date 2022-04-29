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
@Table(name = "ach_cpm")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AchCpm.findAll", query = "SELECT a FROM AchCpm a")
    , @NamedQuery(name = "AchCpm.findByIdccpm", query = "SELECT a FROM AchCpm a WHERE a.idccpm = :idccpm")
    , @NamedQuery(name = "AchCpm.findByNom", query = "SELECT a FROM AchCpm a WHERE a.nom = :nom")
    , @NamedQuery(name = "AchCpm.findByPrenom", query = "SELECT a FROM AchCpm a WHERE a.prenom = :prenom")
    , @NamedQuery(name = "AchCpm.findByIdservices", query = "SELECT a FROM AchCpm a WHERE a.idservices = :idservices")
    , @NamedQuery(name = "AchCpm.findByPresident", query = "SELECT a FROM AchCpm a WHERE a.president = :president")
    , @NamedQuery(name = "AchCpm.findByMatricule", query = "SELECT a FROM AchCpm a WHERE a.matricule = :matricule")
    , @NamedQuery(name = "AchCpm.findByGestion", query = "SELECT a FROM AchCpm a WHERE a.gestion = :gestion")})
public class AchCpm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCCPM")
    private Integer idccpm;
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
    @Size(min = 1, max = 50)
    @Column(name = "Matricule")
    private String matricule;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;

    public AchCpm() {
    }

    public AchCpm(Integer idccpm) {
        this.idccpm = idccpm;
    }

    public AchCpm(Integer idccpm, String nom, String prenom, int idservices, short president, String matricule) {
        this.idccpm = idccpm;
        this.nom = nom;
        this.prenom = prenom;
        this.idservices = idservices;
        this.president = president;
        this.matricule = matricule;
    }

    public Integer getIdccpm() {
        return idccpm;
    }

    public void setIdccpm(Integer idccpm) {
        this.idccpm = idccpm;
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

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
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
        hash += (idccpm != null ? idccpm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AchCpm)) {
            return false;
        }
        AchCpm other = (AchCpm) object;
        if ((this.idccpm == null && other.idccpm != null) || (this.idccpm != null && !this.idccpm.equals(other.idccpm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.AchCpm[ idccpm=" + idccpm + " ]";
    }
    
}
