using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication_sitioweb
{
    public partial class ReservaCita : System.Web.UI.Page
    {
        
        ServiceReference1.WebService1SoapClient ws = new ServiceReference1.WebService1SoapClient();
        protected void Page_Load(object sender, EventArgs e)
        {
            if (Session["UserSessionId"] == null)
            {
                Response.Redirect("Login.aspx");
                
            }
            TextBox1.Text = Session["UserSessionId"].ToString();

           
            Panel1.Visible = false;

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            int espe = Convert.ToInt32(Idespecialidad.Text);

            this.GridView1.DataSource = ws.listaHorarios(espe);

            this.GridView1.DataBind();
        }
        protected void ReservarCita(object sender, EventArgs e)
        {
            int ans = 1;
            this.GridView1.Visible = false;
            //String idmedico = (sender as LinkButton).CommandArgument;
            string[] arDatos = (sender as LinkButton).CommandArgument.ToString().Split(',');

            int idpaciente = Convert.ToInt32(TextBox1.Text);
            int idMedico = Convert.ToInt32(arDatos[0]);
            String horario = arDatos[1];
            String nombreMedico = arDatos[2] + " " + arDatos[3];
            String fe = TextBox2.Text;
            ans = ws.InsertarReserva(idpaciente, idMedico, horario, fe);
            String nombrePaciente = ws.GetNombrePaciente(idpaciente);
            //rs = new classe.ReservaCita(idpaciente,idMedico,horario,fe);

            if (ans==0)
            {

                Response.Write("<script>  alert('Se registro la reserva con exito') </script>");
                Panel1.Visible = true;
                TextBox3.Text = nombreMedico;
                TextBox4.Text = horario;
                TextBox5.Text = fe;
                TextBox6.Text = nombrePaciente;
            }
            else
            {
                Response.Write("<script>  alert('error al resgritar intente de nuevo') </script>");
            }
            

        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            Session["UserSessionId"] = null;
            Response.Redirect("Login.aspx");
            
        }

    }
}