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
Feature: Management City
  I want to use this template for my feature file

  @tag1
  Scenario: Add new City code
    Given Go to IST
    When Login IST with valid credentials
      | username          | password                         |
      | chaidir.pratama01 | GEMRn+q0A1vXpnu6OKFSUJla5LixoEwM |
    Then Login Success for contract dispatcher
    And Select Arrow Menu "Contract Dispatcher Admin"
    And Select Sub-Menu "Management City" from Contract Dispatcher Admin
    And Type on Textbox label "City Code" with value "MALUKU"
    And Click button "Add"
    And Get text from pop up "Confirmation Add" with text "Confirmation Add"
    And Click button "OK"
    And Notification "Add Success"
    And Click button "Logout"
    And Close browser

  Scenario: Delete existing city
    Given Go to IST
    When Login IST with valid credentials
      | username          | password                         |
      | chaidir.pratama01 | GEMRn+q0A1vXpnu6OKFSUJla5LixoEwM |
    Then Login Success for contract dispatcher
    And Select Arrow Menu "Contract Dispatcher Admin"
    And Select Sub-Menu "Management City" from Contract Dispatcher Admin
    And Click Delete City button based on City Name "MALUKU"
    And Get text from pop up "Confirmation Delete" with text "Confirmation Delete"
    And Click button "OK"
    And Notification "Delete Success"
    And Click button "Logout"
    And Close browser
