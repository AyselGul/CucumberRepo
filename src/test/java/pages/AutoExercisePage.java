package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoExercisePage {
   public AutoExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//img[@alt='Website for automation practice']")
    public WebElement automationExerciseWebelement;

   @FindBy(xpath = "//a[text()=' Signup / Login']")
   public WebElement signupLoginLinkWebelement;

   @FindBy(xpath = "(//h2)[1]")
   public WebElement loginToYourAccountWebelement;

   @FindBy(xpath = "//input[@type='email']")
   public WebElement emailAddressWebelement;

   @FindBy(xpath = "//input[@type='password']")
   public WebElement passwordWebelement;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginWebelement;

    @FindBy(xpath = "//p[text()='Your email or password is incorrect!']")
    public WebElement emailPasswordVisibleTextWebelement;
}
