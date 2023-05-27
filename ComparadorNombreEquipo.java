
import java.util.Comparator;
/**
 * Compara el nombre de los Equipos, los ordena por orden alfab�tico.
 * 
 * @author Victor
 * @version 15.10
 */
class ComparadorNombreEquipo implements Comparator<Equipo>{
    public int compare(Equipo equipo1, Equipo equipo2){
            return equipo1.getNombre().compareTo(equipo2.getNombre()); 
    }
        }