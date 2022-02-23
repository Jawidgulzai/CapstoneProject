@register @endtoend @smoke @regression @login
Feature: Test Environment Retail Page

Background:
    Given user is on test environment homepage
    When user click on myaccount button
      
Scenario: Register with Test Environment Webpage
		And user click on register button
		And user fill registeration form with information below
		|firstname|lastname|email|telephone|password|confirmPassword|
		|John|Colunga|johncolunga999@gmail.com|4024443434|johncolunga999|johncolunga999|
		And user click on agree to terms checkbox
		And user click on continue button
		  
