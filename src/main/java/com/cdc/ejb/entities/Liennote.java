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
@Table(name = "liennote")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Liennote.findAll", query = "SELECT l FROM Liennote l")
    , @NamedQuery(name = "Liennote.findByIDLienNote", query = "SELECT l FROM Liennote l WHERE l.iDLienNote = :iDLienNote")
    , @NamedQuery(name = "Liennote.findByNote", query = "SELECT l FROM Liennote l WHERE l.note = :note")})
public class Liennote implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDLienNote")
    private Integer iDLienNote;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Note")
    private int note;
    @JoinColumn(name = "IDUtilisateur", referencedColumnName = "IDUtilisateur")
    @ManyToOne(optional = false)
    private Utilisateur iDUtilisateur;
    @JoinColumn(name = "IDLien", referencedColumnName = "IDLien")
    @ManyToOne(optional = false)
    private Lien iDLien;

    public Liennote() {
    }

    public Liennote(Integer iDLienNote) {
        this.iDLienNote = iDLienNote;
    }

    public Liennote(Integer iDLienNote, int note) {
        this.iDLienNote = iDLienNote;
        this.note = note;
    }

    public Integer getIDLienNote() {
        return iDLienNote;
    }

    public void setIDLienNote(Integer iDLienNote) {
        this.iDLienNote = iDLienNote;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public Utilisateur getIDUtilisateur() {
        return iDUtilisateur;
    }

    public void setIDUtilisateur(Utilisateur iDUtilisateur) {
        this.iDUtilisateur = iDUtilisateur;
    }

    public Lien getIDLien() {
        return iDLien;
    }

    public void setIDLien(Lien iDLien) {
        this.iDLien = iDLien;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDLienNote != null ? iDLienNote.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Liennote)) {
            return false;
        }
        Liennote other = (Liennote) object;
        if ((this.iDLienNote == null && other.iDLienNote != null) || (this.iDLienNote != null && !this.iDLienNote.equals(other.iDLienNote))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Liennote[ iDLienNote=" + iDLienNote + " ]";
    }
    
}
