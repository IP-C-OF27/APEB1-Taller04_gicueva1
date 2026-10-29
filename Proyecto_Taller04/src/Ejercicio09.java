import java.util.Scanner;
/**
 * Ejercicio 09: "Desarrolle una solución que determine el estado académico de 
 * una persona estudiante en una asignatura universitaria a partir de una 
 * calificación de evaluación continua, una calificación de examen final y un 
 * porcentaje de asistencia. La regla institucional establece que:
* La asistencia mínima debe alcanzarse para ser evaluado
* Existe una nota mínima en el examen final, y
* La nota final se calcula combinando evaluación continua y examen final.
* La salida debe indicar “Aprobado”, “Supletorio” o “Reprobado”, y mostrar la 
* nota final redondeada a un decimal."
 * @author Gabriel Cueva
 * @version 1.0
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double evaCont, evaFinal, notaFinal;
        int asistencia;
        String estado;
        System.out.print("Ingrese sus asistencias (100 total): ");
        asistencia = tcl.nextInt();
        if (asistencia >= 70){
            System.out.print("Ingrese su nota en la evaluación continua: ");
            evaCont = tcl.nextDouble();
            System.out.print("Ingrese su nota en el examen final: ");
            evaFinal = tcl.nextDouble();
            notaFinal = (evaCont+evaFinal)/2;
            if (evaFinal >= 7) {
                estado = "Aprobado";
                if (notaFinal < 7)
                    estado = "Supletorio";
            }
            else
                estado = "Reprobado";
            System.out.println("Tu calificación final es: " + notaFinal);
            System.out.println("Su estado de aprobación es: " + estado);
        }
        else{
            estado = "Reprobado";
            System.out.println("No cumples con la asistencia mínima, por lo que no fuiste evaluado.");
            System.out.println("Su estado de aprobación es: " + estado);
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
run-single:
Ingrese sus asistencias (100 total): 90
Ingrese su nota en la evaluaci�n continua: 5
Ingrese su nota en el examen final: 7,5
Tu calificaci�n final es: 6.25
Su estado de aprobaci�n es: Supletorio
BUILD SUCCESSFUL (total time: 18 seconds)
 */