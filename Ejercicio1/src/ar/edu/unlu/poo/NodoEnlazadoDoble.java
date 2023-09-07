package ar.edu.unlu.poo;

public class NodoEnlazadoDoble {
    private Object dato;
    private NodoEnlazadoDoble anterior = null;
    private NodoEnlazadoDoble proximo = null;

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public void setProximo(NodoEnlazadoDoble proximo) {
        this.proximo = proximo;
    }

    public void setAnterior(NodoEnlazadoDoble anterior) { this.anterior = anterior; }

    public Object getDato() {
        return dato;
    }

    public NodoEnlazadoDoble getProximo() {
        return proximo;
    }

    public NodoEnlazadoDoble getAnterior() { return anterior; }
}
