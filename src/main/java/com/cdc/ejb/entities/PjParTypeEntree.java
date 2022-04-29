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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "pj_par_type_entree")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PjParTypeEntree.findAll", query = "SELECT p FROM PjParTypeEntree p")
    , @NamedQuery(name = "PjParTypeEntree.findByIdtypeEntree", query = "SELECT p FROM PjParTypeEntree p WHERE p.idtypeEntree = :idtypeEntree")
    , @NamedQuery(name = "PjParTypeEntree.findByCodePiece", query = "SELECT p FROM PjParTypeEntree p WHERE p.codePiece = :codePiece")
    , @NamedQuery(name = "PjParTypeEntree.findById", query = "SELECT p FROM PjParTypeEntree p WHERE p.id = :id")})
public class PjParTypeEntree implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTYPE_ENTREE")
    private int idtypeEntree;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_PIECE")
    private int codePiece;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    public PjParTypeEntree() {
    }

    public PjParTypeEntree(Integer id) {
        this.id = id;
    }

    public PjParTypeEntree(Integer id, int idtypeEntree, int codePiece) {
        this.id = id;
        this.idtypeEntree = idtypeEntree;
        this.codePiece = codePiece;
    }

    public int getIdtypeEntree() {
        return idtypeEntree;
    }

    public void setIdtypeEntree(int idtypeEntree) {
        this.idtypeEntree = idtypeEntree;
    }

    public int getCodePiece() {
        return codePiece;
    }

    public void setCodePiece(int codePiece) {
        this.codePiece = codePiece;
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
        if (!(object instanceof PjParTypeEntree)) {
            return false;
        }
        PjParTypeEntree other = (PjParTypeEntree) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.PjParTypeEntree[ id=" + id + " ]";
    }
    
}
