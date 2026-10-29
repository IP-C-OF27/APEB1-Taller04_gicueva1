import java.util.Scanner;
/**
 * Ejercicio 02: "Generar un algoritmo que permite ingresar los gastos de tres
 * hijos de un padre de familia; calcular y mostrar el total de gastos de los 
 * hijos del padre de familia."
 * @author Gabriel Cueva
 * @version 1.0
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double hijo1, hijo2, hijo3, gastoTotal;
        System.out.print("Ingrese los gastos de cada hijo: ");
        hijo1 = tcl.nextDouble();
        hijo2 = tcl.nextDouble();
        hijo3 = tcl.nextDouble();
        gastoTotal = hijo1 + hijo2 + hijo3;
        System.out.println("El gasto total de los hijos es: $" + gastoTotal);
    }
}
/***
 * EVIDENCIA DEL RUN:
run:
Ingrese los gastos de cada hijo: 47
84,25
143
El gasto total de los hijos es: $274.25
BUILD SUCCESSFUL (total time: 7 seconds)
 */