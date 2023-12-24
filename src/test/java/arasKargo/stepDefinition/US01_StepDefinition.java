package arasKargo.stepDefinition;

import arasKargo.pages.*;
import arasKargo.utilities.ConfigReader;
import arasKargo.utilities.Driver;
import arasKargo.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

import static org.junit.Assert.*;

public class US01_StepDefinition {
    HomePagePage homePagePage = new HomePagePage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("kullanici araskargo sayfasina gider")
    public void kullaniciAraskargoSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("cikan pop-up'i kapatir")
    public void cikanPopUpIKapatir() {
        homePagePage.closePopUp.click();

    }


    @And("hakkimizda butonuna tiklar")
    public void hakkimizdaButonunaTiklar() {
        ReusableMethods.bekle(2);
        ReusableMethods.click(homePagePage.hakkimizda);
    }

    @And("acilan seceneklerin tiklandigini dogrular")
    public void acilanSeceneklerinTiklandiginiDogrular() {
        actions.scrollToElement(homePagePage.hakkimizda).perform();
        ReusableMethods.click(homePagePage.vizyon);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Vizyon, Misyon ve Politikalar"));

        actions.scrollToElement(homePagePage.hakkimizda).perform();
        ReusableMethods.click(homePagePage.reklamlarimiz);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Reklamlarımız"));

        actions.scrollToElement(homePagePage.hakkimizda).perform();
        ReusableMethods.click(homePagePage.yonetimEkibimiz);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Yönetim Ekibimiz"));

        actions.scrollToElement(homePagePage.hakkimizda).perform();
        ReusableMethods.click(homePagePage.haberlerDuyurular);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Haberler ve Duyurular"));

    }


    @Then("hizmetlerimiz butonuna tiklar ve acilan seceneklerin tiklandigini dogrular")
    public void hizmetlerimizButonunaTiklarVeAcilanSeceneklerinTiklandiginiDogrular() {
        HizmetlerimizPage hizmetlerimizPage = new HizmetlerimizPage();
        actions.scrollToElement(hizmetlerimizPage.hizmetlerimiz).perform();
        ReusableMethods.click(hizmetlerimizPage.bireyselHizmetlerimiz);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Bireysel Hizmetlerimiz"));

        actions.scrollToElement(hizmetlerimizPage.hizmetlerimiz).perform();
        ReusableMethods.click(hizmetlerimizPage.kurumsalHizmetlerimiz);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Kurumsal Hizmetlerimiz"));

        ReusableMethods.bekle(2);

        actions.scrollToElement(hizmetlerimizPage.hizmetlerimiz).perform();
        ReusableMethods.click(hizmetlerimizPage.ambalajUrunlerimiz);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Ambalaj Ürünlerimiz"));


    }

    @Then("kariyer butonuna tiklar ve acilan seceneklerin tiklandigini dogrular")
    public void kariyerButonunaTiklarVeAcilanSeceneklerinTiklandiginiDogrular() {
        KariyerPage kariyerPage = new KariyerPage();
        actions.scrollToElement(kariyerPage.kariyer).perform();
        ReusableMethods.click(kariyerPage.araslar);
        ReusableMethods.bekle(2);
         Assert.assertTrue(homePagePage.baslik.getText().contains("Araslar Bizde Onem Tasir"));

        ReusableMethods.bekle(2);
        actions.scrollToElement(kariyerPage.kariyer).perform();
        ReusableMethods.click(kariyerPage.gelecegin);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Gelecegin Bizde Onem Tasir"));

        ReusableMethods.bekle(2);
        actions.scrollToElement(kariyerPage.kariyer).perform();
        ReusableMethods.click(kariyerPage.Teknoloji);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Teknoloji Bizde Onem Tasir"));

        ReusableMethods.bekle(2);
        actions.scrollToElement(kariyerPage.kariyer).perform();
        ReusableMethods.click(kariyerPage.iyiBirDunya);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Iyi Bir Dunya Bizde Onem Tasir"));



    }

    @Then("surdurulebilirlik butonuna tiklar ve acilan seceneklerin tiklandigini dogrular")
    public void surdurulebilirlikButonunaTiklarVeAcilanSeceneklerinTiklandiginiDogrular() {
        SurdurulebilirlikPage surdurulebilirlikPage = new SurdurulebilirlikPage();
        actions.scrollToElement(surdurulebilirlikPage.surdurulebilirlik).perform();
        ReusableMethods.click(surdurulebilirlikPage.surdurulebilirlikRotasi);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Surdurulebilirlik Rotasi"));

        actions.scrollToElement(surdurulebilirlikPage.surdurulebilirlik).perform();
        ReusableMethods.click(surdurulebilirlikPage.sosyalSorumluluk);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Sosyal Sorumluluk Platformlarımız"));

        actions.scrollToElement(surdurulebilirlikPage.surdurulebilirlik).perform();
        ReusableMethods.click(surdurulebilirlikPage.kaliteYonetim);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Kalite Yönetim Sistemi"));

    }

