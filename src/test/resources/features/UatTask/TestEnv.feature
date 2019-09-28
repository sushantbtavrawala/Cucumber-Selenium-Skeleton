Feature: A description

  @login
  Scenario Outline: login page
    Given I am on the webpage
    When I enter "<username>" and "<password>"
    Then I am on the homepage
    Examples:
      |username|password|
      |admin   |admin@123        |