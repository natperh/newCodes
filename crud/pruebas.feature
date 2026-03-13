## Feature

Feature: Usuario CRUD Operations

Scenario: Create a new user
    Given the user exists
    When creating a new user with ID 1234 and name "Pepe"
    Then the user should be added to the list

Scenario: Read users
    Given there are 2 users in the file
    When reading the users
    Then both users should be read and displayed

Scenario: Update user
    Given there is a user with ID 1234 and name "Pepe"
    When updating the user's name to "Pepi"
    Then the user's name should be updated

Scenario: Delete user
    Given there are 2 users in the file
    When deleting the user with ID 1234
    Then the user should be removed from the list
    And the remaining user should be displayed
