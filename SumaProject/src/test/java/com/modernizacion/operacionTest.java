import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import modernizacion.cobol.DatosSuma;
import modernizacion.cobol.Controlador;

class ControladorTest {

    @Test
    void suma_deberia_retornar_resultado_correcto() {
        // Arrange
        Controlador controlador = new Controlador();
        DatosSuma datos = new DatosSuma(5, 3);

        // Act
        String respuesta = controlador.suma(datos);

        // Assert
        assertEquals("El resultado es 8", respuesta);
    }

    @Test
    void suma_con_valores_negativos_deberia_funcionar() {
        // Arrange
        Controlador controlador = new Controlador();
        DatosSuma datos = new DatosSuma(-5, 10);

        // Act
        String respuesta = controlador.suma(datos);

        // Assert
        assertEquals("El resultado es 5", respuesta);
    }
}