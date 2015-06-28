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
@Table(name = "USUARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIdusuario", query = "SELECT u FROM Usuario u WHERE u.idusuario = :idusuario"),
    @NamedQuery(name = "Usuario.findByTipodocumento", query = "SELECT u FROM Usuario u WHERE u.tipodocumento = :tipodocumento"),
    @NamedQuery(name = "Usuario.findByDocumento", query = "SELECT u FROM Usuario u WHERE u.documento = :documento"),
    @NamedQuery(name = "Usuario.findByNombrecompleto", query = "SELECT u FROM Usuario u WHERE u.nombrecompleto = :nombrecompleto"),
    @NamedQuery(name = "Usuario.findByCorreo", query = "SELECT u FROM Usuario u WHERE u.correo = :correo"),
    @NamedQuery(name = "Usuario.findByClave", query = "SELECT u FROM Usuario u WHERE u.clave = :clave"),
    @NamedQuery(name = "Usuario.findByConfirmarclave", query = "SELECT u FROM Usuario u WHERE u.confirmarclave = :confirmarclave"),
    @NamedQuery(name = "Usuario.findByPreguntasecreta", query = "SELECT u FROM Usuario u WHERE u.preguntasecreta = :preguntasecreta"),
    @NamedQuery(name = "Usuario.findByRespuesta", query = "SELECT u FROM Usuario u WHERE u.respuesta = :respuesta")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDUSUARIO")
    private String idusuario;
    @Column(name = "TIPODOCUMENTO")
    private String tipodocumento;
    @Column(name = "DOCUMENTO")
    private String documento;
    @Column(name = "NOMBRECOMPLETO")
    private String nombrecompleto;
    @Column(name = "CORREO")
    private String correo;
    @Column(name = "CLAVE")
    private String clave;
    @Column(name = "CONFIRMARCLAVE")
    private String confirmarclave;
    @Column(name = "PREGUNTASECRETA")
    private String preguntasecreta;
    @Column(name = "RESPUESTA")
    private String respuesta;

    public Usuario() {
    }

    public Usuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getConfirmarclave() {
        return confirmarclave;
    }

    public void setConfirmarclave(String confirmarclave) {
        this.confirmarclave = confirmarclave;
    }

    public String getPreguntasecreta() {
        return preguntasecreta;
    }

    public void setPreguntasecreta(String preguntasecreta) {
        this.preguntasecreta = preguntasecreta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuario != null ? idusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idusuario == null && other.idusuario != null) || (this.idusuario != null && !this.idusuario.equals(other.idusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Usuario[ idusuario=" + idusuario + " ]";
    }

    public void add(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
