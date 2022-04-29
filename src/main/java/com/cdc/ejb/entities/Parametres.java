/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "parametres")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parametres.findAll", query = "SELECT p FROM Parametres p")
    , @NamedQuery(name = "Parametres.findByIDParametres", query = "SELECT p FROM Parametres p WHERE p.iDParametres = :iDParametres")
    , @NamedQuery(name = "Parametres.findByJEncaissDepotNum", query = "SELECT p FROM Parametres p WHERE p.jEncaissDepotNum = :jEncaissDepotNum")
    , @NamedQuery(name = "Parametres.findByJournAnnul", query = "SELECT p FROM Parametres p WHERE p.journAnnul = :journAnnul")
    , @NamedQuery(name = "Parametres.findByGestionAutoQuit", query = "SELECT p FROM Parametres p WHERE p.gestionAutoQuit = :gestionAutoQuit")
    , @NamedQuery(name = "Parametres.findByValQuit", query = "SELECT p FROM Parametres p WHERE p.valQuit = :valQuit")
    , @NamedQuery(name = "Parametres.findByNUMerocompteVirementInternes", query = "SELECT p FROM Parametres p WHERE p.nUMerocompteVirementInternes = :nUMerocompteVirementInternes")
    , @NamedQuery(name = "Parametres.findByCptEncaissDepotNumDeb", query = "SELECT p FROM Parametres p WHERE p.cptEncaissDepotNumDeb = :cptEncaissDepotNumDeb")
    , @NamedQuery(name = "Parametres.findByCptEncaissDepotNumCred", query = "SELECT p FROM Parametres p WHERE p.cptEncaissDepotNumCred = :cptEncaissDepotNumCred")
    , @NamedQuery(name = "Parametres.findByCptEncaissConsignNumDeb", query = "SELECT p FROM Parametres p WHERE p.cptEncaissConsignNumDeb = :cptEncaissConsignNumDeb")
    , @NamedQuery(name = "Parametres.findByCptEncaissConsignNumCred", query = "SELECT p FROM Parametres p WHERE p.cptEncaissConsignNumCred = :cptEncaissConsignNumCred")
    , @NamedQuery(name = "Parametres.findByJEncaissConsgnNum", query = "SELECT p FROM Parametres p WHERE p.jEncaissConsgnNum = :jEncaissConsgnNum")
    , @NamedQuery(name = "Parametres.findByCptEncaissDepotBancDeb", query = "SELECT p FROM Parametres p WHERE p.cptEncaissDepotBancDeb = :cptEncaissDepotBancDeb")
    , @NamedQuery(name = "Parametres.findByCptEncaissDepotBancCred", query = "SELECT p FROM Parametres p WHERE p.cptEncaissDepotBancCred = :cptEncaissDepotBancCred")
    , @NamedQuery(name = "Parametres.findByJEncaissDepotBanc", query = "SELECT p FROM Parametres p WHERE p.jEncaissDepotBanc = :jEncaissDepotBanc")
    , @NamedQuery(name = "Parametres.findByCptEncaissConsignBancDeb", query = "SELECT p FROM Parametres p WHERE p.cptEncaissConsignBancDeb = :cptEncaissConsignBancDeb")
    , @NamedQuery(name = "Parametres.findByCptEncaissConsignBancCred", query = "SELECT p FROM Parametres p WHERE p.cptEncaissConsignBancCred = :cptEncaissConsignBancCred")
    , @NamedQuery(name = "Parametres.findByJEncaissConsgnBanc", query = "SELECT p FROM Parametres p WHERE p.jEncaissConsgnBanc = :jEncaissConsgnBanc")
    , @NamedQuery(name = "Parametres.findByCptDecaissDepotNumDeb", query = "SELECT p FROM Parametres p WHERE p.cptDecaissDepotNumDeb = :cptDecaissDepotNumDeb")
    , @NamedQuery(name = "Parametres.findByCptDecaissDepotNumCred", query = "SELECT p FROM Parametres p WHERE p.cptDecaissDepotNumCred = :cptDecaissDepotNumCred")
    , @NamedQuery(name = "Parametres.findByJDecaissDepotNum", query = "SELECT p FROM Parametres p WHERE p.jDecaissDepotNum = :jDecaissDepotNum")
    , @NamedQuery(name = "Parametres.findByCptDecaissConsignNumDeb", query = "SELECT p FROM Parametres p WHERE p.cptDecaissConsignNumDeb = :cptDecaissConsignNumDeb")
    , @NamedQuery(name = "Parametres.findByCptDecaissConsignNumCred", query = "SELECT p FROM Parametres p WHERE p.cptDecaissConsignNumCred = :cptDecaissConsignNumCred")
    , @NamedQuery(name = "Parametres.findByJDecaissConsgnNum", query = "SELECT p FROM Parametres p WHERE p.jDecaissConsgnNum = :jDecaissConsgnNum")
    , @NamedQuery(name = "Parametres.findByCptDecaissDepotBancDeb", query = "SELECT p FROM Parametres p WHERE p.cptDecaissDepotBancDeb = :cptDecaissDepotBancDeb")
    , @NamedQuery(name = "Parametres.findByCptDecaissDepotBancCred", query = "SELECT p FROM Parametres p WHERE p.cptDecaissDepotBancCred = :cptDecaissDepotBancCred")
    , @NamedQuery(name = "Parametres.findByJDecaissDepotBanc", query = "SELECT p FROM Parametres p WHERE p.jDecaissDepotBanc = :jDecaissDepotBanc")
    , @NamedQuery(name = "Parametres.findByCptDecaissConsignBancDeb", query = "SELECT p FROM Parametres p WHERE p.cptDecaissConsignBancDeb = :cptDecaissConsignBancDeb")
    , @NamedQuery(name = "Parametres.findByCptDecaissConsignBancCred", query = "SELECT p FROM Parametres p WHERE p.cptDecaissConsignBancCred = :cptDecaissConsignBancCred")
    , @NamedQuery(name = "Parametres.findByJDecaissConsgnBanc", query = "SELECT p FROM Parametres p WHERE p.jDecaissConsgnBanc = :jDecaissConsgnBanc")
    , @NamedQuery(name = "Parametres.findByCptPecEncaissDepotDeb", query = "SELECT p FROM Parametres p WHERE p.cptPecEncaissDepotDeb = :cptPecEncaissDepotDeb")
    , @NamedQuery(name = "Parametres.findByCptPecEncaissDepotCred", query = "SELECT p FROM Parametres p WHERE p.cptPecEncaissDepotCred = :cptPecEncaissDepotCred")
    , @NamedQuery(name = "Parametres.findByJPecEncaissDepot", query = "SELECT p FROM Parametres p WHERE p.jPecEncaissDepot = :jPecEncaissDepot")
    , @NamedQuery(name = "Parametres.findByCptPecEncaissConsignDeb", query = "SELECT p FROM Parametres p WHERE p.cptPecEncaissConsignDeb = :cptPecEncaissConsignDeb")
    , @NamedQuery(name = "Parametres.findByCptPecEncaissConsignCred", query = "SELECT p FROM Parametres p WHERE p.cptPecEncaissConsignCred = :cptPecEncaissConsignCred")
    , @NamedQuery(name = "Parametres.findByJPecEncaissConsign", query = "SELECT p FROM Parametres p WHERE p.jPecEncaissConsign = :jPecEncaissConsign")
    , @NamedQuery(name = "Parametres.findByCptPecMandDeb", query = "SELECT p FROM Parametres p WHERE p.cptPecMandDeb = :cptPecMandDeb")
    , @NamedQuery(name = "Parametres.findByCptPecMandCred", query = "SELECT p FROM Parametres p WHERE p.cptPecMandCred = :cptPecMandCred")
    , @NamedQuery(name = "Parametres.findByJPecMand", query = "SELECT p FROM Parametres p WHERE p.jPecMand = :jPecMand")
    , @NamedQuery(name = "Parametres.findByCptPayOpNumDeb", query = "SELECT p FROM Parametres p WHERE p.cptPayOpNumDeb = :cptPayOpNumDeb")
    , @NamedQuery(name = "Parametres.findByCptPayOpNumCred", query = "SELECT p FROM Parametres p WHERE p.cptPayOpNumCred = :cptPayOpNumCred")
    , @NamedQuery(name = "Parametres.findByJPayOpNum", query = "SELECT p FROM Parametres p WHERE p.jPayOpNum = :jPayOpNum")
    , @NamedQuery(name = "Parametres.findByCptPayOpBancDeb", query = "SELECT p FROM Parametres p WHERE p.cptPayOpBancDeb = :cptPayOpBancDeb")
    , @NamedQuery(name = "Parametres.findByCptPayOpBancCred", query = "SELECT p FROM Parametres p WHERE p.cptPayOpBancCred = :cptPayOpBancCred")
    , @NamedQuery(name = "Parametres.findByJPayOpBanc", query = "SELECT p FROM Parametres p WHERE p.jPayOpBanc = :jPayOpBanc")
    , @NamedQuery(name = "Parametres.findByCptVirementInterne", query = "SELECT p FROM Parametres p WHERE p.cptVirementInterne = :cptVirementInterne")
    , @NamedQuery(name = "Parametres.findByCptPecDecaissDepotDeb", query = "SELECT p FROM Parametres p WHERE p.cptPecDecaissDepotDeb = :cptPecDecaissDepotDeb")
    , @NamedQuery(name = "Parametres.findByCptPecDecaissDepotCred", query = "SELECT p FROM Parametres p WHERE p.cptPecDecaissDepotCred = :cptPecDecaissDepotCred")
    , @NamedQuery(name = "Parametres.findByJPecDecaissDepot", query = "SELECT p FROM Parametres p WHERE p.jPecDecaissDepot = :jPecDecaissDepot")
    , @NamedQuery(name = "Parametres.findByCptPecDecaissConsignDeb", query = "SELECT p FROM Parametres p WHERE p.cptPecDecaissConsignDeb = :cptPecDecaissConsignDeb")
    , @NamedQuery(name = "Parametres.findByCptPecDecaissConsignCred", query = "SELECT p FROM Parametres p WHERE p.cptPecDecaissConsignCred = :cptPecDecaissConsignCred")
    , @NamedQuery(name = "Parametres.findByJPecDecaissConsign", query = "SELECT p FROM Parametres p WHERE p.jPecDecaissConsign = :jPecDecaissConsign")
    , @NamedQuery(name = "Parametres.findByCpttimbre", query = "SELECT p FROM Parametres p WHERE p.cpttimbre = :cpttimbre")
    , @NamedQuery(name = "Parametres.findByValeurTimbre", query = "SELECT p FROM Parametres p WHERE p.valeurTimbre = :valeurTimbre")
    , @NamedQuery(name = "Parametres.findByJOd", query = "SELECT p FROM Parametres p WHERE p.jOd = :jOd")
    , @NamedQuery(name = "Parametres.findByJSuppres", query = "SELECT p FROM Parametres p WHERE p.jSuppres = :jSuppres")
    , @NamedQuery(name = "Parametres.findByCpttimbreDeg", query = "SELECT p FROM Parametres p WHERE p.cpttimbreDeg = :cpttimbreDeg")
    , @NamedQuery(name = "Parametres.findByControlTG", query = "SELECT p FROM Parametres p WHERE p.controlTG = :controlTG")})
