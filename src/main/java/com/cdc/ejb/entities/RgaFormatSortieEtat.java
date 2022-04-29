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
@Table(name = "rga_format_sortie_etat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RgaFormatSortieEtat.findAll", query = "SELECT r FROM RgaFormatSortieEtat r")
    , @NamedQuery(name = "RgaFormatSortieEtat.findByIdrgaFormatSortieEtat", query = "SELECT r FROM RgaFormatSortieEtat r WHERE r.idrgaFormatSortieEtat = :idrgaFormatSortieEtat")
    , @NamedQuery(name = "RgaFormatSortieEtat.findByDescription", query = "SELECT r FROM RgaFormatSortieEtat r WHERE r.description = :description")
    , @NamedQuery(name = "RgaFormatSortieEtat.findByFlgActif", query = "SELECT r FROM RgaFormatSortieEtat r WHERE r.flgActif = :flgActif")
    , @NamedQuery(name = "RgaFormatSortieEtat.findByIcon", query = "SELECT r FROM RgaFormatSortieEtat r WHERE r.icon = :icon")
    , @NamedQuery(name = "RgaFormatSortieEtat.findByExtension", query = "SELECT r FROM RgaFormatSortieEtat r WHERE r.extension = :extension")
    , @NamedQuery(name = "RgaFormatSortieEtat.findByTypefichier", query = "SELECT r FROM RgaFormatSortieEtat r WHERE r.typefichier = :typefichier")})
public class RgaFormatSortieEtat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "idrga_format_sortie_etat")
    private String idrgaFormatSortieEtat;
    @Size(max = 50)
    @Column(name = "description")
    private String description;
    @Column(name = "flgActif")
    private Boolean flgActif;
    @Size(max = 10)
    @Column(name = "icon")
    private String icon;
    @Size(max = 10)
    @Column(name = "extension")
    private String extension;
    @Size(max = 50)
    @Column(name = "typefichier")
    private String typefichier;

    public RgaFormatSortieEtat() {
    }

    public RgaFormatSortieEtat(String idrgaFormatSortieEtat) {
        this.idrgaFormatSortieEtat = idrgaFormatSortieEtat;
    }

    public String getIdrgaFormatSortieEtat() {
        return idrgaFormatSortieEtat;
    }

    public void setIdrgaFormatSortieEtat(String idrgaFormatSortieEtat) {
        this.idrgaFormatSortieEtat = idrgaFormatSortieEtat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getFlgActif() {
        return flgActif;
    }

    public void setFlgActif(Boolean flgActif) {
        this.flgActif = flgActif;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getTypefichier() {
        return typefichier;
    }

    public void setTypefichier(String typefichier) {
        this.typefichier = typefichier;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrgaFormatSortieEtat != null ? idrgaFormatSortieEtat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RgaFormatSortieEtat)) {
            return false;
        }
        RgaFormatSortieEtat other = (RgaFormatSortieEtat) object;
        if ((this.idrgaFormatSortieEtat == null && other.idrgaFormatSortieEtat != null) || (this.idrgaFormatSortieEtat != null && !this.idrgaFormatSortieEtat.equals(other.idrgaFormatSortieEtat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.RgaFormatSortieEtat[ idrgaFormatSortieEtat=" + idrgaFormatSortieEtat + " ]";
    }
    
}
