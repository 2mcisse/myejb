/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "rga_user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RgaUser.findAll", query = "SELECT r FROM RgaUser r")
    , @NamedQuery(name = "RgaUser.findByIdrgaUser", query = "SELECT r FROM RgaUser r WHERE r.idrgaUser = :idrgaUser")
    , @NamedQuery(name = "RgaUser.findByPrenom", query = "SELECT r FROM RgaUser r WHERE r.prenom = :prenom")
    , @NamedQuery(name = "RgaUser.findByNom", query = "SELECT r FROM RgaUser r WHERE r.nom = :nom")
    , @NamedQuery(name = "RgaUser.findByMotPasse", query = "SELECT r FROM RgaUser r WHERE r.motPasse = :motPasse")
    , @NamedQuery(name = "RgaUser.findByLogin", query = "SELECT r FROM RgaUser r WHERE r.login = :login")
    , @NamedQuery(name = "RgaUser.findByPhotomimetype", query = "SELECT r FROM RgaUser r WHERE r.photomimetype = :photomimetype")
    , @NamedQuery(name = "RgaUser.findByCompact", query = "SELECT r FROM RgaUser r WHERE r.compact = :compact")})
public class RgaUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrga_user")
    private Integer idrgaUser;
    @Size(max = 50)
    @Column(name = "prenom")
    private String prenom;
    @Size(max = 100)
    @Column(name = "nom")
    private String nom;
    @Size(max = 50)
    @Column(name = "motPasse")
    private String motPasse;
    @Size(max = 50)
    @Column(name = "login")
    private String login;
    @Lob
    @Column(name = "photo")
    private byte[] photo;
    @Size(max = 20)
    @Column(name = "photomimetype")
    private String photomimetype;
    @Column(name = "compact")
    private Integer compact;
    @JoinColumn(name = "idservice", referencedColumnName = "idservice")
    @ManyToOne
    private RgaService idservice;
    @JoinColumn(name = "idrag_theme", referencedColumnName = "idrag_theme")
    @ManyToOne
    private RgaTheme idragTheme;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rgaUser")
    private List<RgaUserGroupe> rgaUserGroupeList;

    public RgaUser() {
    }

    public RgaUser(Integer idrgaUser) {
        this.idrgaUser = idrgaUser;
    }

    public Integer getIdrgaUser() {
        return idrgaUser;
    }

    public void setIdrgaUser(Integer idrgaUser) {
        this.idrgaUser = idrgaUser;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMotPasse() {
        return motPasse;
    }

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getPhotomimetype() {
        return photomimetype;
    }

    public void setPhotomimetype(String photomimetype) {
        this.photomimetype = photomimetype;
    }

    public Integer getCompact() {
        return compact;
    }

    public void setCompact(Integer compact) {
        this.compact = compact;
    }

    public RgaService getIdservice() {
        return idservice;
    }

    public void setIdservice(RgaService idservice) {
        this.idservice = idservice;
    }

    public RgaTheme getIdragTheme() {
        return idragTheme;
    }

    public void setIdragTheme(RgaTheme idragTheme) {
        this.idragTheme = idragTheme;
    }

    @XmlTransient
    public List<RgaUserGroupe> getRgaUserGroupeList() {
        return rgaUserGroupeList;
    }

    public void setRgaUserGroupeList(List<RgaUserGroupe> rgaUserGroupeList) {
        this.rgaUserGroupeList = rgaUserGroupeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrgaUser != null ? idrgaUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RgaUser)) {
            return false;
        }
        RgaUser other = (RgaUser) object;
        if ((this.idrgaUser == null && other.idrgaUser != null) || (this.idrgaUser != null && !this.idrgaUser.equals(other.idrgaUser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.RgaUser[ idrgaUser=" + idrgaUser + " ]";
    }
    
}
