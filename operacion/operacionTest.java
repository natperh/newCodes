```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SumaTest {
    private Suma suma;
    private Scanner scanner;

    @BeforeEach
    void setUp() {
        suma = new Suma();
        scanner = Mockito.mock(Scanner.class);
    }

    @Test
    @DisplayName("Suma dos números positivos")
    void testSumarPositivos() {
        Mockito.when(scanner.nextInt()).thenReturn(2, 3);
        int resultado = suma.sumar(scanner);
        assertEquals(5, resultado);
    }

    @Test
    @DisplayName("Suma un número negativo y uno positivo")
    void testSumarNegativoPositivo() {
        Mockito.when(scanner.nextInt()).thenReturn(-2, 5);
        int resultado = suma.sumar(scanner);
        assertEquals(3, resultado);
    }

    @Test
    @DisplayName("Suma dos números negativos")
    void testSumarNegativos() {
        Mockito.when(scanner.nextInt()).thenReturn(-2, -3);
        int resultado = suma.sumar(scanner);
        assertEquals(-5, resultado);
    }
}
```