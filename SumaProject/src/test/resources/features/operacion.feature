Feature: Suma de dos números

  Escenario: Suma exitosa
    Dado que ingreso el número "5"
    y ingreso el número "3"
    Cuando llamo a la API de suma
    Entonces el resultado debe ser "El resultado es 8"

  Escenario: Fallo de validación
    Dado que ingreso un número negativo "5"
    y ingreso "0"
    Cuando llamo a la API de suma
    Entonces el resultado debe ser "El resultado es 5"