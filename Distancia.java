
/**
 * Enumeration class Distancia
 * 
 * @author Andres Leo y Elena Chacon
 * @version (version number or date here)
 */
public enum Distancia
{
    CORTA ("CORTA",150),
    INTERMEDIA ("INTERMEDIA",200),
    LARGA ("LARGA",225);
    
    private final String nombre;
    private final int valorDis;
    
    Distancia(String nombre, int valorDis){
        this.nombre = nombre;
        this.valorDis = valorDis;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getValorDis(){
        return valorDis;
    }
    
    public String toString(){
        return getNombre() + "(Valor: )" + getValorDis() + ")";
    }
}