public class Parametres implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDParametres")
    private Integer iDParametres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "J_ENCAISS_DEPOT_NUM")
    private String jEncaissDepotNum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "JOURN_ANNUL")
    private String journAnnul;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GESTION_AUTO_QUIT")
    private short gestionAutoQuit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ValQuit")
    private String valQuit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NUMerocompteVirementInternes")
    private String nUMerocompteVirementInternes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_ENCAISS_DEPOT_NUM_DEB")
    private String cptEncaissDepotNumDeb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_ENCAISS_DEPOT_NUM_CRED")
    private String cptEncaissDepotNumCred;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_ENCAISS_CONSIGN_NUM_DEB")
    private String cptEncaissConsignNumDeb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_ENCAISS_CONSIGN_NUM_CRED")
    private String cptEncaissConsignNumCred;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "J_ENCAISS_CONSGN_NUM")
    private String jEncaissConsgnNum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_ENCAISS_DEPOT_BANC_DEB")
    private String cptEncaissDepotBancDeb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_ENCAISS_DEPOT_BANC_CRED")
    private String cptEncaissDepotBancCred;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "J_ENCAISS_DEPOT_BANC")
    private String jEncaissDepotBanc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_ENCAISS_CONSIGN_BANC_DEB")
    private String cptEncaissConsignBancDeb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_ENCAISS_CONSIGN_BANC_CRED")
    private String cptEncaissConsignBancCred;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "J_ENCAISS_CONSGN_BANC")
    private String jEncaissConsgnBanc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_DECAISS_DEPOT_NUM_DEB")
    private String cptDecaissDepotNumDeb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_DECAISS_DEPOT_NUM_CRED")
    private String cptDecaissDepotNumCred;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "J_DECAISS_DEPOT_NUM")
    private String jDecaissDepotNum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_DECAISS_CONSIGN_NUM_DEB")
    private String cptDecaissConsignNumDeb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_DECAISS_CONSIGN_NUM_CRED")
    private String cptDecaissConsignNumCred;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "J_DECAISS_CONSGN_NUM")
    private String jDecaissConsgnNum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_DECAISS_DEPOT_BANC_DEB")
    private String cptDecaissDepotBancDeb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_DECAISS_DEPOT_BANC_CRED")
    private String cptDecaissDepotBancCred;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "J_DECAISS_DEPOT_BANC")
    private String jDecaissDepotBanc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_DECAISS_CONSIGN_BANC_DEB")
    private String cptDecaissConsignBancDeb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_DECAISS_CONSIGN_BANC_CRED")
    private String cptDecaissConsignBancCred;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "J_DECAISS_CONSGN_BANC")
    private String jDecaissConsgnBanc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_PEC_ENCAISS_DEPOT_DEB")
    private String cptPecEncaissDepotDeb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_PEC_ENCAISS_DEPOT_CRED")
    private String cptPecEncaissDepotCred;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "J_PEC_ENCAISS_DEPOT")
    private String jPecEncaissDepot;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_PEC_ENCAISS_CONSIGN_DEB")
    private String cptPecEncaissConsignDeb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_PEC_ENCAISS_CONSIGN_CRED")
    private String cptPecEncaissConsignCred;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "J_PEC_ENCAISS_CONSIGN")
    private String jPecEncaissConsign;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_PEC_MAND_DEB")
    private String cptPecMandDeb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_PEC_MAND_CRED")
    private String cptPecMandCred;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "J_PEC_MAND")
    private String jPecMand;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_PAY_OP_NUM_DEB")
    private String cptPayOpNumDeb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_PAY_OP_NUM_CRED")
    private String cptPayOpNumCred;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "J_PAY_OP_NUM")
    private String jPayOpNum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_PAY_OP_BANC_DEB")
    private String cptPayOpBancDeb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_PAY_OP_BANC_CRED")
    private String cptPayOpBancCred;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "J_PAY_OP_BANC")
    private String jPayOpBanc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_VIREMENT_INTERNE")
    private String cptVirementInterne;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_PEC_DECAISS_DEPOT_DEB")
    private String cptPecDecaissDepotDeb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_PEC_DECAISS_DEPOT_CRED")
    private String cptPecDecaissDepotCred;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "J_PEC_DECAISS_DEPOT")
    private String jPecDecaissDepot;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_PEC_DECAISS_CONSIGN_DEB")
    private String cptPecDecaissConsignDeb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPT_PEC_DECAISS_CONSIGN_CRED")
    private String cptPecDecaissConsignCred;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "J_PEC_DECAISS_CONSIGN")
    private String jPecDecaissConsign;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPTTIMBRE")
    private String cpttimbre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "ValeurTimbre")
    private BigDecimal valeurTimbre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "J_OD")
    private String jOd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "J_SUPPRES")
    private String jSuppres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPTTIMBRE_DEG")
    private String cpttimbreDeg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "controlTG")
    private short controlTG;

    public Parametres() {
    }

    public Parametres(Integer iDParametres) {
        this.iDParametres = iDParametres;
    }

    public Parametres(Integer iDParametres, String jEncaissDepotNum, String journAnnul, short gestionAutoQuit, String valQuit, String nUMerocompteVirementInternes, String cptEncaissDepotNumDeb, String cptEncaissDepotNumCred, String cptEncaissConsignNumDeb, String cptEncaissConsignNumCred, String jEncaissConsgnNum, String cptEncaissDepotBancDeb, String cptEncaissDepotBancCred, String jEncaissDepotBanc, String cptEncaissConsignBancDeb, String cptEncaissConsignBancCred, String jEncaissConsgnBanc, String cptDecaissDepotNumDeb, String cptDecaissDepotNumCred, String jDecaissDepotNum, String cptDecaissConsignNumDeb, String cptDecaissConsignNumCred, String jDecaissConsgnNum, String cptDecaissDepotBancDeb, String cptDecaissDepotBancCred, String jDecaissDepotBanc, String cptDecaissConsignBancDeb, String cptDecaissConsignBancCred, String jDecaissConsgnBanc, String cptPecEncaissDepotDeb, String cptPecEncaissDepotCred, String jPecEncaissDepot, String cptPecEncaissConsignDeb, String cptPecEncaissConsignCred, String jPecEncaissConsign, String cptPecMandDeb, String cptPecMandCred, String jPecMand, String cptPayOpNumDeb, String cptPayOpNumCred, String jPayOpNum, String cptPayOpBancDeb, String cptPayOpBancCred, String jPayOpBanc, String cptVirementInterne, String cptPecDecaissDepotDeb, String cptPecDecaissDepotCred, String jPecDecaissDepot, String cptPecDecaissConsignDeb, String cptPecDecaissConsignCred, String jPecDecaissConsign, String cpttimbre, BigDecimal valeurTimbre, String jOd, String jSuppres, String cpttimbreDeg, short controlTG) {
        this.iDParametres = iDParametres;
        this.jEncaissDepotNum = jEncaissDepotNum;
        this.journAnnul = journAnnul;
        this.gestionAutoQuit = gestionAutoQuit;
        this.valQuit = valQuit;
        this.nUMerocompteVirementInternes = nUMerocompteVirementInternes;
        this.cptEncaissDepotNumDeb = cptEncaissDepotNumDeb;
        this.cptEncaissDepotNumCred = cptEncaissDepotNumCred;
        this.cptEncaissConsignNumDeb = cptEncaissConsignNumDeb;
        this.cptEncaissConsignNumCred = cptEncaissConsignNumCred;
        this.jEncaissConsgnNum = jEncaissConsgnNum;
        this.cptEncaissDepotBancDeb = cptEncaissDepotBancDeb;
        this.cptEncaissDepotBancCred = cptEncaissDepotBancCred;
        this.jEncaissDepotBanc = jEncaissDepotBanc;
        this.cptEncaissConsignBancDeb = cptEncaissConsignBancDeb;
        this.cptEncaissConsignBancCred = cptEncaissConsignBancCred;
        this.jEncaissConsgnBanc = jEncaissConsgnBanc;
        this.cptDecaissDepotNumDeb = cptDecaissDepotNumDeb;
        this.cptDecaissDepotNumCred = cptDecaissDepotNumCred;
        this.jDecaissDepotNum = jDecaissDepotNum;
        this.cptDecaissConsignNumDeb = cptDecaissConsignNumDeb;
        this.cptDecaissConsignNumCred = cptDecaissConsignNumCred;
        this.jDecaissConsgnNum = jDecaissConsgnNum;
        this.cptDecaissDepotBancDeb = cptDecaissDepotBancDeb;
        this.cptDecaissDepotBancCred = cptDecaissDepotBancCred;
        this.jDecaissDepotBanc = jDecaissDepotBanc;
        this.cptDecaissConsignBancDeb = cptDecaissConsignBancDeb;
        this.cptDecaissConsignBancCred = cptDecaissConsignBancCred;
        this.jDecaissConsgnBanc = jDecaissConsgnBanc;
        this.cptPecEncaissDepotDeb = cptPecEncaissDepotDeb;
        this.cptPecEncaissDepotCred = cptPecEncaissDepotCred;
        this.jPecEncaissDepot = jPecEncaissDepot;
        this.cptPecEncaissConsignDeb = cptPecEncaissConsignDeb;
        this.cptPecEncaissConsignCred = cptPecEncaissConsignCred;
        this.jPecEncaissConsign = jPecEncaissConsign;
        this.cptPecMandDeb = cptPecMandDeb;
        this.cptPecMandCred = cptPecMandCred;
        this.jPecMand = jPecMand;
        this.cptPayOpNumDeb = cptPayOpNumDeb;
        this.cptPayOpNumCred = cptPayOpNumCred;
        this.jPayOpNum = jPayOpNum;
        this.cptPayOpBancDeb = cptPayOpBancDeb;
        this.cptPayOpBancCred = cptPayOpBancCred;
        this.jPayOpBanc = jPayOpBanc;
        this.cptVirementInterne = cptVirementInterne;
        this.cptPecDecaissDepotDeb = cptPecDecaissDepotDeb;
        this.cptPecDecaissDepotCred = cptPecDecaissDepotCred;
        this.jPecDecaissDepot = jPecDecaissDepot;
        this.cptPecDecaissConsignDeb = cptPecDecaissConsignDeb;
        this.cptPecDecaissConsignCred = cptPecDecaissConsignCred;
        this.jPecDecaissConsign = jPecDecaissConsign;
        this.cpttimbre = cpttimbre;
        this.valeurTimbre = valeurTimbre;
        this.jOd = jOd;
        this.jSuppres = jSuppres;
        this.cpttimbreDeg = cpttimbreDeg;
        this.controlTG = controlTG;
    }

    public Integer getIDParametres() {
        return iDParametres;
    }

    public void setIDParametres(Integer iDParametres) {
        this.iDParametres = iDParametres;
    }

    public String getJEncaissDepotNum() {
        return jEncaissDepotNum;
    }

    public void setJEncaissDepotNum(String jEncaissDepotNum) {
        this.jEncaissDepotNum = jEncaissDepotNum;
    }

    public String getJournAnnul() {
        return journAnnul;
    }

    public void setJournAnnul(String journAnnul) {
        this.journAnnul = journAnnul;
    }

    public short getGestionAutoQuit() {
        return gestionAutoQuit;
    }

    public void setGestionAutoQuit(short gestionAutoQuit) {
        this.gestionAutoQuit = gestionAutoQuit;
    }

    public String getValQuit() {
        return valQuit;
    }

    public void setValQuit(String valQuit) {
        this.valQuit = valQuit;
    }

    public String getNUMerocompteVirementInternes() {
        return nUMerocompteVirementInternes;
    }

    public void setNUMerocompteVirementInternes(String nUMerocompteVirementInternes) {
        this.nUMerocompteVirementInternes = nUMerocompteVirementInternes;
    }

    public String getCptEncaissDepotNumDeb() {
        return cptEncaissDepotNumDeb;
    }

    public void setCptEncaissDepotNumDeb(String cptEncaissDepotNumDeb) {
        this.cptEncaissDepotNumDeb = cptEncaissDepotNumDeb;
    }

    public String getCptEncaissDepotNumCred() {
        return cptEncaissDepotNumCred;
    }

    public void setCptEncaissDepotNumCred(String cptEncaissDepotNumCred) {
        this.cptEncaissDepotNumCred = cptEncaissDepotNumCred;
    }

    public String getCptEncaissConsignNumDeb() {
        return cptEncaissConsignNumDeb;
    }

    public void setCptEncaissConsignNumDeb(String cptEncaissConsignNumDeb) {
        this.cptEncaissConsignNumDeb = cptEncaissConsignNumDeb;
    }

    public String getCptEncaissConsignNumCred() {
        return cptEncaissConsignNumCred;
    }

    public void setCptEncaissConsignNumCred(String cptEncaissConsignNumCred) {
        this.cptEncaissConsignNumCred = cptEncaissConsignNumCred;
    }

    public String getJEncaissConsgnNum() {
        return jEncaissConsgnNum;
    }

    public void setJEncaissConsgnNum(String jEncaissConsgnNum) {
        this.jEncaissConsgnNum = jEncaissConsgnNum;
    }

    public String getCptEncaissDepotBancDeb() {
        return cptEncaissDepotBancDeb;
    }

    public void setCptEncaissDepotBancDeb(String cptEncaissDepotBancDeb) {
        this.cptEncaissDepotBancDeb = cptEncaissDepotBancDeb;
    }

    public String getCptEncaissDepotBancCred() {
        return cptEncaissDepotBancCred;
    }

    public void setCptEncaissDepotBancCred(String cptEncaissDepotBancCred) {
        this.cptEncaissDepotBancCred = cptEncaissDepotBancCred;
    }

    public String getJEncaissDepotBanc() {
        return jEncaissDepotBanc;
    }

    public void setJEncaissDepotBanc(String jEncaissDepotBanc) {
        this.jEncaissDepotBanc = jEncaissDepotBanc;
    }

    public String getCptEncaissConsignBancDeb() {
        return cptEncaissConsignBancDeb;
    }

    public void setCptEncaissConsignBancDeb(String cptEncaissConsignBancDeb) {
        this.cptEncaissConsignBancDeb = cptEncaissConsignBancDeb;
    }

    public String getCptEncaissConsignBancCred() {
        return cptEncaissConsignBancCred;
    }

    public void setCptEncaissConsignBancCred(String cptEncaissConsignBancCred) {
        this.cptEncaissConsignBancCred = cptEncaissConsignBancCred;
    }

    public String getJEncaissConsgnBanc() {
        return jEncaissConsgnBanc;
    }

    public void setJEncaissConsgnBanc(String jEncaissConsgnBanc) {
        this.jEncaissConsgnBanc = jEncaissConsgnBanc;
    }

    public String getCptDecaissDepotNumDeb() {
        return cptDecaissDepotNumDeb;
    }

    public void setCptDecaissDepotNumDeb(String cptDecaissDepotNumDeb) {
        this.cptDecaissDepotNumDeb = cptDecaissDepotNumDeb;
    }

    public String getCptDecaissDepotNumCred() {
        return cptDecaissDepotNumCred;
    }

    public void setCptDecaissDepotNumCred(String cptDecaissDepotNumCred) {
        this.cptDecaissDepotNumCred = cptDecaissDepotNumCred;
    }

    public String getJDecaissDepotNum() {
        return jDecaissDepotNum;
    }

    public void setJDecaissDepotNum(String jDecaissDepotNum) {
        this.jDecaissDepotNum = jDecaissDepotNum;
    }

    public String getCptDecaissConsignNumDeb() {
        return cptDecaissConsignNumDeb;
    }

    public void setCptDecaissConsignNumDeb(String cptDecaissConsignNumDeb) {
        this.cptDecaissConsignNumDeb = cptDecaissConsignNumDeb;
    }

    public String getCptDecaissConsignNumCred() {
        return cptDecaissConsignNumCred;
    }

    public void setCptDecaissConsignNumCred(String cptDecaissConsignNumCred) {
        this.cptDecaissConsignNumCred = cptDecaissConsignNumCred;
    }

    public String getJDecaissConsgnNum() {
        return jDecaissConsgnNum;
    }

    public void setJDecaissConsgnNum(String jDecaissConsgnNum) {
        this.jDecaissConsgnNum = jDecaissConsgnNum;
    }

    public String getCptDecaissDepotBancDeb() {
        return cptDecaissDepotBancDeb;
    }

    public void setCptDecaissDepotBancDeb(String cptDecaissDepotBancDeb) {
        this.cptDecaissDepotBancDeb = cptDecaissDepotBancDeb;
    }

    public String getCptDecaissDepotBancCred() {
        return cptDecaissDepotBancCred;
    }

    public void setCptDecaissDepotBancCred(String cptDecaissDepotBancCred) {
        this.cptDecaissDepotBancCred = cptDecaissDepotBancCred;
    }

    public String getJDecaissDepotBanc() {
        return jDecaissDepotBanc;
    }

    public void setJDecaissDepotBanc(String jDecaissDepotBanc) {
        this.jDecaissDepotBanc = jDecaissDepotBanc;
    }

    public String getCptDecaissConsignBancDeb() {
        return cptDecaissConsignBancDeb;
    }

    public void setCptDecaissConsignBancDeb(String cptDecaissConsignBancDeb) {
        this.cptDecaissConsignBancDeb = cptDecaissConsignBancDeb;
    }

    public String getCptDecaissConsignBancCred() {
        return cptDecaissConsignBancCred;
    }

    public void setCptDecaissConsignBancCred(String cptDecaissConsignBancCred) {
        this.cptDecaissConsignBancCred = cptDecaissConsignBancCred;
    }

    public String getJDecaissConsgnBanc() {
        return jDecaissConsgnBanc;
    }

    public void setJDecaissConsgnBanc(String jDecaissConsgnBanc) {
        this.jDecaissConsgnBanc = jDecaissConsgnBanc;
    }

    public String getCptPecEncaissDepotDeb() {
        return cptPecEncaissDepotDeb;
    }

    public void setCptPecEncaissDepotDeb(String cptPecEncaissDepotDeb) {
        this.cptPecEncaissDepotDeb = cptPecEncaissDepotDeb;
    }

    public String getCptPecEncaissDepotCred() {
        return cptPecEncaissDepotCred;
    }

    public void setCptPecEncaissDepotCred(String cptPecEncaissDepotCred) {
        this.cptPecEncaissDepotCred = cptPecEncaissDepotCred;
    }

    public String getJPecEncaissDepot() {
        return jPecEncaissDepot;
    }

    public void setJPecEncaissDepot(String jPecEncaissDepot) {
        this.jPecEncaissDepot = jPecEncaissDepot;
    }

    public String getCptPecEncaissConsignDeb() {
        return cptPecEncaissConsignDeb;
    }

    public void setCptPecEncaissConsignDeb(String cptPecEncaissConsignDeb) {
        this.cptPecEncaissConsignDeb = cptPecEncaissConsignDeb;
    }

    public String getCptPecEncaissConsignCred() {
        return cptPecEncaissConsignCred;
    }

    public void setCptPecEncaissConsignCred(String cptPecEncaissConsignCred) {
        this.cptPecEncaissConsignCred = cptPecEncaissConsignCred;
    }

    public String getJPecEncaissConsign() {
        return jPecEncaissConsign;
    }

    public void setJPecEncaissConsign(String jPecEncaissConsign) {
        this.jPecEncaissConsign = jPecEncaissConsign;
    }

    public String getCptPecMandDeb() {
        return cptPecMandDeb;
    }

    public void setCptPecMandDeb(String cptPecMandDeb) {
        this.cptPecMandDeb = cptPecMandDeb;
    }

    public String getCptPecMandCred() {
        return cptPecMandCred;
    }

    public void setCptPecMandCred(String cptPecMandCred) {
        this.cptPecMandCred = cptPecMandCred;
    }

    public String getJPecMand() {
        return jPecMand;
    }

    public void setJPecMand(String jPecMand) {
        this.jPecMand = jPecMand;
    }

    public String getCptPayOpNumDeb() {
        return cptPayOpNumDeb;
    }

    public void setCptPayOpNumDeb(String cptPayOpNumDeb) {
        this.cptPayOpNumDeb = cptPayOpNumDeb;
    }

    public String getCptPayOpNumCred() {
        return cptPayOpNumCred;
    }

    public void setCptPayOpNumCred(String cptPayOpNumCred) {
        this.cptPayOpNumCred = cptPayOpNumCred;
    }

    public String getJPayOpNum() {
        return jPayOpNum;
    }

    public void setJPayOpNum(String jPayOpNum) {
        this.jPayOpNum = jPayOpNum;
    }

    public String getCptPayOpBancDeb() {
        return cptPayOpBancDeb;
    }

    public void setCptPayOpBancDeb(String cptPayOpBancDeb) {
        this.cptPayOpBancDeb = cptPayOpBancDeb;
    }

    public String getCptPayOpBancCred() {
        return cptPayOpBancCred;
    }

    public void setCptPayOpBancCred(String cptPayOpBancCred) {
        this.cptPayOpBancCred = cptPayOpBancCred;
    }

    public String getJPayOpBanc() {
        return jPayOpBanc;
    }

    public void setJPayOpBanc(String jPayOpBanc) {
        this.jPayOpBanc = jPayOpBanc;
    }

    public String getCptVirementInterne() {
        return cptVirementInterne;
    }

    public void setCptVirementInterne(String cptVirementInterne) {
        this.cptVirementInterne = cptVirementInterne;
    }

    public String getCptPecDecaissDepotDeb() {
        return cptPecDecaissDepotDeb;
    }

    public void setCptPecDecaissDepotDeb(String cptPecDecaissDepotDeb) {
        this.cptPecDecaissDepotDeb = cptPecDecaissDepotDeb;
    }

    public String getCptPecDecaissDepotCred() {
        return cptPecDecaissDepotCred;
    }

    public void setCptPecDecaissDepotCred(String cptPecDecaissDepotCred) {
        this.cptPecDecaissDepotCred = cptPecDecaissDepotCred;
    }

    public String getJPecDecaissDepot() {
        return jPecDecaissDepot;
    }

    public void setJPecDecaissDepot(String jPecDecaissDepot) {
        this.jPecDecaissDepot = jPecDecaissDepot;
    }

    public String getCptPecDecaissConsignDeb() {
        return cptPecDecaissConsignDeb;
    }

    public void setCptPecDecaissConsignDeb(String cptPecDecaissConsignDeb) {
        this.cptPecDecaissConsignDeb = cptPecDecaissConsignDeb;
    }

    public String getCptPecDecaissConsignCred() {
        return cptPecDecaissConsignCred;
    }

    public void setCptPecDecaissConsignCred(String cptPecDecaissConsignCred) {
        this.cptPecDecaissConsignCred = cptPecDecaissConsignCred;
    }

    public String getJPecDecaissConsign() {
        return jPecDecaissConsign;
    }

    public void setJPecDecaissConsign(String jPecDecaissConsign) {
        this.jPecDecaissConsign = jPecDecaissConsign;
    }

    public String getCpttimbre() {
        return cpttimbre;
    }

    public void setCpttimbre(String cpttimbre) {
        this.cpttimbre = cpttimbre;
    }

    public BigDecimal getValeurTimbre() {
        return valeurTimbre;
    }

    public void setValeurTimbre(BigDecimal valeurTimbre) {
        this.valeurTimbre = valeurTimbre;
    }

    public String getJOd() {
        return jOd;
    }

    public void setJOd(String jOd) {
        this.jOd = jOd;
    }

    public String getJSuppres() {
        return jSuppres;
    }

    public void setJSuppres(String jSuppres) {
        this.jSuppres = jSuppres;
    }

    public String getCpttimbreDeg() {
        return cpttimbreDeg;
    }

    public void setCpttimbreDeg(String cpttimbreDeg) {
        this.cpttimbreDeg = cpttimbreDeg;
    }

    public short getControlTG() {
        return controlTG;
    }

    public void setControlTG(short controlTG) {
        this.controlTG = controlTG;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDParametres != null ? iDParametres.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parametres)) {
            return false;
        }
        Parametres other = (Parametres) object;
        if ((this.iDParametres == null && other.iDParametres != null) || (this.iDParametres != null && !this.iDParametres.equals(other.iDParametres))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Parametres[ iDParametres=" + iDParametres + " ]";
    }
    
}
