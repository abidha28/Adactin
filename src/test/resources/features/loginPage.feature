Feature: Adactin Page Validation

Scenario Outline: Validate Login Page
Given User is on Adactin Page
When User enter "<username>" and "<password>"
And User click on login button 

Examples:
|username|password|
|Abidha2806|abi@2806|