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
import javax.persistence.Lob;
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
@Table(name = "APEX$_WS_WEBPG_SECTIONS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ApexWsWebpgSections.findAll", query = "SELECT a FROM ApexWsWebpgSections a"),
    @NamedQuery(name = "ApexWsWebpgSections.findById", query = "SELECT a FROM ApexWsWebpgSections a WHERE a.id = :id"),
    @NamedQuery(name = "ApexWsWebpgSections.findByWsAppId", query = "SELECT a FROM ApexWsWebpgSections a WHERE a.wsAppId = :wsAppId"),
    @NamedQuery(name = "ApexWsWebpgSections.findByWebpageId", query = "SELECT a FROM ApexWsWebpgSections a WHERE a.webpageId = :webpageId"),
    @NamedQuery(name = "ApexWsWebpgSections.findByDisplaySequence", query = "SELECT a FROM ApexWsWebpgSections a WHERE a.displaySequence = :displaySequence"),
    @NamedQuery(name = "ApexWsWebpgSections.findBySectionType", query = "SELECT a FROM ApexWsWebpgSections a WHERE a.sectionType = :sectionType"),
    @NamedQuery(name = "ApexWsWebpgSections.findByTitle", query = "SELECT a FROM ApexWsWebpgSections a WHERE a.title = :title"),
    @NamedQuery(name = "ApexWsWebpgSections.findByNavStartWebpageId", query = "SELECT a FROM ApexWsWebpgSections a WHERE a.navStartWebpageId = :navStartWebpageId"),
    @NamedQuery(name = "ApexWsWebpgSections.findByNavMaxLevel", query = "SELECT a FROM ApexWsWebpgSections a WHERE a.navMaxLevel = :navMaxLevel"),
    @NamedQuery(name = "ApexWsWebpgSections.findByNavIncludeLink", query = "SELECT a FROM ApexWsWebpgSections a WHERE a.navIncludeLink = :navIncludeLink"),
    @NamedQuery(name = "ApexWsWebpgSections.findByDataGridId", query = "SELECT a FROM ApexWsWebpgSections a WHERE a.dataGridId = :dataGridId"),
    @NamedQuery(name = "ApexWsWebpgSections.findByReportId", query = "SELECT a FROM ApexWsWebpgSections a WHERE a.reportId = :reportId"),
    @NamedQuery(name = "ApexWsWebpgSections.findByDataSectionStyle", query = "SELECT a FROM ApexWsWebpgSections a WHERE a.dataSectionStyle = :dataSectionStyle"),
    @NamedQuery(name = "ApexWsWebpgSections.findByChartType", query = "SELECT a FROM ApexWsWebpgSections a WHERE a.chartType = :chartType"),
    @NamedQuery(name = "ApexWsWebpgSections.findByChart3d", query = "SELECT a FROM ApexWsWebpgSections a WHERE a.chart3d = :chart3d"),
    @NamedQuery(name = "ApexWsWebpgSections.findByChartLabel", query = "SELECT a FROM ApexWsWebpgSections a WHERE a.chartLabel = :chartLabel"),
    @NamedQuery(name = "ApexWsWebpgSections.findByLabelAxisTitle", query = "SELECT a FROM ApexWsWebpgSections a WHERE a.labelAxisTitle = :labelAxisTitle"),
    @NamedQuery(name = "ApexWsWebpgSections.findByChartValue", query = "SELECT a FROM ApexWsWebpgSections a WHERE a.chartValue = :chartValue"),
    @NamedQuery(name = "ApexWsWebpgSections.findByValueAxisTitle", query = "SELECT a FROM ApexWsWebpgSections a WHERE a.valueAxisTitle = :valueAxisTitle"),
    @NamedQuery(name = "ApexWsWebpgSections.findByChartAggregate", query = "SELECT a FROM ApexWsWebpgSections a WHERE a.chartAggregate = :chartAggregate"),
    @NamedQuery(name = "ApexWsWebpgSections.findByChartSorting", query = "SELECT a FROM ApexWsWebpgSections a WHERE a.chartSorting = :chartSorting"),
    @NamedQuery(name = "ApexWsWebpgSections.findByCreatedOn", query = "SELECT a FROM ApexWsWebpgSections a WHERE a.createdOn = :createdOn"),
    @NamedQuery(name = "ApexWsWebpgSections.findByCreatedBy", query = "SELECT a FROM ApexWsWebpgSections a WHERE a.createdBy = :createdBy"),
    @NamedQuery(name = "ApexWsWebpgSections.findByUpdatedOn", query = "SELECT a FROM ApexWsWebpgSections a WHERE a.updatedOn = :updatedOn"),
    @NamedQuery(name = "ApexWsWebpgSections.findByUpdatedBy", query = "SELECT a FROM ApexWsWebpgSections a WHERE a.updatedBy = :updatedBy")})
