package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerokuAppPage {
    public HerokuAppPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

      @FindBy(xpath = "//button[text()='Add Element']")
        public WebElement addElementButton;

       @FindBy(xpath="//button[text()='Delete']")
       public WebElement deleteElementButton;
    //
    //    @FindBy(xpath="//input[@id='DTE_Field_last_name']")
    //    public WebElement lastNameBox;
    //
    //    @FindBy(xpath="//input[@id='DTE_Field_position']")
    //    public WebElement possitionBox;
    //







}
