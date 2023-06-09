
import java.util.Comparator;
/**
 * Compara y ordena por la dificultad de 2 Etapas, en orden descendente,
 * y en caso de empate ordena por el nombre.
 * 
 * @author Andres Leo y Elena Chacon
 * @version 15.10
 */
class ComparadorDificultadEtapa implements Comparator<Etapa>{
    public int compare(Etapa etapa1, Etapa etapa2){
            if (etapa1.getValorDificultad() > etapa2.getValorDificultad())
            return 1;
        else if (etapa1.getValorDificultad() < etapa2.getValorDificultad())
            return -1;
            
        //DESEMPATE: ORDENAMOS POR NOMBRE (funci�n .compareTo() especial Strings)
        else
            return etapa1.getNombre().compareTo(etapa2.getNombre());
    }
        }