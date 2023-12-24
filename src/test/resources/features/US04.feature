
@US04
Feature: Aras Kargo UI testi Team01

  Scenario: TC01  Kullanıcı Üye girişi butonunu tıklar
    Given  AU Kullanici URL'e gider
    Then AU Kullanici cikan pop-up'i kapatir
    Then AU Kullanici dashboard daki Uye girisi kisminin goruldugunu dogurular
    Then AU Kullanici uye girisi botununa tiklar ve sayfanin acildigini gorur
    And AU Kullanici KURUMSAL KULLANICI GIRISI yazisini gordugunu dogular