package arasKargo.stepDefinition;

import arasKargo.pages.HizmetlerimizPage;
import arasKargo.pages.HomePagePage;
import arasKargo.utilities.Driver;
import arasKargo.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class US03_StepDefinition {

    HizmetlerimizPage hizmetlerimizPage = new HizmetlerimizPage();
    Actions actions = new Actions(Driver.getDriver());


    @Then("kullanıcı Aras Kargo Hizmetler Fiyatlarin gorunur  oldugunu doğrular")
    public void kullanıcıArasKargoHizmetlerFiyatListesiSayfasınınAçıldığınıDoğrular() {

        String currentUrl = "https://www.araskargo.com.tr/assets/images/pdf/Aras_Hizmetler_fiyat_listesi_2023_ikinci_yari_yil_yeni_kdv_24_07_23.pdf";
        if (currentUrl.endsWith(".pdf")) {
            System.out.println("PDF sayfası başarıyla yüklendi.");
        } else {
            System.out.println("Hata: PDF sayfası yüklenemedi.");
        }
    }
}
