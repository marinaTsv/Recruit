Feature: Create Job

Scenario Outline: Create Job with all required field filled in
Given Initialize browser 
When Navigate to URL home page
And Enter <username> and <password>
And Click on Jobs menu
And Click on Create Job button
And Create Jobs form opens
And Fill in Title <title>
And FIll in Company <company>
And FIll in Department <department>
And FIll in Location <location>
And FIll in JobDescription <jobDescription>
And FIll in JobRequirements <jobRequirements>
And FIll in EmploymentType <employmentType>
And Click on button Save



Examples:
|username			|password		|title	|company	|department		|location		|jobDescription					|jobRequirements				|employmentType	|
|admin				|admin1234		|QA		|s			|s				|s				|Vamos con una apuesta para esta|Vamos con una apuesta para esta!|s				|


Scenario Outline: Create Job with Create Location
Given Initialize browser 
When Navigate to URL home page
And Enter <username> and <password>
And Click on Jobs menu
And Click on Create Job button
And Create Jobs form opens
And Fill in Title <title>
And FIll in Company <company>
And FIll in Department <department>
And Click button AddNewLocation
And Fill in Location Name, Address, Country,State, City,ZipCode and click button Save 
And FIll in JobDescription <jobDescription>
And FIll in JobRequirements <jobRequirements>
And FIll in EmploymentType <employmentType>
And Click on button Save

Examples:
|username			|password		|AddNewLocation			|Location		|Address	|company	|department		|location		|jobDescription					|jobRequirements				|employmentType	|
|admin				|admin1234		|QA		|s			|s				|s				|Vamos con una apuesta para esta|Vamos con una apuesta para esta!|s				|

Scenario Outline: Create Job with Create Employment Type
Given Initialize browser 
When Navigate to URL home page
And Enter <username> and <password>
And Click on Jobs menu
And Click on Create Job button
And Create Jobs form opens
And Fill in Title <title>
And FIll in Company <company>
And FIll in Department <department>
And Click button AddNewEmploymentType
And Fill in the NewEmploymentType Name and click button Save 
And FIll in JobDescription <jobDescription>
And FIll in JobRequirements <jobRequirements>
And FIll in EmploymentType <employmentType>
And Click on button Save

Examples:
|username			|password		|AddNewLocation			|Location		|Address	|company	|department		|location		|jobDescription					 |jobRequirements				|
|admin				|admin1234		|QA						|s				|s			|s			|Vamos con una apuesta para esta|Vamos con una apuesta para esta!|s								|
