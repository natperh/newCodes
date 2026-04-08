# Documentacion: operacion

## Analisis Funcional
Este código COBOL es un programa simple que realiza la suma de dos números enteros introducidos por el usuario y muestra el resultado en pantalla. A continuación, te explico paso a paso qué hace cada sección del código:

**IDENTIFICATION DIVISION**

Esta sección identifica el programa y proporciona información general sobre él. En este caso, solo se especifica el nombre del programa, que es "SUMA".

**DATA DIVISION**

Esta sección define las variables y estructuras de datos que se utilizarán en el programa. En este caso, se definen tres variables:

* `NUM1`: un campo numérico de 4 dígitos (PIC 9(4)) que almacenará el primer número introducido por el usuario.
* `NUM2`: un campo numérico de 4 dígitos (PIC 9(4)) que almacenará el segundo número introducido por el usuario.
* `RESULTADO`: un campo numérico de 5 dígitos (PIC 9(5)) que almacenará el resultado de la suma.

**PROCEDURE DIVISION**

Esta sección contiene el código que se ejecutará cuando se inicie el programa. En este caso, se define un procedimiento llamado `MAIN-PROCEDURE` que realiza las siguientes acciones:

1. `DISPLAY "Introduce el primer número:"`: muestra un mensaje en pantalla pidiendo al usuario que introduzca el primer número.
2. `ACCEPT NUM1`: lee el número introducido por el usuario y lo almacena en la variable `NUM1`.
3. `DISPLAY "Introduce el segundo número: "`: muestra un mensaje en pantalla pidiendo al usuario que introduzca el segundo número.
4. `ACCEPT NUM2`: lee el número introducido por el usuario y lo almacena en la variable `NUM2`.
5. `ADD NUM1 TO NUM2 GIVING RESULTADO`: realiza la suma de los dos números y almacena el resultado en la variable `RESULTADO`.
6. `DISPLAY "El resultado es " RESULTADO`: muestra el resultado de la suma en pantalla.
7. `STOP RUN`: finaliza la ejecución del programa.

**END PROGRAM SUMA**

Esta línea marca el final del programa y especifica que se trata del programa "SUMA".

En resumen, este código COBOL es un programa simple que pide al usuario que introduzca dos números, los suma y muestra el resultado en pantalla.