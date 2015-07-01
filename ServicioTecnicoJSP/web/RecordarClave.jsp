<%-- 
    Document   : RecordarClave
    Created on : 01-jul-2015, 11:13:36
    Author     : AlexPabon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
        <link rel="stylesheet" type="text/css" href="Styleshhet.css">
        <title>AP Servicio Técnico</title>
    </head>
    <body>
        <div id="contenido">
            <header>
                <img id="logo" src="Imagenes/Logo.png"  width="350" height="180">
                <nav>
                    <div>
                        <ul id="menu">
                            <li><a href="index.jsp">Inicio</a></li>
                            <li><a href="NuestraEmpresa.jsp">Nuestra empresa</a></li>
                            <li><a href="#">Servicios</a></li>
                            <li><a href="contactenos.jsp">Contactenos</a></li>
                        </ul>
                    </div>
                </nav>
            </header>
            <div id="recordarclave">
            <h2>Recordar contraseña:</h2>
                <p>Ingrese su correo personal y a continuacion le será enviada la nueva contraseña.</p>
                <center><label>Correo:</label> <input type="email" name="Correo" id="Correo"> </center> <br>
                <center> <button type="submit" value="Enviar">Enviar</button> <button type="reset" > Limpiar</button> </center>
            </div>
        </div>
    </body>
</html>
