import java.io.*;
import java.util.*;

public class CobolExample {

    private static final String FILENAME = "usuarios.dat";

    public static void main(String[] args) throws IOException {
        List<Usuario> usuarios = new ArrayList<>();
        loadUsers(usuarios);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("--- MENU CRUD ---");
            System.out.println("1. Create / 2. Read / 3. Update / 4. Delete / 5. Exit");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume el salto de línea

            switch (option) {
                case 1:
                    createUser(usuarios);
                    break;
                case 2:
                    readUsers(usuarios);
                    break;
                case 3:
                    updateUser(usuarios, scanner);
                    break;
                case 4:
                    deleteUser(usuarios, scanner);
                    break;
                case 5:
                    System.out.println("Exiting...);
                    saveUsers(usuarios);
                    return;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    private static void loadUsers(List<Usuario> usuarios) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String line; 
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\s+", 2);
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                usuarios.add(new Usuario(id, name));
            }
        }
    }

    private static void saveUsers(List<Usuario> usuarios) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
            for (Usuario usuario : usuarios) {
                bw.write(usuario.getId() + " " + usuario.getNombre());
                bw.newLine();
            }
        }
    }

    private static void createUser(List<Usuario> usuarios) {
        int id;
        String name;

        System.out.print("ID (4 digits): ");
        if (!(id = readIntFromConsole()) || id > 9999) {
            System.out.println("ID inválido");
            return;
        }
        System.out.print("Nombre: ");
        name = readStringFromConsole(20);

        usuarios.add(new Usuario(id, name));
        System.out.println("Usuario creado");
    }

    private static void readUsers(List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }

    private static void updateUser(List<Usuario> usuarios, Scanner scanner) {
        int id;
        System.out.print("ID para actualizar (4 digits): ");
        if (!(id = readIntFromConsole()) || id > 9999) {
            System.out.println("ID inválido");
            return;
        }
        Usuario usuario = findUserById(usuarios, id);
        if (usuario != null) {
            System.out.print("Nuevo nombre: ");
            String name = readStringFromConsole(20);
            usuario.setNombre(name);
            System.out.println("Usuario actualizado");
        } else {
            System.out.println("Usuario no encontrado");
        }
    }

    private static void deleteUser(List<Usuario> usuarios, Scanner scanner) {
        int id;
        System.out.print("ID para eliminar (4 digits): ");
        if (!(id = readIntFromConsole()) || id > 9999) {
            System.out.println("ID inválido");
            return;
        }
        usuarios.remove(findUserById(usuarios, id));
        if (usuarios.isEmpty()) {
            System.out.println("Todos los usuarios eliminados");
        } else {
            System.out.println("Usuario eliminado");
        }
    }

    private static Usuario findUserById(List<Usuario> usuarios, int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    private static int readIntFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static String readStringFromConsole(int maxLength) {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().substring(0, maxLength);
    }
}

class Usuario {
    private int id;
    private String nombre;

    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuario [ID=" + id + ", Nombre=" + nombre + "]";
    }
}
