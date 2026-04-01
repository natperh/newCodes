import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumadorTest {

    @Test
    public void sumarDosNumeros() {
        Sumador sumador = new Sumador();
        int num1 = 5;
        int num2 = 10;
        int resultadoEsperado = 15;
        int resultadoReal = sumador.sumar(num1, num2);
        assertEquals(resultadoEsperado, resultadoReal);
    }
}