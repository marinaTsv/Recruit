Feature: Open Create Jobs

Scenario Outline: Open Create Jobs
Given Initialize browser 
When Navigate to URL home page
And Enter <username> and <password>
And Click on Jobs menu
When Click on Create Job button
Then Create Jobs form opens
And End test

Examples:
|username			|password		|
|admin				|admin1234		|