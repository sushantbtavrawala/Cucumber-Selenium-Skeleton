Feature: Simply login journey

  As a calling system
  I want a valid identifier
  So that I can call another service


  Scenario Outline: 1- simple login journey

    Given I am on the webpage
    When I enter "<username>" and "<password>"
    Then I am on the homepage

    Examples:
      | username | password  |
      | admin    | 12345678  |