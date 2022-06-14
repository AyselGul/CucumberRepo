Feature: US01 amazon search
@p1
  Scenario: TC-01 Amazon test


    Given kullanici amazon sayfasina gider
     Then  2 saniye bekler
    And flower icin arama yapar
    Then sonuclarin flower icerdigini test eder

    Given kullanici amazon sayfasina gider
    And crayon icin arama yapar
    Then sonuclarin crayon icerdigini test eder

    Given kullanici amazon sayfasina gider
    And car icin arama yapar
    Then sonuclarin car icerdigini test eder