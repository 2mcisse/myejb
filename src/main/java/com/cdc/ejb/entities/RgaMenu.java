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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "rga_menu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RgaMenu.findAll", query = "SELECT r FROM RgaMenu r")
    , @NamedQuery(name = "RgaMenu.findByIdrgaMenu", query = "SELECT r FROM RgaMenu r WHERE r.idrgaMenu = :idrgaMenu")
    , @NamedQuery(name = "RgaMenu.findByIdRGAMODULE", query = "SELECT r FROM RgaMenu r WHERE r.idRGAMODULE = :idRGAMODULE")
    , @NamedQuery(name = "RgaMenu.findByDescription", query = "SELECT r FROM RgaMenu r WHERE r.description = :description")
    , @NamedQuery(name = "RgaMenu.findByDateDebut", query = "SELECT r FROM RgaMenu r WHERE r.dateDebut = :dateDebut")
    , @NamedQuery(name = "RgaMenu.findByDateFin", query = "SELECT r FROM RgaMenu r WHERE r.dateFin = :dateFin")
    , @NamedQuery(name = "RgaMenu.findByFlgActif", query = "SELECT r FROM RgaMenu r WHERE r.flgActif = :flgActif")
    , @NamedQuery(name = "RgaMenu.findByParent", query = "SELECT r FROM RgaMenu r WHERE r.parent = :parent")
    , @NamedQuery(name = "RgaMenu.findByTypemenu", query = "SELECT r FROM RgaMenu r WHERE r.typemenu = :typemenu")
    , @NamedQuery(name = "RgaMenu.findByUrlRepertoire", query = "SELECT r FROM RgaMenu r WHERE r.urlRepertoire = :urlRepertoire")
    , @NamedQuery(name = "RgaMenu.findByLibelle", query = "SELECT r FROM RgaMenu r WHERE r.libelle = :libelle")
    , @NamedQuery(name = "RgaMenu.findByMenuicon", query = "SELECT r FROM RgaMenu r WHERE r.menuicon = :menuicon")
    , @NamedQuery(name = "RgaMenu.findByOrdre", query = "SELECT r FROM RgaMenu r WHERE r.ordre = :ordre")})
public class RgaMenu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrga_menu")
    private Integer idrgaMenu;
    @Column(name = "idRGA_MODULE")
    private Integer idRGAMODULE;
    @Size(max = 150)
    @Column(name = "description")
    private String description;
    @Column(name = "dateDebut")
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Column(name = "dateFin")
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    @Column(name = "flgActif")
    private Boolean flgActif;
    @Size(max = 50)
    @Column(name = "parent")
    private String parent;
    @Size(max = 10)
    @Column(name = "typemenu")
    private String typemenu;
    @Size(max = 50)
    @Column(name = "urlRepertoire")
    private String urlRepertoire;
    @Size(max = 100)
    @Column(name = "libelle")
    private String libelle;
    @Size(max = 150)
    @Column(name = "menuicon")
    private String menuicon;
    @Column(name = "ordre")
    private Integer ordre;
    @ManyToMany(mappedBy = "rgaMenuList")
    private List<RgaGroupe> rgaGroupeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idrgaMenu")
    private List<RgaEtat> rgaEtatList;

    public RgaMenu() {
    }

    public RgaMenu(Integer idrgaMenu) {
        this.idrgaMenu = idrgaMenu;
    }

    public Integer getIdrgaMenu() {
        return idrgaMenu;
    }

    public void setIdrgaMenu(Integer idrgaMenu) {
        this.idrgaMenu = idrgaMenu;
    }

    public Integer getIdRGAMODULE() {
        return idRGAMODULE;
    }

    public void setIdRGAMODULE(Integer idRGAMODULE) {
        this.idRGAMODULE = idRGAMODULE;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Boolean getFlgActif() {
        return flgActif;
    }

    public void setFlgActif(Boolean flgActif) {
        this.flgActif = flgActif;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getTypemenu() {
        return typemenu;
    }

    public void setTypemenu(String typemenu) {
        this.typemenu = typemenu;
    }

    public String getUrlRepertoire() {
        return urlRepertoire;
    }

    public void setUrlRepertoire(String urlRepertoire) {
        this.urlRepertoire = urlRepertoire;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMenuicon() {
        return menuicon;
    }

    public void setMenuicon(String menuicon) {
        this.menuicon = menuicon;
    }

    public Integer getOrdre() {
        return ordre;
    }

    public void setOrdre(Integer ordre) {
        this.ordre = ordre;
    }

    @XmlTransient
    public List<RgaGroupe> getRgaGroupeList() {
        return rgaGroupeList;
    }

    public void setRgaGroupeList(List<RgaGroupe> rgaGroupeList) {
        this.rgaGroupeList = rgaGroupeList;
    }

    @XmlTransient
    public List<RgaEtat> getRgaEtatList() {
        return rgaEtatList;
    }

    public void setRgaEtatList(List<RgaEtat> rgaEtatList) {
        this.rgaEtatList = rgaEtatList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrgaMenu != null ? idrgaMenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RgaMenu)) {
            return false;
        }
        RgaMenu other = (RgaMenu) object;
        if ((this.idrgaMenu == null && other.idrgaMenu != null) || (this.idrgaMenu != null && !this.idrgaMenu.equals(other.idrgaMenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.RgaMenu[ idrgaMenu=" + idrgaMenu + " ]";
    }
    
}
