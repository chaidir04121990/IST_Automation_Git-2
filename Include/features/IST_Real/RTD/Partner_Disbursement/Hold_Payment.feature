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
Feature: Hold Payment Recreation
  I want to use this template for my feature file

  @tag1
  Scenario: Hold Payment for Status Eligible to Disburse
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success
    And Select Arrow Menu "Real Time Disbursement"
    And Select Menu "Partner Disbursement"
    And Select STATUS "Ready to disburse"
    And Click button "Search"
    And Verify Search Result Presents
    And Click Checkbox
    And Get Checkbox data of Menu "Partner Disbursement" before Hold Payment
    And Click button "HOLD PAYMENT"
    And Input reason of Hold Payment
    And Click button "Yes"
    And Connect to Database RTD
    And Select Hold Contract Number and make sure status is Hold Payment Recreation