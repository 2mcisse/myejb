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
@Table(name = "messageetiquette")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Messageetiquette.findAll", query = "SELECT m FROM Messageetiquette m")
    , @NamedQuery(name = "Messageetiquette.findByIDMessageEtiquette", query = "SELECT m FROM Messageetiquette m WHERE m.iDMessageEtiquette = :iDMessageEtiquette")
    , @NamedQuery(name = "Messageetiquette.findByIDUtilisateur", query = "SELECT m FROM Messageetiquette m WHERE m.iDUtilisateur = :iDUtilisateur")})
public class Messageetiquette implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDMessageEtiquette")
    private Integer iDMessageEtiquette;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDUtilisateur")
    private int iDUtilisateur;
    @JoinColumn(name = "IDEtiquette", referencedColumnName = "IDEtiquette")
    @ManyToOne(optional = false)
    private Etiquette iDEtiquette;
    @JoinColumn(name = "IDMessage", referencedColumnName = "IDMessage")
    @ManyToOne(optional = false)
    private Message iDMessage;

    public Messageetiquette() {
    }

    public Messageetiquette(Integer iDMessageEtiquette) {
        this.iDMessageEtiquette = iDMessageEtiquette;
    }

    public Messageetiquette(Integer iDMessageEtiquette, int iDUtilisateur) {
        this.iDMessageEtiquette = iDMessageEtiquette;
        this.iDUtilisateur = iDUtilisateur;
    }

    public Integer getIDMessageEtiquette() {
        return iDMessageEtiquette;
    }

    public void setIDMessageEtiquette(Integer iDMessageEtiquette) {
        this.iDMessageEtiquette = iDMessageEtiquette;
    }

    public int getIDUtilisateur() {
        return iDUtilisateur;
    }

    public void setIDUtilisateur(int iDUtilisateur) {
        this.iDUtilisateur = iDUtilisateur;
    }

    public Etiquette getIDEtiquette() {
        return iDEtiquette;
    }

    public void setIDEtiquette(Etiquette iDEtiquette) {
        this.iDEtiquette = iDEtiquette;
    }

    public Message getIDMessage() {
        return iDMessage;
    }

    public void setIDMessage(Message iDMessage) {
        this.iDMessage = iDMessage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDMessageEtiquette != null ? iDMessageEtiquette.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Messageetiquette)) {
            return false;
        }
        Messageetiquette other = (Messageetiquette) object;
        if ((this.iDMessageEtiquette == null && other.iDMessageEtiquette != null) || (this.iDMessageEtiquette != null && !this.iDMessageEtiquette.equals(other.iDMessageEtiquette))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Messageetiquette[ iDMessageEtiquette=" + iDMessageEtiquette + " ]";
    }
    
}
