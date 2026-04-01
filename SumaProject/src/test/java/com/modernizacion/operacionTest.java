import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumadorTest {

    @Test
    public void sumaDosNumeros() {
        Sumador sumador = new Sumador();
        int resultado = sumador.suma(10, 20);
        assertEquals(30, resultado);
    }
}