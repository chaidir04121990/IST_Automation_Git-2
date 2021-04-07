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
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Approve KTP Number by Checker
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
      |chaidir.pratama01|LuLCKUUfG0dXlkzFaBQKvHwwWO/i8Paf|
    Then Login Success for contract dispatcher
    And Select Menu "SLIK Gateway Approval Non Customer"
    And Verify Table Result Exist
    And Get Data From Table
    And Click Checkbox Validate
    And Click button "Continue"
    And Click Checkbox Saya Setuju
    And Click button "Check SLIK"
    And Get text from pop up "Confirmation Approve Data" with text "Are you sure to SUBMIT this data ?"
    And Click button "Yes"
    And Get text from pop up "IT Supporting Tools" with text "Data is processed"
    And Click button "OK"
    And Click button "Logout"
    And Close browser