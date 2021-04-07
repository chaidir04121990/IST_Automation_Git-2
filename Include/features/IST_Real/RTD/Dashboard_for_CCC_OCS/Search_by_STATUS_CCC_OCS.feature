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
Feature: Search by STATUS for Dashboard for BO In Payment
  I want to use this template for my feature file

  @tag1
  Scenario: Search by STATUS Eligible to Disburse
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success
    And Select Arrow Menu "Real Time Disbursement"
    And Select Menu "Dashboard for CCC/OCS"
    And Select STATUS "Eligible to disburse"
    And Click button "Search"
    And Verify Search Result Presents
    And Click button "Logout"
    And Close browser

  Scenario: Search by STATUS Waiting approval from Risk
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success
    And Select Arrow Menu "Real Time Disbursement"
    And Select Menu "Dashboard for CCC/OCS"
    And Select STATUS "Waiting approval from Risk"
    And Click button "Search"
    And Verify Search Result Presents
    And Click button "Logout"
    And Close browser

  Scenario: Search by STATUS Waiting for approval from In Payment
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success
    And Select Arrow Menu "Real Time Disbursement"
    And Select Menu "Dashboard for CCC/OCS"
    And Select STATUS "Waiting for approval from In Payment"
    And Click button "Search"
    And Verify Search Result Presents
    And Click button "Logout"
    And Close browser
    
    Scenario: Search by STATUS Not eligible to disburse
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success
    And Select Arrow Menu "Real Time Disbursement"
    And Select Menu "Dashboard for CCC/OCS"
    And Select STATUS "Not eligible to disburse"
    And Click button "Search"
    And Verify Search Result Presents
    And Click button "Logout"
    And Close browser

  Scenario: Search by STATUS Ready to disburse
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success
    And Select Arrow Menu "Real Time Disbursement"
    And Select Menu "Dashboard for CCC/OCS"
    And Select STATUS "Ready to disburse"
    And Click button "Search"
    And Verify Search Result Presents
    And Click button "Logout"
    And Close browser
    
    Scenario: Search by STATUS Failed due to invalid bank account
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success
    And Select Arrow Menu "Real Time Disbursement"
    And Select Menu "Dashboard for CCC/OCS"
    And Select STATUS "Failed due to invalid bank account"
    And Click button "Search"
    And Verify Search Result Presents
    And Click button "Logout"
    And Close browser

    Scenario: Search by STATUS Failed due to system error
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success
    And Select Arrow Menu "Real Time Disbursement"
    And Select Menu "Dashboard for CCC/OCS"
    And Select STATUS "Failed due to system error"
    And Click button "Search"
    And Verify Search Result Presents
    And Click button "Logout"
    And Close browser
    
    Scenario: Search by STATUS Failed due to insufficient fund
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success
    And Select Arrow Menu "Real Time Disbursement"
    And Select Menu "Dashboard for CCC/OCS"
    And Select STATUS "Failed due to insufficient fund"
    And Click button "Search"
    And Verify Search Result Presents
    And Click button "Logout"
    And Close browser
    
    Scenario: Search by STATUS Failed due to not supported bank
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success
    And Select Arrow Menu "Real Time Disbursement"
    And Select Menu "Dashboard for CCC/OCS"
    And Select STATUS "Failed due to not supported bank"
    And Click button "Search"
    And Verify Search Result Presents
    And Click button "Logout"
    And Close browser
    
    Scenario: Search by STATUS Manual Disbursement
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success
    And Select Arrow Menu "Real Time Disbursement"
    And Select Menu "Dashboard for CCC/OCS"
    And Select STATUS "Manual Disbursement"
    And Click button "Search"
    And Verify Search Result Presents
    And Click button "Logout"
    And Close browser
    
    Scenario: Search by STATUS DONE
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success
    And Select Arrow Menu "Real Time Disbursement"
    And Select Menu "Dashboard for CCC/OCS"
    And Select STATUS "DONE"
    And Click button "Search"
    And Verify Search Result Presents
    And Click button "Logout"
    And Close browser
    
    Scenario: Search by STATUS Waiting Partner Confirmation
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success
    And Select Arrow Menu "Real Time Disbursement"
    And Select Menu "Dashboard for CCC/OCS"
    And Select STATUS "Waiting Partner Confirmation"
    And Click button "Search"
    And Verify Search Result Presents
    And Click button "Logout"
    And Close browser
    
    Scenario: Search by STATUS Success to Disburse
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success
    And Select Arrow Menu "Real Time Disbursement"
    And Select Menu "Dashboard for CCC/OCS"
    And Select STATUS "Success to Disburse"
    And Click button "Search"
    And Verify Search Result Presents
    And Click button "Logout"
    And Close browser
    