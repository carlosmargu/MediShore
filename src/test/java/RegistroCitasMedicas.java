/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Adapter.Paciente;
import Adapter.Usuario;
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
 */
public class RegistroCitasMedicas {
   @Test
     public void RegistroCita() {
         Facede fac = new Facede();
         Usuario paciente = new Paciente("juan", "123", "101785", "Juan Guerra", "05/04/05", "chia", "8855874");
         String pac=fac.AgregarCita("nikolas","12/10/2019", "06:00", paciente.getNombres());
         assertEquals(pac,fac.AgregarCita("nikolas","12/10/2019", "06:00", "Juan Guerra"));
     }
}

