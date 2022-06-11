package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id= "twotabsearchtextbox")
    public WebElement amazonSearchbox;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement flowerSonucYazisiElementi;

    @FindBy(xpath = "(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]")
     public WebElement crayonSonucYazisiElementi;

    @FindBy(xpath = "(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]")
    public WebElement carSonucYazisiElementi;

    @FindBy(xpath = "(//span[@class='a-button-text'])[1]")
    public WebElement homepageAlert;

    @FindBy(xpath = "//input[@id='nav-bb-search']")
    public WebElement otherAmazonPage;



}
