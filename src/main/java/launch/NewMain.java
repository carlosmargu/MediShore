/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launch;

import Adapter.Medico;
import Adapter.Paciente;
import Adapter.Usuario;
import Composite.Beneficiario;
import Composite.Contrato;
import Composite.HistoriaClinica;
import Composite.PacienteHC;
import Facade.Facede;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Julio
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Facede fac = Facede.rConstructora();
        Medico med = (Medico) fac.getUsuarios().get("nikolas");
        ArrayList<Medico> medi=fac.Traer("12/10/2019", "07:00");
        Usuario pa = new Paciente ("nikolasp", "123","34567","Nikolas","21","armenia","23456789");
        System.out.println(medi.size());
        System.out.println(med.addCita("12/10/2019",LocalTime.parse("07:00"), pa.getLogin()));
        
        Date inicio = new Date(2019,11,10);
        Date finali = new Date(2019,11,19);
       // PacienteHC phc = new PacienteHC("31/12/2019", "A", "123", "", "", "", "", "", "", "", "");
        //HistoriaClinica hist = new HistoriaClinica("123", phc);
        
        /*String Fecha= phc.getFecha();
        String sDate1="15/12/2019";  
        String sDate2="17/12/2019";
        String sDate3="24/12/2019";
         //Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(Fecha);
          Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
           Date date3=new SimpleDateFormat("dd/MM/yyyy").parse(sDate2);
            Date date4=new SimpleDateFormat("dd/MM/yyyy").parse(sDate3);
        Date []dates = {date1, date2, date3, date4};
        int j=0;
        for (int i = 0; i < dates.length; i++) {
            for (int k=0; k < dates.length; k++) {
            Date date = dates[i];
            if (date.after(date3)&&(date.before(date1))){
                j=k+j;
                
            }
            }
            

            
        }
        System.out.println(j); 
        System.out.println(date1+"\n"+"3");*/
        
        
            Facede facade = new Facede();
            PacienteHC phc = new PacienteHC("20/11/2019","Juan","34567","India","Estudiante","Migraña severa","Migraña hereditaria","OK","Familiares","Enrojecimiento en la parte posterior de la cabeza","Medicamentos y descanso");
            Composite.HistoriaClinica hc = new Composite.HistoriaClinica();
            hc.getPacienteshc().add(phc);
            hc.setCedula(phc.getCc());
            facade.Addhistoria(hc);
             
            System.out.println(facade.verHistoriaPaciente("34567"));
            
            
            String id ="13";
       // Facede facade = new Facede();
    Beneficiario bene = new Beneficiario("juan","34567","20/11/2019","Masculino");
            Contrato contrato = new Contrato();
            contrato.setCodigocon(id);
            Usuario user = facade.getUsuarios().get("juan");
            contrato.getBeneficiarios().add(bene);
            facade.Addcontrato(contrato);
            facade.verContrarosCodigo(id);
            System.out.println(facade.verContrarosCodigo(id).toString());
    }
    
}
