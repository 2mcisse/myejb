/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "pf_arrete")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PfArrete.findAll", query = "SELECT p FROM PfArrete p")
    , @NamedQuery(name = "PfArrete.findByIDArrete", query = "SELECT p FROM PfArrete p WHERE p.iDArrete = :iDArrete")
    , @NamedQuery(name = "PfArrete.findByDateArrete", query = "SELECT p FROM PfArrete p WHERE p.dateArrete = :dateArrete")
    , @NamedQuery(name = "PfArrete.findByDescription", query = "SELECT p FROM PfArrete p WHERE p.description = :description")
    , @NamedQuery(name = "PfArrete.findBySaisiePar", query = "SELECT p FROM PfArrete p WHERE p.saisiePar = :saisiePar")
    , @NamedQuery(name = "PfArrete.findBySaisieDate", query = "SELECT p FROM PfArrete p WHERE p.saisieDate = :saisieDate")
    , @NamedQuery(name = "PfArrete.findByGestion", query = "SELECT p FROM PfArrete p WHERE p.gestion = :gestion")})
public class PfArrete implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDArrete")
    private Integer iDArrete;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateArrete")
    @Temporal(TemporalType.DATE)
    private Date dateArrete;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "SaisiePar")
    private String saisiePar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SaisieDate")
    @Temporal(TemporalType.DATE)
    private Date saisieDate;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "IDPF_SUPPORTS", referencedColumnName = "IDPF_SUPPORTS")
    @ManyToOne(optional = false)
    private PfSupports idpfSupports;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDArrete")
    private List<PfDetailsarretes> pfDetailsarretesList;

    public PfArrete() {
    }

    public PfArrete(Integer iDArrete) {
        this.iDArrete = iDArrete;
    }

    public PfArrete(Integer iDArrete, Date dateArrete, String description, String saisiePar, Date saisieDate) {
        this.iDArrete = iDArrete;
        this.dateArrete = dateArrete;
        this.description = description;
        this.saisiePar = saisiePar;
        this.saisieDate = saisieDate;
    }

    public Integer getIDArrete() {
        return iDArrete;
    }

    public void setIDArrete(Integer iDArrete) {
        this.iDArrete = iDArrete;
    }

    public Date getDateArrete() {
        return dateArrete;
    }

    public void setDateArrete(Date dateArrete) {
        this.dateArrete = dateArrete;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSaisiePar() {
        return saisiePar;
    }

    public void setSaisiePar(String saisiePar) {
        this.saisiePar = saisiePar;
    }

    public Date getSaisieDate() {
        return saisieDate;
    }

    public void setSaisieDate(Date saisieDate) {
        this.saisieDate = saisieDate;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public PfSupports getIdpfSupports() {
        return idpfSupports;
    }

    public void setIdpfSupports(PfSupports idpfSupports) {
        this.idpfSupports = idpfSupports;
    }

    @XmlTransient
    public List<PfDetailsarretes> getPfDetailsarretesList() {
        return pfDetailsarretesList;
    }

    public void setPfDetailsarretesList(List<PfDetailsarretes> pfDetailsarretesList) {
        this.pfDetailsarretesList = pfDetailsarretesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDArrete != null ? iDArrete.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PfArrete)) {
            return false;
        }
        PfArrete other = (PfArrete) object;
        if ((this.iDArrete == null && other.iDArrete != null) || (this.iDArrete != null && !this.iDArrete.equals(other.iDArrete))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.PfArrete[ iDArrete=" + iDArrete + " ]";
    }
    
}
