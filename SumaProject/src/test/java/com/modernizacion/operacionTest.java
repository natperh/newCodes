import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class TestDeNegocio {

	@Test
	void suma() {
		assertEquals("El resultado es: 5", new Controlador().suma(2, 3));
	}
}