Feature: Suma de dos números

Escenario: Suma exitosa
   Dado que ingreso el primer número
   Y ingreso el segundo número
   Cuando llamo a la función de suma
   Entonces el resultado debe ser 5

Escenario: Fallo al sumar
   Dado que ingreso un número negativo
   Y ingreso cero
   Cuando llamo a la función de suma
   Entonces debe lanzar una excepción