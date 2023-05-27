/**
 * Write a description of class Etapa here.
 * 
 * @author Andres Leo y Elena Chacon
 * @version (a version number or a date)
 */
public class Etapa
{
    private String nombre;
    private double dificultad;
    private int distancia;

    /**
     * Constructor for objects of class Etapa
     * @param nombre String es el nombre de la etapa
     * @param dificultad Double mide la dificultad del recorrido
     * @param distancia int son los kilometros a realizar en el recorrido 
     * de la Etapa
     */
    public Etapa()
    {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.distancia = distancia;
    }

    //Metodos modificadores (set)
    /**
     * Asigna el nombre
     * * @param nombre String que especifica el nombre de la etapa
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
     /**
     * Asigna la dificultad
     * @param dificultad Double que especifica la dificultad de la etapa
     */
    public void setDificultad (double dificultad){
        this.dificultad = dificultad;
    }
    
    /**
     * Asigna la distancia
     * @param Int distancia Int que especifica la distancia de la etapa
     */
    public void setDistancia (int distancia){
        this.distancia = distancia;
    }
    
    //M�TODOS DE ACCESO (get)
    /**
     * Devuelve el nombre
     * @return String con el nombre de la etapa
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     * Devuelve la dificultad
     * @return Double con la dificultad del recorrido
     */
    public double getDificultad (){
        return dificultad;
    }
    
    /**
     * Devuelve la distancia
     * @return Int con la distancia recorrida en la etapa
     */
    public int getDistancia () {
        return distancia;
    }
    
    /**
     * Muestra las caracteristicas de etapa
     * @return String que muestra las caracteristicas de la etapa
     */
    public String toString(){
        return "<etapa: " + nombre + "> <dificultad:" + dificultad + "> <distancia: " + distancia + ")>";
    }
    /**Hola*/
}
