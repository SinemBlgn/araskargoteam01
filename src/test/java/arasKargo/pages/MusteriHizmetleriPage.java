package arasKargo.pages;

import arasKargo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class MusteriHizmetleriPage {
    public MusteriHizmetleriPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
