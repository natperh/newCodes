¡Claro! Aquí te dejo un ejemplo de cómo podrías escribir pruebas JUnit 5 para el código Java que me proporcionaste:
```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumaTest {

    @Test
    public void testSumaPositivos() {
        // Arrange
        int num1 = 2;
        int num2 = 3;
        int resultadoEsperado = 5;

        // Act
        int resultado = Suma.suma(num1, num2);

        // Assert
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testSumaNegativos() {
        // Arrange
        int num1 = -2;
        int num2 = -3;
        int resultadoEsperado = -5;

        // Act
        int resultado = Suma.suma(num1, num2);

        // Assert
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testSumaCero() {
        // Arrange
        int num1 = 0;
        int num2 = 0;
        int resultadoEsperado = 0;

        // Act
        int resultado = Suma.suma(num1, num2);

        // Assert
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testSumaMixto() {
        // Arrange
        int num1 = 2;
        int num2 = -3;
        int resultadoEsperado = -1;

        // Act
        int resultado = Suma.suma(num1, num2);

        // Assert
        assertEquals(resultadoEsperado, resultado);
    }
}
```
En este ejemplo, he creado una clase `SumaTest` que contiene cuatro métodos de prueba:

* `testSumaPositivos`: prueba la suma de dos números positivos.
* `testSumaNegativos`: prueba la suma de dos números negativos.
* `testSumaCero`: prueba la suma de dos ceros.
* `testSumaMixto`: prueba la suma de un número positivo y un número negativo.

En cada método de prueba, se sigue el patrón Arrange-Act-Assert:

* Arrange: se establecen las variables de entrada y el resultado esperado.
* Act: se llama al método `suma` de la clase `Suma` con las variables de entrada.
* Assert: se verifica que el resultado obtenido sea igual al resultado esperado utilizando el método `assertEquals` de JUnit.

Para que esto funcione, debes modificar la clase `Suma` para que tenga un método `suma` que tome dos parámetros `int` y devuelva el resultado de la suma:
```java
public class Suma {
    public static int suma(int num1, int num2) {
        return num1 + num2;
    }
}
```
Espero que esto te sea útil. ¡Si tienes alguna pregunta o necesitas más ayuda, no dudes en preguntar!