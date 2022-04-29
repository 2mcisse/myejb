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
@Table(name = "bud_virements")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BudVirements.findAll", query = "SELECT b FROM BudVirements b")
    , @NamedQuery(name = "BudVirements.findByIDBUDVirement", query = "SELECT b FROM BudVirements b WHERE b.iDBUDVirement = :iDBUDVirement")
    , @NamedQuery(name = "BudVirements.findByDate", query = "SELECT b FROM BudVirements b WHERE b.date = :date")
    , @NamedQuery(name = "BudVirements.findByRefActe", query = "SELECT b FROM BudVirements b WHERE b.refActe = :refActe")
    , @NamedQuery(name = "BudVirements.findByIDSYSTypePiece", query = "SELECT b FROM BudVirements b WHERE b.iDSYSTypePiece = :iDSYSTypePiece")
    , @NamedQuery(name = "BudVirements.findByEtatValidation", query = "SELECT b FROM BudVirements b WHERE b.etatValidation = :etatValidation")
    , @NamedQuery(name = "BudVirements.findByDateVisaDG", query = "SELECT b FROM BudVirements b WHERE b.dateVisaDG = :dateVisaDG")
    , @NamedQuery(name = "BudVirements.findByDateVisaCG", query = "SELECT b FROM BudVirements b WHERE b.dateVisaCG = :dateVisaCG")
    , @NamedQuery(name = "BudVirements.findByGestion", query = "SELECT b FROM BudVirements b WHERE b.gestion = :gestion")})
public class BudVirements implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDBUD_Virement")
    private Integer iDBUDVirement;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Date")
    private String date;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "RefActe")
    private String refActe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSYS_TypePiece")
    private int iDSYSTypePiece;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EtatValidation")
    private short etatValidation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateVisaDG")
    @Temporal(TemporalType.DATE)
    private Date dateVisaDG;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateVisaCG")
    @Temporal(TemporalType.DATE)
    private Date dateVisaCG;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDBUDVirement")
    private List<BudMvtbud> budMvtbudList;

    public BudVirements() {
    }

    public BudVirements(Integer iDBUDVirement) {
        this.iDBUDVirement = iDBUDVirement;
    }

    public BudVirements(Integer iDBUDVirement, String date, String refActe, int iDSYSTypePiece, short etatValidation, Date dateVisaDG, Date dateVisaCG) {
        this.iDBUDVirement = iDBUDVirement;
        this.date = date;
        this.refActe = refActe;
        this.iDSYSTypePiece = iDSYSTypePiece;
        this.etatValidation = etatValidation;
        this.dateVisaDG = dateVisaDG;
        this.dateVisaCG = dateVisaCG;
    }

    public Integer getIDBUDVirement() {
        return iDBUDVirement;
    }

    public void setIDBUDVirement(Integer iDBUDVirement) {
        this.iDBUDVirement = iDBUDVirement;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRefActe() {
        return refActe;
    }

    public void setRefActe(String refActe) {
        this.refActe = refActe;
    }

    public int getIDSYSTypePiece() {
        return iDSYSTypePiece;
    }

    public void setIDSYSTypePiece(int iDSYSTypePiece) {
        this.iDSYSTypePiece = iDSYSTypePiece;
    }

    public short getEtatValidation() {
        return etatValidation;
    }

    public void setEtatValidation(short etatValidation) {
        this.etatValidation = etatValidation;
    }

    public Date getDateVisaDG() {
        return dateVisaDG;
    }

    public void setDateVisaDG(Date dateVisaDG) {
        this.dateVisaDG = dateVisaDG;
    }

    public Date getDateVisaCG() {
        return dateVisaCG;
    }

    public void setDateVisaCG(Date dateVisaCG) {
        this.dateVisaCG = dateVisaCG;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<BudMvtbud> getBudMvtbudList() {
        return budMvtbudList;
    }

    public void setBudMvtbudList(List<BudMvtbud> budMvtbudList) {
        this.budMvtbudList = budMvtbudList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDBUDVirement != null ? iDBUDVirement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudVirements)) {
            return false;
        }
        BudVirements other = (BudVirements) object;
        if ((this.iDBUDVirement == null && other.iDBUDVirement != null) || (this.iDBUDVirement != null && !this.iDBUDVirement.equals(other.iDBUDVirement))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.BudVirements[ iDBUDVirement=" + iDBUDVirement + " ]";
    }
    
}
