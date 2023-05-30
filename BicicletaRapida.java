/**
 * Write a description of class BicicletaRapida here.
 * 
 * @author Andres Leo y Elena Chacon
 * @version (a version number or a date)
 */
public class BicicletaRapida extends Bicicleta
{
    private double VelocidadExtra;
    
    /**
     * Constructor for objects of class BicicletaNormal
     */
    public BicicletaRapida(String nombre, Peso peso, double VelocidadExtra)
    {
        super (nombre, peso);
        this.VelocidadExtra=VelocidadExtra;
    }
    
    /**
     *  calcular y proporcionar su velocidad cuando es usada por un Ciclista 
     *  en particular en una Etapa en concreto
     *  
     * @param  double habilidadCiclista, double dificultadEtapa
     * @return    double velocidad
     */
    public double calcularVelocidadRapida(double habilidadCiclista, double dificultadEtapa, double VelocidadExtra)
    {
        double velocidad = (habilidadCiclista * 100) / (getValorPeso() * dificultadEtapa);
        velocidad=velocidad+VelocidadExtra;
        return velocidad;
    }
}
