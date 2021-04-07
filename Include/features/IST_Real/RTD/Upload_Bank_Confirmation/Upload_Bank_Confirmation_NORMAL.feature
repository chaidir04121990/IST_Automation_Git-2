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
Feature: Upload Bank Confirmation with correct template
  I want to use this template for my feature file

  @tag1
  Scenario: Click button upload and make sure it will pop up new window upload file
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success
    And Select Arrow Menu "Real Time Disbursement"
    And Select Menu "Upload Bank Confirmation"
    And Click button "Upload"
    And Click button "Logout"
    And Close browser

  Scenario: Upload file Bank Confirmation
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success
    And Select Arrow Menu "Real Time Disbursement"
    And Select Menu "Upload Bank Confirmation"
    And Upload file "AutoCreditStatusTEST2.txt"
    And Verify Search Result Presents
    And Click button "Logout"
    And Close browser

  Scenario: View Detail
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success
    And Select Arrow Menu "Real Time Disbursement"
    And Select Menu "Upload Bank Confirmation"
    And Upload file "AutoCreditStatusTEST2.txt"
    And Verify Search Result Presents
    And Click View Detail
    And Verify Information in View Detail
    And Click button "Logout"
    And Close browser
    
    #Scenario: Activate
