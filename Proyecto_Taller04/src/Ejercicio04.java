import java.util.Scanner;
/**
 * Ejercicio 04: "Generar un algoritmo que permita calcular y mostrar el valor de 
 * la planilla de teléfono de un casa. Se debe ingresar el costo por minutos, el
 * número de minutos consumidos en el mes."
 * @author Gabriel Cueva
 * @version 1.0
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costoMin, consumoMes, total;
        System.out.print("Ingrese el costo por minuto: ");
        costoMin = tcl.nextDouble();
        System.out.print("Ingrese los minutos de consumo: ");
        consumoMes = tcl.nextDouble();
        total = costoMin * consumoMes;
        System.out.println("El consumo total del mes son: $" + total);
    }
}
/***
 * EVIDENCIA DEL RUN:
run:
Ingrese el costo por minuto: 0,5
Ingrese los minutos de consumo: 84
El consumo total del mes son: $42.0
BUILD SUCCESSFUL (total time: 10 seconds)
 */