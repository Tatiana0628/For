import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int estadocivil = 0;
        float edad = 0;
        float estatura = 0;
        int sexo = 0;
        float promedioedad = 0;
        float promedioestatura = 0;
        float porcentajepersonas = 0;
        int contadorpersonas = 0;
        float acumuladoredad = 0;
        float acumulardorestatura = 0;
        int cantidadpersonas = 2; 

        for (int numeroPersonas = 1; numeroPersonas <= cantidadpersonas; numeroPersonas++) {
            System.out.print("Ingrese la edad de la persona " + numeroPersonas + ": ");
            edad = scanner.nextFloat();
            System.out.print("Ingrese el estado civil de la persona " + numeroPersonas + " (1. Soltero  2. Casado): ");
            estadocivil = scanner.nextInt();
            System.out.print("Ingrese la estatura de la persona " + numeroPersonas + " en cms: ");
            estatura = scanner.nextFloat();
            System.out.print("Ingrese el sexo de la persona " + numeroPersonas + " (1. Hombre  2. Mujer): ");
            sexo = scanner.nextInt();

            if ((edad >= 18) && (estadocivil == 1) && (estatura > 170) && (sexo == 1)) {
                contadorpersonas++;
                acumuladoredad += edad;
                acumulardorestatura += estatura;
            }
        }

        if (contadorpersonas > 0) {
            promedioedad = acumuladoredad / contadorpersonas;
            promedioestatura = acumulardorestatura / contadorpersonas;
            porcentajepersonas = (contadorpersonas / (float) cantidadpersonas) * 100;

            System.out.println("El promedio de edad de las personas que cumplen es: " + promedioedad + " años");
            System.out.println("El promedio de estatura de las personas que cumplen es: " + promedioestatura + " centímetros");
            System.out.println("El porcentaje de personas que cumplen es: " + porcentajepersonas + " %");
        } else {
            System.out.println("Ninguna persona cumple con los criterios establecidos.");
        }

        scanner.close(); 
}
 }
