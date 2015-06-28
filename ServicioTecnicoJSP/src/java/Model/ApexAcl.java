/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AlexPabon
 */
@Entity
@Table(name = "APEX$_ACL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ApexAcl.findAll", query = "SELECT a FROM ApexAcl a"),
    @NamedQuery(name = "ApexAcl.findById", query = "SELECT a FROM ApexAcl a WHERE a.id = :id"),
    @NamedQuery(name = "ApexAcl.findByWsAppId", query = "SELECT a FROM ApexAcl a WHERE a.wsAppId = :wsAppId"),
    @NamedQuery(name = "ApexAcl.findByUsername", query = "SELECT a FROM ApexAcl a WHERE a.username = :username"),
    @NamedQuery(name = "ApexAcl.findByPriv", query = "SELECT a FROM ApexAcl a WHERE a.priv = :priv"),
    @NamedQuery(name = "ApexAcl.findByCreatedOn", query = "SELECT a FROM ApexAcl a WHERE a.createdOn = :createdOn"),
    @NamedQuery(name = "ApexAcl.findByCreatedBy", query = "SELECT a FROM ApexAcl a WHERE a.createdBy = :createdBy"),
    @NamedQuery(name = "ApexAcl.findByUpdatedOn", query = "SELECT a FROM ApexAcl a WHERE a.updatedOn = :updatedOn"),
    @NamedQuery(name = "ApexAcl.findByUpdatedBy", query = "SELECT a FROM ApexAcl a WHERE a.updatedBy = :updatedBy")})
public class ApexAcl implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "WS_APP_ID")
    private BigInteger wsAppId;
    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;
    @Basic(optional = false)
    @Column(name = "PRIV")
    private String priv;
    @Basic(optional = false)
    @Column(name = "CREATED_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Basic(optional = false)
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "UPDATED_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;
    @Column(name = "UPDATED_BY")
    private String updatedBy;

    public ApexAcl() {
    }

    public ApexAcl(BigDecimal id) {
        this.id = id;
    }

    public ApexAcl(BigDecimal id, BigInteger wsAppId, String username, String priv, Date createdOn, String createdBy) {
        this.id = id;
        this.wsAppId = wsAppId;
        this.username = username;
        this.priv = priv;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getWsAppId() {
        return wsAppId;
    }

    public void setWsAppId(BigInteger wsAppId) {
        this.wsAppId = wsAppId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPriv() {
        return priv;
    }

    public void setPriv(String priv) {
        this.priv = priv;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ApexAcl)) {
            return false;
        }
        ApexAcl other = (ApexAcl) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.ApexAcl[ id=" + id + " ]";
    }
    
}
