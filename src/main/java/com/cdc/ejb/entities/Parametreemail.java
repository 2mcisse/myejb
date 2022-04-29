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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "parametreemail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parametreemail.findAll", query = "SELECT p FROM Parametreemail p")
    , @NamedQuery(name = "Parametreemail.findByIDParametreEmail", query = "SELECT p FROM Parametreemail p WHERE p.iDParametreEmail = :iDParametreEmail")
    , @NamedQuery(name = "Parametreemail.findByEmail", query = "SELECT p FROM Parametreemail p WHERE p.email = :email")
    , @NamedQuery(name = "Parametreemail.findByNomAffiche", query = "SELECT p FROM Parametreemail p WHERE p.nomAffiche = :nomAffiche")
    , @NamedQuery(name = "Parametreemail.findByServeurPOP", query = "SELECT p FROM Parametreemail p WHERE p.serveurPOP = :serveurPOP")
    , @NamedQuery(name = "Parametreemail.findByServeurSMTP", query = "SELECT p FROM Parametreemail p WHERE p.serveurSMTP = :serveurSMTP")
    , @NamedQuery(name = "Parametreemail.findByPortPOP", query = "SELECT p FROM Parametreemail p WHERE p.portPOP = :portPOP")
    , @NamedQuery(name = "Parametreemail.findByPortSMTP", query = "SELECT p FROM Parametreemail p WHERE p.portSMTP = :portSMTP")
    , @NamedQuery(name = "Parametreemail.findByUserPOP", query = "SELECT p FROM Parametreemail p WHERE p.userPOP = :userPOP")
    , @NamedQuery(name = "Parametreemail.findByUserSMTP", query = "SELECT p FROM Parametreemail p WHERE p.userSMTP = :userSMTP")
    , @NamedQuery(name = "Parametreemail.findByMdpPOP", query = "SELECT p FROM Parametreemail p WHERE p.mdpPOP = :mdpPOP")
    , @NamedQuery(name = "Parametreemail.findByMdpSMTP", query = "SELECT p FROM Parametreemail p WHERE p.mdpSMTP = :mdpSMTP")
    , @NamedQuery(name = "Parametreemail.findByTitre", query = "SELECT p FROM Parametreemail p WHERE p.titre = :titre")})
public class Parametreemail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDParametreEmail")
    private Integer iDParametreEmail;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 160)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "NomAffiche")
    private String nomAffiche;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 260)
    @Column(name = "ServeurPOP")
    private String serveurPOP;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 260)
    @Column(name = "ServeurSMTP")
    private String serveurSMTP;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PortPOP")
    private int portPOP;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PortSMTP")
    private int portSMTP;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 160)
    @Column(name = "UserPOP")
    private String userPOP;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 160)
    @Column(name = "UserSMTP")
    private String userSMTP;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "MdpPOP")
    private String mdpPOP;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "MdpSMTP")
    private String mdpSMTP;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "Titre")
    private String titre;
    @JoinColumn(name = "IDUtilisateur", referencedColumnName = "IDUtilisateur")
    @OneToOne(optional = false)
    private Utilisateur iDUtilisateur;

    public Parametreemail() {
    }

    public Parametreemail(Integer iDParametreEmail) {
        this.iDParametreEmail = iDParametreEmail;
    }

    public Parametreemail(Integer iDParametreEmail, String email, String nomAffiche, String serveurPOP, String serveurSMTP, int portPOP, int portSMTP, String userPOP, String userSMTP, String mdpPOP, String mdpSMTP, String titre) {
        this.iDParametreEmail = iDParametreEmail;
        this.email = email;
        this.nomAffiche = nomAffiche;
        this.serveurPOP = serveurPOP;
        this.serveurSMTP = serveurSMTP;
        this.portPOP = portPOP;
        this.portSMTP = portSMTP;
        this.userPOP = userPOP;
        this.userSMTP = userSMTP;
        this.mdpPOP = mdpPOP;
        this.mdpSMTP = mdpSMTP;
        this.titre = titre;
    }

    public Integer getIDParametreEmail() {
        return iDParametreEmail;
    }

    public void setIDParametreEmail(Integer iDParametreEmail) {
        this.iDParametreEmail = iDParametreEmail;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomAffiche() {
        return nomAffiche;
    }

    public void setNomAffiche(String nomAffiche) {
        this.nomAffiche = nomAffiche;
    }

    public String getServeurPOP() {
        return serveurPOP;
    }

    public void setServeurPOP(String serveurPOP) {
        this.serveurPOP = serveurPOP;
    }

    public String getServeurSMTP() {
        return serveurSMTP;
    }

    public void setServeurSMTP(String serveurSMTP) {
        this.serveurSMTP = serveurSMTP;
    }

    public int getPortPOP() {
        return portPOP;
    }

    public void setPortPOP(int portPOP) {
        this.portPOP = portPOP;
    }

    public int getPortSMTP() {
        return portSMTP;
    }

    public void setPortSMTP(int portSMTP) {
        this.portSMTP = portSMTP;
    }

    public String getUserPOP() {
        return userPOP;
    }

    public void setUserPOP(String userPOP) {
        this.userPOP = userPOP;
    }

    public String getUserSMTP() {
        return userSMTP;
    }

    public void setUserSMTP(String userSMTP) {
        this.userSMTP = userSMTP;
    }

    public String getMdpPOP() {
        return mdpPOP;
    }

    public void setMdpPOP(String mdpPOP) {
        this.mdpPOP = mdpPOP;
    }

    public String getMdpSMTP() {
        return mdpSMTP;
    }

    public void setMdpSMTP(String mdpSMTP) {
        this.mdpSMTP = mdpSMTP;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Utilisateur getIDUtilisateur() {
        return iDUtilisateur;
    }

    public void setIDUtilisateur(Utilisateur iDUtilisateur) {
        this.iDUtilisateur = iDUtilisateur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDParametreEmail != null ? iDParametreEmail.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parametreemail)) {
            return false;
        }
        Parametreemail other = (Parametreemail) object;
        if ((this.iDParametreEmail == null && other.iDParametreEmail != null) || (this.iDParametreEmail != null && !this.iDParametreEmail.equals(other.iDParametreEmail))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Parametreemail[ iDParametreEmail=" + iDParametreEmail + " ]";
    }
    
}
