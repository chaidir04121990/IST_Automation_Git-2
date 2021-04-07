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
Feature: SLIK Checking Non Customer
  I want to use this template for my feature file

  Scenario: SLIK Gateway Non Customer Checking
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
		    #And Select Menu "SLIK Gateway Non Customer"
    And Select Menu SLIK Gateway NonCustomer
    And Input Data KTP Number
    #And Input Data "KTP Number *" with value "0101501422900016" for Check SLIK
    And Input Data "Name *" with value "OPEX TestingAuto" for Check SLIK
    And Input Date of Birth "20-02-1990"
    And Select Gender "Laki-laki"
    And Select Purpose is "Penilaian Calon Kemitraan"
    And Input Data "Place of Birth" with value "Jakarta" for Check SLIK
    And Input Data "Mother Maternity Name" with value "Tester Auto" for Check SLIK
    And Input KTP Address "TESTING AUTO JAKARTA"
    And Click button "Upload"
    And Upload file "new_captcha1500.png" 
    And Click button "Check SLIK"
    And Get text from pop up "Confirmation Submit Request" with text "Are you sure to submit this data ?"
    And Click button "Yes"
    #And Verify KTP Number "0101501422900015" Request Success
    And Verify KTP Number Request Success
    And Click button "OK"
    And Click button "Logout"
    And Close browser
    #Given Connect to Database
    #And Check KTP Number in Slik DB "SELECT * FROM SLIK_DATA_CUSTOMER WHERE KTP='0101501422900015' AND TYPE='NC'" 
