

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


/**
 * The test class CiclistaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
@ExtendWith(EtapaParameterResolver.class)
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
        CiclistaTest1= new Ciclista ("WIEBES",  Habilidad.LENTA, 1190,dSMWomen);
        Etapa etapa1= new Etapa("Etapa 1", Dificultad.SENCILLA, Distancia.CORTA);
        Etapa etapa2= new Etapa("Etapa 2", Dificultad.NORMAL, Distancia.LARGA);
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
    public void correr (Etapa etapa1){
        Bicicleta bicicleta = new Bicicleta ("Bicicleta1", Peso.LIGERA);
        CiclistaTest1.setBicicleta (bicicleta);
        
        double velocidadEsperada=bicicleta.calcularVelocidad (CiclistaTest1.getHabilidad(), etapa1.getValorDificultad());
        double tiempoEsperado = bicicleta.calcularTiempo (etapa1.getValorDistancia(), velocidadEsperada);
        
        assertEquals (60, velocidadEsperada, 0.5);
        assertEquals (149, tiempoEsperado, 0.5);
        
    }
    
    @Test
    public void getTotalMinutosEnCarrerasTerminadas() {
        double tiempoTotalEsperado = CiclistaTest1.obtenerTiempoEtapa (etapa1)+CiclistaTest1.obtenerTiempoEtapa (etapa2);
        double tiempoTotalObtenido = CiclistaTest1.calcularTiempoTotal();
        assertEquals (tiempoTotalEsperado, tiempoTotalObtenido);
    }
}
