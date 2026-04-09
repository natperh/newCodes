import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumaTest {

    @Test
    public void sumarDosNumeros() {
        SumaService sumaService = new SumaService();
        int num1 = 5;
        int num2 = 10;
        int esperado = 15;
        int resultado = sumaService.sumar(num1, num2);
        assertEquals(esperado, resultado);
    }
}