/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sito;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import servicios.ServicioClinica_Service;

/**
 *
 * @author Lenovo
 */
public class Login extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/WebServiceJava/ServicioClinica.wsdl")
    private ServicioClinica_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String usu = request.getParameter("usuario");
            int us = Integer.parseInt(usu);
            String pass = request.getParameter("contrasena");
            int res = autentificar(us, pass);
            if (res == 0) {
                String nom=getNombrePaciente(us);
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");

                out.println("<title>Servlet Login</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<form action='Reserva.html' method='post'>");

                out.println("<label for='usuario'>USUARIO :"+nom+" </label> <br>");
                out.println("<label for='usuario'>IDENTIFICADOR : </label> <br>");
                out.println("<input type='number' name='usuario' id=usu  value= "+usu+">  <br>");

		out.println("<input class='botton' type='submit' value='Enviar' name='REALIZAR RESERVA' id='boton'>");
                out.println("</form>");
                out.println("</html>");
            } else {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");

                out.println("<title>USUARIO NO AUTENTIFICADO</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>error de autentificacion intente de nuevo </h1>");
                out.print("<p></p>");
                out.print("<a href=\"index.html\">VOLVER A PAGINA DE LOGIN</a>");
                out.println("</body>");
                out.println("</html>");

            }

        }
    }

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
        processRequest(request, response);
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
        processRequest(request, response);
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

    private Integer autentificar(int user, java.lang.String pass) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.ServicioClinica port = service.getServicioClinicaPort();
        return port.autentificar(user, pass);

    }

    private String getNombrePaciente(int ci) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicios.ServicioClinica port = service.getServicioClinicaPort();
        return port.getNombrePaciente(ci);
    }

}
