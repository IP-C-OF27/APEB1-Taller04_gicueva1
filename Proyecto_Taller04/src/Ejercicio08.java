import java.util.Scanner;
/**
 * Ejercicio 08: "Se debe generar una solución que permita calcular y mostrar el 
 * valor total a pagar mensual de servicios digitales de una persona. Los 
 * servicios digitales son: netflix, youtube premium, dropbox, spotify. Si la 
 * persona es menor a 30 años se descuenta el 20% del total mensual."
 * @author Gabriel Cueva
 * @version 1.0
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double netflix, yt, drpbx, spotify, costoTotal;
        int edad;
        System.out.println("Ingrese los precios por mes de las siguientes plataformas:");
        System.out.print("Netflix, YouTube Premium, DropBox, Spotify: ");
        netflix = tcl.nextDouble();
        yt = tcl.nextDouble();
        drpbx = tcl.nextDouble();
        spotify = tcl.nextDouble();
        System.out.println("Ingrese su edad: ");
        edad = tcl.nextInt();
        costoTotal = netflix + yt + drpbx + spotify;
        if (edad<30)
            costoTotal = costoTotal*0.8;
        System.out.println("El costo total por sus servicios es: $" + costoTotal);
    }
}
/***
 * EVIDENCIA DEL RUN:
run-single:
Ingrese los precios por mes de las siguientes plataformas:
Netflix, YouTube Premium, DropBox, Spotify: 5,99 7,99 9,99 6,99
Ingrese su edad: 
29
El costo total por sus servicios es: $24.768
BUILD SUCCESSFUL (total time: 25 seconds)
 */