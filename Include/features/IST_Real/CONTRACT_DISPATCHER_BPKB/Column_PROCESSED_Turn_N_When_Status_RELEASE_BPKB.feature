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
Feature: Column PROCESSED in CONTRACT_DISPATCHER_SRC_BPKB change to be 'N' when STATUS in CONTRACT_DISPATCHER_CLAIM is RELEASE
  I want to use this template for my feature file

  @tag1
  Scenario: Assign User to Contract BPKB
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Arrow Menu "Contract Dispatcher Admin"
    And Select Menu "Management Assignment"
    And Select Username "mobile.test" of Management Assignment
    And Check for username if already assigned to "BPKB"
    And Wait page for load
    And Click button "Logout"
    And Close browser
  
  Scenario: Claim Contract BPKB in Contract Dispatcher Menu then idle for 10 minutes, STATUS in Table CONTRACT_DISPATCHER_CLAIM turn RELEASE and PROCESSED in CONTRACT_DISPATCHER_SRC_BPKB turns N
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Menu "Contract Dispatcher"
    And Select Contract Number based on Type Contract "BPKB"
    And Click button "Claim"
    And Sleep ten minutes
    Given Connect to Database
    And Exec Query idle for Ten Minutes "SELECT * FROM CONTRACT_DISPATCHER_SRC_BPKB WHERE TEXT_CONTRACT_NUMBER='333'"
    And Select Menu "Contract Dispatcher"

  #Scenario: Claim Contract BPKB in Contract Dispatcher Menu then check Column PROCESSED in Table CONTRACT_DISPATCHER_SRC_BPKB Must be turns to Y
    #Given Go to IST
    #When Login IST with valid credentials
      #| username    | password                 |
      #| mobile.test | heMxIzEAyQpycx257HePHg== |
    #Then Login Success for contract dispatcher
    #And Select Menu "Contract Dispatcher"
    #And Select Contract Number based on Type Contract "BPKB"
    #And Click button "Claim"
    #And Click button "Save"
    #And Get text from pop up "Confirmation Stop" with text "Are you sure?"
    #And Click button "OK"
    #And Get text from pop up "IT Supporting Tools" with text "Successfully saved"
    #And Click button "OK"
    #And Click button "Logout"
    #And Close browser
    #Given Connect to APP_ACCOUNT C1
    #And Execute Query