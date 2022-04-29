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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "index")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Index.findAll", query = "SELECT i FROM Index i")
    , @NamedQuery(name = "Index.findByIdindex", query = "SELECT i FROM Index i WHERE i.idindex = :idindex")
    , @NamedQuery(name = "Index.findByNPosition", query = "SELECT i FROM Index i WHERE i.nPosition = :nPosition")})
public class Index implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDINDEX")
    private Integer idindex;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nPosition")
    private int nPosition;
    @JoinColumn(name = "nDocument", referencedColumnName = "nDocument")
    @ManyToOne(optional = false)
    private Document nDocument;
    @JoinColumn(name = "IDMOT", referencedColumnName = "IDMOT")
    @ManyToOne(optional = false)
    private Mot idmot;

    public Index() {
    }

    public Index(Integer idindex) {
        this.idindex = idindex;
    }

    public Index(Integer idindex, int nPosition) {
        this.idindex = idindex;
        this.nPosition = nPosition;
    }

    public Integer getIdindex() {
        return idindex;
    }

    public void setIdindex(Integer idindex) {
        this.idindex = idindex;
    }

    public int getNPosition() {
        return nPosition;
    }

    public void setNPosition(int nPosition) {
        this.nPosition = nPosition;
    }

    public Document getNDocument() {
        return nDocument;
    }

    public void setNDocument(Document nDocument) {
        this.nDocument = nDocument;
    }

    public Mot getIdmot() {
        return idmot;
    }

    public void setIdmot(Mot idmot) {
        this.idmot = idmot;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idindex != null ? idindex.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Index)) {
            return false;
        }
        Index other = (Index) object;
        if ((this.idindex == null && other.idindex != null) || (this.idindex != null && !this.idindex.equals(other.idindex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Index[ idindex=" + idindex + " ]";
    }
    
}
