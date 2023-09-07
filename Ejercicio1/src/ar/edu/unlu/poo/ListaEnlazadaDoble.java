package ar.edu.unlu.poo;

public class ListaEnlazadaDoble {

    private NodoEnlazadoDoble inicio = null;

    public void agregarEnlazada (Object dato){

        NodoEnlazadoDoble nodoNuevo = new NodoEnlazadoDoble();
        nodoNuevo.setDato(dato);

        if (inicio == null){
            inicio = nodoNuevo;
        } else {
            NodoEnlazadoDoble nodoAux = inicio;
            while (nodoAux.getProximo() != null) {
                nodoAux = nodoAux.getProximo();
            }
            nodoAux.setProximo(nodoNuevo);
            nodoNuevo.setAnterior(nodoAux);
        }
    }

    public ListaEnlazadaDoble crearListaEnlazada(){
        ListaEnlazadaDoble nuevaLista = new ListaEnlazadaDoble();
        return nuevaLista;
    }

    public boolean listaEnlazadaEsVacia (){

        if (this.inicio == null){
            return true;
        } else {
            return false;
        }
    }

    public int listaEnlazadaLongitud (){
        if(this.listaEnlazadaEsVacia()){
            return 0;
        } else {
            int contador = 1;
            NodoEnlazadoDoble nodoAux = this.inicio;
            while (nodoAux.getProximo() != null) {
                nodoAux = nodoAux.getProximo();
                contador += 1;
            }
            return contador;
        }
    }

    public boolean eliminarElementoEnlazada (Object dato){
        if (this.listaEnlazadaEsVacia()) {
            return false;
        } else {
            NodoEnlazadoDoble nodoAux = this.inicio;

            if (nodoAux.getDato() == dato) {
                this.inicio = nodoAux.getProximo();
                nodoAux.setAnterior(null);
            } else {
                while (nodoAux.getProximo() != null) {
                    if ( (nodoAux.getProximo()).getDato() == dato ){
                        nodoAux.setProximo( (nodoAux.getProximo()).getProximo() );
                        (nodoAux.getProximo()).setAnterior(nodoAux);
                        return true;
                    }
                    else {
                        nodoAux = nodoAux.getProximo();
                    }
                }
            }
        }
        return false;
    }

    public Object recuperarElemento (int posicion){
        String retornoNulo = new String("lista vacia/error");

        if(this.listaEnlazadaEsVacia()){
            return retornoNulo;
        } else {
            int contador = 1;
            NodoEnlazadoDoble nodoAux = this.inicio;
            while (nodoAux.getProximo() != null) {
                if (contador == posicion){
                    return nodoAux.getDato();
                } else {
                    nodoAux = nodoAux.getProximo();
                    contador += 1;
                }
            }
        }
        return retornoNulo;
    }

    public boolean insertarElemento (Object dato, int posicion){
        NodoEnlazadoDoble nodoNuevo = new NodoEnlazadoDoble();
        nodoNuevo.setDato(dato);

        if (this.listaEnlazadaEsVacia()){
            this.inicio = nodoNuevo;
            return true;
        }


        if (posicion == 1){
            NodoEnlazadoDoble auxiliar = this.inicio;
            this.inicio = nodoNuevo;
            nodoNuevo.setProximo(auxiliar);
            auxiliar.setAnterior(nodoNuevo);
            return true;
        }


        else {
            int contador = 2;
            NodoEnlazadoDoble nodoActual = this.inicio;
            while (nodoActual.getProximo() != null) {
                if (contador == posicion){
                    NodoEnlazadoDoble auxiliar = (nodoActual.getProximo()).getProximo(); //me traigo el proximo del proximo
                    nodoActual.setProximo(nodoNuevo); //nodo actual es el anterior a la posicion que quiero insertar, al proximo de actual le asigno el nuevo
                    nodoNuevo.setAnterior(nodoActual);
                    nodoNuevo.setProximo(auxiliar);
                    auxiliar.setAnterior(nodoNuevo);
                    return true;

                } else {
                    nodoActual = nodoActual.getProximo();
                    contador += 1;
                }
            }
        }
        return false;
    }



}