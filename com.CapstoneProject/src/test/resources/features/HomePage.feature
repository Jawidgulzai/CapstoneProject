@homePage
Feature: Home Page

Scenario: User verify currency values change
  Given user is on test environment homepage
	When User click on Currency 
	And User Chose Euro from dropdown 
	Then currency value should change to Euro
