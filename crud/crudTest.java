import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.io.*;
import java.util.Scanner;

class CrudExampleTest {

    private CrudExample crud;
    private Scanner scannerMock;
    private BufferedReader readerMock;
    private PrintWriter writerMock;
    private File file;

    @BeforeEach
    void setup() throws Exception {
        crud = new CrudExample();
        scannerMock = Mockito.mock(Scanner.class);
        readerMock = Mockito.mock(BufferedReader.class);
        writerMock = Mockito.mock(PrintWriter.class);
        file = new File(CrudExample.FILENAME);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    @DisplayName("Testear creación de registro")
    void testCreateRecord() throws Exception {
        Mockito.when(scannerMock.nextInt()).thenReturn(1234);
        Mockito.when(scannerMock.nextLine()).thenReturn("Mi nombre");
        crud.createRecord(scannerMock, writerMock);
        Mockito.verify(writerMock).printf("%04d%20s%n", 1234, "Mi nombre");
    }

    @Test
    @DisplayName("Testear lectura de registros")
    void testReadRecords() throws Exception {
        String record1 = "1234   Juan";
        String record2 = "5678   Maria";
        writeRecordsToFile(record1, record2);
        crud.readRecords(readerMock);
        Mockito.verify(readerMock).readLine();
        Mockito.verify(readerMock).readLine();
    }

    @Test
    @DisplayName("Testear actualización de registro")
    void testUpdateRecord() throws Exception {
        String record1 = "1234   Juan";
        writeRecordsToFile(record1);
        Mockito.when(scannerMock.nextInt()).thenReturn(1234, 5);
        Mockito.when(scannerMock.nextLine()).thenReturn("Nuevo nombre", "");
        crud.updateRecord(scannerMock, readerMock, writerMock);
        Mockito.verify(readerMock).skip(20);
        Mockito.verify(writerMock).printf("%04d%20s%n", 1234, "Nuevo nombre");
    }

    @Test
    @DisplayName("Testear eliminación de registro")
    void testDeleteRecord() throws Exception {
        String record1 = "1234   Juan";
        writeRecordsToFile(record1);
        Mockito.when(scannerMock.nextInt()).thenReturn(1234);
        crud.deleteRecord(scannerMock, readerMock, writerMock);
        Mockito.verify(readerMock).skip(20);
        Mockito.verify(writerMock).write(");
    }

    void writeRecordsToFile(String... records) throws Exception {
        try (PrintWriter writer = new PrintWriter(new FileWriter(CrudExample.FILENAME))) {
            for (String record : records) {
                writer.println(record);
            }
        }
    }
}
