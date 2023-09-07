package ar.edu.unlu.poo;

public class Jugador {
    private String nombre;
    private Palabra[] palabras;
    private int puntaje;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void crear (String nombre){
        this.setNombre(nombre);
    }

    public void sumarPuntos (int puntos){
        this.setPuntaje( (this.getPuntaje()) + puntos);
    }
}
