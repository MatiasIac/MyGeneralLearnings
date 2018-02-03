*** Settings ***
Library     Selenium2Library

*** Test Cases ***
Buscar nombre en Google
    Open Browser    https://www.google.com      chrome
    Input Text      id=lst-ib       matias iacono
    Click Button    name=btnK
    Wait Until Page Contains    matias iacono
    Close all browsers