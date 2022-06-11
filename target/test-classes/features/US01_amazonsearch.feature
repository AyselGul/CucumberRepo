Feature: US01 amazon search

  Scenario: TC-01 Amazon test


    Given kullanici amazon sayfasina gider
    And flower icin arama yapar
    Then sonuclarin flower icerdigini test eder

    Given kullanici amazon sayfasina gider
    And crayon icin arama yapar
    Then sonuclarin crayon icerdigini test eder

    Given kullanici amazon sayfasina gider
    And car icin arama yapar
    Then sonuclarin car icerdigini test eder