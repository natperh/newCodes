import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServicioNegocioTest {

    @Autowired
    private ServicioNegocio servicio;

    @Test
    void cuandoSeSumanDosNumeros() {
        ModeloDominio input = new ModeloDominio(2, 3);
        int expected = 5;
        int actual = servicio.operar(input);
        assertEquals(expected, actual);
    }
}