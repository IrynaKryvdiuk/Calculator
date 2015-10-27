Operations with more then two numbers

Narrative:
In order to perform operations with more then two numbers
As a user
I want to be able to get a correct result using Google Calculator


Scenario: The user perform operations with more then two numbers using keyboard

Given the user is on a Google Calculator webpage
When the user enter numbers: "numbers"
Then the user should see a result "result"

Examples:
numbers           | result
1 + (1 - 3) * 2 = | -3
(0 + 25) / 0 =    | Infinity
1 + 1 - 3 * 2 =   | -4
(0 - 25) / 0 =    | -Infinity


Scenario: The user perform operations with more then two numbers using on-line buttons

Given the user is on a Google Calculator webpage
When the user press buttons: "onlineButtons"
Then the user should see a result "resultForButtons"

Examples:
onlineButtons     | resultForButtons
1 + (1 − 3) × 2 = | -3
(0 + 25) ÷ 0 =    | Infinity
1 + 1 − 3 × 2 =   | -4
(0 − 25) ÷ 0 =    | -Infinity

