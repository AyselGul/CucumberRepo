

Feature:  US03 parameterUsage

  Scenario: TC-05 Parametre kullanim

    Given kullanici amazon sayfasina gider
    Then "Java" icin arama yapar
    Then sonuclarin "Java" icerdigini test eder
    And sayfayi kapatir