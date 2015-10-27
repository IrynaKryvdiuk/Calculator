Addition of two numbers

Narrative:
In order to add numbers
As a user
I want to be able to get a correct result using Google Calculator


Scenario: The user adds two numbers using keyboard

Given the user is on a Google Calculator webpage
When the user enter numbers: "numbers"
Then the user should see a result "result"

Examples:
numbers | result
0 + 1 = | 1
0 + 25 =  | 25
- 10.5 + 1 = | -9.5


Scenario: The user adds two numbers using on-line buttons

Given the user is on a Google Calculator webpage
When the user press buttons: "onlineButtons"
Then the user should see a result "resultForButtons"

Examples:
onlineButtons | resultForButtons
0 + 1 =       | 1
2 + 3 =      | 5
− 10.5 + 1 =  | -9.5

