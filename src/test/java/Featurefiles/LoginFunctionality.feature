Feature: Sign in Functionality

    Scenario Outline: Sign in with valid username and password
    Given Navigate to webappsecurity
    When Enter the "<username>" and "<password>"
    Then User should login successfully
      Examples:
        | username | password |
        |username  |password  |

