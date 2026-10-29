import java.util.Scanner;
/**
 * Ejercicio 07: "Generar un algoritmo que permita calcular y mostrar el valor a 
 * cancelar de una planilla de luz. Se debe ingresar el valor de costo por 
 * kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario 
 * tiene edad mayor a 65 años, se debe descontar el 10%."
 * @author Gabriel Cueva
 * @version 1.0
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costoLuz, consumoLuz;
        int mayorEdad;
        System.out.print("Ingrese primero el valor del costo kWh, luego su consumo: ");
        costoLuz = tcl.nextDouble();
        consumoLuz = tcl.nextDouble();
        System.out.print("Ingrese su edad: ");
        mayorEdad = tcl.nextInt();
        if (mayorEdad > 65)
            costoLuz = costoLuz * 0.9;
        System.out.println("El valor a cancelar en la planilla de luz será: $" + (costoLuz * consumoLuz));
    }
}
/***
 * EVIDENCIA DEL RUN:
run-single:
Ingrese primero el valor del costo kWh, luego su consumo: 0,30
200
Ingrese su edad: 67
El valor a cancelar en la planilla de luz ser�: $54.0
BUILD SUCCESSFUL (total time: 26 seconds)
 */