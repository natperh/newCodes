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
        ModeloDominio modelo = new ModeloDominio(2, 3);
        int esperado = 5;
        int resultado = servicio.operar(modelo);
        assertEquals(esperado, resultado);
    }
}