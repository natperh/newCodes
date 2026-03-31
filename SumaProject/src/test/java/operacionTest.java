//SumaTest.java
package com.ejemplo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SumaTest {

	@Test
	void sumar() {
		int num1 = 10;
		int num2 = 20;
		int esperado = 30;
		int resultado = new Suma().sumar(num1, num2);
		assertEquals(esperado, resultado);
	}
}