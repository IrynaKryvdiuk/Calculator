Division of two numbers

Narrative:
In order to divide two numbers
As a user
I want to be able to get a correct result using Google Calculator


Scenario: The user divides two numbers using keyboard

Given the user is on a Google Calculator webpage
When the user enter numbers: "numbers"
Then the user should see a result "result"

Examples:
numbers | result
10 / 2 = | 5
0.6 / 1 =  | 0.6
- 100 / - 1 = | 100
12 / 0 =    | Infinity


Scenario: The user divides two numbers using on-line buttons

Given the user is on a Google Calculator webpage
When the user press buttons: "onlineButtons"
Then the user should see a result "resultForButtons"

Examples:
onlineButtons | resultForButtons
10 ÷ 2 =      | 5
0.9 ÷ 1 =     | 0.9
− 100 ÷ − 1 = | 100

