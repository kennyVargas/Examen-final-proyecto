using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;
using System.Data;
using System.Data.SqlClient;
namespace WebServiceF
{
    /// <summary>
    /// Descripción breve de WebService1
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class WebService1 : System.Web.Services.WebService
    {

 
        public SqlConnection Conexion()
        {
            SqlConnection conexion = new SqlConnection();
            conexion.ConnectionString = "server=(local);user=admwilson;pwd=123456;database=clinica";
            return conexion;
        }
        [WebMethod]
        public DataSet listaHorarios(int i)
        {

            //Ingresar ci y returna las materias inscritas del alumno
            SqlConnection conexion = Conexion();
            DataSet ds = new DataSet();
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = conexion;
            cmd.CommandText = " select m.ci,m.Nombre,m.Apellido,e.horario from Medico m, horarioAtencio e where m.ci = e.idMedico and m.especialidad = @i";
            cmd.Parameters.Add("@i", SqlDbType.Int).Value = i;

            SqlDataAdapter da = new SqlDataAdapter(cmd);

            da.Fill(ds, "horarioAtencio");

            return ds;
        }
        [WebMethod]
        public int InsertarReserva(int p, int m, String h, String r)
        {
            SqlConnection conexion = Conexion();
            DataSet ds = new DataSet();
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = conexion;
            cmd.CommandText = "INSERT INTO Res_cita VALUES(@idp, @idm,@hora,@fecha);";
            cmd.Parameters.Add("@idp", SqlDbType.Int).Value = p;
            cmd.Parameters.Add("@idm", SqlDbType.Int).Value = m;
            cmd.Parameters.Add("@hora", SqlDbType.VarChar, 10).Value = h;
            cmd.Parameters.Add("@fecha", SqlDbType.VarChar, 20).Value = r;
            conexion.Open();
            cmd.ExecuteNonQuery();
            return 0;
        }
        [WebMethod]
        public String GetNombrePaciente(int i)
        {
            String nombre = "";
            String apellido = "";
            String ans = "";
            SqlConnection conexion = Conexion();
            DataSet ds = new DataSet();
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = conexion;
            cmd.CommandText = "select * from Paciente where ci= @i";
            cmd.Parameters.Add("@i", SqlDbType.Int).Value = i;

            SqlDataAdapter da = new SqlDataAdapter(cmd);
            da.Fill(ds, "Paciente");
            if (ds != null && (ds.Tables["Paciente"].Rows.Count > 0))
            {
                nombre = ds.Tables["Paciente"].Rows[0][1].ToString();
                apellido = ds.Tables["Paciente"].Rows[0][2].ToString();
                ans = nombre + " " + apellido;

            }
            else
            {
                ans = "NO EXISTE EL ESTUDIANTE CON EL CI : " + i;
            }

            return ans;
        }
        [WebMethod]
        public int InsertarPaciente(int id, string n, string ap, String fecha, String sexo)
        {
            SqlConnection conexion = Conexion();
            DataSet ds = new DataSet();
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = conexion;
            cmd.CommandText = "INSERT INTO Paciente VALUES(@id, @nom,@ape,@fecha,@sexo);";
            cmd.Parameters.Add("@id", SqlDbType.Int).Value = id;
            cmd.Parameters.Add("@nom", SqlDbType.VarChar, 30).Value = n;
            cmd.Parameters.Add("@ape", SqlDbType.VarChar, 30).Value = ap;
            cmd.Parameters.Add("@fecha", SqlDbType.VarChar, 20).Value = fecha;
            cmd.Parameters.Add("@sexo", SqlDbType.VarChar, 10).Value = sexo;
            conexion.Open();
            cmd.ExecuteNonQuery();
            return 0;
        }
        [WebMethod]
        public int InsertarUsuario(int id, string pasword)
        {
            SqlConnection conexion = Conexion();
            DataSet ds = new DataSet();
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = conexion;
            cmd.CommandText = "INSERT INTO Usuario VALUES(@id, @passw);";
            cmd.Parameters.Add("@id", SqlDbType.Int).Value = id;
            cmd.Parameters.Add("@passw", SqlDbType.VarChar, 30).Value = pasword;
            conexion.Open();
            cmd.ExecuteNonQuery();
            return 0;
        }
        [WebMethod]
        public int Autentificar(int user, String password)
        {
            int ans = 1;
            SqlConnection conexion = Conexion();
            DataSet ds = new DataSet();
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = conexion;
            cmd.CommandText = "select * from Usuario where usuario = @u and pasword = @p";
            cmd.Parameters.Add("@u", SqlDbType.Int).Value = user;
            cmd.Parameters.Add("@p", SqlDbType.VarChar).Value = password;
            SqlDataAdapter da = new SqlDataAdapter(cmd);

            da.Fill(ds, "Usuario");

            if (ds != null && ds.Tables[0].Rows.Count > 0)
            {
                ans = 0;
                String usu = ds.Tables["Usuario"].Rows[0][1].ToString();
                
            }

            return ans;
        }
        [WebMethod]
        public DataSet listaPacientes()
        {

            //Ingresar ci y returna las materias inscritas del alumno
            SqlConnection conexion = Conexion();
            DataSet ds = new DataSet();
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = conexion;
            cmd.CommandText = " select * from Paciente";
            SqlDataAdapter da = new SqlDataAdapter(cmd);

            da.Fill(ds, "Paciente");

            return ds;
        }
        [WebMethod]
        public DataSet DatoMedico(int i)
        {

            //Ingresar ci y returna las materias inscritas del alumno
            SqlConnection conexion = Conexion();
            DataSet ds = new DataSet();
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = conexion;
            cmd.CommandText = "select * from Medico where especialidad = @i";
            cmd.Parameters.Add("@i", SqlDbType.Int).Value = i;

            SqlDataAdapter da = new SqlDataAdapter(cmd);

            da.Fill(ds, "Medico");

            return ds;
        }

        [WebMethod]
        public DataSet ListaReservas()
        {

            //Ingresar ci y returna las materias inscritas del alumno
            SqlConnection conexion = Conexion();
            DataSet ds = new DataSet();
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = conexion;
            cmd.CommandText = "select p.Nombre,p.Apellido,r.fech_res,r.horario,m.Nombre,m.Apellido from Paciente p,Res_cita r ,Medico m where p.ci=r.idpaciente and m.ci=r.idMedico";
            SqlDataAdapter da = new SqlDataAdapter(cmd);

            da.Fill(ds, "Medico");

            return ds;
        }

    }
}
