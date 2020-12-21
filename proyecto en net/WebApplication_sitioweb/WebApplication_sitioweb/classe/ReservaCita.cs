using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WebApplication_sitioweb.classe
{
    public class ReservaCita
    {
        private int  idpaciente;
        private int idmedico;
        private String horario;
        private DateTime fecha_res;
        public ReservaCita() { }
        public ReservaCita(int idp, int idm,String h,DateTime fecha)
        {
            this.idpaciente = idp;
            this.idmedico = idm;
            this.horario = h;
            this.fecha_res = fecha;
           
        }
        public int GetIdPaciente() { return this.idpaciente; }
        public int GetIdMedico() { return this.idmedico; }
        public String GetHorario() { return this.horario; }
        public DateTime GetFechaRes() { return this.fecha_res; }
        
    }
}