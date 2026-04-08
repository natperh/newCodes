Feature: Suma de dos números

Scenario: Suma exitosa
   Dado que tengo los números 2 y 3
   Cuando los sumo
   Entonces el resultado es 5

Scenario: Fallo de suma
   Dado que tengo los números -2 y 0
   Cuando los sumo
   Entonces el resultado es -2