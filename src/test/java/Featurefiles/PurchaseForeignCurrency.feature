Feature: Purchase Foreign Currency Functionality

  Scenario Outline: test currency with US dollar
    Given Navigate to webappsecurity
    When Enter the "<username>" and "<password>"
    Then User should login successfully
    Then Click on PayBills and verify URL
    Then Click on Purchase Foreign Currency
    Then Select random currency
    When Enter "<currency>" amount
    Then Select radio button for currency
    Then Click on Purchase Foreign Currency
    Then Select random currency
    When Enter "<currency>" amount
    Then Select radio button for selected currency
    Then Click on Purchase Foreign Currency


    Examples:
      | username | password |currency|
      |username  |password  |5000    |