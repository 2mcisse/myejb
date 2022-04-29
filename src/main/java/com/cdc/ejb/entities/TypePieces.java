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
@Table(name = "type_pieces")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypePieces.findAll", query = "SELECT t FROM TypePieces t")
    , @NamedQuery(name = "TypePieces.findByCodePiece", query = "SELECT t FROM TypePieces t WHERE t.codePiece = :codePiece")
    , @NamedQuery(name = "TypePieces.findByLibelle", query = "SELECT t FROM TypePieces t WHERE t.libelle = :libelle")})
public class TypePieces implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_PIECE")
    private Integer codePiece;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "LIBELLE")
    private String libelle;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codePiece")
    private List<Pieces> piecesList;

    public TypePieces() {
    }

    public TypePieces(Integer codePiece) {
        this.codePiece = codePiece;
    }

    public TypePieces(Integer codePiece, String libelle) {
        this.codePiece = codePiece;
        this.libelle = libelle;
    }

    public Integer getCodePiece() {
        return codePiece;
    }

    public void setCodePiece(Integer codePiece) {
        this.codePiece = codePiece;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @XmlTransient
    public List<Pieces> getPiecesList() {
        return piecesList;
    }

    public void setPiecesList(List<Pieces> piecesList) {
        this.piecesList = piecesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codePiece != null ? codePiece.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypePieces)) {
            return false;
        }
        TypePieces other = (TypePieces) object;
        if ((this.codePiece == null && other.codePiece != null) || (this.codePiece != null && !this.codePiece.equals(other.codePiece))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.TypePieces[ codePiece=" + codePiece + " ]";
    }
    
}
