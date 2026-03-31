Feature: Suma de dos números

Scenario: Sumar dos números positivos
    Dado que tengo los siguientes números
     | num1 | num2 |
     |---- |---- |
     | 2   | 3    |
    Cuando llamo a la API de suma
    Entonces el resultado debe ser 5