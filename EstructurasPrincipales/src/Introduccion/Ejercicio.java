package Introduccion;

import java.util.Scanner;

public class Ejercicio {
    static void main(String[] args) {
        //Ejercicio 1
        Scanner entrada = new Scanner(System.in);
        float horas, salario, total;
        System.out.println("Ingresa tus horas semanales: ");
        horas = entrada.nextFloat();
        System.out.println("Ingresa tu salario por hora: ");
        salario = entrada.nextFloat();

        total = horas *salario;
        System.out.println("Tu sueldo corresponde a Q"+total);

        //Ejercicio 2

        float guillermo, luis, juan,sumatoria;

        System.out.println("Cuanto dinero tiene Guillermo?: ");
        guillermo = entrada.nextFloat();
        luis = guillermo/2;
        juan = (guillermo + luis)/2;
        sumatoria = guillermo + juan + luis;

        System.out.println("Guillermo tiene: " + guillermo);
        System.out.println("Luis tiene: " + luis);
        System.out.println("Juan tiene: " + juan);
        System.out.println("Juntos tienen: " + sumatoria);

        //Ejercicio 3
        //Calcular semanas, días y horas

        int horasTotales, semanas, dias, horasRestantes;
        System.out.println("Ingresa el número de horas que has vivido: ");
        horasTotales = entrada.nextInt();
        dias = horasTotales/24;
        semanas = dias/7;
        horasRestantes = horasTotales % 24;
        System.out.println("Has vivido: " + semanas + " semanas");
        System.out.println("Has vivido: " + dias + " días");
        System.out.println("Has vivido: " + horasRestantes + " horas");

    }
}
