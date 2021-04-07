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
Feature: TRIS update
  I want to use this template for my feature file

  @tag1
  Scenario: Update Invoice Data Cetak
    #Given Go to IST
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Check User Login for Update
    And Select Arrow Menu "Invoice System"
    And Select Menu "Tracker Invoice System" 
   	And Type on Textbox label "contract number of email address" with value "9999999999"
    And Click button "Search" 
    And Verify Table Filled
    And Right Click Invoice Want to Update based on sub contract number "9999999999-7"
    And Check Invoice Format is "Cetak" 
    And Update Data Value Based on Check Point 
    And Check Corrected Result 
    And Click button "Save Invoice"
    And Verify Update Data in Invoice Summary
    And Verify Update Data in Additional Detail
    And Click button "Logout"
    And Close browser
    
    
  Scenario: Update Invoice Data General
    #Given Go to IST
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Check User Login for Update
    And Select Arrow Menu "Invoice System"
    And Select Menu "Tracker Invoice System" 
   	And Type on Textbox label "contract number of email address" with value "9999999999"
    And Click button "Search" 
    And Verify Table Filled
    And Right Click Invoice Want to Update based on sub contract number "9999999999-5"
    And Check Invoice Format is "General" 
    And Update Data Value Based on Check Point 
    And Check Corrected Result 
    And Click button "Save Invoice"
    And Verify Update Data in Invoice Summary
    And Verify Update Data in Additional Detail
    And Click button "Logout"
    And Close browser
    
    
  Scenario: Update Invoice Data HCI Format
    #Given Go to IST
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Check User Login for Update
    And Select Arrow Menu "Invoice System"
    And Select Menu "Tracker Invoice System" 
   	And Type on Textbox label "contract number of email address" with value "9999999999"
    And Click button "Search" 
    And Verify Table Filled
    And Right Click Invoice Want to Update based on sub contract number "9999999999-3"
    And Check Invoice Format is "HCI format" 
    And Update Data Value Based on Check Point 
    And Check Corrected Result 
    And Click button "Save Invoice"
    And Verify Update Data in Invoice Summary
    And Verify Update Data in Additional Detail
    And Click button "Logout"
    And Close browser
    

  Scenario: Update Invoice Data School Invoice
    #Given Go to IST
    Given Go to ISTools
    When Login IST with valid credentials
      | username    | password                 |
      | mobile.test | heMxIzEAyQpycx257HePHg== |
    Then Login Success for contract dispatcher
    And Check User Login for Update
    And Select Arrow Menu "Invoice System"
    And Select Menu "Tracker Invoice System" 
   	And Type on Textbox label "contract number of email address" with value "9999999999"
    And Click button "Search" 
    And Verify Table Filled
    And Right Click Invoice Want to Update based on sub contract number "9999999999-1"
    And Check Invoice Format is "School Invoice" 
    And Update Data Value Based on Check Point 
    And Check Corrected Result 
    And Click button "Save Invoice"
    And Verify Update Data in Invoice Summary
    And Verify Update Data in Additional Detail
    And Click button "Logout"
    And Close browser
    
 