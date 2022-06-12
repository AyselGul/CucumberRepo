@SO
Feature: US08 Negative login Test

  Scenario Outline: TC-12 Username and Password

    Given kullanici "HMCUrl" sayfasina gider
    Then login linkine tiklar
    Then scenarion outline'dan username olarak "<username>" yazar
    Then scenarion outline'dan password olarak "<password>" yazar
    Then login butonuna basar
    And giris yapilamadigini test eder


    Examples:
    |username|password|
    |ManageR |MANger/ |
    |manager |MANAGER/|
    |MANAGER |manager.|
    |Manag ER |ma naGER?|