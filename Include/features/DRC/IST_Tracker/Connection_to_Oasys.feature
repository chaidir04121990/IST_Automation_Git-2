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
Feature: Connection to Oasys by Select Menu Oasys Customer Cycle
  I want to use this template for my feature file

  @tag1
  Scenario: Select Menu Oasys Customer Cycle from Oasys Report
   #Given Go to IST Tracker
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Arrow Menu "Oasys Report"
    And Select Menu "OASys Customer Cycle"
    And Type on Textbox label "Contract Number" with value "4003378179"
    And Click button "Search"
    And Verify Table Exist
    And Click button "Logout"
    And Close browser