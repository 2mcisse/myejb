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
@Table(name = "mt_comptes_principaux")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MtComptesPrincipaux.findAll", query = "SELECT m FROM MtComptesPrincipaux m")
    , @NamedQuery(name = "MtComptesPrincipaux.findByIdcomptesPrincipaux", query = "SELECT m FROM MtComptesPrincipaux m WHERE m.idcomptesPrincipaux = :idcomptesPrincipaux")
    , @NamedQuery(name = "MtComptesPrincipaux.findByCode", query = "SELECT m FROM MtComptesPrincipaux m WHERE m.code = :code")
    , @NamedQuery(name = "MtComptesPrincipaux.findByNom", query = "SELECT m FROM MtComptesPrincipaux m WHERE m.nom = :nom")
    , @NamedQuery(name = "MtComptesPrincipaux.findByIdgroupe", query = "SELECT m FROM MtComptesPrincipaux m WHERE m.idgroupe = :idgroupe")})
public class MtComptesPrincipaux implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCOMPTES_PRINCIPAUX")
    private Integer idcomptesPrincipaux;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CODE")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NOM")
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDGROUPE")
    private int idgroupe;

    public MtComptesPrincipaux() {
    }

    public MtComptesPrincipaux(Integer idcomptesPrincipaux) {
        this.idcomptesPrincipaux = idcomptesPrincipaux;
    }

    public MtComptesPrincipaux(Integer idcomptesPrincipaux, String code, String nom, int idgroupe) {
        this.idcomptesPrincipaux = idcomptesPrincipaux;
        this.code = code;
        this.nom = nom;
        this.idgroupe = idgroupe;
    }

    public Integer getIdcomptesPrincipaux() {
        return idcomptesPrincipaux;
    }

    public void setIdcomptesPrincipaux(Integer idcomptesPrincipaux) {
        this.idcomptesPrincipaux = idcomptesPrincipaux;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getIdgroupe() {
        return idgroupe;
    }

    public void setIdgroupe(int idgroupe) {
        this.idgroupe = idgroupe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcomptesPrincipaux != null ? idcomptesPrincipaux.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MtComptesPrincipaux)) {
            return false;
        }
        MtComptesPrincipaux other = (MtComptesPrincipaux) object;
        if ((this.idcomptesPrincipaux == null && other.idcomptesPrincipaux != null) || (this.idcomptesPrincipaux != null && !this.idcomptesPrincipaux.equals(other.idcomptesPrincipaux))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.MtComptesPrincipaux[ idcomptesPrincipaux=" + idcomptesPrincipaux + " ]";
    }
    
}
