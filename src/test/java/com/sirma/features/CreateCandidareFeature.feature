Feature: Create Candidate

Scenario Outline: Create Candidates required only
Given Initialize browser 
When Navigate to URL home page
And Enter <username> and <password>
And Click on Candidates menu
And Click on Add Candidates, Add Manually
And fill in Name
And fill in email
And fill in Jobs or Talent Pools
And fill in Source
And Click button Save
And End test

Examples:
|username			|password		|
|admin				|admin1234		|