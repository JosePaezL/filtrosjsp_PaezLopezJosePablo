/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import bean.Pokemon;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose Pablo
 */
@WebServlet(name = "Login", urlPatterns = {"/login"})
public class Login extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("user");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "12345".equals(password)) {
            HttpSession sesion = request.getSession();
            sesion.setAttribute("usuario", username);
            response.sendRedirect(request.getContextPath() + "/home.jsp");

            List<Pokemon> pokemones = new ArrayList<>();

            Pokemon pikachu = new Pokemon(25, "Pikachu", "Eléctrico", "Primera", 55, "Pikachu es un Pokémon de tipo Eléctrico conocido por su agilidad.");
            Pokemon charmander = new Pokemon(4, "Charmander", "Fuego", "Básico", 52, "Charmander es un Pokémon de tipo Fuego que prefiere ambientes cálidos.");
            Pokemon bulbasaur = new Pokemon(1, "Bulbasaur", "Planta/Veneno", "Básico", 49, "Bulbasaur es un Pokémon de tipo Planta y Veneno con una planta en su espalda.");
            Pokemon squirtle = new Pokemon(7, "Squirtle", "Agua", "Básico", 48, "Squirtle es un Pokémon de tipo Agua que se siente cómodo en el agua.");
            Pokemon eevee = new Pokemon(133, "Eevee", "Normal", "Básico", 55, "Eevee es un Pokémon conocido por sus muchas posibilidades de evolución.");

            pokemones.add(pikachu);
            pokemones.add(charmander);
            pokemones.add(bulbasaur);
            pokemones.add(squirtle);
            pokemones.add(eevee);

            getServletContext().setAttribute("listaPokemon", pokemones);

        } else {
            response.sendRedirect(request.getContextPath() + "/index.jsp?error=true");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
