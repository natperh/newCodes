```java
import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int resultado = sumar(num1, num2);
        System.out.println("El resultado es: " + resultado);
    }

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }
}
```