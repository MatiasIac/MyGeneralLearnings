*** Settings ***
Library			Selenium2Library
Test Setup		Go to homepage
Test Teardown	Close Test Browser

*** Variables ***
${HOMEPAGE}		https://www.google.com
${BROWSER}		chrome

*** Test Cases ***
Google my name and find something
	Google and check results	matias iacono		Matias Iacono	

*** Keywords ***
Google and check results
	[Arguments]		${searchkey}	${result}
	Input Text		id=lst-ib			${searchkey}
	Click Button	name=btnK
	Wait Until Page Contains	${result}

Go to homepage
	Open Browser	${HOMEPAGE}		${BROWSER}

Close Test Browser
	Close all browsers
