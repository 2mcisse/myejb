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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "pf_parametres")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PfParametres.findAll", query = "SELECT p FROM PfParametres p")
    , @NamedQuery(name = "PfParametres.findByIdpfParametres", query = "SELECT p FROM PfParametres p WHERE p.idpfParametres = :idpfParametres")
    , @NamedQuery(name = "PfParametres.findByTva", query = "SELECT p FROM PfParametres p WHERE p.tva = :tva")
    , @NamedQuery(name = "PfParametres.findByIrc", query = "SELECT p FROM PfParametres p WHERE p.irc = :irc")
    , @NamedQuery(name = "PfParametres.findByCOmIntermediare", query = "SELECT p FROM PfParametres p WHERE p.cOmIntermediare = :cOmIntermediare")
    , @NamedQuery(name = "PfParametres.findByComBrvm", query = "SELECT p FROM PfParametres p WHERE p.comBrvm = :comBrvm")
    , @NamedQuery(name = "PfParametres.findByNbreJoursAnnee", query = "SELECT p FROM PfParametres p WHERE p.nbreJoursAnnee = :nbreJoursAnnee")
    , @NamedQuery(name = "PfParametres.findByNbreJoursMois", query = "SELECT p FROM PfParametres p WHERE p.nbreJoursMois = :nbreJoursMois")
    , @NamedQuery(name = "PfParametres.findByNbreJoursSem", query = "SELECT p FROM PfParametres p WHERE p.nbreJoursSem = :nbreJoursSem")
    , @NamedQuery(name = "PfParametres.findByNbreJoursTrim", query = "SELECT p FROM PfParametres p WHERE p.nbreJoursTrim = :nbreJoursTrim")})
public class PfParametres implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPF_PARAMETRES")
    private Integer idpfParametres;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TVA")
    private Double tva;
    @Column(name = "IRC")
    private Double irc;
    @Column(name = "COm_Intermediare")
    private Double cOmIntermediare;
    @Column(name = "COM_BRVM")
    private Double comBrvm;
    @Column(name = "NbreJoursAnnee")
    private Integer nbreJoursAnnee;
    @Column(name = "NbreJoursMois")
    private Integer nbreJoursMois;
    @Column(name = "NbreJoursSem")
    private Integer nbreJoursSem;
    @Column(name = "NbreJoursTrim")
    private Integer nbreJoursTrim;

    public PfParametres() {
    }

    public PfParametres(Integer idpfParametres) {
        this.idpfParametres = idpfParametres;
    }

    public Integer getIdpfParametres() {
        return idpfParametres;
    }

    public void setIdpfParametres(Integer idpfParametres) {
        this.idpfParametres = idpfParametres;
    }

    public Double getTva() {
        return tva;
    }

    public void setTva(Double tva) {
        this.tva = tva;
    }

    public Double getIrc() {
        return irc;
    }

    public void setIrc(Double irc) {
        this.irc = irc;
    }

    public Double getCOmIntermediare() {
        return cOmIntermediare;
    }

    public void setCOmIntermediare(Double cOmIntermediare) {
        this.cOmIntermediare = cOmIntermediare;
    }

    public Double getComBrvm() {
        return comBrvm;
    }

    public void setComBrvm(Double comBrvm) {
        this.comBrvm = comBrvm;
    }

    public Integer getNbreJoursAnnee() {
        return nbreJoursAnnee;
    }

    public void setNbreJoursAnnee(Integer nbreJoursAnnee) {
        this.nbreJoursAnnee = nbreJoursAnnee;
    }

    public Integer getNbreJoursMois() {
        return nbreJoursMois;
    }

    public void setNbreJoursMois(Integer nbreJoursMois) {
        this.nbreJoursMois = nbreJoursMois;
    }

    public Integer getNbreJoursSem() {
        return nbreJoursSem;
    }

    public void setNbreJoursSem(Integer nbreJoursSem) {
        this.nbreJoursSem = nbreJoursSem;
    }

    public Integer getNbreJoursTrim() {
        return nbreJoursTrim;
    }

    public void setNbreJoursTrim(Integer nbreJoursTrim) {
        this.nbreJoursTrim = nbreJoursTrim;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpfParametres != null ? idpfParametres.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PfParametres)) {
            return false;
        }
        PfParametres other = (PfParametres) object;
        if ((this.idpfParametres == null && other.idpfParametres != null) || (this.idpfParametres != null && !this.idpfParametres.equals(other.idpfParametres))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.PfParametres[ idpfParametres=" + idpfParametres + " ]";
    }
    
}
