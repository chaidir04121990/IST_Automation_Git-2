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
Feature: Column PROCESSED in IST_TIPPERS_DISPARCHER_SOURCE change to be 'N' when STATUS in IST_TIPPERS_DISPATCHER_CLAIM is Release after idle for 10 Minutes
  I want to use this template for my feature file

  @tag1
  Scenario: Claim Contract Tippers in Contract Dispatcher Menu then idle for 10 minutes, STATUS in Table IST_TIPPERS_DISPATCHER_CLAIM turn RELEASE
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Contract Dispatcher"
    And Click on Tab "Tippers"
    And Select Tippers ID based on Validation Type "TIPPERS_CHECK"
    And Click button "Claim"
    And Sleep ten minutes
    Given Connect to Database
    And Check DB Idle Tippers Process for 10 Minutes
    And Select Menu "Contract Dispatcher" 