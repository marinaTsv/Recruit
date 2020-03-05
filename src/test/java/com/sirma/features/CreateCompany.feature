@Company
Feature: Create Company

@Company1
Scenario Outline: Validate Create Company
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Sttings menu
And Click on Companies submenu
And Click on Create Company button
And Fill in CompaNyname
And Fill in CompanyEmail
And Fill in CompanyWebsite
And Fill CompanyContactPerson
And Upload file <file>
And Click button SaveCompany
Then Validate the Company was created
And End test

Examples:
|file			|
|createCandidatePhotoUpload|

@Company2
Scenario Outline: Validate logo upload
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Sttings menu
And Click on Companies submenu
And Click on Create Company button
And Upload file <file>
Then Validate companyLogo file upload
And End test

Examples:
|file			|
|createCandidatePhotoUpload|

@Company3
Scenario Outline: Cancel Create Company
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Sttings menu
And Click on Companies submenu
And Click on Create Company button
And Fill in CompaNyname
And Fill in CompanyEmail
And Fill in CompanyWebsite
And Fill CompanyContactPerson
And Upload file <file>
And Click button Back in Create Company Page
Then Validate the Company was not created
And End test

Examples:
|file			|
|createCandidatePhotoUpload|

@Company4
Scenario Outline: Validate uploaded file removal
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Sttings menu
And Click on Companies submenu
And Click on Create Company button
And Upload file <file>
And click button RemoveLogo
And Validate companyLogo file removal
And End test

Examples:
|file			|
|createCandidatePhotoUpload|

@Company5
Scenario Outline: Error message for file upload that is not within supported formats
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Sttings menu
And Click on Companies submenu
And Click on Create Company button
And Upload file <file>
Then Error message for unsupported file type appears
And End test


Examples:
|file			|
|createCandidateCVUpload|
|pdfcreateCandidateCVUpload1|
