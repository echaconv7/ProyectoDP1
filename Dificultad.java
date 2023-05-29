


/**
 * Enumeration class Dificultad 
 * 
 * @author Andres Leo y Elena Chacon
 * @version (version number or date here)
 */
public enum Dificultad
{
    SENCILLA ("SENCILLA",0.9),
    NORMAL ("NORMAL",1.0),
    COMPLEJA ("COMPLEJA",1.1);
    
    private final String nombre;
    private final double valorDif;
    
    Dificultad(String nombre, double valorDif){
        this.nombre = nombre;
        this.valorDif = valorDif;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getValorDif(){
        return valorDif;
    }
    
    public String toString(){
        return getNombre() + "(Valor: )" + getValorDif() + ")";
    }
}
