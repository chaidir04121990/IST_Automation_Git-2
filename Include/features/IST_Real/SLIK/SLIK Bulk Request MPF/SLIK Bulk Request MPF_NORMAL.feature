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
Feature: SLIK Bulk Request MPF
  I want to use this template for my feature file

  @tag1
  Scenario: Verify Button Upload file trigger pop up window
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Check Sign in as
    And Select Menu "SLIK Bulk Request MPF"
    And Click button "Upload Data"
    And Close browser

  Scenario: SLIK Bulk Request Upload process
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Check Sign in as
    And Select Menu "SLIK Bulk Request MPF"
    And Upload file "Template Bulk Request MPF.csv"
    And Click button "Process"
    And Get text from pop up "IT Supporting Tools" with text "Data is processed"
    And Click button "OK"
    And Read CSV File "Template Bulk Request MPF.csv"
    And Click button "Logout"
    And Close browser
