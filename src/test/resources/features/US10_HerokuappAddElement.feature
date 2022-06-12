Feature: US 19 Adding Butonu Testi
@HR
  Scenario: TC-14 Eklenen Elemanin Calismali

    Given kullanici "HerokuappAddElementUrl" sayfasina gider
    When Add Element butonuna basar
    Then Delete butonu gorununceye kadar bekler
    And Delete butonunun gorundgunu test eder
    Then Delete butonuna basarak butonu siler
    And 3 saniye bekler
    And sayfayi kapatir