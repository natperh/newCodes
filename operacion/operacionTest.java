```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SumaTest {

    private Suma suma;
    private static final int NUM1 = 5;
    private static final int NUM2 = 10;

    @BeforeEach
    void setUp() {
        suma = new Suma();
    }

    @Test
    @DisplayName("Suma dos números")
    void testSumar() {
        int resultado = suma.sumar(NUM1, NUM2);
        assertEquals(15, resultado, "No suma correctamente");
    }

}
```