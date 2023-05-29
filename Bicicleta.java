/**
 * La clase Bicicleta representa a las distintas bicicletas 
 * que los Ciclistas pueden usar en las Etapas. 
 * 
 * @author Andres Leo y Elena Chacon
 * @version 
 */
public class Bicicleta
{
    // definicion de campos de la clase Bicicleta
    private String nombre;
    private Peso peso;
    
    /**
     *  Constructor parametrizado de Bicicleta
     */
    public Bicicleta(String nombre, Peso peso)
    {
        this.nombre = nombre;
        setPeso(peso);
    }
    
    //MÉTODOS MODIFICADORES (set)
    /**
     * Asigna el nombre de la bicicleta
     * @param String nombreBici 
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    /**
     * Asigna el peso de la bicicleta
     * @param double pesoBici
     */
    public void setPeso(Peso peso){
        this.peso = peso;
    }
   
    //MÉTODOS DE ACCESO(get)
    /**
     * Devuelve el nombre de la Bicicleta
     * @return String con el nombre de la bicicleta
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Devuelve el nombre del peso de la Bicicleta
     * @return double peso
     */
    public Peso getPeso(){
        return peso;
    }
    
    /**
     * Devuelve el valor peso
     * @return Double con la dificultad del recorrido
     */
    public double getValorPeso (){
        return peso.getValorPes();
    }
    
    
    //OTROS METODOS DE LA CLASE Bicicleta:
    /**
     * Muestra las características de una Bicicleta
     * @return devuelve las características de una Bicicleta
     */    
    public String toString (){
        return "<bicicleta: " + nombre + "> <peso: " + getPeso() + "(Valor: " + getValorPeso() + ")>";
    }
    
    /**
     *  calcular y proporcionar su velocidad cuando es usada por un Ciclista 
     *  en particular en una Etapa en concreto
     *  
     * @param  double habilidadCiclista, double dificultadEtapa
     * @return    double velocidad
     */
    public double calcularVelocidad(double habilidadCiclista, double dificultadEtapa)
    {
        double velocidad = (habilidadCiclista * 100) / (getValorPeso() * dificultadEtapa);
        return velocidad;
    }
    
    /**
     *  calcular y proporcionar el tiempo necesario (medido en minutos) para terminar
     *  la Etapa cuando es usada por un Ciclista en particular en una Etapa concreta
     
     * @param  int distanciaEtapa double velocidad
     * @return    double tiempo
     */
    public double calcularTiempo(int distanciaEtapa, double velocidad)
    {
        double tiempo = (distanciaEtapa / velocidad) * 60;
        return tiempo;
    }
    
    
}