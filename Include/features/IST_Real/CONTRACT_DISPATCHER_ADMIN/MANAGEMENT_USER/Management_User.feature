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
Feature: Management User
  I want to use this template for my feature file

  @tag1
  Scenario: Add User and Base City
    Given Go to IST
    When Login IST with valid credentials
      | username          | password                         |
      | chaidir.pratama01 | GEMRn+q0A1vXpnu6OKFSUJla5LixoEwM |
    Then Login Success for contract dispatcher
    And Select Menu Contract Dispatcher Admin
    And Select Sub-Menu "Management User" from Contract Dispatcher Admin
    And Type on textbox label Username with value: "aab"
    And Click dropdown Base City with values
      | city        |
      | B@TAM       |
      | BANDUNG     |
      | BATAM       |
      | DENPASAR    |
      | JABODETABEK |
      | MALANG      |
      | MEDAN       |
      | SURABAYA    |
      | YOGYAKARTA  |
    And Click button "Add"
    And Get text from pop up "Confirmation Add" with text "Are you sure ?"
    And Click button "OK"
    And Notification "Add Success"
    And Click button "Logout"
    And Close browser
    #And Verify new user present
 
    Scenario: Edit User
    Given Go to IST
    When Login IST with valid credentials
      | username          | password                         |
      | chaidir.pratama01 | GEMRn+q0A1vXpnu6OKFSUJla5LixoEwM |
    Then Login Success for contract dispatcher
    And Select Menu Contract Dispatcher Admin
    And Select Sub-Menu "Management User" from Contract Dispatcher Admin
    And Click Edit User button based on username "aab"
    And Edit dropdown based on label "Base City" with values "BANDUNG"
    And Click button "Update"
    And Get text from pop up "Confirmation Update" with text "Are you sure ?"
    And Click button "OK"
    And Notification "Update Success"
    And Click button "Logout"
    And Close browser
    
    Scenario: Delete User
    Given Go to IST
    When Login IST with valid credentials
      | username          | password                         |
      | chaidir.pratama01 | GEMRn+q0A1vXpnu6OKFSUJla5LixoEwM |
    Then Login Success for contract dispatcher
    And Select Menu Contract Dispatcher Admin
    And Select Sub-Menu "Management User" from Contract Dispatcher Admin
    And Click Delete User button based on username "aab"
    And Get text from pop up "Confirmation Delete" with text "Are you sure ?"
    And Click button "OK"
    And Notification "Delete Success"
    And Click button "Logout"
    And Close browser
