Feature: Open Create Candidate

@Open_Create_Candidate
Scenario Outline: Open Create Candidates
Given Initialize browser 
When Navigate to URL home page
And Enter <username> and <password>
And Click on Candidates menu
When Click on Add Candidates button
Then Add Candidate form opens
And End test

Examples:
|username			|password		|
|admin				|admin1234		|