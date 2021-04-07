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
Feature: Column PROCESSED in CONTRACT_DISPATCHER_SOURCE change to be 'N' when STATUS in CONTRACT_DISPATCHER_CLAIM is RELEASE
  I want to use this template for my feature file

  @tag1
  Scenario: Claim Contract DONA Bukalapak B2B in Contract Dispatcher Menu then idle for 10 minutes, STATUS in Table CONTRACT_DISPATCHER_CLAIM turn RELEASE and PROCESSED in CONTRACT_DISPATCHER_SOURCE turns N
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Contract Dispatcher"
    And Select Contract Number based on Type Contract "DONA_BUKALAPAK_B2B"
    And Click button "Claim"
    And Sleep ten minutes
    Given Connect to Database
    And Exec Query idle for Ten Minutes "SELECT * FROM CONTRACT_DISPATCHER_SOURCE WHERE TEXT_CONTRACT_NUMBER='337'" 
    And Select Menu "Contract Dispatcher" 