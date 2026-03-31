import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;
import suma.SumaController;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SumaControllerTest {

    @Test
    void cuandoSeSumanDosNumeros() {
        SumaController controller = new SumaController();
        int result = controller.suma(3, 5);
        assertEquals(8, result);
    }
}