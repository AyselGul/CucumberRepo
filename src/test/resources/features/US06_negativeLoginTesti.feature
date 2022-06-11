Feature: US06 Negative Login Test

  Scenario: TC-08 Yanlis username, dogru sifre ile giris yapilamaz

    Given kullanici "HMCUrl" sayfasina gider
    Then login linkine tiklar
    Then kullanici adi olarak "HMCInvalidUsername" girer
    Then password olarak "HMCValidPassword" girer
    Then login butonuna basar
    And giris yapilamadigini test eder




    Scenario: TC-09 Dogru username,yanlis sifre ile giris yapilamaz
      Given kullanici "HMCUrl" sayfasina gider
      Then login linkine tiklar
      Then kullanici adi olarak "HMCValidUsername" girer
      Then password olarak "HMCInvalidPassword" girer
      Then login butonuna basar
      And giris yapilamadigini test eder
      And sayfayi kapatir


      Scenario: TC-10 Yanlis username ve yanlis sifre ile giris yapilamaz
        Given kullanici "HMCUrl" sayfasina gider
        Then login linkine tiklar
        Then kullanici adi olarak "HMCInvalidUsername" girer
        Then password olarak "HMCInvalidPassword" girer
        Then login butonuna basar
        And giris yapilamadigini test eder
        And sayfayi kapatir
