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
Feature: SLIK Checking Result
  I want to use this template for my feature file

  @tag1
  Scenario: SLIK Gateway Non Customer Search Result
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "SLIK Gateway Non Customer"
    #And Input Data "KTP Number" with value "1234567890123999" for Search Result
    And Select Status is "REQUESTED" 
    #And Set Start Date with value "04-10-2020" and End Date with value "04-15-2020"
    And Click button "Search"
    And TESTING XPATH

