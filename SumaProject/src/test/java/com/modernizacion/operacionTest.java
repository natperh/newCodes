import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.web.context.WebApplicationContext;
import java.util.Integer;

@SpringBootTest
class SumaApplicationTests {

    @Test
    void contextLoads(WebApplicationContext webApplicationContext) {
        assertNotNull(webApplicationContext);
    }

    @Test
    void testSuma() {
        int num1 = 5;
        int num2 = 10;
        int esperado = 15;
        int resultado = new SumaApplication().suma(num1, num2);
        assertEquals(esperado, resultado);
    }
}