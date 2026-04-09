Aquí te presento las pruebas en Gherkin para el programa de suma:

**Feature: Programa de Suma**

**Escenario 1: Ingresar dos números válidos**

* Dado que el usuario ingresa dos números enteros positivos con un máximo de 4 dígitos
* Cuando el programa suma los dos números
* Entonces el resultado debe ser un número entero de 5 dígitos
* Y el programa debe mostrar el resultado en la pantalla con el formato "El resultado es [resultado]"

**Escenario 2: Ingresar un número no válido**

* Dado que el usuario ingresa un número no válido (no vacío, no negativo, no decimal)
* Cuando el programa intenta sumar los dos números
* Entonces el programa debe mostrar un mensaje de error
* Y el programa debe solicitar nuevamente el número

**Escenario 3: Ingresar dos números que superen el límite de 5 dígitos**

* Dado que el usuario ingresa dos números que superen el límite de 5 dígitos
* Cuando el programa intenta sumar los dos números
* Entonces el programa debe mostrar un mensaje de error
* Y el programa no debe mostrar el resultado

**Escenario 4: Resultado cero**

* Dado que el usuario ingresa dos números que suman cero
* Cuando el programa suma los dos números
* Entonces el programa debe mostrar un mensaje especial "El resultado es cero"

**Escenario 5: Finalización del programa**

* Dado que el programa ha mostrado el resultado de la suma
* Cuando el usuario no desea ejecutar el programa nuevamente
* Entonces el programa debe finalizar correctamente
* Y el programa debe mostrar un mensaje de despedida antes de finalizar

**Escenario 6: Ejecutar el programa nuevamente**

* Dado que el usuario desea ejecutar el programa nuevamente
* Cuando el programa ha finalizado correctamente
* Entonces el programa debe permitir al usuario ejecutarlo nuevamente sin necesidad de reiniciar

Estos escenarios cubren las reglas de negocio y los casos de uso del programa de suma.