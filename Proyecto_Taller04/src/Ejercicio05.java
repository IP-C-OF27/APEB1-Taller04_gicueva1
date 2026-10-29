import java.util.Scanner;
/**
 * Ejercicio 05: "Generar un algoritmo que permita calcular y mostrar el costos 
 * de una computadora de escritorio. La misma es comprada por partes; CPU, 
 * teclado, pantalla, ratón."
 * @author Gabriel Cueva
 * @version 1.0
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double cpu, teclado, pantalla, mouse, costoTotal;
        System.out.print("Ingrese los valores de CPU, teclado, pantalla y mouse: ");
        cpu = tcl.nextDouble();
        teclado = tcl.nextDouble();
        pantalla = tcl.nextDouble();
        mouse = tcl.nextDouble();
        costoTotal = cpu + teclado + pantalla + mouse;
        System.out.println("El valor final de su computador será: $" + costoTotal);
    }
}
/***
 * EVIDENCIA DEL RUN:
run:
Ingrese los valores de CPU, teclado, pantalla y mouse: 130
30
129,50
45,25
El valor final de su computador ser�: $334.75
BUILD SUCCESSFUL (total time: 21 seconds)
 */