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
@Table(name = "pj_par_type_sortie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PjParTypeSortie.findAll", query = "SELECT p FROM PjParTypeSortie p")
    , @NamedQuery(name = "PjParTypeSortie.findByIdtypeSortie", query = "SELECT p FROM PjParTypeSortie p WHERE p.idtypeSortie = :idtypeSortie")
    , @NamedQuery(name = "PjParTypeSortie.findByCodePiece", query = "SELECT p FROM PjParTypeSortie p WHERE p.codePiece = :codePiece")
    , @NamedQuery(name = "PjParTypeSortie.findById", query = "SELECT p FROM PjParTypeSortie p WHERE p.id = :id")})
public class PjParTypeSortie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTYPE_SORTIE")
    private int idtypeSortie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_PIECE")
    private int codePiece;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    public PjParTypeSortie() {
    }

    public PjParTypeSortie(Integer id) {
        this.id = id;
    }

    public PjParTypeSortie(Integer id, int idtypeSortie, int codePiece) {
        this.id = id;
        this.idtypeSortie = idtypeSortie;
        this.codePiece = codePiece;
    }

    public int getIdtypeSortie() {
        return idtypeSortie;
    }

    public void setIdtypeSortie(int idtypeSortie) {
        this.idtypeSortie = idtypeSortie;
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
        if (!(object instanceof PjParTypeSortie)) {
            return false;
        }
        PjParTypeSortie other = (PjParTypeSortie) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.PjParTypeSortie[ id=" + id + " ]";
    }
    
}
