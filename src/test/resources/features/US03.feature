Feature: US003

  @Tc01

  Scenario: Aras Kargo Fiyat Gorunurlugu
    Given kullanici araskargo sayfasina gider
    When cikan pop-up'i kapatir
    When hizmetlerimiz butonuna tiklar
    And kullanıcı Ambalaj Ürünlerimiz Detaylı Bilgi linkine tıklar
    And kullanıcı Ambalaj Fiyatları linkine tıklar
    Then kullanıcı Aras Kargo Hizmetler Fiyatlarin gorunur  oldugunu doğrular