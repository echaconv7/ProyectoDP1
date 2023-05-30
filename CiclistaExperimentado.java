
/**
 * Write a description of class CiclistaExperimentado here.
 * 
 * @author Andres Leo y Elena Chacon
 * @version (a version number or a date)
 */
public class CiclistaExperimentado extends Ciclista
{
    private Equipo equipo;
    /**
     * Constructor for objects of class CiclistaExperimentado
     */
    public CiclistaExperimentado(String nombre, Habilidad habilidad, double energia, Equipo equipo)
    {
        super(nombre, habilidad, energia, equipo);
    }

    /** 
     * Calcula la destreza del ciclista experimentado
     */
    public double CalcularDestrezaExp(double habilidad){
        double destrezaExp = ((getHabilidad() + 4)/130)*10;
        return destrezaExp;
    }
}
