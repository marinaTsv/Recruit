@Department
Feature: Create Department

@Department1
Scenario: Validate Create Department
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Sttings menu
And Click on Department submenu
And Click on Create Department button
And Fill in Departmentname
And Select AssistantDepartmentHead
And Select DepartmentHead
And Select Company
And Click button SaveDepartment
Then Validate the Department was created
And End test

@Department2
Scenario: Cancel Create Department
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Sttings menu
And Click on Department submenu
And Click on Create Department button
And Fill in Departmentname
And Select AssistantDepartmentHead
And Select DepartmentHead
And Select Company
And Click button BackDepartment
Then Validate the Department was not created
And End test


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


Examples:
|file			|
|createCandidateCVUpload|
|pdfcreateCandidateCVUpload1|
