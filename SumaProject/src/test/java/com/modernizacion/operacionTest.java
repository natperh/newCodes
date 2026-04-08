import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import ModernizacionCobolApplication.Calculadora;

class CalculadoraTest {

    @Test
    void cuandoSumarDosNumeros_debeRetornarSuma() {
        Calculadora calculadora = new CalculadoraImplementacion();
        int resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado);
    }
}