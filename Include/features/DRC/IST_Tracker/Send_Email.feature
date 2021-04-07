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
Feature: Send Email Handling
  I want to use this template for my feature file

  @tag1
  Scenario: Send Email by Select Menu Email Handling from Invoice System then Generate Email Handling
    #Given Go to IST Tracker
    Given Go to IST
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Arrow Menu "Invoice System"
    And Select Menu "Email Handling"
    And Select Email handling "Email tidak terdaftar"
    And Type EmailClient on "Alamat Email yang digunakan client" with value "chaidir04121990@yahoo.co.id"
    And Click button "Generate Email"