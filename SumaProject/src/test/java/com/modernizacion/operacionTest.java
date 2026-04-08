import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestDeServicio {

    @Test
    void operar_debe_retornar_la_suma_de_dos_numeros() {
        // Arreglo la inyección de dependencias
        ServicioNegocio servicio = new ServicioNegocio(new CalculadoraImplementacion());

        ModeloDominio modelo = new ModeloDominio(2, 3);
        int resultadoEsperado = 5;
        int resultadoReal = servicio.operar(modelo);

        assertEquals(resultadoEsperado, resultadoReal);
    }
}