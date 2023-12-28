Feature: US007 ArasKargo Sayfasi Testi
  @Tc01
  Scenario: Kullanici En Yakin subeler pop-up ini kullanabilir
    Given kullanici araskargo sayfasina gider
    When cikan pop-up'i kapatir
    Then Kullanici En Yakin subeler pop-up ini tıklar
    Then Kullanici arama işlemi dropdown'indan "Aras Burasi Noktalari" seçeneğini seçer
    Then Kullanici geçerli il ve ilçe ismi girer
    And Kullanici ara butonuna basar ve Kullanici sonuçlarin liste ve haritada işaretli olarak sunulduğunu doğrular


  @Tc02
  Scenario: Kullanici En Yakin subeler pop-up ini kullanabilir
    Given kullanici araskargo sayfasina gider
    When cikan pop-up'i kapatir
    Then Kullanici En Yakin subeler pop-up ini tıklar
    Then Kullanici arama işlemi dropdown'indan "Aras Burasi Noktalari" seçeneğini seçer
    Then Kullanici geçerli il ve ilçe ismi girmez
    And Kullanici ara butonuna basar ve Kullanici sonuçlarin liste ve haritada işaretli olarak sunulduğunu doğrular
  @Tc03
  Scenario: Kullanici En Yakin subeler pop-up ini kullanabilir
    Given kullanici araskargo sayfasina gider
    When cikan pop-up'i kapatir
    Then Kullanici En Yakin subeler pop-up ini tıklar
    Then Kullanici arama işlemi dropdown'indan "Subelerimiz" seçeneğini seçer
    Then Kullanici geçerli il ve ilçe ismi girer
    And Kullanici ara butonuna basar ve Kullanici sonuçlarin liste ve haritada işaretli olarak sunulduğunu doğrular
  @Tc04
  Scenario: Kullanici En Yakin subeler pop-up ini kullanabilir
    Given kullanici araskargo sayfasina gider
    When cikan pop-up'i kapatir
    Then Kullanici En Yakin subeler pop-up ini tıklar
    Then Kullanici arama işlemi dropdown'indan "Subelerimiz" seçeneğini seçer
    Then Kullanici geçerli il ve ilçe ismi girmez
    And Kullanici ara butonuna basar ve Kullanici sonuçlarin liste ve haritada işaretli olarak sunulduğunu doğrular

