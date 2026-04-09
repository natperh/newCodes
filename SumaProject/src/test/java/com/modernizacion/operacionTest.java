import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumadorTest {

    @Test
    public void sumar_dos_numeros() {
        Sumador sumador = new Sumador();
        int num1 = 5;
        int num2 = 10;
        int esperado = 15;
        int resultado = sumador.sumar(num1, num2);
        assertEquals(esperado, resultado);
    }
}