
Feature: User is able to register

  @current

    Scenario: A new user is able to register
    Given A new user has opened the flying high webPage
    When  a new user registers:
      |uniqueusername | password | firstName | lastName | address        | country        |
      |tomtest | secret   | Tom       | Tester   | 12,high street | United Kingdom |


