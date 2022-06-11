
Feature: US07 Scenario Outline

  Scenario Outline: TC-11 Listede ki tum elementleri aratma

    Given kullanici amazon sayfasina gider
    Then "<searchedWord>" icin arama yapar
    And sonuclarin "<searchedWord>" icerdigini test eder

    Examples:
    |searchedWord|
    |flower|
    |baby  |
    |waterfall|
    |cat      |
    |ball |
    |pencil|


