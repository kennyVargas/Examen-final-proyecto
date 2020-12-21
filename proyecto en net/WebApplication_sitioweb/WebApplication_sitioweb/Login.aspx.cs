using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;

namespace WebApplication_sitioweb
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        private classe.Medico p = new classe.Medico();
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!Page.IsPostBack)
            {
                Session["UserSessionId"] = null;
            }
 
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            int a = Convert.ToInt32( TextBox1.Text);
            String b = TextBox2.Text;
            ServiceReference1.WebService1SoapClient ws = new ServiceReference1.WebService1SoapClient();

            int res = ws.Autentificar(a,b);
            if (res==0)
            {
                Response.Write("<script>  alert('USUARIO CORRECTO') </script>");
                Session["UserSessionId"] = a;
                Response.Redirect("ReservaCita.aspx");
            }
            else
            {
                Response.Write("<script>  alert('USUARIO INCIRESTO') </script>");
                
            }

        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            Response.Redirect("Inicio.aspx");
        }
    }
}