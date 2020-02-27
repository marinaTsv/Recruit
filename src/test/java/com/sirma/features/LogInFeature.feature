Feature:  LogIn

@Log_In1 
Scenario Outline: Log into the application with valid credentials
Given Initialize browser 
And Navigate to URL home page
And Enter <username> and <password>
Then Dashboard opens
And End test

Examples:
|username			|password		|
|admin				|admin1234		|

@Log_In2
Scenario Outline: Log into the application with valid credentials Fail
Given Initialize browser 
And Navigate to URL home page
And Enter <username> and <password>
Then Dashboard does not open
And End test

Examples:
|username			|password		|
|adm				|admin1234		|
|admin				|admb		|
