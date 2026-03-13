El código COBOL realiza operaciones CRUD básicas sobre un archivo de usuarios. 

**Propósito**:
- Crear un nuevo registro de usuario con un ID numérico de 4 dígitos y un nombre de hasta 20 caracteres.
- Leer todos los registros de usuario y mostrarlos en pantalla.

**Reglas de Negocio**:
- El archivo `usuarios.dat` se organiza en líneas secuenciales, con cada línea representando un registro de usuario.
- El registro de usuario consta de un ID numérico de 4 dígitos (`ID-USER`) y un nombre de texto (`NOMBRE-USER`).
- La opción 1 del menú permite al usuario ingresar un nuevo registro.
- La opción 2 del menú muestra todos los registros almacenados en el archivo, uno por línea, hasta que el usuario decide salir.

---

Para una mejor comprensión, aquí hay una tabla de los campos de datos utilizados:

| N° | Nombre del campo     | Tamaño | Descripción                 |
|----|---------------------|-------|---------------------------|
| 1  | ID-USER             | 4     | Numérico, ID del usuario   |
| 2  | NOMBRE-USER         | 20    | Alfanumérico, nombre de usuario |

---