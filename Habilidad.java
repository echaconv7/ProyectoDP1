
/**
 * Enumeration class Habilidad
 * 
 * @author Andres Leo y Elena Chacon
 * @version (version number or date here)
 */
public enum Habilidad
{
    LENTA ("LENTA",4.0),
    NORMAL ("NORMAL",6.0),
    BUENA ("BUENA",8.0);
    
    private final String nombre;
    private final double valorHab;
    
    Habilidad(String nombre, double valorHab){
        this.nombre = nombre;
        this.valorHab = valorHab;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getValorHab(){
        return valorHab;
    }
    
    public String toString(){
        return getNombre() + "(Valor: )" + getValorHab() + ")";
    }
}