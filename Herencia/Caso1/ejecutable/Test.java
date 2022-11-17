package ejecutable;

import javax.swing.JOptionPane;
import modelo.Suma;
import modelo.Resta;

public class Test {
    public static void main(String[] args) {
        /// Entrada de datos
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x: "));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de y: "));
    

    /// Creacion de un objeto suma

    Suma miSuma = new Suma(x,y);
    miSuma.Sumar();
    JOptionPane.showMessageDialog(null, "La suma de " + x + " y " + y + " es: " + miSuma.mostrarResultado());
    
    Resta miResta = new Resta(x,y);
    miResta.Restar();
    JOptionPane.showMessageDialog(null, "La resta de " + x + " y " + y + " es: " + miResta.mostrarResultado());
    System.exit(0);
    }
}
