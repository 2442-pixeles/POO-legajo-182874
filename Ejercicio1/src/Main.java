import ar.edu.unlu.poo.Cola;
import ar.edu.unlu.poo.Ecuacion;
import ar.edu.unlu.poo.Pila;
import ar.edu.unlu.poo.Tarea;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ///EJERCICIO 3

        Pila nuevapila = new Pila();
        nuevapila.apilar("5");
        nuevapila.apilar("7");
        nuevapila.apilar("9");
        System.out.printf("Mostrando Pila \n");
        System.out.printf(nuevapila.pilaToString());
        nuevapila.desapilar();
        System.out.printf("Mostrando Pila \n");
        System.out.printf(nuevapila.pilaToString());
        System.out.printf("\n");

        ///EJERCICIO 4

        Cola nuevacola = new Cola();
        nuevacola.encolar("5");
        nuevacola.encolar("7");
        nuevacola.encolar("9");
        System.out.printf("Mostrando Cola \n");
        System.out.printf(nuevacola.colaToString());
        nuevacola.desencolar();
        System.out.printf("Mostrando Cola \n");
        System.out.printf(nuevacola.colaToString());
        System.out.printf("\n");

        ///EJERCICIO 5

        Tarea tarea1 = new Tarea("Ir al supermercado mañana","INCOMPLETA", "normal","24-12-2023","dd-MM-yyyy");
        Tarea tarea2 = new Tarea("Consultar repuesto del auto","COMPLETA", "normal","05-09-2023","dd-MM-yyyy");
        Tarea tarea3 = new Tarea("Ir al cine a ver la nueva película de Marvel","INCOMPLETA", "normal","05-09-2023","dd-MM-yyyy");
        System.out.printf(tarea1.mostrarTarea());
        System.out.printf(tarea2.mostrarTarea());
        System.out.printf(tarea3.mostrarTarea());
        System.out.printf("\n");

        ///EJERCICIO 6


        ///EJERCICIO 7

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

        ///EJERCICIO 8
    }
}