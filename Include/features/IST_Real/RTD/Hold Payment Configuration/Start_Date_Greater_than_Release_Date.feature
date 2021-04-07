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
Feature: Hold payment configuration
  I want to use this template for my feature file

  @tag1
  Scenario: Start date is greater than end date
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success
    And Select Arrow Menu "Real Time Disbursement"
    And Select Menu "Hold Payment Configuration"
    And Input "Start Date Hold Payment" with value "30-01-2021"
    And Input "Release Date" with value "25-01-2021"
    And Click button "Add"
    And Get text from pop up "IT Supporting Tools" with text "Release date must be after start date"
    And Click button "OK"
    And Click button "Logout"
    And Close browser