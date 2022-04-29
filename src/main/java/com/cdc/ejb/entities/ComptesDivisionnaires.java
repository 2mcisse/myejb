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
@Table(name = "comptes_divisionnaires")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ComptesDivisionnaires.findAll", query = "SELECT c FROM ComptesDivisionnaires c")
    , @NamedQuery(name = "ComptesDivisionnaires.findByIdcomptesPrincipaux", query = "SELECT c FROM ComptesDivisionnaires c WHERE c.idcomptesPrincipaux = :idcomptesPrincipaux")
    , @NamedQuery(name = "ComptesDivisionnaires.findByCode", query = "SELECT c FROM ComptesDivisionnaires c WHERE c.code = :code")
    , @NamedQuery(name = "ComptesDivisionnaires.findByLibelle", query = "SELECT c FROM ComptesDivisionnaires c WHERE c.libelle = :libelle")
    , @NamedQuery(name = "ComptesDivisionnaires.findByIdcomptesDivisionnaires", query = "SELECT c FROM ComptesDivisionnaires c WHERE c.idcomptesDivisionnaires = :idcomptesDivisionnaires")})
public class ComptesDivisionnaires implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCOMPTES_PRINCIPAUX")
    private int idcomptesPrincipaux;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CODE")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "LIBELLE")
    private String libelle;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCOMPTES_DIVISIONNAIRES")
    private Integer idcomptesDivisionnaires;

    public ComptesDivisionnaires() {
    }

    public ComptesDivisionnaires(Integer idcomptesDivisionnaires) {
        this.idcomptesDivisionnaires = idcomptesDivisionnaires;
    }

    public ComptesDivisionnaires(Integer idcomptesDivisionnaires, int idcomptesPrincipaux, String code, String libelle) {
        this.idcomptesDivisionnaires = idcomptesDivisionnaires;
        this.idcomptesPrincipaux = idcomptesPrincipaux;
        this.code = code;
        this.libelle = libelle;
    }

    public int getIdcomptesPrincipaux() {
        return idcomptesPrincipaux;
    }

    public void setIdcomptesPrincipaux(int idcomptesPrincipaux) {
        this.idcomptesPrincipaux = idcomptesPrincipaux;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Integer getIdcomptesDivisionnaires() {
        return idcomptesDivisionnaires;
    }

    public void setIdcomptesDivisionnaires(Integer idcomptesDivisionnaires) {
        this.idcomptesDivisionnaires = idcomptesDivisionnaires;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcomptesDivisionnaires != null ? idcomptesDivisionnaires.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComptesDivisionnaires)) {
            return false;
        }
        ComptesDivisionnaires other = (ComptesDivisionnaires) object;
        if ((this.idcomptesDivisionnaires == null && other.idcomptesDivisionnaires != null) || (this.idcomptesDivisionnaires != null && !this.idcomptesDivisionnaires.equals(other.idcomptesDivisionnaires))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.ComptesDivisionnaires[ idcomptesDivisionnaires=" + idcomptesDivisionnaires + " ]";
    }
    
}
