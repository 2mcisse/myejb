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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "rga_etat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RgaEtat.findAll", query = "SELECT r FROM RgaEtat r")
    , @NamedQuery(name = "RgaEtat.findByIdrgaEtat", query = "SELECT r FROM RgaEtat r WHERE r.idrgaEtat = :idrgaEtat")
    , @NamedQuery(name = "RgaEtat.findByNomjasper", query = "SELECT r FROM RgaEtat r WHERE r.nomjasper = :nomjasper")
    , @NamedQuery(name = "RgaEtat.findByNom", query = "SELECT r FROM RgaEtat r WHERE r.nom = :nom")
    , @NamedQuery(name = "RgaEtat.findByTitre", query = "SELECT r FROM RgaEtat r WHERE r.titre = :titre")
    , @NamedQuery(name = "RgaEtat.findByOrdre", query = "SELECT r FROM RgaEtat r WHERE r.ordre = :ordre")})
public class RgaEtat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrga_etat")
    private Integer idrgaEtat;
    @Size(max = 50)
    @Column(name = "nomjasper")
    private String nomjasper;
    @Size(max = 50)
    @Column(name = "nom")
    private String nom;
    @Size(max = 50)
    @Column(name = "titre")
    private String titre;
    @Column(name = "ordre")
    private Integer ordre;
    @JoinColumn(name = "idrga_menu", referencedColumnName = "idrga_menu")
    @ManyToOne(optional = false)
    private RgaMenu idrgaMenu;

    public RgaEtat() {
    }

    public RgaEtat(Integer idrgaEtat) {
        this.idrgaEtat = idrgaEtat;
    }

    public Integer getIdrgaEtat() {
        return idrgaEtat;
    }

    public void setIdrgaEtat(Integer idrgaEtat) {
        this.idrgaEtat = idrgaEtat;
    }

    public String getNomjasper() {
        return nomjasper;
    }

    public void setNomjasper(String nomjasper) {
        this.nomjasper = nomjasper;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Integer getOrdre() {
        return ordre;
    }

    public void setOrdre(Integer ordre) {
        this.ordre = ordre;
    }

    public RgaMenu getIdrgaMenu() {
        return idrgaMenu;
    }

    public void setIdrgaMenu(RgaMenu idrgaMenu) {
        this.idrgaMenu = idrgaMenu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrgaEtat != null ? idrgaEtat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RgaEtat)) {
            return false;
        }
        RgaEtat other = (RgaEtat) object;
        if ((this.idrgaEtat == null && other.idrgaEtat != null) || (this.idrgaEtat != null && !this.idrgaEtat.equals(other.idrgaEtat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.RgaEtat[ idrgaEtat=" + idrgaEtat + " ]";
    }
    
}
