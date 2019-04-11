Feature: Test cucumber login with crmpro
  I am just testing the login feature for crmpro

  Scenario: Login with proper credentials
    Given open the crmpro website to test
    When the url opens login with your credentials
    Then verify the title of the page

  Scenario Outline: Login with different credentials
    Given open the Automation practice form
    When then fill the "<username>" and "<password>"
    Then verify the title of the page

    Examples: 
      | username | password |
      | ram1212  | ram1212  |
      | admin    | admin    |
      | admin123 | admin123 |
