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
    public partial class UserControl2 : UserControl
    {
        
        int idEspecialidad = 1;
        int idm = 1;
        int id = 0;
        String fecha_res = "";
        public UserControl2()
        {
            InitializeComponent();
            comboBox1.SelectedIndex = 1;
            panel1.Visible = false;
            panel2.Visible = false;
            
        }

        private void Asignar_Medico_Click(object sender, EventArgs e)
        {

            ServiceReference1.WebService1SoapClient ws = new ServiceReference1.WebService1SoapClient();
            if (!string.IsNullOrEmpty(textBox1.Text))
            {
                
                String especialidad = comboBox1.Text;
                if (especialidad.Equals("Traumatologia"))
                {
                    idEspecialidad = 1;
                }else if(especialidad.Equals("Urologia"))
                {
                    idEspecialidad = 2;
                }
                else if (especialidad.Equals("Cardiologia"))
                {
                    idEspecialidad = 3;
                }
                else
                {
                    idEspecialidad = 4;
                }
                this.dataGridView1.DataSource = ws.listaHorarios(idEspecialidad);
                this.dataGridView1.DataMember = "horarioAtencio";

                //int res_In = ws.InsertarReserva();
                //textBox2.Text = idEspecialidad.ToString();
                panel2.Visible = true;
            }
            else
            {
                MessageBox.Show("COMPLETAR CORRECTAMENTE EL CAMPO", "Error");
            }
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            ServiceReference1.WebService1SoapClient ws = new ServiceReference1.WebService1SoapClient();
            id = Convert.ToInt32(textBox1.Text);
            DateTime fecha = dateTimePicker1.Value;
            fecha_res = fecha.ToShortDateString();
            String nomPaciente = ws.GetNombrePaciente(id);
            MessageBox.Show("Reserva Seleccionada", "Mensaje");
            //panel2.Visible = false;
            panel1.Visible = true;
            
            DataSet ds = ws.DatoMedico(idEspecialidad);


            String idmedico = ds.Tables["Medico"].Rows[0][0].ToString();
            idm = Convert.ToInt32(idmedico);
            String nombreM = ds.Tables["Medico"].Rows[0][2].ToString()+" " + ds.Tables["Medico"].Rows[0][3].ToString();
            textBox2.Text = nomPaciente;
            textBox3.Text = nombreM;
            textBox4.Text = fecha_res;

 
            


        }
        private void Res_cita_Click(object sender, EventArgs e)
        {
            ServiceReference1.WebService1SoapClient ws = new ServiceReference1.WebService1SoapClient();
            if (!string.IsNullOrEmpty(textBox5.Text))
            {

                int res = ws.InsertarReserva(id,idm,textBox5.Text, fecha_res);
                if (res==0)
                {
                    MessageBox.Show("REGISTRO CON EXITO", "mesaje");
                }
                else
                {
                    MessageBox.Show("OCURRIO UN ERROR", "mesaje");
                }
            }
            else
            {
                MessageBox.Show("COMPLETAR CORRECTAMENTE EL CAMPO", "Error");
            }
        }
        private void label8_Click(object sender, EventArgs e)
        {

        }

  
    }
}
