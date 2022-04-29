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
@Table(name = "messageattache")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Messageattache.findAll", query = "SELECT m FROM Messageattache m")
    , @NamedQuery(name = "Messageattache.findByIDMessageAttache", query = "SELECT m FROM Messageattache m WHERE m.iDMessageAttache = :iDMessageAttache")})
public class Messageattache implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDMessageAttache")
    private Integer iDMessageAttache;
    @JoinColumn(name = "Cle", referencedColumnName = "Cle")
    @ManyToOne(optional = false)
    private Piecejointe cle;
    @JoinColumn(name = "IDMessage", referencedColumnName = "IDMessage")
    @ManyToOne(optional = false)
    private Message iDMessage;

    public Messageattache() {
    }

    public Messageattache(Integer iDMessageAttache) {
        this.iDMessageAttache = iDMessageAttache;
    }

    public Integer getIDMessageAttache() {
        return iDMessageAttache;
    }

    public void setIDMessageAttache(Integer iDMessageAttache) {
        this.iDMessageAttache = iDMessageAttache;
    }

    public Piecejointe getCle() {
        return cle;
    }

    public void setCle(Piecejointe cle) {
        this.cle = cle;
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
        hash += (iDMessageAttache != null ? iDMessageAttache.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Messageattache)) {
            return false;
        }
        Messageattache other = (Messageattache) object;
        if ((this.iDMessageAttache == null && other.iDMessageAttache != null) || (this.iDMessageAttache != null && !this.iDMessageAttache.equals(other.iDMessageAttache))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Messageattache[ iDMessageAttache=" + iDMessageAttache + " ]";
    }
    
}
