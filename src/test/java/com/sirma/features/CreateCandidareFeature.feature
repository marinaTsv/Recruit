Feature: Create Candidate

@Candidate1
Scenario: Create Candidate Manually with required only
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Candidates menu
And Click on Add Candidates button, Add Manually
And Fill in Name
And Fill in email
And Fill in Jobs or Talent Pools
And Fill in Source
And Click button Save
Then Validate the Candidate was created
And End test

@Candidate2
Scenario: Create Candidate Manually with Picture upload 
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Candidates menu
And Click on Add Candidates button, Add Manually
And Fill in Name
And Fill in email
And Fill in Jobs or Talent Pools
And Fill in Source
And Upload photo
And Click button Save
Then Validate the Candidate was created
And End test

@Candidate3
Scenario: Create Candidate Manually with CV/Resume upload
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Candidates menu
And Click on Add Candidates button, Add Manually
And Fill in Name
And Fill in email
And Fill in Jobs or Talent Pools
And Fill in Source
And Upload CV_Resume
And Click button Save
Then Validate the Candidate was created
And End test

@Candidate4
Scenario: Cancel Create Candidate 
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Candidates menu
And Click on Add Candidates button, Add Manually
And Fill in Name
And Click button Cancel


@Candidate5
Scenario: Create Candidate Manually with remove CV/Resume upload
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
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

@Candidate6
Scenario: Create Candidate Manually CV/Resume upload doc TO DO
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Candidates menu
And Click on Add Candidates button, Add Manually

@Candidate7
Scenario: Create Candidate Manually - add social links TO DO
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Candidates menu
And Click on Add Candidates button, Add Manually

@Candidate8
Scenario: Create Candidate Manually - add links TO DO
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Candidates menu
And Click on Add Candidates button, Add Manually

