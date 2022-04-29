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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "mt_parametres")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MtParametres.findAll", query = "SELECT m FROM MtParametres m")
    , @NamedQuery(name = "MtParametres.findByIdparametres", query = "SELECT m FROM MtParametres m WHERE m.idparametres = :idparametres")
    , @NamedQuery(name = "MtParametres.findByMinistere", query = "SELECT m FROM MtParametres m WHERE m.ministere = :ministere")
    , @NamedQuery(name = "MtParametres.findByEtablissement", query = "SELECT m FROM MtParametres m WHERE m.etablissement = :etablissement")
    , @NamedQuery(name = "MtParametres.findByComptableMatiere", query = "SELECT m FROM MtParametres m WHERE m.comptableMatiere = :comptableMatiere")
    , @NamedQuery(name = "MtParametres.findByAdministrateurMatiere", query = "SELECT m FROM MtParametres m WHERE m.administrateurMatiere = :administrateurMatiere")
    , @NamedQuery(name = "MtParametres.findByMailEtablissement", query = "SELECT m FROM MtParametres m WHERE m.mailEtablissement = :mailEtablissement")
    , @NamedQuery(name = "MtParametres.findByGestion", query = "SELECT m FROM MtParametres m WHERE m.gestion = :gestion")
    , @NamedQuery(name = "MtParametres.findByVille", query = "SELECT m FROM MtParametres m WHERE m.ville = :ville")
    , @NamedQuery(name = "MtParametres.findByAutoNum", query = "SELECT m FROM MtParametres m WHERE m.autoNum = :autoNum")
    , @NamedQuery(name = "MtParametres.findByIdgestionnaires1", query = "SELECT m FROM MtParametres m WHERE m.idgestionnaires1 = :idgestionnaires1")
    , @NamedQuery(name = "MtParametres.findByIdgeSTIONNAIRES2", query = "SELECT m FROM MtParametres m WHERE m.idgeSTIONNAIRES2 = :idgeSTIONNAIRES2")})
public class MtParametres implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPARAMETRES")
    private Integer idparametres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "MINISTERE")
    private String ministere;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ETABLISSEMENT")
    private String etablissement;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "COMPTABLE_MATIERE")
    private String comptableMatiere;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ADMINISTRATEUR_MATIERE")
    private String administrateurMatiere;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 260)
    @Column(name = "MAIL_ETABLISSEMENT")
    private String mailEtablissement;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "GESTION")
    private String gestion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "VILLE")
    private String ville;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AutoNum")
    private short autoNum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDGESTIONNAIRES1")
    private int idgestionnaires1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idgeSTIONNAIRES2")
    private int idgeSTIONNAIRES2;

    public MtParametres() {
    }

    public MtParametres(Integer idparametres) {
        this.idparametres = idparametres;
    }

    public MtParametres(Integer idparametres, String ministere, String etablissement, String comptableMatiere, String administrateurMatiere, String mailEtablissement, String gestion, String ville, short autoNum, int idgestionnaires1, int idgeSTIONNAIRES2) {
        this.idparametres = idparametres;
        this.ministere = ministere;
        this.etablissement = etablissement;
        this.comptableMatiere = comptableMatiere;
        this.administrateurMatiere = administrateurMatiere;
        this.mailEtablissement = mailEtablissement;
        this.gestion = gestion;
        this.ville = ville;
        this.autoNum = autoNum;
        this.idgestionnaires1 = idgestionnaires1;
        this.idgeSTIONNAIRES2 = idgeSTIONNAIRES2;
    }

    public Integer getIdparametres() {
        return idparametres;
    }

    public void setIdparametres(Integer idparametres) {
        this.idparametres = idparametres;
    }

    public String getMinistere() {
        return ministere;
    }

    public void setMinistere(String ministere) {
        this.ministere = ministere;
    }

    public String getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(String etablissement) {
        this.etablissement = etablissement;
    }

    public String getComptableMatiere() {
        return comptableMatiere;
    }

    public void setComptableMatiere(String comptableMatiere) {
        this.comptableMatiere = comptableMatiere;
    }

    public String getAdministrateurMatiere() {
        return administrateurMatiere;
    }

    public void setAdministrateurMatiere(String administrateurMatiere) {
        this.administrateurMatiere = administrateurMatiere;
    }

    public String getMailEtablissement() {
        return mailEtablissement;
    }

    public void setMailEtablissement(String mailEtablissement) {
        this.mailEtablissement = mailEtablissement;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public short getAutoNum() {
        return autoNum;
    }

    public void setAutoNum(short autoNum) {
        this.autoNum = autoNum;
    }

    public int getIdgestionnaires1() {
        return idgestionnaires1;
    }

    public void setIdgestionnaires1(int idgestionnaires1) {
        this.idgestionnaires1 = idgestionnaires1;
    }

    public int getIdgeSTIONNAIRES2() {
        return idgeSTIONNAIRES2;
    }

    public void setIdgeSTIONNAIRES2(int idgeSTIONNAIRES2) {
        this.idgeSTIONNAIRES2 = idgeSTIONNAIRES2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idparametres != null ? idparametres.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MtParametres)) {
            return false;
        }
        MtParametres other = (MtParametres) object;
        if ((this.idparametres == null && other.idparametres != null) || (this.idparametres != null && !this.idparametres.equals(other.idparametres))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.MtParametres[ idparametres=" + idparametres + " ]";
    }
    
}
