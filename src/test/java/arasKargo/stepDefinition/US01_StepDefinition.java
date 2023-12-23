package arasKargo.stepDefinition;

import arasKargo.pages.HomePagePage;
import arasKargo.utilities.ConfigReader;
import arasKargo.utilities.Driver;
import arasKargo.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

import static org.junit.Assert.*;

public class US01_StepDefinition {
    HomePagePage homePagePage=new HomePagePage();

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
        Actions actions=new Actions(Driver.getDriver());
        actions.scrollToElement(homePagePage.hakkimizda).perform();



    }
}
