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
Feature: Check Document in every step of TW Hardcopy Journey
  I want to use this template for my feature file

  @tag1
  Scenario: Check Email sent(There is unchecked document in Table 1)
  	Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "TW - Hardcopy Journey"
    And Type on Textbox label "Contract Number" with value "331"
    And Click button "Search"
    And Verify Table Hardcopy Journey Exist
    And Verify Unchecked Documents of Table 1 Hardcopy Journey
    And Click button "Save"
    And Get text from pop up "warning" with text "Email notification has been sent"
    And Click button "OK"
    And Get text from pop up "Saved" with text "Successfully saved"
    And Click button "OK"
    Given Go to Outlook
    When Login Outlook with valid credentials
    Then Login Outlook Succeed
    And Verify Email Sent
    And Verify Mistake Hardcopy Journey Sent in Email
    
   #Scenario: Check Email Not Sent(Table 1 all checked)
  #	Given Go to IST
    #When Login IST with valid credentials
      #| username    | password                 |
      #| mobile.test | heMxIzEAyQpycx257HePHg== |
    #Then Login Success for contract dispatcher
    #And Select Menu "TW - Hardcopy Journey"
    #And Type on Textbox label "Contract Number" with value "331"
    #And Click button "Search"
    #And Verify Table Hardcopy Journey Exist
    #And Verify Unchecked Documents of Table 1 Hardcopy Journey
    #Given Go to Outlook
    #When Login Outlook with valid credentials
    #Then Login Outlook Succeed
    #And Verify Email Not Sent
    #And Verify Mistake Hardcopy Journey Sent in Email
    
    
  #Scenario: 1. Received Hardcopy Document from Dealer, 1. Chasis Number Letter
    #Given Go to IST
    #When Login IST with valid credentials
      #| username    | password                 |
      #| mobile.test | heMxIzEAyQpycx257HePHg== |
    #Then Login Success for contract dispatcher
    #And Select Menu "TW - Hardcopy Journey"
    #And Type on Textbox label "Contract Number" with value "331"
    #And Click button "Search"
    #And Verify Table Hardcopy Journey Exist
    #And Click checkbox for "1. Chassis Number Letter" from "1. Received Hardcopy Document from Dealer"
    #And Click button "Save"
    #And Wait page for load
    #And Get text from pop up "warning" with text "Email notification has been sent"
    #And Click button "OK"
    #And Get text from pop up "Saved" with text "Successfully saved"
    #And Click button "OK"
    #And Click button "Logout"
    #And Close browser