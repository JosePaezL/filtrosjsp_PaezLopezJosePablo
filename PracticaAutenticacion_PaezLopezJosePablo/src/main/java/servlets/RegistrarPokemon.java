/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import bean.Pokemon;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *
 * @author Jose Pablo
 */
public class RegistrarPokemon extends HttpServlet {

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

        String numero = request.getParameter("numero");
        String nombre = request.getParameter("nombre");
        String tipo = request.getParameter("tipo");
        String evolucion = request.getParameter("evolucion");
        String poder = request.getParameter("poder");
        String descripcion = request.getParameter("descripcion");

        Pokemon pokemon = new Pokemon(Integer.parseInt(numero), nombre, tipo, evolucion, Integer.parseInt(poder), descripcion);

        System.out.println(pokemon.toString());

        List<Pokemon> pokemones = (List<Pokemon>) getServletContext().getAttribute("listaPokemon");

        pokemones.add(pokemon);
        
        System.out.println(pokemon.toString());

        request.getServletContext().setAttribute("listaPokemon", pokemones);
        
        response.sendRedirect(request.getContextPath() + "/registro-exitoso.jsp");
        
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
