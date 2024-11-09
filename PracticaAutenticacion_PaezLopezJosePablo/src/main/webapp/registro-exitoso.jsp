<%-- 
    Document   : registro-exitoso
    Created on : 8 nov. 2024, 17:28:11
    Author     : Jose Pablo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro completado</title>
        <link rel="stylesheet" href="estilos/home.css"/>
    </head>
    <body>
        <div class="contenedor-home">
            <h1>Registro completado</h1>
            <p>¡Su Pokémon se ha registrado de manera exitosa!</p>
            <p>Puede registrar otro Pokémon o volver al inicio</p>
            <div class="contenedor-botones">
                <a href="registrar-pokemon.jsp">
                    <input type="button" value="Registrar otro Pokémon" class="boton rojo">
                </a>
                <a href="home.jsp"><input type="button" value="Volver al inicio" class="boton gris"></a>
            </div>
        </div>
    </body>
</html>
