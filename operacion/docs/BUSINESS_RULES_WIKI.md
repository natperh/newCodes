# 🏦 Wiki de Negocio: operacion

**Wiki de Reglas de Negocio: Programa de Suma**

**Introducción**

Este documento describe las reglas de negocio para el programa de suma, que es un programa sencillo que solicita al usuario dos números y muestra su suma.

**Reglas de Negocio**

### 1. Validación de Entrada

* El programa debe solicitar al usuario dos números enteros positivos.
* Los números deben tener un máximo de 4 dígitos.
* El programa debe validar que los números ingresados sean válidos (no vacíos, no negativos, no decimales).

**Regla de Negocio 1.1:** Si el usuario ingresa un número no válido, el programa debe mostrar un mensaje de error y solicitar nuevamente el número.

### 2. Proceso de Suma

* El programa debe sumar los dos números ingresados por el usuario.
* El resultado de la suma debe ser un número entero de 5 dígitos.

**Regla de Negocio 2.1:** Si la suma de los dos números supera el límite de 5 dígitos, el programa debe mostrar un mensaje de error y no mostrar el resultado.

### 3. Visualización del Resultado

* El programa debe mostrar el resultado de la suma en la pantalla.
* El resultado debe ser mostrado con el formato "El resultado es [resultado]".

**Regla de Negocio 3.1:** Si el resultado es cero, el programa debe mostrar un mensaje especial "El resultado es cero".

### 4. Finalización del Programa

* El programa debe finalizar después de mostrar el resultado de la suma.
* El programa debe mostrar un mensaje de despedida antes de finalizar.

**Regla de Negocio 4.1:** Si el usuario desea ejecutar el programa nuevamente, debe poder hacerlo sin necesidad de reiniciar el programa.

**Especificaciones Técnicas**

* El programa debe ser escrito en COBOL.
* El programa debe utilizar la división `IDENTIFICATION DIVISION` para identificar el programa.
* El programa debe utilizar la división `DATA DIVISION` para definir las variables.
* El programa debe utilizar la división `PROCEDURE DIVISION` para definir el flujo del programa.

**Código del Programa**

El código del programa es el siguiente:
```
IDENTIFICATION DIVISION.
PROGRAM-ID. SUMA.
DATA DIVISION.
FILE SECTION.
WORKING-STORAGE SECTION.
01 NUM1 PIC 9(4).
01 NUM2 PIC 9(4).
01 RESULTADO PIC 9(5).
PROCEDURE DIVISION.
MAIN-PROCEDURE.
	DISPLAY "Introduce el primer número:".
	ACCEPT NUM1.
	DISPLAY "Introduce el segundo número: ".
	ACCEPT NUM2.
	ADD NUM1 TO NUM2 GIVING RESULTADO.
	DISPLAY "El resultado es " RESULTADO.
	STOP RUN.
END PROGRAM SUMA.
```
**Pruebas**

El programa debe ser probado con diferentes escenarios para asegurarse de que cumple con las reglas de negocio. Algunos ejemplos de pruebas son:

* Ingresar dos números válidos y verificar que el resultado sea correcto.
* Ingresar un número no válido y verificar que se muestre un mensaje de error.
* Ingresar dos números que superen el límite de 5 dígitos y verificar que se muestre un mensaje de error.
* Verificar que el programa finalice correctamente después de mostrar el resultado.