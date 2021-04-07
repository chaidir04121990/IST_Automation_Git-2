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
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
 Scenario: SLIK Gateway Non Customer View Detail Link
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu SLIK Gateway NonCustomer
    #And Input Data KTP Number for Search Result
    And Select Status is "REQUESTED"
    And Click button "Search"
    #And Verify Search Result with KTP Number
    #And Verify Search Result data
    And Verify Search Result Based on Result Status
    And Click View Detail Link
    And Take Screenshot "View_detail_NonCutomer.png"
    And Verify Slik Result Detail Link
    And Click button "Logout"
    And Close browser