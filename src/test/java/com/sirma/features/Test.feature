Feature: Log In with data.property credentials

@CandidateTest
Scenario: Create Candidate Manually validate Picture upload 
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Candidates menu
And Click on Add Candidates button, Add Manually
And Upload photo
And Validate picture upload
And End test
