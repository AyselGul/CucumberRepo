Feature: US05 positive login test

  @hotel
  Scenario:  TC-07 Hotel positive login

    Given kullanici "HMCUrl" sayfasina gider
    And login linkine tiklar
    Then kullanici adi olarak "HMCValidUsername" girer
    And password olarak "HMCValidPassword" girer
    And login butonuna basar
    Then basarili olarak giris yapildigini test eder
    And sayfayi kapatir