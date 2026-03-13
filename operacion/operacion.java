import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = getIntInput(scanner, "Introduce el primer número:");
        int num2 = getIntInput(scanner, "Introduce el segundo número:");

        int resultado = num1 + num2;
        System.out.println("El resultado es: " + resultado);
    }

    private static int getIntInput(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextInt();
    }
}
