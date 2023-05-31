
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class EquipoTest.
 *
 * @author  Andres Leo y Elena Chacon
 * @version (a version number or a date)
 */
public class EquipoTest
{
    private Equipo EquipoTest1;
    private Ciclista ciclista1;
    private Ciclista ciclista2;
    private Etapa etapa1;
    private Etapa etapa2;
    private Etapa etapa3;
    private Etapa etapa4;
    private Bicicleta bicicleta;
    
    /**
     * Default constructor for test class EquipoTest
     */
    public EquipoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        EquipoTest1 = new Equipo("Movistar Women", new ComparadorPesoBicicleta(), new ComparadorHabilidadCiclista(), false, false);
        ciclista1 = new Ciclista("Ciclista 1", Habilidad.NORMAL, 100, EquipoTest1);
        ciclista2 = new Ciclista("Ciclista 2", Habilidad.BUENA, 120, EquipoTest1);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void getMediaMinutosEquipo (){
        etapa1 = new Etapa("Etapa 1", Dificultad.SENCILLA, Distancia.INTERMEDIA);
        etapa2 = new Etapa("Etapa 2", Dificultad.COMPLEJA, Distancia.LARGA);
        etapa3 = new Etapa("Etapa 3", Dificultad.SENCILLA, Distancia.CORTA);
        etapa4 = new Etapa("Etapa 4", Dificultad.NORMAL, Distancia.INTERMEDIA);
        bicicleta = new Bicicleta ("SCOTT CONTESSA ADDICT 15",Peso.NORMAL);

        ciclista1.hacerCarrera(etapa1);
        ciclista1.hacerCarrera(etapa2);
        ciclista2.hacerCarrera(etapa1);
        ciclista2.hacerCarrera(etapa2);
        ciclista2.hacerCarrera(etapa3);
        ciclista2.hacerCarrera(etapa4);

        if (ciclista1.tieneBicicleta() && ciclista2.tieneBicicleta()){
            double MediaEsperada = (ciclista1.calcularTiempoTotal() + ciclista2.calcularTiempoTotal()) / 2;

            double MediaActual = EquipoTest1.calcularMediaTiempo();
            assertEquals(MediaEsperada, MediaActual);
        }
    }
    
    
    @Test
    public void enviarSiguienteCiclista (){
        Ciclista actualCiclista1=new Ciclista (ciclista1.getNombre(), ciclista1.getHab(),ciclista1.getEnergia(), EquipoTest1);
        assertEquals(ciclista1, actualCiclista1);

        Ciclista actualCiclista2=new Ciclista (ciclista2.getNombre(), ciclista2.getHab(),ciclista2.getEnergia(), EquipoTest1);
        assertEquals(ciclista2, actualCiclista2);
    }
}
    
