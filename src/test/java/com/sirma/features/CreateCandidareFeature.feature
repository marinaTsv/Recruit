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
And Upload CV_Resume "createCandidateCVUpload" 
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
Then Validate the Candidate was not created
And End test

@Candidate5
Scenario: Create Candidate Manually with remove and upload a new CV/Resume
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Candidates menu
And Click on Add Candidates button, Add Manually
And Fill in Name
And Fill in email
And Fill in Jobs or Talent Pools
And Fill in Source
And Upload CV_Resume "createCandidateCVUpload" 
And click button RemoveResume
And Click button Save
And Upload CV_Resume "pdfcreateCandidateCVUpload1" 
And End test

@Candidate6
Scenario: Create Candidate Manually check Picture upload 
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Candidates menu
And Click on Add Candidates button, Add Manually
And Upload photo
Then Validate file upload
And End test

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

@Candidate9
Scenario: Create Candidate validate upload CV/Resume
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Candidates menu
And Click on Add Candidates button, Add Manually
And Upload CV_Resume "createCandidateCVUpload" 
Then Validate file upload
And End test

@Candidate10
Scenario: Create Candidate Manually with validate CV/Resume removal
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Candidates menu
And Click on Add Candidates button, Add Manually
And Upload CV_Resume "createCandidateCVUpload" 
And click button RemoveResume
And Validate file removal
And End test

@Candidate11
Scenario: Create Candidate Manually validate Picture upload 
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Candidates menu
And Click on Add Candidates button, Add Manually
And Upload photo
And Validate picture upload
And End test
