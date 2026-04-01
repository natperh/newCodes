import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumadorTest {

    @Test
    public void sumar_dos_numeros() {
        Sumador sumador = new Sumador();
        int resultado = sumador.sumar(10, 20);
        assertEquals(30, resultado);
    }
}