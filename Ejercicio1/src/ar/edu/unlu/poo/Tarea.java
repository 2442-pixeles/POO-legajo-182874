package ar.edu.unlu.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tarea {
    private String descripcion = "";
    private String prioridad;
    private EstadoTarea estado ;
    private LocalDate fechaLimite;
    private LocalDate fechaRecordatorio;

    public Tarea(String descripcion,String estado,String prioridad, String fechaLimite,String formato){

        this.setDescripcion(descripcion);

        if (estado.equals("COMPLETA")) this.setEstado(EstadoTarea.COMPLETA);
        else if (estado.equals("INCOMPLETA")) this.setEstado(EstadoTarea.INCOMPLETA);

        DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern(formato);
        LocalDate fechalimite  = LocalDate.parse(fechaLimite, fechaFormateada);

        this.setFechaLimite(fechalimite);

        this.setPrioridad(prioridad);
    }

    public void establecerRecordatorio (String fecha,String formato){
        DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern(formato);
        LocalDate recordatorio = LocalDate.parse(fecha, fechaFormateada);
        this.setFechaRecordatorio(recordatorio);
        if ( ((this.getFechaRecordatorio()).isAfter(LocalDate.now())) || ((this.getFechaRecordatorio()).isEqual(LocalDate.now())) && this.getEstado().equals(EstadoTarea.INCOMPLETA) ){
            String descripcionNueva = "(por vencer)" + this.getDescripcion();
            this.setDescripcion(descripcionNueva);
        } else if (((this.getFechaRecordatorio()).isBefore(LocalDate.now())) || ((this.getFechaRecordatorio()).isEqual(LocalDate.now())) && this.getEstado().equals(EstadoTarea.INCOMPLETA )) {
            this.setPrioridad("Maxima");
        }
    }


    public void setFechaRecordatorio(LocalDate fechaRecordatorio) {
        this.fechaRecordatorio = fechaRecordatorio;
    }

    public LocalDate getFechaRecordatorio() {
        return this.fechaRecordatorio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public void setEstado(EstadoTarea estado) {
        this.estado = estado;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public EstadoTarea getEstado() {
        return estado;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public String mostrarTarea(){
        String acumulador = "";

        if ( this.getEstado() == EstadoTarea.COMPLETA ){
            acumulador = "(Vencida) "+ this.getDescripcion() + "\n";
            return acumulador;
        } else if ( (this.getEstado() == EstadoTarea.INCOMPLETA)  &&  ((this.getFechaLimite()).isBefore(LocalDate.now())) ){
            acumulador = "(Fecha limite sobrepasada ) "+ this.getDescripcion() + "\n" ;
            return acumulador;
        } else {
            return this.descripcion +"\n" ;
        }
    }

    public void modificarDescripcion(String texto){
        this.setDescripcion(texto);
    }

    public void modificarPrioridad(String prioridad){
        this.setPrioridad(prioridad);
    }

    public void modificarEstado(EstadoTarea estado){
        this.setEstado(estado);
    }

    public boolean esVencida(){
        if ( (this.getEstado()==EstadoTarea.INCOMPLETA)  &&  ((this.getFechaLimite()).isBefore(LocalDate.now())) ){
            return true;
        } else {
            return false;
        }
    }

    public boolean esCompleta(){
        if ((this.getEstado()) == EstadoTarea.COMPLETA){
            return true;
        } else {
            return false;
        }
    }











}














