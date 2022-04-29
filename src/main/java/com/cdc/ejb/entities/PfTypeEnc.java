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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "pf_type_enc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PfTypeEnc.findAll", query = "SELECT p FROM PfTypeEnc p")
    , @NamedQuery(name = "PfTypeEnc.findByIdtypeEnc", query = "SELECT p FROM PfTypeEnc p WHERE p.idtypeEnc = :idtypeEnc")
    , @NamedQuery(name = "PfTypeEnc.findByLibelle", query = "SELECT p FROM PfTypeEnc p WHERE p.libelle = :libelle")
    , @NamedQuery(name = "PfTypeEnc.findByOrdre", query = "SELECT p FROM PfTypeEnc p WHERE p.ordre = :ordre")
    , @NamedQuery(name = "PfTypeEnc.findByPAsAfficher", query = "SELECT p FROM PfTypeEnc p WHERE p.pAsAfficher = :pAsAfficher")})
public class PfTypeEnc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTYPE_ENC")
    private Integer idtypeEnc;
    @Size(max = 150)
    @Column(name = "LIBELLE")
    private String libelle;
    @Column(name = "Ordre")
    private Integer ordre;
    @Column(name = "PAsAfficher")
    private Short pAsAfficher;
    @JoinColumn(name = "IDNATURE_ENC", referencedColumnName = "IDNATURE_ENC")
    @ManyToOne
    private PfNatureEnc idnatureEnc;
    @JoinColumn(name = "IDPF_TYPE", referencedColumnName = "IDPF_TYPE")
    @ManyToOne
    private PfType idpfType;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtypeEnc")
    private List<PfTableauAmo> pfTableauAmoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtypeEnc")
    private List<PfEncaissements> pfEncaissementsList;
    @OneToMany(mappedBy = "idtypeEnc")
    private List<PfSupports> pfSupportsList;
    @OneToMany(mappedBy = "idtypeEnc")
    private List<PfCorrespondances> pfCorrespondancesList;

    public PfTypeEnc() {
    }

    public PfTypeEnc(Integer idtypeEnc) {
        this.idtypeEnc = idtypeEnc;
    }

    public Integer getIdtypeEnc() {
        return idtypeEnc;
    }

    public void setIdtypeEnc(Integer idtypeEnc) {
        this.idtypeEnc = idtypeEnc;
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

    public Short getPAsAfficher() {
        return pAsAfficher;
    }

    public void setPAsAfficher(Short pAsAfficher) {
        this.pAsAfficher = pAsAfficher;
    }

    public PfNatureEnc getIdnatureEnc() {
        return idnatureEnc;
    }

    public void setIdnatureEnc(PfNatureEnc idnatureEnc) {
        this.idnatureEnc = idnatureEnc;
    }

    public PfType getIdpfType() {
        return idpfType;
    }

    public void setIdpfType(PfType idpfType) {
        this.idpfType = idpfType;
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

    @XmlTransient
    public List<PfSupports> getPfSupportsList() {
        return pfSupportsList;
    }

    public void setPfSupportsList(List<PfSupports> pfSupportsList) {
        this.pfSupportsList = pfSupportsList;
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
        hash += (idtypeEnc != null ? idtypeEnc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PfTypeEnc)) {
            return false;
        }
        PfTypeEnc other = (PfTypeEnc) object;
        if ((this.idtypeEnc == null && other.idtypeEnc != null) || (this.idtypeEnc != null && !this.idtypeEnc.equals(other.idtypeEnc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.PfTypeEnc[ idtypeEnc=" + idtypeEnc + " ]";
    }
    
}
