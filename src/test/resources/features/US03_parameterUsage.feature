
Feature:  US03 parameterUsage

  Scenario: TC-05 Parametre kullanim

    Given kullanici amazon sayfasina gider
    Then "park" icin arama yapar
    Then sonuclarin "park" icerdigini test eder
    And sayfayi kapatir