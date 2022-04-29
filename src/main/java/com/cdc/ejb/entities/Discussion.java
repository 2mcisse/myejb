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
import javax.persistence.Lob;
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
@Table(name = "discussion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Discussion.findAll", query = "SELECT d FROM Discussion d")
    , @NamedQuery(name = "Discussion.findByIDDiscussion", query = "SELECT d FROM Discussion d WHERE d.iDDiscussion = :iDDiscussion")
    , @NamedQuery(name = "Discussion.findByEnAttente", query = "SELECT d FROM Discussion d WHERE d.enAttente = :enAttente")
    , @NamedQuery(name = "Discussion.findByGestion", query = "SELECT d FROM Discussion d WHERE d.gestion = :gestion")})
public class Discussion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDiscussion")
    private Integer iDDiscussion;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "ListePersonnes")
    private String listePersonnes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EnAttente")
    private short enAttente;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDDiscussion")
    private List<Discussionmessage> discussionmessageList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDDiscussion")
    private List<Discussioninvitation> discussioninvitationList;

    public Discussion() {
    }

    public Discussion(Integer iDDiscussion) {
        this.iDDiscussion = iDDiscussion;
    }

    public Discussion(Integer iDDiscussion, String listePersonnes, short enAttente) {
        this.iDDiscussion = iDDiscussion;
        this.listePersonnes = listePersonnes;
        this.enAttente = enAttente;
    }

    public Integer getIDDiscussion() {
        return iDDiscussion;
    }

    public void setIDDiscussion(Integer iDDiscussion) {
        this.iDDiscussion = iDDiscussion;
    }

    public String getListePersonnes() {
        return listePersonnes;
    }

    public void setListePersonnes(String listePersonnes) {
        this.listePersonnes = listePersonnes;
    }

    public short getEnAttente() {
        return enAttente;
    }

    public void setEnAttente(short enAttente) {
        this.enAttente = enAttente;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<Discussionmessage> getDiscussionmessageList() {
        return discussionmessageList;
    }

    public void setDiscussionmessageList(List<Discussionmessage> discussionmessageList) {
        this.discussionmessageList = discussionmessageList;
    }

    @XmlTransient
    public List<Discussioninvitation> getDiscussioninvitationList() {
        return discussioninvitationList;
    }

    public void setDiscussioninvitationList(List<Discussioninvitation> discussioninvitationList) {
        this.discussioninvitationList = discussioninvitationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDDiscussion != null ? iDDiscussion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Discussion)) {
            return false;
        }
        Discussion other = (Discussion) object;
        if ((this.iDDiscussion == null && other.iDDiscussion != null) || (this.iDDiscussion != null && !this.iDDiscussion.equals(other.iDDiscussion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Discussion[ iDDiscussion=" + iDDiscussion + " ]";
    }
    
}
