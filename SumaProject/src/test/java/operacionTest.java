import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SumaControllerTest {

    @Test
    void suma_deberia_sumar_dos_numeros() {
        int num1 = 5;
        int num2 = 10;
        int esperado = 15;
        int resultado = new SumaController().suma(num1, num2);
        assertEquals(esperado, resultado);
    }
}