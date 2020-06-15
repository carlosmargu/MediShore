/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Adapter.Usuario;
import Composite.Beneficiario;
import Composite.Contrato;
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
 
public class Contratos {
    
    @Test
    public void Contrato() {
        String id ="13";
        Facede facade =Facede.rConstructora();
    Beneficiario bene = new Beneficiario("juan","34567","20/11/2019","Masculino");
            Contrato contrato = new Contrato();
            contrato.setCodigocon(id);
            Usuario user = facade.getUsuarios().get("juan");
            contrato.getBeneficiarios().add(bene);
            facade.Addcontrato(contrato);
            String com ="Codigo Contrato:13\n" +
"Adapter.Paciente@27973e9b\n" +
"juan, 34567, 20/11/2019, Masculino\n" +
"1";
            
            assertEquals(com,facade.verContraros());
    }
}
*/