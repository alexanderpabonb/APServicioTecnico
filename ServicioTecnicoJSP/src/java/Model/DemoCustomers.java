/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author AlexPabon
 */
@Entity
@Table(name = "DEMO_CUSTOMERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DemoCustomers.findAll", query = "SELECT d FROM DemoCustomers d"),
    @NamedQuery(name = "DemoCustomers.findByCustomerId", query = "SELECT d FROM DemoCustomers d WHERE d.customerId = :customerId"),
    @NamedQuery(name = "DemoCustomers.findByCustFirstName", query = "SELECT d FROM DemoCustomers d WHERE d.custFirstName = :custFirstName"),
    @NamedQuery(name = "DemoCustomers.findByCustLastName", query = "SELECT d FROM DemoCustomers d WHERE d.custLastName = :custLastName"),
    @NamedQuery(name = "DemoCustomers.findByCustStreetAddress1", query = "SELECT d FROM DemoCustomers d WHERE d.custStreetAddress1 = :custStreetAddress1"),
    @NamedQuery(name = "DemoCustomers.findByCustStreetAddress2", query = "SELECT d FROM DemoCustomers d WHERE d.custStreetAddress2 = :custStreetAddress2"),
    @NamedQuery(name = "DemoCustomers.findByCustCity", query = "SELECT d FROM DemoCustomers d WHERE d.custCity = :custCity"),
    @NamedQuery(name = "DemoCustomers.findByCustState", query = "SELECT d FROM DemoCustomers d WHERE d.custState = :custState"),
    @NamedQuery(name = "DemoCustomers.findByCustPostalCode", query = "SELECT d FROM DemoCustomers d WHERE d.custPostalCode = :custPostalCode"),
    @NamedQuery(name = "DemoCustomers.findByPhoneNumber1", query = "SELECT d FROM DemoCustomers d WHERE d.phoneNumber1 = :phoneNumber1"),
    @NamedQuery(name = "DemoCustomers.findByPhoneNumber2", query = "SELECT d FROM DemoCustomers d WHERE d.phoneNumber2 = :phoneNumber2"),
    @NamedQuery(name = "DemoCustomers.findByCreditLimit", query = "SELECT d FROM DemoCustomers d WHERE d.creditLimit = :creditLimit"),
    @NamedQuery(name = "DemoCustomers.findByCustEmail", query = "SELECT d FROM DemoCustomers d WHERE d.custEmail = :custEmail")})
public class DemoCustomers implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "CUSTOMER_ID")
    private BigDecimal customerId;
    @Basic(optional = false)
    @Column(name = "CUST_FIRST_NAME")
    private String custFirstName;
    @Basic(optional = false)
    @Column(name = "CUST_LAST_NAME")
    private String custLastName;
    @Column(name = "CUST_STREET_ADDRESS1")
    private String custStreetAddress1;
    @Column(name = "CUST_STREET_ADDRESS2")
    private String custStreetAddress2;
    @Column(name = "CUST_CITY")
    private String custCity;
    @Column(name = "CUST_STATE")
    private String custState;
    @Column(name = "CUST_POSTAL_CODE")
    private String custPostalCode;
    @Column(name = "PHONE_NUMBER1")
    private String phoneNumber1;
    @Column(name = "PHONE_NUMBER2")
    private String phoneNumber2;
    @Column(name = "CREDIT_LIMIT")
    private BigDecimal creditLimit;
    @Column(name = "CUST_EMAIL")
    private String custEmail;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerId")
    private Collection<DemoOrders> demoOrdersCollection;

    public DemoCustomers() {
    }

    public DemoCustomers(BigDecimal customerId) {
        this.customerId = customerId;
    }

    public DemoCustomers(BigDecimal customerId, String custFirstName, String custLastName) {
        this.customerId = customerId;
        this.custFirstName = custFirstName;
        this.custLastName = custLastName;
    }

    public BigDecimal getCustomerId() {
        return customerId;
    }

    public void setCustomerId(BigDecimal customerId) {
        this.customerId = customerId;
    }

    public String getCustFirstName() {
        return custFirstName;
    }

    public void setCustFirstName(String custFirstName) {
        this.custFirstName = custFirstName;
    }

    public String getCustLastName() {
        return custLastName;
    }

    public void setCustLastName(String custLastName) {
        this.custLastName = custLastName;
    }

    public String getCustStreetAddress1() {
        return custStreetAddress1;
    }

    public void setCustStreetAddress1(String custStreetAddress1) {
        this.custStreetAddress1 = custStreetAddress1;
    }

    public String getCustStreetAddress2() {
        return custStreetAddress2;
    }

    public void setCustStreetAddress2(String custStreetAddress2) {
        this.custStreetAddress2 = custStreetAddress2;
    }

    public String getCustCity() {
        return custCity;
    }

    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }

    public String getCustState() {
        return custState;
    }

    public void setCustState(String custState) {
        this.custState = custState;
    }

    public String getCustPostalCode() {
        return custPostalCode;
    }

    public void setCustPostalCode(String custPostalCode) {
        this.custPostalCode = custPostalCode;
    }

    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    public void setPhoneNumber1(String phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
    }

    public String getPhoneNumber2() {
        return phoneNumber2;
    }

    public void setPhoneNumber2(String phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    @XmlTransient
    public Collection<DemoOrders> getDemoOrdersCollection() {
        return demoOrdersCollection;
    }

    public void setDemoOrdersCollection(Collection<DemoOrders> demoOrdersCollection) {
        this.demoOrdersCollection = demoOrdersCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerId != null ? customerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DemoCustomers)) {
            return false;
        }
        DemoCustomers other = (DemoCustomers) object;
        if ((this.customerId == null && other.customerId != null) || (this.customerId != null && !this.customerId.equals(other.customerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.DemoCustomers[ customerId=" + customerId + " ]";
    }
    
}
