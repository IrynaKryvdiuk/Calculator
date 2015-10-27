Incorrect user's actions

Narrative:
In order to understand that I entered incorrect expression
As a user
I want to see notifications about errors


Scenario: The user perform incorrect operations using keyboard

Given the user is on a Google Calculator webpage
When the user enter numbers: "numbers"
Then the user should see a result "result"

Examples:
numbers | result
9 * =   | Error
7( =    | Error
+ . * 2 = | Error


Scenario: The user perform incorrect operations using on-line buttons

Given the user is on a Google Calculator webpage
When the user press buttons: "onlineButtons"
Then the user should see a result "resultForButtons"

Examples:
onlineButtons | resultForButtons
6 × =         | Error
8 ( =         | Error
− . × 1 =     | Error

