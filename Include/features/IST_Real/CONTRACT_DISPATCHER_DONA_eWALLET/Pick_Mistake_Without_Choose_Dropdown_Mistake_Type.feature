#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Pick Mistake without choose dropdown mistake type
  I want to use this template for my feature file

  @tag1
  Scenario: Assign User to Contract DONA Bukalapak
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Arrow Menu "Contract Dispatcher Admin"
    And Select Menu "Management Assignment"
    And Select Username "mobile.test" of Management Assignment
    And Check for username if already assigned to "Dona e-Wallet"
    And Wait page for load
    And Click button "Logout"
    And Close browser
    
   Scenario: Select Menu Contract Dispatcher and Select Contract based on type contract DONA Bukalapak B2B
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Contract Dispatcher"
    And Select Contract Number based on Type Contract "DONA_BUKALAPAK"
    And Click button "Claim"
    And Verify Tab Matrix for "DONA_BUKALAPAK"
    And Checkbox General Mistake "KTP Foto Komponen Tidak Ada"
    And Click button "Save"
    And Get text from pop up "IT Supporting Tools" with text "Mistake Type cannot be empty"
    And Click button "OK"
    And Click button "Logout"
    And Comment "Register Mistake failed because Dropdown Mistake type didn't choose"
    And Close browser