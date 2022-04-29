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
@Table(name = "pf_correspondances")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PfCorrespondances.findAll", query = "SELECT p FROM PfCorrespondances p")
    , @NamedQuery(name = "PfCorrespondances.findByIdpfCorrespondances", query = "SELECT p FROM PfCorrespondances p WHERE p.idpfCorrespondances = :idpfCorrespondances")
    , @NamedQuery(name = "PfCorrespondances.findByType", query = "SELECT p FROM PfCorrespondances p WHERE p.type = :type")
    , @NamedQuery(name = "PfCorrespondances.findByIDSYSMode", query = "SELECT p FROM PfCorrespondances p WHERE p.iDSYSMode = :iDSYSMode")})
public class PfCorrespondances implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPF_CORRESPONDANCES")
    private Integer idpfCorrespondances;
    @Column(name = "type")
    private Short type;
    @Column(name = "IDSYS_Mode")
    private Integer iDSYSMode;
    @JoinColumn(name = "IDTYPE_ENC", referencedColumnName = "IDTYPE_ENC")
    @ManyToOne
    private PfTypeEnc idtypeEnc;
    @JoinColumn(name = "IDTYPE_DEC", referencedColumnName = "IDTYPE_DEC")
    @ManyToOne
    private PfTypeDec idtypeDec;

    public PfCorrespondances() {
    }

    public PfCorrespondances(Integer idpfCorrespondances) {
        this.idpfCorrespondances = idpfCorrespondances;
    }

    public Integer getIdpfCorrespondances() {
        return idpfCorrespondances;
    }

    public void setIdpfCorrespondances(Integer idpfCorrespondances) {
        this.idpfCorrespondances = idpfCorrespondances;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Integer getIDSYSMode() {
        return iDSYSMode;
    }

    public void setIDSYSMode(Integer iDSYSMode) {
        this.iDSYSMode = iDSYSMode;
    }

    public PfTypeEnc getIdtypeEnc() {
        return idtypeEnc;
    }

    public void setIdtypeEnc(PfTypeEnc idtypeEnc) {
        this.idtypeEnc = idtypeEnc;
    }

    public PfTypeDec getIdtypeDec() {
        return idtypeDec;
    }

    public void setIdtypeDec(PfTypeDec idtypeDec) {
        this.idtypeDec = idtypeDec;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpfCorrespondances != null ? idpfCorrespondances.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PfCorrespondances)) {
            return false;
        }
        PfCorrespondances other = (PfCorrespondances) object;
        if ((this.idpfCorrespondances == null && other.idpfCorrespondances != null) || (this.idpfCorrespondances != null && !this.idpfCorrespondances.equals(other.idpfCorrespondances))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.PfCorrespondances[ idpfCorrespondances=" + idpfCorrespondances + " ]";
    }
    
}
