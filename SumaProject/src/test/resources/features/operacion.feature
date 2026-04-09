Feature: Suma de dos números

Escenario: Suma exitosa
   Dado que tengo los dos números
   Cuando sumo los dos números
   Entonces el resultado debe ser 15

Escenario: Suma con error
   Dado que un número es negativo
   Cuando sumo los dos números
   Entonces debe mostrar un mensaje de error