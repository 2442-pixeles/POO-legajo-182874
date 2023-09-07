package ar.edu.unlu.poo;

public class Nodo {

    private Object dato;
    private Nodo proximo = null;

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }

    public Object getDato() {
        return dato;
    }

    public Nodo getProximo() {
        return proximo;
    }
}
