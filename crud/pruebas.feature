## Feature

Scenario: Create a new user
    Given the user wants to create a new record
    When the user enters "1" and a valid ID and name
    Then the program should write the new user to the file and display a confirmation

Scenario: Read all users
    Given the user wants to read all records
    When the user enters "2"
    Then the program should display all users stored in the file

Scenario: Update an existing user
    Given there is an existing user with ID "1234"
    When the user enters "3", "1234" and a new name
    Then the program should update the user's name and display a confirmation

Scenario: Invalid input
    Given the user enters an invalid option
    When the user selects an option out of range
    Then an error message should be shown
