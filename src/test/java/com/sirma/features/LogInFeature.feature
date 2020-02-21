Feature:  LogIn

@Log_In
Scenario Outline: Log into the application with valid credentials
Given Initialize browser 
And Navigate to URL home page
And Enter <username> and <password>
Then URL changes to expected URL
And End test

Examples:
|username			|password		|
|admin				|admin1234		|
|adm				|admin1234		|
|admin				|adm		|

