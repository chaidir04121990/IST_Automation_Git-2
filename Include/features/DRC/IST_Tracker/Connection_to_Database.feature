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
Feature: Connection to Database IST Tracker
  I want to use this template for my feature file

  @tag1
  Scenario: Select Menu Management Assignment to give assign contract PAPERLESS POS
  	#Given Go to IST Tracker
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Arrow Menu "Contract Dispatcher Admin"
    And Select Menu "Management Assignment"
    And Click button "Reset All User"
    And Get text from pop up "Confirmation Reset All" with text "Are you sure ?"
    And Click button "OK"
    And Wait page for load
    And Notification "Reset All Success"
    And Select Username "mobile.test" of Management Assignment
    And Check unchecked contract type POS
    #And Select Username "mobile.test" of Management Assignment
    And Check for username if already assigned to "Paperless"
    And Click button "Logout"
    And Close browser

  Scenario: Connection to Database IST Tracker with Search data from menu(Contract Dispatcher)
    #Given Go to IST Tracker
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Contract Dispatcher"
    And Select Contract Number based on Type Contract "PAPERLESS POS"
    And Click button "Logout"
    And Close browser