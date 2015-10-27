Multiplication of two numbers

Narrative:
In order to multiplicate two numbers
As a user
I want to be able to get a correct result using Google Calculator


Scenario: The user multiplicates two numbers using keyboard

Given the user is on a Google Calculator webpage
When the user enter numbers: "numbers"
Then the user should see a result "result"

Examples:
numbers | result
0 * 1 = | 0
10 * 3 =  | 30
- 0.5 * 2 = | -1


Scenario: The user multiplicates two numbers using on-line buttons

Given the user is on a Google Calculator webpage
When the user press buttons: "onlineButtons"
Then the user should see a result "resultForButtons"

Examples:
onlineButtons | resultForButtons
0 × 4 =       | 0
6 × 3 =      | 18
− 0.5 × 1 =  | -0.5

