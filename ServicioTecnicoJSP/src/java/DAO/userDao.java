/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Usuario;
import Util.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AlexPabon
 */
public class userDao {
    
    private Connection connection;

    public userDao() {
        connection = DbUtil.getConnection();
    }

    public void addUsuario(Usuario usuario) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into users(idusuario,tipodocumento,documento,nombrecompleto,correo,clave,confirmarclave,preguntasecreta,respuesta) values (?, ?, ?, ?, ?, ?, ?, ?, ? )");
            // Parameters start with 1
            preparedStatement.setString(1, usuario.getIdusuario());
            preparedStatement.setString(2, usuario.getTipodocumento());
            preparedStatement.setString(3, usuario.getDocumento());
            preparedStatement.setString(4, usuario.getNombrecompleto());
            preparedStatement.setString(5, usuario.getCorreo());
            preparedStatement.setString(6, usuario.getClave());
            preparedStatement.setString(7, usuario.getConfirmarclave());
            preparedStatement.setString(8, usuario.getPreguntasecreta());
            preparedStatement.setString(9, usuario.getRespuesta());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUsuario(String Idusuario) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from users where userid=?");
            // Parameters start with 1
            preparedStatement.setString(1, Idusuario);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUsuario(Usuario usuario) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update users set tipodocumento=?, documento=?, nombrecompleto=?, correo=?, clave=?, confirmarclave=?, preguntaseguridad=?, respuesta=? where idusuario=?");
            // Parameters start with 1
            preparedStatement.setString(1, usuario.getTipodocumento());
            preparedStatement.setString(2, usuario.getDocumento());
            preparedStatement.setString(3, usuario.getNombrecompleto());
            preparedStatement.setString(4, usuario.getCorreo());
            preparedStatement.setString(5, usuario.getClave());
            preparedStatement.setString(6, usuario.getConfirmarclave());
            preparedStatement.setString(7, usuario.getPreguntasecreta());
            preparedStatement.setString(8, usuario.getRespuesta());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Usuario> getAllUsuario() {
        List<Usuario> users = new ArrayList<Usuario>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from users");
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdusuario(rs.getString("idusuario"));
                usuario.setTipodocumento(rs.getString("tipodocumento"));
                usuario.setDocumento(rs.getString("documento"));
                usuario.setNombrecompleto(rs.getString("nombrecompleto"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setClave(rs.getString("clave"));
                usuario.setConfirmarclave(rs.getString("confirmarclave"));
                usuario.setPreguntasecreta(rs.getString("preguntasecreta"));
                usuario.setRespuesta(rs.getString("respuesta"));
                usuario.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    public Usuario getUsuarioById(String idusuario) {
        Usuario usuario = new Usuario();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from users where userid=?");
            preparedStatement.setString(1, idusuario);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                usuario.setIdusuario(rs.getString("idusuario"));
                usuario.setTipodocumento(rs.getString("tipodocumento"));
                usuario.setDocumento(rs.getString("documento"));
                usuario.setNombrecompleto(rs.getString("nombrecompleto"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setClave(rs.getString("clave"));
                usuario.setConfirmarclave(rs.getString("confirmarclave"));
                usuario.setPreguntasecreta(rs.getString("preguntasecreta"));
                usuario.setRespuesta(rs.getString("respuesta"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuario;
    }
    
}
