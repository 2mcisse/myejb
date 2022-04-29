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
@Table(name = "sous_comptes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SousComptes.findAll", query = "SELECT s FROM SousComptes s")
    , @NamedQuery(name = "SousComptes.findByIdsousComptes", query = "SELECT s FROM SousComptes s WHERE s.idsousComptes = :idsousComptes")
    , @NamedQuery(name = "SousComptes.findByCode", query = "SELECT s FROM SousComptes s WHERE s.code = :code")
    , @NamedQuery(name = "SousComptes.findByLibelle", query = "SELECT s FROM SousComptes s WHERE s.libelle = :libelle")
    , @NamedQuery(name = "SousComptes.findByIdcomptesDivisionnaires", query = "SELECT s FROM SousComptes s WHERE s.idcomptesDivisionnaires = :idcomptesDivisionnaires")
    , @NamedQuery(name = "SousComptes.findByIdunites", query = "SELECT s FROM SousComptes s WHERE s.idunites = :idunites")
    , @NamedQuery(name = "SousComptes.findByQteMini", query = "SELECT s FROM SousComptes s WHERE s.qteMini = :qteMini")
    , @NamedQuery(name = "SousComptes.findByQteReappro", query = "SELECT s FROM SousComptes s WHERE s.qteReappro = :qteReappro")
    , @NamedQuery(name = "SousComptes.findByQteAlerte", query = "SELECT s FROM SousComptes s WHERE s.qteAlerte = :qteAlerte")})
public class SousComptes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSOUS_COMPTES")
    private Integer idsousComptes;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCOMPTES_DIVISIONNAIRES")
    private int idcomptesDivisionnaires;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDUNITES")
    private int idunites;
    @Basic(optional = false)
    @NotNull
    @Column(name = "QteMini")
    private long qteMini;
    @Basic(optional = false)
    @NotNull
    @Column(name = "QteReappro")
    private long qteReappro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "QteAlerte")
    private int qteAlerte;

    public SousComptes() {
    }

    public SousComptes(Integer idsousComptes) {
        this.idsousComptes = idsousComptes;
    }

    public SousComptes(Integer idsousComptes, String code, String libelle, int idcomptesDivisionnaires, int idunites, long qteMini, long qteReappro, int qteAlerte) {
        this.idsousComptes = idsousComptes;
        this.code = code;
        this.libelle = libelle;
        this.idcomptesDivisionnaires = idcomptesDivisionnaires;
        this.idunites = idunites;
        this.qteMini = qteMini;
        this.qteReappro = qteReappro;
        this.qteAlerte = qteAlerte;
    }

    public Integer getIdsousComptes() {
        return idsousComptes;
    }

    public void setIdsousComptes(Integer idsousComptes) {
        this.idsousComptes = idsousComptes;
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

    public int getIdcomptesDivisionnaires() {
        return idcomptesDivisionnaires;
    }

    public void setIdcomptesDivisionnaires(int idcomptesDivisionnaires) {
        this.idcomptesDivisionnaires = idcomptesDivisionnaires;
    }

    public int getIdunites() {
        return idunites;
    }

    public void setIdunites(int idunites) {
        this.idunites = idunites;
    }

    public long getQteMini() {
        return qteMini;
    }

    public void setQteMini(long qteMini) {
        this.qteMini = qteMini;
    }

    public long getQteReappro() {
        return qteReappro;
    }

    public void setQteReappro(long qteReappro) {
        this.qteReappro = qteReappro;
    }

    public int getQteAlerte() {
        return qteAlerte;
    }

    public void setQteAlerte(int qteAlerte) {
        this.qteAlerte = qteAlerte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsousComptes != null ? idsousComptes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SousComptes)) {
            return false;
        }
        SousComptes other = (SousComptes) object;
        if ((this.idsousComptes == null && other.idsousComptes != null) || (this.idsousComptes != null && !this.idsousComptes.equals(other.idsousComptes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.SousComptes[ idsousComptes=" + idsousComptes + " ]";
    }
    
}
