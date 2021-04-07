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
  Scenario: Select Role Management for SLIK
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Role Management"
    And Choose Dropdown Username "mobile.test"
    And Select Role "ROLE_SLIK_BULK_UPLOAD"
    And Select Role "ROLE_SLIK_NON_CUSTOMER"
    And Select Role "ROLE_SLIK_APPROVAL_NON_CUSTOMER"
    And Select Role "ROLE_SLIK_CUSTOMER"
    And Click button "Change"
    And Get text from pop up "Confirm" with text "Are you sure?"
    And Click button "Yes"
    And Click button "Logout"
    And Close browser

  Scenario: Verify Role Management for SLIK
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Verify Menu "SLIK Gateway Customer" Exists
    And Verify Menu "SLIK Gateway Non Customer" Exists
    And Verify Menu "SLIK Gateway Approval Non Customer" Exists
    And Verify Menu "SLIK Bulk Request MPF" Exists
    And Click button "Logout"
    And Close browser
