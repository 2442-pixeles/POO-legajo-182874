package ar.edu.unlu.poo;

public class Palabra {
    private String palabra;
    private int puntaje;

    public void setPuntaje(int puntos) {
        this.puntaje = puntaje;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public String getPalabra() {
        return palabra;
    }

    public int calcular(String texto){
        this.setPalabra(texto);
        char[] caracteres =  (this.getPalabra()).toCharArray();
        char[] puntosBonus = {'k', 'z', 'x', 'y', 'w'};
        int acumulador = caracteres.length;

        for (int i = 0; i < caracteres.length; i++) {
            char letra = caracteres[i];
            for (int j = 0; j < puntosBonus.length; j++) {
                char verificacion = puntosBonus[j];
                if (letra == verificacion) {acumulador += 1;}
            }
        }
        return acumulador;
    }
}

