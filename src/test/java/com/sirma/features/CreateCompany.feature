@Company
Feature: Create Company

@Company1
Scenario: Create Company
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Sttings menu
And Click on Companies submenu
And Click on Create Company button
And Fill in name
And Fill in email
And Fill in website
And Fill Contact Person
And Upload file companyLogo
And Click button SaveCompany
Then Validate the Company was created
And End test

@Company2
Scenario: Create Company
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Sttings menu
And Click on Companies submenu
And Click on Create Company button
And Fill in name
And Fill in email
And Fill in website
And Fill Contact Person
And Upload file companyLogo
Then Validate companyLogo file upload
And End test

