import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumaServiceTest {

    @Test
    void sumar_cuandoSePasanDosNumeros_debeRetornarSuSuma() {
        SumaService sumaService = new SumaService();
        int resultado = sumaService.sumar(3, 6);
        int esperado = 9;
        assertEquals(esperado, resultado);
    }
}