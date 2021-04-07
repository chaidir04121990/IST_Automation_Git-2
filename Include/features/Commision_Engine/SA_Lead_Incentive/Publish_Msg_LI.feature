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
Feature: Test Lead Incentive publish msg with RabbitMQ
  I want to use this template for my feature file

  @tag1
  Scenario: Publish Message CI with PRODUCT_PROFILE_CODE=PP_BUYBACK
    Given Connect Database Commision Engine
    And Select Contract Number from CE_MASTER_DATA Where PRODUCT_PROFILE_CODE="PP_BUYBACK"
    Given Go to RabbitMQ
    When Login RabbitMQ with valid credentials
    Then Login to RabbitMQ Success
    And Select Tab "Queues"
    And Set Filter "Incentive"
    And Click Service Name RabbitMQ "ce.lead-incentive.queue"
    And Fill payload
    And Click button in RabbitMQ "Publish message"
    And Close browser
    And Compare PRESENTED_INTEREST_RATE and LOAN_AMOUNT of the Contract Number with MIN_INTEREST AND MAX_INTEREST AND MIN_CONTRACT_AMOUNT AND MAX_CONTRACT_AMOUNT
    And Select Contract Number from Table CE_COMMISSION to verify publish message
  
  #Scenario: Publish Message CI with PRODUCT_PROFILE_CODE=PP_SAI
    #Given Connect Database Commision Engine
    #And Select Contract Number from CE_MASTER_DATA Where PRODUCT_PROFILE_CODE="PP_SAI"
    #Given Go to RabbitMQ
    #When Login RabbitMQ with valid credentials
    #Then Login to RabbitMQ Success
    #And Select Tab "Queues"
    #And Set Filter "Incentive"
    #And Click Service Name RabbitMQ "ce.lead-incentive.queue"
    #And Fill payload
    #And Click button in RabbitMQ "Publish message"
    #And Close browser
    #And Compare PRESENTED_INTEREST_RATE and LOAN_AMOUNT of the Contract Number with MIN_INTEREST AND MAX_INTEREST AND MIN_CONTRACT_AMOUNT AND MAX_CONTRACT_AMOUNT
    #And Select Contract Number from Table CE_COMMISSION to verify publish message
  #
  #Scenario: Publish Message CI with PRODUCT_PROFILE_CODE=PP_MPF
    #Given Connect Database Commision Engine
    #And Select Contract Number from CE_MASTER_DATA Where PRODUCT_PROFILE_CODE="PP_MPF"
    #Given Go to RabbitMQ
    #When Login RabbitMQ with valid credentials
    #Then Login to RabbitMQ Success
    #And Select Tab "Queues"
    #And Set Filter "Incentive"
    #And Click Service Name RabbitMQ "ce.lead-incentive.queue"
    #And Fill payload
    #And Click button in RabbitMQ "Publish message"
    #And Close browser
    #And Compare PRESENTED_INTEREST_RATE and LOAN_AMOUNT of the Contract Number with MIN_INTEREST AND MAX_INTEREST AND MIN_CONTRACT_AMOUNT AND MAX_CONTRACT_AMOUNT
    #And Select Contract Number from Table CE_COMMISSION to verify publish message