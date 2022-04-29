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
@Table(name = "blog")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Blog.findAll", query = "SELECT b FROM Blog b")
    , @NamedQuery(name = "Blog.findByIDBlog", query = "SELECT b FROM Blog b WHERE b.iDBlog = :iDBlog")
    , @NamedQuery(name = "Blog.findByTitre", query = "SELECT b FROM Blog b WHERE b.titre = :titre")
    , @NamedQuery(name = "Blog.findByDateHeureCreation", query = "SELECT b FROM Blog b WHERE b.dateHeureCreation = :dateHeureCreation")
    , @NamedQuery(name = "Blog.findByGestion", query = "SELECT b FROM Blog b WHERE b.gestion = :gestion")})
public class Blog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDBlog")
    private Integer iDBlog;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "Titre")
    private String titre;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateHeureCreation")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHeureCreation;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "IDUtilisateur", referencedColumnName = "IDUtilisateur")
    @ManyToOne(optional = false)
    private Utilisateur iDUtilisateur;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDBlog")
    private List<Billet> billetList;

    public Blog() {
    }

    public Blog(Integer iDBlog) {
        this.iDBlog = iDBlog;
    }

    public Blog(Integer iDBlog, String titre, String description, Date dateHeureCreation) {
        this.iDBlog = iDBlog;
        this.titre = titre;
        this.description = description;
        this.dateHeureCreation = dateHeureCreation;
    }

    public Integer getIDBlog() {
        return iDBlog;
    }

    public void setIDBlog(Integer iDBlog) {
        this.iDBlog = iDBlog;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateHeureCreation() {
        return dateHeureCreation;
    }

    public void setDateHeureCreation(Date dateHeureCreation) {
        this.dateHeureCreation = dateHeureCreation;
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
    public List<Billet> getBilletList() {
        return billetList;
    }

    public void setBilletList(List<Billet> billetList) {
        this.billetList = billetList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDBlog != null ? iDBlog.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Blog)) {
            return false;
        }
        Blog other = (Blog) object;
        if ((this.iDBlog == null && other.iDBlog != null) || (this.iDBlog != null && !this.iDBlog.equals(other.iDBlog))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Blog[ iDBlog=" + iDBlog + " ]";
    }
    
}
