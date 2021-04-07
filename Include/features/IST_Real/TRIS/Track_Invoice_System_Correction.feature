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
Feature: TRIS Correction
  I want to use this template for my feature file

  @tag1
  Scenario: Correction Check and Correction Remark
    #Given Go to IST
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Check User Login for Update
    And Select Arrow Menu "Invoice System"
    And Select Menu "Tracker Invoice System"
    And Type on Textbox label "contract number of email address" with value "9999999999"
    And Click button "Search"
    And Verify Table Filled
    And Right Click Invoice Want to Update based on sub contract number "9999999999-7"
    And Check Invoice Format is "Cetak"
    And Do Correction Check and Correction Remark
    And Check Corrected Result
    And Click button "Save Invoice"
    And Verify Update Checking Result in Invoice Summary
    And Click button "Logout"
    And Close browser


  Scenario: Repeated Mistake Check
    #Given Go to IST
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Check User Login for Update
    And Select Arrow Menu "Invoice System"
    And Select Menu "Tracker Invoice System"
    And Type on Textbox label "contract number of email address" with value "9999999999"
    And Click button "Search"
    And Verify Table Filled
    And Right Click Invoice Want to Update based on sub contract number "9999999999-7"
    And Check Invoice Format is "Cetak"
    And Do Repeated Mistake Check
    And Check Corrected Result
    And Click button "Save Invoice"
    And Verify Update Checking Result in Invoice Summary
    And Click button "Logout"
    And Close browser
    
