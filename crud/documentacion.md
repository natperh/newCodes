## COBOL CRUD ejemplo

Este programa COBOL implementa un menú simple de CRUD (Create, Read, Update, Delete) para gestionar una base de datos de usuarios.

**Reglas de Negocio:**
- El usuario debe introducir un ID de 4 dígitos para las operaciones de creación, lectura y actualización.
- El nombre del usuario tiene un máximo de 20 caracteres.
- El archivo de usuarios se guarda en un archivo llamado 'usuarios.dat' en formato secuencial de línea.

**Propósito:**
Proporcionar una demostración básica de cómo se pueden realizar operaciones de CRUD en COBOL.

---

## Menú

```
--- MENU CRUD ---
1. Crear / 2. Leer / 3. Actualizar / 4. Borrar / 5. Salir
```

## Flujo

1. El programa muestra un menú con las opciones CRUD y una opción para salir.
2. El usuario selecciona una opción del menú.
    - Opción 1: Crear un nuevo registro de usuario.
    - Opción 2: Leer todos los registros de usuario y mostrarlos en pantalla.
    - Opción 3: Actualizar un registro de usuario existente.
    - Opción 4: Borrar un registro de usuario.
    - Opción 5: Salir del programa.
3. El programa se detiene después de que el usuario selecciona la opción de salida.

