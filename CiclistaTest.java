

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CiclistaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CiclistaTest
{
    private Ciclista CiclistaTest1;
    private Equipo dSMWomen;
    private Etapa etapa1;
    private Etapa etapa2;
    /**
     * Default constructor for test class CiclistaTest
     */
    public CiclistaTest()
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
        Equipo dSMWomen = new Equipo("DSM Women", new ComparadorPesoBicicleta(), new ComparadorEnergiaCiclista(), false, false);
        CiclistaTest1= new Ciclista ("WIEBES",  4.97, 1190,dSMWomen);
        Etapa etapa1= new Etapa("Etapa 1", 0.7, 50);
        Etapa etapa2= new Etapa("Etapa 2", 0.6, 60);
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
    public void correr (Etapa etapa){
        Bicicleta bicicleta = new Bicicleta ("Bicicleta1", 10);
        CiclistaTest1.setBicicleta (bicicleta);
        
        double velocidadEsperada=bicicleta.calcularVelocidad (CiclistaTest1.getHabilidad(), etapa1.getDificultad());
        double tiempoEsperado = bicicleta.calcularTiempo (etapa.getDistancia(), velocidadEsperada);
        
        assertEquals (71, velocidadEsperada, 0.5);
        assertEquals (42.25, tiempoEsperado, 0.5);
        
    }
    
    @Test
    public void getTotalMinutosEnCarrerasTerminadas() {
        double tiempoTotalEsperado = CiclistaTest1.obtenerTiempoEtapa (etapa1)+CiclistaTest1.obtenerTiempoEtapa (etapa2);
        double tiempoTotalObtenido = CiclistaTest1.calcularTiempoTotal();
        assertEquals (tiempoTotalEsperado, tiempoTotalObtenido);
    }
}