    @Then("is ortagimiz olun butonuna tiklar ve acilan seceneklerin tiklandigini dogrular")
    public void isOrtagimizOlunButonunaTiklarVeAcilanSeceneklerinTiklandiginiDogrular() {
        IsOrtagimizOlunPage isOrtagimizOlunPage = new IsOrtagimizOlunPage();
        actions.scrollToElement(isOrtagimizOlunPage.isOrtagimizOlun).perform();
        ReusableMethods.click(isOrtagimizOlunPage.acentemizOlun);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Acentemiz olun"));

        actions.scrollToElement(isOrtagimizOlunPage.isOrtagimizOlun).perform();
        ReusableMethods.click(isOrtagimizOlunPage.arasBurdaNoktasi);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Aras Burasi Noktasi Olun"));

        actions.scrollToElement(isOrtagimizOlunPage.isOrtagimizOlun).perform();
        ReusableMethods.click(isOrtagimizOlunPage.esnafKurye);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Esnaf Kurye Olun"));

        actions.scrollToElement(isOrtagimizOlunPage.isOrtagimizOlun).perform();
        ReusableMethods.click(isOrtagimizOlunPage.araciniziKiralayin);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Aracinizi Kiralayin"));

        actions.scrollToElement(isOrtagimizOlunPage.isOrtagimizOlun).perform();
        ReusableMethods.click(isOrtagimizOlunPage.sikSorulanSorular);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Sik Sorulan Sorular"));


    }

    @Then("musteri iliskileri  butonuna tiklar ve acilan seceneklerin tiklandigini dogrular")
    public void musteriIliskileriOlunButonunaTiklarVeAcilanSeceneklerinTiklandiginiDogrular() {
        MusteriHizmetleriPage musteriHizmetleriPage = new MusteriHizmetleriPage();

        actions.scrollToElement(musteriHizmetleriPage.musteriHizmetleri).perform();
        ReusableMethods.click(musteriHizmetleriPage.arasAsor);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Size nasıl yardımcı olabiliriz?"));

        actions.scrollToElement(musteriHizmetleriPage.musteriHizmetleri).perform();
        ReusableMethods.click(musteriHizmetleriPage.cagriMerkezi);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Size nasıl yardımcı olabiliriz?"));

        actions.scrollToElement(musteriHizmetleriPage.musteriHizmetleri).perform();
        ReusableMethods.click(musteriHizmetleriPage.hasarTanzim);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Aras Kargo Hasar Tazmin"));

        actions.scrollToElement(musteriHizmetleriPage.musteriHizmetleri).perform();
        ReusableMethods.click(musteriHizmetleriPage.geriBildirim);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Geri Bildirim Formu"));

        actions.scrollToElement(musteriHizmetleriPage.musteriHizmetleri).perform();
        ReusableMethods.click(musteriHizmetleriPage.sss);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Sık Sorulan Sorular"));

    }

    @Then("aras kargo spor kulubu butonuna tiklar ve acilan seceneklerin tiklandigini dogrular")
    public void arasKargoSporKulubuButonunaTiklarVeAcilanSeceneklerinTiklandiginiDogrular() {

        ReusableMethods.click(homePagePage.arasKargoSporKulubu);
        Assert.assertTrue(homePagePage.baslik.getText().contains(" Aras Kargo Kadın Voleybol Takımı ile voleybolun heyecanını zirveye taşıyoruz! "));

    }

    @Then("bize ulasin  butonuna tiklar ve acilan seceneklerin tiklandigini dogrular")
    public void bizeUlasinButonunaTiklarVeAcilanSeceneklerinTiklandiginiDogrular() {
        actions.scrollToElement(homePagePage.bizeUlasin).perform();
        ReusableMethods.click(homePagePage.iletisim);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Aras Kargo İletişim"));

        actions.scrollToElement(homePagePage.bizeUlasin).perform();
        ReusableMethods.click(homePagePage.genelMudurluk);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Aras Kargo Genel Müdürlük"));

        actions.scrollToElement(homePagePage.bizeUlasin).perform();
        ReusableMethods.click(homePagePage.bolgeMudurluklerimiz);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Aras Kargo Bölge Müdürlükleri"));

        actions.scrollToElement(homePagePage.bizeUlasin).perform();
        ReusableMethods.click(homePagePage.subelerimiz);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Aras Kargo Şubelerimiz"));

        actions.scrollToElement(homePagePage.bizeUlasin).perform();
        ReusableMethods.click(homePagePage.arasBurdaNoktalarimiz);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Aras Burası Noktalarımız"));

        actions.scrollToElement(homePagePage.bizeUlasin).perform();
        ReusableMethods.click(homePagePage.musterimizOlun);
        Assert.assertTrue(homePagePage.baslik.getText().contains("Müşterimiz Olun"));

    }
}
