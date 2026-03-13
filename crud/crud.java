import java.io.*;
import java.util.*;

public class CrudEjemplo {

    private static final String FILE_NAME = "usuarios.dat";
    private static final int ID_USER_SIZE = 4;
    private static final int NOMBRE_USER_SIZE = 20;

    public static void main(String[] args) {
        CrudEjemplo crud = new CrudEjemplo();
        crud.run();
    }

    private void run() {
        MenuLogic menu = new MenuLogic();
        int option = 0;
        do {
            option = menu.showMenu();
            switch (option) {
                case 1:
                    createRecord();
                    break;
                case 2:
                    readRecords();
                    break;
                case 5:
                    System.out.println("Saliendo...);
                    break;
            }
        } while (option != 5);
    }

    private void createRecord() {
        InputOutput io = new InputOutput();
        idUser = Integer.parseInt(io.readString(ID_USER_SIZE));
        nombreUser = io.readString(NOMBRE_USER_SIZE);
        try (PrintWriter writer = new PrintWriter(FILE_NAME, "append")) {
            writer.println(idUser + nombreUser);
        }
        catch (IOException ex) {
            System.err.println("Error al escribir en el archivo:", ex.getMessage());
        }
    }

    private void readRecords() {
        InputOutput io = new InputOutput();
        boolean hasRecords = true;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            hasRecords = false;
        } catch (IOException ex) {
            System.err.println("Error al leer el archivo:", ex.getMessage());
        }
        if (!hasRecords) {
            System.out.println("No hay registros.");
        }
    }

    private int idUser;
    private String nombreUser;

    private class MenuLogic {
        private final int MENU_OPTION_CREATE = 1;
        private final int MENU_OPTION_READ = 2;
        private final int MENU_OPTION_EXIT = 5;

        public int showMenu() {
            System.out.println("--- MENU CRUD ---");
            System.out.println("1. Crear / 2. Leer / 4. Borrar / 5. Salir");
            return Integer.parseInt(new InputOutput().readString(1));
        }
    }

    private class InputOutput {
        private final Scanner scanner = new Scanner(System.in);

        public String readString(int size) {
            scanner.useDelimiter("[^A-Za-z0-9]|
");
            return scanner.next().trim();
        }

        public int readInt() {
            return Integer.parseInt(readString(1));
        }

        public void printMessage(String message) {
            System.out.println(message);
        }
    }
}
