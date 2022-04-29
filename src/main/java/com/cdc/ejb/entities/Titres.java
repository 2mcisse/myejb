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
@Table(name = "titres")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Titres.findAll", query = "SELECT t FROM Titres t")
    , @NamedQuery(name = "Titres.findByTtcleunik", query = "SELECT t FROM Titres t WHERE t.ttcleunik = :ttcleunik")
    , @NamedQuery(name = "Titres.findByTitre", query = "SELECT t FROM Titres t WHERE t.titre = :titre")
    , @NamedQuery(name = "Titres.findByDetail", query = "SELECT t FROM Titres t WHERE t.detail = :detail")
    , @NamedQuery(name = "Titres.findByEtatfin", query = "SELECT t FROM Titres t WHERE t.etatfin = :etatfin")})
public class Titres implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "TTCLEUNIK")
    private Integer ttcleunik;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Titre")
    private String titre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Detail")
    private int detail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Etatfin")
    private short etatfin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ttcleunik")
    private List<Corpset> corpsetList;

    public Titres() {
    }

    public Titres(Integer ttcleunik) {
        this.ttcleunik = ttcleunik;
    }

    public Titres(Integer ttcleunik, String titre, int detail, short etatfin) {
        this.ttcleunik = ttcleunik;
        this.titre = titre;
        this.detail = detail;
        this.etatfin = etatfin;
    }

    public Integer getTtcleunik() {
        return ttcleunik;
    }

    public void setTtcleunik(Integer ttcleunik) {
        this.ttcleunik = ttcleunik;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getDetail() {
        return detail;
    }

    public void setDetail(int detail) {
        this.detail = detail;
    }

    public short getEtatfin() {
        return etatfin;
    }

    public void setEtatfin(short etatfin) {
        this.etatfin = etatfin;
    }

    @XmlTransient
    public List<Corpset> getCorpsetList() {
        return corpsetList;
    }

    public void setCorpsetList(List<Corpset> corpsetList) {
        this.corpsetList = corpsetList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ttcleunik != null ? ttcleunik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Titres)) {
            return false;
        }
        Titres other = (Titres) object;
        if ((this.ttcleunik == null && other.ttcleunik != null) || (this.ttcleunik != null && !this.ttcleunik.equals(other.ttcleunik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Titres[ ttcleunik=" + ttcleunik + " ]";
    }
    
}
