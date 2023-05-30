
/**
 * Write a description of class CiclistaEstrella here.
 * 
 * @author Andres Leo y Elena Chacon
 * @version (a version number or a date)
 */
public class CiclistaEstrella extends Ciclista
{
    private Equipo equipo;
    private int SerPopular;
    /**
     * Constructor for objects of class CiclistaEstrella
     */
    public CiclistaEstrella(String nombre, Habilidad habilidad, double energia, Equipo equipo)
    {
        super(nombre, habilidad, energia, equipo);
        this.SerPopular=6;
    }

    /** 
     * Calcula la destreza del ciclista estrella
     */
    public double CalcularDestrezaExp(double habilidad){
        double destrezaEst = ((getHabilidad() + 6)/140)*10;
        return destrezaEst;
    }
    
    /**
     * Calcula la popularidad de un Ciclista Estrella tras cada etapa
     */
    
    public int Popularidad (int SerPopular, double energia){
        if (getTiempoEtapa() < 160 && energia > 0){
            SerPopular= SerPopular+4;
        }
        else{
            SerPopular=SerPopular-1;
        }
        return SerPopular;
    }
}
