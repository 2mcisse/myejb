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
@Table(name = "sys_bordereau")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SysBordereau.findAll", query = "SELECT s FROM SysBordereau s")
    , @NamedQuery(name = "SysBordereau.findByIDSYSBordereau", query = "SELECT s FROM SysBordereau s WHERE s.iDSYSBordereau = :iDSYSBordereau")
    , @NamedQuery(name = "SysBordereau.findByReference", query = "SELECT s FROM SysBordereau s WHERE s.reference = :reference")
    , @NamedQuery(name = "SysBordereau.findByDate", query = "SELECT s FROM SysBordereau s WHERE s.date = :date")
    , @NamedQuery(name = "SysBordereau.findByDestinataire", query = "SELECT s FROM SysBordereau s WHERE s.destinataire = :destinataire")
    , @NamedQuery(name = "SysBordereau.findByEtatValidation", query = "SELECT s FROM SysBordereau s WHERE s.etatValidation = :etatValidation")
    , @NamedQuery(name = "SysBordereau.findByExpediteur", query = "SELECT s FROM SysBordereau s WHERE s.expediteur = :expediteur")
    , @NamedQuery(name = "SysBordereau.findByLoginExpediteur", query = "SELECT s FROM SysBordereau s WHERE s.loginExpediteur = :loginExpediteur")
    , @NamedQuery(name = "SysBordereau.findByLoginDestinataire", query = "SELECT s FROM SysBordereau s WHERE s.loginDestinataire = :loginDestinataire")
    , @NamedQuery(name = "SysBordereau.findByType", query = "SELECT s FROM SysBordereau s WHERE s.type = :type")
    , @NamedQuery(name = "SysBordereau.findByGestion", query = "SELECT s FROM SysBordereau s WHERE s.gestion = :gestion")})
public class SysBordereau implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSYS_Bordereau")
    private Integer iDSYSBordereau;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Reference")
    private String reference;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Destinataire")
    private String destinataire;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EtatValidation")
    private short etatValidation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Expediteur")
    private String expediteur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "LoginExpediteur")
    private String loginExpediteur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "LoginDestinataire")
    private String loginDestinataire;
    @Basic(optional = false)
    @NotNull
    @Column(name = "type")
    private short type;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDSYSBordereau")
    private List<SysContenubordereau> sysContenubordereauList;

    public SysBordereau() {
    }

    public SysBordereau(Integer iDSYSBordereau) {
        this.iDSYSBordereau = iDSYSBordereau;
    }

    public SysBordereau(Integer iDSYSBordereau, String reference, Date date, String destinataire, short etatValidation, String expediteur, String loginExpediteur, String loginDestinataire, short type) {
        this.iDSYSBordereau = iDSYSBordereau;
        this.reference = reference;
        this.date = date;
        this.destinataire = destinataire;
        this.etatValidation = etatValidation;
        this.expediteur = expediteur;
        this.loginExpediteur = loginExpediteur;
        this.loginDestinataire = loginDestinataire;
        this.type = type;
    }

    public Integer getIDSYSBordereau() {
        return iDSYSBordereau;
    }

    public void setIDSYSBordereau(Integer iDSYSBordereau) {
        this.iDSYSBordereau = iDSYSBordereau;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }

    public short getEtatValidation() {
        return etatValidation;
    }

    public void setEtatValidation(short etatValidation) {
        this.etatValidation = etatValidation;
    }

    public String getExpediteur() {
        return expediteur;
    }

    public void setExpediteur(String expediteur) {
        this.expediteur = expediteur;
    }

    public String getLoginExpediteur() {
        return loginExpediteur;
    }

    public void setLoginExpediteur(String loginExpediteur) {
        this.loginExpediteur = loginExpediteur;
    }

    public String getLoginDestinataire() {
        return loginDestinataire;
    }

    public void setLoginDestinataire(String loginDestinataire) {
        this.loginDestinataire = loginDestinataire;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<SysContenubordereau> getSysContenubordereauList() {
        return sysContenubordereauList;
    }

    public void setSysContenubordereauList(List<SysContenubordereau> sysContenubordereauList) {
        this.sysContenubordereauList = sysContenubordereauList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDSYSBordereau != null ? iDSYSBordereau.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SysBordereau)) {
            return false;
        }
        SysBordereau other = (SysBordereau) object;
        if ((this.iDSYSBordereau == null && other.iDSYSBordereau != null) || (this.iDSYSBordereau != null && !this.iDSYSBordereau.equals(other.iDSYSBordereau))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.SysBordereau[ iDSYSBordereau=" + iDSYSBordereau + " ]";
    }
    
}
