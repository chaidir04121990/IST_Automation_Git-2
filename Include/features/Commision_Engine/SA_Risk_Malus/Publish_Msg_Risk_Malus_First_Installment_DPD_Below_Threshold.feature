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
Feature: Test Risk Malus RabbitMQ
  I want to use this template for my feature file

  @tag1
  Scenario: Deduction for RM Monthly Bonus first Installment Does not Applied because DPD below threshold. CN:4000015076
    Given Connect Database Commision Engine
    Given Select from CE_MASTER_DATA "SELECT * FROM CE_MASTER_DATA WHERE CONTRACT_NUMBER='4000015076'"
    Given Consume Endpoint Get Installment DPD below Threshold
    Given Go to RabbitMQ
    When Login RabbitMQ with valid credentials
    Then Login to RabbitMQ Success
    And Select Tab "Queues"
    And Set Filter "risk"
    And Click Service Name RabbitMQ "ce.risk-malus-deduction.queue"
    And Fill payload Risk Malus Monthly Bonus
    And Click button in RabbitMQ "Publish message"
    And Close browser
    And Verify ValuePaid