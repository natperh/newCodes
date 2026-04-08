import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumadorTest {

    @Test
    void sumaDosNumeros() {
        Sumador sumador = new Sumador();
        int num1 = 5;
        int num2 = 10;
        int resultadoEsperado = 15;
        int resultadoReal = sumador.suma(num1, num2);
        assertEquals(resultadoEsperado, resultadoReal);
    }
}