import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumaTest {

    @Test
    public void sumaDosNumeros() {
        SumaService service = new SumaService();
        int num1 = 5;
        int num2 = 10;
        int esperado = 15;
        int resultado = service.suma(num1, num2);
        assertEquals(esperado, resultado);
    }
}