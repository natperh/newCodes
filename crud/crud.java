import java.io.*;
import java.util.*;

public class CrudExample {

    private static final String FILENAME = "usuarios.dat";
    private static final int ID_SIZE = 4;
    private static final int NAME_SIZE = 20;

    public static void main(String[] args) throws Exception {
        CrudExample crud = new CrudExample();
        crud.run();
    }

    void run() throws Exception {
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
        PrintWriter writer = new PrintWriter(new FileWriter(FILENAME));

        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume el salto de línea

            switch (choice) {
                case 1:
                    createRecord(scanner, writer);
                    break;
                case 2:
                    readRecords(reader);
                    break;
                case 3:
                    updateRecord(scanner, reader, writer);
                    break;
                case 4:
                    deleteRecord(scanner, reader, writer);
                    break;
                case 5:
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("Opción inválida");
            }

            writer.flush();
            if (choice == 5) break;
        }

        scanner.close();
        reader.close();
        writer.close();
    }

    void showMenu() {
        System.out.println("--- MENU CRUD ---");
        System.out.println("1. Crear / 2. Leer / 3. Actualizar / 4. Borrar / 5. Salir");
    }

    void createRecord(Scanner scanner, PrintWriter writer) {
        System.out.print("ID (4 digitos): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume el salto de línea
        System.out.print("Nombre: ");
        String name = scanner.nextLine();
        writeRecord(writer, id, name);
    }

    void readRecords(BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }

    void updateRecord(Scanner scanner, BufferedReader reader, PrintWriter writer) throws IOException {
        System.out.print("ID para actualizar (4 digitos): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume el salto de línea
        reader.skip(id - 1 * ID_SIZE);
        String currentName = reader.readLine().substring(ID_SIZE, ID_SIZE + NAME_SIZE);
        System.out.print("Nuevo nombre: ");
        String newName = scanner.nextLine();
        writeRecord(writer, id, newName);
    }

    void deleteRecord(Scanner scanner, BufferedReader reader, PrintWriter writer) throws IOException {
        System.out.print("ID para eliminar (4 digitos): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume el salto de línea
        reader.skip(id - 1 * ID_SIZE);
        writer.write(");
        writer.flush();
    }

    void writeRecord(PrintWriter writer, int id, String name) {
        writer.printf("%04d%20s%n", id, name);
    }
}
