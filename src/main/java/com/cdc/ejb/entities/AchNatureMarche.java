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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "ach_nature_marche")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AchNatureMarche.findAll", query = "SELECT a FROM AchNatureMarche a")
    , @NamedQuery(name = "AchNatureMarche.findByIdnatureMarche", query = "SELECT a FROM AchNatureMarche a WHERE a.idnatureMarche = :idnatureMarche")
    , @NamedQuery(name = "AchNatureMarche.findByLibelle", query = "SELECT a FROM AchNatureMarche a WHERE a.libelle = :libelle")
    , @NamedQuery(name = "AchNatureMarche.findByGestion", query = "SELECT a FROM AchNatureMarche a WHERE a.gestion = :gestion")})
public class AchNatureMarche implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDNATURE_MARCHE")
    private Integer idnatureMarche;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "LIBELLE")
    private String libelle;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idnatureMarche")
    private List<AchMarches> achMarchesList;
    @OneToMany(mappedBy = "idnatureMarche")
    private List<AchLignesplanPassation> achLignesplanPassationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idnatureMarche")
    private List<EtapesPartypeappro> etapesPartypeapproList;

    public AchNatureMarche() {
    }

    public AchNatureMarche(Integer idnatureMarche) {
        this.idnatureMarche = idnatureMarche;
    }

    public AchNatureMarche(Integer idnatureMarche, String libelle) {
        this.idnatureMarche = idnatureMarche;
        this.libelle = libelle;
    }

    public Integer getIdnatureMarche() {
        return idnatureMarche;
    }

    public void setIdnatureMarche(Integer idnatureMarche) {
        this.idnatureMarche = idnatureMarche;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<AchMarches> getAchMarchesList() {
        return achMarchesList;
    }

    public void setAchMarchesList(List<AchMarches> achMarchesList) {
        this.achMarchesList = achMarchesList;
    }

    @XmlTransient
    public List<AchLignesplanPassation> getAchLignesplanPassationList() {
        return achLignesplanPassationList;
    }

    public void setAchLignesplanPassationList(List<AchLignesplanPassation> achLignesplanPassationList) {
        this.achLignesplanPassationList = achLignesplanPassationList;
    }

    @XmlTransient
    public List<EtapesPartypeappro> getEtapesPartypeapproList() {
        return etapesPartypeapproList;
    }

    public void setEtapesPartypeapproList(List<EtapesPartypeappro> etapesPartypeapproList) {
        this.etapesPartypeapproList = etapesPartypeapproList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnatureMarche != null ? idnatureMarche.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AchNatureMarche)) {
            return false;
        }
        AchNatureMarche other = (AchNatureMarche) object;
        if ((this.idnatureMarche == null && other.idnatureMarche != null) || (this.idnatureMarche != null && !this.idnatureMarche.equals(other.idnatureMarche))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.AchNatureMarche[ idnatureMarche=" + idnatureMarche + " ]";
    }
    
}
