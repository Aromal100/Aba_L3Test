Feature: Login functionality 

Scenario: Check the login functionality
    
    Given User is on login page
    When User enters vaild username "<username>"
    And User enters vaild password "<password>"
    And clicks on the Login button
    Then user enters the home page
    And close the browser
    
     Examples: 
      | username                   | password |
      | agalyaresbee+111@gmail.com | Aromal@123 |
 