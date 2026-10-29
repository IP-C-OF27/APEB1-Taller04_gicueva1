import java.util.Scanner;
/**
 * Ejercicio 03: "Se desea desarrollar un algoritmo que permita mostrar la tabla 
 * de multiplicar de un número ingresado por el usuario; solo en el caso que el 
 * valor del número esté entre 2 y 6. No use aún, ciclos repetitivos."
 * @author Gabriel Cueva
 * @version 1.0
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int valor;
        System.out.print("Ingrese un valor del 2 al 6: ");
        valor = tcl.nextInt();
        if (valor >= 2 && valor <= 6){
            System.out.println(valor + " * 1 = " + (valor * 1));
            System.out.println(valor + " * 2 = " + (valor * 2));
            System.out.println(valor + " * 3 = " + (valor * 3));
            System.out.println(valor + " * 4 = " + (valor * 4));
            System.out.println(valor + " * 5 = " + (valor * 5));
            System.out.println(valor + " * 6 = " + (valor * 6));
            System.out.println(valor + " * 7 = " + (valor * 7));
            System.out.println(valor + " * 8 = " + (valor * 8));
            System.out.println(valor + " * 9 = " + (valor * 9));
            System.out.println(valor + " * 10 = " + (valor * 10));
            System.out.println(valor + " * 11 = " + (valor * 11));
            System.out.println(valor + " * 12 = " + (valor * 12));
        }            
    }
}
/***
 * EVIDENCIA DEL RUN:
run:
Ingrese un valor del 2 al 6: 3
3 * 1 = 3
3 * 2 = 6
3 * 3 = 9
3 * 4 = 12
3 * 5 = 15
3 * 6 = 18
3 * 7 = 21
3 * 8 = 24
3 * 9 = 27
3 * 10 = 30
3 * 11 = 33
3 * 12 = 36
BUILD SUCCESSFUL (total time: 3 seconds)
 */