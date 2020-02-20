Feature: Create Candidate

Scenario Outline: Create Candidate Manually with required only
Given Initialize browser 
When Navigate to URL home page
And Enter <username> and <password>
And Click on Candidates menu
And Click on Add Candidates button, Add Manually
And Fill in Name
And Fill in email
And Fill in Jobs or Talent Pools
And Fill in Source
And Click button Save
And End test

Examples:
|username			|password		|
|admin				|admin1234		|

Scenario Outline: Create Candidate Manually with Picture upload 
Given Initialize browser 
When Navigate to URL home page
And Enter <username> and <password>
And Click on Candidates menu
And Click on Add Candidates button, Add Manually
And Fill in Name
And Fill in email
And Fill in Jobs or Talent Pools
And Fill in Source
And Upload photo
And Click button Save
And End test

Examples:
|username			|password		|
|admin				|admin1234		|

Scenario Outline: Create Candidate Manually with CV/Resume upload
Given Initialize browser 
When Navigate to URL home page
And Enter <username> and <password>
And Click on Candidates menu
And Click on Add Candidates button, Add Manually
And Fill in Name
And Fill in email
And Fill in Jobs or Talent Pools
And Fill in Source
And Upload CV_Resume
And Click button Save
And End test

Examples:
|username			|password		|
|admin				|admin1234		|

Scenario Outline: Cancel Create Candidate 
Given Initialize browser 
When Navigate to URL home page
And Enter <username> and <password>
And Click on Candidates menu
And Click on Add Candidates button, Add Manually
And Fill in Name
And Click button Cancel
And End test

Examples:
|username			|password		|
|admin				|admin1234		|

Scenario Outline: Create Candidate Manually with remove CV/Resume upload
Given Initialize browser 
When Navigate to URL home page
And Enter <username> and <password>
And Click on Candidates menu
And Click on Add Candidates button, Add Manually
And Fill in Name
And Fill in email
And Fill in Jobs or Talent Pools
And Fill in Source
And Upload CV_Resume
And click button RemoveResume
And Click button Save
And End test

Examples:
|username			|password		|
|admin				|admin1234		|

Scenario Outline: Create Candidate Manually CV/Resume upload doc TO DO
Given Initialize browser 
When Navigate to URL home page
And Enter <username> and <password>
And Click on Candidates menu
And Click on Add Candidates button, Add Manually


Examples:
|username			|password		|
|admin				|admin1234		|

Scenario Outline: Create Candidate Manually - add social links TO DO
Given Initialize browser 
When Navigate to URL home page
And Enter <username> and <password>
And Click on Candidates menu
And Click on Add Candidates button, Add Manually


Examples:
|username			|password		|
|admin				|admin1234		|

Scenario Outline: Create Candidate Manually - add links TO DO
Given Initialize browser 
When Navigate to URL home page
And Enter <username> and <password>
And Click on Candidates menu
And Click on Add Candidates button, Add Manually


Examples:
|username			|password		|
|admin				|admin1234		|