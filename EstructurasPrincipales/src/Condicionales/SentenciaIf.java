package Condicionales;

import javax.swing.*;

public class SentenciaIf {
    static void main() {
        /*Estructura if
        * if(condición){
        * Instrucciones que se ejecutan si la condición es verdadera
        * } else {
        * Instrucciones que se ejecutan si la condición es falsa
        * }
        * */

        int numero, gato = 5;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número entero: "));
        if (numero == gato)
        {
            JOptionPane.showMessageDialog(null, "El número es igual a 5");
        }else {
            JOptionPane.showMessageDialog(null, "El número no es igual a 5");
        }
    }
}
