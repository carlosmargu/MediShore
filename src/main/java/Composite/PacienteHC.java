/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;


/**
 *
 * @author PREDATOR
 */
public class PacienteHC {
    private String fecha;
    private String nombre;
    private String cc;
    private String procedencia;
    private String ocupacion;
    private String motivoConsulta;
    private String enfermedad;
    private String revision;
    private String antecedentes;
    private String analisis;
    private String plan;

    public PacienteHC(String fecha, String nombre, String cc, String procedencia, String ocupacion, String motivoConsulta, String enfermedad, String revision, String antecedentes, String analisis, String plan) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.cc = cc;
        this.procedencia = procedencia;
        this.ocupacion = ocupacion;
        this.motivoConsulta = motivoConsulta;
        this.enfermedad = enfermedad;
        this.revision = revision;
        this.antecedentes = antecedentes;
        this.analisis = analisis;
        this.plan = plan;
        
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getAnalisis() {
        return analisis;
    }

    public void setAnalisis(String analisis) {
        this.analisis = analisis;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }
}
