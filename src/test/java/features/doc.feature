Feature: Automate Leaftap Applications

@smoke
Scenario outline: TC001_Login and Logout

Given Launch ChromeBrowser and Load URL
And Enter Username as DemoSalesManager
And Enter Password as crmsfa
When Click the Login button
Then It's navigate Homepage
And Click the Logout button
And Close Browser

Examples:
|Username|Password|
|DemoSalesManager|crmsfa|
|DemoSCR|crmsfa|

Scenario: TC002_Login and Logout for Failiure

Given Launch ChromeBrowser and Load URL
And Enter Username as Touhid
And Enter Password as crmsfa
When Click the Login button
Then It's navigate samepage
But Verify Error message
And Close Browser

Scenario: TC003_CreateLead

Given Launch ChromeBrowser and Load URL
And Enter Username as DemoSalesManager
And Enter Password as crmsfa
And Click the Login button
And Click CRMSFA

And Click leads link
When Click CreateLead 
And Enter the Company Name as ABC 
And Enter the First Name as Hema
And Enter the Last Name as Mali
And Choose Source as Website
And Click the Create Lead Button
Then Its navigate ViewLead Page
And Verify the First Name
And Close Browser

