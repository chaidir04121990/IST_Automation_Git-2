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
Feature: Login
  I want to use this template for my Login file

  @tag1
  Scenario: Login IST Success
    Given Go to IST
    When Login IST with valid credentials
      | username          | password                         |
      | chaidir.pratama01 | GEMRn+q0A1vXpnu6OKFSUJla5LixoEwM |
    Then Login Success
    And Click button "Logout"
    And Close browser

  @tag2
  Scenario: Login IST Wrong username
    Given Go to IST
    When Login IST with wrong credentials
      | username          | password                         |
      | chaidir.pratama02 | GEMRn+q0A1vXpnu6OKFSUJla5LixoEwM |
    Then Login Failed
    And Close browser

  @tag3
  Scenario: Login IST Wrong password
    Given Go to IST
    When Login IST with wrong credentials
      | username          | password     |
      | chaidir.pratama01 | nbPRAawFRnE= |
    Then Login Failed
    And Close browser

  @tag4
  Scenario: Login IST Wrong username and password
    Given Go to IST
    When Login IST with wrong credentials
      | username          | password     |
      | chaidir.pratama0X | nbPRAawFRnE= |
    Then Login Failed
    And Close browser
