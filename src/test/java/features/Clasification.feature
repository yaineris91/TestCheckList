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
And enter the clasification with "<clasificationName>"
And click on the save button
Then The application should show a "<message>" to the user
Then The application should show the clasification "<clasificationName>" on the list

Examples: 
      |clasificationName  |message              | 
      |clasificationName1 |massageClasification1|
      |clasificationName3 |massageClasification1|
      |clasificationName4 |massageClasification1|
      |clasificationName5 |massageClasification1|
      |clasificationName6 |massageClasification1|
    
    
 @TC_clasification_03
Scenario Outline: Add clasification and enter incorrect data
Given: open the application on the browser
When click on the clasification option
And click on the new clasification button
And enter the clasification with "<clasificationName>"
And click on the save button
Then The application should show a error "<message>" to the user

Examples: 
      |clasificationName  |message              | 
      |clasificationName7 |massageClasification4|
      |clasificationName8 |massageClasification5|
 
      
      
@TC_clasification_04
Scenario Outline: Edit clasification
Given: open the application on the browser
When click on the clasification option
And click on the edit clasification option with "<clasificationName>"
And edit the clasification and enter "<newClasificationName>"
And click on the save button
Then The application should show a "<message>" to the user
Then The application should show the clasification "<newClasificationName>" on the list 

Examples: 
    |clasificationName |newClasificationName  | message             |
    |clasificationName3|clasificationName2    |massageClasification2|


@TC_clasification_05
Scenario Outline: Edit clasification with incorrect data
Given: open the application on the browser
When click on the clasification option
And click on the edit clasification option with "<clasificationName>"
And edit the clasification and enter "<newClasificationName>"
And click on the save button
Then The application should show a error "<message>" to the user


Examples: 
    |clasificationName |newClasificationName  | message             |
    |clasificationName4|clasificationName7    |massageClasification4|
    |clasificationName4|clasificationName8    |massageClasification5|
      
@TC_clasification_06
Scenario Outline: Remove clasification
Given: open the application on the browser
When click on the clasification option
And click on the remove clasification option of the "<clasificationName>"
And click on the yes option
Then The application should show a "<message>" to the user
Then The application should remove the clasification"<clasificationName>" of the list

Examples: 
      |clasificationName  | message             |
      |clasificationName1 |massageClasification3|
      |clasificationName2 |massageClasification3|
      |clasificationName4 |massageClasification3|