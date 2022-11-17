package ejecutable;

import javax.swing.JOptionPane;
import modelo.Rectangulo;
import modelo.Circulo;


public class Test {
    public static void main(String[] args) {
        /// Entrada de datos
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la altura: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la base: "));
        double r = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del radio: "));

    /// Creacion de un objeto rectangulo

    Rectangulo miRectangulo = new Rectangulo(a,b);
    miRectangulo.HallarAreaRectangulo();
    JOptionPane.showMessageDialog(null, "El área del rectangulo con altura " + a + " y base " + b + " es: " + miRectangulo.HallarAreaRectangulo());

    miRectangulo.HallarPerimetroRectangulo();
    JOptionPane.showMessageDialog(null, "El perimetro del rectangulo con altura " + a + " y base " + b + " es: " + miRectangulo.HallarPerimetroRectangulo());

    Circulo miCirculo = new Circulo(r);
    miCirculo.HallarAreaCirculo();
    JOptionPane.showMessageDialog(null, "El área del circulo con radio " + r + " es: " + miCirculo.HallarAreaCirculo());

    miCirculo.HallarPerimetroCirculo();
    JOptionPane.showMessageDialog(null, "El perimetro del circulo con radio " + r + " es: " + miCirculo.HallarPerimetroCirculo());

    System.exit(0);
    }
}
