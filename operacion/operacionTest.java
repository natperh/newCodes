```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SumaTest {

    @Test
    void pruebaSuma() {
        // Arreglo los inputs
        Mockito.when(Mockito.anyInt()).thenReturn(5, 6);
        // Ejecuto el método main
        Suma.main(new String[0]);
        // Assert
        assertEquals(11, resultado);
    }

    // Se asume que el código a prueba está en un método llamado 'calcular'
    private int resultado;
}
```