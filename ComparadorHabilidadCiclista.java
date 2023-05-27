import java.util.Comparator;
/**
 * Compara y ordena 2 ciclistas seg�n su habilidad, por orden descendente
 * y en caso de empate ordena por el nombre.
 * 
 * @author Andres Leo y Elena Chacon
 * @version 1
 */
public class ComparadorHabilidadCiclista implements Comparator<Ciclista>{
    public int compare(Ciclista ciclista1, Ciclista ciclista2){
            if (ciclista1.getHabilidad() > ciclista2.getHabilidad())
            return 1;
        else if (ciclista1.getHabilidad() < ciclista2.getHabilidad())
            return -1;
            
        //DESEMPATE: ORDENAMOS POR NOMBRE (funci�n .compareTo() especial Strings)
        else
            return ciclista1.getNombre().compareTo(ciclista2.getNombre());
    } 
}
