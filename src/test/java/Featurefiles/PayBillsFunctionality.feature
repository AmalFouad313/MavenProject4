  Feature: Pay Bills Functionality

    Scenario Outline: Add new payee
      Given Navigate to webappsecurity
      When Enter the "<username>" and "<password>"
      Then User should login successfully
      Then Click on PayBills and verify URL
      Then Add new payee information for payee and account
      Then Add new payee information "<amount>" and "<date>" and "<description>"
      Then sign out

      Examples:
        | username | password |amount|date|description|
        |username  |password  |1000  |2020-08-11|Person1|
        |username  |password  |      |2020-08-11|Person1|
        |username  |password  |5000  |          |Person1|
        |username  |password  |3000  |2020-08-11|       |




