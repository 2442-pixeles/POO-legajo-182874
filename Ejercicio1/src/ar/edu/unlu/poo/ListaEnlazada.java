package ar.edu.unlu.poo;

public class ListaEnlazada {

    private Nodo inicio = null;

    public void agregar (Object dato){

        Nodo nodoNuevo = new Nodo();
        nodoNuevo.setDato(dato);

        if (inicio == null){
            inicio = nodoNuevo;
        } else {
            Nodo nodoAux = inicio;
            while (nodoAux.getProximo() != null) {
                nodoAux = nodoAux.getProximo();
            }
            nodoAux.setProximo(nodoNuevo);
        }
    }

    public ListaEnlazada crearLista(){
        ListaEnlazada nuevaLista = new ListaEnlazada();
        return nuevaLista;
    }

    public boolean listaEsVacia (){

        if (this.inicio == null){
            return true;
        } else {
            return false;
        }
    }

    public int listaLongitud (){
        if(this.listaEsVacia()){
            return 0;
        } else {
            int contador = 1;
            Nodo nodoAux = this.inicio;
            while (nodoAux.getProximo() != null) {
                nodoAux = nodoAux.getProximo();
                contador += 1;
            }
            return contador;
        }
    }

    public boolean eliminarElemento (Object dato){
        if (this.listaEsVacia()) {
            return false;
        } else {
            Nodo nodoAux = this.inicio;

            if (nodoAux.getDato() == dato) {
                this.inicio = nodoAux.getProximo();
            } else {
                while (nodoAux.getProximo() != null) {
                    if ( (nodoAux.getProximo()).getDato() == dato ){
                        nodoAux.setProximo( (nodoAux.getProximo()).getProximo() );
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

        if(this.listaEsVacia()){
            return retornoNulo;
        } else {
            int contador = 1;
            Nodo nodoAux = this.inicio;
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
        Nodo nodoNuevo = new Nodo();
        nodoNuevo.setDato(dato);

        if (this.listaEsVacia()){
            this.inicio = nodoNuevo;
            return true;
        }


        if (posicion == 1){
            Nodo auxiliar = this.inicio;
            this.inicio = nodoNuevo;
            nodoNuevo.setProximo(auxiliar);
            return true;
        }


        else {
            int contador = 2;
            Nodo nodoActual = this.inicio;
            while (nodoActual.getProximo() != null) {
                if (contador == posicion){
                    Nodo auxiliar = (nodoActual.getProximo()).getProximo();
                    nodoActual.setProximo(nodoNuevo);
                    nodoNuevo.setProximo(auxiliar);
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





