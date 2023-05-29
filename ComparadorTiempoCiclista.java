
import java.util.Comparator;
/**
 * Compara y ordena el tiempo de 2 Ciclistas para la ultima etapa realizada, por orden descendente
 * y en caso de empate ordena por el nombre.
 * 
 * @author Andres Leo y Elena Chacon
 * @version 1
 */
public class ComparadorTiempoCiclista implements Comparator<Ciclista>{
    public int compare(Ciclista ciclista1, Ciclista ciclista2){
            if (ciclista1.getTiempoEtapa() > ciclista2.getTiempoEtapa())
            return 1;
        else if (ciclista1.getTiempoEtapa() < ciclista2.getTiempoEtapa())
            return -1;
            
        //DESEMPATE: ORDENAMOS POR NOMBRE (función .compareTo() especial Strings)
        else
            return ciclista1.getNombre().compareTo(ciclista2.getNombre());
    } 
}