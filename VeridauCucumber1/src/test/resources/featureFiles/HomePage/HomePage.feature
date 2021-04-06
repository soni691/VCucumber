Feature: HomePage.feature - To prepare test cases to validate AdminHQ option

Background: 
	#Given I do login with admin user
	Given the web application is open
	
Scenario: Validate Admin HQ options scenario
	When I enter admin user name
	And I enter admin password
	And I click on login button
	And I click on AdminHQ button
	Then I verify HubManager option
	
#	When I click on AdminHQ option
#	And I click on Global Settings option
#	Then I verify Global Settings option
#
#	When I click on AdminHQ option
#	And I click on Email Template option
#	Then I verify Email Template option
#
#	When I click on AdminHQ option
#	And I click on Maintenace option
#	Then I verify Maintenace option
	
#Scenario: Validate Global Settings option scenario
#	When I click on AdminHQ option
#	And I click on Global Settings option
#	Then I verify Global Settings option
#	
#Scenario: Validate Email Template option scenario
#	When I click on AdminHQ option
#	And I click on Email Template option
#	Then I verify Email Template option
#	
#Scenario: Validate Maintenance option scenario
#	When I click on AdminHQ option
#	And I click on Maintenace option
#	Then I verify Maintenace option