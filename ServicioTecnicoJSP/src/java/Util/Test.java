package Util;

import DAO.userDao;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List; 
import Model.Usuario;

/**
 *
 * @author AlexPabon
 */
public class Test {
    
    public static void main(String[] args){
        Connection conection = DbUtil.getConnection();
        DAO.userDao connection = new DAO.userDao();
        
        Usuario usuario = new Usuario();
        usuario.setTipodocumento("CC");
        usuario.setDocumento("12345");
        usuario.setNombrecompleto("Alex Pabon");
        usuario.setCorreo("alexpabonb@gmail.com");
        usuario.setClave("123");
        usuario.setConfirmarclave("123");
        usuario.setPreguntasecreta("asda");
        usuario.setRespuesta("adasd");
        
        connection.addUsuario(usuario);
        connection.deleteUsuario("12345");
     
        Usuario usuario1 = new Usuario();
        
        usuario1.setTipodocumento("CC");
        usuario1.setDocumento("452345"); 
        usuario1.setNombrecompleto("VALEN");
        usuario1.setCorreo("gRONDONA"); 
        usuario1.setClave("rUIS");
        usuario1.setConfirmarclave("CARRE 2D");  
        usuario1.setPreguntasecreta("color");
        usuario1.setRespuesta("verde");
        
        connection.addUsuario(usuario);
        connection.deleteUsuario("12345");


        Usuario conscliente = null;
        conscliente = connection.getUsuarioById("1016079824");
        
        
        if (conscliente != null){
            System.out.println("El Cliente " + conscliente.getDocumento()+ " " + conscliente.getNombrecompleto());
        }else{
            System.out.println("no existe o no consulto");
        }
        
        List<Usuario> listaClientes;
        listaClientes = connection.getAllUsuario();
        for (Usuario client : listaClientes) {
            System.out.println("El cliente " + client.getDocumento()+ " " + client.getNombrecompleto()+ "\n" );
        }
        
         connection.deleteUsuario("1016079824");
    }
    
}
