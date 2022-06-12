package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WUniPage {
    public WUniPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h1[text()='LOGIN PORTAL']")
    public WebElement loginPortalWebelement;

    @FindBy(xpath = "//input[@id='text']")
    public WebElement wuusername;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement wupassword;


    @FindBy(xpath = "//button[text()='Login']")
    public WebElement wuloginButton;

   // @FindBy(xpath = "//h1[text()='LOGIN PORTAL']")
   // public WebElement loginPotalWebelement;



}
