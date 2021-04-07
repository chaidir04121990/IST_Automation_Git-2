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
  Scenario: Check Contract from RTD_CONTRACT where STATUS is DONE
    Given Connect to Database RTD
    And Select Contract from Table in DB with Query "SELECT RTD_CONTRACT_TEMP.KTP,RTD_CONTRACT_TEMP.CONTRACT_ID,RTD_CONTRACT_TEMP.RECIPIENT_BANK_ACCOUNT_NUMBER,RTD_CONTRACT_TEMP.STATUS FROM RTD_CONTRACT_TEMP LEFT JOIN RTD_CONTRACT ON RTD_CONTRACT_TEMP.CONTRACT_ID=RTD_CONTRACT.CONTRACT_ID WHERE RTD_CONTRACT_TEMP.TYPE_CONTRACT='MPF' AND RTD_CONTRACT.STATUS=11 AND RTD_CONTRACT_TEMP.IS_RTD='Y' AND RTD_CONTRACT.PGW_RESPONSE_CODE='00'"
    #And Select Contract from Table in DB with Query "SELECT * FROM RTD_CONTRACT WHERE STATUS=11"