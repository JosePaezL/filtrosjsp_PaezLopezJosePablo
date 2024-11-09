<%-- 
    Document   : registrar-pokemon
    Created on : 6 nov. 2024, 19:18:54
    Author     : Jose Pablo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Pokémon</title>
        <link rel="stylesheet" href="estilos/registrar.css"/>
    </head>
    <body>
        <div class="contenedor-global">
            <h2>Registrar Pokémon</h2>

            <form action="RegistrarPokemon" method="post">
                <div>
                    <label for="nombre">Nombre:</label>
                    <input type="text" name="nombre" id="nombre" class="input-pokemon" placeholder="Escribe el nombre del Pokémon" required>
                </div>

                <div>
                    <label for="numero">Número:</label>
                    <input type="number" name="numero"class="input-pokemon" placeholder="Nº" required>
                </div>

                <div>
                    <label for="nombre">Tipo(s):</label>
                    <input type="text" name="tipo" class="input-pokemon" placeholder="ej. Roca, Veneno/Planta" required>
                </div>

                <div>
                    <label for="evolucion">Nivel de evolución:</label>
                    <select name="evolucion">
                        <option value="basico">Básico</option>
                        <option value="primera">Primera</option>
                        <option value="segunda">Segunda</option>
                    </select>
                </div>

                <div>
                    <label for="poder">Nivel de poder:</label>
                    <input type="number" name="poder" min="1" max="100" value="50"" class="input-pokemon" required>

                </div>

                <div>
                    <label for="descripcion">Descripción</label>
                </div>
                <textarea name="descripcion" placeholder="Escribe una breve descripción."
                          class="input-pokemon" required></textarea>

                <div class="contenedor-botones">
                    <input type="submit" value="Agregar Pokémon" class="boton rojo">
                    <a href="home.jsp"><input type="button" value="Inicio" class="boton gris"></a>
                    <a href="mi-perfil.jsp"><input type="button" value="Pokédex" class="boton gris"></a>
                </div>
            </form>
        </div>
    </body>
</html>
