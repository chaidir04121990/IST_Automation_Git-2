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
Feature: Pick mistake without choose dropdown mistake type
  I want to use this template for my feature file

  @tag1
  Scenario: Claim contract tippers but doesn't pick dropdown mistake type
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Contract Dispatcher"
    And Click on Tab "Tippers"
    And Select Tippers ID based on Validation Type "TIPPERS_CHECK"
    And Click button "Claim"
    And Varify the mistake detail already match with the matrix Base on Type Contract
    And Click on Tab "KTP Partner"
    And Checkbox General Mistake "01. KTP - Foto dokumen tidak ada"
    And Click button "Save"
    And Get text from pop up "IT Supporting Tools" with text "Mistake Type cannot be empty"
    And Click button "OK"
    And Click button "Logout"
    And Comment "Register Mistake failed because Dropdown Mistake type didn't choose"
    And Close browser