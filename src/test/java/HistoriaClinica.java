/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Composite.PacienteHC;
import Facade.Facede;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oscar
 
public class HistoriaClinica {
    
    @Test
    public void addHC() {
        Facede facade = new Facede();
            PacienteHC phc = new PacienteHC("20/11/2019","Juan","34567","India","Estudiante","Migraña severa","Migraña hereditaria","OK","Familiares","Enrojecimiento en la parte posterior de la cabeza","Medicamentos y descanso");
            Composite.HistoriaClinica hc = new Composite.HistoriaClinica();
            hc.getPacienteshc().add(phc);
            hc.setCedula(phc.getCc());
            facade.Addhistoria(hc);
            String com="20/11/2019, Juan, 34567, India, Estudiante, Migraña severa, Familiares, Enrojecimiento en la parte posterior de la cabeza, Medicamentos y descanso1";
            assertEquals(com,facade.Verhistoriat());
    }
}
*/