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
Feature: Contract Dispatcher for DONA BLIBLI
  I want to use this template for my feature file

  @tag1
  Scenario: Assign User to Contract Dona BliBli
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Arrow Menu "Contract Dispatcher Admin"
    And Select Menu "Management Assignment"
    And Select Username "mobile.test" of Management Assignment
    And Check for username if already assigned to "Dona B2B"
    And Wait page for load
    And Click button "Logout"
    And Close browser

  Scenario: Check Mistake Matrix Dona BliBli
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Contract Dispatcher"
    And Select Contract Number based on Type Contract "DONA_BLIBLI"
    And Click button "Claim"
    And Verify Tab Mistake Matrix Base on Type Contract
    And Varify the mistake detail already match with the matrix Base on Type Contract
    And Click button "Logout"
    And Close browser
    Given Connect to Database
    And Check Contract Number in Contract_Dispatcher_Claim "SELECT * FROM CONTRACT_DISPATCHER_CLAIM WHERE CONTRACT_NUMBER='336' and CLAIM_DATE_END IS NULL"
    And Check Contract Number Process in Contract_Dispatcher_Source "SELECT * FROM CONTRACT_DISPATCHER_SOURCE WHERE TEXT_CONTRACT_NUMBER='336'"
