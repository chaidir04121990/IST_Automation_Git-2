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
Feature: Bulk Mistake Correction
  I want to use this template for my feature file

  @tag1
  Scenario: Test Bulk Mistake Correction Mistake after follow up threshold
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Bulk Mistake Correction"
    And Click button "Browse"
    And Upload file "coba.xlsx"
    And Click dropdown "Report Type" and select value "Mistake after follow up threshold"
    And Click button "Proceed"
    And Get text from pop up "IT Supporting Tools" with text "Invalid data found, please check for data below"
    And Click button "OK"
    And Verify Table present
    And Click button "Logout"
    And Close browser
    
    Scenario: Test Bulk Mistake Correction Deviation
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Bulk Mistake Correction"
    And Click button "Browse"
    And Upload file "coba.xlsx"
    And Wait page for load
    And Click dropdown "Report Type" and select value "Deviation"
    And Wait page for load
    And Click button "Proceed"
    And Get text from pop up "IT Supporting Tools" with text "Invalid data found, please check for data below"
    And Click button "OK"
    And Wait page for load
    And Verify Table present
    And Click button "Logout"
    And Close browser
    
    Scenario: Click button Proceed without upload the file
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Bulk Mistake Correction"
    And Click button "Proceed"
    And Get text from pop up "IT Supporting Tools" with text "Please upload your excel file!"
    And Click button "OK"
    And Wait page for load
    And Verify Table Empty
    And Click button "Logout"
    And Close browser