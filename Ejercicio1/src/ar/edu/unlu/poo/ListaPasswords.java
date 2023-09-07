package ar.edu.unlu.poo;

public class ListaPasswords {
    private String[] lista;
    private int cantidadIteraciones;

    public ListaPasswords(int size){
        setLista(size);
        setCantidadIteraciones(size);
    }



    public void setLista(int size) {
        lista = new String[size];
    }

    public void setCantidadIteraciones(int cantidadIteraciones) {
        this.cantidadIteraciones = cantidadIteraciones;
    }

    public String[] getLista() {
        return lista;
    }

    public int getCantidadIteraciones() {
        return cantidadIteraciones;
    }




    public void generarListaPasswords(){

        for (int i = 0; i < this.getCantidadIteraciones(); i++){
            Password nuevaPass = new Password();
            nuevaPass.generarPassword();

            String fuerteDebil = "";
            if (nuevaPass.esFuerte()){
                fuerteDebil = " Fuerte";
            } else {
                fuerteDebil = " Debil";
            }
            lista[i]="<" + nuevaPass.getPassword() + ">" + " - " + fuerteDebil;
        }
    }

    public String mostar(){
        String acumulador = "";
        for (int i = 0; i < this.getCantidadIteraciones(); i++){
            acumulador += (this.getLista()) [i] + "\n";
        }
        return acumulador;
    }
}
