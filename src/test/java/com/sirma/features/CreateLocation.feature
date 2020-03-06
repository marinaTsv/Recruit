@Location
Feature: Create Location

@Location1
Scenario: Validate Create Location
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Sttings menu
And Click on Locations submenu
And Click on Create Location button
And Fill in LocationName
And Select Company_inLocation
And Select Timezone
And Fill In Country
And Fill In City
And Fill In State
And Fill In ZipCode
And Fill In Address
And Fill In PhoneNumber
And Fill In Email
And Fill In Notes
And Click button SaveLocation
Then Validate the location was created
And End test

@Location2
Scenario: Cancel Create Location
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Sttings menu
And Click on Locations submenu
And Click on Create Location button
And Fill in LocationName
And Select Company_inLocation
And Fill In Country
And Fill In Address
And Click button BackLocation
Then Validate the Department was not created
And End test

@Location3
Scenario: Save is enabled when all required fields are filled in
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Sttings menu
And Click on Locations submenu
And Click on Create Location button
And Fill in LocationName
And Select Company_inLocation
And Fill In Country
And Fill In Address
Then Validate that SaveDepartment button is enabled
And End test

@Location4
Scenario: Validate Create Active Location
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Sttings menu
And Click on Locations submenu
And Click on Create Location button
And Fill in LocationName
And Select Company_inLocation
And Fill In Country
And Fill In Address
And Click button SaveDepartment
Then Validate the Department was created as Active
And End test

@Location5
Scenario: Validate Create Inactive Location
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Sttings menu
And Click on Locations submenu
And Click on Create Location button
And Fill in LocationName
And Select Company_inLocation
And Fill In Country
And Fill In Address
And Click Inactive radiobutton
And Click button SaveDepartment
Then Validate the Department was created as Inctive
And End test
