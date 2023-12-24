package arasKargo.stepDefinition;

import arasKargo.pages.EnYakınSubelerimizPage;
import arasKargo.utilities.ConfigReader;
import arasKargo.utilities.Driver;
import arasKargo.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class US07_StepDefinition {
    EnYakınSubelerimizPage enYakınSubelerimiz=new EnYakınSubelerimizPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanici araskargo sayfasina gider")
    public void kullaniciAraskargoSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("cikan pop-up'i kapatir")
    public void cikanPopUpIKapatir() {
        enYakınSubelerimiz.closePopUp.click();
    }

    @Then("Kullanici En Yakin subeler pop-up ini tıklar")
    public void kullaniciEnYakinSubelerPopUpIniTıklar() {
        ReusableMethods.bekle(2);
        enYakınSubelerimiz.enyakınSubelerPop.click();
    }

    @Then("Kullanici arama işlemi dropdown'indan {string} seçeneğini seçer")
    public void kullaniciAramaIşlemiDropdownIndanSeçeneğiniSeçer(String arg0) {
        ReusableMethods.bekle(2);
        ReusableMethods.click(enYakınSubelerimiz.arasBurasıNoktalarButon);

    }

    @Then("Kullanici geçerli il ve ilçe ismi girer")
    public void kullaniciGeçerliIlVeIlçeIsmiGirer() {
        enYakınSubelerimiz.ilIlceGiriniz.sendKeys("Istanbul");
        ReusableMethods.bekle(2);
        ReusableMethods.click(enYakınSubelerimiz.ilIlceGiriniz);
        ReusableMethods.bekle(2);
        enYakınSubelerimiz.ilIlceGiriniz.sendKeys(Keys.ENTER);
    }

    @And("Kullanici ara butonuna basar ve Kullanici sonuçlarin liste ve haritada işaretli olarak sunulduğunu doğrular")
    public void kullaniciAraButonunaBasarVeKullaniciSonuçlarinListeVeHaritadaIşaretliOlarakSunulduğunuDoğrular() {
        Assert.assertTrue(enYakınSubelerimiz.harita.getText().contains("ALTUNİZADE ŞUBE"));
    }

    @Then("Kullanici geçerli il ve ilçe ismi girmez")
    public void kullaniciGeçerliIlVeIlçeIsmiGirmez() {
        enYakınSubelerimiz.ilIlceGiriniz.sendKeys("");
        ReusableMethods.bekle(2);
        ReusableMethods.click(enYakınSubelerimiz.ilIlceGiriniz);
        ReusableMethods.bekle(2);
        enYakınSubelerimiz.ilIlceGiriniz.sendKeys(Keys.ENTER);

    }
}
