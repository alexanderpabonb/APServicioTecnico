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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AlexPabon
 */
@Entity
@Table(name = "INSUMO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Insumo.findAll", query = "SELECT i FROM Insumo i"),
    @NamedQuery(name = "Insumo.findByCodinsumo", query = "SELECT i FROM Insumo i WHERE i.codinsumo = :codinsumo"),
    @NamedQuery(name = "Insumo.findByNombre", query = "SELECT i FROM Insumo i WHERE i.nombre = :nombre"),
    @NamedQuery(name = "Insumo.findByCantidad", query = "SELECT i FROM Insumo i WHERE i.cantidad = :cantidad"),
    @NamedQuery(name = "Insumo.findByCaracteristicas", query = "SELECT i FROM Insumo i WHERE i.caracteristicas = :caracteristicas")})
public class Insumo implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "CODINSUMO")
    private BigDecimal codinsumo;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "CANTIDAD")
    private String cantidad;
    @Column(name = "CARACTERISTICAS")
    private String caracteristicas;

    public Insumo() {
    }

    public Insumo(BigDecimal codinsumo) {
        this.codinsumo = codinsumo;
    }

    public BigDecimal getCodinsumo() {
        return codinsumo;
    }

    public void setCodinsumo(BigDecimal codinsumo) {
        this.codinsumo = codinsumo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codinsumo != null ? codinsumo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Insumo)) {
            return false;
        }
        Insumo other = (Insumo) object;
        if ((this.codinsumo == null && other.codinsumo != null) || (this.codinsumo != null && !this.codinsumo.equals(other.codinsumo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Insumo[ codinsumo=" + codinsumo + " ]";
    }
    
}
