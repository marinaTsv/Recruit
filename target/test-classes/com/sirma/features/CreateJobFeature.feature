Feature: Create Job

@Create_Job1
Scenario Outline: Create Job with all required field filled in
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Jobs menu
And Click on Create Job button
And Create Jobs form opens
And Fill in Title <title>
And FIll in Company <company>
And FIll in Department <department>
And FIll in Location <location>
And FIll in JobDescription <jobDescription>

And FIll in EmploymentType <employmentType>
And Click on button Save
And Validate the job was created
And End test



Examples:
|title	|company	|department		|location		|jobDescription					|jobRequirements				|employmentType	|
|QA		|s			|s				|s				|Vamos con una apuesta para esta|Vamos con una apuesta para esta!|s				|


@Create_Job2
Scenario Outline: Create Job with Create Location
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Jobs menu
And Click on Create Job button
And Create Jobs form opens
And Fill in Title <title>
And FIll in Company <company>
And FIll in Department <department>
And Click button AddNewLocation
And Fill in Create Location
And FIll in JobDescription <jobDescription>

And FIll in EmploymentType <employmentType>
And Click on button Save
And Validate the job was created
And End test

Examples:
|title	|company	|department		|location		|jobDescription					|jobRequirements				|employmentType	|
|QA		|s			|s				|s				|Vamos con una apuesta para esta|Vamos con una apuesta para esta!|s				|


@Create_Job3
Scenario Outline: Create Job with Create Employment Type
Given Initialize browser 
When Navigate to URL home page
And Fill in user and pass
And Click on Jobs menu
And Click on Create Job button
And Create Jobs form opens
And Fill in Title <title>
And FIll in Company <company>
And FIll in Department <department>
And FIll in Location <location>
And FIll in JobDescription <jobDescription>
And Click button AddNewEmploymentType
And Create NewEmploymentType
And Click on button Save
And Validate the job was created
And End test


Examples:
|title	|company	|department		|location		|jobDescription					|jobRequirements				|employmentType	|
|QA		|s			|s				|s				|Vamos con una apuesta para esta|Vamos con una apuesta para esta!|s				|
