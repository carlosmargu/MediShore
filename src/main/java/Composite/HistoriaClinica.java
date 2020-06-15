/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;
import Adapter.Paciente;
import Adapter.Usuario;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class HistoriaClinica implements Componente1{
    
private String cedula;
    private ArrayList<PacienteHC>pacienteshc ;
    Usuario paciente =new Paciente();
    public HistoriaClinica(String cedula, Usuario pacih) {
        this.cedula = cedula;
        this.paciente = pacih;
        setPacienteshc(new ArrayList());
    }
    public HistoriaClinica() {
        this.cedula = "";
        setPacienteshc(new ArrayList());
    }

 
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public ArrayList<PacienteHC> getPacienteshc() {
        return pacienteshc;
    }
       public String getCedula() {
        return cedula;
    }


    public void setPacienteshc(ArrayList<PacienteHC> pacienteshc) {
        this.pacienteshc = pacienteshc;
    }

    public Usuario getPaciente() {
        return paciente;
    }

    public void setPaciente(Usuario paciente) {
        this.paciente = paciente;
    }


    @Override
    public String mostrarh(String codigo) {
  
         String m = "";
        if (getCedula().equals(codigo)) {
            m = mostrarDatosh();
        }
        return m;
    }

    @Override
    public String mostrarDatosh() {
        String m = "";
         for (int i = 0; i < getPacienteshc().size(); i++){
             m=m+ getPacienteshc().get(i).getFecha()+", "+getPacienteshc().get(i).getNombre()+", "+getPacienteshc().get(i).getCc()+", "+getPacienteshc().get(i).getProcedencia()+", "+getPacienteshc().get(i).getOcupacion()+", "+
                     getPacienteshc().get(i).getMotivoConsulta()+", "+getPacienteshc().get(i).getAntecedentes()+", "+getPacienteshc().get(i).getAnalisis()+", "+getPacienteshc().get(i).getPlan();
            
        }
    return m;
}
     public void addBeneficiario(PacienteHC phc) {
        getPacienteshc().add(phc);
    }
}
