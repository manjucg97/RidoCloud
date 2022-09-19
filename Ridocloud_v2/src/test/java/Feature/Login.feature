Feature: login
 
 
Scenario: Open the Browser enter URL login page should be displyed,
  enter user name and password and click on login button check home page is displyed.
  
   Given Open the Browser 
   When enter testurl
    Then login page should be displyed
    When enter user name and password 
    And click on login button
    Then home page is should be displyed