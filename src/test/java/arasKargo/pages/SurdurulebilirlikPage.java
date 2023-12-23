package arasKargo.pages;

import arasKargo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class SurdurulebilirlikPage {
    public SurdurulebilirlikPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
