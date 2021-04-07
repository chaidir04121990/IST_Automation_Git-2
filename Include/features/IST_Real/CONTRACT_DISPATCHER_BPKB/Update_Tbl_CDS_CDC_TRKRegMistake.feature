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
Feature: Update Table CONTRACT_DISPATCHER_SOURCE and CONTRACT_DISPATCHER_CLAIM for Contract Two Wheelers
  I want to use this template for Update Column Processed in CONTRACT_DISPATCHER_SOURCE and CONTRACT_DISPATCHER_CLAIM to make Contract Two Wheelers exist in Menu
  Contract Dipatcher IST.

  @tag1
  Scenario: Update Table CONTRACT_DISPATCHER_SOURCE and CONTRACT_DISPTACHER_CLAIM
    Given Connect to Database
    And Update Tbl CONTRACT DISPATCHER SRC BPKB To Change PROCESSED From Y to N For BPKB
    And Update Tbl CONTRACT DISPATCHER CLAIM To Delete PROCESS From Column STATUS
    And Delete Contract From TRK_REGISTRATION_MISTAKE