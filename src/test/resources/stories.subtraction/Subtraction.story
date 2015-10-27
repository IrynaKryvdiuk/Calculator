Subtraction of two numbers

Narrative:
In order to subtract numbers
As a user
I want to be able to get a correct result using Google Calculator


Scenario: The user subtracts two numbers using keyboard

Given the user is on a Google Calculator webpage
When the user enter numbers: "numbers"
Then the user should see a result "result"

Examples:
numbers | result
0 - 1 = | -1
20 - 3 =  | 17
- 10.5 - 1 = | -11.5


Scenario: The user subtracts two numbers using on-line buttons

Given the user is on a Google Calculator webpage
When the user press buttons: "onlineButtons"
Then the user should see a result "resultForButtons"

Examples:
onlineButtons | resultForButtons
0 − 7 =       | -7
20 − 28 =      | -8
− 10.5 − 1 =  | -11.5

