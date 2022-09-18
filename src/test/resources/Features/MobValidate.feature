#Author: krithick.email@your.domain.com
@mobile
Feature: Mobile validation
Background:
 Given user launches flipkart application
    And user handles the login

  Scenario: Mobile Validation
    When user search mobile
    And user select the mobile and click add to cart
    And user doing the payment
    Then user recieve the confirmation message
@map
  Scenario: Mobile Validation
    
    When user search mobile in oneD map
      | A11 | iPhone  |
      | B11 | SAMSUNG |
      | C11 | realme  |
    And user select the mobile and click add to cart
    And user doing the payment
    Then user recieve the confirmation message
  @outline 
   Scenario Outline: Mobile Validation
    When user search mobile "<Phone>"
    And user select the mobile and click add to cart
    And user doing the payment
    Then user recieve the confirmation message
   
   Examples:
   | Phone   |
   | iPhone  |
   | SAMSUNG |
   | realme  |
 