using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsClinica
{
    public partial class UserControl4 : UserControl
    {
        public UserControl4()
        {
            InitializeComponent();
        }

        private void MostarLista_Click(object sender, EventArgs e)
        {
            ServiceReference1.WebService1SoapClient ws = new ServiceReference1.WebService1SoapClient();
            this.dataGridView1.DataSource = ws.ListaReservas();
            this.dataGridView1.DataMember = "Medico";
            ///this.dataGridView1.DataSource = ws.listaPacientes();
            //this.dataGridView1.DataMember = "Paciente";
        }
    }
}
