/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "mt_mouvements")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MtMouvements.findAll", query = "SELECT m FROM MtMouvements m")
    , @NamedQuery(name = "MtMouvements.findByIdmouvements", query = "SELECT m FROM MtMouvements m WHERE m.idmouvements = :idmouvements")
    , @NamedQuery(name = "MtMouvements.findByNumero", query = "SELECT m FROM MtMouvements m WHERE m.numero = :numero")
    , @NamedQuery(name = "MtMouvements.findByDate", query = "SELECT m FROM MtMouvements m WHERE m.date = :date")
    , @NamedQuery(name = "MtMouvements.findByDescription", query = "SELECT m FROM MtMouvements m WHERE m.description = :description")
    , @NamedQuery(name = "MtMouvements.findByIdtypeEntree", query = "SELECT m FROM MtMouvements m WHERE m.idtypeEntree = :idtypeEntree")
    , @NamedQuery(name = "MtMouvements.findByIdtypeSortie", query = "SELECT m FROM MtMouvements m WHERE m.idtypeSortie = :idtypeSortie")
    , @NamedQuery(name = "MtMouvements.findByEtat", query = "SELECT m FROM MtMouvements m WHERE m.etat = :etat")
    , @NamedQuery(name = "MtMouvements.findByIdmagasin", query = "SELECT m FROM MtMouvements m WHERE m.idmagasin = :idmagasin")
    , @NamedQuery(name = "MtMouvements.findByNumTiers", query = "SELECT m FROM MtMouvements m WHERE m.numTiers = :numTiers")
    , @NamedQuery(name = "MtMouvements.findByIdlocaux", query = "SELECT m FROM MtMouvements m WHERE m.idlocaux = :idlocaux")
    , @NamedQuery(name = "MtMouvements.findByNumImmat", query = "SELECT m FROM MtMouvements m WHERE m.numImmat = :numImmat")
    , @NamedQuery(name = "MtMouvements.findByAnneeBudg", query = "SELECT m FROM MtMouvements m WHERE m.anneeBudg = :anneeBudg")
    , @NamedQuery(name = "MtMouvements.findByGestion", query = "SELECT m FROM MtMouvements m WHERE m.gestion = :gestion")})
public class MtMouvements implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDMOUVEMENTS")
    private Integer idmouvements;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NUMERO")
    private String numero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTYPE_ENTREE")
    private int idtypeEntree;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTYPE_SORTIE")
    private int idtypeSortie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ETAT")
    private short etat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDMAGASIN")
    private int idmagasin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NumTiers")
    private long numTiers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDLOCAUX")
    private int idlocaux;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NumImmat")
    private String numImmat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "AnneeBudg")
    private String anneeBudg;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;

    public MtMouvements() {
    }

    public MtMouvements(Integer idmouvements) {
        this.idmouvements = idmouvements;
    }

    public MtMouvements(Integer idmouvements, String numero, Date date, String description, int idtypeEntree, int idtypeSortie, short etat, int idmagasin, long numTiers, int idlocaux, String numImmat, String anneeBudg) {
        this.idmouvements = idmouvements;
        this.numero = numero;
        this.date = date;
        this.description = description;
        this.idtypeEntree = idtypeEntree;
        this.idtypeSortie = idtypeSortie;
        this.etat = etat;
        this.idmagasin = idmagasin;
        this.numTiers = numTiers;
        this.idlocaux = idlocaux;
        this.numImmat = numImmat;
        this.anneeBudg = anneeBudg;
    }

    public Integer getIdmouvements() {
        return idmouvements;
    }

    public void setIdmouvements(Integer idmouvements) {
        this.idmouvements = idmouvements;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdtypeEntree() {
        return idtypeEntree;
    }

    public void setIdtypeEntree(int idtypeEntree) {
        this.idtypeEntree = idtypeEntree;
    }

    public int getIdtypeSortie() {
        return idtypeSortie;
    }

    public void setIdtypeSortie(int idtypeSortie) {
        this.idtypeSortie = idtypeSortie;
    }

    public short getEtat() {
        return etat;
    }

    public void setEtat(short etat) {
        this.etat = etat;
    }

    public int getIdmagasin() {
        return idmagasin;
    }

    public void setIdmagasin(int idmagasin) {
        this.idmagasin = idmagasin;
    }

    public long getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(long numTiers) {
        this.numTiers = numTiers;
    }

    public int getIdlocaux() {
        return idlocaux;
    }

    public void setIdlocaux(int idlocaux) {
        this.idlocaux = idlocaux;
    }

    public String getNumImmat() {
        return numImmat;
    }

    public void setNumImmat(String numImmat) {
        this.numImmat = numImmat;
    }

    public String getAnneeBudg() {
        return anneeBudg;
    }

    public void setAnneeBudg(String anneeBudg) {
        this.anneeBudg = anneeBudg;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmouvements != null ? idmouvements.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MtMouvements)) {
            return false;
        }
        MtMouvements other = (MtMouvements) object;
        if ((this.idmouvements == null && other.idmouvements != null) || (this.idmouvements != null && !this.idmouvements.equals(other.idmouvements))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.MtMouvements[ idmouvements=" + idmouvements + " ]";
    }
    
}
