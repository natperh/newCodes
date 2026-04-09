Feature: Suma de dos números

Escenario: Suma exitosa
   Dado que tengo los dos números
   Cuando sumo los dos números
   Entonces el resultado debe ser 15

Escenario: Suma con error
   Dado que tengo el número 0
   Cuando sumo con 5
   Entonces el resultado debe ser "Error: Sumando no válido"