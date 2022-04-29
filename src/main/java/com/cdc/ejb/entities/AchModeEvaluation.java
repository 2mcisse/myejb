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
@Table(name = "ach_mode_evaluation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AchModeEvaluation.findAll", query = "SELECT a FROM AchModeEvaluation a")
    , @NamedQuery(name = "AchModeEvaluation.findByIdachModeEvaluation", query = "SELECT a FROM AchModeEvaluation a WHERE a.idachModeEvaluation = :idachModeEvaluation")
    , @NamedQuery(name = "AchModeEvaluation.findByLibelle", query = "SELECT a FROM AchModeEvaluation a WHERE a.libelle = :libelle")
    , @NamedQuery(name = "AchModeEvaluation.findByGestion", query = "SELECT a FROM AchModeEvaluation a WHERE a.gestion = :gestion")})
public class AchModeEvaluation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDACH_MODE_EVALUATION")
    private Integer idachModeEvaluation;
    @Size(max = 100)
    @Column(name = "LIBELLE")
    private String libelle;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idachModeEvaluation")
    private List<AchMarches> achMarchesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idachModeEvaluation")
    private List<EtapesPartypeappro> etapesPartypeapproList;

    public AchModeEvaluation() {
    }

    public AchModeEvaluation(Integer idachModeEvaluation) {
        this.idachModeEvaluation = idachModeEvaluation;
    }

    public Integer getIdachModeEvaluation() {
        return idachModeEvaluation;
    }

    public void setIdachModeEvaluation(Integer idachModeEvaluation) {
        this.idachModeEvaluation = idachModeEvaluation;
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
    public List<EtapesPartypeappro> getEtapesPartypeapproList() {
        return etapesPartypeapproList;
    }

    public void setEtapesPartypeapproList(List<EtapesPartypeappro> etapesPartypeapproList) {
        this.etapesPartypeapproList = etapesPartypeapproList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idachModeEvaluation != null ? idachModeEvaluation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AchModeEvaluation)) {
            return false;
        }
        AchModeEvaluation other = (AchModeEvaluation) object;
        if ((this.idachModeEvaluation == null && other.idachModeEvaluation != null) || (this.idachModeEvaluation != null && !this.idachModeEvaluation.equals(other.idachModeEvaluation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.AchModeEvaluation[ idachModeEvaluation=" + idachModeEvaluation + " ]";
    }
    
}
