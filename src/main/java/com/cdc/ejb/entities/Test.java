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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "test")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Test.findAll", query = "SELECT t FROM Test t")
    , @NamedQuery(name = "Test.findByIDTest", query = "SELECT t FROM Test t WHERE t.iDTest = :iDTest")
    , @NamedQuery(name = "Test.findByTet", query = "SELECT t FROM Test t WHERE t.tet = :tet")
    , @NamedQuery(name = "Test.findByTres", query = "SELECT t FROM Test t WHERE t.tres = :tres")})
public class Test implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTest")
    private Integer iDTest;
    @Size(max = 50)
    @Column(name = "tet")
    private String tet;
    @Size(max = 50)
    @Column(name = "TRES")
    private String tres;

    public Test() {
    }

    public Test(Integer iDTest) {
        this.iDTest = iDTest;
    }

    public Integer getIDTest() {
        return iDTest;
    }

    public void setIDTest(Integer iDTest) {
        this.iDTest = iDTest;
    }

    public String getTet() {
        return tet;
    }

    public void setTet(String tet) {
        this.tet = tet;
    }

    public String getTres() {
        return tres;
    }

    public void setTres(String tres) {
        this.tres = tres;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDTest != null ? iDTest.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Test)) {
            return false;
        }
        Test other = (Test) object;
        if ((this.iDTest == null && other.iDTest != null) || (this.iDTest != null && !this.iDTest.equals(other.iDTest))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Test[ iDTest=" + iDTest + " ]";
    }
    
}
