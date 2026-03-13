import java.io.*;
import java.util.*;

public class CobolExample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        String[] words;

        List<Usuario> usuarios = new ArrayList<>();

        try (PrintWriter writer = new PrintWriter(new FileWriter("usuarios.dat"))) {
            while (true) {
                System.out.println("--- MENU CRUD ---");
                System.out.println("1. Create / 2. Read / 3. Update / 4. Delete / 5. Exit");
                System.out.print("Enter your option: ");
                line = reader.readLine();

                int option = Integer.parseInt(line);
                switch (option) {
                    case 1:
                        createUser(reader, writer, usuarios);
                        break;
                    case 2:
                        readUsers(writer, usuarios);
                        break;
                    case 3:
                        updateUser(reader, writer, usuarios);
                        break;
                    case 4:
                        // Implement delete logic here
                        break;
                    case 5:
                        System.out.println("Exiting...);
                        writer.close();
                        return;
                    default:
                        System.out.println("Invalid option");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createUser(BufferedReader reader, PrintWriter writer, List<Usuario> usuarios) throws IOException {
        System.out.print("Enter ID (4 digits): ");
        String idInput = reader.readLine();

        if (idInput.length() != 4) {
            System.out.println("Invalid ID length.");
            return;
        }

        System.out.print("Enter name: ");
        String nameInput = reader.readLine();

        if (nameInput.length() > 20) {
            System.out.println("Name too long.");
            return;
        }

        Usuario usuario = new Usuario(idInput, nameInput);
        usuarios.add(usuario);
        writer.println(usuario.getId() + "	" + usuario.getName());
    }

    private static void readUsers(PrintWriter writer, List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            writer.println(usuario.getId() + "	" + usuario.getName());
        }
    }

    private static void updateUser(BufferedReader reader, PrintWriter writer, List<Usuario> usuarios) throws IOException {
        System.out.print("Enter ID to update: ");
        String idInput = reader.readLine();

        if (idInput.length() != 4) {
            System.out.println("Invalid ID length.");
            return;
        }

        Usuario usuario = findUserById(usuarios, idInput);
        if (usuario != null) {
            System.out.print("Enter new name: ");
            String nameInput = reader.readLine();
            if (nameInput.length() <= 20) {
                usuario.setName(nameInput);
                writer.println(usuario.getId() + "	" + usuario.getName());
            } else {
                System.out.println("Name too long.");
            }
        } else {
            System.out.println("User not found.");
        }
    }

    private static Usuario findUserById(List<Usuario> usuarios, String id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        return null;
    }

    static class Usuario {
        private String id;
        private String name;

        Usuario(String id, String name) {
            this.id = id;
            this.name = name;
        }

        String getId() { return id; }

        String getName() { return name; }

        void setName(String name) { this.name = name; }
    }
}
