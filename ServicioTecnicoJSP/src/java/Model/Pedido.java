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
@Table(name = "PEDIDO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p"),
    @NamedQuery(name = "Pedido.findByIdpedido", query = "SELECT p FROM Pedido p WHERE p.idpedido = :idpedido"),
    @NamedQuery(name = "Pedido.findByNombrecompleto", query = "SELECT p FROM Pedido p WHERE p.nombrecompleto = :nombrecompleto"),
    @NamedQuery(name = "Pedido.findByTelefono", query = "SELECT p FROM Pedido p WHERE p.telefono = :telefono"),
    @NamedQuery(name = "Pedido.findByCelular", query = "SELECT p FROM Pedido p WHERE p.celular = :celular"),
    @NamedQuery(name = "Pedido.findByDireccion", query = "SELECT p FROM Pedido p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "Pedido.findByCorreo", query = "SELECT p FROM Pedido p WHERE p.correo = :correo"),
    @NamedQuery(name = "Pedido.findByCantidad", query = "SELECT p FROM Pedido p WHERE p.cantidad = :cantidad"),
    @NamedQuery(name = "Pedido.findByValor", query = "SELECT p FROM Pedido p WHERE p.valor = :valor"),
    @NamedQuery(name = "Pedido.findByFechacompra", query = "SELECT p FROM Pedido p WHERE p.fechacompra = :fechacompra"),
    @NamedQuery(name = "Pedido.findByFechaentrega", query = "SELECT p FROM Pedido p WHERE p.fechaentrega = :fechaentrega")})
public class Pedido implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDPEDIDO")
    private BigDecimal idpedido;
    @Column(name = "NOMBRECOMPLETO")
    private String nombrecompleto;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "CELULAR")
    private String celular;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "CORREO")
    private String correo;
    @Column(name = "CANTIDAD")
    private String cantidad;
    @Column(name = "VALOR")
    private String valor;
    @Column(name = "FECHACOMPRA")
    private String fechacompra;
    @Column(name = "FECHAENTREGA")
    private String fechaentrega;
    @JoinColumn(name = "IDPRODUCTO", referencedColumnName = "IDPRODUCTO")
    @ManyToOne
    private Producto idproducto;

    public Pedido() {
    }

    public Pedido(BigDecimal idpedido) {
        this.idpedido = idpedido;
    }

    public BigDecimal getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(BigDecimal idpedido) {
        this.idpedido = idpedido;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getFechacompra() {
        return fechacompra;
    }

    public void setFechacompra(String fechacompra) {
        this.fechacompra = fechacompra;
    }

    public String getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(String fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public Producto getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Producto idproducto) {
        this.idproducto = idproducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpedido != null ? idpedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.idpedido == null && other.idpedido != null) || (this.idpedido != null && !this.idpedido.equals(other.idpedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Pedido[ idpedido=" + idpedido + " ]";
    }
    
}
