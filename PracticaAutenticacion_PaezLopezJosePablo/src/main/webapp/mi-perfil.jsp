<%-- 
    Document   : mi-perfil
    Created on : 6 nov. 2024, 19:18:27
    Author     : Jose Pablo
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="bean.Pokemon"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mis Pokémon</title>
        <link rel="stylesheet" href="./estilos/perfil.css"/>
    </head>
    <body>
        <header>
            <h1>Mi Pokédex</h1>
        </header>

        <h2>Pokémon registrados: ${fn:length(listaPokemon)}</h2>

        <div class="contenedor-tabla">

            <table>

                <tr align="center">
                    <th rowspan="1" class="numero-h">N.º</th>
                    <th rowspan="1">Nombre</th>
                    <th colspan="1">Tipo</th>
                    <th colspan="1">Evolución</th>
                    <th rowspan="1">Poder</th>
                    <th rowspan="1" width="400">Descripción</th>
                </tr>

                <c:forEach var="pokemon" items="${listaPokemon}">
                    <tr>
                        <td class="numero-d">${pokemon.numero}</td>
                        <td>${pokemon.nombre}</td>
                        <td>${pokemon.tipo}</td>
                        <td>${pokemon.evolucion}</td>
                        <td>${pokemon.poder}</td>
                        <td>${pokemon.descripcion}</td>
                    </tr>
                </c:forEach>

            </table>

        </div>

        <div class="contenedor-boton">
            <a href="home.jsp"><input type="button" value="Volver al inicio" class="boton gris"></a>
        </div>

    </body>
</html>
