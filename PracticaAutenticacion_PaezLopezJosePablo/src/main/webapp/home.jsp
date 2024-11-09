<%-- 
    Document   : home
    Created on : 6 nov. 2024, 19:18:39
    Author     : Jose Pablo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MiPokédex</title>
        <link rel="stylesheet" href="estilos/home.css"/>
    </head>
    <body>

        <div class="contenedor-home">
            <h1>MiPokédex</h1>
            <p>¡Bienvenido a MiPokedex! Aquí podrás registrar tus Pokémon favoritos</p>

            <div class="contenedor-botones">
                <a href="registrar-pokemon.jsp">
                    <input type="button" value="Registrar Pokémon" class="boton rojo">
                </a>
                <a href="mi-perfil.jsp"><input type="button" value="Mostrar mis Pokémon" class="boton gris"></a>
            </div>

        </div>

    </body>
</html>
