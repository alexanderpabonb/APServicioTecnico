/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author AlexPabon
 */
@Entity
@Table(name = "DEMO_PRODUCT_INFO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DemoProductInfo.findAll", query = "SELECT d FROM DemoProductInfo d"),
    @NamedQuery(name = "DemoProductInfo.findByProductId", query = "SELECT d FROM DemoProductInfo d WHERE d.productId = :productId"),
    @NamedQuery(name = "DemoProductInfo.findByProductName", query = "SELECT d FROM DemoProductInfo d WHERE d.productName = :productName"),
    @NamedQuery(name = "DemoProductInfo.findByProductDescription", query = "SELECT d FROM DemoProductInfo d WHERE d.productDescription = :productDescription"),
    @NamedQuery(name = "DemoProductInfo.findByCategory", query = "SELECT d FROM DemoProductInfo d WHERE d.category = :category"),
    @NamedQuery(name = "DemoProductInfo.findByProductAvail", query = "SELECT d FROM DemoProductInfo d WHERE d.productAvail = :productAvail"),
    @NamedQuery(name = "DemoProductInfo.findByListPrice", query = "SELECT d FROM DemoProductInfo d WHERE d.listPrice = :listPrice"),
    @NamedQuery(name = "DemoProductInfo.findByMimetype", query = "SELECT d FROM DemoProductInfo d WHERE d.mimetype = :mimetype"),
    @NamedQuery(name = "DemoProductInfo.findByFilename", query = "SELECT d FROM DemoProductInfo d WHERE d.filename = :filename"),
    @NamedQuery(name = "DemoProductInfo.findByImageLastUpdate", query = "SELECT d FROM DemoProductInfo d WHERE d.imageLastUpdate = :imageLastUpdate")})
public class DemoProductInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private BigDecimal productId;
    @Column(name = "PRODUCT_NAME")
    private String productName;
    @Column(name = "PRODUCT_DESCRIPTION")
    private String productDescription;
    @Column(name = "CATEGORY")
    private String category;
    @Column(name = "PRODUCT_AVAIL")
    private String productAvail;
    @Column(name = "LIST_PRICE")
    private BigDecimal listPrice;
    @Lob
    @Column(name = "PRODUCT_IMAGE")
    private Serializable productImage;
    @Column(name = "MIMETYPE")
    private String mimetype;
    @Column(name = "FILENAME")
    private String filename;
    @Column(name = "IMAGE_LAST_UPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date imageLastUpdate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productId")
    private Collection<DemoOrderItems> demoOrderItemsCollection;

    public DemoProductInfo() {
    }

    public DemoProductInfo(BigDecimal productId) {
        this.productId = productId;
    }

    public BigDecimal getProductId() {
        return productId;
    }

    public void setProductId(BigDecimal productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductAvail() {
        return productAvail;
    }

    public void setProductAvail(String productAvail) {
        this.productAvail = productAvail;
    }

    public BigDecimal getListPrice() {
        return listPrice;
    }

    public void setListPrice(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }

    public Serializable getProductImage() {
        return productImage;
    }

    public void setProductImage(Serializable productImage) {
        this.productImage = productImage;
    }

    public String getMimetype() {
        return mimetype;
    }

    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Date getImageLastUpdate() {
        return imageLastUpdate;
    }

    public void setImageLastUpdate(Date imageLastUpdate) {
        this.imageLastUpdate = imageLastUpdate;
    }

    @XmlTransient
    public Collection<DemoOrderItems> getDemoOrderItemsCollection() {
        return demoOrderItemsCollection;
    }

    public void setDemoOrderItemsCollection(Collection<DemoOrderItems> demoOrderItemsCollection) {
        this.demoOrderItemsCollection = demoOrderItemsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DemoProductInfo)) {
            return false;
        }
        DemoProductInfo other = (DemoProductInfo) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.DemoProductInfo[ productId=" + productId + " ]";
    }
    
}
