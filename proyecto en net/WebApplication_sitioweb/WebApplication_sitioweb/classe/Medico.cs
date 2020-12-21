using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WebApplication_sitioweb.classe
{


    public class Medico
    {
        private String nom;
        private String ape;
        private int esp;
        private int ci;
        public Medico()
        {
            this.nom = "null";
            this.ape = "null";
            this.esp = 1;
            this.ci = 0;
        }
        public Medico(int id, int especidad,String nom, String ape)
        {
            this.ci = id;
            this.esp = especidad;
            this.nom = nom;
            this.ape = ape;

        }
        public int GetCi() { return this.ci; }
        public int GetEspecidalidad() { return this.esp; }
        public String GetApellido() { return this.ape; }
        public String GetNombre() { return this.nom; }

        public void SetCi(int valor) { this.ci = valor; }
        public void SetEspecialidad(int valor) { this.esp = valor; }
        public void SetNom(String valor) { this.nom = valor; }
        public void SetApe(String valor) { this.ape = valor; }

    }
}