Feature: Book A Hotel 

Scenario Outline: User enters details
When User enters the details "<fname>" and "<lname>" and "<add>" and "<credit>" and "<type>" and "<month>" and "<year>" and "<ccv>"
Then click booknow button

Examples:
|fname|lname|add|credit|type|month|year|ccv|
|Abidha|Saju|No.15,West Street ,Navalur,Chennai|1234567890098765|Other|June|2022|684|