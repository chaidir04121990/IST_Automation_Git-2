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
Feature: View Detail Dashboard for BO In Payment
  I want to use this template for my feature file

  @tag1
  Scenario: Search by STATUS Success to Disburse and then View Detail of it
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success
    And Select Arrow Menu "Real Time Disbursement"
    And Select Menu "Dashboard for CCC/OCS"
    And Select STATUS "Success to Disburse"
    And Click button "Search"
    And Verify Search Result Presents
    And Click View Detail
    And Verify Information in View Detail
    And Click button "Logout"
    And Close browser