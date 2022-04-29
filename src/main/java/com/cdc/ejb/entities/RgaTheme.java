/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "rga_theme")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RgaTheme.findAll", query = "SELECT r FROM RgaTheme r")
    , @NamedQuery(name = "RgaTheme.findByIdragTheme", query = "SELECT r FROM RgaTheme r WHERE r.idragTheme = :idragTheme")
    , @NamedQuery(name = "RgaTheme.findByDecription", query = "SELECT r FROM RgaTheme r WHERE r.decription = :decription")
    , @NamedQuery(name = "RgaTheme.findByCode", query = "SELECT r FROM RgaTheme r WHERE r.code = :code")})
public class RgaTheme implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrag_theme")
    private Integer idragTheme;
    @Size(max = 50)
    @Column(name = "decription")
    private String decription;
    @Size(max = 50)
    @Column(name = "code")
    private String code;
    @OneToMany(mappedBy = "idragTheme")
    private List<RgaUser> rgaUserList;

    public RgaTheme() {
    }

    public RgaTheme(Integer idragTheme) {
        this.idragTheme = idragTheme;
    }

    public Integer getIdragTheme() {
        return idragTheme;
    }

    public void setIdragTheme(Integer idragTheme) {
        this.idragTheme = idragTheme;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @XmlTransient
    public List<RgaUser> getRgaUserList() {
        return rgaUserList;
    }

    public void setRgaUserList(List<RgaUser> rgaUserList) {
        this.rgaUserList = rgaUserList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idragTheme != null ? idragTheme.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RgaTheme)) {
            return false;
        }
        RgaTheme other = (RgaTheme) object;
        if ((this.idragTheme == null && other.idragTheme != null) || (this.idragTheme != null && !this.idragTheme.equals(other.idragTheme))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.RgaTheme[ idragTheme=" + idragTheme + " ]";
    }
    
}
