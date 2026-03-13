## CRUD en COBOL

Este programa COBOL implementa un menú sencillo para realizar operaciones CRUD (Create, Read, Update, Delete) en un archivo de usuarios.

---

### Menú

El menú muestra las siguientes opciones:

- Crear registro
- Leer registros
- Actualizar registro
- Borrar registro
- Salir

Cada opción se asocia a un número que se ingresa por teclado.

---

### Secciones del código

**IDENTIFICATION DIVISION:**
Define el identificador del programa.

**ENVIRONMENT DIVISION:**
Especifica la configuración de entrada/salida.

**FILE-CONTROL:**
Selecciona y configura el archivo 'usuarios.dat'.

**DATA DIVISION:**
Describe la estructura de los archivos y del área de trabajo.

**WORKING-STORAGE SECTION:**
Almacena datos temporales y flags de control.

**PROCEDURE DIVISION:**
Contiene el flujo de trabajo principal y las lógica de menú.

**MAIN-PROCEDURE:**
Muestra el menú y lo ejecuta hasta que se selecciona la opción de salida.

**MENU-LOGICA:**
Lógica del menú, según la opción muestra los registros, los crea, actualiza o borra.

**CREAR-REGISTRO, LEER-REGISTROS:**
Operaciones para crear, leer y mostrar registros de usuario.

---

### Especificaciones

- Formato de archivo: Cada registro tiene un ID de 4 dígitos y un nombre de 20 caracteres.
- El programa termina cuando se selecciona la opción 'Salir'.
- No se realiza validación alguna del input del usuario.

---