
package Adapter;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Adaptador extends Usuario {
    private Administrador Administrador;
   
    public Adaptador(String login,String password,String Cedula,String Nombres,String Fecha,String Direccion, String Telefono) {
        super();
        this.Administrador=new Administrador(login, password, Cedula, Nombres, Fecha, Direccion, Telefono);
        super.setTipouser(Administrador.getTipousuario());
    }

    public Adaptador() {
        super();
        this.Administrador = Administrador;
    }

    @Override
    public void tipouser() {
        this.Administrador.obtenerUsuario();
    }

    @Override
    public boolean Acceder(String login, String password) {
          return this.Administrador.Ingresar(login, password);
    }
    /*
    public String rangoCitas(){
        String hr1 ="12/10/2019";
        String hr2 ="12/11/2019";
        
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(hr1);
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(hr2);
       // Date []dates = {hr1,};
        return"";
    }*/
}
