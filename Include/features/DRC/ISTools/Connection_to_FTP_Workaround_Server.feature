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
Feature: Connection to FTP Workaround Server Portal HCID
  I want to use this template for my feature file

  @tag1
  Scenario: Select ROLE_IT to enable Menu Outgoing Payment Monitoring (MANDATORY)
    #Given Go to IST Tracker
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Role Management"
    And Choose Dropdown Username "mobile.test"
    And Select Role "ROLE_IT"
    And Click button "Change"
    And Get text from pop up "Confirm" with text "Are you sure?"
    And Click button "Yes"
    And Click button "Logout"
    And Close browser
  
  
  Scenario: Connection to FTP Workaround Server by Menu Outgoing Payment Monitoring
    #Given Go to Portal HCID
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
      Then Login Success for contract dispatcher
      And Select Menu "Outgoing Payment Monitoring"
      And Verify Table Exist
      And Click button "Logout"
      And Close browser