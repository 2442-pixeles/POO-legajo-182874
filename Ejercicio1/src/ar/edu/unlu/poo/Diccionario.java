package ar.edu.unlu.poo;

import java.util.ArrayList;
import java.util.List;

public class Diccionario {
    private List<Palabra> palabrasDiccionario;

    public Diccionario(){
        this.setPalabrasDiccionario();
    }

    public void setPalabrasDiccionario() {
        this.palabrasDiccionario = new ArrayList<>();
    }

    public List<Palabra> getPalabrasDiccionario() {
        return palabrasDiccionario;
    }

    public void agregarPalabraDiccionario(String texto){
        Palabra nuevaPalabra = new Palabra(texto);
        getPalabrasDiccionario().add(nuevaPalabra);
    }

    public boolean buscarExistenciaPalabra(Palabra texto){
        String nuevo = texto.getPalabra();

        for (int i = 0; i < (this.getPalabrasDiccionario()).size(); i++){
            String diccionarioPala =  (getPalabrasDiccionario().get(i)).getPalabra();
            if (nuevo.equals(diccionarioPala)){
                return true;
            }
        }
        return false;
    }
}