public class ApexWsWebpgSections implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "WS_APP_ID")
    private BigInteger wsAppId;
    @Column(name = "WEBPAGE_ID")
    private BigInteger webpageId;
    @Column(name = "DISPLAY_SEQUENCE")
    private BigInteger displaySequence;
    @Basic(optional = false)
    @Column(name = "SECTION_TYPE")
    private String sectionType;
    @Column(name = "TITLE")
    private String title;
    @Lob
    @Column(name = "CONTENT")
    private String content;
    @Lob
    @Column(name = "CONTENT_UPPER")
    private String contentUpper;
    @Column(name = "NAV_START_WEBPAGE_ID")
    private BigInteger navStartWebpageId;
    @Column(name = "NAV_MAX_LEVEL")
    private BigInteger navMaxLevel;
    @Column(name = "NAV_INCLUDE_LINK")
    private String navIncludeLink;
    @Column(name = "DATA_GRID_ID")
    private BigInteger dataGridId;
    @Column(name = "REPORT_ID")
    private BigInteger reportId;
    @Column(name = "DATA_SECTION_STYLE")
    private BigInteger dataSectionStyle;
    @Column(name = "CHART_TYPE")
    private String chartType;
    @Column(name = "CHART_3D")
    private String chart3d;
    @Column(name = "CHART_LABEL")
    private String chartLabel;
    @Column(name = "LABEL_AXIS_TITLE")
    private String labelAxisTitle;
    @Column(name = "CHART_VALUE")
    private String chartValue;
    @Column(name = "VALUE_AXIS_TITLE")
    private String valueAxisTitle;
    @Column(name = "CHART_AGGREGATE")
    private String chartAggregate;
    @Column(name = "CHART_SORTING")
    private String chartSorting;
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

    public ApexWsWebpgSections() {
    }

    public ApexWsWebpgSections(BigDecimal id) {
        this.id = id;
    }

    public ApexWsWebpgSections(BigDecimal id, BigInteger wsAppId, String sectionType, Date createdOn, String createdBy) {
        this.id = id;
        this.wsAppId = wsAppId;
        this.sectionType = sectionType;
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

    public BigInteger getWebpageId() {
        return webpageId;
    }

    public void setWebpageId(BigInteger webpageId) {
        this.webpageId = webpageId;
    }

    public BigInteger getDisplaySequence() {
        return displaySequence;
    }

    public void setDisplaySequence(BigInteger displaySequence) {
        this.displaySequence = displaySequence;
    }

    public String getSectionType() {
        return sectionType;
    }

    public void setSectionType(String sectionType) {
        this.sectionType = sectionType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentUpper() {
        return contentUpper;
    }

    public void setContentUpper(String contentUpper) {
        this.contentUpper = contentUpper;
    }

    public BigInteger getNavStartWebpageId() {
        return navStartWebpageId;
    }

    public void setNavStartWebpageId(BigInteger navStartWebpageId) {
        this.navStartWebpageId = navStartWebpageId;
    }

    public BigInteger getNavMaxLevel() {
        return navMaxLevel;
    }

    public void setNavMaxLevel(BigInteger navMaxLevel) {
        this.navMaxLevel = navMaxLevel;
    }

    public String getNavIncludeLink() {
        return navIncludeLink;
    }

    public void setNavIncludeLink(String navIncludeLink) {
        this.navIncludeLink = navIncludeLink;
    }

    public BigInteger getDataGridId() {
        return dataGridId;
    }

    public void setDataGridId(BigInteger dataGridId) {
        this.dataGridId = dataGridId;
    }

    public BigInteger getReportId() {
        return reportId;
    }

    public void setReportId(BigInteger reportId) {
        this.reportId = reportId;
    }

    public BigInteger getDataSectionStyle() {
        return dataSectionStyle;
    }

    public void setDataSectionStyle(BigInteger dataSectionStyle) {
        this.dataSectionStyle = dataSectionStyle;
    }

    public String getChartType() {
        return chartType;
    }

    public void setChartType(String chartType) {
        this.chartType = chartType;
    }

    public String getChart3d() {
        return chart3d;
    }

    public void setChart3d(String chart3d) {
        this.chart3d = chart3d;
    }

    public String getChartLabel() {
        return chartLabel;
    }

    public void setChartLabel(String chartLabel) {
        this.chartLabel = chartLabel;
    }

    public String getLabelAxisTitle() {
        return labelAxisTitle;
    }

    public void setLabelAxisTitle(String labelAxisTitle) {
        this.labelAxisTitle = labelAxisTitle;
    }

    public String getChartValue() {
        return chartValue;
    }

    public void setChartValue(String chartValue) {
        this.chartValue = chartValue;
    }

    public String getValueAxisTitle() {
        return valueAxisTitle;
    }

    public void setValueAxisTitle(String valueAxisTitle) {
        this.valueAxisTitle = valueAxisTitle;
    }

    public String getChartAggregate() {
        return chartAggregate;
    }

    public void setChartAggregate(String chartAggregate) {
        this.chartAggregate = chartAggregate;
    }

    public String getChartSorting() {
        return chartSorting;
    }

    public void setChartSorting(String chartSorting) {
        this.chartSorting = chartSorting;
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
        if (!(object instanceof ApexWsWebpgSections)) {
            return false;
        }
        ApexWsWebpgSections other = (ApexWsWebpgSections) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.ApexWsWebpgSections[ id=" + id + " ]";
    }
    
}
