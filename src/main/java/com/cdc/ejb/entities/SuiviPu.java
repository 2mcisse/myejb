/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "suivi_pu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SuiviPu.findAll", query = "SELECT s FROM SuiviPu s")
    , @NamedQuery(name = "SuiviPu.findByIdsuiviPu", query = "SELECT s FROM SuiviPu s WHERE s.idsuiviPu = :idsuiviPu")
    , @NamedQuery(name = "SuiviPu.findByDate", query = "SELECT s FROM SuiviPu s WHERE s.date = :date")
    , @NamedQuery(name = "SuiviPu.findByPu", query = "SELECT s FROM SuiviPu s WHERE s.pu = :pu")
    , @NamedQuery(name = "SuiviPu.findByQte", query = "SELECT s FROM SuiviPu s WHERE s.qte = :qte")
    , @NamedQuery(name = "SuiviPu.findByIdsousComptes", query = "SELECT s FROM SuiviPu s WHERE s.idsousComptes = :idsousComptes")
    , @NamedQuery(name = "SuiviPu.findByQtee", query = "SELECT s FROM SuiviPu s WHERE s.qtee = :qtee")
    , @NamedQuery(name = "SuiviPu.findByQtes", query = "SELECT s FROM SuiviPu s WHERE s.qtes = :qtes")
    , @NamedQuery(name = "SuiviPu.findByGestion", query = "SELECT s FROM SuiviPu s WHERE s.gestion = :gestion")})
public class SuiviPu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSUIVI_PU")
    private Integer idsuiviPu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE")
    @Temporal(TemporalType.DATE)
    private Date date;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "PU")
    private BigDecimal pu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "QTE")
    private int qte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSOUS_COMPTES")
    private int idsousComptes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "QTEE")
    private int qtee;
    @Basic(optional = false)
    @NotNull
    @Column(name = "QTES")
    private int qtes;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;

    public SuiviPu() {
    }

    public SuiviPu(Integer idsuiviPu) {
        this.idsuiviPu = idsuiviPu;
    }

    public SuiviPu(Integer idsuiviPu, Date date, BigDecimal pu, int qte, int idsousComptes, int qtee, int qtes) {
        this.idsuiviPu = idsuiviPu;
        this.date = date;
        this.pu = pu;
        this.qte = qte;
        this.idsousComptes = idsousComptes;
        this.qtee = qtee;
        this.qtes = qtes;
    }

    public Integer getIdsuiviPu() {
        return idsuiviPu;
    }

    public void setIdsuiviPu(Integer idsuiviPu) {
        this.idsuiviPu = idsuiviPu;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getPu() {
        return pu;
    }

    public void setPu(BigDecimal pu) {
        this.pu = pu;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public int getIdsousComptes() {
        return idsousComptes;
    }

    public void setIdsousComptes(int idsousComptes) {
        this.idsousComptes = idsousComptes;
    }

    public int getQtee() {
        return qtee;
    }

    public void setQtee(int qtee) {
        this.qtee = qtee;
    }

    public int getQtes() {
        return qtes;
    }

    public void setQtes(int qtes) {
        this.qtes = qtes;
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
        hash += (idsuiviPu != null ? idsuiviPu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SuiviPu)) {
            return false;
        }
        SuiviPu other = (SuiviPu) object;
        if ((this.idsuiviPu == null && other.idsuiviPu != null) || (this.idsuiviPu != null && !this.idsuiviPu.equals(other.idsuiviPu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.SuiviPu[ idsuiviPu=" + idsuiviPu + " ]";
    }
    
}
