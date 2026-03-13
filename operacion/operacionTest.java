import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Scanner;

class SumaTest {

    @Test
    public void testSuma() {
        Scanner scanner = Mockito.mock(Scanner.class);
        Mockito.when(scanner.nextInt()).thenReturn(3, 4);
        int resultado = new Suma().main(new String[0]);
        assertEquals(7, resultado);
    }

    @Test
    public void testSumaNegativos() {
        Scanner scanner = Mockito.mock(Scanner.class);
        Mockito.when(scanner.nextInt()).thenReturn(-5, -2);
        int resultado = new Suma().main(new String[0]);
        assertEquals(-7, resultado);
    }
}
