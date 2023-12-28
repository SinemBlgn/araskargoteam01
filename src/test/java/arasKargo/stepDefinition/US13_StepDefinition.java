package arasKargo.stepDefinition;
import arasKargo.pages.SurdurulebilirlikPage;
import arasKargo.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import static arasKargo.utilities.Driver.closeDriver;
import static arasKargo.utilities.Driver.driver;

public class US13_StepDefinition extends ReusableMethods {

    SurdurulebilirlikPage surdurulebilirlikPage= new SurdurulebilirlikPage();


    @And("AU Kullanici dashboard daki surdurebilirlik  kisminin goruldugunu dogurular")
    public void kullaniciDashboardDakiSurdurebilirlikKismininGoruldugunuDogurular() {

        Assert.assertTrue(surdurulebilirlikPage.surdurulebilirlik.isDisplayed());
        bekle(2);


    }

    @Then("AU Kullanici surdurebilirlik botunu ustunde durur")
    public void kullaniciSurdurebilirlikBotunuUstundeDurur() {

        Actions actions = new Actions(driver);
        actions.moveToElement(surdurulebilirlikPage.surdurulebilirlik).perform();
        bekle(3);

    }


    @Then("AU Kullanici sekmedeki Kalite Yonetim Sistemi yazisini gordugunu dogrular")
    public void kullaniciSekmedekiKaliteYonetimSistemiYazisiniGordugunuDogrular() {

        Assert.assertTrue(surdurulebilirlikPage.kaliteYonetim.isDisplayed());
        bekle(1);
    }

    @Then("AU Kullanici sekmedeki Kalite Yonetim Sistemi yazisina tiklar")
    public void kullaniciSekmedekiKaliteYonetimSistemiYazisinaTiklar() {

        ReusableMethods.click(surdurulebilirlikPage.kaliteYonetim);
        bekle(2);

        ReusableMethods.scroll(surdurulebilirlikPage.belgeler);
        bekle(1);
    }

    @And("AU Kullanici Belgeler kismindan mukemmellikte kararlilik belgesini gordugunu dogrular")
    public void kullaniciBelgelerKismindanMukemmellikteKararlilikBelgesiniGordugunuDogrular() {

        Assert.assertTrue(surdurulebilirlikPage.MukemmellikteKararlilik.isDisplayed());
        closeDriver();
    }

    @And("AU Kullanici Belgeler kismindan hizmet yeterlilik belgesini gordugunu dogrular")
    public void kullaniciBelgelerKismindanHizmetYeterlilikBelgesiniGordugunuDogrular() {

        Assert.assertTrue(surdurulebilirlikPage.HizmetYeterlilikBelgesi.isDisplayed());
        closeDriver();

    }

    @And("AU Kullanici Belgeler kismindan turkiye mukemmellik odulu belgesini gordugunu dogrular")
    public void kullaniciBelgelerKismindanTurkiyeMukemmellikOduluBelgesiniGordugunuDogrular() {

        Assert.assertTrue(surdurulebilirlikPage.turkiyemukemmellikodulu.isDisplayed());
        closeDriver();

    }

    @And("AU Kullanici Belgeler kismindan Bilgi Guvenligi Yonetim Sistemi Belgesi belgesini gordugunu dogrular")
    public void kullaniciBelgelerKismindanBilgiGuvenligiYonetimSistemiBelgesiBelgesiniGordugunuDogrular() {

        Assert.assertTrue(surdurulebilirlikPage.BilgiGuvenligiYonetimSistemiBelgesi.isDisplayed());
        closeDriver();
    }


    @And("AU Kullanici Belgeler kismindan Mukemmellikte Yetkinlik uc Yildiz belgesini gordugunu dogrular")
    public void kullaniciBelgelerKismindanMukemmellikteYetkinlikYildizBelgesiniGordugunuDogrular() {

        Assert.assertTrue(surdurulebilirlikPage.MukemmellikteYetkinlik3Yildiz.isDisplayed());
        closeDriver();
    }

    @And("AU Kullanici Belgeler kismindan Kalite Yonetim Sistemi Belgesi belgesini gordugunu dogrular")
    public void kullaniciBelgelerKismindanKaliteYonetimSistemiBelgesiBelgesiniGordugunuDogrular() {

        Assert.assertTrue(surdurulebilirlikPage.KaliteYonetimSistemiBelgesi.isDisplayed());
        closeDriver();
    }

    @And("AU Kullanici Belgeler kismindan Musteri Memnuniyeti Yonetim Sistemi Belgesi belgesini gordugunu dogrular")
    public void kullaniciBelgelerKismindanMusteriMemnuniyetiYonetimSistemiBelgesiBelgesiniGordugunuDogrular() {

        Assert.assertTrue(surdurulebilirlikPage.MusteriMemnuniyetiYonetimSistemiBelgesi.isDisplayed());
        closeDriver();

    }

    @And("AU Kullanici Belgeler kismindan cevre Yonetim Sistemi Belgesi belgesini gordugunu dogrular")
    public void kullaniciBelgelerKismindanCevreYonetimSistemiBelgesiBelgesiniGordugunuDogrular() {

        Assert.assertTrue(surdurulebilirlikPage.cevreYonetimSistemiBelgesi.isDisplayed());
        closeDriver();


    }

    @And("AU Kullanici Belgeler kismindan is Sagligi ve Guvenligi Yonetim Sistemi Belgesi belgesini gordugunu dogrular")
    public void kullaniciBelgelerKismindanIsSagligiVeGuvenligiYonetimSistemiBelgesiBelgesiniGordugunuDogrular() {

        Assert.assertTrue(surdurulebilirlikPage.isSagligiveGuvenligiYonetimSistemiBelgesi.isDisplayed());
        tumSayfaResmi();
        closeDriver();
    }

    @And("AU Kullanici Belgeler kismindan Mukemmellikte Yetkinlik dort Yildiz belgesini gordugunu dogrular")
    public void kullaniciBelgelerKismindanMukemmellikteYetkinlikDortYildizBelgesiniGordugunuDogrular() {

        Assert.assertTrue(surdurulebilirlikPage.dortyildiz.isDisplayed());
        closeDriver();

    }

    @And("AU Kullanici Belgeler kismindan Mukemmellikte Yetkinlik bes Yildiz belgesini gordugunu dogrular")
    public void kullaniciBelgelerKismindanMukemmellikteYetkinlikBesYildizBelgesiniGordugunuDogrular() {

        Assert.assertTrue(surdurulebilirlikPage.besyildiz.isDisplayed());
        closeDriver();
    }
}
