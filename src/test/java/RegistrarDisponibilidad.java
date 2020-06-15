/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Adapter.Medico;
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
public class RegistrarDisponibilidad {
    @Test
     public void RD() {
      Facede fac = new Facede();
      Usuario medic = new Medico("juan", "123", "79411929", "nikolas", "05/04/99", "Chia", "8855874");
      String pac = "Disponibilidad Anadida";      
        assertEquals(pac, fac.AgregarAgenda(medic.getNombres(), "12/10/2019", "06:00", "09:00", "06:00", "09:00") );
      
     }
}
