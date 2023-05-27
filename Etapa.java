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
}
