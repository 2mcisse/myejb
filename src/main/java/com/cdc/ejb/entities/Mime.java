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
import javax.persistence.Lob;
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
@Table(name = "mime")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mime.findAll", query = "SELECT m FROM Mime m")
    , @NamedQuery(name = "Mime.findByExtension", query = "SELECT m FROM Mime m WHERE m.extension = :extension")
    , @NamedQuery(name = "Mime.findByTypeMIME", query = "SELECT m FROM Mime m WHERE m.typeMIME = :typeMIME")})
public class Mime implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "Extension")
    private String extension;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "TypeMIME")
    private String typeMIME;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "Icone")
    private byte[] icone;

    public Mime() {
    }

    public Mime(String extension) {
        this.extension = extension;
    }

    public Mime(String extension, String typeMIME, byte[] icone) {
        this.extension = extension;
        this.typeMIME = typeMIME;
        this.icone = icone;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getTypeMIME() {
        return typeMIME;
    }

    public void setTypeMIME(String typeMIME) {
        this.typeMIME = typeMIME;
    }

    public byte[] getIcone() {
        return icone;
    }

    public void setIcone(byte[] icone) {
        this.icone = icone;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (extension != null ? extension.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mime)) {
            return false;
        }
        Mime other = (Mime) object;
        if ((this.extension == null && other.extension != null) || (this.extension != null && !this.extension.equals(other.extension))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Mime[ extension=" + extension + " ]";
    }
    
}
