package Introduccion;

import javax.swing.*;
import java.util.Scanner;

public class Operadores {

    static void main(String[] args) {
        float numero1, numero2;
        float suma, resta, multiplicacion;
        float division, resto;

        Scanner entrada = new Scanner(System.in);

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digita el número 1: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digita el número 2: "));

        suma = numero1 + numero2; resta = numero1 - numero2; multiplicacion = numero1 * numero2; division = numero1/numero2; resto = numero1%numero2;

        JOptionPane.showMessageDialog(null, "La suma es: " + suma + " La resta es: " + resta
        + " La multiplicación es: " + multiplicacion + " La division es: " + division + " El resto es: " + resto);

    }

}
