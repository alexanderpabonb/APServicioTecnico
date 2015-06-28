/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.userDao;
import Model.Usuario;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AlexPabon
 */
public class userController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/registrarse.jsp";
    private static String LIST_USER = "/registrarse.jsp";
    private userDao dao;

    public userController() {
        super();
        dao = new userDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward="";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")){
            String idusuario = request.getParameter("idusuario");
            dao.deleteUsuario(idusuario);
            forward = LIST_USER;
            request.setAttribute("usuario", dao.getAllUsuario());    
        } else if (action.equalsIgnoreCase("edit")){
            forward = INSERT_OR_EDIT;
            String idusuario = request.getParameter("idusuario");
            Usuario usuario = dao.getUsuarioById(idusuario);
            request.setAttribute("usuario", usuario);
        } else if (action.equalsIgnoreCase("listUser")){
            forward = LIST_USER;
            request.setAttribute("usuario", dao.getAllUsuario());
        } else {
            forward = INSERT_OR_EDIT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Usuario usuario = new Usuario();
        usuario.setIdusuario(request.getParameter("idusuario"));
        usuario.setTipodocumento(request.getParameter("tipodocumento"));
        usuario.setDocumento(request.getParameter("documento"));
        usuario.setNombrecompleto(request.getParameter("nombrecompleto"));
        usuario.setCorreo(request.getParameter("correo"));
        usuario.setClave(request.getParameter("clave"));
        usuario.setConfirmarclave(request.getParameter("confirmarclave"));
        usuario.setPreguntasecreta(request.getParameter("preguntasecreta"));
        usuario.setRespuesta(request.getParameter("respuesta"));
        
        String idusuario = request.getParameter("userid");
        if(idusuario == null || idusuario.isEmpty())
        {
            dao.addUsuario(usuario);
        }
        else
        {
            usuario.setIdusuario(request.getParameter(idusuario));
            dao.updateUsuario(usuario);
        }
        RequestDispatcher view = request.getRequestDispatcher(LIST_USER);
        request.setAttribute("users", dao.getAllUsuario());
        view.forward(request, response);
    }
}