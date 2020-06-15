/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Composite.EPS;
import Adapter.Adaptador;
import Adapter.Medico;
import Adapter.Paciente;
import Adapter.Usuario;
import Composite.Componente;
import Composite.Componente1;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Facede {

    private static Facede singleton;
    private HashMap<String, Usuario> usuarios;
    private EPS eps1;
    private Paciente paci;
    private Medico medi;
    private ArrayList<String> keyMedicos;

    public static Facede rConstructora() {
        if (singleton == null) {
            singleton = new Facede();

        }
        return singleton;
    }

    public Facede() {
        this.usuarios = new HashMap<>();
        this.eps1 = new EPS();
        this.paci = new Paciente();
        this.medi= new Medico ();
        this.keyMedicos = new ArrayList<>();
        this.addMedico("nikolas", "123", "34567", "Nikolas", "21", "armenia", "23456789");
        this.addPaciente("nikolasp", "123", "34567", "Nikolas", "21", "armenia", "23456789");
        this.addAdministrador("nikolasa", "123", "34567", "Nikolas", "21", "armenia", "23456789");
        Medico med = (Medico) this.usuarios.get("nikolas");
        this.AgregarAgenda(med.getLogin(), "12/10/2019", "06:00", "09:00", "06:00", "09:00");
        this.AgregarAgenda("nikolas","10-11-2019","13:00", "13:30","19:00","19:30");

    }

    public Usuario addMedico(String login, String password, String Cedula, String Nombres, String Fecha, String Direccion, String Telefono) {
        Usuario u = usuarios.put(login, new Medico(login, password, Cedula, Nombres, Fecha, Direccion, Telefono));
        keyMedicos.add(login);
        return u;
    }

    public Usuario addPaciente(String login, String password, String Cedula, String Nombres, String Fecha, String Direccion, String Telefono) {
        Usuario p = usuarios.put(login, new Paciente(login, password, Cedula, Nombres, Fecha, Direccion, Telefono));
        return p;
    }

    public void addAdministrador(String login, String password, String Cedula, String Nombres, String Fecha, String Direccion, String Telefono) {
        usuarios.put(login, new Adaptador(login, password, Cedula, Nombres, Fecha, Direccion, Telefono));
    }

    public Usuario login(String login, String password) {
        Usuario log = usuarios.get(login);
        if (log != null && log.Acceder(login, password)) {
            return log;
        }
        return null;
    }
//public String Vercitaspaciente (String fecha){
    //  return this.paci.getCitas(fecha);
//}

    
    
    public ArrayList<Componente> verContratos(String name) {
        return this.eps1.getContratos();
    }

    public String verContrarosCodigo(String codigo) {
        return this.eps1.mostrar(codigo);
    }

    public String verContraros() {
        return this.eps1.mostrarDatos() + this.eps1.getContratos().size();
    }
     public String verHistoriaPaciente(String codigo) {
        return this.eps1.mostrarh(codigo);
    }
       public String verCitast() {
        return this.paci.verCita();
    }
      public String Verhistoriat() {
        return this.eps1.mostrarDatosh() + this.eps1.getHistorias().size();
    }
      


    public ArrayList<Medico> Traer(String Fecha, String hora) {
        ArrayList<Medico> disponibles = new ArrayList<>();
        for (String keyMedico : keyMedicos) {
            Medico med = (Medico) this.usuarios.get(keyMedico);

            if (med.estoyDisponible(Fecha, LocalTime.parse(hora))) {
                disponibles.add(med);
            }
        }
        return disponibles;
    }

    public String AgregarCita(String medi, String Fecha, String hora, String Paciente) {
        Medico med = (Medico) this.usuarios.get(medi);
        String e = med.addCita(Fecha, LocalTime.parse(hora), Paciente);
        this.usuarios.replace(med.getLogin(), med);
        return e;
    }
    
   public String vercitasjj (){
       return this.eps1.verFin();
   }

    public String verCitas(String medico, String fecha) {
        Medico med = (Medico) this.usuarios.get(medico);
        return med.getCitas(fecha);
    }

    public String AgregarAgenda(String medic, String fecha, String horaInicioM, String horaFinM, String horaInicioT, String horaFinT) {
        Medico medi = (Medico) this.usuarios.get(medic);
        if (medi.addDisponibilidad(fecha, LocalTime.parse(horaInicioM), LocalTime.parse(horaFinM), LocalTime.parse(horaInicioT), LocalTime.parse(horaFinT))) {
            this.usuarios.replace(medi.getLogin(), medi);
            return "Disponibilidad Anadida";
        }
        return "Error anadiendo cita";
    }
    
    public String getCitas (String fecha){
       return this.medi.getCitas(fecha);
        
    }

    public HashMap<String, Usuario> getUsuarios() {
        return usuarios;
    }

    public EPS getEps1() {
        return eps1;
    }

    public void Addcontrato(Componente c) {
        eps1.addCont(c);

    }

    public void Addhistoria(Componente1 a) {
        eps1.addHist(a);

    }

    
    
  //carlos
}
