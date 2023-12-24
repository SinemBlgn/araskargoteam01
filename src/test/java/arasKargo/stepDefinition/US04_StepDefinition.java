package arasKargo.stepDefinition;

import arasKargo.pages.HomePagePage;
import arasKargo.utilities.ConfigReader;
import arasKargo.utilities.Driver;
import arasKargo.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US04_StepDefinition extends ReusableMethods {

    HomePagePage homePagePage = new HomePagePage();


    @Given("AU Kullanici URL'e gider")
    public void kullaniciURLEGider() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        bekle(1);

    }

    @Then("AU Kullanici cikan pop-up'i kapatir")
    public void kullaniciCikanPopUpIKapatir() {

       ReusableMethods.click(homePagePage.closePopUp);
        bekle(2);

    }

    @Then("AU Kullanici dashboard daki Uye girisi kisminin goruldugunu dogurular")
    public void kullaniciDashboardDakiUyeGirisiKismininGoruldugunuDogurular() {

        Assert.assertTrue(homePagePage.uyeGirisiButton.isDisplayed());
        bekle(2);

    }

    @Then("AU Kullanici uye girisi botununa tiklar ve sayfanin acildigini gorur")
    public void kullaniciUyeGirisiBotununaTiklarVeSayfaninAcildiginiGorur() {

       ReusableMethods.click(homePagePage.uyeGirisiButton);
        bekle(3);


    }


    @And("AU Kullanici KURUMSAL KULLANICI GIRISI yazisini gordugunu dogular")
    public void kullaniciKURUMSALKULLANICIGIRISIYazisiniGordugunuDogular() {

        Driver.getDriver().switchTo().window(Driver.getDriver().getWindowHandles().toArray()[1].toString());

        bekle(2);
        Assert.assertTrue(homePagePage.loginAssert.isDisplayed());
        tumSayfaResmi();
    }



}
