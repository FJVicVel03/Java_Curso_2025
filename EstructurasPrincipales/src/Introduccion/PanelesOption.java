package Introduccion;

import javax.swing.*;

public class PanelesOption {
    static void main(String[] args) {
        String cadena;
        int entero;
        double decimal;
        char caracter;

        cadena = JOptionPane.showInputDialog("Digita tu cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digita un entero: "));
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digita un decimal: "));
        caracter = JOptionPane.showInputDialog("Digita una letra").charAt(0);

        JOptionPane.showMessageDialog(null, "La cadena es:" + cadena);
        JOptionPane.showMessageDialog(null, "El numero entero es: " + entero);
        JOptionPane.showMessageDialog(null, "El decimal es: " + decimal);
        JOptionPane.showMessageDialog(null, "La letra es: " + caracter);
    }
}
