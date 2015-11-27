package pedir_datos;

import javax.swing.JOptionPane;

public class Metodos {

    public static String datoString(String dato) {
        return (JOptionPane.showInputDialog(dato));
    }

    public static float datoFloat(String dato) {
        return (Float.parseFloat(JOptionPane.showInputDialog(dato)));
    }
}
