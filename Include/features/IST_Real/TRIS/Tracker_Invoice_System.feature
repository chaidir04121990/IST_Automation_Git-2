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
  Scenario: Search Invoice
    #Given Go to IST
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Arrow Menu "Invoice System"
    And Select Menu "Tracker Invoice System"
    And Type on Textbox label "contract number of email address" with value "3900009103"
    And Click button "Search"
    And Verify Table Filled
    And Click button "Logout"
    And Close browser

  Scenario: Add Invoice Cetak
    #Given Go to IST
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Select Arrow Menu "Invoice System"
    And Select Menu "Tracker Invoice System"
    And Type on Textbox label "contract number of email address" with value "3900009103"
    And Click button "Search"
    And Verify Table Filled
    And Click button "Add Invoice"
    And Wait page for load
    And Verify Pop Up Window Invoice Detail
    And Click dropdown "Invoice Format" and select value "Cetak" 
    And Wait page for load
    And sleep
    #And Choose Data value based on Check point
    #And Input Data value based on Check point
    #And Input date "04-12-2019"
    #And Choose Mistake value based on Check point
    #And Type Mistake Remark based on Check point
    And Click button "Upload"
    And Upload file "coba.jpg"
    And Click button "Save Invoice"
    #And Verify Invoice Amount
    And Close browser
    
    #Scenario: Add Invoice General
    #Given Go to IST
    #Given Go to ISTools
    #When Login IST with valid credentials
      #| username    | password                 |
      #| mobile.test | heMxIzEAyQpycx257HePHg== |
    #Then Login Success for contract dispatcher
    #And Select Arrow Menu "Invoice System"
    #And Select Menu "Tracker Invoice System"
    #And Type on Textbox label "contract number of email address" with value "3900009103"
    #And Click button "Search"
    #And Verify Table Filled
    #And Click button "Add Invoice"
    #And Wait page for load
    #And Verify Pop Up Window Invoice Detail
    #And Click dropdown "Invoice Format" and select value "General" 
    #And Wait page for load
    #And sleep
    #And Choose Data value based on Check point
    #And Input Data value based on Check point
    #And Input date "05-12-2019"
    #And Choose Mistake value based on Check point
    #And Type Mistake Remark based on Check point
    #And Click button "Upload"
    #And Upload file "coba.jpg"
    #And Click button "Logout"
    #And Close browser
    #
    #Scenario: Add Invoice HCI format
    #Given Go to IST
    #Given Go to ISTools
    #When Login IST with valid credentials
      #| username    | password                 |
      #| mobile.test | heMxIzEAyQpycx257HePHg== |
    #Then Login Success for contract dispatcher
    #And Select Arrow Menu "Invoice System"
    #And Select Menu "Tracker Invoice System"
    #And Type on Textbox label "contract number of email address" with value "3900009103"
    #And Click button "Search"
    #And Verify Table Filled
    #And Click button "Add Invoice"
    #And Wait page for load
    #And Verify Pop Up Window Invoice Detail
    #And Click dropdown "Invoice Format" and select value "HCI format" 
    #And Wait page for load
    #And sleep
    #And Choose Data value based on Check point
    #And Input Data value based on Check point
    #And Input date "05-12-2019"
    #And Choose Mistake value based on Check point
    #And Type Mistake Remark based on Check point
    #And Click button "Upload"
    #And Upload file "coba.jpg"
    #And Click button "Logout"
    #And Close browser
    #
    #Scenario: Add Invoice School Invoice
    #Given Go to IST
    #Given Go to ISTools
    #When Login IST with valid credentials
      #| username    | password                 |
      #| mobile.test | heMxIzEAyQpycx257HePHg== |
    #Then Login Success for contract dispatcher
    #And Select Arrow Menu "Invoice System"
    #And Select Menu "Tracker Invoice System"
    #
    #And Type on Textbox label "contract number of email address" with value "3900009103"
    #And Click button "Search"
    #And Verify Table Filled
    #And Click button "Add Invoice"
    #And Wait page for load
    #And Verify Pop Up Window Invoice Detail
    #And Click dropdown "Invoice Format" and select value "School Invoice"
    #And Wait page for load
    #And sleep
    #And Choose Data value based on Check point
    #And Input Data value based on Check point
    #And Input date "05-12-2019"
    #And Choose Mistake value based on Check point
    #And Type Mistake Remark based on Check point
    #And Click button "Upload"
    #And Upload file "coba.jpg" 
    #And Click button "Logout"
    #And Close browser
    