@All
@Clasification
Feature: Clasification page


@TC_clasification_01
Scenario: Open Clasification page
Given: open the application on the browser
When click on the clasification option
Then The application should be open on the Clasification page


@TC_clasification_02
Scenario Outline: Add clasification
Given: open the application on the browser
When click on the clasification option
And click on the new clasification button
And enter the "<clasificationName>"
And click on the save button
Then The application should show a "<message>" to the user
Then The application should show the clasification on the list

Examples: 
      |clasificationName  |message              | 
      |clasificationName1 |massageClasification1|
      |clasificationName2 |massageClasification1|
      |clasificationName3 |massageClasification1|
      |clasificationName4 |massageClasification1|
      |clasificationName5 |massageClasification1|
      
      
@TC_clasification_03
Scenario Outline: Edit clasification
Given: open the application on the browser
When click on the clasification option
And click on the edit clasification option
And edit the "<clasificationName>"
And click on the save button
Then The application should show a "<message>" to the user
Then The application should edit "<clasificationName>" on the list 

Examples: 
      |clasificationName  | message             |
      |clasificationName2 |massageClasification2|
      
      
@TC_clasification_04
Scenario Outline: Remove clasification
Given: open the application on the browser
When click on the clasification option
And select the "<clasificationName>"
And click on the remove clasification button
And click on the yes option
Then The application should show a "<message>" to the user
Then The application should remove the clasification of the list

Examples: 
      |clasificationName  | message             |
      |projectName3       |massageClasification3|