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
Feature: Contract Dispatcher Tippers
  I want to use this template for my feature file

  @tag1
  Scenario: Select Menu Contract Dispatcher and Select Contract based on type contract Tippers Recheck
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Contract Dispatcher"
    And Click on Tab "Tippers"
    And Select Tippers ID based on Validation Type "TIPPERS_RECHECK"
    And Click button "Claim"
    And Verify Tippers Data
    #And Verify Tippers Document
    #And Varify the mistake detail already match with the matrix Base on Type Contract
    #And Close browser