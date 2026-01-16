package Introduccion;

import java.util.Scanner;

public class Introduccion {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite un número: ");
        numero = entrada.nextInt();
        System.out.println("Su número es: " + numero);

        float numero1, numero2, suma;
        System.out.print("Digite dato 1: ");
        numero1 = entrada.nextFloat();
        System.out.print("Digite dato 2: ");
        numero2 = entrada.nextFloat();

        suma = numero1 + numero2;

        System.out.println("La suma es: " + suma);

        String nombre;
        System.out.print("Ingresa tu nombre: ");
        nombre = entrada.next();
        System.out.println("Hola, " + nombre);

        char letra;
        System.out.println("Escribe una letra: ");
        letra = entrada.next().charAt(0);
        System.out.println("Letra: " + letra);

    }
}
