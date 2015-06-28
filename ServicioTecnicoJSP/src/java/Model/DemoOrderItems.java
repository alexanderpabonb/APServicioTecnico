/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AlexPabon
 */
@Entity
@Table(name = "DEMO_ORDER_ITEMS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DemoOrderItems.findAll", query = "SELECT d FROM DemoOrderItems d"),
    @NamedQuery(name = "DemoOrderItems.findByOrderItemId", query = "SELECT d FROM DemoOrderItems d WHERE d.orderItemId = :orderItemId"),
    @NamedQuery(name = "DemoOrderItems.findByUnitPrice", query = "SELECT d FROM DemoOrderItems d WHERE d.unitPrice = :unitPrice"),
    @NamedQuery(name = "DemoOrderItems.findByQuantity", query = "SELECT d FROM DemoOrderItems d WHERE d.quantity = :quantity")})
public class DemoOrderItems implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ORDER_ITEM_ID")
    private Short orderItemId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "UNIT_PRICE")
    private BigDecimal unitPrice;
    @Basic(optional = false)
    @Column(name = "QUANTITY")
    private int quantity;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    @ManyToOne(optional = false)
    private DemoProductInfo productId;
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID")
    @ManyToOne(optional = false)
    private DemoOrders orderId;

    public DemoOrderItems() {
    }

    public DemoOrderItems(Short orderItemId) {
        this.orderItemId = orderItemId;
    }

    public DemoOrderItems(Short orderItemId, BigDecimal unitPrice, int quantity) {
        this.orderItemId = orderItemId;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public Short getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Short orderItemId) {
        this.orderItemId = orderItemId;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public DemoProductInfo getProductId() {
        return productId;
    }

    public void setProductId(DemoProductInfo productId) {
        this.productId = productId;
    }

    public DemoOrders getOrderId() {
        return orderId;
    }

    public void setOrderId(DemoOrders orderId) {
        this.orderId = orderId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderItemId != null ? orderItemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DemoOrderItems)) {
            return false;
        }
        DemoOrderItems other = (DemoOrderItems) object;
        if ((this.orderItemId == null && other.orderItemId != null) || (this.orderItemId != null && !this.orderItemId.equals(other.orderItemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.DemoOrderItems[ orderItemId=" + orderItemId + " ]";
    }
    
}
