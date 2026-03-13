## Programa COBOL para sumar dos números

### Propósito

Este programa COBOL permite al usuario introducir dos números y obtener su suma.

### Reglas de Negocio

- El usuario debe introducir dos números enteros.
- El programa realiza la suma de los dos números y muestra el resultado.

### Lógica

El programa sigue un flujo sencillo de entrada/salida, usando las secciones estándar de COBOL para definir los datos y el procedimiento:

- `IDENTIFICATION DIVISION`: Identifica el programa.
- `DATA DIVISION`: Define los datos que se van a utilizar.
- `FILE SECTION`: No se usan archivos en este ejemplo.
- `WORKING-STORAGE SECTION`: Define las variables que se usarán en el programa.
- `PROCEDURE DIVISION`: Describe el flujo del programa.

### Flujo de ejecución

1. El programa muestra un mensaje para que el usuario introduzca el primer número.
2. El usuario introduce el primer número entero.
3. El programa muestra un mensaje para que el usuario introduzca el segundo número.
4. El usuario introduce el segundo número entero.
5. Se realiza la suma de los dos números y se guarda el resultado en la variable `RESULTADO`.
6. El programa muestra el resultado al usuario.
7. Termina la ejecución.