import ar.edu.unlu.poo.*;

import java.time.LocalDate;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        ///EJERCICIO 3
        System.out.printf("EJERCICIO 3 \n");
        Pila nuevapila = new Pila();
        nuevapila.apilar("5");
        nuevapila.apilar("7");
        nuevapila.apilar("9");
        System.out.printf("Mostrando Pila \n");
        System.out.printf(nuevapila.pilaToString());
        nuevapila.desapilar();
        System.out.printf("Mostrando Pila luego de desapilar 1 elemento\n");
        System.out.printf(nuevapila.pilaToString());
        System.out.printf("\n");




        ///EJERCICIO 4
        System.out.printf("EJERCICIO 4 \n");
        Cola nuevacola = new Cola();
        nuevacola.encolar("5");
        nuevacola.encolar("7");
        nuevacola.encolar("9");
        System.out.printf("Mostrando Cola \n");
        System.out.printf(nuevacola.colaToString());
        nuevacola.desencolar();
        System.out.printf("Mostrando Cola luego de desencolar 1 elemento\n");
        System.out.printf(nuevacola.colaToString());
        System.out.printf("\n");




        ///EJERCICIO 5
        System.out.printf("EJERCICIO 5 \n");
        Tarea tarea1 = new Tarea("Ir al supermercado mañana","INCOMPLETA", "normal","24-12-2023","dd-MM-yyyy");
        Tarea tarea2 = new Tarea("Consultar repuesto del auto","COMPLETA", "normal","05-09-2023","dd-MM-yyyy");
        Tarea tarea3 = new Tarea("Ir al cine a ver la nueva película de Marvel","INCOMPLETA", "normal","05-09-2023","dd-MM-yyyy");
        System.out.printf(tarea1.mostrarTarea());
        System.out.printf(tarea2.mostrarTarea());
        System.out.printf(tarea3.mostrarTarea());
        System.out.printf("\n");




        ///EJERCICIO 6






        ///EJERCICIO 7
        System.out.printf("EJERCICIO 7 \n");
        Ecuacion nuevaEcuacion = new Ecuacion(1,-5,6);  ///Ejemplo con 2 raices
        System.out.printf("Ecuacion 1, a=1,b=-5,c=6 \n");
        System.out.printf(nuevaEcuacion.resolucionEcuacion());
        System.out.printf("\n");

        Ecuacion nuevaEcuacion2 = new Ecuacion(1,2,1);   ///ejemplo con 1 raiz
        System.out.printf("Ecuacion 2, a=1,b=2,c=1 \n");
        System.out.printf(nuevaEcuacion2.resolucionEcuacion());
        System.out.printf("\n");

        Ecuacion nuevaEcuacion3 = new Ecuacion(1,2,2);   ///ejemplo sin raices reales
        System.out.printf("Ecuacion 3, a=1,b=2,c=2 \n");
        System.out.printf(nuevaEcuacion3.resolucionEcuacion());
        System.out.printf("\n");


        Scanner entradaTeclado = new Scanner(System.in);


        ///EJERCICIO 8
        System.out.printf("EJERCICIO 8 \n");

        System.out.print("Por favor, ingrese la cantidad de passwords que quiere generar: ");
        String size = entradaTeclado.nextLine();

        ListaPasswords nueva = new ListaPasswords(Integer.parseInt(size));
        nueva.generarListaPasswords();
        System.out.printf(nueva.mostar()+"\n");




        ///EJERCICIO 9
        System.out.printf("EJERCICIO 9 \n");
        Fechas nuevaCalcu = new Fechas();
        System.out.print("Por favor, ingrese la FECHA con la que quiere operar (formato dd-MM-yyyy o bien MM-dd-yyyy): ");
        String fecha = entradaTeclado.nextLine();
        System.out.print("Por favor, ingrese el FORMATO con el cual ingreso la fecha (dd-MM-yyyy o bien MM-dd-yyyy): ");
        String formato = entradaTeclado.nextLine();

        LocalDate fechaIngresada = nuevaCalcu.parseFecha(fecha,formato);

        LocalDate fechaAnterior = nuevaCalcu.parseFecha("01-01-2023","dd-MM-yyyy");
        LocalDate fechaPosterior = nuevaCalcu.parseFecha("31-12-2023","dd-MM-yyyy");

        System.out.print("La fecha " + fechaIngresada.toString() + " se encuentra entre el "+ fechaAnterior.toString() + " y " + fechaPosterior.toString() + "???   ");
        String resultado = String.valueOf(nuevaCalcu.fechaEntre (fechaIngresada,fechaAnterior,fechaPosterior) );
        System.out.print(resultado + "\n");

        System.out.print("La fecha " + fechaIngresada.toString() + " es mayor a "+ fechaAnterior.toString() + "???   ");
        String resultado1 = String.valueOf(nuevaCalcu.fechaEsMayor (fechaIngresada,fechaAnterior) );
        System.out.print(resultado1+ "\n");

        System.out.print("La fecha " + fechaIngresada.toString() + " es menor a "+ fechaPosterior.toString() + "???   ");
        String resultado2 = String.valueOf(nuevaCalcu.fechaEsMenor (fechaIngresada,fechaPosterior) );
        System.out.print(resultado2+ "\n");


        ///Ejercicio 10
        System.out.printf("EJERCICIO 10 \n");
        System.out.print("Por favor, ingrese la FECHA recordatorio para la tarea (formato dd-MM-yyyy o bien MM-dd-yyyy): ");
        String fechaRecordatorioTarea = entradaTeclado.nextLine();
        System.out.print("Por favor, ingrese el FORMATO con el cual ingreso la fecha (dd-MM-yyyy o bien MM-dd-yyyy): ");
        String formatoRecordatorioTarea = entradaTeclado.nextLine();

        tarea1.establecerRecordatorio(fechaRecordatorioTarea,formatoRecordatorioTarea);
        System.out.printf(tarea1.mostrarTarea());
        System.out.printf("\n");



        ///EJERCICIO 11
        System.out.printf("EJERCICIO 11 \n");
        Diccionario dic1 = new Diccionario();
        dic1.agregarPalabraDiccionario("index");
        dic1.agregarPalabraDiccionario("wxwidgets");
        dic1.agregarPalabraDiccionario("auto");

        Jugador player1 = new Jugador("juan");
        Jugador player2 = new Jugador("carlos");
        player1.agregarPalabra("index",dic1);
        player1.agregarPalabra("wxwidgets",dic1);
        player2.agregarPalabra("auto",dic1);

        int puntaje1 = player1.contarPuntos();
        int puntaje2 = player2.contarPuntos();

        System.out.printf("puntos del jugador 1: " + String.valueOf(puntaje1)+"\n");
        System.out.printf("puntos del jugador 2: " + String.valueOf(puntaje2)+"\n");

        if (puntaje1 > puntaje2) {
            System.out.println("El ganador es el jugador 1 \n");
        } else if (puntaje2 > puntaje1) {
            System.out.println("El ganador es el jugador 2\n" );
        } else {
            System.out.println("Empate\n");
        }












    }
}