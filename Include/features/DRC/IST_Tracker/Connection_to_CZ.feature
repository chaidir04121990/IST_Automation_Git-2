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
Feature: Connection To CZ by Select Approval status menu
  I want to use this template for my feature file

  @tag1
  Scenario: Select ROLE_PAPERLESS to enable Menu Approval Status (MANDATORY)
    #Given Go to IST Tracker
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Role Management"
    And Choose Dropdown Username "mobile.test"
    And Select Role "ROLE_PAPERLESS"
    And Click button "Change"
    And Get text from pop up "Confirm" with text "Are you sure?"
    And Click button "Yes"
    And Click button "Logout"
    And Close browser

  Scenario: Select Menu Approval status then Click send Email
    #Given Go to IST Tracker
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Approval Status"
    And Type on Textbox label "Contract Number" with value "3905068360"
    And Click button "Search"
    And Verify Table Approval Status Exist
    And Click button "Logout"
    And Close browser