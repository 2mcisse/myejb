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
@Table(name = "pf_type_dec")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PfTypeDec.findAll", query = "SELECT p FROM PfTypeDec p")
    , @NamedQuery(name = "PfTypeDec.findByIdtypeDec", query = "SELECT p FROM PfTypeDec p WHERE p.idtypeDec = :idtypeDec")
    , @NamedQuery(name = "PfTypeDec.findByLibelle", query = "SELECT p FROM PfTypeDec p WHERE p.libelle = :libelle")
    , @NamedQuery(name = "PfTypeDec.findByIdnatureDec", query = "SELECT p FROM PfTypeDec p WHERE p.idnatureDec = :idnatureDec")
    , @NamedQuery(name = "PfTypeDec.findByOrdre", query = "SELECT p FROM PfTypeDec p WHERE p.ordre = :ordre")
    , @NamedQuery(name = "PfTypeDec.findByPAsAfficher", query = "SELECT p FROM PfTypeDec p WHERE p.pAsAfficher = :pAsAfficher")
    , @NamedQuery(name = "PfTypeDec.findByIdpfType", query = "SELECT p FROM PfTypeDec p WHERE p.idpfType = :idpfType")})
public class PfTypeDec implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTYPE_DEC")
    private Integer idtypeDec;
    @Size(max = 150)
    @Column(name = "LIBELLE")
    private String libelle;
    @Column(name = "IDNATURE_DEC")
    private Integer idnatureDec;
    @Column(name = "Ordre")
    private Integer ordre;
    @Column(name = "PAsAfficher")
    private Short pAsAfficher;
    @Column(name = "IDPF_TYPE")
    private Integer idpfType;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtypeDec")
    private List<PfDecaissements> pfDecaissementsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtypeDec")
    private List<PfTableauAmo> pfTableauAmoList;
    @OneToMany(mappedBy = "idtypeDec")
    private List<PfCorrespondances> pfCorrespondancesList;

    public PfTypeDec() {
    }

    public PfTypeDec(Integer idtypeDec) {
        this.idtypeDec = idtypeDec;
    }

    public Integer getIdtypeDec() {
        return idtypeDec;
    }

    public void setIdtypeDec(Integer idtypeDec) {
        this.idtypeDec = idtypeDec;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Integer getIdnatureDec() {
        return idnatureDec;
    }

    public void setIdnatureDec(Integer idnatureDec) {
        this.idnatureDec = idnatureDec;
    }

    public Integer getOrdre() {
        return ordre;
    }

    public void setOrdre(Integer ordre) {
        this.ordre = ordre;
    }

    public Short getPAsAfficher() {
        return pAsAfficher;
    }

    public void setPAsAfficher(Short pAsAfficher) {
        this.pAsAfficher = pAsAfficher;
    }

    public Integer getIdpfType() {
        return idpfType;
    }

    public void setIdpfType(Integer idpfType) {
        this.idpfType = idpfType;
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

    @XmlTransient
    public List<PfCorrespondances> getPfCorrespondancesList() {
        return pfCorrespondancesList;
    }

    public void setPfCorrespondancesList(List<PfCorrespondances> pfCorrespondancesList) {
        this.pfCorrespondancesList = pfCorrespondancesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtypeDec != null ? idtypeDec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PfTypeDec)) {
            return false;
        }
        PfTypeDec other = (PfTypeDec) object;
        if ((this.idtypeDec == null && other.idtypeDec != null) || (this.idtypeDec != null && !this.idtypeDec.equals(other.idtypeDec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.PfTypeDec[ idtypeDec=" + idtypeDec + " ]";
    }
    
}
