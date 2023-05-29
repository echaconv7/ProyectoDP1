
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
        Equipo EquipoTest1 = new Equipo("Movistar Women", new ComparadorPesoBicicleta(), new ComparadorHabilidadCiclista(), false, false);
        ciclista1 = new Ciclista("Ciclista 1", 0.8, 100, EquipoTest1);
        ciclista2 = new Ciclista("Ciclista 2", 0.9, 120, EquipoTest1);
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
        Etapa etapa1 = new Etapa("Etapa 1", 10, 1);
        Etapa etapa2 = new Etapa("Etapa 2", 15, 2);
        Etapa etapa3 = new Etapa("Etapa 3", 12, 1);
        Etapa etapa4 = new Etapa("Etapa 4", 18, 3);

        ciclista1.hacerCarrera(etapa1);
        ciclista1.hacerCarrera(etapa2);
        ciclista2.hacerCarrera(etapa1);
        ciclista2.hacerCarrera(etapa2);
        ciclista2.hacerCarrera(etapa3);
        ciclista2.hacerCarrera(etapa4);

        double expectedMedia = (ciclista1.calcularTiempoTotal() + ciclista2.calcularTiempoTotal()) / 2;

        double actualMedia = EquipoTest1.calcularMediaTiempo();

        assertEquals(expectedMedia, actualMedia);
    }
    
    
    @Test
    public void enviarSiguienteCiclista (){
        Ciclista actualCiclista=new Ciclista (ciclista1.getNombre(), ciclista1.getHabilidad(),ciclista1.getEnergia(), EquipoTest1);
        assertEquals(ciclista1, actualCiclista);

        Ciclista actualCiclista2=new Ciclista (ciclista2.getNombre(), ciclista2.getHabilidad(),ciclista2.getEnergia(), EquipoTest1);
        assertEquals(ciclista2, actualCiclista);
    }
}
    
