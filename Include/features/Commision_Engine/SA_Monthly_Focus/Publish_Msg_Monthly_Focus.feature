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
Feature: Test the Monthly Focus Rabbit Queue
  I want to use this template for my feature file

  @tag1
  Scenario: Publish Message for Monthly Focus with RabbitMQ
    Given Connect Database Commision Engine
    And Select Contract Number from Table CE_MONTHLY_FOCUS
    Given Go to RabbitMQ
    When Login RabbitMQ with valid credentials
    Then Login to RabbitMQ Success
    And Select Tab "Queues"
    And Set Filter "Monthly"
    And Click Service Name RabbitMQ "ce.monthly-focus.queue"
    And Fill payload
    And Click button in RabbitMQ "Publish message"
    And Close browser
    And Select Contract Number from Table CE_COMMISSION to verify publish message