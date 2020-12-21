using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WebApplication_sitioweb.classe
{
    public class Especidad
    {
        private int id;
        private String nombre;
        public Especidad() { }
        public Especidad(int id, String n)
        {
            this.id = id;
            this.nombre = n;
        }

        public int GetID() { return this.id; }
        public String GetNombre() { return this.nombre; }
        public void SetId(int valor) { this.id = valor; }
        public void SetNombre(String valor) { this.nombre = valor; }

    }
}