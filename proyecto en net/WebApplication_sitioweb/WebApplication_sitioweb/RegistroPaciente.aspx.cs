using System;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication_sitioweb
{
    public partial class RegistroPaciente : System.Web.UI.Page
    {

        
        protected void Page_Load(object sender, EventArgs e)
        {
            
        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            ServiceReference1.WebService1SoapClient ws = new ServiceReference1.WebService1SoapClient();
            int ans1 = 1;
            int ans2 = 1;
            int ci = Convert.ToInt32(TextBox1.Text);
            String nom = TextBox2.Text;
            String ape = TextBox3.Text;
            String contrasenna = TextBox4.Text;
            String fecha = TextBox5.Text;
            String sexo = addSexo.Text;

            ans1 = ws.InsertarPaciente(ci,nom,ape,fecha,sexo);
            ans2 = ws.InsertarUsuario(ci,contrasenna);
            if (ans1==0 && ans2==0)
            {
                Response.Write("<script>  alert('REGISTRO CON EXCITO :') </script>");
                Response.Redirect("Login.aspx");
            }
            else
            {
                Response.Write("<script>  alert('Error en el servidor intente mas tarde') </script>");
            }  
           
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            TextBox1.Text = "";
            TextBox2.Text = "";
            TextBox3.Text = "";
            TextBox4.Text = "";
            TextBox5.Text = "";
        }

        protected void Button3_Click(object sender, EventArgs e)
        {
            Response.Redirect("Inicio.aspx");
        }

    }
}