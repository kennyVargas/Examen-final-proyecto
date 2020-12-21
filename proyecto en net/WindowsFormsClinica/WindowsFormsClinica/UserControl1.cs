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
    public partial class UserControl1 : UserControl
    {
        public UserControl1()
        {
            InitializeComponent();
            comboBox1.SelectedIndex = 1;
        }



        private void Registrar_Click(object sender, EventArgs e)
        {
            if (!string.IsNullOrEmpty(textBox1.Text))
            {
                int ci = Convert.ToInt32(textBox1.Text);
                String nom = textBox2.Text;
                String ape = textBox3.Text;
                DateTime fecha = dateTimePicker1.Value;
                String fecha_nac = fecha.ToShortDateString();
                String sexo = comboBox1.Text;
                ServiceReference1.WebService1SoapClient ws = new ServiceReference1.WebService1SoapClient();
                int res = ws.InsertarPaciente(ci,nom,ape,fecha_nac,sexo);
                if (res==0)
                {
                    MessageBox.Show("REGISTRO CON EXITO", "MENSAJE");
                }
                else
                {
                    MessageBox.Show("OCURRIO UN ERROR", "Error");
                }
                
            }
            else
            {
                MessageBox.Show("COMPLETAR CORRECTAMENTE EL CAMPO", "Error");
            }

        }

        private void Limpiar_Click(object sender, EventArgs e)
        {
            textBox1.Text = "";
            textBox2.Text = "";
            textBox3.Text = "";

        }
    }
}
