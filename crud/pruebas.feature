## Escenarios Gherkin

### Crear un nuevo usuario

Para crear un nuevo usuario:

```
Scenario: Create a new user

Given I am in the main menu
When I choose \"Crear\"
And I provide the following details:\n\n| ID | Name |\n| --- | --- |\n| 0001 | John Doe |
Then the user John Doe should be created successfully
```

### Leer todos los usuarios

Para leer la lista de usuarios:

```
Scenario: Read all users

Given I am in the main menu
When I choose \"Leer\"
Then I should see the following users:\n\n| ID | Name |\n| --- | --- |\n| 0001 | John Doe |
```
