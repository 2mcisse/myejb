/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "piecejointe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Piecejointe.findAll", query = "SELECT p FROM Piecejointe p")
    , @NamedQuery(name = "Piecejointe.findByIDPieceJointe", query = "SELECT p FROM Piecejointe p WHERE p.iDPieceJointe = :iDPieceJointe")
    , @NamedQuery(name = "Piecejointe.findByCle", query = "SELECT p FROM Piecejointe p WHERE p.cle = :cle")
    , @NamedQuery(name = "Piecejointe.findByDateHeureCreation", query = "SELECT p FROM Piecejointe p WHERE p.dateHeureCreation = :dateHeureCreation")
    , @NamedQuery(name = "Piecejointe.findByType", query = "SELECT p FROM Piecejointe p WHERE p.type = :type")
    , @NamedQuery(name = "Piecejointe.findByFichierNom", query = "SELECT p FROM Piecejointe p WHERE p.fichierNom = :fichierNom")
    , @NamedQuery(name = "Piecejointe.findByFichierTypeMIME", query = "SELECT p FROM Piecejointe p WHERE p.fichierTypeMIME = :fichierTypeMIME")
    , @NamedQuery(name = "Piecejointe.findByFichierTaille", query = "SELECT p FROM Piecejointe p WHERE p.fichierTaille = :fichierTaille")
    , @NamedQuery(name = "Piecejointe.findByGestion", query = "SELECT p FROM Piecejointe p WHERE p.gestion = :gestion")})
public class Piecejointe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPieceJointe")
    private Integer iDPieceJointe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "Cle")
    private String cle;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "Memo")
    private byte[] memo;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Info")
    private String info;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateHeureCreation")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHeureCreation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Type")
    private int type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 260)
    @Column(name = "FichierNom")
    private String fichierNom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 160)
    @Column(name = "FichierTypeMIME")
    private String fichierTypeMIME;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FichierTaille")
    private int fichierTaille;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "IDUtilisateur", referencedColumnName = "IDUtilisateur")
    @ManyToOne(optional = false)
    private Utilisateur iDUtilisateur;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cle")
    private List<Messageattache> messageattacheList;

    public Piecejointe() {
    }

    public Piecejointe(Integer iDPieceJointe) {
        this.iDPieceJointe = iDPieceJointe;
    }

    public Piecejointe(Integer iDPieceJointe, String cle, byte[] memo, String info, Date dateHeureCreation, int type, String fichierNom, String fichierTypeMIME, int fichierTaille) {
        this.iDPieceJointe = iDPieceJointe;
        this.cle = cle;
        this.memo = memo;
        this.info = info;
        this.dateHeureCreation = dateHeureCreation;
        this.type = type;
        this.fichierNom = fichierNom;
        this.fichierTypeMIME = fichierTypeMIME;
        this.fichierTaille = fichierTaille;
    }

    public Integer getIDPieceJointe() {
        return iDPieceJointe;
    }

    public void setIDPieceJointe(Integer iDPieceJointe) {
        this.iDPieceJointe = iDPieceJointe;
    }

    public String getCle() {
        return cle;
    }

    public void setCle(String cle) {
        this.cle = cle;
    }

    public byte[] getMemo() {
        return memo;
    }

    public void setMemo(byte[] memo) {
        this.memo = memo;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Date getDateHeureCreation() {
        return dateHeureCreation;
    }

    public void setDateHeureCreation(Date dateHeureCreation) {
        this.dateHeureCreation = dateHeureCreation;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getFichierNom() {
        return fichierNom;
    }

    public void setFichierNom(String fichierNom) {
        this.fichierNom = fichierNom;
    }

    public String getFichierTypeMIME() {
        return fichierTypeMIME;
    }

    public void setFichierTypeMIME(String fichierTypeMIME) {
        this.fichierTypeMIME = fichierTypeMIME;
    }

    public int getFichierTaille() {
        return fichierTaille;
    }

    public void setFichierTaille(int fichierTaille) {
        this.fichierTaille = fichierTaille;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public Utilisateur getIDUtilisateur() {
        return iDUtilisateur;
    }

    public void setIDUtilisateur(Utilisateur iDUtilisateur) {
        this.iDUtilisateur = iDUtilisateur;
    }

    @XmlTransient
    public List<Messageattache> getMessageattacheList() {
        return messageattacheList;
    }

    public void setMessageattacheList(List<Messageattache> messageattacheList) {
        this.messageattacheList = messageattacheList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDPieceJointe != null ? iDPieceJointe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Piecejointe)) {
            return false;
        }
        Piecejointe other = (Piecejointe) object;
        if ((this.iDPieceJointe == null && other.iDPieceJointe != null) || (this.iDPieceJointe != null && !this.iDPieceJointe.equals(other.iDPieceJointe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Piecejointe[ iDPieceJointe=" + iDPieceJointe + " ]";
    }
    
}
