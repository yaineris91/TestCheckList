
@All
@Project
Feature: Project page


@TC_project_01
Scenario: Open Project page
Given: open the application on the browser
When click on the project option
Then The application should be open on the Project page


@TC_project_02
Scenario Outline: Add project
Given: open the application on the browser
When click on the project option
And click on the new project button
And enter the "<projectName>"
And click on the save button
Then The application should show a "<message>" to the user
Then The application should show the "<projectName>" on the list 



Examples: 
   |projectName   |message        | 
   |projectName1  |massageProject1|
   |projectName3  |massageProject1|
   |projectName4  |massageProject1|
      
      
@TC_project_03
Scenario Outline: Edit project 
Given: open the application on the browser
When click on the project option
And click on the edit project option with "<projectName>"
And edit whit the "<newName>"
And click on the save button
Then The application should show a "<message>" to the user
Then The application should show the "<newName>" on the list 

Examples: 
    | newName       |projectName  | message       |
    | projectName2  |projectName1 |massageProject2|
      
      
@TC_project_04
Scenario Outline: Remove project 
Given: open the application on the browser
When click on the project option
And click on the remove project option with "<projectName>"
And click on the yes option
Then The application should show a "<message>" to the user
Then The application should remove the "<projectName>" of the list

Examples: 
   |projectName   |message        | 
   |projectName2  |massageProject3|
   |projectName3  |massageProject3|
   |projectName4  |massageProject3|