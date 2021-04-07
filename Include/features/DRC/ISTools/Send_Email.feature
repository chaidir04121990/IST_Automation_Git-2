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
   Scenario: Send Email by Hit Batch Outgoing Payment Monitoring Menu
    #Given Go to Portal HCID
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Outgoing Payment Monitoring"
    And Input Account Number with value "1331603508"
    And Input Email on Dashboard with value "chaidir04121990@yahoo.co.id"
    And Click button "Resend"
    And Get text from pop up "IT Supporting Tools" with text "Notification is waiting to process, please wait"
    And Click button "OK"