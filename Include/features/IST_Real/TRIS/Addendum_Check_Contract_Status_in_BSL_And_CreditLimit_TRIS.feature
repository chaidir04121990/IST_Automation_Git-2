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
Feature: Addendum
  I want to use this template for my feature file

  @tag1
  Scenario: Check Contract Status from BSL is Active and Credit Left before 90%	 in TRIS is 0 Purpopse in BSL and TRIS are different
    Given Go to BSL C1
    When Login BSL C1 with valid credentials
    Then Login BSL C1 Succeed
    And Select "Search for contract"
    And Write Active Contract Number
    And Click Button "Search"
    And Check Contract Status BSL
    #Given Go to IST
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Arrow Menu "Invoice System"
    And Select Menu "Tracker Invoice System"
    And Type on Textbox label "contract number of email address" with Active Contract Number in BSL and TRIS Credit Left Before 90=0
    And Click button "Search"
    And Check_Credit_Left_before_90%
    #And Verify purpose in BSL and TRIS are different
    And Click Button "Submit"
    And Get text from pop up "Confirm" with text "Apakah Kamu yakin akan memproses invoice ini"
    And Click button "Yes"
    And Wait page for load
    And Get text from pop up "IT Supporting Tools" with text "Successfully submitted"
    And Click button "OK"
    And Close browser
    Given Go to Outlook
    When Login Outlook with valid credentials
    Then Login Outlook Succeed
    And Verify Email Addendum Sent

  #Scenario: Check Contract Status from BSL is Active and Credit Left before 90% in TRIS is Not 0
    #Given Go to BSL C1
    #When Login BSL C1 with valid credentials
    #Then Login BSL C1 Succeed
    #And Select "Search for contract"
    #And Write Contract number "3900017899"
    #And Click Button "Search"
    #And Check Contract Status BSL
    #Given Go to IST
    #When Login IST with valid credentials
      #| username    | password                 |
      #| mobile.test | heMxIzEAyQpycx257HePHg== |
    #Then Login Success for contract dispatcher
    #And Select Arrow Menu "Invoice System"
    #And Select Menu "Tracker Invoice System"
    #And Type on Textbox label "contract number of email address" with value "3900017899"
    #And Click button "Search"
    #And Check_Credit_Left_before_90%
    #And Click Button "Submit"
    #Given Go to Outlook
    #When Login Outlook with valid credentials
    #Then Login Outlook Succeed
    #And Verify Email Sent
#
  #Scenario: Check Contract Status from BSL is Cancelled
    #Given Go to BSL C1
    #When Login BSL C1 with valid credentials
    #Then Login BSL C1 Succeed
    #And Select "Search for contract"
    #And Write Contract number "3900009103"
    #And Click Button "Search"
    #And Check Contract Status BSL
