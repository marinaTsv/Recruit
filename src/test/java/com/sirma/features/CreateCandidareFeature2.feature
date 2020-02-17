Feature: Create Candidate

Scenario Outline: Create Candidate Manually with required only
Given Initialize browser 
When Navigate to URL home page
And Enter user and pass
And Click on Candidates menu
And Click on Add Candidates button, Add Manually
And Fill in Name
And Fill in e-mail
And Fill in Jobs or Talent Pools
And Fill in Source
Examples:
|username			|password		|
|admin				|admin1234		|

Scenario Outline: Create Candidate Manually with Picture and CV/Resume upload
Given Initialize browser 
When Navigate to URL home page
And Enter user and pass
And Click on Candidates menu
And Click on Add Candidates button, Add Manually
And Fill in Name
And Fill in e-mail
And Fill in Jobs or Talent Pools
And Fill in Source



Examples:
|username			|password		|
|admin				|admin1234		|