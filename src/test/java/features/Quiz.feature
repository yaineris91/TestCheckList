@All
@Quiz
Feature: Quiz page


@TC_quiz_01
Scenario: Open Quiz page
Given: open the application on the browser
When click on the quiz option
Then The application should be open on the Quiz page


@TC_quiz_02
Scenario Outline: Add Quiz
Given: open the application on the browser
When click on the quiz option
And click on the new project button
And enter the "<question>" and "<clasificationName>"
And click on the save button
Then The application should show a "<message>" to the user
Then The application should show the quiz on the list

Examples: 
    |question  |clasificationName   |message     | 
    |question1 |clasificationName2  |massageQuiz1|
    |question2 |clasificationName2  |massageQuiz1|
    |question3 |clasificationName2  |massageQuiz1|
      
      
@TC_quiz_03
Scenario Outline: Edit quiz
Given: open the application on the browser
When click on the quiz option
And click on the edit quiz option
And edit the "<question>" and "<clasificationName>"
And click on the save button
Then The application should show a "<message>" to the user
Then The application should edit "<question>" and "<clasificationName>" on the list 

Examples: 
    |question  |clasificationName   |message     | 
    |question4 |clasificationName1  |massageQuiz1|
      
      
@TC_quiz_04
Scenario Outline: Remove quiz 
Given: open the application on the browser
When click on the quiz option
And select the "<question>"
And click on the remove project button
And click on the yes option
Then The application should show a "<message>" to the user
Then The application should remove the quiz of the list

Examples: 
      |question   | message    |
      |questionId |massageQuiz3|