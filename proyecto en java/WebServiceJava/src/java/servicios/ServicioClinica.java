/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Lenovo
 */
@WebService(serviceName = "ServicioClinica")
public class ServicioClinica {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "InsertarReserva")
    public Integer InsertarReserva(@WebParam(name = "idpaciente") int idpaciente, @WebParam(name = "idmedico") int idmedico, @WebParam(name = "hora") String hora, @WebParam(name = "fecha") final String fecha) {
        int ans=1;
        Connection con = null;
        PreparedStatement  stm=null;
         try {
                ans=0;
                Class.forName("org.postgresql.Driver");
                con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/clinica","postgres","123456");
                String sql = "INSERT INTO Res_cita VALUES(idpaciente=?, idmedico=?,horario=?,fech_res=?);";
                stm = con.prepareStatement(sql);
                stm.setInt(1, idpaciente);
                stm.setInt(2, idmedico);
                stm.setString(3, hora);
                stm.setString(4, fecha);
                ResultSet rs = stm.executeQuery();
                
                
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
                
                
            }
        
        return ans;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "InsertarPaciente")
    public Integer InsertarPaciente(@WebParam(name = "id") int id, @WebParam(name = "nom") String nom, @WebParam(name = "ape") String ape, @WebParam(name = "fe_nac") String fe_nac, @WebParam(name = "sexo") final String sexo) {
        int ans=1;
        Connection con = null;
        PreparedStatement  stm=null;
         try {
                ans=0;
                Class.forName("org.postgresql.Driver");
                con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/clinica","postgres","123456");
                String sql = "INSERT INTO Paciente VALUES(ci=?,nombre=?,apellidio=?,'fec_nac=?,sexo);";
                stm = con.prepareStatement(sql);
                stm.setInt(1, id);
                stm.setString(2, nom);
                stm.setString(3, ape);
                stm.setString(4, fe_nac);
                stm.setString(5, sexo);
                ResultSet rs = stm.executeQuery();
                
               
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        
        return ans;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "InsertarUsuario")
    public Integer InsertarUsuario(@WebParam(name = "id") int id, @WebParam(name = "pass") String pass) {
        int ans=1;
        Connection con = null;
        PreparedStatement  stm=null;
         try {
                ans=0;
                Class.forName("org.postgresql.Driver");
                con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/clinica","postgres","123456");
                String sql = "INSERT INTO Usuario VALUES(DEFAULT,usuario=?,pasword=?);";
                stm = con.prepareStatement(sql);
                stm.setInt(1, id);
                stm.setString(2, pass);
 
                ResultSet rs = stm.executeQuery();
                
                
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
                
            }
        
        return ans;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Autentificar")
    public Integer Autentificar(@WebParam(name = "user") int user, @WebParam(name = "pass") String pass) {
        int ans=1;
        Connection con = null;
        PreparedStatement  stm=null;
         try {
                Class.forName("org.postgresql.Driver");
                con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/clinica","postgres","123456");
                String sql = "select * from Usuario where usuario =? and pasword = ?;";
                stm = con.prepareStatement(sql);
                stm.setInt(1, user);
                stm.setString(2, pass);
                ResultSet rs = stm.executeQuery();
                
                while(rs.next())
                {
                    ans=0;
                    String nombre = rs.getString("nombre");
                    String paterno = rs.getString("apellido");
                    
                    
                }

            } catch (Exception ex) {
                System.err.println(ex.getMessage());
                
            }
        return ans;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "GetNombrePaciente")
    public String GetNombrePaciente(@WebParam(name = "ci") int ci) {
        String ans="";
        Connection con = null;
        PreparedStatement  stm=null;
         try {
                Class.forName("org.postgresql.Driver");
                con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/clinica","postgres","123456");
                String sql = "select * from Paciente where ci= ?";
                stm = con.prepareStatement(sql);
                stm.setInt(1, ci);
                ResultSet rs = stm.executeQuery();
                if(rs==null ){
                    ans="";
                }
                while(rs.next())
                {
                    
                    String nombre = rs.getString("Nombre");
                    String paterno = rs.getString("Apellido");
                    System.out.println(nombre+" "+paterno);
                    ans=nombre+" "+paterno;
                }

            } catch (Exception ex) {
                System.err.println(ex.getMessage());
                
            }
        return ans;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listaHorarios")
    public Vector listaHorarios(@WebParam(name = "id") int id) {
                
        Vector v= new Vector();
        Connection con = null;
        //Statement stm = null;
        PreparedStatement  stm=null;
         System.out.println("aquiii:");
        try 
        {
                Class.forName("org.postgresql.Driver");
                con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/clinica","postgres","123456");
                String sql = "select m.ci,m.Nombre,m.Apellido,e.horario from Medico m, horarioAtencio e where m.ci = e.idMedico and m.especialidad =?;";
                stm = con.prepareStatement(sql);
                stm.setInt(1, id);
                ResultSet rs = stm.executeQuery();
                while(rs.next())
                {
                  
                    v.addElement(rs.getString("ci"));
                    v.addElement(rs.getString("nombre"));
                    v.addElement(rs.getString("apellido"));
                    v.addElement(rs.getString("horario"));

                }
        } 
        catch (Exception ex)
                {
                    System.err.println(ex.getMessage());
                    
                }
        return v;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DatoMedico")
    public Vector DatoMedico(@WebParam(name = "id") int id) {
        Vector v= new Vector();
        Connection con = null;
        //Statement stm = null;
        PreparedStatement  stm=null;
        try 
        {
                Class.forName("org.postgresql.Driver");
                con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/clinica","postgres","123456");
                String sql = "select * from Medico where especialidad =?;";
                stm = con.prepareStatement(sql);
                stm.setInt(1, id);
                ResultSet rs = stm.executeQuery();
                while(rs.next())
                {
                  
                    v.addElement(rs.getString("ci"));
                    v.addElement(rs.getString("especialidad"));
                    v.addElement(rs.getString("nombre"));
                    v.addElement(rs.getString("apellido"));
      
                }
        } 
        catch (Exception ex)
                {
                    System.err.println(ex.getMessage());
                   
                }
        return v;
        
    }
    
    
    
    
}
