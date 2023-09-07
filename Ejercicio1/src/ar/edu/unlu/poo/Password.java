package ar.edu.unlu.poo;

import java.util.Random;

public class Password {
    private String password;
    private int longitud;

    public Password() {
        this.longitud = 8;
        generarPassword();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    public String generarPassword() {
        Random random = new Random();
        char[] caracteres =  "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
        String cadena = "";

        for (int i = 0; i < this.getLongitud(); i++) {
            int indice = random.nextInt(caracteres.length);
            char caracter = caracteres[indice];
            cadena += caracter;
        }

        this.setPassword(cadena);
        String resultado = "pass: " + this.getPassword() + " longitud: " + this.getLongitud();
        return resultado;
    }

    public boolean esFuerte() {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        char[] caracteres = (this.getPassword()).toCharArray();

        for (int i=0 ; i < (caracteres.length); i++) {
            if (Character.isUpperCase(caracteres[i])){
                mayusculas++;
            } else if (Character.isLowerCase(caracteres[i])) {
                minusculas++;
            } else if (Character.isDigit(caracteres[i])) {
                numeros++;
            }
        }

        return mayusculas > 2 && minusculas > 1 && numeros >= 2;
    }


}