/*
 * CRUDExample.java
 *
 * Creado el: 03/13/26
 *
 * Implementación en Java del programa COBOL mostrado.
 *
 */

import java.io.*;
import java.util.*;

public class CRUDExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = null;
        String line;
        String[] tokens;
        PrintWriter writer = new PrintWriter(System.out);

        try {
            reader = new BufferedReader(new FileReader("usuarios.dat"));

            while (true) {
                displayMenu(writer);
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consumir salto de línea

                switch (choice) {
                    case 1:
                        createUser(scanner, writer);
                        break;
                    case 2:
                        readUsers(reader, writer);
                        break;
                    case 3:
                        // Actualizar usuario
                        break;
                    case 4:
                        // Eliminar usuario
                        break;
                    case 5:
                        writer.println("Saliendo... Adiós!");
                        break;
                    default:
                        writer.println("Opción inválida. Por favor, elija de nuevo.");
                }

                writer.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                scanner.close();
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void displayMenu(PrintWriter writer) {
        writer.println("--- MENU CRUD ---
1. Crear
2. Leer
3. Actualizar
4. Borrar
5. Salir

Elija una opción: ");
    }

    private static void createUser(Scanner scanner, PrintWriter writer) {
        writer.print("ID (4 dígitos): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        writer.print("Nombre: ");
        String name = scanner.nextLine();

        try (PrintWriter fw = new PrintWriter("usuarios.dat", true)) {
            fw.printf("%04d%s", id, name);
        } catch (Exception e) {
            writer.println("Error al crear el usuario.");
        }

        writer.println("Usuario creado.");
    }

    private static void readUsers(BufferedReader reader, PrintWriter writer) {
        String user;
        while ((line = reader.readLine()) != null) {
            writer.println(line);
        }

        writer.println("Fin de los usuarios.");
    }
}
