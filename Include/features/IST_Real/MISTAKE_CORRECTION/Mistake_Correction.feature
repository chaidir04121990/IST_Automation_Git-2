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
Feature: Mistake Correction
  I want to use this template for my feature file

  @tag1
  Scenario: Click on Repeat Checkbox
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Mistake Correction"
    And Type on Textbox label "Contract Number" with value "333"
    And Click button "Search"
    And Click Repeat Checkbox where Status Not Corrected yet
    And Choose mistake type dropdown based on contract number "336" with value "Upload Foto klien"
    And Edit Textbox for note before with value "Testing"
    And Choose Checkbox Mistake Correction based on contract number "336"
    And Click button "Save"
    And Get text from pop up "Confirm" with text "Are you sure?"
    And Click button "Yes"
    And Get text from pop up "IT Supporting Tools" with text "Mistake correction has been repeated"
    And Click button "OK"
    And Wait page for load
    And Click button "Logout"
    And Close browser

  Scenario: Corrected Mistake and Save it
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Mistake Correction"
    And Type on Textbox label "Contract Number" with value "336"
    And Click button "Search"
    And Choose Checkbox Mistake Correction based on contract number "336"
    And Click button "Save"
    And Get text from pop up "Confirm" with text "Are you sure?"
    And Click button "Yes"
    And Get text from pop up "IT Supporting Tools" with text "Mistake has been corrected"
    And Click button "OK"
    And Wait page for load
    And Click button "Logout"
    And Close browser
    
      Scenario: Correction Undo 
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Mistake Correction"
    And Type on Textbox label "Contract Number" with value "336"
    And Click button "Search"
    And Choose Checkbox Mistake Correction based on contract status "CORRECTED" 
    And Click button "Undo"
    And Get text from pop up "Confirm" with text "Are you sure?"
    And Click button "Yes"
    And Get text from pop up "IT Supporting Tools" with text "Undo the mistake"
    And Click button "OK"
    And Wait page for load
    And Click button "Logout"
    And Close browser