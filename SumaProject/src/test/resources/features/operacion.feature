Feature: Suma de dos números

Escenario: Suma exitosa
   Dado que tengo los dos números
   Cuando sumo los dos números
   Entonces el resultado debe ser 15

Escenario: Input inválido
   Dado que tengo un número negativo
   Cuando sumo los dos números
   Entonces debe fallar con un mensaje de error