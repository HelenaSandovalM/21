@foo
Feature: 21

  Background: A Calculator
    Given a calculator I just turned on

  Scenario: Ganador
  # Try to change one of the values below to provoke a failure
    When player1.setScore =21
    Then the result is Gano jugador1

   Scenario: Otro Ganador
  # Try to change one of the values below to provoke a failure
    When player2.setScore =21
    Then the result is Gano jugador2

  Scenario Outline: Many additions
    Given the previous entries:
      | first | second | operation |
      | 1     | 1      | +         |
      | 2     | 1      | +         |
    When I press +
    And I add <a> and <b>
    And I press +
    Then the result is <c>

    Examples: Single digits
      | a | b | c  |
      | 1 | 2 | 8  |
      | 2 | 3 | 10 |

     