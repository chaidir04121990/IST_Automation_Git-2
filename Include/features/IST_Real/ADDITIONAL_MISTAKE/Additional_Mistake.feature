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
Feature: Additional Mistake
  I want to use this template for my feature file

  @tag1
  Scenario: Click button Search without input contract number
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Additional Mistake"
    And Click button "Search"
    And Get text from pop up "IT Supporting Tools" with text "Contract Number cannot be empty"
    And Click button "OK"
    And Verify Table Empty
    And Click button "Logout"
    And Close browser
    
    Scenario: Add Mistake based on contract number and type contract TWO WHEELERS(332)
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Additional Mistake"
    And Type on Textbox label "Contract Number" with value "332"
    And Click button "Search"
    And Click edit based on type contract "TWO WHEELERS"
    And Verify Tab Matrix for "TWO_WHEELERS"
    And Click button "Logout"
    And Close browser

  Scenario: Add Mistake based on contract number and type contract TWO WHEELERS EFP
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Additional Mistake"
    And Type on Textbox label "Contract Number" with value "331"
    And Click button "Search"
    And Click edit based on type contract "TWO WHEELERS EFP"
    And Verify Tab Matrix for "TWO_WHEELERS_EFP"
    And Click button "Logout"
    And Close browser

  Scenario: Add Mistake based on contract number and type contract BPKB
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Additional Mistake"
    And Type on Textbox label "Contract Number" with value "331"
    And Click button "Search"
    And Click edit based on type contract "BPKB"
    And Verify Tab Matrix for "BPKB"
  #And Checkbox General Mistake "KTP Foto Komponen Tidak Ada"
  #And Choose Dropdown mistake type "Upload Dokumen" from mistake name "KTP Foto Komponen Tidak Ada"
  #And Type on textarea note before based on mistake name "KTP Foto Komponen Tidak Ada" with value "TESTING"
  #And Click button "Save"
  #And Get text from pop up "IT Supporting Tools" with text "Mistake has been saved"
  #And Click button "OK"
  
  Scenario: Contract number with type contract TWO_WHEELERS_EFP have not claimed before or can't find contract
    Given Connect to APP_ACCOUNT C1
    And Exec Query for Delete Data From DB_C1 with query "DELETE FROM CONTRACT_DISPATCHER_CLAIM WHERE CONTRACT_NUMBER = '331' TYPE_CONTRACT = 'TWO_WHEELERS_EFP' AND STATUS = 'DONE'"
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Additional Mistake"
    And Type on Textbox label "Contract Number" with value "331"
    And Click button "Search"
    And Get text from pop up "IT Supporting Tools" with text "Cannot find contract"
    And Click button "OK"