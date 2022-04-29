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
@Table(name = "document")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Document.findAll", query = "SELECT d FROM Document d")
    , @NamedQuery(name = "Document.findByNDocument", query = "SELECT d FROM Document d WHERE d.nDocument = :nDocument")
    , @NamedQuery(name = "Document.findByNbMots", query = "SELECT d FROM Document d WHERE d.nbMots = :nbMots")
    , @NamedQuery(name = "Document.findByCleClient", query = "SELECT d FROM Document d WHERE d.cleClient = :cleClient")})
public class Document implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "nDocument")
    private Integer nDocument;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nbMots")
    private int nbMots;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 260)
    @Column(name = "CleClient")
    private String cleClient;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nDocument")
    private List<Index> indexList;

    public Document() {
    }

    public Document(Integer nDocument) {
        this.nDocument = nDocument;
    }

    public Document(Integer nDocument, int nbMots, String cleClient) {
        this.nDocument = nDocument;
        this.nbMots = nbMots;
        this.cleClient = cleClient;
    }

    public Integer getNDocument() {
        return nDocument;
    }

    public void setNDocument(Integer nDocument) {
        this.nDocument = nDocument;
    }

    public int getNbMots() {
        return nbMots;
    }

    public void setNbMots(int nbMots) {
        this.nbMots = nbMots;
    }

    public String getCleClient() {
        return cleClient;
    }

    public void setCleClient(String cleClient) {
        this.cleClient = cleClient;
    }

    @XmlTransient
    public List<Index> getIndexList() {
        return indexList;
    }

    public void setIndexList(List<Index> indexList) {
        this.indexList = indexList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nDocument != null ? nDocument.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Document)) {
            return false;
        }
        Document other = (Document) object;
        if ((this.nDocument == null && other.nDocument != null) || (this.nDocument != null && !this.nDocument.equals(other.nDocument))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Document[ nDocument=" + nDocument + " ]";
    }
    
}
