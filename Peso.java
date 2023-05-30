
/**
 * Enumeration class Peso
 * 
 * @author Andres Leo y Elena Chacon
 * @version (version number or date here)
 */
public enum Peso
{
    LIGERA ("LIGERA",7.35),
    NORMAL ("NORMAL",7.50),
    PESADA ("PESADA",7.85);
    
    private final String nombre;
    private final double valorPes;
    
    Peso(String nombre, double valorPes){
        this.nombre = nombre;
        this.valorPes = valorPes;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getValorPes(){
        return valorPes;
    }
    
    public String toString(){
        return getNombre() + "(Valor: )" + getValorPes() + ")";
    }
}
