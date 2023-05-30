import java.util.Comparator;
/**
 * Compara el peso de dos Bicicletas, ordena descendentemente por su peso
 * y en caso de empate ordena por el nombre.
 * 
 * @author Andres Leo y Elena Chacon
 * @version 15.10
 */
class ComparadorPesoBicicleta implements Comparator<Bicicleta>{
    public int compare(Bicicleta bicicleta1, Bicicleta bicicleta2){
            if (bicicleta1.getValorPeso() > bicicleta2.getValorPeso())
            return 1; // PRIMERO > SEGUNDO
        else if (bicicleta1.getValorPeso() < bicicleta2.getValorPeso())
            return -1; // SEGUNDO > PRIMERO
            
        //DESEMPATE: ORDENAMOS POR NOMBRE (función .compareTo() especial strings)
        else
            return bicicleta1.getNombre().compareTo(bicicleta2.getNombre()); 
    }
        }
