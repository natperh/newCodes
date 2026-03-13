import java.io.*;
import java.util.*;

public class CrudExample {
    private static final String FILENAME = "usuarios.dat";

    public static void main(String[] args) {
        try {
            Files.createFile(new File(FILENAME).toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        CrudExample app = new CrudExample();
        app.run();
    }

    private void run() {
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();

        try (PrintWriter writer = new PrintWriter(new FileWriter(FILENAME))) {
            while (!exit) {
                displayMenu();
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume la entrada de la nueva línea

                switch (choice) {
                    case 1:
                        createRecord(scanner, writer);
                        break;
                    case 2:
                        readRecords(writer, usuarios);
                        break;
                    case 3:
                        updateRecord(scanner, writer, usuarios);
                        break;
                    case 4:
                        deleteRecord(scanner, writer, usuarios);
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void displayMenu() {
        System.out.println("--- MENU CRUD ---");
        System.out.println("1. Crear / 2. Leer / 3. Actualizar / 4. Borrar / 5. Salir");
    }

    private void createRecord(Scanner scanner, PrintWriter writer) {
        System.out.print("ID (4 digitos): ");
        int id = scanner.nextInt();
        System.out.print("Nombre: ");
        String name = scanner.nextLine();
        Usuario usuario = new Usuario(id, name);
        usuarios.add(usuario);
        writer.println(usuario);
    }

    private void readRecords(PrintWriter writer, ArrayList<Usuario> usuarios) throws IOException {
        writer.write("--- Registros ---");
        for (Usuario usuario : usuarios)
            writer.println(usuario);
        writer.write("----");
    }

    private void updateRecord(Scanner scanner, PrintWriter writer, ArrayList<Usuario> usuarios) {
        System.out.print("ID a actualizar (4 digitos): ");
        int id = scanner.nextInt();
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                System.out.print("Nuevo nombre: ");
                String name = scanner.nextLine();
                usuario.setName(name);
                writer.println(usuario);
                break;
            }
        }
    }

    private void deleteRecord(Scanner scanner, PrintWriter writer, ArrayList<Usuario> usuarios) {
        System.out.print("ID a borrar (4 digitos): ");
        int id = scanner.nextInt();
        Iterator<Usuario> iterator = usuarios.iterator();
        while (iterator.hasNext()) {
            Usuario usuario = iterator.next();
            if (usuario.getId() == id) {
                iterator.remove();
                writer.println("Borrado: " + usuario);
                break;
            }
        }
    }

    static class Usuario {
        private int id;
        private String name;

        Usuario(int id, String name) {
            this.id = id;
            this.name = name;
        }

        int getId() { return id; }

        String getName() { return name; }

        void setName(String name) { this.name = name; }

        @Override
        public String toString() {
            return id + " - " + name;
        }
    }
}
