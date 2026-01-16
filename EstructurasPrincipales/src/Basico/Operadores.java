package Basico;

public class Operadores {
    static void main(String[] args) {
        int edad = 21;
        System.out.println(edad);
        edad++;
        System.out.println(edad);
        edad--;
        System.out.println(edad);
        edad+=10;
        System.out.println(edad);

        int num1 = 5;
        double num2 = 2;

        double resultado = num1/num2;
        System.out.println(resultado);

        edad = 22;
        String nombre = "Fernando tiene ";
        System.out.println(nombre +  edad + " años");

        int operador1=5, operador2=4, resultado2=operador1+operador2;

        System.out.println(resultado2);

        //para crear una constante

        final int ejemplo = 20;
        System.out.println(ejemplo);

        //ejemplo = 2; -> error, porque no se puede reasignar un valor


        final double pi = 3.1415;

        int radio = 5;

        double area = pi * radio;
        System.out.println("El área de un círculo es: " + area);
    }
}
