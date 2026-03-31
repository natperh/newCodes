import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumadorTest {

    @Test
    void sumaTresNumeros() {
        Sumador sumador = new Sumador();
        int num1 = 5;
        int num2 = 10;
        int num3 = 15;
        int esperado = num1 + num2 + num3;
        
        int resultado = sumador.sumaTresNumeros(num1, num2, num3);
        
        assertEquals(esperado, resultado);
    }
}