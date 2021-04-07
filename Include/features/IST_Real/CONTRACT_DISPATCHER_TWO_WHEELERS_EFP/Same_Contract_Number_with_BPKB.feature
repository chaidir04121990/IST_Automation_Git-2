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
Feature: As a user,
  I want to use this template for Claim contract TW EFP

  @tag1
  Scenario: Two Wheelers EFP and BPKB have same contract number, if contract number for TW EFP claimed then the same contract number in BPKB will not be claimed
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Contract Dispatcher"
    And Verify type contract "TWO_WHEELERS_EFP" with value 331 exists in contract dispatcher menu
    And Verify type contract "BPKB" with value 331 exists in contract dispatcher menu
    And Select Contract Number based on Type Contract Two Wheelers EFP and value is 331
    And Click button "Claim"
    And Verify Tab Matrix for "TWO_WHEELERS_EFP"
    And Click button "Save"
    And Get text from pop up "Confirmation Stop" with text "Are you sure?"
    And Click button "OK"
    And Get text from pop up "IT Supporting Tools" with text "Successfully saved"
    And Click button "OK"
    And Click button "Logout"
    And Close browser
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Contract Dispatcher"
    And Verify type contract "BPKB" with value 331 exists in contract dispatcher menu
    And Close browser