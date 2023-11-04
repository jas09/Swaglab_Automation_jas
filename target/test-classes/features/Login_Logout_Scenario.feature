

Feature: SWAGLABS Login



  Scenario Outline: Standard User Login
    Given user is on SWAGLABS Login Page "<URL>"
    When user login to application with "standard_user" and password "secret_sauce"
    Then products page is displayed
    
    Examples: 
     | URL  | username | password  |
     | https://www.saucedemo.com/v1/index.html | standard_user | secret_sauce |
   

   Scenario Outline: Standard User Logout
    #Given user is on Logged into SWAGLABS
    Given user clicks on Open Menu
    When user clicks on Logout from sidebar
    Then user is sucessfully logged out
   
