package arasKargo.stepDefinition;

import arasKargo.pages.KariyerPage;
import arasKargo.utilities.Driver;
import arasKargo.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static arasKargo.utilities.Driver.driver;

public class US10_StepDefinition {
    KariyerPage kariyerPage =new KariyerPage();

    Actions actions = new Actions(Driver.getDriver());

    @When("kariyer butonuna tiklar")
    public void kariyerButonunaTiklar() {
        actions.scrollToElement(kariyerPage.kariyer).perform();
        ReusableMethods.click(kariyerPage.kariyer);


    }

    @And("kullanıcı İş Başvuruları kısmındaki LinkedIn  linkine tıklar")
    public void kullanıcıİşBaşvurularıKısmındakiLinkedInLinkineTıklar() {
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        kariyerPage.linkedIn.click();
    }

    @Then("kullanıcı LinkedIn  linkinin tiklanir  oldugunu doğrular")
    public void kullanıcıLinkedInLinkininTiklanirOldugunuDoğrular() {
        String expectedLinkedInURL = "https://www.linkedin.com/";
        String currentURL = driver.getCurrentUrl();

        if (currentURL.equals(expectedLinkedInURL)) {
            System.out.println("LinkedIn linki başarıyla tıklandı ve LinkedIn sayfasına yönlendirildi.");
        } else {
            System.out.println("Hata: LinkedIn linki tıklanamadı veya yanlış sayfaya yönlendirildi.");
        }
    }
}
