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
Feature: Claim Contract Dona Bukalapak B2B then Save it Without Register any Mistakes
  I want to use this template for my feature file

  @tag1  
    Scenario: Select Menu Contract Dispatcher and Select Contract based on type contract Dona Bukalapak B2B
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Contract Dispatcher"
    And Select Contract Number based on Type Contract "DONA_BUKALAPAK_B2B" 
    And Click button "Claim"
    And Verify Tab Mistake Matrix Base on Type Contract
    And Varify the mistake detail already match with the matrix Base on Type Contract
    And Click button "Save"
    And Get text from pop up "Confirmation Stop" with text "Are you sure?"
    And Click button "OK"
    And Get text from pop up "IT Supporting Tools" with text "Successfully saved"
    And Click button "OK"
    And Click button "Logout"
    And Close browser