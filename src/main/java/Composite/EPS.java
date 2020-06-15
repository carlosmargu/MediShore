/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;
import java.util.HashMap;

public class EPS implements Componente,Componente1 {

    String nombre;
    private ArrayList<Componente> contratos;
    private ArrayList<Componente1> historias;
     private HashMap<String, String> horario1;

    public EPS(String nombre) {
        this.nombre = nombre;
        setContratos(new ArrayList());
        setHistorias(new ArrayList());
      
    }

    public EPS() {
        this.nombre = "";
        setContratos(new ArrayList());
        setHistorias(new ArrayList());
    }

    @Override
    public String mostrarDatos() {

        String m = "";
        for (Componente c : contratos) {
            m = m + c.mostrarDatos();
        }
        return m;
    }

    @Override
    public String mostrarh(String codigo) {

        String m = "";
        for (Componente1 a : historias) {
            m = m + a.mostrarh(codigo);
        }
        return m;

    }

     @Override
    public String mostrarDatosh() {

        String m = "";
        for (Componente1 a : historias) {
            m = m + a.mostrarDatosh();
        }
        return m;
    }

    @Override
    public String mostrar(String codigo) {

        String m = "";
        for (Componente c : contratos) {
            m = m + c.mostrar(codigo);
        }
        return m;

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Componente> getContratos() {
        return contratos;
    }
  public ArrayList<Componente1> getHistorias() {
        return historias;
    }
    public void setContratos(ArrayList<Componente> contratos) {
        this.contratos = contratos;
    }
        public void setHistorias(ArrayList<Componente1> historias) {
        this.historias= historias;
    }

    public void addCont(Componente c) {
        getContratos().add(c);
    }
      public void addHist(Componente1 a) {
        getHistorias().add(a);
    }
      
          public void llenarHash(){
        horario1.put("uno", "aa");
        horario1.put("dos","ss");
        horario1.put("tres","df");
       
    }
    public String verFin(){
        String fecha="uno";
      if (this.horario1.containsKey(fecha)){
          
      }
      return "sisi";
    }

    }

