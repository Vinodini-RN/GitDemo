
Feature: Application login

Background:
Given setup the enteries
When launch the browser 
And hit the home page
  
Scenario: Admin page defaut login
Given user is on netbanking landling page
When user login into application with "admin" and password "pwd"
Then whether home page is dispayed
And Cards are displayed

 #Reusable
@Regression
Scenario: User page defaut login
Given user is on netbanking landling page
When user login into application with "user" and password "pwd"
Then whether home page is dispayed
And Cards are displayed


Scenario Outline: User page defaut login
Given user is on netbanking landling page
When user login into application with "<username>" and password "<password>"
Then whether home page is dispayed
And Cards are displayed

Examples: 
   |username|password|
   |debituser|  pwd  |
   |stockuser|  pwd  |

@smoketest @Regression
Scenario: User page defaut Sign up
Given user is on prctice landling page
When user signup into application
|rahul|
|shetty|
|contact@gmail.com|
|8764767888|
Then whether home page is dispayed
And Cards are displayed



