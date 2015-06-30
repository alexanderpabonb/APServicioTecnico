<%-- 
    Document   : registrarse
    Created on : 23-jun-2015, 22:04:45
    Author     : AlexPabon
--%>
<%@page import="Model.Usuario" %>
<%@page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
        <link rel="stylesheet" type="text/css" href="Styleshhet.css">
        <title>AP Servicio Tecnico</title>
    </head>
    <body>
        <div id="contenido">
            <header>
                <img id="logo" src="Imagenes/Logo.png"  width="350" height="180">
                <nav>
                    <div>
                        <ul id="menu">
                            <li><a href="index.jsp">Inicio</a></li>
                            <li><a href="#">Nuestra empresa</a></li>
                            <li><a href="#">Servicios</a></li>
                            <li><a href="Contactenos.jsp">Contactenos</a></li>
                        </ul>
                    </div>
                </nav>
            </header>
            <div id="Registrarse">
                <form  method="POST" action="userController" name="frmAddUsuario">
                    <h2>Registrarse</h2>
                    Los campos con (*) son campos obligatorios. <br>
                    Tipo Documento:* &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select class="form-control" id="TipoDocumento" name="TipoDocumento">
                        <option value> Seleccione</option>
                        <option value="Nit"> Nit</option>
                        <option value="CC"> CC</option>
                        <option value="CE"> Cedula extranjera</option>
                                                        </select> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    Documento:* &nbsp;&nbsp; <input type="text" id="Documento" name="Documento"  /><br>
                    Nombre Completo:* &nbsp;&nbsp;&nbsp;&nbsp; <input type="text" id="NombreCompleto" name="NombreCompleto" placeholder=" "/> &nbsp;&nbsp;&nbsp;
                    
                    Correo:* &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="email" id="Correo" name="Correo" placeholder=" "/> <br>
                    
                    <br>
                    Contrase?a:* &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="password" id="Clave" name="Clave" placeholder="Escriba una contrase?a"/> &nbsp;&nbsp;&nbsp;&nbsp;
                    Confirmar:* &nbsp;&nbsp;&nbsp;&nbsp; <input type="password" id="ConfirmarClave" name="ConfirmarClave" placeholder="Confirme contrase?a"/><br>
                    Pregunta seguridad:* &nbsp; <select class="form-control" id="PreguntaSeguridad" name="PreguntaSeguridad">
                                <option value> Seleccione</option>
                                <option value="Lugar de nacimiento de su madre"> Lugar de nacimiento de su madre </option>
                                <option value="Nombre de su primera mascota"> Nombre de su primera mascota </option>
                                <option value="Color favorito"> Color favorito </option>
                            </select> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    Respuesta:* &nbsp;&nbsp;&nbsp; <input type="text" id="Respuesta" name="Respuesta" placeholder=" "/><br>
                    <center><button type="submit" value="Registrar"> Registrar</button> <button type="reset" > Limpiar</button> </center>
                </form>
            </div>  
        </div>
    </body>
</html>
