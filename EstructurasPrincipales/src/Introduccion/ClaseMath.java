package Introduccion;

import java.util.Scanner;

public class ClaseMath {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double raiz = Math.sqrt(100);

        int raiz2 = (int) Math.sqrt(121);
        System.out.println(raiz);
        System.out.println(raiz2);

        double base = 4, exponente = 2, resultado;

        resultado = Math.pow(base, exponente);
        System.out.println(resultado);

        float numero = 5.69f;
        resultado = Math.round(numero);
        System.out.println(resultado);

        double aleatorio;
        aleatorio = Math.random();
        System.out.println(aleatorio);

    }
}
