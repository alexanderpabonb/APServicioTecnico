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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "DEMO_ORDERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DemoOrders.findAll", query = "SELECT d FROM DemoOrders d"),
    @NamedQuery(name = "DemoOrders.findByOrderId", query = "SELECT d FROM DemoOrders d WHERE d.orderId = :orderId"),
    @NamedQuery(name = "DemoOrders.findByOrderTotal", query = "SELECT d FROM DemoOrders d WHERE d.orderTotal = :orderTotal"),
    @NamedQuery(name = "DemoOrders.findByOrderTimestamp", query = "SELECT d FROM DemoOrders d WHERE d.orderTimestamp = :orderTimestamp")})
public class DemoOrders implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ORDER_ID")
    private BigDecimal orderId;
    @Column(name = "ORDER_TOTAL")
    private BigDecimal orderTotal;
    @Column(name = "ORDER_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderTimestamp;
    @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID")
    @ManyToOne
    private DemoUsers userId;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID")
    @ManyToOne(optional = false)
    private DemoCustomers customerId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderId")
    private Collection<DemoOrderItems> demoOrderItemsCollection;

    public DemoOrders() {
    }

    public DemoOrders(BigDecimal orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getOrderId() {
        return orderId;
    }

    public void setOrderId(BigDecimal orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(BigDecimal orderTotal) {
        this.orderTotal = orderTotal;
    }

    public Date getOrderTimestamp() {
        return orderTimestamp;
    }

    public void setOrderTimestamp(Date orderTimestamp) {
        this.orderTimestamp = orderTimestamp;
    }

    public DemoUsers getUserId() {
        return userId;
    }

    public void setUserId(DemoUsers userId) {
        this.userId = userId;
    }

    public DemoCustomers getCustomerId() {
        return customerId;
    }

    public void setCustomerId(DemoCustomers customerId) {
        this.customerId = customerId;
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
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DemoOrders)) {
            return false;
        }
        DemoOrders other = (DemoOrders) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.DemoOrders[ orderId=" + orderId + " ]";
    }
    
}
