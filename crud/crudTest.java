import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class CobolExampleTest {

    private static final String FILENAME = "usuarios.dat";

    @Test
    void testCRUDOperations() throws Exception {
        List<Usuario> usuarios = new ArrayList<>();
        CobolExample app = Mockito.spy(new CobolExample());

        // Crear usuarios
        app.createUser(usuarios);
        assertEquals(1, usuarios.size());
        Usuario user1 = usuarios.get(0);
        assertEquals(1234, user1.getId());
        assertEquals("Pepe", user1.getNombre());

        // Leer usuarios
        List<Usuario> loadedUsers = new ArrayList<>();
        app.readUsers(loadedUsers);
        assertEquals(1, loadedUsers.size());
        assertEquals(user1, loadedUsers.get(0));

        // Actualizar usuario
        app.updateUser(usuarios, null);
        assertEquals("Pepi", usuarios.get(0).getNombre());

        // Eliminar usuario
        app.deleteUser(usuarios, null);
        assertTrue(usuarios.isEmpty());
    }

    @Test
    void testInvalidInput() throws Exception {
        List<Usuario> usuarios = new ArrayList<>();
        CobolExample app = Mockito.spy(new CobolExample());

        Mockito.doReturn(-1).when(app).readIntFromConsole();
        app.createUser(usuarios);
        Mockito.verify(app).readIntFromConsole();
        Mockito.verifyNoMoreInteractions(app);

        Mockito.doReturn("").when(app).readStringFromConsole(Mockito.anyInt());
        app.updateUser(usuarios, null);
        Mockito.verify(app).readStringFromConsole(Mockito.eq(20));
        Mockito.verifyNoMoreInteractions(app);
    }

    @Test
    void testLoadSaveUsers() throws Exception {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario(1234, "Pepe"));
        usuarios.add(new Usuario(5678, "Juan"));

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
            app.saveUsers(usuarios);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String line = br.readLine();
            assertNotNull(line);
            Usuario loadedUser = new Usuario(0, "");
            loadedUser.setId(Integer.parseInt(line.substring(0, 4)));
            loadedUser.setNombre(line.substring(5));
            assertEquals(usuarios.get(0), loadedUser);

            line = br.readLine();
            assertNotNull(line);
            loadedUser = new Usuario(0, "");
            loadedUser.setId(Integer.parseInt(line.substring(0, 4)));
            loadedUser.setNombre(line.substring(5));
            assertEquals(usuarios.get(1), loadedUser);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private CobolExample app;
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
        return "Usuario{id=" + id + ", nombre='" + nombre + "'}";
    }
}
