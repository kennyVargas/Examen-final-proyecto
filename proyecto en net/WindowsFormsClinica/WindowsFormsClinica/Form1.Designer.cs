namespace WindowsFormsClinica
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.panel1 = new System.Windows.Forms.Panel();
            this.ListaReserva = new System.Windows.Forms.Button();
            this.ListaPaciente = new System.Windows.Forms.Button();
            this.ReservarCita = new System.Windows.Forms.Button();
            this.RegistrarPaciente = new System.Windows.Forms.Button();
            this.panel2 = new System.Windows.Forms.Panel();
            this.userControl41 = new WindowsFormsClinica.UserControl4();
            this.userControl31 = new WindowsFormsClinica.UserControl3();
            this.userControl21 = new WindowsFormsClinica.UserControl2();
            this.userControl11 = new WindowsFormsClinica.UserControl1();
            this.panel1.SuspendLayout();
            this.panel2.SuspendLayout();
            this.SuspendLayout();
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.ListaReserva);
            this.panel1.Controls.Add(this.ListaPaciente);
            this.panel1.Controls.Add(this.ReservarCita);
            this.panel1.Controls.Add(this.RegistrarPaciente);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Left;
            this.panel1.Location = new System.Drawing.Point(0, 0);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(200, 450);
            this.panel1.TabIndex = 0;
            // 
            // ListaReserva
            // 
            this.ListaReserva.Location = new System.Drawing.Point(13, 307);
            this.ListaReserva.Name = "ListaReserva";
            this.ListaReserva.Size = new System.Drawing.Size(161, 62);
            this.ListaReserva.TabIndex = 3;
            this.ListaReserva.Text = "LISTA DE RESERVAS";
            this.ListaReserva.UseVisualStyleBackColor = true;
            this.ListaReserva.Click += new System.EventHandler(this.ListaReserva_Click);
            // 
            // ListaPaciente
            // 
            this.ListaPaciente.Location = new System.Drawing.Point(13, 219);
            this.ListaPaciente.Name = "ListaPaciente";
            this.ListaPaciente.Size = new System.Drawing.Size(161, 64);
            this.ListaPaciente.TabIndex = 2;
            this.ListaPaciente.Text = "LISTA DE PACIENTES";
            this.ListaPaciente.UseVisualStyleBackColor = true;
            this.ListaPaciente.Click += new System.EventHandler(this.ListaPaciente_Click);
            // 
            // ReservarCita
            // 
            this.ReservarCita.Location = new System.Drawing.Point(13, 116);
            this.ReservarCita.Name = "ReservarCita";
            this.ReservarCita.Size = new System.Drawing.Size(161, 66);
            this.ReservarCita.TabIndex = 1;
            this.ReservarCita.Text = "RESERVAR CITA MEDICA";
            this.ReservarCita.UseVisualStyleBackColor = true;
            this.ReservarCita.Click += new System.EventHandler(this.ReservarCita_Click);
            // 
            // RegistrarPaciente
            // 
            this.RegistrarPaciente.Location = new System.Drawing.Point(13, 31);
            this.RegistrarPaciente.Name = "RegistrarPaciente";
            this.RegistrarPaciente.Size = new System.Drawing.Size(161, 55);
            this.RegistrarPaciente.TabIndex = 0;
            this.RegistrarPaciente.Text = "REGISTRAR NEUVO PACIENTE";
            this.RegistrarPaciente.UseVisualStyleBackColor = true;
            this.RegistrarPaciente.Click += new System.EventHandler(this.RegistrarPaciente_Click);
            // 
            // panel2
            // 
            this.panel2.Controls.Add(this.userControl41);
            this.panel2.Controls.Add(this.userControl31);
            this.panel2.Controls.Add(this.userControl21);
            this.panel2.Controls.Add(this.userControl11);
            this.panel2.Dock = System.Windows.Forms.DockStyle.Fill;
            this.panel2.Location = new System.Drawing.Point(200, 0);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(729, 450);
            this.panel2.TabIndex = 1;
            // 
            // userControl41
            // 
            this.userControl41.Location = new System.Drawing.Point(7, 13);
            this.userControl41.Name = "userControl41";
            this.userControl41.Size = new System.Drawing.Size(671, 380);
            this.userControl41.TabIndex = 3;
            // 
            // userControl31
            // 
            this.userControl31.BackColor = System.Drawing.SystemColors.ButtonFace;
            this.userControl31.Location = new System.Drawing.Point(7, 13);
            this.userControl31.Name = "userControl31";
            this.userControl31.Size = new System.Drawing.Size(723, 395);
            this.userControl31.TabIndex = 2;
            // 
            // userControl21
            // 
            this.userControl21.BackColor = System.Drawing.SystemColors.ButtonFace;
            this.userControl21.Location = new System.Drawing.Point(7, 4);
            this.userControl21.Name = "userControl21";
            this.userControl21.Size = new System.Drawing.Size(721, 433);
            this.userControl21.TabIndex = 1;
            // 
            // userControl11
            // 
            this.userControl11.BackColor = System.Drawing.SystemColors.ButtonFace;
            this.userControl11.Location = new System.Drawing.Point(7, 4);
            this.userControl11.Name = "userControl11";
            this.userControl11.Size = new System.Drawing.Size(701, 377);
            this.userControl11.TabIndex = 0;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(929, 450);
            this.Controls.Add(this.panel2);
            this.Controls.Add(this.panel1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.panel1.ResumeLayout(false);
            this.panel2.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.Button RegistrarPaciente;
        private System.Windows.Forms.Button ListaReserva;
        private System.Windows.Forms.Button ListaPaciente;
        private System.Windows.Forms.Button ReservarCita;
        private UserControl3 userControl31;
        private UserControl2 userControl21;
        private UserControl1 userControl11;
        private UserControl4 userControl41;
    }
}