Feature: Select the Hotel 

Scenario Outline: Select which Hotel
Given User enters "<loc>" and "<hotel>" and "<type>" and "<num>" and "<dateIn>" and "<dateOut>" and "<adult>" and "<child>"
And User Click on Submit button

Examples:
|loc|hotel|type|num|dateIn|dateOut|adult|child|
|Paris|Hotel Sunshine|Standard|1 - One|24/03/2023|25/03/2023|1 - One|0 - None|