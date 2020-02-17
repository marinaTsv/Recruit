Feature: Create Candidate

Scenario Outline: Open Candidates
Given Initialize browser 
When Navigate to URL home page
And Enter user and pass
And Click on Candidates menu
When Click on Add Candidates button
Then Add Candidate form opens
Examples:
|username			|password		|
|admin				|admin1234		|