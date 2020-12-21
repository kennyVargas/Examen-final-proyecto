
package Sito;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
            out.println("<h1>");
            out.println("Ejemplo clase");
            out.println("</h1>");
            String nombre;
            //nombre = request.getParameter("nombre");
            //out.println("El usuario que ingresa es:"+nombre);
            out.println("<form action='ejemplo.php' method='GET'>");
            out.println("<input type='text' name='nombre'/>");
            out.println("<input type='submit' name='Enviar' value='Enviar'/>");
            out.println("</form>");
            out.println("<table>");
            

            Connection con = null;
            Statement stm = null;
            try {
                Class.forName("org.postgresql.Driver");
                con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/clinica","postgres","123456");
                stm = con.createStatement();
                String sql = "select * from Paciente;";
                ResultSet rs = stm.executeQuery(sql);
                while(rs.next())
                {
                    int id = rs.getInt("ci");
                    String nombrea = rs.getString("nombre");
                    String paternoa = rs.getString("apellido");
                    out.println("<tr>");
                    out.println("<td></td>");
                    out.println("<td>"+nombrea+"</td>");
                    out.println("<td>"+paternoa+"</td>");
                    out.println("</tr>");
                }
                /*
                String sql = "insert into docente values(11,'m1','s1');";
                stm.executeUpdate(sql);
                stm.close();
                con.commit();
                con.close();*/
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
            
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");            
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

}
