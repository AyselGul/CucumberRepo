@editor
Feature: US09 Editor Register

  Scenario Outline: TC-13 Kullanici yeni kayit ekleyebilmeli

    Given kullanici editor gider
    Then new butonuna basar
    And firstname olarak "<firstname>" yazar
    And 1 saniye bekler
    And lastname olarak "<lastname>" yazar
    And Position olarak "<position>" yazar
    And Office olarak "<office>" yazar
    And Extension olarak "<extention>" yazar
    And Start date olarak "<startDate>" yazar
    And Salary olarak "<salary>" yazar
    And 1 saniye bekler
    And Create tusuna basar
    And 1 saniye bekler
    When kullanici "<firstname>" ile arama yapar
    Then isim bolumunde "<firstname>" oldugunu dogrular
    And sayfayi kapatir

    Examples:
    |firstname|lastname|position|office|extention|startDate|salary|
    |Ayla     |Demir   |QA      |UK    |2021|2001-05-01|560|
    |Demir    |Celik   |DEV     |INDIA |2022|2022-00-15|450 |
    |Zeynep   |Toprak  |DevOPs  |POLAND |2000|2009-07-12|10000 |
    |Oyku     |Kiziltoprak |QA  |MACEDONIA |2013|2023-05-23|1550 |
