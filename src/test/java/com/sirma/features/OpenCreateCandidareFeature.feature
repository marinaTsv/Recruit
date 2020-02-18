Feature: Open Create Candidate

Scenario Outline: Open Candidates
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