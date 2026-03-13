import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

import CobolExample.Usuario;

class CobolExampleTest {

    @Test
    void testCreateUser() throws Exception {
        List<Usuario> usuarios = new ArrayList<>();
        FileWriter writer = Mockito.mock(FileWriter.class);
        CobolExample cobol = new CobolExample();

        cobol.createUser(System.in, writer, usuarios);
        Mockito.verify(writer).write(usuarios.get(0).getId() + "\t" + usuarios.get(0).getName() + "\n");
    }

    @Test
    void testReadUsers() throws Exception {
        List<Usuario> usuarios = List.of(
                new Usuario("1234", "John Doe"),
                new Usuario("5678", "Jane Smith")
        );
        String expectedOutput = "1234\tJohn Doe\n5678\tJane Smith\n";
        FileWriter writer = Mockito.mock(FileWriter.class);
        Mockito.when(writer.write(Mockito.anyString())).thenAnswer(invocation -> {
            String input = invocation.getArgument(0, String.class);
            return input.concat("\n");
        });

        CobolExample cobol = new CobolExample();
        cobol.readUsers(writer, usuarios);
        Mockito.verify(writer).write(expectedOutput);
    }

    @Test
    void testUpdateUser() throws Exception {
        List<Usuario> usuarios = List.of(
                new Usuario("1234", "John Doe")
        );
        CobolExample cobol = new CobolExample();

        try (PrintWriter writer = new PrintWriter(new FileWriter("usuarios.dat"))) {
            writer.write("1234\tJohn Doe\n");
            cobol.updateUser(System.in, writer, usuarios);
            FileReader reader = new FileReader("usuarios.dat");
            char[] buffer = new char[100];
            int charsRead = reader.read(buffer);
            String actualOutput = new String(buffer, 0, charsRead);
            assertEquals("1234\tNew Name\n", actualOutput);
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }
}
