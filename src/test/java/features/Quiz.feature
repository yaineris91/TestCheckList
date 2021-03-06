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
And click on the new quiz button
And enter the "<question>" and "<clasificationName>"
And click on the save button
Then The application should show a "<message>" to the user
Then The application should show the question "<question>" on the list

Examples: 
    |question  |clasificationName   |message     | 
    |question1 |clasificationName5  |massageQuiz1|
    |question2 |clasificationName5  |massageQuiz1|
    |question3 |clasificationName5  |massageQuiz1|
 
 
 @TC_quiz_03
Scenario Outline: Add Quiz with incorrect data on the question
Given: open the application on the browser
When click on the quiz option
And click on the new quiz button
And enter the "<question>" and "<clasificationName>"
And click on the save button
Then The application should show a error "<message>" to the user

Examples: 
    |question  |clasificationName   |message     | 
    |question5 |clasificationName5  |massageQuiz5|
    |question6 |clasificationName5  |massageQuiz6|
    
@TC_quiz_04
Scenario Outline: Add Quizand do not select a clasification
Given: open the application on the browser
When click on the quiz option
And click on the new quiz button
And enter the "<question>" and "<clasificationName>"
And click on the save button
Then The application should show a error "<message>" to the user

Examples: 
    |question  |clasificationName   |message     | 
    |question2 |clasificationName7  |massageQuiz5|
   
    
      
@TC_quiz_05
Scenario Outline: Edit quiz
Given: open the application on the browser
When click on the quiz option
And click on the edit option for the "<question>"
And edit the  data whit "<newQuestion>" and "<newClasificationName>"
And click on the save button
Then The application should show a "<message>" to the user
Then The application should show the question "<newQuestion>" on the list 

Examples: 
    |question  |newQuestion |newClasificationName|message     | 
    |question3 | question4  | clasificationName6 |massageQuiz2|
    
@TC_quiz_05
Scenario Outline: Edit quiz with incorrect data on the question
Given: open the application on the browser
When click on the quiz option
And click on the edit option for the "<question>"
And edit the  data whit "<newQuestion>" and "<newClasificationName>"
And click on the save button
Then The application should show a "<message>" to the user
Then The application should show the question "<newQuestion>" on the list 

Examples: 
    |question  |newQuestion |newClasificationName|message     | 
    |question2 |question5   |clasificationName6  |massageQuiz5|
    |question2 |question6   |clasificationName5  |massageQuiz6|
      
@TC_quiz_06
Scenario Outline: Remove quiz 
Given: open the application on the browser
When click on the quiz option
And click on the delete option for the "<question>"
And click on the yes option
Then The application should show a "<message>" to the user
Then The application should remove the question "<question>" of the list

Examples: 
      |question   | message    |
      |question1  |massageQuiz3|