/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Adapter.Adaptador;
import Adapter.Medico;
import Adapter.Usuario;
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
public class Login {
   @Test
   public void LoginCorrecto(){
        
        Usuario admin = new Adaptador("admin", "admin", "1072672744", "Javier Torres", "05/06/67", "Chia", "8855419");
        assertTrue(admin.Acceder("admin", "admin"));
        
    } 
    @Test
    public void Logincorrecto(){
        Usuario paciente = new Medico("juan", "123", "79411929", "Juan Munoz", "05/04/99", "Chia", "8855874");
        assertEquals(paciente.Acceder("juan", "123"),paciente.Acceder("juan", "123"));
    }
}
