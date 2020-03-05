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

@Department3
Scenario: Save is enabled when all required fields are filled in
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Sttings menu
And Click on Department submenu
And Click on Create Department button
And Fill in Departmentname
And Select Company
Then Validate that SaveDepartment button is enabled
And End test

@Department4
Scenario: Validate Create Active Department
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
Then Validate the Department was created as Active


@Department5
Scenario: Validate Create Inactive Department
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
Then Validate the Department was created as Inctive
And End test
