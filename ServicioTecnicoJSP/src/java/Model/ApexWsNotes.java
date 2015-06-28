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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "APEX$_WS_NOTES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ApexWsNotes.findAll", query = "SELECT a FROM ApexWsNotes a"),
    @NamedQuery(name = "ApexWsNotes.findById", query = "SELECT a FROM ApexWsNotes a WHERE a.id = :id"),
    @NamedQuery(name = "ApexWsNotes.findByWsAppId", query = "SELECT a FROM ApexWsNotes a WHERE a.wsAppId = :wsAppId"),
    @NamedQuery(name = "ApexWsNotes.findByDataGridId", query = "SELECT a FROM ApexWsNotes a WHERE a.dataGridId = :dataGridId"),
    @NamedQuery(name = "ApexWsNotes.findByWebpageId", query = "SELECT a FROM ApexWsNotes a WHERE a.webpageId = :webpageId"),
    @NamedQuery(name = "ApexWsNotes.findByComponentLevel", query = "SELECT a FROM ApexWsNotes a WHERE a.componentLevel = :componentLevel"),
    @NamedQuery(name = "ApexWsNotes.findByCreatedOn", query = "SELECT a FROM ApexWsNotes a WHERE a.createdOn = :createdOn"),
    @NamedQuery(name = "ApexWsNotes.findByCreatedBy", query = "SELECT a FROM ApexWsNotes a WHERE a.createdBy = :createdBy"),
    @NamedQuery(name = "ApexWsNotes.findByUpdatedOn", query = "SELECT a FROM ApexWsNotes a WHERE a.updatedOn = :updatedOn"),
    @NamedQuery(name = "ApexWsNotes.findByUpdatedBy", query = "SELECT a FROM ApexWsNotes a WHERE a.updatedBy = :updatedBy")})
public class ApexWsNotes implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "WS_APP_ID")
    private BigInteger wsAppId;
    @Column(name = "DATA_GRID_ID")
    private BigInteger dataGridId;
    @Column(name = "WEBPAGE_ID")
    private BigInteger webpageId;
    @Column(name = "COMPONENT_LEVEL")
    private String componentLevel;
    @Lob
    @Column(name = "CONTENT")
    private String content;
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
    @JoinColumn(name = "ROW_ID", referencedColumnName = "ID")
    @ManyToOne
    private ApexWsRows rowId;

    public ApexWsNotes() {
    }

    public ApexWsNotes(BigDecimal id) {
        this.id = id;
    }

    public ApexWsNotes(BigDecimal id, BigInteger wsAppId, Date createdOn, String createdBy) {
        this.id = id;
        this.wsAppId = wsAppId;
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

    public BigInteger getDataGridId() {
        return dataGridId;
    }

    public void setDataGridId(BigInteger dataGridId) {
        this.dataGridId = dataGridId;
    }

    public BigInteger getWebpageId() {
        return webpageId;
    }

    public void setWebpageId(BigInteger webpageId) {
        this.webpageId = webpageId;
    }

    public String getComponentLevel() {
        return componentLevel;
    }

    public void setComponentLevel(String componentLevel) {
        this.componentLevel = componentLevel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public ApexWsRows getRowId() {
        return rowId;
    }

    public void setRowId(ApexWsRows rowId) {
        this.rowId = rowId;
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
        if (!(object instanceof ApexWsNotes)) {
            return false;
        }
        ApexWsNotes other = (ApexWsNotes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.ApexWsNotes[ id=" + id + " ]";
    }
    
}
