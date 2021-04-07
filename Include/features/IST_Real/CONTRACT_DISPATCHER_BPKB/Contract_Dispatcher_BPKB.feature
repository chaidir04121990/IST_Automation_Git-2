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
Feature: Contract Dispatcher BPKB
  I want to use this template for my feature file

  @tag1
  Scenario: Assign User to Contract BPKB
  Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success
    And Select Arrow Menu "Contract Dispatcher Admin"
    And Select Menu "Management Assignment"
    And Select Username "mobile.test" of Management Assignment
    And Check for username if already assigned to "BPKB"
    And Wait page for load
    And Click button "Logout"
    And Close browser
  
  Scenario: Select Contract Dispatcher Menu based on type contract BPKB
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success
    And Select Menu "Contract Dispatcher"
    And Select Contract Number based on Type Contract "BPKB"
    And Click button "Claim"
    And Varify the mistake detail already match with the matrix Base on Type Contract
    And Checkbox General Mistake "01. BPKB bagian depan tidak ada"
    And Choose Dropdown mistake type "Dokumen diunggah tidak ada" from mistake name "01. BPKB bagian depan tidak ada"
    And Type on textarea note before based on mistake name "01. BPKB bagian depan tidak ada" with value "TESTING"
    And Click button "Save"
    And Get text from pop up "IT Supporting Tools" with text "Mistake has been saved"
    #And Get text from pop up "IT Supporting Tools" with text "Wajib Update PIF"
    #And Get text from pop up "IT Supporting Tools" with text "Contract will be RETURNED"
    And Click button "OK"
    And Click button "Logout"
    And Close browser