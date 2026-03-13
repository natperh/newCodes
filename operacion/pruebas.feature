```gherkin
Feature: Suma de dos números

Scenario: Suma exitosa
    Dado que tengo dos números
    Cuando los sume
    Entonces el resultado debe ser 15

Scenario: Números negativos
    Dado que tengo -5 y -10
    Cuando los sume
    Entonces el resultado debe ser -15
```