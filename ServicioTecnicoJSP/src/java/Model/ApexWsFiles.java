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
@Table(name = "APEX$_WS_FILES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ApexWsFiles.findAll", query = "SELECT a FROM ApexWsFiles a"),
    @NamedQuery(name = "ApexWsFiles.findById", query = "SELECT a FROM ApexWsFiles a WHERE a.id = :id"),
    @NamedQuery(name = "ApexWsFiles.findByWsAppId", query = "SELECT a FROM ApexWsFiles a WHERE a.wsAppId = :wsAppId"),
    @NamedQuery(name = "ApexWsFiles.findByDataGridId", query = "SELECT a FROM ApexWsFiles a WHERE a.dataGridId = :dataGridId"),
    @NamedQuery(name = "ApexWsFiles.findByWebpageId", query = "SELECT a FROM ApexWsFiles a WHERE a.webpageId = :webpageId"),
    @NamedQuery(name = "ApexWsFiles.findByComponentLevel", query = "SELECT a FROM ApexWsFiles a WHERE a.componentLevel = :componentLevel"),
    @NamedQuery(name = "ApexWsFiles.findByName", query = "SELECT a FROM ApexWsFiles a WHERE a.name = :name"),
    @NamedQuery(name = "ApexWsFiles.findByImageAlias", query = "SELECT a FROM ApexWsFiles a WHERE a.imageAlias = :imageAlias"),
    @NamedQuery(name = "ApexWsFiles.findByImageAttributes", query = "SELECT a FROM ApexWsFiles a WHERE a.imageAttributes = :imageAttributes"),
    @NamedQuery(name = "ApexWsFiles.findByContentLastUpdate", query = "SELECT a FROM ApexWsFiles a WHERE a.contentLastUpdate = :contentLastUpdate"),
    @NamedQuery(name = "ApexWsFiles.findByMimeType", query = "SELECT a FROM ApexWsFiles a WHERE a.mimeType = :mimeType"),
    @NamedQuery(name = "ApexWsFiles.findByContentCharset", query = "SELECT a FROM ApexWsFiles a WHERE a.contentCharset = :contentCharset"),
    @NamedQuery(name = "ApexWsFiles.findByContentFilename", query = "SELECT a FROM ApexWsFiles a WHERE a.contentFilename = :contentFilename"),
    @NamedQuery(name = "ApexWsFiles.findByDescription", query = "SELECT a FROM ApexWsFiles a WHERE a.description = :description"),
    @NamedQuery(name = "ApexWsFiles.findByCreatedOn", query = "SELECT a FROM ApexWsFiles a WHERE a.createdOn = :createdOn"),
    @NamedQuery(name = "ApexWsFiles.findByCreatedBy", query = "SELECT a FROM ApexWsFiles a WHERE a.createdBy = :createdBy"),
    @NamedQuery(name = "ApexWsFiles.findByUpdatedOn", query = "SELECT a FROM ApexWsFiles a WHERE a.updatedOn = :updatedOn"),
    @NamedQuery(name = "ApexWsFiles.findByUpdatedBy", query = "SELECT a FROM ApexWsFiles a WHERE a.updatedBy = :updatedBy")})
public class ApexWsFiles implements Serializable {
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
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Column(name = "IMAGE_ALIAS")
    private String imageAlias;
    @Column(name = "IMAGE_ATTRIBUTES")
    private String imageAttributes;
    @Lob
    @Column(name = "CONTENT")
    private Serializable content;
    @Column(name = "CONTENT_LAST_UPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date contentLastUpdate;
    @Basic(optional = false)
    @Column(name = "MIME_TYPE")
    private String mimeType;
    @Column(name = "CONTENT_CHARSET")
    private String contentCharset;
    @Column(name = "CONTENT_FILENAME")
    private String contentFilename;
    @Column(name = "DESCRIPTION")
    private String description;
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

    public ApexWsFiles() {
    }

    public ApexWsFiles(BigDecimal id) {
        this.id = id;
    }

    public ApexWsFiles(BigDecimal id, BigInteger wsAppId, String name, String mimeType, Date createdOn, String createdBy) {
        this.id = id;
        this.wsAppId = wsAppId;
        this.name = name;
        this.mimeType = mimeType;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageAlias() {
        return imageAlias;
    }

    public void setImageAlias(String imageAlias) {
        this.imageAlias = imageAlias;
    }

    public String getImageAttributes() {
        return imageAttributes;
    }

    public void setImageAttributes(String imageAttributes) {
        this.imageAttributes = imageAttributes;
    }

    public Serializable getContent() {
        return content;
    }

    public void setContent(Serializable content) {
        this.content = content;
    }

    public Date getContentLastUpdate() {
        return contentLastUpdate;
    }

    public void setContentLastUpdate(Date contentLastUpdate) {
        this.contentLastUpdate = contentLastUpdate;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getContentCharset() {
        return contentCharset;
    }

    public void setContentCharset(String contentCharset) {
        this.contentCharset = contentCharset;
    }

    public String getContentFilename() {
        return contentFilename;
    }

    public void setContentFilename(String contentFilename) {
        this.contentFilename = contentFilename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        if (!(object instanceof ApexWsFiles)) {
            return false;
        }
        ApexWsFiles other = (ApexWsFiles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.ApexWsFiles[ id=" + id + " ]";
    }
    
}
