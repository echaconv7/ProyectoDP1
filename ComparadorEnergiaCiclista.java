
import java.util.Comparator;
/**
 * Compara y ordena la energia de 2 Ciclistas, por orden descendente
 * y en caso de empate ordena por el nombre.
 * 
 * @author Andres Leo y Elena Chacon
 * @version 1
 */
public class ComparadorEnergiaCiclista implements Comparator<Ciclista>{
    public int compare(Ciclista ciclista1, Ciclista ciclista2){
            if (ciclista1.getEnergia() > ciclista2.getEnergia())
            return 1;
        else if (ciclista1.getEnergia() < ciclista2.getEnergia())
            return -1;
            
        //DESEMPATE: ORDENAMOS POR NOMBRE (funci�n .compareTo() especial Strings)
        else
            return ciclista1.getNombre().compareTo(ciclista2.getNombre());
    } 
}
