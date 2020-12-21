using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsClinica
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            userControl11.Hide();
            userControl21.Hide();
            userControl31.Hide();
            userControl41.Hide();
        }

        private void RegistrarPaciente_Click(object sender, EventArgs e)
        {
            userControl21.Hide();
            userControl31.Hide();
            userControl41.Hide();

            userControl11.Show();
            userControl11.BringToFront();
        }

        private void ReservarCita_Click(object sender, EventArgs e)
        {
            userControl11.Hide();
           
            userControl31.Hide();
            userControl41.Hide();

            userControl21.Show();
            userControl21.BringToFront();
        }

        private void ListaPaciente_Click(object sender, EventArgs e)
        {
            userControl11.Hide();
            userControl21.Hide();
            
            userControl41.Hide();

            userControl31.Show();
            userControl31.BringToFront();
        }

        private void ListaReserva_Click(object sender, EventArgs e)
        {
            userControl11.Hide();
            userControl21.Hide();
            userControl31.Hide();
            userControl41.Show();
            userControl41.BringToFront();
        }
    }
}
