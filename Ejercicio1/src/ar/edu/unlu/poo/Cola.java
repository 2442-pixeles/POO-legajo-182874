package ar.edu.unlu.poo;

public class Cola {
    private Nodo inicio = null;
    private Nodo fin = null;


    public boolean colaEsVacia(){
        if (this.inicio == null){
            return true;
        } else { return false;}
    }

    public void encolar(Object dato){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);

        if (this.colaEsVacia()){
            this.inicio = nuevoNodo;
            this.fin = nuevoNodo;
        } else {
            (this.fin).setProximo(nuevoNodo);
            this.fin = nuevoNodo;
        }
    }

    public Object desencolar(){
        if (colaEsVacia()) {
            String retorno = "cola vacia";
            return retorno;
        } else {
            Nodo auxiliar = this.inicio;
            this.inicio = auxiliar.getProximo();
            return auxiliar.getDato();
        }
    }

    public String colaToString(){

        String acumulador = "";
        Cola auxiliar = new Cola();

        if (this.colaEsVacia()){
            acumulador = "Cola vacia";

        } else {

            while(!this.colaEsVacia()){
                Object actual = this.desencolar();
                acumulador += actual + "\n";
                auxiliar.encolar(actual);
            }

            while (!auxiliar.colaEsVacia()){
                Object actual = auxiliar.desencolar();
                this.encolar(actual);
            }
        }
        return acumulador;
    }
}
