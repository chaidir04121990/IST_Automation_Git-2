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
Feature: Contract Dispatcher Tippers
  I want to use this template for my feature file

  @tag1
  Scenario: Select Menu Contract Dispatcher and Select Contract based on type contract Tippers Check
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Contract Dispatcher"
    And Click on Tab "Tippers"
    And Select Tippers ID based on Validation Type "TIPPERS_CHECK"
    And Click button "Claim"
    And Verify Data Found
    And Verify Tippers Data
    And Verify Tippers Document
    And Verify Tab Mistake Matrix Base on Type Contract
    And Varify the mistake detail already match with the matrix Base on Type Contract
    And Click on Tab "Partner Data"
    And Checkbox General Mistake "03. Partner Data - Foto Pemohon di sistem bukan customer photo (bukan foto orang atau foto selfie)"
    And Choose Dropdown mistake type "Photo dokumen" from mistake name "03. Partner Data - Foto Pemohon di sistem bukan customer photo (bukan foto orang atau foto selfie)"
    And Type on textarea note before based on mistake name "03. Partner Data - Foto Pemohon di sistem bukan customer photo (bukan foto orang atau foto selfie)" with value "TESTING"
    And Type on textarea note after based on mistake name "03. Partner Data - Foto Pemohon di sistem bukan customer photo (bukan foto orang atau foto selfie)" with value "TESTING after"
    And Click button "Save"
    And Get text from pop up "IT Supporting Tools" with text "Mistake has been saved"
    And Click button "OK"
    And Click button "Logout"
    And Close browser