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
@Table(name = "EMPLEADO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e"),
    @NamedQuery(name = "Empleado.findByIdempleado", query = "SELECT e FROM Empleado e WHERE e.idempleado = :idempleado"),
    @NamedQuery(name = "Empleado.findByTipodocumento", query = "SELECT e FROM Empleado e WHERE e.tipodocumento = :tipodocumento"),
    @NamedQuery(name = "Empleado.findByDocumento", query = "SELECT e FROM Empleado e WHERE e.documento = :documento"),
    @NamedQuery(name = "Empleado.findByNombrecompleto", query = "SELECT e FROM Empleado e WHERE e.nombrecompleto = :nombrecompleto"),
    @NamedQuery(name = "Empleado.findByFechanacimiento", query = "SELECT e FROM Empleado e WHERE e.fechanacimiento = :fechanacimiento"),
    @NamedQuery(name = "Empleado.findByGenero", query = "SELECT e FROM Empleado e WHERE e.genero = :genero"),
    @NamedQuery(name = "Empleado.findByTelefono", query = "SELECT e FROM Empleado e WHERE e.telefono = :telefono"),
    @NamedQuery(name = "Empleado.findByCelular", query = "SELECT e FROM Empleado e WHERE e.celular = :celular"),
    @NamedQuery(name = "Empleado.findByDireccion", query = "SELECT e FROM Empleado e WHERE e.direccion = :direccion"),
    @NamedQuery(name = "Empleado.findByCorreo", query = "SELECT e FROM Empleado e WHERE e.correo = :correo"),
    @NamedQuery(name = "Empleado.findByCargo", query = "SELECT e FROM Empleado e WHERE e.cargo = :cargo"),
    @NamedQuery(name = "Empleado.findByReferenciaslaborales", query = "SELECT e FROM Empleado e WHERE e.referenciaslaborales = :referenciaslaborales"),
    @NamedQuery(name = "Empleado.findByReferenciaspersonales", query = "SELECT e FROM Empleado e WHERE e.referenciaspersonales = :referenciaspersonales")})
public class Empleado implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDEMPLEADO")
    private BigDecimal idempleado;
    @Column(name = "TIPODOCUMENTO")
    private String tipodocumento;
    @Column(name = "DOCUMENTO")
    private String documento;
    @Column(name = "NOMBRECOMPLETO")
    private String nombrecompleto;
    @Column(name = "FECHANACIMIENTO")
    private String fechanacimiento;
    @Column(name = "GENERO")
    private Character genero;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "CELULAR")
    private String celular;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "CORREO")
    private String correo;
    @Column(name = "CARGO")
    private String cargo;
    @Column(name = "REFERENCIASLABORALES")
    private String referenciaslaborales;
    @Column(name = "REFERENCIASPERSONALES")
    private String referenciaspersonales;
    @OneToMany(mappedBy = "idempleado")
    private Collection<Factura> facturaCollection;

    public Empleado() {
    }

    public Empleado(BigDecimal idempleado) {
        this.idempleado = idempleado;
    }

    public BigDecimal getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(BigDecimal idempleado) {
        this.idempleado = idempleado;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public Character getGenero() {
        return genero;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getReferenciaslaborales() {
        return referenciaslaborales;
    }

    public void setReferenciaslaborales(String referenciaslaborales) {
        this.referenciaslaborales = referenciaslaborales;
    }

    public String getReferenciaspersonales() {
        return referenciaspersonales;
    }

    public void setReferenciaspersonales(String referenciaspersonales) {
        this.referenciaspersonales = referenciaspersonales;
    }

    @XmlTransient
    public Collection<Factura> getFacturaCollection() {
        return facturaCollection;
    }

    public void setFacturaCollection(Collection<Factura> facturaCollection) {
        this.facturaCollection = facturaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idempleado != null ? idempleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.idempleado == null && other.idempleado != null) || (this.idempleado != null && !this.idempleado.equals(other.idempleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Empleado[ idempleado=" + idempleado + " ]";
    }
    
}
