
/**
 * Write a description of class CiclistaNovato here.
 * 
 * @author Andres Leo y Elena Chacon
 * @version (a version number or a date)
 */
public class CiclistaNovato extends Ciclista
{
    private Equipo equipo;
    /**
     * Constructor for objects of class CiclistaNovato
     */
    public CiclistaNovato(String nombre, double habilidad, double energia, Equipo equipo)
    {
        super(nombre, habilidad, energia, equipo);
    }

    /** 
     * Calcula la destreza del ciclista novato
     */
    public double CalcularDestrezaNov(double habilidad){
        double destrezaNov = ((habilidad + 2)/120)*10;
        return destrezaNov;
    }
}
