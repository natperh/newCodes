## COBOL CRUD ejemplo

Este programa COBOL implementa un menú simple de CRUD (Create, Read, Update, Delete) para gestionar una base de datos de usuarios.

**Reglas de Negocio:**
- El usuario debe introducir un ID de 4 dígitos para las operaciones de creación, lectura y actualización.
- El nombre del usuario tiene un máximo de 20 caracteres.
- El archivo de datos `usuarios.dat` se guarda en formato secuencial por líneas.

**Propósito:**
Proporcionar una demostración básica de cómo se pueden realizar operaciones de CRUD en COBOL utilizando archivos de datos.

---

### Flujo del programa

1. Mostrar menú
2. Obtener la opción del usuario
3. Realizar la acción correspondiente
    - Crear: Pedir ID y nombre, escribir en el archivo
    - Leer: Mostrar todos los registros
    - Actualizar: Pedir ID e nuevo nombre, actualizar el registro
    - Borrar: No implementado en este ejemplo
4. Repetir el menú hasta que el usuario elija salir
5. Terminar el programa

---