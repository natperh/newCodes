## COBOL CRUD Ejemplo

Este programa COBOL implementa un menú simple de CRUD (Create, Read, Update, Delete) para gestionar una base de datos de usuarios.

**Reglas de Negocio:**
- El usuario debe introducir un ID de 4 dígitos para las operaciones de creación, actualización y eliminación.
- El nombre del usuario tiene un máximo de 20 caracteres.
- El programa utiliza un archivo plano (`usuarios.dat`) para almacenar los datos de los usuarios.

**Propósito:**
Proporcionar una demostración básica de cómo se pueden realizar operaciones de CRUD en COBOL utilizando archivos planos.

---

### Flujo de Programa

1. Mostrar menú
2. Obtener la opción del menú
3. Evaluar la opción y ejecutar lógica correspondiente
    - Crear registro: Abre el archivo, escribe un nuevo registro y cierra el archivo
    - Leer registros: Lee todos los registros del archivo hasta que llegue al final y muestra cada uno
    - Salir: Terminar el programa

---