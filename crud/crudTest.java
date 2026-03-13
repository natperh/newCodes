import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.io.*;
import java.util.Scanner;

class CrudEjemploTest {

    private CrudEjemplo crud;
    private final String FILE_NAME = "usuarios.dat";
    private final int ID_USER_SIZE = 4;
    private final int NOMBRE_USER_SIZE = 20;

    @BeforeEach
    void setUp() {
        crud = new CrudEjemplo();
        deleteFile();
    }

    private void deleteFile() {
        try {
            File file = new File(FILE_NAME);
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e) {}
    }

    @Test
    @DisplayName("Crear registro")
    void createRecordTest() throws Exception {
        Mockito.lenient.when(crud.new Scanner(Mockito.any())).thenReturn(new Scanner("1234
Nombre
"));
        crud.createRecord();
        assertTrue(new File(FILE_NAME).exists());
        assertContent("1234Nombre");
    }

    @Test
    @DisplayName("Leer registros - Vacío")
    void readRecordsEmptyFileTest() throws Exception {
        Mockito.lenient.when(crud.new Scanner(Mockito.any())).thenReturn(new Scanner("
"));
        crud.readRecords();
        Mockito.verify(crud, Mockito.times(1)).printMessage("No hay registros.");
    }

    @Test
    @DisplayName("Leer registros - Con contenido")
    void readRecordsWithContentTest() throws Exception {
        String content = "1234Nombre
4321Otro nombre
";
        writeContentToFile(content);
        Mockito.lenient.when(crud.new Scanner(Mockito.any())).thenReturn(new Scanner(content));
        crud.readRecords();
        assertContent(content);
    }

    private void assertContent(String expectedContent) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
        String actualContent;
        while ((actualContent = reader.readLine()) != null) {
            String[] expectedLine = expectedContent.split("\n")[0];
            String[] actualLine = actualContent.split("\n")[0];
            assertEquals(expectedLine, actualLine);
            expectedContent = expectedContent.substring(expectedLine.length() + 1);
        }
    }

    private void writeContentToFile(String content) throws Exception {
        try (PrintWriter writer = new PrintWriter(FILE_NAME)) {
            writer.print(content);
        }
    }

    @Test
    @DisplayName("Opciones de menú")
    void menuOptionsTest() {
        assertEquals(1, crud.new MenuLogic().showMenu(), "Opción del menú incorrecta");
    }
}
