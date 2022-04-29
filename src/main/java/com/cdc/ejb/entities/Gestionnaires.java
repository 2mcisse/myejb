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
@Table(name = "gestionnaires")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gestionnaires.findAll", query = "SELECT g FROM Gestionnaires g")
    , @NamedQuery(name = "Gestionnaires.findByIdgestionnaires", query = "SELECT g FROM Gestionnaires g WHERE g.idgestionnaires = :idgestionnaires")
    , @NamedQuery(name = "Gestionnaires.findByType", query = "SELECT g FROM Gestionnaires g WHERE g.type = :type")
    , @NamedQuery(name = "Gestionnaires.findByNom", query = "SELECT g FROM Gestionnaires g WHERE g.nom = :nom")
    , @NamedQuery(name = "Gestionnaires.findByPrenom", query = "SELECT g FROM Gestionnaires g WHERE g.prenom = :prenom")
    , @NamedQuery(name = "Gestionnaires.findByPhoto", query = "SELECT g FROM Gestionnaires g WHERE g.photo = :photo")
    , @NamedQuery(name = "Gestionnaires.findByCivilite", query = "SELECT g FROM Gestionnaires g WHERE g.civilite = :civilite")
    , @NamedQuery(name = "Gestionnaires.findByDu", query = "SELECT g FROM Gestionnaires g WHERE g.du = :du")
    , @NamedQuery(name = "Gestionnaires.findByAu", query = "SELECT g FROM Gestionnaires g WHERE g.au = :au")
    , @NamedQuery(name = "Gestionnaires.findByFontion", query = "SELECT g FROM Gestionnaires g WHERE g.fontion = :fontion")
    , @NamedQuery(name = "Gestionnaires.findByGestion", query = "SELECT g FROM Gestionnaires g WHERE g.gestion = :gestion")})
public class Gestionnaires implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDGESTIONNAIRES")
    private Integer idgestionnaires;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TYPE")
    private short type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NOM")
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "PRENOM")
    private String prenom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PHOTO")
    private String photo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CIVILITE")
    private short civilite;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Du")
    @Temporal(TemporalType.DATE)
    private Date du;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Au")
    @Temporal(TemporalType.DATE)
    private Date au;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Fontion")
    private String fontion;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;

    public Gestionnaires() {
    }

    public Gestionnaires(Integer idgestionnaires) {
        this.idgestionnaires = idgestionnaires;
    }

    public Gestionnaires(Integer idgestionnaires, short type, String nom, String prenom, String photo, short civilite, Date du, Date au, String fontion) {
        this.idgestionnaires = idgestionnaires;
        this.type = type;
        this.nom = nom;
        this.prenom = prenom;
        this.photo = photo;
        this.civilite = civilite;
        this.du = du;
        this.au = au;
        this.fontion = fontion;
    }

    public Integer getIdgestionnaires() {
        return idgestionnaires;
    }

    public void setIdgestionnaires(Integer idgestionnaires) {
        this.idgestionnaires = idgestionnaires;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public short getCivilite() {
        return civilite;
    }

    public void setCivilite(short civilite) {
        this.civilite = civilite;
    }

    public Date getDu() {
        return du;
    }

    public void setDu(Date du) {
        this.du = du;
    }

    public Date getAu() {
        return au;
    }

    public void setAu(Date au) {
        this.au = au;
    }

    public String getFontion() {
        return fontion;
    }

    public void setFontion(String fontion) {
        this.fontion = fontion;
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
        hash += (idgestionnaires != null ? idgestionnaires.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gestionnaires)) {
            return false;
        }
        Gestionnaires other = (Gestionnaires) object;
        if ((this.idgestionnaires == null && other.idgestionnaires != null) || (this.idgestionnaires != null && !this.idgestionnaires.equals(other.idgestionnaires))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Gestionnaires[ idgestionnaires=" + idgestionnaires + " ]";
    }
    
}
