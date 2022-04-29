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
@Table(name = "etapes_marches_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EtapesMarchesDetails.findAll", query = "SELECT e FROM EtapesMarchesDetails e")
    , @NamedQuery(name = "EtapesMarchesDetails.findByIdetapesDetails", query = "SELECT e FROM EtapesMarchesDetails e WHERE e.idetapesDetails = :idetapesDetails")
    , @NamedQuery(name = "EtapesMarchesDetails.findByLibelle", query = "SELECT e FROM EtapesMarchesDetails e WHERE e.libelle = :libelle")
    , @NamedQuery(name = "EtapesMarchesDetails.findByFinEtape", query = "SELECT e FROM EtapesMarchesDetails e WHERE e.finEtape = :finEtape")
    , @NamedQuery(name = "EtapesMarchesDetails.findByNiveau", query = "SELECT e FROM EtapesMarchesDetails e WHERE e.niveau = :niveau")
    , @NamedQuery(name = "EtapesMarchesDetails.findByDureeEstimee", query = "SELECT e FROM EtapesMarchesDetails e WHERE e.dureeEstimee = :dureeEstimee")
    , @NamedQuery(name = "EtapesMarchesDetails.findByChoix", query = "SELECT e FROM EtapesMarchesDetails e WHERE e.choix = :choix")
    , @NamedQuery(name = "EtapesMarchesDetails.findByGestion", query = "SELECT e FROM EtapesMarchesDetails e WHERE e.gestion = :gestion")})
public class EtapesMarchesDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDETAPES_DETAILS")
    private Integer idetapesDetails;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "LIBELLE")
    private String libelle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FinEtape")
    private short finEtape;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NIVEAU")
    private int niveau;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DureeEstimee")
    private int dureeEstimee;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Choix")
    private short choix;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "IDETAPES", referencedColumnName = "IDETAPES")
    @ManyToOne(optional = false)
    private EtapesPartypeappro idetapes;

    public EtapesMarchesDetails() {
    }

    public EtapesMarchesDetails(Integer idetapesDetails) {
        this.idetapesDetails = idetapesDetails;
    }

    public EtapesMarchesDetails(Integer idetapesDetails, String libelle, short finEtape, int niveau, int dureeEstimee, short choix) {
        this.idetapesDetails = idetapesDetails;
        this.libelle = libelle;
        this.finEtape = finEtape;
        this.niveau = niveau;
        this.dureeEstimee = dureeEstimee;
        this.choix = choix;
    }

    public Integer getIdetapesDetails() {
        return idetapesDetails;
    }

    public void setIdetapesDetails(Integer idetapesDetails) {
        this.idetapesDetails = idetapesDetails;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public short getFinEtape() {
        return finEtape;
    }

    public void setFinEtape(short finEtape) {
        this.finEtape = finEtape;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getDureeEstimee() {
        return dureeEstimee;
    }

    public void setDureeEstimee(int dureeEstimee) {
        this.dureeEstimee = dureeEstimee;
    }

    public short getChoix() {
        return choix;
    }

    public void setChoix(short choix) {
        this.choix = choix;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public EtapesPartypeappro getIdetapes() {
        return idetapes;
    }

    public void setIdetapes(EtapesPartypeappro idetapes) {
        this.idetapes = idetapes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idetapesDetails != null ? idetapesDetails.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EtapesMarchesDetails)) {
            return false;
        }
        EtapesMarchesDetails other = (EtapesMarchesDetails) object;
        if ((this.idetapesDetails == null && other.idetapesDetails != null) || (this.idetapesDetails != null && !this.idetapesDetails.equals(other.idetapesDetails))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.EtapesMarchesDetails[ idetapesDetails=" + idetapesDetails + " ]";
    }
    
}
