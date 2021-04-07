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
  Scenario: Publish Message VAS Bonus Level 3 PROPREMIUM
    Given Connect Database Commision Engine
    Given Select from CE_MASTER_DATA "SELECT * FROM CE_MASTER_DATA WHERE PRODUCT_PROFILE_CODE !='PP_SAI' AND COMMODITY_TYPE_CODE IS NOT NULL AND ID_SALES_AGENT IS NOT NULL AND CONTRACT_NUMBER='4000011902'"
    Given Go to RabbitMQ
    When Login RabbitMQ with valid credentials
    Then Login to RabbitMQ Success
    And Select Tab "Queues"
    And Set Filter "vas"
    And Click Service Name RabbitMQ "ce.vas-bonus.queue"
    And Fill payload
    And Click button in RabbitMQ "Publish message"
    And Close browser
    Given Select from CE_VAS
    Given Select from CE_VAS_EXCLUSION
    Given Select from CE_VAS_BONUS
    Given Verify Commission

  Scenario: Publish Message VAS Bonus Level 3
    Given Connect Database Commision Engine
    Given Select from CE_MASTER_DATA "SELECT * FROM CE_MASTER_DATA WHERE PRODUCT_PROFILE_CODE !='PP_SAI' AND COMMODITY_TYPE_CODE IS NOT NULL AND ID_SALES_AGENT IS NOT NULL AND CONTRACT_NUMBER='4000015771'"
    Given Go to RabbitMQ
    When Login RabbitMQ with valid credentials
    Then Login to RabbitMQ Success
    And Select Tab "Queues"
    And Set Filter "vas"
    And Click Service Name RabbitMQ "ce.vas-bonus.queue"
    And Fill payload
    And Click button in RabbitMQ "Publish message"
    And Close browser
    Given Select from CE_VAS
    Given Select from CE_VAS_EXCLUSION
    Given Select from CE_VAS_BONUS
    Given Verify Commission

  Scenario: Publish Message VAS Bonus Level 1
    Given Connect Database Commision Engine
    Given Select from CE_MASTER_DATA "SELECT * FROM CE_MASTER_DATA WHERE PRODUCT_PROFILE_CODE !='PP_SAI' AND COMMODITY_TYPE_CODE IS NOT NULL AND ID_SALES_AGENT IS NOT NULL"
    Given Go to RabbitMQ
    When Login RabbitMQ with valid credentials
    Then Login to RabbitMQ Success
    And Select Tab "Queues"
    And Set Filter "vas"
    And Click Service Name RabbitMQ "ce.vas-bonus.queue"
    And Fill payload
    And Click button in RabbitMQ "Publish message"
    And Close browser
    Given Select from CE_VAS
    Given Select from CE_VAS_EXCLUSION
    Given Select from CE_VAS_BONUS
    Given Verify Commission