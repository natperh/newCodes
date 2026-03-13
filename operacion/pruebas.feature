```gherkin
Feature: Suma de dos números

Scenario: Suma exitosa
    Dado que tengo dos números
    Cuando los sumo
    Entonces el resultado es la suma de ambos

Scenario: Resultado negativo
    Dado que uno de los números es negativo
    Cuando los sumo
    Entonces el resultado es la suma incluyendo el negativo
```