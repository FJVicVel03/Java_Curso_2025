package Basico;

public class UsoVariables {
    static void main(String[] args) {

        //byte edad;
        //edad = 22;

        byte edad = 22;
        String nombre = "Fernando";

        System.out.println("Hola, soy "+nombre+" y mi edad es " + edad + " años");

        //Uso de var -> si no se declara de la forma establecida abajo, entonces no sabrá que tipo de variable es
        //quedando así, inutil, por lo que, habrá que indicarle de primeras el valor que tiene si se desea usar var
        /*


         */

        var edad2 = 15;
        edad2 = 21;
        System.out.println(edad2);


    }
}

