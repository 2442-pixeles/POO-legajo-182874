package ar.edu.unlu.poo;
import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String nombre;
    private List<Palabra> arrayPalabras;
    private int puntaje;

    public Jugador (String name){
        this.setNombre(name);
        this.setPalabras();
        this.setPuntaje(0);
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPalabras() {
        this.arrayPalabras = new ArrayList<>();
    }

    public List<Palabra> getPalabras() {
        return arrayPalabras;
    }

    public void sumarPuntos (int puntos){
        this.setPuntaje( (this.getPuntaje()) + puntos);
    }

    public boolean agregarPalabra(String texto,Diccionario diccionario){
        Palabra nuevaPalabra = new Palabra(texto);
        if ((diccionario.buscarExistenciaPalabra(nuevaPalabra))==true){
            (getPalabras()).add(nuevaPalabra);
            return true;
        }
        return false;
    }

    public int contarPuntos(){
        int acumulador = 0;
        for (int i = 0; i < (getPalabras()).size(); i++) {
            Palabra elemento = (getPalabras()).get(i);
            acumulador += elemento.calcular();
        }
        this.sumarPuntos(acumulador);
        return acumulador;
    }

}
