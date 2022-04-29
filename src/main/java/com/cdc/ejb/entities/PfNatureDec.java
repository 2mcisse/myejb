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
@Table(name = "pf_nature_dec")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PfNatureDec.findAll", query = "SELECT p FROM PfNatureDec p")
    , @NamedQuery(name = "PfNatureDec.findByIdnatureDec", query = "SELECT p FROM PfNatureDec p WHERE p.idnatureDec = :idnatureDec")
    , @NamedQuery(name = "PfNatureDec.findByLibelle", query = "SELECT p FROM PfNatureDec p WHERE p.libelle = :libelle")
    , @NamedQuery(name = "PfNatureDec.findByOrdre", query = "SELECT p FROM PfNatureDec p WHERE p.ordre = :ordre")
    , @NamedQuery(name = "PfNatureDec.findBySection", query = "SELECT p FROM PfNatureDec p WHERE p.section = :section")
    , @NamedQuery(name = "PfNatureDec.findByPAsAfficher", query = "SELECT p FROM PfNatureDec p WHERE p.pAsAfficher = :pAsAfficher")
    , @NamedQuery(name = "PfNatureDec.findByNature", query = "SELECT p FROM PfNatureDec p WHERE p.nature = :nature")})
public class PfNatureDec implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDNATURE_DEC")
    private Integer idnatureDec;
    @Size(max = 200)
    @Column(name = "LIBELLE")
    private String libelle;
    @Column(name = "Ordre")
    private Integer ordre;
    @Column(name = "Section")
    private Short section;
    @Column(name = "PAsAfficher")
    private Short pAsAfficher;
    @Column(name = "Nature")
    private Short nature;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idnatureDec")
    private List<PfDecaissements> pfDecaissementsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idnatureDec")
    private List<PfTableauAmo> pfTableauAmoList;

    public PfNatureDec() {
    }

    public PfNatureDec(Integer idnatureDec) {
        this.idnatureDec = idnatureDec;
    }

    public Integer getIdnatureDec() {
        return idnatureDec;
    }

    public void setIdnatureDec(Integer idnatureDec) {
        this.idnatureDec = idnatureDec;
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

    public Short getPAsAfficher() {
        return pAsAfficher;
    }

    public void setPAsAfficher(Short pAsAfficher) {
        this.pAsAfficher = pAsAfficher;
    }

    public Short getNature() {
        return nature;
    }

    public void setNature(Short nature) {
        this.nature = nature;
    }

    @XmlTransient
    public List<PfDecaissements> getPfDecaissementsList() {
        return pfDecaissementsList;
    }

    public void setPfDecaissementsList(List<PfDecaissements> pfDecaissementsList) {
        this.pfDecaissementsList = pfDecaissementsList;
    }

    @XmlTransient
    public List<PfTableauAmo> getPfTableauAmoList() {
        return pfTableauAmoList;
    }

    public void setPfTableauAmoList(List<PfTableauAmo> pfTableauAmoList) {
        this.pfTableauAmoList = pfTableauAmoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnatureDec != null ? idnatureDec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PfNatureDec)) {
            return false;
        }
        PfNatureDec other = (PfNatureDec) object;
        if ((this.idnatureDec == null && other.idnatureDec != null) || (this.idnatureDec != null && !this.idnatureDec.equals(other.idnatureDec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.PfNatureDec[ idnatureDec=" + idnatureDec + " ]";
    }
    
}
