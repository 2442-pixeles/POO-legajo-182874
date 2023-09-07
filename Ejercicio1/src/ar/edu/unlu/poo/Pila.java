package ar.edu.unlu.poo;

public class Pila {
    private Nodo tope = null;

    public boolean pilaEsVacia (){
        if (this.tope == null){
            return true;
        } else {
            return false;
        }

    }

    public boolean apilar(Object dato){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);
        boolean retorno = false;

        if (this.pilaEsVacia()){
            this.tope = nuevoNodo;
            retorno = true;
        } else {
            Nodo topeViejo = this.tope;
            this.tope = nuevoNodo;
            nuevoNodo.setProximo(topeViejo);
            retorno = true;
        }
        return retorno;
    }

    public Object desapilar(){
        String retornoNulo = new String("Pila vacia/error");

        if (this.pilaEsVacia()){
            return retornoNulo;
        } else {
            Nodo topeViejo = this.tope;
            this.tope = topeViejo.getProximo();

            return  topeViejo.getDato();
        }
    }

    public String pilaToString(){

        String acumulador = "";
        Pila auxiliar = new Pila();

        if (this.pilaEsVacia()){
            acumulador = "Pila vacia";

        } else {

            while(!this.pilaEsVacia()){
                Object actual = this.desapilar();
                acumulador += actual + "\n";
                auxiliar.apilar(actual);
            }

            while (!auxiliar.pilaEsVacia()){
                Object actual = auxiliar.desapilar();
                this.apilar(actual);
            }
        }
        return acumulador;
    }


}
