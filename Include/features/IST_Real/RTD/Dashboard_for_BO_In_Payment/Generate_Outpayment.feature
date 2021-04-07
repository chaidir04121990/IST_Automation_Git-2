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
Feature: Generate data outpayment
  I want to use this template for my feature file

  @tag1
  Scenario: Genrate Outpayment without select checkbox
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success
    And Select Arrow Menu "Real Time Disbursement"
    And Select Menu "Dashboard for BO In Payment"
    And Select STATUS "Manual Disbursement"
    And Click button "Search"
    And Verify Table Filled
    And Click button "Generate Outpayment"
    And Get text from pop up "Warning Message" with text "Warning : No data selected !"
    And Click button "OK"
    And Click button "Logout"
    And Close browser

  Scenario: Genrate Outpayment and select checkbox first
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success
    And Select Arrow Menu "Real Time Disbursement"
    And Select Menu "Dashboard for BO In Payment"
    And Select STATUS "Manual Disbursement"
    And Click button "Search"
    And Verify Table Filled
    And Click Checkbox
    And Click button "Generate Outpayment"
    And Get text from pop up "Success Message" with text "Generate Outpayment File Success"
    And Click button "OK"
    And Click button "Logout"
    And Close browser
