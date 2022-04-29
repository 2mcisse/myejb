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
@Table(name = "dec_arrete")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DecArrete.findAll", query = "SELECT d FROM DecArrete d")
    , @NamedQuery(name = "DecArrete.findByIDArrete", query = "SELECT d FROM DecArrete d WHERE d.iDArrete = :iDArrete")
    , @NamedQuery(name = "DecArrete.findByDateArrete", query = "SELECT d FROM DecArrete d WHERE d.dateArrete = :dateArrete")
    , @NamedQuery(name = "DecArrete.findByDescription", query = "SELECT d FROM DecArrete d WHERE d.description = :description")
    , @NamedQuery(name = "DecArrete.findBySaisiePar", query = "SELECT d FROM DecArrete d WHERE d.saisiePar = :saisiePar")
    , @NamedQuery(name = "DecArrete.findBySaisieDate", query = "SELECT d FROM DecArrete d WHERE d.saisieDate = :saisieDate")
    , @NamedQuery(name = "DecArrete.findByNumTiers", query = "SELECT d FROM DecArrete d WHERE d.numTiers = :numTiers")
    , @NamedQuery(name = "DecArrete.findByIdaffaires", query = "SELECT d FROM DecArrete d WHERE d.idaffaires = :idaffaires")
    , @NamedQuery(name = "DecArrete.findByDateDebut", query = "SELECT d FROM DecArrete d WHERE d.dateDebut = :dateDebut")
    , @NamedQuery(name = "DecArrete.findByIdnatureoperation", query = "SELECT d FROM DecArrete d WHERE d.idnatureoperation = :idnatureoperation")
    , @NamedQuery(name = "DecArrete.findByIrc", query = "SELECT d FROM DecArrete d WHERE d.irc = :irc")
    , @NamedQuery(name = "DecArrete.findByTva", query = "SELECT d FROM DecArrete d WHERE d.tva = :tva")
    , @NamedQuery(name = "DecArrete.findByTaux", query = "SELECT d FROM DecArrete d WHERE d.taux = :taux")
    , @NamedQuery(name = "DecArrete.findByGestion", query = "SELECT d FROM DecArrete d WHERE d.gestion = :gestion")})
public class DecArrete implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Column(name = "NumTiers")
    private long numTiers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDAFFAIRES")
    private int idaffaires;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateDebut")
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDNATUREOPERATION")
    private int idnatureoperation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IRC")
    private int irc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TVA")
    private int tva;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Taux")
    private double taux;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDArrete")
    private List<DecDetailsarretes> decDetailsarretesList;

    public DecArrete() {
    }

    public DecArrete(Integer iDArrete) {
        this.iDArrete = iDArrete;
    }

    public DecArrete(Integer iDArrete, Date dateArrete, String description, String saisiePar, Date saisieDate, long numTiers, int idaffaires, Date dateDebut, int idnatureoperation, int irc, int tva, double taux) {
        this.iDArrete = iDArrete;
        this.dateArrete = dateArrete;
        this.description = description;
        this.saisiePar = saisiePar;
        this.saisieDate = saisieDate;
        this.numTiers = numTiers;
        this.idaffaires = idaffaires;
        this.dateDebut = dateDebut;
        this.idnatureoperation = idnatureoperation;
        this.irc = irc;
        this.tva = tva;
        this.taux = taux;
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

    public long getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(long numTiers) {
        this.numTiers = numTiers;
    }

    public int getIdaffaires() {
        return idaffaires;
    }

    public void setIdaffaires(int idaffaires) {
        this.idaffaires = idaffaires;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public int getIdnatureoperation() {
        return idnatureoperation;
    }

    public void setIdnatureoperation(int idnatureoperation) {
        this.idnatureoperation = idnatureoperation;
    }

    public int getIrc() {
        return irc;
    }

    public void setIrc(int irc) {
        this.irc = irc;
    }

    public int getTva() {
        return tva;
    }

    public void setTva(int tva) {
        this.tva = tva;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<DecDetailsarretes> getDecDetailsarretesList() {
        return decDetailsarretesList;
    }

    public void setDecDetailsarretesList(List<DecDetailsarretes> decDetailsarretesList) {
        this.decDetailsarretesList = decDetailsarretesList;
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
        if (!(object instanceof DecArrete)) {
            return false;
        }
        DecArrete other = (DecArrete) object;
        if ((this.iDArrete == null && other.iDArrete != null) || (this.iDArrete != null && !this.iDArrete.equals(other.iDArrete))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.DecArrete[ iDArrete=" + iDArrete + " ]";
    }
    
}
