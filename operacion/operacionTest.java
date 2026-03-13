```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SumaTest {

    @Test
    void pruebaSuma() {
        // Arreglo los inputs
        Mockito.when(Mockito.anyInt()).thenReturn(5, 3);
        // Ejecuto el método main
        Suma.main(new String[0]);
        // Assert
        assertEquals(8, resultado);
    }

    // Atributo estático mockeado
    private static int resultado;
}
```