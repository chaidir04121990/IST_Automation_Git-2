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
Feature: Delete Mistake Registration
  I want to use this template for my feature file

  @tag1
  Scenario: Verify Table empty when contract number doesn't filled yet
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Delete Mistake Registration"
    And Verify Table Empty
    And Click button "Logout"
    And Close browser

  Scenario: Delete all mistakes Without Reason
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Delete Mistake Registration"
    And Type on Textbox label "Contract Number" with value "333"
    And Click button "Search"
    And Verify Table Filled
    And Checked checkbox table before label "Contract Code"
    And Click button "Delete"
    And Get text from pop up "IT Supporting Tools" with text "Reason cannot be empty"
    And Click button "OK"

  Scenario: Delete all mistakes based on contract number
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Delete Mistake Registration"
    And Type on Textbox label "Contract Number" with value "333"
    And Click button "Search"
    And Verify Table Filled
    And Checked checkbox table before label "Contract Code"
    And Type on big textbox labeled Reason with value "CHODY"
    And Click button "Delete"
    And Get text from pop up "Confirm" with text "Are you sure"
    And Click button "Yes"
    And Get text from pop up "IT Supporting Tools" with text "Mistake has been deleted"
    And Click button "OK"
    And Verify Table Empty
    And Click button "Logout"
    And Close browser
