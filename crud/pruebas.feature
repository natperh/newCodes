Feature: CRUD Operations

  Scenario: Crear registro
    Dado que el archivo "usuarios.dat" no existe
    Cuando el usuario selecciona la opción "Crear"
    Y ingresa el ID "1234"
    Y ingresa el nombre "Nombre"
    Entonces el archivo "usuarios.dat" debe crearse con el contenido "1234Nombre"

  Scenario: Leer registros
    Dado que el archivo "usuarios.dat" existe y contiene:
      | ID | Nombre      |
      | 1234 | Nombre     |
      | 4321 | Otro nombre |
    Cuando el usuario selecciona la opción "Leer"
    Entonces se deben mostrar los registros uno por uno:
      | 1234 | Nombre     |
      | 4321 | Otro nombre |
    Y al finalizar se debe mostrar "No hay más registros."

  Scenario: Salir
    Cuando el usuario selecciona la opción "Salir"
    Entonces el programa debe finalizar.