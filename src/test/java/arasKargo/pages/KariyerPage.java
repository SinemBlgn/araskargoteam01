package arasKargo.pages;
import arasKargo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class KariyerPage {
    public KariyerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
