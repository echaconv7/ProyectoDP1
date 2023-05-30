
/**
 * Write a description of class BicicletaPrototipo here.
 * 
 * @author Andres Leo y Elena Chacon
 * @version (a version number or a date)
 */
public class BicicletaPrototipo extends Bicicleta
{
    private Ciclista ciclista;
    
    /**
     * Constructor for objects of class BicicletaPrototipo
     */
    public BicicletaPrototipo(String nombre, Peso peso)
    {
        super (nombre, peso);
    }
    
     /**
     *  calcular y proporcionar el tiempo necesario (medido en minutos) para terminar
     *  la Etapa cuando es usada por un Ciclista en particular en una Etapa concreta
     
     * @param  int distanciaEtapa double velocidad
     * @return    double tiempo
     */
    public double calcularTiempo(int distanciaEtapa, double velocidad, double habilidadCiclista)
    {
        double tiempo = distanciaEtapa / (velocidad * habilidadCiclista);
        return tiempo;
    }
}
