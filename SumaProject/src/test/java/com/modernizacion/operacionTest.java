import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

@SpringBootTest
class ModernizacionCOBOLApplicationTests {

    @Test
    void contextoSeInicializaCorrectamente() {
        assertEquals(0, new ModuloNegocio(new CalculadoraImplementacion()).suma(2, 3));
    }
}