<%-- 
    Document   : index
    Created on : 6 nov. 2024, 19:18:14
    Author     : Jose Pablo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar Sesión</title>
        <link rel="stylesheet" href="./estilos/index.css"/>
    </head>
    <body>
        <div class="contenedor-login">
        <h1>Inicia Sesión</h1>
        <form action="login" method="post">
            <input type="text" name="user" placeholder="Usuario" required>
            <input type="password" name="password" placeholder="Contraseña" required>
            <input type="submit" value="Entrar" class="boton rojo">
        </form>
    </div>
    </body>
</html>
