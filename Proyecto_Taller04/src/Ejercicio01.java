import java.util.Scanner;
/**
 * Ejercicio 01: "Generar un algoritmo que permite calcular y presentar el área de
 * un triángulo. Los datos deben ser pedidos al usuario."
 * @author Gabriel Cueva
 * @version 1.0
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double base, altura, area;
        System.out.print("Deme la base: ");
        base = tcl.nextDouble();
        System.out.print("Deme la altura: ");
        altura = tcl.nextDouble();
        area = (base*altura)/2;
        System.out.println("El área del triángulo es: " + area);
    }
}
/***
 * EVIDENCIA DEL RUN:
run:
Deme la base: 5
Deme la altura: 9
El �rea del tri�ngulo es: 22.5
BUILD SUCCESSFUL (total time: 12 seconds)
 */