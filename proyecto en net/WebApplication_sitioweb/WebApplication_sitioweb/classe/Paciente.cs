using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WebApplication_sitioweb.classe
{
    public class Paciente
    {
        private int ci;
        private String nom;
        private String ape;
        private String sexo;

        public Paciente()
        {

        }
        public Paciente(int id, String n, String ap,String s)
        {
            this.ci = id;
            this.nom = n;
            this.ape = ap;
           
            this.sexo = s;
        }
        public int GetCi() { return this.ci; }
        public String GetSexo() { return this.sexo; }
        public String GetApellido() { return this.ape; }
        public String GetNombre() { return this.nom; }

       

        public void SetCi(int valor) { this.ci = valor; }
        public void SetSexo(String valor) { this.sexo = valor; }
        public void SetNom(String valor) { this.nom = valor; }
        public void SetApe(String valor) { this.ape = valor; }
        
    }
}