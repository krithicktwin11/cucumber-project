#Author: keerthivasan.email@your.domain.com
@Tv
Feature: Tv validation
Background:
 Given user launches flipkart application
    And user handles the login

  Scenario: Tv Validation
    When user search Tv
    And user select the Tv and click add to cart
    And user doing the payment
    Then user recieve the confirmation
    @list
    Scenario:Tv validation by using list
    When user search Tv by using oneD
      | SONY | SAMSUNG | Panasonic |
    And user select the Tv and click add to cart
    And user doing the payment
    Then user recieve the confirmation message
    @map
      Scenario: TV Validation by using map
    When user search Tv by using map
   |D11|SONY     |
   |E11|SAMSUNG  |
   |F11|Panasonic|
    And user select the tv and click add to cart
    And user doing the payment
    Then user recieve the confirmation message
   
  
