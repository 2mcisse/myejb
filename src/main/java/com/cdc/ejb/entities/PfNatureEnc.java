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
@Table(name = "pf_nature_enc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PfNatureEnc.findAll", query = "SELECT p FROM PfNatureEnc p")
    , @NamedQuery(name = "PfNatureEnc.findByIdnatureEnc", query = "SELECT p FROM PfNatureEnc p WHERE p.idnatureEnc = :idnatureEnc")
    , @NamedQuery(name = "PfNatureEnc.findByLibelle", query = "SELECT p FROM PfNatureEnc p WHERE p.libelle = :libelle")
    , @NamedQuery(name = "PfNatureEnc.findByOrdre", query = "SELECT p FROM PfNatureEnc p WHERE p.ordre = :ordre")
    , @NamedQuery(name = "PfNatureEnc.findBySection", query = "SELECT p FROM PfNatureEnc p WHERE p.section = :section")
    , @NamedQuery(name = "PfNatureEnc.findByNature", query = "SELECT p FROM PfNatureEnc p WHERE p.nature = :nature")
    , @NamedQuery(name = "PfNatureEnc.findByPAsAfficher", query = "SELECT p FROM PfNatureEnc p WHERE p.pAsAfficher = :pAsAfficher")})
public class PfNatureEnc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDNATURE_ENC")
    private Integer idnatureEnc;
    @Size(max = 200)
    @Column(name = "LIBELLE")
    private String libelle;
    @Column(name = "Ordre")
    private Integer ordre;
    @Column(name = "Section")
    private Short section;
    @Column(name = "Nature")
    private Short nature;
    @Column(name = "PAsAfficher")
    private Short pAsAfficher;
    @OneToMany(mappedBy = "idnatureEnc")
    private List<PfTypeEnc> pfTypeEncList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idnatureEnc")
    private List<PfTableauAmo> pfTableauAmoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idnatureEnc")
    private List<PfEncaissements> pfEncaissementsList;

    public PfNatureEnc() {
    }

    public PfNatureEnc(Integer idnatureEnc) {
        this.idnatureEnc = idnatureEnc;
    }

    public Integer getIdnatureEnc() {
        return idnatureEnc;
    }

    public void setIdnatureEnc(Integer idnatureEnc) {
        this.idnatureEnc = idnatureEnc;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Integer getOrdre() {
        return ordre;
    }

    public void setOrdre(Integer ordre) {
        this.ordre = ordre;
    }

    public Short getSection() {
        return section;
    }

    public void setSection(Short section) {
        this.section = section;
    }

    public Short getNature() {
        return nature;
    }

    public void setNature(Short nature) {
        this.nature = nature;
    }

    public Short getPAsAfficher() {
        return pAsAfficher;
    }

    public void setPAsAfficher(Short pAsAfficher) {
        this.pAsAfficher = pAsAfficher;
    }

    @XmlTransient
    public List<PfTypeEnc> getPfTypeEncList() {
        return pfTypeEncList;
    }

    public void setPfTypeEncList(List<PfTypeEnc> pfTypeEncList) {
        this.pfTypeEncList = pfTypeEncList;
    }

    @XmlTransient
    public List<PfTableauAmo> getPfTableauAmoList() {
        return pfTableauAmoList;
    }

    public void setPfTableauAmoList(List<PfTableauAmo> pfTableauAmoList) {
        this.pfTableauAmoList = pfTableauAmoList;
    }

    @XmlTransient
    public List<PfEncaissements> getPfEncaissementsList() {
        return pfEncaissementsList;
    }

    public void setPfEncaissementsList(List<PfEncaissements> pfEncaissementsList) {
        this.pfEncaissementsList = pfEncaissementsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnatureEnc != null ? idnatureEnc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PfNatureEnc)) {
            return false;
        }
        PfNatureEnc other = (PfNatureEnc) object;
        if ((this.idnatureEnc == null && other.idnatureEnc != null) || (this.idnatureEnc != null && !this.idnatureEnc.equals(other.idnatureEnc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.PfNatureEnc[ idnatureEnc=" + idnatureEnc + " ]";
    }
    
}
