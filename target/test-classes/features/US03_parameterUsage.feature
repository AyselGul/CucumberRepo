
Feature:  US03 parameterUsage
@p1
  Scenario: TC-05 Parametre kullanim

    Given kullanici amazon sayfasina gider
    Then "park" icin arama yapar
    Then sonuclarin "park" icerdigini test eder
   # And sayfayi kapatir