import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumaTest {

    @Test
    void sumaDosNumeros() {
        // Arrange
        int num1 = 5;
        int num2 = 10;
        int esperado = 15;

        // Act
        int resultado = ModernizacionCOBOLApplication.suma(num1, num2);

        // Assert
        assertEquals(esperado, resultado);
    }
}