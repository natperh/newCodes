## CRUD en COBOL

Este programa COBOL implementa un menú sencillo para realizar operaciones CRUD (Create, Read, Update, Delete) en un archivo de usuarios.

### Secciones del código

- **IDENTIFICATION DIVISION:**
  - PROGRAM-ID: Especifica el identificador del programa.

- **ENVIRONMENT DIVISION:**
  - INPUT-OUTPUT SECTION: Configura el control de archivos.
  - FILE-CONTROL: Selecciona el archivo 'usuarios.dat' y define su organización.

- **DATA DIVISION:**
  - FILE SECTION: Define la estructura del archivo de usuarios.
  - WORKING-STORAGE SECTION: Almacena variables para el menú y la lógica de control.

- **PROCEDURE DIVISION:**
  - MAIN-PROCEDURE: Muestra un menú al usuario y lo mantiene hasta que elige salir.
  - MENU-LOGICA: Lógica del menú, llama a los distintos procedimientos.
  - CREAR-REGISTRO: Añade un nuevo registro al archivo.
  - LEER-REGISTROS: Lee y muestra todos los registros del archivo.


## Escenarios Gherkin

### Crear un nuevo usuario

Para crear un nuevo usuario:

```gherkin
Scenario: Create a new user

Given I am in the main menu
When I choose to create a user
And I provide the user details
Then the user should be created successfully
```

### Leer todos los usuarios

Para leer la lista de usuarios:

```gherkin
Scenario: Read all users

Given I am in the main menu
When I choose to read users
Then I should see all users displayed
```

## Diagrama BPMN

![Diagrama BPMN]('crud-diagram.png')

## Código Java

```java
// Java code for the CRUD operations
import java.io.*;
import java.util.*;

class CRUDExample {

    public static void main(String[] args) {
        // Lógica COBOL aquí...
    }

    // Métodos para abrir, leer y escribir en el archivo
    private static void openFile(String mode) {
        // Lógica para abrir el archivo
    }

    private static void writeUser(String id, String name) {
        // Lógica para escribir el usuario
    }

    private static void readUsers() {
        // Lógica para leer y mostrar usuarios
    }
}
```