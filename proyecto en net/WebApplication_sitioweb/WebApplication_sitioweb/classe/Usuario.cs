using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WebApplication_sitioweb.classe
{
    public class Usuario
    {
        private int usu;
        private String password;
        public Usuario() { }
        public Usuario(int id,String p)
        {
            this.usu = id;
            this.password = p;
        }

        public int GetUsu() { return this.usu; }
        public String GetPassw() { return this.password; }
        public void SetUsu(int valor) { this.usu = valor; }
        public void SetPassw(String p) { this.password = p; }

    }
}