@p2
Feature: US02 Background ile amazon search testi

  Background: amazon sayfasina gidis
    Given kullanici amazon sayfasina gider
    # diyez ile yorum yazabilirsiniz


  Scenario: TC-02 Amazon crayon Search Testi
    And crayon icin arama yapar
    Then sonuclarin crayon icerdigini test eder


  Scenario: TC-03 Amazon car Search Testi
    And car icin arama yapar
    Then sonuclarin car icerdigini test eder

  Scenario: TC-04 Amazon flower  Search Testi
    And flower icin arama yapar
    Then sonuclarin flower icerdigini test eder