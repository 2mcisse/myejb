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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "bdo_ord_eng")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BdoOrdEng.findAll", query = "SELECT b FROM BdoOrdEng b")
    , @NamedQuery(name = "BdoOrdEng.findByReference", query = "SELECT b FROM BdoOrdEng b WHERE b.reference = :reference")
    , @NamedQuery(name = "BdoOrdEng.findByDATEBord", query = "SELECT b FROM BdoOrdEng b WHERE b.dATEBord = :dATEBord")
    , @NamedQuery(name = "BdoOrdEng.findByProv", query = "SELECT b FROM BdoOrdEng b WHERE b.prov = :prov")
    , @NamedQuery(name = "BdoOrdEng.findByDest", query = "SELECT b FROM BdoOrdEng b WHERE b.dest = :dest")
    , @NamedQuery(name = "BdoOrdEng.findByType", query = "SELECT b FROM BdoOrdEng b WHERE b.type = :type")
    , @NamedQuery(name = "BdoOrdEng.findByGestion", query = "SELECT b FROM BdoOrdEng b WHERE b.gestion = :gestion")
    , @NamedQuery(name = "BdoOrdEng.findById", query = "SELECT b FROM BdoOrdEng b WHERE b.id = :id")})
public class BdoOrdEng implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 50)
    @Column(name = "Reference")
    private String reference;
    @Column(name = "DATE_Bord")
    @Temporal(TemporalType.DATE)
    private Date dATEBord;
    @Size(max = 50)
    @Column(name = "Prov")
    private String prov;
    @Size(max = 50)
    @Column(name = "Dest")
    private String dest;
    @Column(name = "type")
    private Short type;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    public BdoOrdEng() {
    }

    public BdoOrdEng(Integer id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getDATEBord() {
        return dATEBord;
    }

    public void setDATEBord(Date dATEBord) {
        this.dATEBord = dATEBord;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BdoOrdEng)) {
            return false;
        }
        BdoOrdEng other = (BdoOrdEng) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.BdoOrdEng[ id=" + id + " ]";
    }
    
}
