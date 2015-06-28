<%-- 
    Document   : contactenos
    Created on : 23-jun-2015, 22:04:32
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
                            <li><a href="Contactenos.jsp">Contactenos</a></li>
                        </ul>
                    </div>
                </nav>
            </header>
            <div id="Informacion">
            <h2>Información de Contácto</h2>
                Telefono: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 2692870 - 3045428030 <br> <br>
                Dirección: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Calle 42A # 34-42 <br> <br>
                Correo: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="email">alexpabonbedoya@gmail.com</a> <br> <br>
                Pagina web: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="web">www.apserviciotecnico.com</a> <br> <br>
                Ubicación: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <iframe src="https://www.google.com/maps/embed?pb=!1m12!1m8!1m3!1d1983.105525444209!2d-75.5541106!3d6.2358882!3m2!1i1024!2i768!4f13.1!2m1!1sCalle+42a+%23+24-164%2C+Medell%C3%ADn+-+Antioquia!5e0!3m2!1ses-419!2sco!4v1434562641009" width="300" height="150" frameborder="0" style="border:0"></iframe>
            </div>
            <div id="MensajeContacto">
            <h2>Contáctenos</h2>
                Nombre completo: &nbsp;&nbsp;&nbsp;&nbsp; <input type="text" id="NombreCompleto" name="NombreCompleto" placeholder=" "/> <br>
                Correo: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="email" id="Correo" name="Correo" placeholder=" "/> <br>
                Asunto: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select class="form-control" id="Asunto" name="Asunto">
                                                                                                                                                                            <option value> Seleccione </option>
                                                                                                                                                                            <option value> Solicitud</option>
                                                                                                                                                                            <option value> Queja o Reclamo</option>
                                                                                                                                                                            <option value> Felicitación</option>
                                                                                                                                                                            <option value> Sugerencia</option>
                                                                                                                                                                </select> <br>
                Mensaje: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <textarea class="form-control" name="Mensaje" id="MensajeTexarea"> </textarea> <br>
                <button type="submit">Enviar</button>
            </div>
        </div>
    </body>
</html>
