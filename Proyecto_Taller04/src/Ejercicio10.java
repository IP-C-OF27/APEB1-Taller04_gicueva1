import java.util.Scanner;
/**
 * Ejercicio 10: "El programa debe calcular el área del polígono. La figura se 
 * compone de un cuadrado perfecto (A), tres triángulos rectángulos iguales 
 * (B, C, E), cuya base mide lo mismo que uno de los lados del cuadrado, y un 
 * rectángulo (D) cuyo ancho mide lo mismo que uno de los lados del cuadrado, 
 * mientras que la altura mide lo mismo que la altura de los triángulos. Se pide 
 * que haga un programa que calcule el área total.
* Por cultura general, sabemos que el área de un rectángulo se calcula 
* multiplicando su base por su altura; el área de un triángulo rectángulo se 
* calcula multiplicando su base por su altura, y luego dividiendo el resultado 
* entre dos; finalmente, el área de un cuadrado se calcula elevando al cuadrado 
* la medida de uno de sus lados."
 * @author Gabriel Cueva
 * @version 1.0
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double baseTri, alturaTri, areaTri, areaRec, areaCuad, areaTotal;
        System.out.println("Ingrese los siguientes datos en orden");
        System.out.print("Base del Triangulo, Altura del Triangulo: ");
        baseTri = tcl.nextDouble();
        alturaTri = tcl.nextDouble();
        areaTri = baseTri * alturaTri / 2;
        areaRec = baseTri * alturaTri;
        areaCuad = baseTri*baseTri;
        areaTotal = (3*areaTri) + areaRec + areaCuad;
        System.out.println("El area total del polígono es: " + areaTotal);
    }
}
/***
 * EVIDENCIA DEL RUN:
run-single:
Ingrese los siguientes datos en orden
Base del Triangulo, Altura del Triangulo: 5 2,5
El area total del pol�gono es: 56.25
BUILD SUCCESSFUL (total time: 5 seconds)
 */