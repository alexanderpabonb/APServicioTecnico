<%-- 
    Document   : index
    Created on : 23-jun-2015, 21:53:39
    Author     : AlexPabon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                            <li><a href="contactenos.jsp">Contactenos</a></li>
                        </ul>
                    </div>
                </nav>
            </header>
            <section>
                <div id="TextoPrincipal">
                <article>
                    <h1>Noticias</h1>
                        <p class="text-justify">asadd ahdadhsadfndsjfh adsjkf</p>
                </article>
                </div>
                <div id="InicioSesion">
                    <form action="guardar" method="Post">
                        <hgroup>
                            <h1>Inicio de sesión</h1>
                        </hgroup>
                            Usuario: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="text" id="idUsuario" name="idUsuario" placeholder="Usuario"/>
                            Contraseña: &nbsp;&nbsp; <input type="password" id="clave" name="clave" placeholder="Contraseña"/><br>
                            <br>
                            <a href="RecordarClave.html" style="text-decoration: none">¿Olvido su contraseña?</a> <br>
                            <button type="submit"><a id="link" href="MenuPrincipal.jsp">Ingresar</a></button> <button type="submit"><a id="link" href="registrarse.jsp"> Registrarse</a></button>
                    </form>
                </div>
                <br>
                <div id="siguenos">
                <article>
                        <hgroup>
                            <h1>Síguenos en:</h1>
                        </hgroup>
                        <a href="www.facebook.com"><img src="Imagenes/facebook.png" height="46" width="50"></a>
                        <a href="www.twitter.com"><img src="Imagenes/twitter.png" height="46" width="50"></a>
                        <a href="www.youtube.com"><img src="Imagenes/youtube.png" height="46" width="50"></a>
               	</article>
                </div>
            </section>
        </div>
    </body>
</html>
