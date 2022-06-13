Feature: US11 Web University
  @WU
  Scenario Outline: TC-15 Window Handle Test

    Given kullanici "WebUniversityUrl" sayfasina gider
    And Login Portal'a  kadar asagi iner
    And 2 saniye bekler
    And Login Portal'a  tiklar
    Then acilan diger window'a gecer
    And "<username>" ve  "<password>" kutularina deger yazdirin
   # And WebUniversity Login butonuna basar
    And 2 saniye bekler
    And Popup'ta cikan yazinin "validation failed" oldugunu test eder
    Then Ok diyerek Popup'i kapatir
    And Ilk sayfaya geri doner
    And Ilk sayfaya donuldugunu test eder
   # And sayfayi kapatir

  Examples:
    |username|password|
    |mamak   |mamak1  |