import java.util.Scanner;
/**
 * Ejercicio 06: "Generar un solución que permita calcular y mostrar el pago 
 * mensual de un préstamo de 1 año de plazo. Se debe ingresar el monto del 
 * préstamo y el interés mensual a cobrar."
 * @author Gabriel Cueva
 * @version 1.0
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double valorPrestamo, valorInteres;
        System.out.print("Ingrese el valor del préstamo: ");
        valorPrestamo = tcl.nextDouble();
        System.out.print("Ingrese el valor a pagar de interés: ");
        valorInteres = tcl.nextDouble();
        System.out.println("El valor a pagar mensualmente será: $" + ((valorPrestamo/12)+valorInteres));
    }
}
/***
 * EVIDENCIA DEL RUN:
run-single:
Ingrese el valor del pr�stamo: 50000
Ingrese el valor a pagar de inter�s: 250
El valor a pagar mensualmente ser�: $4416.666666666667
BUILD SUCCESSFUL (total time: 28 seconds)
 */