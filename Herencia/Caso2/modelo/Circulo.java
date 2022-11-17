package modelo;

public class Circulo extends Figura{

    /// -----------
    /// Constructor 
    /// -----------
    private double r;

    public Circulo(double r){
        this.r = r;
    }

    /// -------
    /// Metodos
    /// -------
    public double HallarPerimetroCirculo(){
        perimetro = 2 * Math.PI * r;
        return perimetro;
    }

    public double HallarAreaCirculo(){
        area = Math.PI * r * r;
        return area;
    }
    
}
