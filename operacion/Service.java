Aquí te dejo la traducción del código COBOL a Java:
```java
import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        // Variables
        int num1;
        int num2;
        int resultado;

        // Pedir primer número
        System.out.print("Introduce el primer número: ");
        num1 = Integer.parseInt(System.console().readLine());

        // Pedir segundo número
        System.out.print("Introduce el segundo número: ");
        num2 = Integer.parseInt(System.console().readLine());

        // Realizar suma
        resultado = num1 + num2;

        // Mostrar resultado
        System.out.println("El resultado es " + resultado);
    }
}
```
Aquí te explico las diferencias clave entre el código COBOL y el código Java:

* En Java, no hay una sección `IDENTIFICATION DIVISION` equivalente. En su lugar, el nombre del programa se especifica en la línea `public class Suma`.
* En Java, las variables se declaran con su tipo explícito (`int` en este caso), mientras que en COBOL se utilizan las palabras clave `PIC` y `9(4)` para especificar el tipo y la longitud de los campos.
* En Java, no hay una sección `DATA DIVISION` equivalente. En su lugar, las variables se declaran directamente en el código.
* En Java, la lectura de la entrada del usuario se realiza mediante `System.console().readLine()`, mientras que en COBOL se utiliza la instrucción `ACCEPT`.
* En Java, la suma se realiza mediante el operador `+`, mientras que en COBOL se utiliza la instrucción `ADD`.
* En Java, la salida se realiza mediante `System.out.println()`, mientras que en COBOL se utiliza la instrucción `DISPLAY`.

Espero que esto te sea útil. ¡Si tienes alguna pregunta o necesitas más ayuda, no dudes en preguntar!