Feature: Create Candidate

Scenario Outline: Open Candidates
Given Initialize browser 
When Navigate to URL home page
And Enter user and pass
And Click on Jobs menu
When Click on Create Job button
Then Create Jobs form opens

Examples:
|username			|password		|
|admin				|admin1234		|