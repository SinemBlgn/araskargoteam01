package arasKargo.stepDefinition;

import arasKargo.pages.HomePagePage;
import arasKargo.utilities.Driver;
import arasKargo.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US09_StepDefinition {
    @And("size nasil yarimci olabilirim pop-up'inin tiklandigini dogrular")
    public void sizeNasilYarimciOlabilirimPopUpIninTiklandiginiDogrular() {
        HomePagePage homePagePage=new HomePagePage();

      Actions actions=new Actions(Driver.getDriver());
        ReusableMethods.bekle(2);
        actions.scrollToElement(homePagePage.sizeNasilYardimciOlabilirim).perform();
        ReusableMethods.click(homePagePage.sizeNasilYardimciOlabilirim);
        Assert.assertTrue(homePagePage.sizeNasilYardimciOlabilirim.isEnabled());

    }
}
