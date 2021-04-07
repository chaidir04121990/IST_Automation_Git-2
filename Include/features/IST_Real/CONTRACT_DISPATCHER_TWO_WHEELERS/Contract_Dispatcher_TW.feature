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
Feature: Contract Dispatcher Two Wheelers
  I want to use this template for my feature file

  @tag1
  Scenario: Select Menu Contract Dispatcher and Select Contract based on type contract Two Wheelers
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Contract Dispatcher"
    And Select Contract Number based on Type Contract "TWO_WHEELERS"
    And Click button "Claim"
    And Varify the mistake detail already match with the matrix Base on Type Contract
    And Click on Tab "KTP"
    And Checkbox General Mistake "20. KTP atau Resi - Alamat tetap pemohon pada sistem (HoS) berbeda dengan KTP"
    And Choose Dropdown mistake type "Beda RT" from mistake name "20. KTP atau Resi - Alamat tetap pemohon pada sistem (HoS) berbeda dengan KTP"
    And Type on textarea note before based on mistake name "20. KTP atau Resi - Alamat tetap pemohon pada sistem (HoS) berbeda dengan KTP" with value "TESTING"
    And Type on textarea note after based on mistake name "20. KTP atau Resi - Alamat tetap pemohon pada sistem (HoS) berbeda dengan KTP" with value "TESTING after"
    And Click button "Save"
    And Get text from pop up "IT Supporting Tools" with text "Mistake has been saved"
    #And Get text from pop up "IT Supporting Tools" with text "Wajib Update PIF"
    #And Get text from pop up "IT Supporting Tools" with text "Registered success"	
    And Click button "OK"
    And Click button "Logout"
    #And Close browser